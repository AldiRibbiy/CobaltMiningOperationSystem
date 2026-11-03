/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package service;

import config.DatabaseConfig;
import enums.*;
import exception.*;
import java.sql.*;
import java.time.*;
import java.util.*;
import model.*;
import repository.*;

/**
 *
 * @author zefrialrizkullah
 */

public final class MonitoringService {
    private final MonitoringRepository mon;
    private final LokasiRepository loc;
    private final ParameterRepository par;

    public MonitoringService(MonitoringRepository m, LokasiRepository l, ParameterRepository p) {
        mon = m;
        loc = l;
        par = p;
    }

    private MonitoringLingkungan find(int id) {
        return mon.findById(id).orElseThrow(()->new DataNotFoundException("Monitoring tidak ditemukan."));
    }

    private ParameterLingkungan param(int id) {
        return par.findById(id).orElseThrow(()->new DataNotFoundException("Parameter tidak ditemukan."));
    }

    private StatusDetail status(ParameterLingkungan p, double v) {
        if (!Double.isFinite(v) || Math.abs(v*100-Math.rint(v*100))>0.00001)throw new ValidationException("Pengukuran harus angka dengan maksimal 2 desimal.");
        return p.getBatasMinimum() != null && v<p.getBatasMinimum() || p.getBatasMaksimum() != null && v>p.getBatasMaksimum()?StatusDetail.PERINGATAN:StatusDetail.NORMAL;
    }

    public MonitoringLingkungan buatMonitoring(int id, int lokasiId, PetugasHSE h, LocalDateTime t, String catatan) {
        if (id != 0)throw new ValidationException("ID baru harus 0.");

        if (t == null)t = LocalDateTime.now();

        if (t.isAfter(LocalDateTime.now()))throw new ValidationException("Waktu monitoring di masa depan.");

        if (h == null || h.getStatusPegawai() != StatusPegawai.AKTIF || !h.isSertifikasiAktif(t.toLocalDate()))throw new ValidationException("Petugas HSE tidak aktif atau sertifikasi kedaluwarsa.");
        Lokasi l = loc.findById(lokasiId).orElseThrow(()->new DataNotFoundException("Lokasi tidak ditemukan."));

        return mon.save(new MonitoringLingkungan(0, l, h, t, StatusMonitoring.NORMAL, null, StatusPenanganan.TIDAK_DIPERLUKAN, catatan));
    }

    public MonitoringLingkungan buatMonitoring(int lokasiId, PetugasHSE h, LocalDateTime t, String catatan) {
        return buatMonitoring(0, lokasiId, h, t, catatan);
    }

    /** Memperbarui data utama monitoring (lokasi, tanggal, catatan). Status dan penanganan
     * dihitung dari detail pengukuran sehingga tidak diubah di sini. */
    public MonitoringLingkungan ubahMonitoring(int id, int lokasiId, LocalDateTime t, String catatan) {
        MonitoringLingkungan m = find(id);

        if (m.getStatusPenanganan() == StatusPenanganan.DALAM_PENANGANAN)throw new ValidationException("Monitoring sedang dalam penanganan dan tidak dapat diubah.");

        if (t == null)throw new ValidationException("Tanggal monitoring wajib dipilih.");

        if (t.isAfter(LocalDateTime.now()))throw new ValidationException("Waktu monitoring di masa depan.");

        if (m.getPetugasHSE() != null && !m.getPetugasHSE().isSertifikasiAktif(t.toLocalDate()))throw new ValidationException("Sertifikasi petugas HSE kedaluwarsa pada tanggal tersebut.");
        Lokasi l = loc.findById(lokasiId).orElseThrow(()->new DataNotFoundException("Lokasi tidak ditemukan."));
        m.setLokasi(l);
        m.setTanggalMonitoring(t);
        m.setCatatan(catatan);
        mon.update(m);
        return m;
    }

    /** Menghapus monitoring beserta seluruh detail pengukurannya (transaksional di DAO).
     * Penanganan yang sedang berjalan harus diselesaikan terlebih dahulu. */
    public void hapusMonitoring(int id) {
        MonitoringLingkungan m = find(id);

        if (m.getStatusPenanganan() == StatusPenanganan.DALAM_PENANGANAN)throw new ValidationException("Penanganan masih berjalan. Selesaikan atau batalkan terlebih dahulu sebelum menghapus.");
        mon.delete(id);
    }

    public DetailMonitoring tambahDetail(int idMon, int idDetail, int idParam, double nilai, String catatan) {
        if (idDetail != 0)throw new ValidationException("ID detail baru harus 0.");
        ParameterLingkungan p = param(idParam);
        StatusDetail st = status(p, nilai);

        try(Connection c = DatabaseConfig.getConnection()) {
            c.setAutoCommit(false);
            try {
                try(PreparedStatement ps = c.prepareStatement("SELECT id_monitoring FROM monitoring_lingkungan WHERE id_monitoring=? FOR UPDATE")) {
                    ps.setInt(1, idMon);
                    try(ResultSet rs = ps.executeQuery()) {
                        if (!rs.next())throw new DataNotFoundException("Monitoring tidak ditemukan.");
                    }
                }

                int generated;

                try(PreparedStatement ps = c.prepareStatement("INSERT INTO detail_monitoring (nilai_pengukuran,status_detail,catatan,monitoring_lingkungan_id_monitoring,parameter_lingkungan_id_parameter) VALUES (?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS)) {
                    ps.setBigDecimal(1, java.math.BigDecimal.valueOf(nilai));
                    ps.setString(2, st.name());
                    ps.setString(3, catatan);
                    ps.setInt(4, idMon);
                    ps.setInt(5, idParam);
                    ps.executeUpdate();

                    try(ResultSet rs = ps.getGeneratedKeys()) {
                        if (!rs.next())throw new SQLException("ID detail tidak ditemukan.");
                        generated = rs.getInt(1);
                    }
                }

                refreshStatusMonitoring(c, idMon);
                c.commit();
                return new DetailMonitoring(generated, find(idMon), p, nilai, st, catatan);
            }

            catch (Exception e) {
                c.rollback();
                throw e;
            }
        }

        catch (SQLException e) {
            throw new IllegalStateException("Gagal menambah detail monitoring: "+e.getMessage(), e);
        }
    }

    public DetailMonitoring tambahDetail(int idMon, int idParam, double nilai, String catatan) {
        return tambahDetail(idMon, 0, idParam, nilai, catatan);
    }

    /** Mengubah satu detail pengukuran (parameter, nilai, catatan). Status detail dihitung
     * ulang terhadap ambang batas parameter, lalu status monitoring induk disesuaikan. */
    public DetailMonitoring ubahDetail(int idDetail, int idParam, double nilai, String catatan) {
        ParameterLingkungan p = param(idParam);
        StatusDetail st = status(p, nilai);

        try(Connection c = DatabaseConfig.getConnection()) {
            c.setAutoCommit(false);
            try {
                int idMon;
                int parameterLama;

                try(PreparedStatement ps = c.prepareStatement("SELECT monitoring_lingkungan_id_monitoring,parameter_lingkungan_id_parameter FROM detail_monitoring WHERE id_detail=? FOR UPDATE")) {
                    ps.setInt(1, idDetail);
                    try(ResultSet rs = ps.executeQuery()) {
                        if (!rs.next())throw new DataNotFoundException("Detail monitoring tidak ditemukan.");
                        idMon = rs.getInt(1);
                        parameterLama = rs.getInt(2);
                    }
                }

                MonitoringLingkungan induk = find(idMon);
                if (induk.getStatusPenanganan() == StatusPenanganan.DALAM_PENANGANAN || induk.getStatusPenanganan() == StatusPenanganan.SELESAI)throw new ValidationException("Monitoring sudah ditindaklanjuti. Hapus monitoring lama dan buat monitoring baru bila ada kesalahan pengukuran.");

                try(PreparedStatement ps = c.prepareStatement("UPDATE detail_monitoring SET nilai_pengukuran=?,status_detail=?,catatan=?,parameter_lingkungan_id_parameter=? WHERE id_detail=?")) {
                    ps.setBigDecimal(1, java.math.BigDecimal.valueOf(nilai));
                    ps.setString(2, st.name());
                    ps.setString(3, catatan);
                    ps.setInt(4, idParam);
                    ps.setInt(5, idDetail);
                    if (ps.executeUpdate() != 1)throw new DataNotFoundException("Detail monitoring tidak ditemukan.");
                }

                refreshStatusMonitoring(c, idMon);
                c.commit();
                return new DetailMonitoring(idDetail, find(idMon), p, nilai, st, catatan);
            }

            catch (Exception e) {
                c.rollback();
                throw e;
            }
        }

        catch (SQLException e) {
            throw new IllegalStateException("Gagal mengubah detail monitoring: "+e.getMessage(), e);
        }
    }

    /** Menghapus satu detail pengukuran dan menghitung ulang status monitoring induk. */
    public void hapusDetail(int idDetail) {
        try(Connection c = DatabaseConfig.getConnection()) {
            c.setAutoCommit(false);
            try {
                int idMon;

                try(PreparedStatement ps = c.prepareStatement("SELECT monitoring_lingkungan_id_monitoring FROM detail_monitoring WHERE id_detail=? FOR UPDATE")) {
                    ps.setInt(1, idDetail);
                    try(ResultSet rs = ps.executeQuery()) {
                        if (!rs.next())throw new DataNotFoundException("Detail monitoring tidak ditemukan.");
                        idMon = rs.getInt(1);
                    }
                }

                MonitoringLingkungan induk = find(idMon);
                if (induk.getStatusPenanganan() == StatusPenanganan.DALAM_PENANGANAN || induk.getStatusPenanganan() == StatusPenanganan.SELESAI)throw new ValidationException("Monitoring sudah ditindaklanjuti. Data pengukuran tidak dapat dihapus lagi.");

                try(PreparedStatement ps = c.prepareStatement("DELETE FROM detail_monitoring WHERE id_detail=?")) {
                    ps.setInt(1, idDetail);
                    if (ps.executeUpdate() != 1)throw new DataNotFoundException("Detail monitoring tidak ditemukan.");
                }

                refreshStatusMonitoring(c, idMon);
                c.commit();
            }

            catch (Exception e) {
                c.rollback();
                throw e;
            }
        }

        catch (SQLException e) {
            throw new IllegalStateException("Gagal menghapus detail monitoring: "+e.getMessage(), e);
        }
    }

    /** Menyesuaikan status_monitoring dan status_penanganan monitoring induk berdasarkan
     * seluruh detail pengukuran yang tersimpan saat ini. Dipanggil di dalam transaksi. */
    private void refreshStatusMonitoring(Connection c, int idMon) throws SQLException {
        try(PreparedStatement ps = c.prepareStatement("UPDATE monitoring_lingkungan SET "
                + "status_monitoring=IF(EXISTS(SELECT 1 FROM detail_monitoring WHERE monitoring_lingkungan_id_monitoring=? AND status_detail='PERINGATAN'),'PERINGATAN','NORMAL'),"
                + "status_penanganan=CASE "
                + "WHEN EXISTS(SELECT 1 FROM detail_monitoring WHERE monitoring_lingkungan_id_monitoring=? AND status_detail='PERINGATAN') THEN "
                + "CASE WHEN status_penanganan IN ('SELESAI','DALAM_PENANGANAN') THEN status_penanganan ELSE 'BELUM_DITANGANI' END "
                + "ELSE 'TIDAK_DIPERLUKAN' END "
                + "WHERE id_monitoring=?")) {
            ps.setInt(1, idMon);
            ps.setInt(2, idMon);
            ps.setInt(3, idMon);
            ps.executeUpdate();
        }
    }

    public void aturTindakLanjut(int id, String tindak) {
        MonitoringLingkungan m = find(id);

        if (m.getStatusMonitoring() != StatusMonitoring.PERINGATAN)throw new ValidationException("Tindak lanjut hanya diperlukan untuk monitoring berstatus PERINGATAN.");

        if (tindak == null || tindak.trim().isEmpty())throw new ValidationException("Uraian tindak lanjut wajib diisi.");

        if (m.getStatusPenanganan() == StatusPenanganan.TIDAK_DIPERLUKAN) {
            // Tindak lanjut baru ditetapkan -> penanganan otomatis menjadi belum ditangani.
            statusUpdate(id,"tindak_lanjut", tindak.trim(),
                    "status_monitoring='PERINGATAN' AND status_penanganan IN ('BELUM_DITANGANI','TIDAK_DIPERLUKAN')");
            statusUpdate(id,"status_penanganan","BELUM_DITANGANI",
                    "status_monitoring='PERINGATAN' AND status_penanganan='TIDAK_DIPERLUKAN'");
            return;
        }

        if (m.getStatusPenanganan() == StatusPenanganan.SELESAI)throw new ValidationException("Penanganan sudah selesai. Tindak lanjut tidak dapat diubah.");
        statusUpdate(id,"tindak_lanjut", tindak.trim(),
                "status_monitoring='PERINGATAN' AND status_penanganan IN ('BELUM_DITANGANI','DALAM_PENANGANAN')");
    }

    public void mulaiPenanganan(int id) {
        MonitoringLingkungan m = find(id);

        if (m.getStatusMonitoring() != StatusMonitoring.PERINGATAN)throw new ValidationException("Penanganan hanya untuk monitoring berstatus PERINGATAN.");

        if (m.getStatusPenanganan() == StatusPenanganan.DALAM_PENANGANAN)throw new ValidationException("Penanganan sedang berjalan.");

        if (m.getStatusPenanganan() == StatusPenanganan.SELESAI)throw new ValidationException("Penanganan sudah selesai.");

        if (m.getTindakLanjut() == null || m.getTindakLanjut().trim().isEmpty())throw new ValidationException("Isi tindak lanjut terlebih dahulu sebelum memulai penanganan.");
        statusUpdate(id,"status_penanganan","DALAM_PENANGANAN", "status_penanganan='BELUM_DITANGANI' AND status_monitoring='PERINGATAN' AND tindak_lanjut IS NOT NULL AND TRIM(tindak_lanjut)<>''");
    }

    public void selesaikanPenanganan(int id) {
        MonitoringLingkungan m = find(id);

        if (m.getStatusPenanganan() != StatusPenanganan.DALAM_PENANGANAN)throw new ValidationException("Penanganan belum dimulai. Klik Mulai Penanganan terlebih dahulu.");

        if (m.getTindakLanjut() == null || m.getTindakLanjut().trim().isEmpty())throw new ValidationException("Tindak lanjut wajib tercatat sebelum penanganan diselesaikan.");
        statusUpdate(id,"status_penanganan","SELESAI","status_penanganan='DALAM_PENANGANAN'");
    }

    private void statusUpdate(int id, String col, String value, String condition) {
        String sql = "UPDATE monitoring_lingkungan SET "+col+"=? WHERE id_monitoring=? AND "+condition;

        try(Connection c = DatabaseConfig.getConnection();PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, value);
            ps.setInt(2, id);
            if (ps.executeUpdate() != 1)throw new ValidationException("Status monitoring tidak sesuai.");
        }

        catch (SQLException e) {
            throw new IllegalStateException("Gagal memperbarui monitoring", e);
        }
    }

    public void ubahStatusLokasi(int id, StatusLokasi status) {
        if (status == null)throw new ValidationException("Status lokasi wajib dipilih.");
        Lokasi l = find(id).getLokasi();
        l.setStatusOperasional(status);
        loc.update(l);
    }

    public MonitoringLingkungan cariMonitoringById(int id) {
        return find(id);
    }

    public List<MonitoringLingkungan> tampilkanSemuaMonitoring() {
        return mon.findAll();
    }

    public List<MonitoringLingkungan> tampilkanMonitoringByLokasi(int id) {
        if (!loc.findById(id).isPresent())throw new DataNotFoundException("Lokasi tidak ditemukan.");
        return mon.findByLokasi(id);
    }
}

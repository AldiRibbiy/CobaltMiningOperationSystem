/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
                
                try(PreparedStatement ps = c.prepareStatement("UPDATE monitoring_lingkungan SET status_monitoring=IF(EXISTS(SELECT 1 FROM detail_monitoring WHERE monitoring_lingkungan_id_monitoring=? AND status_detail='PERINGATAN'),'PERINGATAN','NORMAL'),status_penanganan=IF(EXISTS(SELECT 1 FROM detail_monitoring WHERE monitoring_lingkungan_id_monitoring=? AND status_detail='PERINGATAN'),IF(status_penanganan='TIDAK_DIPERLUKAN','BELUM_DITANGANI',status_penanganan),'TIDAK_DIPERLUKAN') WHERE id_monitoring=?")) {
                    ps.setInt(1, idMon);
                    ps.setInt(2, idMon);
                    ps.setInt(3, idMon);
                    ps.executeUpdate();
                }
                
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
    
    public void aturTindakLanjut(int id, String tindak) {
        MonitoringLingkungan m = find(id);
        if (m.getStatusMonitoring() != StatusMonitoring.PERINGATAN || tindak == null || tindak.trim().isEmpty())throw new ValidationException("Tindak lanjut hanya untuk PERINGATAN dan wajib diisi.");
        statusUpdate(id,"tindak_lanjut", tindak.trim(),"status_monitoring='PERINGATAN'");
    }
    
    public void mulaiPenanganan(int id) {
        MonitoringLingkungan m = find(id);
        if (m.getStatusMonitoring() != StatusMonitoring.PERINGATAN || m.getStatusPenanganan() != StatusPenanganan.BELUM_DITANGANI || m.getTindakLanjut() == null
                || m.getTindakLanjut().trim().isEmpty())throw new ValidationException("Penanganan tidak dapat dimulai.");
        statusUpdate(id,"status_penanganan","DALAM_PENANGANAN", "status_penanganan='BELUM_DITANGANI' AND status_monitoring='PERINGATAN' AND tindak_lanjut IS NOT NULL AND TRIM(tindak_lanjut)<>''");
    }
    
    public void selesaikanPenanganan(int id) {
        statusUpdate(id,"status_penanganan","SELESAI","status_penanganan='DALAM_PENANGANAN'");
    }
    
    /** HSE meneruskan informasi lokasi berstatus PERINGATAN kepada Manager.
     *  Tindak lanjut diberi penanda komunikasi, dan status penanganan minimal
     *  menjadi DALAM_PENANGANAN sehingga muncul sebagai prioritas di dashboard Manager. */
    public void informasikanManager(int id, String oleh) {
        MonitoringLingkungan m = find(id);
        if (m.getStatusMonitoring() != StatusMonitoring.PERINGATAN)
            throw new ValidationException("Informasi ke Manager hanya untuk monitoring berstatus PERINGATAN.");
        if (m.getStatusPenanganan() == StatusPenanganan.SELESAI)
            throw new ValidationException("Penanganan sudah selesai; tidak perlu informasi baru.");
        String waktu = java.time.LocalDateTime.now()
                .format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        String pesan = "Diteruskan ke Manager oleh " + oleh + " pada " + waktu;
        statusUpdate(id, "tindak_lanjut", pesan, "status_monitoring='PERINGATAN'");
        if (m.getStatusPenanganan() == StatusPenanganan.BELUM_DITANGANI) {
            statusUpdate(id, "status_penanganan", "DALAM_PENANGANAN",
                    "status_penanganan='BELUM_DITANGANI' AND status_monitoring='PERINGATAN'");
        }
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
    
    /** Memperbarui satu pengukuran lalu menghitung ulang status monitoring. */
    public DetailMonitoring ubahDetail(int idDetail, int idParam, double nilai, String catatan) {
        ParameterLingkungan p = param(idParam);
        StatusDetail st = status(p, nilai);
        int idMon;

        try (Connection c = DatabaseConfig.getConnection()) {
            c.setAutoCommit(false);
            try {
                try (PreparedStatement ps = c.prepareStatement("SELECT monitoring_lingkungan_id_monitoring FROM detail_monitoring WHERE id_detail=? FOR UPDATE")) {
                    ps.setInt(1, idDetail);
                    try (ResultSet rs = ps.executeQuery()) {
                        if (!rs.next())throw new DataNotFoundException("Pengukuran tidak ditemukan.");
                        idMon = rs.getInt(1);
                    }
                }

                try (PreparedStatement ps = c.prepareStatement("UPDATE detail_monitoring SET nilai_pengukuran=?,status_detail=?,catatan=?,parameter_lingkungan_id_parameter=? WHERE id_detail=?")) {
                    ps.setBigDecimal(1, java.math.BigDecimal.valueOf(nilai));
                    ps.setString(2, st.name());
                    ps.setString(3, catatan);
                    ps.setInt(4, idParam);
                    ps.setInt(5, idDetail);
                    if (ps.executeUpdate() != 1)throw new DataNotFoundException("Pengukuran tidak ditemukan.");
                }

                rehitungStatus(c, idMon);
                c.commit();
                return new DetailMonitoring(idDetail, find(idMon), p, nilai, st, catatan);
            }

            catch (Exception e) {
                c.rollback();
                throw e;
            }
        }

        catch (SQLException e) {
            throw new IllegalStateException("Gagal mengubah detail monitoring: " + e.getMessage(), e);
        }
    }

    /** Menghapus satu pengukuran lalu menghitung ulang status monitoring. */
    public void hapusDetail(int idDetail) {
        int idMon;

        try (Connection c = DatabaseConfig.getConnection()) {
            c.setAutoCommit(false);
            try {
                try (PreparedStatement ps = c.prepareStatement("SELECT monitoring_lingkungan_id_monitoring FROM detail_monitoring WHERE id_detail=? FOR UPDATE")) {
                    ps.setInt(1, idDetail);
                    try (ResultSet rs = ps.executeQuery()) {
                        if (!rs.next())throw new DataNotFoundException("Pengukuran tidak ditemukan.");
                        idMon = rs.getInt(1);
                    }
                }

                try (PreparedStatement ps = c.prepareStatement("DELETE FROM detail_monitoring WHERE id_detail=?")) {
                    ps.setInt(1, idDetail);
                    if (ps.executeUpdate() != 1)throw new DataNotFoundException("Pengukuran tidak ditemukan.");
                }

                rehitungStatus(c, idMon);
                c.commit();
            }

            catch (Exception e) {
                c.rollback();
                throw e;
            }
        }

        catch (SQLException e) {
            throw new IllegalStateException("Gagal menghapus detail monitoring: " + e.getMessage(), e);
        }
    }

    /** Status monitoring mengikuti keberadaan pengukuran PERINGATAN. */
    private void rehitungStatus(Connection c, int idMon) throws SQLException {
        try (PreparedStatement ps = c.prepareStatement("UPDATE monitoring_lingkungan SET status_monitoring=IF(EXISTS(SELECT 1 FROM detail_monitoring WHERE monitoring_lingkungan_id_monitoring=? AND status_detail='PERINGATAN'),'PERINGATAN','NORMAL'),status_penanganan=IF(EXISTS(SELECT 1 FROM detail_monitoring WHERE monitoring_lingkungan_id_monitoring=? AND status_detail='PERINGATAN'),IF(status_penanganan='TIDAK_DIPERLUKAN','BELUM_DITANGANI',status_penanganan),'TIDAK_DIPERLUKAN') WHERE id_monitoring=?")) {
            ps.setInt(1, idMon);
            ps.setInt(2, idMon);
            ps.setInt(3, idMon);
            ps.executeUpdate();
        }
    }

    /** Menghapus monitoring beserta seluruh pengukurannya. */
    public void hapusMonitoring(int id) {
        MonitoringLingkungan m = find(id);
        if (m.getStatusPenanganan() == StatusPenanganan.DALAM_PENANGANAN)throw new ValidationException("Monitoring dalam penanganan tidak dapat dihapus.");

        try (Connection c = DatabaseConfig.getConnection()) {
            c.setAutoCommit(false);
            try {
                try (PreparedStatement ps = c.prepareStatement("DELETE FROM detail_monitoring WHERE monitoring_lingkungan_id_monitoring=?")) {
                    ps.setInt(1, id);
                    ps.executeUpdate();
                }

                try (PreparedStatement ps = c.prepareStatement("DELETE FROM monitoring_lingkungan WHERE id_monitoring=?")) {
                    ps.setInt(1, id);
                    if (ps.executeUpdate() != 1)throw new DataNotFoundException("Monitoring tidak ditemukan.");
                }

                c.commit();
            }

            catch (Exception e) {
                c.rollback();
                throw e;
            }
        }

        catch (SQLException e) {
            throw new IllegalStateException("Gagal menghapus monitoring: " + e.getMessage(), e);
        }
    }

    /** Memperbarui lokasi, tanggal, dan catatan monitoring yang sudah ada. */
    public MonitoringLingkungan ubahMonitoring(int id, int lokasiId, LocalDateTime t, String catatan) {
        MonitoringLingkungan m = find(id);
        if (t == null)throw new ValidationException("Tanggal monitoring wajib dipilih.");
        if (t.isAfter(LocalDateTime.now()))throw new ValidationException("Waktu monitoring di masa depan.");
        Lokasi l = loc.findById(lokasiId).orElseThrow(() -> new DataNotFoundException("Lokasi tidak ditemukan."));

        MonitoringLingkungan updated = new MonitoringLingkungan(id, l, m.getPetugasHSE(), t,
                m.getStatusMonitoring(), m.getTindakLanjut(), m.getStatusPenanganan(), catatan);
        mon.update(updated);
        return updated;
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
    
    /** Daftar lokasi tampil (NONAKTIF disembunyikan) untuk katalog Kondisi Lokasi HSE. */
    public List<Lokasi> tampilkanSemuaLokasi() {
        return loc.findAll();
    }
    
    public List<MonitoringLingkungan> tampilkanMonitoringByLokasi(int id) {
        if (!loc.findById(id).isPresent())throw new DataNotFoundException("Lokasi tidak ditemukan.");
        return mon.findByLokasi(id);
    }
}

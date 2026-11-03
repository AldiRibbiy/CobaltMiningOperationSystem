/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package service;

import enums.*;
import java.util.*;
import model.*;
import repository.*;

/**
 * Mengumpulkan data agregat untuk dashboard setiap peran. Service ini hanya membaca data
 * melalui repository; validasi hak akses dilakukan oleh DashboardController.
 *
 * @author zefrialrizkullah
 */

public final class DashboardService {
    private final PegawaiRepository pegawai;
    private final UserRepository users;
    private final LokasiRepository lokasi;
    private final MaterialRepository material;
    private final KendaraanRepository kendaraan;
    private final ParameterRepository parameter;
    private final ProduksiRepository produksi;
    private final PengangkutanRepository pengangkutan;
    private final MonitoringRepository monitoring;

    public DashboardService(PegawaiRepository p, UserRepository u, LokasiRepository l,
            MaterialRepository m, KendaraanRepository k, ParameterRepository par,
            ProduksiRepository pr, PengangkutanRepository pg, MonitoringRepository mo) {
        pegawai = p;
        users = u;
        lokasi = l;
        material = m;
        kendaraan = k;
        parameter = par;
        produksi = pr;
        pengangkutan = pg;
        monitoring = mo;
    }

    /* ---------------- Admin ---------------- */

    public Data admin() {
        Data d = new Data();
        List<Pegawai> semua = pegawai.findAll();
        d.pegawaiTotal = semua.size();
        d.pegawaiAktif = (int) semua.stream().filter(x->x.getStatusPegawai() == StatusPegawai.AKTIF).count();
        d.admin = (int) semua.stream().filter(x->x instanceof Admin).count();
        d.ops = (int) semua.stream().filter(x->x instanceof PetugasOperasional).count();
        d.hse = (int) semua.stream().filter(x->x instanceof PetugasHSE).count();
        d.manager = (int) semua.stream().filter(x->x instanceof Manager).count();
        d.driver = (int) semua.stream().filter(x->x instanceof Driver).count();
        d.userTotal = users.findAll().size();
        d.lokasiTotal = lokasi.findAll().size();
        d.lokasiAktif = (int) lokasi.findAll().stream().filter(x->x.getStatusOperasional() == StatusLokasi.AKTIF).count();
        d.materialTotal = material.findAll().size();
        d.parameterTotal = parameter.findAll().size();
        List<Kendaraan> k = kendaraan.findAll();
        d.kendaraanTotal = k.size();
        d.kendaraanTersedia = (int) k.stream().filter(x->x.getStatusKendaraan() == StatusKendaraan.TERSEDIA).count();
        d.kendaraanDigunakan = (int) k.stream().filter(x->x.getStatusKendaraan() == StatusKendaraan.DIGUNAKAN).count();
        d.kendaraanNonaktif = (int) k.stream().filter(x->x.getStatusKendaraan() == StatusKendaraan.NONAKTIF).count();
        return d;
    }

    /* ------------- Petugas Operasional ------------- */

    public Data operasional() {
        Data d = new Data();
        List<ProduksiTambang> prod = produksi.findAll();
        d.produksiTotal = prod.size();
        d.produksiTon = prod.stream().mapToDouble(ProduksiTambang::getJumlahProduksi).sum();
        d.stokTersediaTon = prod.stream().mapToDouble(ProduksiTambang::getJumlahTersedia).sum();
        d.produksiTersedia = (int) prod.stream().filter(x->x.getStatusProduksi() != StatusProduksi.HABIS && x.getJumlahTersedia()>0).count();

        List<Pengangkutan> ang = pengangkutan.findAll();
        d.angkutTotal = ang.size();
        d.angkutDijadwalkan = (int) ang.stream().filter(x->x.getStatusPengangkutan() == StatusPengangkutan.DIJADWALKAN).count();
        d.angkutPerjalanan = (int) ang.stream().filter(x->x.getStatusPengangkutan() == StatusPengangkutan.DALAM_PERJALANAN).count();
        d.angkutSelesai = (int) ang.stream().filter(x->x.getStatusPengangkutan() == StatusPengangkutan.SELESAI).count();
        d.angkutDibatalkan = (int) ang.stream().filter(x->x.getStatusPengangkutan() == StatusPengangkutan.DIBATALKAN).count();
        d.angkutSelesaiTon = ang.stream().filter(x->x.getStatusPengangkutan() == StatusPengangkutan.SELESAI)
                .mapToDouble(Pengangkutan::getJumlahMuatan).sum();

        d.kendaraanTersedia = (int) kendaraan.findAll().stream().filter(x->x.getStatusKendaraan() == StatusKendaraan.TERSEDIA).count();
        d.driverTersedia = (int) pegawai.findAll().stream().filter(x->x instanceof Driver
                && ((Driver) x).getStatusDriver() == StatusDriver.TERSEDIA).count();

        // Produksi terakhir per tanggal untuk tren grafik (maksimal 14 tanggal terakhir).
        Map<java.time.LocalDate, Double> tren = new TreeMap<>();
        for (ProduksiTambang p : prod)tren.merge(p.getTanggalProduksi(), p.getJumlahProduksi(), Double::sum);
        isiTren(d, tren, 14);

        // Total produksi per lokasi PIT.
        for (ProduksiTambang p : prod)d.produksiPerLokasi.merge(p.getLokasi().getNamaLokasi(), p.getJumlahProduksi(), Double::sum);
        return d;
    }

    /* ---------------- HSE ---------------- */

    public Data hse() {
        Data d = new Data();
        List<MonitoringLingkungan> mon = monitoring.findAll();
        d.monitoringTotal = mon.size();
        d.monitoringNormal = (int) mon.stream().filter(x->x.getStatusMonitoring() == StatusMonitoring.NORMAL).count();
        d.monitoringPeringatan = (int) mon.stream().filter(x->x.getStatusMonitoring() == StatusMonitoring.PERINGATAN).count();
        d.penangananBelum = (int) mon.stream().filter(x->x.getStatusPenanganan() == StatusPenanganan.BELUM_DITANGANI).count();
        d.penangananProses = (int) mon.stream().filter(x->x.getStatusPenanganan() == StatusPenanganan.DALAM_PENANGANAN).count();
        d.penangananSelesai = (int) mon.stream().filter(x->x.getStatusPenanganan() == StatusPenanganan.SELESAI).count();
        d.parameterTotal = parameter.findAll().size();

        for (MonitoringLingkungan m : mon) {
            for (DetailMonitoring dt : m.getDetailMonitoring()) {
                String nama = dt.getParameter().getNamaParameter();
                d.detailPerParameter.merge(nama, 1, Integer::sum);

                if (dt.getStatusDetail() == StatusDetail.PERINGATAN)d.peringatanPerParameter.merge(nama, 1, Integer::sum);
            }

        }

        // Tren 14 hari terakhir untuk grafik.
        Map<java.time.LocalDate, Double> tren = new TreeMap<>();
        for (MonitoringLingkungan m : mon)tren.merge(m.getTanggalMonitoring().toLocalDate(), 1.0, Double::sum);
        isiTren(d, tren, 14);
        return d;
    }

    /* ---------------- Manager ---------------- */

    public Data manager() {
        Data d = operasional();
        Data h = hse();
        d.monitoringTotal = h.monitoringTotal;
        d.monitoringNormal = h.monitoringNormal;
        d.monitoringPeringatan = h.monitoringPeringatan;
        d.penangananBelum = h.penangananBelum;
        d.penangananProses = h.penangananProses;
        d.penangananSelesai = h.penangananSelesai;
        d.detailPerParameter.putAll(h.detailPerParameter);
        d.peringatanPerParameter.putAll(h.peringatanPerParameter);
        d.kendaraanDigunakan = (int) kendaraan.findAll().stream().filter(x->x.getStatusKendaraan() == StatusKendaraan.DIGUNAKAN).count();
        d.kendaraanTotal = kendaraan.findAll().size();

        // Utilisasi muatan per kendaraan (ton terselesaikan).
        for (Pengangkutan a : pengangkutan.findAll()) {
            if (a.getStatusPengangkutan() == StatusPengangkutan.SELESAI) {
                d.muatanPerKendaraan.merge(a.getKendaraan().getNomorPolisi(), a.getJumlahMuatan(), Double::sum);
            }
        }
        return d;
    }

    private void isiTren(Data d, Map<java.time.LocalDate, Double> sumber, int maks) {
        List<java.time.LocalDate> tanggal = new ArrayList<>(sumber.keySet());
        int awal = Math.max(0, tanggal.size()-maks);

        for (int i = awal;i<tanggal.size();i++) {
            java.time.LocalDate t = tanggal.get(i);
            d.trenTanggal.add(t);
            d.trenNilai.add(sumber.get(t));
        }
    }

    /** Struktur data ringkasan untuk ditampilkan dashboard. */
    public static final class Data {
        public int pegawaiTotal, pegawaiAktif, admin, ops, hse, manager, driver, userTotal;
        public int lokasiTotal, lokasiAktif, materialTotal, parameterTotal;
        public int kendaraanTotal, kendaraanTersedia, kendaraanDigunakan, kendaraanNonaktif;
        public int produksiTotal, produksiTersedia;
        public double produksiTon, stokTersediaTon, angkutSelesaiTon;
        public int angkutTotal, angkutDijadwalkan, angkutPerjalanan, angkutSelesai, angkutDibatalkan;
        public int driverTersedia;
        public int monitoringTotal, monitoringNormal, monitoringPeringatan;
        public int penangananBelum, penangananProses, penangananSelesai;
        public final Map<String, Integer> detailPerParameter = new LinkedHashMap<>();
        public final Map<String, Integer> peringatanPerParameter = new LinkedHashMap<>();
        public final Map<String, Double> produksiPerLokasi = new LinkedHashMap<>();
        public final Map<String, Double> muatanPerKendaraan = new LinkedHashMap<>();
        public final List<java.time.LocalDate> trenTanggal = new ArrayList<>();
        public final List<Double> trenNilai = new ArrayList<>();
    }
}

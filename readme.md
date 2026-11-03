# C-MOS (Cobalt Mining Operation System) - Edisi Revisi

Aplikasi desktop manajemen operasional pertambangan kobalt berbasis **Java Swing (NetBeans GUI Builder) + MySQL/MariaDB + JDBC** dengan arsitektur MVC berlapis (Model - View - Controller - Service - Repository/DAO - Config - Util).

Dokumen ini merangkum cara menjalankan proyek **sekaligus daftar perbaikan** yang dilakukan pada revisi ini.

---

## 1. Cara Menjalankan

### Prasyarat
- JDK 17+ (proyek dikonfigurasi `maven.compiler.release=21`).
- NetBeans 17+ (GUI Builder dipakai penuh; setiap view memiliki file `.form`).
- MySQL atau MariaDB lokal.

### Langkah
1. **Impor database**: buat schema `cmos_db`, lalu impor `database/DBCobaltCMOS.sql`
   (file dump asli + header `CREATE DATABASE` / `USE`).
2. **Sesuaikan koneksi** bila perlu di `src/main/java/config/DatabaseConfig.java`
   (default `jdbc:mysql://localhost:3308/cmos_db`, user `root`, password kosong), atau
   set environment variable `CMOS_DB_URL`, `CMOS_DB_USER`, `CMOS_DB_PASSWORD`.
3. **Buka proyek di NetBeans** (proyek Maven) lalu **Run** (F6). `nbactions.xml` sudah
   mengarah ke `app.Main`.
   Build via terminal: `mvn clean compile exec:java`.
4. **Login** dengan salah satu akun pada dump (password semua akun: `12345678`):

| Username | Peran |
|---|---|
| `zefalriz`, `rasyaaditya`, `ahmadribbiy`, `ekosatrio` | Admin |
| `budiops`, `andiops`, `dimasops`, `rianops` | Petugas Operasional |
| `sitihse`, `dewihse`, `rinahse` | Petugas HSE |
| `hendramgr`, `fajarmgr` | Manager |

> Password disimpan sebagai PBKDF2-SHA256; untuk mengganti password gunakan form
> User (Admin) atau utility `util.BootstrapAdmin` saat database masih kosong.

### Dependensi
Deklarasi ada di `pom.xml`: `mysql-connector-j 8.3.0`, `swing-layout 1.0.3`,
`jcalendar 1.4` (komponen tanggal `JDateChooser`), `jfreechart 1.5.4` (grafik dashboard),
dan `AbsoluteLayout` (bundle NetBeans, tersedia di `lib/`). Jar `jfreechart` juga
di-vendor di `lib/org/free/jfreechart/1.5.4/` agar build tetap jalan tanpa internet.

---

## 2. Ringkasan Perbaikan Revisi

### 2.1 Monitoring & Detail Monitoring - Ubah/Hapus berfungsi penuh
- `MonitoringService` + `MonitoringController` kini menyediakan `ubahMonitoring`,
  `hapusMonitoring`, `ubahDetail`, `hapusDetail` (sebelumnya tidak ada sama sekali,
  sehingga tombol edit/hapus tidak bisa berfungsi).
- `MonitoringFormFrame` kini punya mode **ubah** sungguhan (sebelumnya konstruktor
  edit ada tetapi tombol Simpan selalu memanggil *create*).
- `MonitoringPanel` mendapat tombol **Tambah / Ubah / Detail-Penanganan / Hapus / Refresh**.
- `MonitoringDetailFrame` mendapat **Tambah / Ubah / Hapus Pengukuran**; status induk
  (monitoring & penanganan) **dihitung ulang otomatis** setiap detail berubah.
- `DetailMonitoringFormFrame` mendukung mode ubah dengan pra-isi data.
- Semua operasi transaksional; hapus monitoring menurunkan detail terlebih dahulu.
- Perubahan status tidak diperbolehkan bila penanganan sedang berjalan/selesai
  (integritas riwayat), dengan pesan validasi yang jelas.

### 2.2 Form CREATE/UPDATE Petugas OPS + HSE - data & dropdown terhubung
- **Akar masalah**: `MasterDataController.guard()` mensyaratkan Admin untuk *semua*
  metode, termasuk pembacaan dropdown (pegawai/driver, material, parameter, lokasi).
  Saat Petugas Ops/HSE membuka form, muncul popup "Hanya Admin." dan dropdown gagal
  terisi sehingga penyimpanan selalu gagal.
- **Perbaikan**: seluruh operasi *baca* (referensi/master) dibuka untuk setiap peran
  yang sudah login (`requireLoggedIn`), sedangkan *tulis* (tambah/ubah/hapus master)
  tetap khusus Admin. Ditambah metode khusus `tampilkanDriverTersedia()`.
- `PengangkutanFormFrame`: label dropdown diperkaya (produksi dengan sisa stok,
  kendaraan dengan kapasitas), **lokasi asal otomatis** mengikuti produksi terpilih
  (sesuai alur bisnis), tujuan hanya **STOCKPILE aktif**, driver hanya yang TERSEDIA.
- `ProduksiFormFrame` memakai dropdown material & PIT aktif, edit mode terisi penuh.

### 2.3 Tanggal memakai date picker (JCalendar)
Semua input tanggal manual (`JTextField` + `LocalDate.parse`) diganti komponen
`com.toedter.calendar.JDateChooser` (kalender klik, format `dd/MM/yyyy`):
- `PengangkutanFormFrame` (tanggal pengangkutan; tidak boleh lampau),
- `ProduksiFormFrame` (tanggal produksi; tidak boleh mendatang),
- `PegawaiFormFrame` (tanggal masuk + tanggal khusus: akses Admin/sertifikasi HSE/SIM),
- laporan (`Laporan*Panel`: periode awal-akhir),
- `MonitoringFormFrame` sudah memakai JDateChooser dan dipertahankan.

### 2.4 Alur "Mulai Penanganan" & "Selesai Penanganan"
- Validasi dan pesan kesalahan diperjelas (harus PERINGATAN, tindak lanjut wajib
  terisi sebelum mulai, urutan BELUM_DITANGANI → DALAM_PENANGANAN → SELESAI).
- Tombol di `MonitoringDetailFrame` **aktif/nonaktif otomatis** mengikuti status,
  jadi urutan alur tidak bisa dilanggar dari UI.
- Menetapkan tindak lanjut kini otomatis mengangkat status penanganan menjadi
  `BELUM_DITANGANI`; pengukuran yang diubah/dihapus menghitung ulang status
  monitoring induk secara konsisten (SQL CASE + EXISTS di dalam transaksi).
- Batas start pengangkutan dilonggarkan dari "hanya tanggal jadwal" menjadi
  "tanggal jadwal sudah tiba" agar alur bisa dijalankan; alur pengangkutan
  (Mulai Perjalanan / Selesaikan / Batalkan) kini punya tombol sendiri di panel.

### 2.5 Peran Manager
- Manager fokus **monitoring & evaluasi**: Dashboard Manager baru (KPI lintas modul:
  produksi, stok, muatan terselesaikan, peringatan lingkungan, utilisasi kendaraan)
  + grafik batang muatan per kendaraan + tren produksi harian.
- Tiga panel **Laporan** (Produksi, Pengangkutan, Monitoring) kini memakai
  `LaporanController` (guard `requireManager`) dengan **filter periode tanggal** -
  tidak lagi menembus repository langsung dari view.
- Detail monitoring untuk laporan dibuka mode *read-only*; akses baca detail
  diperluas ke Manager (HSE tetap pemilik modul).

### 2.6 Form Pegawai dinamis sesuai jenis petugas
- Memilih **Jenis Pegawai** menampilkan hanya kolom yang relevan
  (GroupLayout `honorsVisibility` sehingga baris tersembunyi benar-benar runtuh):
  - **ADMIN**: Kode Admin + Tanggal Mulai Akses (date picker)
  - **OPERASIONAL**: Shift Kerja (dropdown PAGI/SIANG/MALAM)
  - **HSE**: No. Sertifikasi + Masa Berlaku Sertifikasi (date picker)
  - **MANAGER**: Divisi Tanggung Jawab
  - **DRIVER**: No. SIM + Masa Berlaku SIM (date picker) + Status Driver
- Label kolom khusus berubah dinamis; isian lama dibersihkan saat ganti jenis.
- Mode ubah mengunci jenis pegawai (tidak boleh ganti subtype) dan menampilkan
  status driver BERTUGAS apa adanya (status tersebut hanya berubah lewat
  pengangkutan, sesuai aturan service).

### 2.7 Dashboard 4 peran dengan grafik
Dibangun ulang total dengan **kartu KPI** (dua baris) + **dua grafik JFreeChart**
per peran, data via `DashboardController`/`DashboardService` baru (sesuai MVC):
- **Admin**: pegawai per jenis (bar), status kendaraan (pie), KPI master & akun.
- **Petugas Operasional**: produksi per lokasi (bar), status pengangkutan (pie),
  KPI produksi/stok/muatan/kendaraan/driver.
- **Petugas HSE**: status monitoring (pie), peringatan per parameter (bar),
  KPI penanganan (belum/dalam proses/selesai).
- **Manager**: muatan terselesaikan per kendaraan (bar), tren produksi harian
  (line), KPI lintas modul.
Grafik digambar ke panel placeholder hasil desain GUI Builder; bila belum ada
data, panel menampilkan pesan rapi, bukan error.

### 2.8 Perbaikan lain
- `pom.xml`: `exec.mainClass` diperbaiki ke `app.Main`, target kompilasi ke
  `release 21`, dependensi `jfreechart` ditambah.
- Pesan penolakan akses diperjelas ("Akses ditolak: fitur ini hanya untuk ...").
- Pesan `ProduksiService` untuk data yang punya riwayat pengangkutan diperjelas.
- `DataScreen` tidak lagi mengakses repository langsung untuk laporan.
- Komentar serta penamaan dirapikan pada bagian yang diubah.

---

## 3. Struktur Proyek

```
src/main/java/
  app/        Main.java (entry point)
  config/     AppConfig (composition root), DatabaseConfig (JDBC)
  controller/ Auth, MasterData, Produksi, Pengangkutan, Monitoring, Laporan, Dashboard
  service/    Aturan bisnis + validasi + transaksi
  dao/        JDBC DAO + JdbcSupport (helper)
  repository/ Antarmuka persistence
  model/      Pegawai (abstract) + Admin/PetugasOperasional/PetugasHSE/Manager/Driver,
              User, Lokasi, JenisMaterial, Kendaraan, ParameterLingkungan,
              ProduksiTambang, Pengangkutan, MonitoringLingkungan, DetailMonitoring
  enums/      Status-status domain
  exception/  ValidationException, DataNotFoundException, BusinessException
  util/       PasswordUtil (PBKDF2), BootstrapAdmin
  view/       Semua frame/panel + file .form NetBeans (GUI Builder), DashboardCharts
database/     DBCobaltCMOS.sql (schema + data)
```

## 4. Catatan Desain
- View tidak pernah menulis SQL; akses data hanya melalui repository, aturan bisnis
  di service, hak akses divalidasi di controller.
- Stok produksi dan pengangkutan dikunci dengan `SELECT ... FOR UPDATE` di dalam
  transaksi; pembatalan pengangkutan tidak mengurangi stok; kapasitas kendaraan
  dan sisa stok selalu divalidasi.
- Status operasional lokasi dan status peringatan monitoring dipisahkan; peringatan
  lingkungan tidak otomatis memblokir pengangkutan (sesuai ketentuan proyek).

# C-MOS (Cobalt Mining Operation System)

## Sistem Manajemen Operasional Pertambangan Berbasis Java Desktop

C-MOS (Cobalt Mining Operation System) merupakan aplikasi desktop berbasis Java yang dikembangkan untuk membantu pengelolaan kegiatan operasional perusahaan pertambangan Cobalt.

Aplikasi ini mengintegrasikan pengelolaan pegawai, akun pengguna, lokasi pertambangan, material, kendaraan, produksi tambang, pengangkutan material, monitoring lingkungan, dashboard, dan laporan.

Proyek ini dikembangkan sebagai implementasi mata kuliah Pemrograman Berorientasi Objek (PBO) dan Sistem Basis Data (SBD).

Dalam pengembangannya, C-MOS menerapkan empat pilar utama Object-Oriented Programming, yaitu Encapsulation, Inheritance, Polymorphism, dan Abstraction.

Selain itu, aplikasi menggunakan arsitektur berlapis yang memisahkan tampilan, pengendalian proses, aturan bisnis, serta akses database.

---

# 1. DESKRIPSI PROYEK

## 1.1 Latar Belakang

Perusahaan pertambangan memiliki berbagai kegiatan operasional yang saling berkaitan.

Kegiatan tersebut meliputi pencatatan hasil produksi, pengangkutan material, pengelolaan kendaraan, penugasan pegawai, dan pemeriksaan kondisi lingkungan.

Apabila setiap kegiatan dikelola secara terpisah, perusahaan akan mengalami kesulitan dalam memperoleh informasi yang konsisten.

Sebagai contoh, ketika material hasil produksi telah diangkut, jumlah material yang tersedia harus diperbarui agar tidak terjadi perbedaan antara persediaan dan riwayat pengangkutan.

Selain itu, perusahaan perlu mengetahui kondisi lingkungan di setiap lokasi pertambangan untuk mendukung pengawasan dan pengambilan keputusan.

Berdasarkan kebutuhan tersebut, dikembangkan C-MOS sebagai sistem informasi yang menghubungkan seluruh kegiatan operasional dalam satu aplikasi desktop.

## 1.2 Tujuan Pengembangan

Tujuan pengembangan C-MOS adalah:

1. Mengelola data pegawai berdasarkan jenis pekerjaan dan tanggung jawab.
2. Mengatur akun pengguna dan hak akses aplikasi.
3. Mengelola lokasi pertambangan dan jenis material.
4. Mengelola kendaraan yang digunakan untuk pengangkutan.
5. Mencatat hasil produksi tambang.
6. Memantau jumlah material yang masih tersedia.
7. Mengelola kegiatan pengangkutan material.
8. Mencatat hasil monitoring lingkungan.
9. Menampilkan informasi operasional melalui dashboard.
10. Menyediakan laporan untuk mendukung pengawasan Manager.
11. Menerapkan empat pilar OOP dalam pengembangan aplikasi.
12. Menerapkan pengelolaan database relasional menggunakan MySQL dan JDBC.

## 1.3 Ruang Lingkup

C-MOS berfokus pada kegiatan operasional perusahaan pertambangan.

Sistem tidak mencakup pengolahan mineral di pabrik, penggajian pegawai, pembelian bahan bakar, maupun perawatan kendaraan secara terperinci.

Monitoring lingkungan digunakan untuk menyediakan informasi kondisi lokasi dan tindak lanjut pemeriksaan.

Status peringatan lingkungan tidak secara otomatis menghentikan kegiatan pengangkutan. Informasi tersebut digunakan sebagai bahan evaluasi dan pengambilan keputusan oleh manajemen.

## 1.4 Keterkaitan dengan SDGs

Pengembangan C-MOS berkaitan dengan beberapa Sustainable Development Goals.

### SDG 8: Decent Work and Economic Growth

Mendukung pengelolaan pekerjaan dan kegiatan operasional perusahaan secara terstruktur.

### SDG 9: Industry, Innovation, and Infrastructure

Menerapkan teknologi informasi dalam pengelolaan kegiatan industri pertambangan.

### SDG 12: Responsible Consumption and Production

Mendukung pencatatan produksi, pemantauan material, dan monitoring lingkungan untuk membantu pengelolaan sumber daya.

---

# 2. TEKNOLOGI YANG DIGUNAKAN

## 2.1 Bahasa Pemrograman

Bahasa pemrograman utama yang digunakan adalah Java.

Java digunakan untuk membangun seluruh proses aplikasi, mulai dari pengelolaan objek, validasi data, pengolahan transaksi, sampai komunikasi dengan database.

Java dipilih karena mendukung konsep Object-Oriented Programming dan pengembangan aplikasi desktop menggunakan Swing.

Berdasarkan konfigurasi `pom.xml` pada source code yang diperiksa, proyek menggunakan target kompilasi Java 21.

```xml
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.release>21</maven.compiler.release>
    <exec.mainClass>app.Main</exec.mainClass>
</properties>
```

Konfigurasi tersebut menunjukkan bahwa Java 21 menjadi target kompilasi proyek saat ini.

## 2.2 IDE

Aplikasi dikembangkan menggunakan Apache NetBeans.

NetBeans digunakan untuk:

- Menulis dan mengelola source code Java.
- Mengatur struktur package.
- Mendesain antarmuka menggunakan GUI Builder.
- Mengelola dependency Maven.
- Menjalankan dan menguji aplikasi.
- Mengelola file `.java` dan `.form`.

File `.java` menyimpan kode program, sedangkan file `.form` menyimpan informasi desain antarmuka yang digunakan NetBeans GUI Builder.

## 2.3 Database

Database yang digunakan adalah MySQL.

Database berfungsi menyimpan seluruh informasi operasional perusahaan.

Database proyek bernama:

```sql
cmos_db
```

Aplikasi menggunakan JDBC untuk melakukan komunikasi dengan database.

## 2.4 Build Tool

Proyek menggunakan Apache Maven.

Maven berfungsi mengelola dependency, konfigurasi kompilasi, dan proses pembangunan aplikasi.

Seluruh dependency utama dicatat dalam file:

```text
pom.xml
```

Dengan Maven, library dapat dikelola melalui konfigurasi proyek tanpa harus menambahkan setiap file JAR secara manual.

---

# 3. LIBRARY DAN DEPENDENCY

Proyek C-MOS menggunakan beberapa library untuk mendukung fitur aplikasi.

Berikut dependency yang tercantum dalam `pom.xml` proyek.

```xml
<dependencies>
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <version>8.3.0</version>
    </dependency>

    <dependency>
        <groupId>unknown.binary</groupId>
        <artifactId>AbsoluteLayout</artifactId>
        <version>SNAPSHOT</version>
    </dependency>

    <dependency>
        <groupId>org.swinglabs</groupId>
        <artifactId>swing-layout</artifactId>
        <version>1.0.3</version>
    </dependency>

    <dependency>
        <groupId>com.toedter</groupId>
        <artifactId>jcalendar</artifactId>
        <version>1.4</version>
        <scope>compile</scope>
    </dependency>

    <dependency>
        <groupId>org.jfree</groupId>
        <artifactId>jfreechart</artifactId>
        <version>1.5.4</version>
    </dependency>
</dependencies>
```

## 3.1 Java Swing

Java Swing merupakan library GUI yang tersedia dalam Java untuk membangun aplikasi desktop.

Swing digunakan untuk membuat komponen antarmuka seperti:

- JFrame
- JPanel
- JButton
- JLabel
- JTextField
- JComboBox
- JTable
- JScrollPane
- JOptionPane

### Penerapan pada C-MOS

JFrame digunakan untuk membuat jendela aplikasi.

Contohnya:

```java
public class MonitoringFormFrame extends javax.swing.JFrame {
}
```

JPanel digunakan untuk membuat halaman yang ditampilkan di dalam jendela utama.

Contohnya:

```java
public class KendaraanPanel extends javax.swing.JPanel {
}
```

JTable digunakan untuk menampilkan daftar data.

JButton digunakan untuk menjalankan tindakan seperti tambah, ubah, hapus, dan simpan.

JComboBox digunakan untuk memilih data yang sudah tersedia, seperti lokasi, material, kendaraan, dan driver.

### Manfaat Swing

Swing memungkinkan aplikasi menyediakan antarmuka visual sehingga pengguna tidak perlu menjalankan perintah melalui terminal.

Pengguna dapat mengoperasikan sistem melalui menu, tombol, tabel, dan form.

---

## 3.2 MySQL Connector/J

MySQL Connector/J merupakan driver JDBC yang memungkinkan aplikasi Java berkomunikasi dengan MySQL.

Dependency:

```xml
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>8.3.0</version>
</dependency>
```

### Fungsi

Library ini digunakan untuk:

1. Membuka koneksi database.
2. Menjalankan perintah SQL.
3. Mengambil hasil query.
4. Menyimpan data baru.
5. Memperbarui data.
6. Menghapus data.
7. Mendukung pengelolaan transaksi database.

### Bukti penerapan

Lokasi:

```text
config/DatabaseConfig.java
```

Kode:

```java
public static Connection getConnection()
        throws SQLException {

    String url = env(
        "CMOS_DB_URL",
        "jdbc:mysql://localhost:3308/cmos_db"
    );

    String username = env("CMOS_DB_USER", "root");

    String password =
        System.getenv("CMOS_DB_PASSWORD");

    return DriverManager.getConnection(
        url,
        username,
        password == null ? "" : password
    );
}
```

### Penjelasan

`DriverManager.getConnection()` digunakan untuk membuat koneksi ke database.

Alamat `localhost` menunjukkan bahwa database secara default berada pada komputer yang menjalankan aplikasi.

Angka `3308` merupakan port database pada konfigurasi proyek.

`cmos_db` merupakan nama database yang digunakan.

Username dan password digunakan untuk autentikasi koneksi database.

Konfigurasi juga mendukung environment variable sehingga informasi koneksi dapat disesuaikan tanpa mengubah source code.

### Alur penggunaan

```text
Aplikasi Java
     |
     v
DatabaseConfig
     |
     v
MySQL Connector/J
     |
     v
MySQL Database
     |
     v
Hasil Query
     |
     v
Aplikasi Java
```

---

## 3.3 JCalendar

JCalendar merupakan library yang menyediakan komponen pemilihan tanggal melalui kalender.

Dependency:

```xml
<dependency>
    <groupId>com.toedter</groupId>
    <artifactId>jcalendar</artifactId>
    <version>1.4</version>
</dependency>
```

### Fungsi

Library ini digunakan untuk mempermudah pengguna memilih tanggal.

Pengguna tidak perlu mengetik tanggal secara manual.

### Bukti penerapan

Lokasi:

```text
view/MonitoringFormFrame.java
```

Komponen yang digunakan:

```java
com.toedter.calendar.JDateChooser
```

Contoh konfigurasi:

```java
txtTanggal.setDate(new Date());

txtTanggal.setDateFormatString("dd/MM/yyyy");

txtTanggal.setMaxSelectableDate(new Date());
```

### Penjelasan

`setDate()` digunakan untuk menentukan tanggal awal yang ditampilkan.

`setDateFormatString()` digunakan untuk mengatur format tanggal.

`setMaxSelectableDate()` digunakan untuk menentukan tanggal maksimal yang dapat dipilih.

Pada form monitoring, tanggal maksimal dibatasi sampai tanggal saat ini.

Tujuannya agar Petugas HSE tidak mencatat monitoring menggunakan tanggal yang belum terjadi.

### Konversi tanggal

JDateChooser menghasilkan objek `Date`.

Sementara itu, model MonitoringLingkungan menggunakan `LocalDateTime`.

Oleh karena itu, diperlukan konversi.

```java
private LocalDate getTanggalMonitoring() {
    Date tanggal = txtTanggal.getDate();

    if (tanggal == null) {
        throw new IllegalArgumentException(
            "Silakan pilih tanggal monitoring."
        );
    }

    return tanggal.toInstant()
            .atZone(ZoneId.systemDefault())
            .toLocalDate();
}
```

Tanggal tersebut kemudian dapat diubah menjadi LocalDateTime.

```java
LocalDateTime tanggalMonitoring =
        getTanggalMonitoring().atStartOfDay();
```

### Contoh hasil

Pengguna memilih:

```text
04/11/2026
```

Sistem menyimpan:

```text
2026-11-04 00:00:00
```

Dengan cara ini, pengguna hanya memilih tanggal, sedangkan aplikasi menangani format penyimpanan yang dibutuhkan database.

---

## 3.4 JFreeChart

JFreeChart merupakan library Java yang digunakan untuk membuat grafik dan visualisasi data.

Dependency:

```xml
<dependency>
    <groupId>org.jfree</groupId>
    <artifactId>jfreechart</artifactId>
    <version>1.5.4</version>
</dependency>
```

### Tujuan penggunaan

JFreeChart digunakan untuk menyajikan informasi operasional dalam bentuk visual.

Grafik membantu pengguna memahami data tanpa harus membaca seluruh baris tabel.

Dalam C-MOS, grafik digunakan pada halaman dashboard.

### Lokasi penerapan

```text
view/DashboardCharts.java
```

File ini merupakan komponen pendukung yang bertugas membuat dan menampilkan grafik.

### Jenis grafik yang digunakan

Source code menyediakan dua jenis grafik utama.

#### A. Bar Chart

Bar Chart merupakan grafik batang yang digunakan untuk membandingkan nilai berdasarkan kategori.

Contoh penggunaannya:

- Membandingkan jumlah produksi.
- Membandingkan jumlah pengangkutan.
- Menampilkan ringkasan data berdasarkan kategori.

Bukti kode:

```java
public static JFreeChart bar(
        String judul,
        DefaultCategoryDataset data) {

    JFreeChart chart =
            ChartFactory.createBarChart(
                judul,
                null,
                null,
                data,
                PlotOrientation.VERTICAL,
                false,
                true,
                false
            );

    gaya(chart);

    CategoryPlot plot = chart.getCategoryPlot();

    plot.setBackgroundPaint(Color.WHITE);

    return chart;
}
```

### Penjelasan

`DefaultCategoryDataset` digunakan untuk menyimpan data yang akan ditampilkan pada grafik batang.

`ChartFactory.createBarChart()` digunakan untuk membuat grafik.

`PlotOrientation.VERTICAL` menentukan arah batang secara vertikal.

`CategoryPlot` digunakan untuk mengatur tampilan grafik.

Contoh ilustrasi:

```text
Jumlah Produksi

200 |                ███
150 |       ███      ███
100 | ███   ███      ███
 50 | ███   ███      ███
  0 +-----------------------
      PIT A PIT B    PIT C
```

Grafik tersebut memperlihatkan perbandingan jumlah produksi dari beberapa lokasi.

#### B. Pie Chart

Pie Chart merupakan diagram lingkaran yang digunakan untuk memperlihatkan perbandingan bagian terhadap keseluruhan.

Contohnya, grafik dapat digunakan untuk menampilkan perbandingan status monitoring NORMAL dan PERINGATAN.

Bukti kode:

```java
public static JFreeChart pie(
        String judul,
        DefaultPieDataset<String> data) {

    JFreeChart chart =
            ChartFactory.createPieChart(
                judul,
                data,
                true,
                true,
                false
            );

    gaya(chart);

    PiePlot plot = (PiePlot) chart.getPlot();

    plot.setBackgroundPaint(Color.WHITE);

    return chart;
}
```

### Penjelasan

`DefaultPieDataset` menyimpan nilai setiap kategori.

`ChartFactory.createPieChart()` membuat diagram lingkaran.

`PiePlot` digunakan untuk mengatur tampilan diagram.

Contoh ilustrasi:

```text
Status Monitoring

NORMAL      : 75%
PERINGATAN  : 25%
```

Informasi tersebut dapat divisualisasikan dalam bentuk diagram lingkaran.

### Proses menampilkan grafik pada JPanel

JFreeChart menghasilkan objek grafik.

Agar grafik dapat ditampilkan pada antarmuka Swing, aplikasi menggunakan `ChartPanel`.

Bukti kode:

```java
public static void render(
        JPanel placeholder,
        JFreeChart chart) {

    placeholder.removeAll();

    placeholder.setLayout(
        new java.awt.BorderLayout()
    );

    ChartPanel panel = new ChartPanel(chart);

    panel.setMouseWheelEnabled(true);

    placeholder.add(
        panel,
        java.awt.BorderLayout.CENTER
    );

    placeholder.revalidate();

    placeholder.repaint();
}
```

### Penjelasan alur

Pertama, aplikasi menyiapkan data yang akan divisualisasikan.

Kemudian, data dimasukkan ke dalam dataset.

Dataset digunakan untuk membuat objek JFreeChart.

Objek grafik dimasukkan ke ChartPanel.

ChartPanel kemudian ditampilkan pada JPanel dashboard.

```text
Database MySQL
      |
      v
DashboardService
      |
      v
DashboardController
      |
      v
Dashboard Panel
      |
      v
Dataset
      |
      v
JFreeChart
      |
      v
ChartPanel
      |
      v
Grafik pada Dashboard
```

### Fungsi tambahan

DashboardCharts juga memiliki method:

```java
kosong(JPanel placeholder, String pesan)
```

Method tersebut digunakan untuk menampilkan pesan ketika tidak tersedia data yang dapat divisualisasikan.

Dengan demikian, halaman dashboard tetap dapat memberikan informasi kepada pengguna meskipun dataset belum berisi data.

### Manfaat JFreeChart dalam C-MOS

JFreeChart membantu menyajikan informasi operasional dalam bentuk grafik yang lebih mudah dibaca.

Manager dapat menggunakan grafik untuk membandingkan kegiatan operasional dan memahami kondisi perusahaan berdasarkan data yang tersedia.

---

## 3.5 Swing Layout

Dependency:

```xml
<dependency>
    <groupId>org.swinglabs</groupId>
    <artifactId>swing-layout</artifactId>
    <version>1.0.3</version>
</dependency>
```

Swing Layout merupakan library yang berkaitan dengan pengaturan posisi dan ukuran komponen antarmuka.

Dalam proyek NetBeans, pengaturan layout membantu menempatkan tombol, label, tabel, dan komponen lainnya.

Sebagian besar form C-MOS menggunakan GroupLayout yang dihasilkan melalui GUI Builder.

Contoh:

```java
javax.swing.GroupLayout layout =
        new javax.swing.GroupLayout(getContentPane());

getContentPane().setLayout(layout);
```

GroupLayout mengatur posisi komponen secara horizontal dan vertikal.

Dengan demikian, komponen dapat disusun secara teratur pada form.

---

## 3.6 AbsoluteLayout

Dependency:

```xml
<dependency>
    <groupId>unknown.binary</groupId>
    <artifactId>AbsoluteLayout</artifactId>
    <version>SNAPSHOT</version>
</dependency>
```

AbsoluteLayout merupakan komponen layout yang berkaitan dengan pengaturan posisi elemen secara langsung.

Library ini tercantum dalam konfigurasi Maven proyek.

Namun, keberadaan dependency tidak berarti seluruh tampilan menggunakan AbsoluteLayout.

Pada form yang diperiksa, terdapat penggunaan GroupLayout.

Karena itu, AbsoluteLayout lebih tepat dijelaskan sebagai dependency pendukung proyek NetBeans, bukan layout utama seluruh antarmuka.

---

## 3.7 Library Bawaan Java

Selain dependency Maven, C-MOS menggunakan beberapa library standar Java.

### java.time

Digunakan untuk pengelolaan tanggal dan waktu.

Contoh:

```java
LocalDate
LocalDateTime
```

`LocalDate` digunakan untuk data tanggal tanpa jam.

`LocalDateTime` digunakan untuk data tanggal dan waktu.

### java.util

Digunakan untuk struktur data dan utilitas.

Contoh:

```java
List
ArrayList
Optional
Date
```

### java.sql

Digunakan untuk komunikasi database melalui JDBC.

Contoh:

```java
Connection
PreparedStatement
ResultSet
SQLException
```

### java.security dan javax.crypto

Digunakan untuk pengamanan password.

Contoh:

```java
SecureRandom
MessageDigest
SecretKeyFactory
PBEKeySpec
```

---

# 4. STRUKTUR PACKAGE PROYEK

Proyek menggunakan sebelas package utama.

```text
src/main/java/
│
├── app/
│   └── Main.java
│
├── config/
│   ├── AppConfig.java
│   └── DatabaseConfig.java
│
├── model/
│   ├── Pegawai.java
│   ├── Admin.java
│   ├── PetugasOperasional.java
│   ├── PetugasHSE.java
│   ├── Manager.java
│   ├── Driver.java
│   ├── User.java
│   ├── Lokasi.java
│   ├── JenisMaterial.java
│   ├── Kendaraan.java
│   ├── ProduksiTambang.java
│   ├── Pengangkutan.java
│   ├── ParameterLingkungan.java
│   ├── MonitoringLingkungan.java
│   └── DetailMonitoring.java
│
├── enums/
│   └── 11 file enum
│
├── repository/
│   └── 10 interface repository
│
├── dao/
│   └── 10 file DAO
│
├── service/
│   └── 7 file service
│
├── controller/
│   └── 7 file controller
│
├── view/
│   └── 39 file Java
│
├── util/
│   ├── BootstrapAdmin.java
│   └── PasswordUtil.java
│
└── exception/
    ├── ValidationException.java
    ├── DataNotFoundException.java
    └── BusinessException.java
```

Total terdapat 107 file Java utama.

Setiap package memiliki tanggung jawab berbeda.

Pemisahan ini bertujuan agar kode lebih terstruktur dan proses pengembangan lebih mudah dikelola.

---

# 5. PACKAGE APP

## 5.1 Main.java

Main.java merupakan titik awal eksekusi aplikasi.

Ketika aplikasi dijalankan, Java akan mengeksekusi method `main()`.

Bukti kode:

```java
public static void main(String[] args) {

    SwingUtilities.invokeLater(() -> {

        try {

            UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName()
            );

            AppConfig.initialize();

            new LoginFrame().setVisible(true);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(
                null,
                "Aplikasi tidak dapat dijalankan.\n"
                + ex.getMessage(),
                "C-MOS - Kesalahan Terjadi",
                JOptionPane.ERROR_MESSAGE
            );
        }
    });
}
```

### Penjelasan

`main()` merupakan method pertama yang dijalankan.

`SwingUtilities.invokeLater()` memastikan proses pembuatan antarmuka berjalan melalui Event Dispatch Thread.

`UIManager.setLookAndFeel()` menyesuaikan tampilan komponen dengan sistem operasi.

`AppConfig.initialize()` menyiapkan komponen aplikasi.

`LoginFrame` menampilkan halaman login.

Jika terjadi kesalahan, program menampilkan pesan melalui JOptionPane.

### Alur

```text
Program dijalankan
        |
        v
Main.java
        |
        v
AppConfig.initialize()
        |
        v
Persiapan komponen aplikasi
        |
        v
LoginFrame
```

---

# 6. PACKAGE CONFIG

Package config digunakan untuk menyiapkan konfigurasi aplikasi.

## 6.1 AppConfig.java

AppConfig bertugas membuat dan menghubungkan komponen aplikasi.

Komponen tersebut meliputi:

- Repository
- DAO
- Service
- Controller

Contoh:

```java
pegawaiRepository = new PegawaiDAO();

userRepository = new UserDAO();

lokasiRepository = new LokasiDAO();

authService = new AuthService(userRepository);

authController = new AuthController(authService);
```

### Penjelasan

DAO dibuat untuk menyediakan akses database.

Repository kemudian digunakan oleh Service.

Service diberikan kepada Controller.

Dengan cara ini, setiap komponen dapat menjalankan tugasnya tanpa harus membuat sendiri seluruh dependency.

Konsep ini merupakan penerapan dependency injection melalui constructor.

## 6.2 DatabaseConfig.java

DatabaseConfig bertugas mengatur koneksi MySQL.

File ini menyediakan method:

```java
getConnection()
```

dan:

```java
testConnection()
```

`getConnection()` digunakan untuk memperoleh koneksi database.

`testConnection()` digunakan untuk memeriksa apakah database dapat diakses.

---

# 7. PACKAGE MODEL

Package model berfungsi merepresentasikan objek dan data utama aplikasi.

Terdapat 15 class model.

## 7.1 Pegawai.java

Pegawai merupakan superclass dari seluruh jenis pegawai.

Atributnya:

```java
private int idPegawai;
private String namaPegawai;
private String noHp;
private LocalDate tanggalMasuk;
private StatusPegawai statusPegawai;
```

Class ini menyimpan karakteristik umum yang dimiliki seluruh pegawai.

Pegawai juga menjadi pusat penerapan inheritance dan abstraction.

## 7.2 Admin.java

Admin merupakan subclass Pegawai.

Atribut khusus:

```java
private String kodeAdmin;
private LocalDate tanggalMulaiAkses;
```

Admin digunakan untuk merepresentasikan pegawai yang bertanggung jawab mengelola data utama dan akun aplikasi.

## 7.3 PetugasOperasional.java

PetugasOperasional merupakan subclass Pegawai.

Atribut khusus:

```java
private ShiftKerja shiftKerja;
```

Class ini digunakan dalam kegiatan produksi dan pengangkutan.

Shift kerja terdiri dari PAGI, SIANG, dan MALAM.

## 7.4 PetugasHSE.java

PetugasHSE merupakan subclass Pegawai.

Atribut khususnya meliputi:

```java
private String noSertifikasiHSE;
private LocalDate masaBerlakuSertifikasi;
```

Class ini digunakan untuk merepresentasikan pegawai yang bertugas melakukan monitoring lingkungan.

Terdapat method untuk memeriksa masa berlaku sertifikasi.

## 7.5 Manager.java

Manager merupakan subclass Pegawai.

Atribut khusus:

```java
private String divisiTanggungJawab;
```

Class ini digunakan untuk merepresentasikan pegawai yang bertanggung jawab melakukan pengawasan dan evaluasi operasional.

## 7.6 Driver.java

Driver merupakan subclass Pegawai.

Atribut khusus:

```java
private String noSim;
private LocalDate masaBerlakuSim;
private StatusDriver statusDriver;
```

Driver digunakan dalam kegiatan pengangkutan material.

Driver tidak memiliki akun login.

Data driver dipilih oleh Petugas Operasional ketika membuat pengangkutan.

Class ini juga menyediakan pemeriksaan masa berlaku SIM.

## 7.7 User.java

User merepresentasikan akun pengguna aplikasi.

Atribut utamanya meliputi:

```java
private int idUser;
private Pegawai pegawai;
private String username;
private String password;
```

Setiap akun terhubung dengan pegawai tertentu.

User tidak memiliki atribut role tersendiri.

Jenis pengguna ditentukan melalui subclass Pegawai yang terhubung dengan akun.

## 7.8 Lokasi.java

Lokasi merepresentasikan area pertambangan.

Jenis lokasi:

```text
PIT
STOCKPILE
```

PIT digunakan sebagai lokasi produksi.

STOCKPILE digunakan sebagai lokasi penampungan material.

Lokasi digunakan dalam produksi, pengangkutan, dan monitoring.

## 7.9 JenisMaterial.java

JenisMaterial menyimpan informasi kategori material tambang.

Atributnya:

```text
ID Material
Nama Material
Satuan
Deskripsi
```

Data material digunakan ketika membuat catatan produksi.

## 7.10 Kendaraan.java

Kendaraan menyimpan informasi armada pengangkutan.

Atributnya:

```text
ID Kendaraan
Jenis Kendaraan
Nomor Polisi
Kapasitas
Tahun Kendaraan
Status Kendaraan
```

Kapasitas kendaraan digunakan untuk memastikan jumlah muatan sesuai kemampuan kendaraan.

## 7.11 ProduksiTambang.java

ProduksiTambang merepresentasikan hasil produksi material.

Informasinya meliputi:

```text
ID Produksi
Material
Lokasi
Petugas Operasional
Tanggal Produksi
Jumlah Produksi
Jumlah Tersedia
Status Produksi
```

Class ini menjadi sumber material bagi kegiatan pengangkutan.

## 7.12 Pengangkutan.java

Pengangkutan merepresentasikan kegiatan pemindahan material.

Class ini menghubungkan:

```text
ProduksiTambang
PetugasOperasional
Kendaraan
Driver
Lokasi Asal
Lokasi Tujuan
```

Selain itu, class menyimpan tanggal, waktu mulai, waktu selesai, jumlah muatan, dan status pengangkutan.

## 7.13 ParameterLingkungan.java

ParameterLingkungan menyimpan indikator pemeriksaan lingkungan.

Atribut utamanya:

```text
ID Parameter
Nama Parameter
Satuan
Batas Minimum
Batas Maksimum
Keterangan
```

Data ini digunakan untuk menentukan apakah hasil pengukuran berada dalam batas yang ditetapkan.

## 7.14 MonitoringLingkungan.java

MonitoringLingkungan merepresentasikan kegiatan pemeriksaan lingkungan.

Informasinya meliputi:

```text
ID Monitoring
Lokasi
Petugas HSE
Tanggal Monitoring
Status Monitoring
Tindak Lanjut
Status Penanganan
Catatan
```

Satu monitoring dapat memiliki beberapa detail pengukuran.

## 7.15 DetailMonitoring.java

DetailMonitoring menyimpan hasil pengukuran setiap parameter.

Atributnya meliputi:

```text
ID Detail
Monitoring
Parameter Lingkungan
Nilai Pengukuran
Status Detail
Catatan
```

Hubungannya adalah satu MonitoringLingkungan dapat memiliki banyak DetailMonitoring.

---

# 8. PACKAGE ENUMS

Enum digunakan untuk membatasi nilai atribut agar sesuai dengan pilihan yang ditentukan.

Terdapat 11 enum.

| Enum | Nilai |
|---|---|
| StatusPegawai | AKTIF, NONAKTIF |
| ShiftKerja | PAGI, SIANG, MALAM |
| JenisLokasi | PIT, STOCKPILE |
| StatusLokasi | AKTIF, DIBATASI, DITUTUP_SEMENTARA |
| StatusDriver | TERSEDIA, BERTUGAS, NONAKTIF |
| StatusKendaraan | TERSEDIA, DIGUNAKAN, NONAKTIF |
| StatusProduksi | TERSEDIA, SEBAGIAN_DIANGKUT, HABIS |
| StatusPengangkutan | DIJADWALKAN, DALAM_PERJALANAN, SELESAI, DIBATALKAN |
| StatusMonitoring | NORMAL, PERINGATAN |
| StatusDetail | NORMAL, PERINGATAN |
| StatusPenanganan | TIDAK_DIPERLUKAN, BELUM_DITANGANI, DALAM_PENANGANAN, SELESAI |

### Contoh penggunaan

```java
StatusKendaraan.TERSEDIA
```

Penggunaan enum mencegah programmer menggunakan nilai status yang tidak didefinisikan dalam program.

---

# 9. PACKAGE REPOSITORY

Repository merupakan interface yang mendefinisikan operasi pengelolaan data.

Terdapat 10 file.

| File | Fungsi |
|---|---|
| CrudRepository.java | Operasi CRUD umum |
| PegawaiRepository.java | Akses data pegawai |
| UserRepository.java | Akses data akun |
| LokasiRepository.java | Akses data lokasi |
| MaterialRepository.java | Akses data material |
| KendaraanRepository.java | Akses data kendaraan |
| ParameterRepository.java | Akses data parameter |
| ProduksiRepository.java | Akses data produksi |
| PengangkutanRepository.java | Akses data pengangkutan |
| MonitoringRepository.java | Akses data monitoring |

## 9.1 CrudRepository.java

Bukti kode:

```java
public interface CrudRepository<T> {

    T save(T data);

    void update(T data);

    void delete(int id);

    Optional<T> findById(int id);

    List<T> findAll();
}
```

### Penjelasan

`save()` digunakan untuk menyimpan data.

`update()` digunakan untuk memperbarui data.

`delete()` digunakan untuk menghapus data.

`findById()` digunakan untuk mencari data berdasarkan ID.

`findAll()` digunakan untuk mengambil seluruh data.

Penggunaan generic `<T>` memungkinkan interface digunakan oleh berbagai jenis model.

---

# 10. PACKAGE DAO

DAO merupakan singkatan dari Data Access Object.

DAO bertugas menjalankan operasi database menggunakan JDBC.

Terdapat 10 file.

| File | Fungsi |
|---|---|
| JdbcSupport.java | Membantu operasi JDBC |
| PegawaiDAO.java | Akses database pegawai |
| UserDAO.java | Akses database pengguna |
| LokasiDAO.java | Akses database lokasi |
| MaterialDAO.java | Akses database material |
| KendaraanDAO.java | Akses database kendaraan |
| ParameterDAO.java | Akses database parameter |
| ProduksiDAO.java | Akses database produksi |
| PengangkutanDAO.java | Akses database pengangkutan |
| MonitoringDAO.java | Akses database monitoring |

### Perbedaan Repository dan DAO

Repository mendefinisikan operasi yang tersedia.

DAO mengimplementasikan operasi tersebut melalui query SQL.

Contoh alur:

```text
Service
   |
   v
Repository Interface
   |
   v
DAO Implementation
   |
   v
JDBC
   |
   v
MySQL
```

Pemisahan ini membuat Service tidak perlu mengetahui detail query SQL.

---

# 11. PACKAGE SERVICE

Service merupakan tempat penerapan aturan bisnis aplikasi.

Terdapat tujuh file.

## 11.1 AuthService.java

AuthService menangani autentikasi dan informasi pengguna yang sedang login.

Fungsi utamanya meliputi:

```text
login()
logout()
isLoggedIn()
getCurrentUser()
getCurrentPegawai()
isAdmin()
isPetugasOperasional()
isPetugasHSE()
isManager()
```

AuthService memeriksa username, password, dan jenis pegawai.

Jenis pegawai digunakan untuk menentukan hak akses aplikasi.

## 11.2 MasterDataService.java

MasterDataService mengelola data master perusahaan.

Data yang dikelola meliputi pegawai, akun, lokasi, material, kendaraan, dan parameter lingkungan.

Service ini juga menangani validasi data sebelum penyimpanan.

## 11.3 ProduksiService.java

ProduksiService menangani proses produksi tambang.

Fungsi utamanya:

```text
tambahProduksi()
ubahProduksi()
hapusProduksi()
cariProduksiById()
tampilkanSemuaProduksi()
tampilkanProduksiTersedia()
```

Service memeriksa kesesuaian petugas, lokasi, material, tanggal, dan jumlah produksi.

Ketika produksi baru dibuat, jumlah tersedia awal sama dengan jumlah produksi.

## 11.4 PengangkutanService.java

PengangkutanService menangani kegiatan pengangkutan material.

Fungsi utamanya:

```text
buatPengangkutan()
mulaiPengangkutan()
selesaikanPengangkutan()
batalkanPengangkutan()
hitungMaterialTersediaUntukDijadwalkan()
cariPengangkutanById()
tampilkanSemuaPengangkutan()
```

Service ini menjalankan aturan seperti:

- Petugas harus aktif.
- Driver harus memenuhi persyaratan penugasan.
- SIM driver harus masih berlaku.
- Kendaraan harus tersedia.
- Muatan tidak boleh melebihi kapasitas kendaraan.
- Material produksi harus mencukupi.
- Lokasi asal harus sesuai dengan lokasi produksi.
- Tujuan pengangkutan harus sesuai dengan jenis lokasi yang diperbolehkan.
- Penggunaan kendaraan dan driver tidak boleh menimbulkan bentrokan penugasan.

Service juga mengatur perubahan status pengangkutan.

## 11.5 MonitoringService.java

MonitoringService menangani kegiatan monitoring lingkungan.

Fungsi utamanya:

```text
buatMonitoring()
ubahMonitoring()
hapusMonitoring()
tambahDetail()
ubahDetail()
hapusDetail()
aturTindakLanjut()
mulaiPenanganan()
selesaikanPenanganan()
ubahStatusLokasi()
```

Service memeriksa petugas HSE dan sertifikasi.

Service juga menentukan status hasil pengukuran berdasarkan batas parameter.

## 11.6 DashboardService.java

DashboardService menyediakan informasi ringkasan untuk dashboard.

Data tersebut digunakan oleh dashboard Admin, Petugas Operasional, Petugas HSE, dan Manager.

## 11.7 LaporanService.java

LaporanService menyediakan informasi untuk laporan.

Laporan mencakup produksi, pengangkutan, monitoring, dan detail monitoring.

Data laporan dapat diolah berdasarkan periode.

---

# 12. PACKAGE CONTROLLER

Controller menjadi penghubung antara View dan Service.

Terdapat tujuh file.

| File | Fungsi |
|---|---|
| AuthController.java | Menghubungkan login dengan AuthService |
| MasterDataController.java | Menghubungkan pengelolaan master data dengan Service |
| ProduksiController.java | Menghubungkan halaman produksi dengan ProduksiService |
| PengangkutanController.java | Menghubungkan halaman pengangkutan dengan PengangkutanService |
| MonitoringController.java | Menghubungkan halaman monitoring dengan MonitoringService |
| DashboardController.java | Menghubungkan dashboard dengan DashboardService |
| LaporanController.java | Menghubungkan laporan dengan LaporanService |

Contoh alur:

```text
MonitoringFormFrame
        |
        v
MonitoringController
        |
        v
MonitoringService
        |
        v
MonitoringRepository
        |
        v
MonitoringDAO
        |
        v
MySQL
```

Controller menerima tindakan dari pengguna melalui View.

Kemudian Controller memanggil Service yang sesuai.

---

# 13. PACKAGE VIEW

Package view merupakan bagian yang menampilkan antarmuka aplikasi.

Terdapat 39 file Java.

## 13.1 Login dan Navigasi

| File | Fungsi |
|---|---|
| LoginFrame.java | Halaman login |
| MainFrameRouter.java | Menentukan halaman utama berdasarkan jenis pegawai |
| MainFrameAdmin.java | Halaman utama Admin |
| MainFrameOperasional.java | Halaman utama Petugas Operasional |
| MainFrameHSE.java | Halaman utama Petugas HSE |
| MainFrameManager.java | Halaman utama Manager |
| ViewFactory.java | Membuat panel sesuai menu |

### MainFrameRouter.java

File ini menentukan tampilan utama setelah login.

Contoh:

```java
if (auth.isAdmin())
    return new MainFrameAdmin();

if (auth.isPetugasOperasional())
    return new MainFrameOperasional();

if (auth.isPetugasHSE())
    return new MainFrameHSE();

if (auth.isManager())
    return new MainFrameManager();
```

Setiap pengguna diarahkan ke halaman sesuai tanggung jawabnya.

## 13.2 Dashboard

| File | Fungsi |
|---|---|
| DashboardAdminPanel.java | Dashboard Admin |
| DashboardOperasionalPanel.java | Dashboard Petugas Operasional |
| DashboardHSEPanel.java | Dashboard Petugas HSE |
| DashboardManagerPanel.java | Dashboard Manager |
| DashboardCharts.java | Membuat dan menampilkan grafik |

Dashboard digunakan untuk menampilkan informasi ringkasan.

DashboardCharts menggunakan JFreeChart untuk membuat grafik.

## 13.3 Master Data

| File | Fungsi |
|---|---|
| PegawaiPanel.java | Daftar pegawai |
| PegawaiFormFrame.java | Form pegawai |
| UserPanel.java | Daftar akun |
| UserFormFrame.java | Form akun |
| LokasiPanel.java | Daftar lokasi |
| LokasiFormFrame.java | Form lokasi |
| MaterialPanel.java | Daftar material |
| MaterialFormFrame.java | Form material |
| KendaraanPanel.java | Daftar kendaraan |
| KendaraanFormFrame.java | Form kendaraan |
| ParameterPanel.java | Daftar parameter |
| ParameterFormFrame.java | Form parameter |

Panel digunakan untuk menampilkan data dalam bentuk tabel.

FormFrame digunakan untuk memasukkan atau mengubah data.

## 13.4 Produksi dan Pengangkutan

| File | Fungsi |
|---|---|
| ProduksiPanel.java | Daftar produksi |
| ProduksiFormFrame.java | Form produksi |
| PengangkutanPanel.java | Daftar pengangkutan |
| PengangkutanFormFrame.java | Form pengangkutan |

## 13.5 Monitoring Lingkungan

| File | Fungsi |
|---|---|
| MonitoringPanel.java | Daftar monitoring |
| MonitoringFormFrame.java | Form monitoring |
| MonitoringDetailFrame.java | Detail monitoring dan penanganan |
| DetailMonitoringFormFrame.java | Form hasil pengukuran |

MonitoringFormFrame menggunakan komponen kalender untuk mempermudah pemilihan tanggal.

## 13.6 Laporan

| File | Fungsi |
|---|---|
| LaporanProduksiPanel.java | Laporan produksi |
| LaporanPengangkutanPanel.java | Laporan pengangkutan |
| LaporanMonitoringPanel.java | Laporan monitoring |

## 13.7 Komponen Pendukung

| File | Fungsi |
|---|---|
| DataScreen.java | Membantu menampilkan data ke JTable |
| FormUtil.java | Membantu membaca dan memvalidasi input |
| PilihanData.java | Membungkus ID dan nama data untuk ComboBox |
| Ui.java | Mengatur tampilan komponen |
| ViewFactory.java | Membuat panel berdasarkan navigasi |
| DashboardCharts.java | Membuat grafik dashboard |

---

# 14. PACKAGE UTIL

## 14.1 PasswordUtil.java

PasswordUtil digunakan untuk mengamankan password pengguna.

File ini menggunakan PBKDF2 dengan HMAC-SHA256.

Bukti kode:

```java
private static final int ITER = 210000;
```

Kode pembuatan hash:

```java
public static String hashPassword(String raw) {

    if (raw == null || raw.length() < 8)
        throw new ValidationException(
            "Password minimal 8 karakter."
        );

    byte[] salt = new byte[16];

    new SecureRandom().nextBytes(salt);

    return "pbkdf2_sha256$"
            + ITER
            + "$"
            + Base64.getEncoder()
                    .encodeToString(salt)
            + "$"
            + Base64.getEncoder()
                    .encodeToString(
                        derive(raw, salt, ITER)
                    );
}
```

### Penjelasan

Password tidak disimpan menggunakan teks asli ketika diproses melalui method ini.

`SecureRandom` menghasilkan salt acak.

Salt membantu membuat hasil hash berbeda meskipun dua pengguna memakai password yang sama.

PBKDF2 memproses password menggunakan iterasi berulang.

Hasilnya disimpan dalam format yang memuat algoritma, jumlah iterasi, salt, dan hasil hash.

### Verifikasi password

Method:

```java
verifyPassword()
```

digunakan untuk membandingkan password yang dimasukkan pengguna dengan hash yang tersimpan.

Dengan demikian, proses login tidak perlu mengetahui password asli yang disimpan sebelumnya.

## 14.2 BootstrapAdmin.java

BootstrapAdmin merupakan utilitas untuk membantu penyiapan akun administrator awal.

File ini digunakan sebagai bagian dari persiapan data aplikasi.

---

# 15. PACKAGE EXCEPTION

Package exception digunakan untuk menangani kondisi kesalahan tertentu.

| File | Fungsi |
|---|---|
| ValidationException.java | Kesalahan validasi input |
| DataNotFoundException.java | Data tidak ditemukan |
| BusinessException.java | Pelanggaran aturan bisnis |

Contohnya, ketika pengguna memasukkan jumlah muatan yang melebihi kapasitas kendaraan, Service dapat menghentikan proses dan memberikan pesan kesalahan.

Exception membantu memisahkan penanganan kesalahan dari proses utama aplikasi.

---

# 16. ARSITEKTUR APLIKASI

C-MOS menggunakan arsitektur berlapis.

Strukturnya:

```text
+-----------------------------+
|            VIEW             |
| JFrame, JPanel, JTable      |
+-----------------------------+
              |
              v
+-----------------------------+
|         CONTROLLER          |
| Menghubungkan View-Service  |
+-----------------------------+
              |
              v
+-----------------------------+
|           SERVICE           |
| Validasi dan aturan bisnis  |
+-----------------------------+
              |
              v
+-----------------------------+
|          REPOSITORY         |
| Interface akses data        |
+-----------------------------+
              |
              v
+-----------------------------+
|             DAO             |
| Implementasi JDBC dan SQL   |
+-----------------------------+
              |
              v
+-----------------------------+
|        MYSQL DATABASE       |
| Penyimpanan data            |
+-----------------------------+
```

Model digunakan di berbagai lapisan untuk merepresentasikan data.

Config menyiapkan dependency dan koneksi.

Util menyediakan fungsi pendukung.

Exception menangani kondisi kesalahan.

### Contoh proses tambah kendaraan

```text
Admin
  |
  v
KendaraanPanel
  |
  v
KendaraanFormFrame
  |
  v
MasterDataController
  |
  v
MasterDataService
  |
  v
KendaraanRepository
  |
  v
KendaraanDAO
  |
  v
MySQL
```

Setelah data tersimpan, halaman kendaraan dapat mengambil kembali daftar terbaru.

---

# 17. ALUR KERJA PROGRAM

## 17.1 Menjalankan Aplikasi

```text
START
  |
  v
Main.java
  |
  v
AppConfig.initialize()
  |
  v
Koneksi Database
  |
  v
LoginFrame
```

Aplikasi dimulai melalui Main.java.

Kemudian, komponen aplikasi disiapkan.

Setelah itu, halaman login ditampilkan.

## 17.2 Login

```text
LoginFrame
    |
    v
Input Username dan Password
    |
    v
AuthController
    |
    v
AuthService
    |
    v
UserRepository
    |
    v
UserDAO
    |
    v
Database
    |
    v
Verifikasi Password
    |
    v
Pemeriksaan Jenis Pegawai
    |
    v
MainFrameRouter
```

Setelah login berhasil, pengguna diarahkan ke halaman sesuai jenis pegawainya.

## 17.3 Pengelolaan Produksi

Petugas Operasional memilih menu Produksi.

Kemudian, petugas mengisi lokasi, material, tanggal, dan jumlah produksi.

Contoh:

```text
Lokasi          : PIT Kobalt Utara A
Material        : Bijih Kobalt
Jumlah Produksi : 150 ton
Jumlah Tersedia : 150 ton
Status          : TERSEDIA
```

Setelah data tersimpan, produksi dapat digunakan dalam pengangkutan.

## 17.4 Pengangkutan Material

Pengangkutan menghubungkan produksi, kendaraan, driver, dan lokasi.

Contoh:

```text
Produksi        : Produksi 001
Jumlah Tersedia : 150 ton

Kendaraan       : Dump Truck Hino
Kapasitas       : 20 ton

Driver          : Agus Setiawan
Jumlah Muatan   : 20 ton

Lokasi Asal     : PIT Kobalt Utara A
Lokasi Tujuan   : STOCKPILE Sentral
```

Sistem memeriksa seluruh data yang diperlukan.

Setelah pengangkutan dibuat, status awalnya adalah DIJADWALKAN.

Ketika pengangkutan dimulai, status berubah menjadi DALAM_PERJALANAN.

Setelah pengangkutan selesai, status menjadi SELESAI.

Jumlah material tersedia kemudian disesuaikan dengan material yang telah diangkut.

Contoh:

```text
Sebelum pengangkutan:
150 ton

Jumlah diangkut:
20 ton

Setelah selesai:
130 ton
```

## 17.5 Monitoring Lingkungan

Petugas HSE memilih lokasi dan tanggal monitoring.

Setelah itu, petugas mencatat hasil pengukuran.

Contoh:

```text
Lokasi    : PIT Kobalt Selatan A
Tanggal   : 04/11/2026

Parameter : pH Air
Nilai     : 5.4
```

Jika batas minimum parameter adalah 6, nilai tersebut menghasilkan status PERINGATAN.

Petugas dapat mencatat tindak lanjut dan status penanganan.

Hasil monitoring kemudian dapat dilihat pada dashboard dan laporan.

## 17.6 Dashboard Manager

Manager melakukan login dan membuka dashboard.

Dashboard mengambil informasi dari Service.

Data tersebut kemudian ditampilkan melalui ringkasan, tabel, dan grafik.

Manager dapat menggunakan informasi tersebut untuk mengevaluasi kegiatan operasional.

---

# 18. PENERAPAN EMPAT PILAR OBJECT-ORIENTED PROGRAMMING

C-MOS menerapkan empat pilar OOP:

1. Encapsulation.
2. Inheritance.
3. Polymorphism.
4. Abstraction.

Pembahasan berikut menunjukkan lokasi penerapan dan bukti kode.

---

# 19. ENCAPSULATION

## 19.1 Pengertian

Encapsulation merupakan konsep membatasi akses langsung terhadap atribut objek.

Atribut disimpan dalam class dan diakses melalui method yang disediakan.

Tujuannya agar pengelolaan data objek lebih terkontrol.

## 19.2 Bukti Penerapan

Lokasi:

```text
model/Pegawai.java
```

Kode:

```java
public abstract class Pegawai {

    private int idPegawai;

    private String namaPegawai;

    private String noHp;

    public int getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(int value) {
        this.idPegawai = value;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String value) {
        this.namaPegawai = value;
    }
}
```

## 19.3 Penjelasan

Atribut `idPegawai` dan `namaPegawai` menggunakan access modifier `private`.

Artinya, atribut tersebut tidak dapat diakses secara langsung dari luar class.

Untuk membaca data, digunakan getter.

```java
pegawai.getNamaPegawai();
```

Untuk mengubah data, digunakan setter.

```java
pegawai.setNamaPegawai("Budi Santoso");
```

Penggunaan getter dan setter merupakan bentuk penerapan encapsulation.

## 19.4 Penerapan pada Class Lain

Encapsulation juga diterapkan pada:

- Admin
- PetugasOperasional
- PetugasHSE
- Manager
- Driver
- User
- Lokasi
- JenisMaterial
- Kendaraan
- ProduksiTambang
- Pengangkutan
- ParameterLingkungan
- MonitoringLingkungan
- DetailMonitoring

## 19.5 Kesimpulan

Encapsulation telah diterapkan melalui penggunaan atribut private dan method getter/setter.

Validasi bisnis tambahan dilakukan melalui Service agar perubahan data mengikuti aturan aplikasi.

---

# 20. INHERITANCE

## 20.1 Pengertian

Inheritance merupakan konsep pewarisan atribut dan method dari superclass kepada subclass.

Tujuannya untuk menggunakan kembali karakteristik yang sama tanpa mendefinisikannya berulang kali.

## 20.2 Bukti Penerapan

Lokasi:

```text
model/Pegawai.java
```

Superclass:

```java
public abstract class Pegawai {

    private int idPegawai;

    private String namaPegawai;

    private String noHp;

    private LocalDate tanggalMasuk;

    private StatusPegawai statusPegawai;
}
```

Subclass:

```java
public class Admin extends Pegawai {
}
```

```java
public class PetugasOperasional extends Pegawai {
}
```

```java
public class PetugasHSE extends Pegawai {
}
```

```java
public class Manager extends Pegawai {
}
```

```java
public class Driver extends Pegawai {
}
```

## 20.3 Diagram Inheritance

```text
                    PEGAWAI
                 Abstract Class
                       |
        +--------------+--------------+
        |              |              |
        v              v              v
      ADMIN      PETUGAS OPERASIONAL  PETUGAS HSE
       
        
        +-----------------------------+
        |                             |
        v                             v
      MANAGER                       DRIVER

Semua subclass di atas merupakan
turunan langsung dari Pegawai.
```

## 20.4 Penjelasan

Seluruh pegawai memiliki atribut umum seperti nama, nomor telepon, tanggal masuk, dan status pegawai.

Atribut tersebut didefinisikan pada Pegawai.

Setiap subclass kemudian menambahkan atribut khusus.

Contohnya:

Admin memiliki kode admin.

PetugasOperasional memiliki shift kerja.

PetugasHSE memiliki sertifikasi.

Manager memiliki divisi tanggung jawab.

Driver memiliki informasi SIM.

Dengan demikian, kode menjadi lebih terstruktur dan mengurangi pengulangan atribut.

## 20.5 Kesimpulan

Inheritance telah terpenuhi melalui hubungan Pegawai dengan lima subclass.

---

# 21. POLYMORPHISM

Polymorphism merupakan konsep yang memungkinkan method memiliki perilaku berbeda berdasarkan objek atau parameter yang digunakan.

Dalam proyek ini, polymorphism dibuktikan melalui overriding dan overloading.

## 21.1 Method Overriding

Overriding terjadi ketika subclass menyediakan implementasi sendiri terhadap method dari superclass.

### Bukti pada Pegawai.java

```java
public abstract String getJenisPegawai();
```

### Bukti pada Admin.java

```java
@Override
public String getJenisPegawai() {
    return "ADMIN";
}
```

### Bukti pada Driver.java

```java
@Override
public String getJenisPegawai() {
    return "DRIVER";
}
```

### Penjelasan

Method `getJenisPegawai()` didefinisikan pada superclass Pegawai.

Namun, setiap subclass memiliki hasil yang berbeda.

Admin mengembalikan `ADMIN`.

Driver mengembalikan `DRIVER`.

Subclass lain juga menyediakan implementasi sesuai jenis pegawainya.

### Contoh konsep polymorphism

```java
Pegawai pegawai = objekAdmin;

System.out.println(
    pegawai.getJenisPegawai()
);
```

Output:

```text
ADMIN
```

Walaupun variabel bertipe Pegawai, method yang dijalankan mengikuti objek sebenarnya.

Contoh pemanggilan di atas merupakan ilustrasi untuk menjelaskan perilaku method yang tersedia pada source code.

### Kesimpulan Overriding

Overriding telah diterapkan melalui implementasi method `getJenisPegawai()` pada subclass Pegawai.

---

## 21.2 Method Overloading

Overloading terjadi ketika beberapa method memiliki nama sama, tetapi daftar parameternya berbeda.

### Bukti Pertama: ProduksiService.java

Lokasi:

```text
service/ProduksiService.java
```

Method pertama:

```java
public ProduksiTambang tambahProduksi(
        int idProduksi,
        int idMaterial,
        int idLokasi,
        PetugasOperasional petugas,
        LocalDate tanggal,
        double jumlah) {
    
    // Implementasi penyimpanan produksi
}
```

Method kedua:

```java
public ProduksiTambang tambahProduksi(
        int idMaterial,
        int idLokasi,
        PetugasOperasional p,
        LocalDate t,
        double j) {

    return tambahProduksi(
        0,
        idMaterial,
        idLokasi,
        p,
        t,
        j
    );
}
```

### Penjelasan

Kedua method memiliki nama sama, yaitu `tambahProduksi()`.

Namun, method pertama menerima enam parameter.

Method kedua menerima lima parameter.

Java dapat menentukan method yang digunakan berdasarkan jumlah dan tipe argumen.

Method kedua juga memanfaatkan method pertama sehingga proses penyimpanan tidak perlu ditulis ulang.

### Bukti Kedua: MonitoringService.java

Lokasi:

```text
service/MonitoringService.java
```

Method pertama:

```java
public MonitoringLingkungan buatMonitoring(
        int id,
        int lokasiId,
        PetugasHSE h,
        LocalDateTime t,
        String catatan) {

    // Implementasi pembuatan monitoring
}
```

Method kedua:

```java
public MonitoringLingkungan buatMonitoring(
        int lokasiId,
        PetugasHSE h,
        LocalDateTime t,
        String catatan) {

    return buatMonitoring(
        0,
        lokasiId,
        h,
        t,
        catatan
    );
}
```

### Penjelasan

Kedua method memiliki nama `buatMonitoring()`.

Perbedaannya terdapat pada parameter ID.

Method kedua digunakan ketika ID baru tidak perlu diberikan secara langsung.

### Penerapan Overloading Lainnya

Overloading juga ditemukan pada:

```text
PengangkutanService.java
```

Method:

```java
buatPengangkutan()
```

Dan:

```text
MonitoringService.java
```

Method:

```java
tambahDetail()
```

Keduanya memiliki beberapa versi parameter.

## 21.3 Kesimpulan Polymorphism

Polymorphism telah memenuhi kedua ketentuan.

Overriding diterapkan melalui method `getJenisPegawai()`.

Overloading diterapkan melalui method pada Service yang memiliki nama sama dengan parameter berbeda.

---

# 22. ABSTRACTION

## 22.1 Pengertian

Abstraction merupakan konsep menyajikan karakteristik dan perilaku utama objek tanpa mengharuskan pengguna class mengetahui seluruh detail implementasinya.

Dalam proyek C-MOS, abstraction diterapkan melalui abstract class dan abstract method.

## 22.2 Abstract Class

Lokasi:

```text
model/Pegawai.java
```

Bukti:

```java
public abstract class Pegawai {
}
```

### Penjelasan

Pegawai merupakan abstract class.

Artinya, Pegawai tidak dapat dibuat menjadi objek secara langsung.

Objek pegawai harus dibuat melalui subclass seperti Admin, PetugasOperasional, PetugasHSE, Manager, atau Driver.

Konsep ini sesuai dengan kebutuhan C-MOS karena setiap pegawai harus memiliki jenis pekerjaan yang jelas.

## 22.3 Abstract Method

Bukti:

```java
public abstract String getJenisPegawai();
```

### Penjelasan

Method tersebut tidak memiliki implementasi pada Pegawai.

Pegawai hanya menentukan bahwa setiap subclass harus menyediakan perilaku untuk mengembalikan jenis pegawai.

Implementasinya diberikan oleh masing-masing subclass.

Contoh:

```java
@Override
public String getJenisPegawai() {
    return "ADMIN";
}
```

## 22.4 Abstraction melalui Interface

Selain abstract class, proyek juga menggunakan interface.

Contohnya:

```java
public interface CrudRepository<T> {

    T save(T data);

    void update(T data);

    void delete(int id);

    Optional<T> findById(int id);

    List<T> findAll();
}
```

Interface tersebut menentukan operasi yang harus tersedia tanpa menjelaskan detail penyimpanan data.

Implementasinya dilakukan oleh DAO.

## 22.5 Kesimpulan Abstraction

Abstraction telah memenuhi ketentuan melalui:

1. Abstract class Pegawai.
2. Abstract method getJenisPegawai().
3. Interface Repository sebagai abstraksi akses data.

---

# 23. HUBUNGAN ANTAROBJEK DAN DATABASE

C-MOS menggunakan database relasional yang terdiri dari 15 tabel.

Tabel tersebut dikelompokkan menjadi beberapa bagian.

## 23.1 Kepegawaian

```text
pegawai
admin
petugas_operasional
petugas_hse
manager
driver
user
```

Pegawai menjadi data utama.

Tabel subtype menyimpan atribut khusus setiap jenis pegawai.

User menyimpan akun yang terhubung dengan pegawai.

## 23.2 Data Master

```text
lokasi
jenis_material
kendaraan
parameter_lingkungan
```

Data master digunakan oleh kegiatan operasional.

## 23.3 Produksi dan Pengangkutan

```text
produksi_tambang
pengangkutan
```

Satu produksi dapat memiliki beberapa pengangkutan.

Pengangkutan juga terhubung dengan kendaraan, driver, petugas, serta lokasi.

## 23.4 Monitoring Lingkungan

```text
monitoring_lingkungan
detail_monitoring
```

Satu monitoring dapat memiliki beberapa detail hasil pengukuran.

---

# 24. VALIDASI DAN ATURAN BISNIS

Validasi digunakan untuk memastikan data yang dimasukkan sesuai kebutuhan sistem.

## 24.1 Validasi Produksi

Produksi harus memiliki lokasi, material, petugas, tanggal, dan jumlah yang valid.

Jumlah produksi harus lebih besar dari nol.

## 24.2 Validasi Pengangkutan

Pengangkutan harus memenuhi beberapa aturan.

Jumlah muatan tidak boleh melebihi kapasitas kendaraan.

Jumlah muatan tidak boleh melebihi material yang tersedia untuk dijadwalkan.

Driver harus memenuhi persyaratan penugasan.

Kendaraan harus memenuhi persyaratan ketersediaan.

## 24.3 Validasi Monitoring

Petugas HSE harus aktif dan memiliki sertifikasi yang masih berlaku.

Nilai pengukuran dibandingkan dengan batas parameter.

Jika berada di luar batas, status detail menjadi PERINGATAN.

### Bukti kode

Lokasi:

```text
service/MonitoringService.java
```

```java
private StatusDetail status(
        ParameterLingkungan p,
        double v) {

    if (!Double.isFinite(v)
            || Math.abs(
                v * 100 - Math.rint(v * 100)
            ) > 0.00001) {

        throw new ValidationException(
            "Pengukuran harus angka dengan maksimal 2 desimal."
        );
    }

    return p.getBatasMinimum() != null
            && v < p.getBatasMinimum()
            || p.getBatasMaksimum() != null
            && v > p.getBatasMaksimum()
            ? StatusDetail.PERINGATAN
            : StatusDetail.NORMAL;
}
```

Method tersebut menentukan status berdasarkan nilai pengukuran.

---

# 25. TRANSAKSI DATABASE

C-MOS menggunakan transaksi JDBC untuk menangani perubahan data yang saling berkaitan.

Contoh penerapannya terdapat pada proses pengangkutan.

Bukti penggunaan:

```java
c.setAutoCommit(false);
```

Perintah tersebut memulai pengelolaan transaksi secara manual.

Jika proses berhasil:

```java
c.commit();
```

Jika terjadi kesalahan:

```java
c.rollback();
```

### Tujuan

Transaksi digunakan untuk menjaga konsistensi perubahan data.

Sebagai contoh, penyelesaian pengangkutan berkaitan dengan perubahan status dan jumlah material tersedia.

Perubahan tersebut harus dikelola agar database tidak menyimpan kondisi yang saling bertentangan.

---

# 26. KEAMANAN APLIKASI

Keamanan C-MOS diterapkan melalui beberapa mekanisme.

## 26.1 Login

Pengguna harus memasukkan username dan password.

## 26.2 Hak Akses

Akses ditentukan berdasarkan jenis pegawai.

Admin mengelola data master.

Petugas Operasional mengelola produksi dan pengangkutan.

Petugas HSE mengelola monitoring.

Manager mengakses dashboard dan laporan.

Driver tidak memiliki akun login.

## 26.3 Password Hashing

PasswordUtil menggunakan PBKDF2 dengan HMAC-SHA256.

Password yang diproses melalui utilitas ini disimpan dalam bentuk hash.

## 26.4 Validasi Data

Service memeriksa data sebelum operasi dilakukan.

## 26.5 Exception Handling

Exception digunakan untuk memberikan informasi ketika terjadi kesalahan validasi, data tidak ditemukan, atau pelanggaran aturan bisnis.

---

# 27. CONTOH SKENARIO PENGGUNAAN

## Skenario 1: Admin Menambahkan Kendaraan

1. Admin login.
2. Admin membuka menu Kendaraan.
3. Sistem menampilkan daftar kendaraan.
4. Admin memilih Tambah Data.
5. Admin mengisi informasi kendaraan.
6. Sistem memvalidasi data.
7. Data disimpan ke database.
8. Tabel kendaraan diperbarui.

## Skenario 2: Petugas Operasional Mencatat Produksi

1. Petugas login.
2. Membuka menu Produksi.
3. Memilih lokasi PIT.
4. Memilih jenis material.
5. Mengisi tanggal dan jumlah produksi.
6. Menyimpan data.
7. Sistem mencatat jumlah material tersedia.

## Skenario 3: Petugas Operasional Membuat Pengangkutan

1. Petugas membuka menu Pengangkutan.
2. Memilih data produksi.
3. Memilih kendaraan.
4. Memilih driver.
5. Memilih tujuan.
6. Mengisi jumlah muatan.
7. Sistem menjalankan validasi.
8. Pengangkutan dicatat.
9. Petugas dapat memulai dan menyelesaikan pengangkutan.
10. Sistem memperbarui data terkait sesuai aturan bisnis.

## Skenario 4: Petugas HSE Melakukan Monitoring

1. Petugas HSE login.
2. Membuka menu Monitoring.
3. Memilih lokasi.
4. Memilih tanggal melalui kalender.
5. Menyimpan monitoring.
6. Membuka detail monitoring.
7. Memilih parameter lingkungan.
8. Mengisi hasil pengukuran.
9. Sistem menentukan status hasil pengukuran.
10. Petugas mencatat tindak lanjut jika diperlukan.

## Skenario 5: Manager Melihat Dashboard

1. Manager login.
2. Sistem menampilkan halaman Manager.
3. Manager membuka dashboard.
4. Sistem mengambil data operasional.
5. Data ditampilkan dalam bentuk ringkasan dan grafik.
6. Manager membuka laporan sesuai kebutuhan.

---

# 28. HASIL PENERAPAN OOP

| Pilar OOP | Lokasi | Bukti |
|---|---|---|
| Encapsulation | Pegawai.java dan model lainnya | private, getter, setter |
| Inheritance | Admin.java, Driver.java, dan subclass Pegawai lainnya | extends Pegawai |
| Polymorphism: Overriding | Pegawai.java dan subclass | @Override getJenisPegawai() |
| Polymorphism: Overloading | ProduksiService.java, MonitoringService.java, PengangkutanService.java | Method bernama sama dengan parameter berbeda |
| Abstraction: Abstract Class | Pegawai.java | abstract class Pegawai |
| Abstraction: Abstract Method | Pegawai.java | abstract String getJenisPegawai() |
| Abstraction: Interface | CrudRepository.java | interface CrudRepository<T> |

Berdasarkan pemeriksaan source code, seluruh unsur OOP yang diwajibkan telah memiliki bukti penerapan.

---

# 29. PENGUJIAN YANG DIPERLUKAN

Untuk memastikan aplikasi berjalan sesuai rancangan, pengujian perlu mencakup beberapa skenario.

## 29.1 Login

Memastikan pengguna dapat login sesuai akun dan jenis pegawai.

## 29.2 CRUD Master Data

Memastikan proses tambah, tampil, ubah, dan hapus berjalan sesuai aturan.

## 29.3 Produksi

Memastikan jumlah produksi dan persediaan tercatat dengan benar.

## 29.4 Pengangkutan

Memastikan kapasitas kendaraan, ketersediaan material, penugasan driver, dan perubahan status berjalan sesuai ketentuan.

## 29.5 Monitoring

Memastikan hasil pengukuran menghasilkan status yang sesuai dengan batas parameter.

## 29.6 Dashboard

Memastikan data grafik sesuai dengan informasi database.

## 29.7 Laporan

Memastikan laporan menampilkan data sesuai periode dan jenis laporan.

## 29.8 Transaksi Database

Memastikan perubahan data yang saling berkaitan tetap konsisten ketika proses berhasil maupun gagal.

---

# 30. KESIMPULAN

C-MOS merupakan aplikasi desktop yang dikembangkan untuk mengintegrasikan pengelolaan kegiatan operasional perusahaan pertambangan Cobalt.

Sistem mencakup pengelolaan pegawai, akun pengguna, lokasi, material, kendaraan, produksi tambang, pengangkutan, monitoring lingkungan, dashboard, dan laporan.

Dari sisi pengembangan perangkat lunak, C-MOS menerapkan arsitektur berlapis menggunakan Model, View, Controller, Service, Repository, dan DAO.

Pemisahan tersebut membantu mengatur tanggung jawab setiap bagian aplikasi.

Dari sisi Object-Oriented Programming, proyek telah menerapkan empat pilar utama.

Encapsulation diterapkan melalui atribut private dan getter/setter.

Inheritance diterapkan melalui superclass Pegawai dan lima subclass.

Polymorphism diterapkan melalui method overriding dan overloading.

Abstraction diterapkan melalui abstract class, abstract method, dan interface.

Aplikasi juga memanfaatkan berbagai library untuk mendukung kebutuhan sistem.

Java Swing digunakan untuk membangun antarmuka desktop.

MySQL Connector/J digunakan untuk komunikasi database.

JCalendar digunakan untuk pemilihan tanggal melalui kalender.

JFreeChart digunakan untuk membuat grafik dashboard.

Maven digunakan untuk mengelola dependency dan konfigurasi proyek.

Dengan struktur tersebut, C-MOS telah memiliki fondasi aplikasi yang sesuai untuk mendemonstrasikan penerapan Pemrograman Berorientasi Objek dan Sistem Basis Data dalam sebuah studi kasus pertambangan.

Keberhasilan seluruh fitur secara operasional tetap perlu dibuktikan melalui pengujian aplikasi dan database secara langsung.
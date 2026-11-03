-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 02, 2026 at 12:21 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cmos_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_pegawai` int(11) NOT NULL,
  `kode_admin` varchar(20) NOT NULL,
  `tanggal_mulai_akses` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_pegawai`, `kode_admin`, `tanggal_mulai_akses`) VALUES
(1, 'ADM001', '2022-01-10'),
(2, 'ADM002', '2022-03-15'),
(3, 'ADM003', '2023-02-01'),
(4, 'ADM004', '2023-04-10');

-- --------------------------------------------------------

--
-- Table structure for table `detail_monitoring`
--

CREATE TABLE `detail_monitoring` (
  `id_detail` int(11) NOT NULL,
  `nilai_pengukuran` decimal(12,2) NOT NULL,
  `status_detail` varchar(20) NOT NULL,
  `catatan` varchar(255) DEFAULT NULL,
  `monitoring_lingkungan_id_monitoring` int(11) NOT NULL,
  `parameter_lingkungan_id_parameter` int(11) NOT NULL
) ;

--
-- Dumping data for table `detail_monitoring`
--

INSERT INTO `detail_monitoring` (`id_detail`, `nilai_pengukuran`, `status_detail`, `catatan`, `monitoring_lingkungan_id_monitoring`, `parameter_lingkungan_id_parameter`) VALUES
(1, 7.20, 'NORMAL', 'Hasil sesuai batas', 1, 1),
(2, 85.00, 'NORMAL', 'Hasil sesuai batas', 1, 2),
(3, 45.00, 'NORMAL', 'Hasil sesuai batas', 1, 3),
(4, 7.50, 'NORMAL', 'Hasil sesuai batas', 2, 1),
(5, 72.00, 'NORMAL', 'Hasil sesuai batas', 2, 4),
(6, 0.30, 'NORMAL', 'Hasil sesuai batas', 2, 5),
(7, 5.40, 'PERINGATAN', 'Nilai pengukuran di luar batas', 3, 1),
(8, 120.00, 'NORMAL', 'Hasil sesuai batas', 3, 2),
(9, 0.30, 'NORMAL', 'Hasil sesuai batas', 3, 5),
(10, 7.00, 'NORMAL', 'Hasil sesuai batas', 4, 1),
(11, 55.00, 'NORMAL', 'Hasil sesuai batas', 4, 3),
(12, 76.00, 'NORMAL', 'Hasil sesuai batas', 4, 4),
(13, 7.10, 'NORMAL', 'Hasil sesuai batas', 5, 1),
(14, 95.00, 'PERINGATAN', 'Nilai pengukuran di luar batas', 5, 3),
(15, 80.00, 'NORMAL', 'Hasil sesuai batas', 5, 4),
(16, 7.30, 'NORMAL', 'Hasil sesuai batas', 6, 1),
(17, 90.00, 'NORMAL', 'Hasil sesuai batas', 6, 2),
(18, 0.20, 'NORMAL', 'Hasil sesuai batas', 6, 5),
(19, 7.40, 'NORMAL', 'Hasil sesuai batas', 7, 1),
(20, 60.00, 'NORMAL', 'Hasil sesuai batas', 7, 3),
(21, 92.00, 'PERINGATAN', 'Nilai pengukuran di luar batas', 7, 4),
(22, 7.20, 'NORMAL', 'Hasil sesuai batas', 8, 1),
(23, 50.00, 'NORMAL', 'Hasil sesuai batas', 8, 3),
(24, 75.00, 'NORMAL', 'Hasil sesuai batas', 8, 4),
(25, 7.00, 'NORMAL', 'Hasil sesuai batas', 9, 1),
(26, 100.00, 'NORMAL', 'Hasil sesuai batas', 9, 2),
(27, 0.25, 'NORMAL', 'Hasil sesuai batas', 9, 5),
(28, 7.10, 'NORMAL', 'Hasil sesuai batas', 10, 1),
(29, 245.00, 'PERINGATAN', 'Nilai pengukuran di luar batas', 10, 2),
(30, 0.30, 'NORMAL', 'Hasil sesuai batas', 10, 5),
(31, 7.30, 'NORMAL', 'Hasil sesuai batas', 11, 1),
(32, 95.00, 'NORMAL', 'Hasil sesuai batas', 11, 2),
(33, 48.00, 'NORMAL', 'Hasil sesuai batas', 11, 3),
(34, 7.20, 'NORMAL', 'Hasil sesuai batas', 12, 1),
(35, 130.00, 'NORMAL', 'Hasil sesuai batas', 12, 2),
(36, 0.75, 'PERINGATAN', 'Nilai pengukuran di luar batas', 12, 5),
(37, 7.40, 'NORMAL', 'Hasil sesuai batas', 13, 1),
(38, 52.00, 'NORMAL', 'Hasil sesuai batas', 13, 3),
(39, 74.00, 'NORMAL', 'Hasil sesuai batas', 13, 4),
(40, 7.10, 'NORMAL', 'Hasil sesuai batas', 14, 1),
(41, 105.00, 'NORMAL', 'Hasil sesuai batas', 14, 2),
(42, 0.28, 'NORMAL', 'Hasil sesuai batas', 14, 5),
(43, 7.00, 'NORMAL', 'Hasil sesuai batas', 15, 1),
(44, 230.00, 'PERINGATAN', 'Nilai pengukuran di luar batas', 15, 2),
(45, 0.35, 'NORMAL', 'Hasil sesuai batas', 15, 5);

-- --------------------------------------------------------

--
-- Table structure for table `driver`
--

CREATE TABLE `driver` (
  `id_pegawai` int(11) NOT NULL,
  `no_sim` varchar(50) NOT NULL,
  `masa_berlaku_sim` date NOT NULL,
  `status_driver` varchar(10) NOT NULL DEFAULT 'TERSEDIA'
) ;

--
-- Dumping data for table `driver`
--

INSERT INTO `driver` (`id_pegawai`, `no_sim`, `masa_berlaku_sim`, `status_driver`) VALUES
(14, 'SIMBII-KT-001', '2028-06-10', 'TERSEDIA'),
(15, 'SIMBII-KT-002', '2028-05-19', 'TERSEDIA'),
(16, 'SIMBII-KT-003', '2029-08-25', 'TERSEDIA'),
(17, 'SIMBII-KT-004', '2028-04-12', 'TERSEDIA'),
(18, 'SIMBII-KT-005', '2029-07-20', 'TERSEDIA'),
(19, 'SIMBII-KT-006', '2029-02-10', 'TERSEDIA'),
(20, 'SIMBII-KT-007', '2029-05-15', 'TERSEDIA');

-- --------------------------------------------------------

--
-- Table structure for table `jenis_material`
--

CREATE TABLE `jenis_material` (
  `id_material` int(11) NOT NULL,
  `nama_material` varchar(100) NOT NULL,
  `satuan` varchar(20) NOT NULL,
  `deskripsi` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `jenis_material`
--

INSERT INTO `jenis_material` (`id_material`, `nama_material`, `satuan`, `deskripsi`) VALUES
(1, 'Bijih Kobalt Kadar Tinggi', 'Ton', 'Bijih kobalt dengan klasifikasi kadar tinggi'),
(2, 'Bijih Kobalt Kadar Sedang', 'Ton', 'Bijih kobalt dengan klasifikasi kadar sedang'),
(3, 'Bijih Kobalt Kadar Rendah', 'Ton', 'Bijih kobalt dengan klasifikasi kadar rendah'),
(4, 'Bijih Nikel-Kobalt', 'Ton', 'Bijih yang mengandung nikel dan kobalt'),
(5, 'Bijih Limonit Kadar Tinggi', 'Ton', 'Bijih laterit lapisan limonit berkadar tinggi'),
(6, 'Bijih Limonit Kadar Sedang', 'Ton', 'Bijih laterit lapisan limonit berkadar sedang'),
(7, 'Bijih Limonit Kadar Rendah', 'Ton', 'Bijih laterit lapisan limonit berkadar rendah'),
(8, 'Bijih Saprolit Kadar Tinggi', 'Ton', 'Bijih laterit lapisan saprolit berkadar tinggi'),
(9, 'Bijih Saprolit Kadar Sedang', 'Ton', 'Bijih laterit lapisan saprolit berkadar sedang'),
(10, 'Bijih Saprolit Kadar Rendah', 'Ton', 'Bijih laterit lapisan saprolit berkadar rendah'),
(11, 'Tanah Penutup', 'Ton', 'Tanah hasil pengupasan lapisan permukaan'),
(12, 'Batuan Penutup', 'Ton', 'Batuan yang menutupi lapisan bijih'),
(13, 'Waste Rock', 'Ton', 'Batuan sisa yang tidak dimanfaatkan sebagai bijih'),
(14, 'Bijih Kobalt Hasil Blending', 'Ton', 'Bijih kobalt hasil pencampuran beberapa kelompok kadar'),
(15, 'Bijih Nikel-Kobalt Hasil Blending', 'Ton', 'Bijih nikel-kobalt hasil pencampuran material');

-- --------------------------------------------------------

--
-- Table structure for table `kendaraan`
--

CREATE TABLE `kendaraan` (
  `id_kendaraan` int(11) NOT NULL,
  `jenis_kendaraan` varchar(50) NOT NULL,
  `nomor_polisi` varchar(20) NOT NULL,
  `kapasitas` decimal(10,2) NOT NULL,
  `tahun_kendaraan` smallint(5) UNSIGNED NOT NULL,
  `status_kendaraan` varchar(10) NOT NULL DEFAULT 'TERSEDIA'
) ;

--
-- Dumping data for table `kendaraan`
--

INSERT INTO `kendaraan` (`id_kendaraan`, `jenis_kendaraan`, `nomor_polisi`, `kapasitas`, `tahun_kendaraan`, `status_kendaraan`) VALUES
(1, 'Dump Truck Hino 500', 'KT 8101 CM', 20.00, 2022, 'TERSEDIA'),
(2, 'Dump Truck Hino 500', 'KT 8102 CM', 20.00, 2022, 'TERSEDIA'),
(3, 'Dump Truck Hino 700', 'KT 8103 CM', 30.00, 2023, 'TERSEDIA'),
(4, 'Dump Truck Hino 700', 'KT 8104 CM', 30.00, 2023, 'TERSEDIA'),
(5, 'Dump Truck Mitsubishi Fuso', 'KT 8105 CM', 20.00, 2021, 'TERSEDIA'),
(6, 'Dump Truck Mitsubishi Fuso', 'KT 8106 CM', 20.00, 2021, 'TERSEDIA'),
(7, 'Dump Truck Volvo FMX', 'KT 8107 CM', 35.00, 2024, 'TERSEDIA'),
(8, 'Dump Truck Volvo FMX', 'KT 8108 CM', 35.00, 2024, 'TERSEDIA'),
(9, 'Dump Truck Scania P410', 'KT 8109 CM', 30.00, 2023, 'TERSEDIA'),
(10, 'Dump Truck Scania P410', 'KT 8110 CM', 30.00, 2023, 'TERSEDIA'),
(11, 'Dump Truck Mercedes Arocs', 'KT 8111 CM', 25.00, 2022, 'TERSEDIA'),
(12, 'Dump Truck Mercedes Arocs', 'KT 8112 CM', 25.00, 2022, 'TERSEDIA'),
(13, 'Dump Truck UD Quester', 'KT 8113 CM', 25.00, 2023, 'TERSEDIA'),
(14, 'Dump Truck UD Quester', 'KT 8114 CM', 25.00, 2023, 'TERSEDIA'),
(15, 'Dump Truck Hino 500', 'KT 8115 CM', 20.00, 2020, 'NONAKTIF');

-- --------------------------------------------------------

--
-- Table structure for table `lokasi`
--

CREATE TABLE `lokasi` (
  `id_lokasi` int(11) NOT NULL,
  `nama_lokasi` varchar(100) NOT NULL,
  `jenis_lokasi` varchar(20) NOT NULL,
  `status_operasional` varchar(20) NOT NULL DEFAULT 'AKTIF',
  `keterangan` varchar(255) DEFAULT NULL
) ;

--
-- Dumping data for table `lokasi`
--

INSERT INTO `lokasi` (`id_lokasi`, `nama_lokasi`, `jenis_lokasi`, `status_operasional`, `keterangan`) VALUES
(1, 'PIT Kobalt Utara A', 'PIT', 'AKTIF', 'Area penambangan Kobalt Utara A'),
(2, 'PIT Kobalt Utara B', 'PIT', 'AKTIF', 'Area penambangan Kobalt Utara B'),
(3, 'PIT Kobalt Selatan A', 'PIT', 'AKTIF', 'Area penambangan Kobalt Selatan A'),
(4, 'PIT Kobalt Selatan B', 'PIT', 'AKTIF', 'Area penambangan Kobalt Selatan B'),
(5, 'PIT Kobalt Timur A', 'PIT', 'AKTIF', 'Area penambangan Kobalt Timur A'),
(6, 'PIT Kobalt Timur B', 'PIT', 'AKTIF', 'Area penambangan Kobalt Timur B'),
(7, 'PIT Kobalt Barat A', 'PIT', 'AKTIF', 'Area penambangan Kobalt Barat A'),
(8, 'PIT Kobalt Barat B', 'PIT', 'AKTIF', 'Area penambangan Kobalt Barat B'),
(9, 'PIT Nikel-Kobalt Tengah', 'PIT', 'AKTIF', 'Area penambangan Nikel-Kobalt Tengah'),
(10, 'STOCKPILE Kobalt Utara', 'STOCKPILE', 'AKTIF', 'Penampungan material Kobalt Utara'),
(11, 'STOCKPILE Kobalt Selatan', 'STOCKPILE', 'AKTIF', 'Penampungan material Kobalt Selatan'),
(12, 'STOCKPILE Kobalt Timur', 'STOCKPILE', 'AKTIF', 'Penampungan material Kobalt Timur'),
(13, 'STOCKPILE Kobalt Barat', 'STOCKPILE', 'AKTIF', 'Penampungan material Kobalt Barat'),
(14, 'STOCKPILE Sentral', 'STOCKPILE', 'AKTIF', 'Penampungan material Sentral'),
(15, 'STOCKPILE Cadangan', 'STOCKPILE', 'DIBATASI', 'Penampungan material Cadangan');

-- --------------------------------------------------------

--
-- Table structure for table `manager`
--

CREATE TABLE `manager` (
  `id_pegawai` int(11) NOT NULL,
  `divisi_tanggung_jawab` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `manager`
--

INSERT INTO `manager` (`id_pegawai`, `divisi_tanggung_jawab`) VALUES
(12, 'Operasional dan Logistik Pertambangan'),
(13, 'Lingkungan dan Keselamatan Kerja');

-- --------------------------------------------------------

--
-- Table structure for table `monitoring_lingkungan`
--

CREATE TABLE `monitoring_lingkungan` (
  `id_monitoring` int(11) NOT NULL,
  `tanggal_monitoring` datetime NOT NULL,
  `status_monitoring` varchar(20) NOT NULL DEFAULT 'NORMAL',
  `tindak_lanjut` varchar(255) DEFAULT NULL,
  `status_penanganan` varchar(20) NOT NULL DEFAULT 'TIDAK_DIPERLUKAN',
  `catatan` varchar(255) DEFAULT NULL,
  `lokasi_id_lokasi` int(11) NOT NULL,
  `petugas_hse_id_pegawai` int(11) NOT NULL
) ;

--
-- Dumping data for table `monitoring_lingkungan`
--

INSERT INTO `monitoring_lingkungan` (`id_monitoring`, `tanggal_monitoring`, `status_monitoring`, `tindak_lanjut`, `status_penanganan`, `catatan`, `lokasi_id_lokasi`, `petugas_hse_id_pegawai`) VALUES
(1, '2026-10-01 08:00:00', 'NORMAL', 'Tidak diperlukan', 'TIDAK_DIPERLUKAN', 'Seluruh parameter yang diperiksa normal', 1, 9),
(2, '2026-10-02 08:00:00', 'NORMAL', 'Tidak diperlukan', 'TIDAK_DIPERLUKAN', 'Kondisi lingkungan sesuai batas', 2, 10),
(3, '2026-10-03 08:00:00', 'PERINGATAN', 'Pemeriksaan kualitas air', 'SELESAI', 'pH air berada di bawah batas', 3, 11),
(4, '2026-10-04 08:00:00', 'NORMAL', 'Tidak diperlukan', 'TIDAK_DIPERLUKAN', 'Hasil pemeriksaan normal', 4, 9),
(5, '2026-10-05 08:00:00', 'PERINGATAN', 'Pengendalian debu', 'SELESAI', 'Konsentrasi PM10 melebihi batas', 5, 10),
(6, '2026-10-06 08:00:00', 'NORMAL', 'Tidak diperlukan', 'TIDAK_DIPERLUKAN', 'Kualitas air sesuai batas', 6, 11),
(7, '2026-10-07 08:00:00', 'PERINGATAN', 'Pengendalian kebisingan', 'DALAM_PENANGANAN', 'Kebisingan melebihi batas', 7, 9),
(8, '2026-10-08 08:00:00', 'NORMAL', 'Tidak diperlukan', 'TIDAK_DIPERLUKAN', 'Kualitas udara dan kebisingan normal', 8, 10),
(9, '2026-10-09 08:00:00', 'NORMAL', 'Tidak diperlukan', 'TIDAK_DIPERLUKAN', 'Kondisi lingkungan normal', 9, 11),
(10, '2026-10-10 08:00:00', 'PERINGATAN', 'Pemeriksaan kualitas air', 'DALAM_PENANGANAN', 'TSS melebihi batas', 10, 9),
(11, '2026-10-11 08:00:00', 'NORMAL', 'Tidak diperlukan', 'TIDAK_DIPERLUKAN', 'Hasil pengukuran normal', 11, 10),
(12, '2026-10-12 08:00:00', 'PERINGATAN', 'Pemeriksaan air limpasan', 'BELUM_DITANGANI', 'Kadar kobalt melebihi batas', 12, 11),
(13, '2026-10-13 08:00:00', 'NORMAL', 'Tidak diperlukan', 'TIDAK_DIPERLUKAN', 'Hasil pengukuran normal', 13, 9),
(14, '2026-10-14 08:00:00', 'NORMAL', 'Tidak diperlukan', 'TIDAK_DIPERLUKAN', 'Kualitas air sesuai batas', 14, 10),
(15, '2026-10-15 08:00:00', 'PERINGATAN', 'Pemeriksaan kualitas air', 'DALAM_PENANGANAN', 'TSS melebihi batas', 15, 11);

-- --------------------------------------------------------

--
-- Table structure for table `parameter_lingkungan`
--

CREATE TABLE `parameter_lingkungan` (
  `id_parameter` int(11) NOT NULL,
  `nama_parameter` varchar(100) NOT NULL,
  `satuan` varchar(30) NOT NULL,
  `batas_minimum` decimal(12,2) DEFAULT NULL,
  `batas_maksimum` decimal(12,2) DEFAULT NULL,
  `keterangan` varchar(255) DEFAULT NULL
) ;

--
-- Dumping data for table `parameter_lingkungan`
--

INSERT INTO `parameter_lingkungan` (`id_parameter`, `nama_parameter`, `satuan`, `batas_minimum`, `batas_maksimum`, `keterangan`) VALUES
(1, 'pH Air', 'pH', 6.00, 9.00, 'Tingkat keasaman air'),
(2, 'Total Suspended Solids (TSS)', 'mg/L', 0.00, 200.00, 'Padatan tersuspensi dalam air'),
(3, 'Debu PM10', 'µg/m³', 0.00, 75.00, 'Konsentrasi debu'),
(4, 'Kebisingan', 'dB', 0.00, 85.00, 'Kebisingan operasional'),
(5, 'Kadar Kobalt dalam Air', 'mg/L', 0.00, 0.50, 'Kandungan kobalt dalam air');

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `id_pegawai` int(11) NOT NULL,
  `nama_pegawai` varchar(100) NOT NULL,
  `no_hp` varchar(20) NOT NULL,
  `tanggal_masuk` date NOT NULL,
  `status_pegawai` varchar(15) NOT NULL DEFAULT 'AKTIF'
) ;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`id_pegawai`, `nama_pegawai`, `no_hp`, `tanggal_masuk`, `status_pegawai`) VALUES
(1, 'Zefri Al Rizqullah', '081253410001', '2022-01-10', 'AKTIF'),
(2, 'Rasya Aditya Ramadani', '081253410002', '2022-03-15', 'AKTIF'),
(3, 'Ahmad Ribbiy Aldi', '081253410003', '2023-02-01', 'AKTIF'),
(4, 'Eko Satrio Wibowo', '081253410004', '2023-04-10', 'AKTIF'),
(5, 'Budi Santoso', '081253410005', '2021-05-12', 'AKTIF'),
(6, 'Andi Saputra', '081253410006', '2022-07-18', 'AKTIF'),
(7, 'Dimas Prakoso', '081253410007', '2023-04-10', 'AKTIF'),
(8, 'Rian Firmansyah', '081253410008', '2024-01-15', 'AKTIF'),
(9, 'Siti Rahmawati', '081253410009', '2021-08-20', 'AKTIF'),
(10, 'Dewi Anggraini', '081253410010', '2022-09-05', 'AKTIF'),
(11, 'Rina Maharani', '081253410011', '2023-06-14', 'AKTIF'),
(12, 'Hendra Wijaya', '081253410012', '2020-01-15', 'AKTIF'),
(13, 'Fajar Nugroho', '081253410013', '2021-02-22', 'AKTIF'),
(14, 'Agus Setiawan', '081253410014', '2021-06-10', 'AKTIF'),
(15, 'Rudi Hartono', '081253410015', '2022-05-19', 'AKTIF'),
(16, 'Joko Susilo', '081253410016', '2023-08-25', 'AKTIF'),
(17, 'Wahyu Prasetyo', '081253410017', '2022-04-12', 'AKTIF'),
(18, 'Ilham Maulana', '081253410018', '2023-07-20', 'AKTIF'),
(19, 'Arif Kurniawan', '081253410019', '2024-02-10', 'AKTIF'),
(20, 'Yoga Saputra', '081253410020', '2024-05-15', 'AKTIF');

-- --------------------------------------------------------

--
-- Table structure for table `pengangkutan`
--

CREATE TABLE `pengangkutan` (
  `id_pengangkutan` int(11) NOT NULL,
  `tanggal_pengangkutan` date NOT NULL,
  `waktu_mulai` datetime DEFAULT NULL,
  `waktu_selesai` datetime DEFAULT NULL,
  `jumlah_muatan` decimal(12,2) NOT NULL,
  `status_pengangkutan` varchar(20) NOT NULL DEFAULT 'DIJADWALKAN',
  `produksi_tambang_id_produksi` int(11) NOT NULL,
  `kendaraan_id_kendaraan` int(11) NOT NULL,
  `lokasi_id_lokasi` int(11) NOT NULL,
  `lokasi_tujuan_id_lokasi` int(11) NOT NULL,
  `petugas_operasional_id_pegawai` int(11) NOT NULL,
  `driver_id_pegawai` int(11) NOT NULL
) ;

--
-- Dumping data for table `pengangkutan`
--

INSERT INTO `pengangkutan` (`id_pengangkutan`, `tanggal_pengangkutan`, `waktu_mulai`, `waktu_selesai`, `jumlah_muatan`, `status_pengangkutan`, `produksi_tambang_id_produksi`, `kendaraan_id_kendaraan`, `lokasi_id_lokasi`, `lokasi_tujuan_id_lokasi`, `petugas_operasional_id_pegawai`, `driver_id_pegawai`) VALUES
(1, '2026-10-01', '2026-10-01 08:00:00', '2026-10-01 09:00:00', 20.00, 'SELESAI', 1, 1, 1, 10, 5, 14),
(2, '2026-10-01', '2026-10-01 10:00:00', '2026-10-01 11:00:00', 20.00, 'SELESAI', 1, 2, 1, 14, 5, 15),
(3, '2026-10-02', '2026-10-02 08:00:00', '2026-10-02 09:00:00', 20.00, 'SELESAI', 2, 3, 2, 10, 6, 16),
(4, '2026-10-02', '2026-10-02 10:00:00', '2026-10-02 11:00:00', 20.00, 'SELESAI', 2, 4, 2, 14, 6, 17),
(5, '2026-10-03', '2026-10-03 08:00:00', '2026-10-03 09:00:00', 20.00, 'SELESAI', 3, 5, 3, 11, 7, 18),
(6, '2026-10-03', '2026-10-03 10:00:00', '2026-10-03 11:00:00', 20.00, 'SELESAI', 3, 6, 3, 14, 7, 19),
(7, '2026-10-04', '2026-10-04 08:00:00', '2026-10-04 09:00:00', 20.00, 'SELESAI', 4, 7, 9, 14, 8, 20),
(8, '2026-10-04', '2026-10-04 10:00:00', '2026-10-04 11:00:00', 20.00, 'SELESAI', 4, 8, 9, 10, 8, 14),
(9, '2026-10-05', '2026-10-05 08:00:00', '2026-10-05 09:00:00', 20.00, 'SELESAI', 5, 9, 5, 12, 5, 15),
(10, '2026-10-05', '2026-10-05 10:00:00', '2026-10-05 11:00:00', 20.00, 'SELESAI', 5, 10, 5, 14, 5, 16),
(11, '2026-10-06', '2026-10-06 08:00:00', '2026-10-06 09:00:00', 20.00, 'SELESAI', 6, 11, 6, 12, 6, 17),
(12, '2026-10-06', '2026-10-06 10:00:00', '2026-10-06 11:00:00', 20.00, 'SELESAI', 6, 12, 6, 14, 6, 18),
(13, '2026-10-07', '2026-10-07 08:00:00', '2026-10-07 09:00:00', 20.00, 'SELESAI', 7, 13, 7, 13, 7, 19),
(14, '2026-10-07', '2026-10-07 10:00:00', '2026-10-07 11:00:00', 20.00, 'SELESAI', 7, 14, 7, 14, 7, 20),
(15, '2026-10-08', '2026-10-08 08:00:00', '2026-10-08 09:00:00', 20.00, 'SELESAI', 8, 3, 8, 13, 8, 14),
(16, '2026-10-08', '2026-10-08 10:00:00', '2026-10-08 11:00:00', 20.00, 'SELESAI', 8, 7, 8, 14, 8, 15),
(17, '2026-10-09', '2026-10-09 08:00:00', '2026-10-09 09:00:00', 20.00, 'SELESAI', 9, 1, 1, 10, 5, 16),
(18, '2026-10-09', '2026-10-09 10:00:00', '2026-10-09 11:00:00', 20.00, 'SELESAI', 9, 2, 1, 14, 5, 17),
(19, '2026-10-10', '2026-10-10 08:00:00', '2026-10-10 09:00:00', 20.00, 'SELESAI', 10, 5, 2, 10, 6, 18),
(20, '2026-10-10', '2026-10-10 10:00:00', '2026-10-10 11:00:00', 20.00, 'SELESAI', 10, 6, 2, 14, 6, 19),
(21, '2026-10-11', '2026-10-11 08:00:00', '2026-10-11 09:00:00', 20.00, 'SELESAI', 11, 11, 3, 11, 7, 20),
(22, '2026-10-12', '2026-10-12 08:00:00', '2026-10-12 09:00:00', 20.00, 'SELESAI', 12, 12, 4, 11, 8, 14),
(23, '2026-10-13', '2026-10-13 08:00:00', '2026-10-13 09:00:00', 20.00, 'SELESAI', 13, 13, 5, 12, 5, 15),
(24, '2026-10-14', '2026-10-14 08:00:00', '2026-10-14 09:00:00', 20.00, 'SELESAI', 14, 14, 6, 14, 6, 16),
(25, '2026-10-15', '2026-10-15 08:00:00', '2026-10-15 09:00:00', 20.00, 'SELESAI', 15, 9, 9, 14, 7, 17);

-- --------------------------------------------------------

--
-- Table structure for table `petugas_hse`
--

CREATE TABLE `petugas_hse` (
  `id_pegawai` int(11) NOT NULL,
  `no_sertifikasi_hse` varchar(50) NOT NULL,
  `masa_berlaku_sertifikasi` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `petugas_hse`
--

INSERT INTO `petugas_hse` (`id_pegawai`, `no_sertifikasi_hse`, `masa_berlaku_sertifikasi`) VALUES
(9, 'HSE-KT-2024-001', '2027-08-20'),
(10, 'HSE-KT-2024-002', '2027-09-05'),
(11, 'HSE-KT-2025-003', '2028-06-14');

-- --------------------------------------------------------

--
-- Table structure for table `petugas_operasional`
--

CREATE TABLE `petugas_operasional` (
  `id_pegawai` int(11) NOT NULL,
  `shift_kerja` varchar(20) NOT NULL
) ;

--
-- Dumping data for table `petugas_operasional`
--

INSERT INTO `petugas_operasional` (`id_pegawai`, `shift_kerja`) VALUES
(5, 'PAGI'),
(6, 'SIANG'),
(7, 'MALAM'),
(8, 'PAGI');

-- --------------------------------------------------------

--
-- Table structure for table `produksi_tambang`
--

CREATE TABLE `produksi_tambang` (
  `id_produksi` int(11) NOT NULL,
  `tanggal_produksi` date NOT NULL,
  `jumlah_produksi` decimal(12,2) NOT NULL,
  `jumlah_tersedia` decimal(12,2) NOT NULL,
  `status_produksi` varchar(20) NOT NULL DEFAULT 'TERSEDIA',
  `jenis_material_id_material` int(11) NOT NULL,
  `lokasi_id_lokasi` int(11) NOT NULL,
  `petugas_operasional_id_pegawai` int(11) NOT NULL
) ;

--
-- Dumping data for table `produksi_tambang`
--

INSERT INTO `produksi_tambang` (`id_produksi`, `tanggal_produksi`, `jumlah_produksi`, `jumlah_tersedia`, `status_produksi`, `jenis_material_id_material`, `lokasi_id_lokasi`, `petugas_operasional_id_pegawai`) VALUES
(1, '2026-10-01', 150.00, 110.00, 'SEBAGIAN_DIANGKUT', 1, 1, 5),
(2, '2026-10-02', 120.00, 80.00, 'SEBAGIAN_DIANGKUT', 2, 2, 6),
(3, '2026-10-03', 100.00, 60.00, 'SEBAGIAN_DIANGKUT', 3, 3, 7),
(4, '2026-10-04', 180.00, 140.00, 'SEBAGIAN_DIANGKUT', 4, 9, 8),
(5, '2026-10-05', 200.00, 160.00, 'SEBAGIAN_DIANGKUT', 5, 5, 5),
(6, '2026-10-06', 160.00, 120.00, 'SEBAGIAN_DIANGKUT', 6, 6, 6),
(7, '2026-10-07', 140.00, 100.00, 'SEBAGIAN_DIANGKUT', 7, 7, 7),
(8, '2026-10-08', 170.00, 130.00, 'SEBAGIAN_DIANGKUT', 8, 8, 8),
(9, '2026-10-09', 130.00, 90.00, 'SEBAGIAN_DIANGKUT', 9, 1, 5),
(10, '2026-10-10', 220.00, 180.00, 'SEBAGIAN_DIANGKUT', 10, 2, 6),
(11, '2026-10-11', 190.00, 170.00, 'SEBAGIAN_DIANGKUT', 11, 3, 7),
(12, '2026-10-12', 110.00, 90.00, 'SEBAGIAN_DIANGKUT', 12, 4, 8),
(13, '2026-10-13', 160.00, 140.00, 'SEBAGIAN_DIANGKUT', 13, 5, 5),
(14, '2026-10-14', 200.00, 180.00, 'SEBAGIAN_DIANGKUT', 14, 6, 6),
(15, '2026-10-15', 150.00, 130.00, 'SEBAGIAN_DIANGKUT', 15, 9, 7);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(255) NOT NULL,
  `pegawai_id_pegawai` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `username`, `password`, `pegawai_id_pegawai`) VALUES
(1, 'zefalriz', 'pbkdf2_sha256$210000$1nL2Z+IljHd+N7XmG+EgzQ==$zjS2jgnrb3xxZf73yp5pGpvKc9uldEOkHSe9eIAhvGA=', 1),
(2, 'rasyaaditya', 'pbkdf2_sha256$210000$1nL2Z+IljHd+N7XmG+EgzQ==$zjS2jgnrb3xxZf73yp5pGpvKc9uldEOkHSe9eIAhvGA=', 2),
(3, 'ahmadribbiy', 'pbkdf2_sha256$210000$1nL2Z+IljHd+N7XmG+EgzQ==$zjS2jgnrb3xxZf73yp5pGpvKc9uldEOkHSe9eIAhvGA=', 3),
(4, 'ekosatrio', 'pbkdf2_sha256$210000$1nL2Z+IljHd+N7XmG+EgzQ==$zjS2jgnrb3xxZf73yp5pGpvKc9uldEOkHSe9eIAhvGA=', 4),
(5, 'budiops', 'pbkdf2_sha256$210000$1nL2Z+IljHd+N7XmG+EgzQ==$zjS2jgnrb3xxZf73yp5pGpvKc9uldEOkHSe9eIAhvGA=', 5),
(6, 'andiops', 'pbkdf2_sha256$210000$1nL2Z+IljHd+N7XmG+EgzQ==$zjS2jgnrb3xxZf73yp5pGpvKc9uldEOkHSe9eIAhvGA=', 6),
(7, 'dimasops', 'pbkdf2_sha256$210000$1nL2Z+IljHd+N7XmG+EgzQ==$zjS2jgnrb3xxZf73yp5pGpvKc9uldEOkHSe9eIAhvGA=', 7),
(8, 'rianops', 'pbkdf2_sha256$210000$1nL2Z+IljHd+N7XmG+EgzQ==$zjS2jgnrb3xxZf73yp5pGpvKc9uldEOkHSe9eIAhvGA=', 8),
(9, 'sitihse', 'pbkdf2_sha256$210000$1nL2Z+IljHd+N7XmG+EgzQ==$zjS2jgnrb3xxZf73yp5pGpvKc9uldEOkHSe9eIAhvGA=', 9),
(10, 'dewihse', 'pbkdf2_sha256$210000$1nL2Z+IljHd+N7XmG+EgzQ==$zjS2jgnrb3xxZf73yp5pGpvKc9uldEOkHSe9eIAhvGA=', 10),
(11, 'rinahse', 'pbkdf2_sha256$210000$1nL2Z+IljHd+N7XmG+EgzQ==$zjS2jgnrb3xxZf73yp5pGpvKc9uldEOkHSe9eIAhvGA=', 11),
(12, 'hendramgr', 'pbkdf2_sha256$210000$1nL2Z+IljHd+N7XmG+EgzQ==$zjS2jgnrb3xxZf73yp5pGpvKc9uldEOkHSe9eIAhvGA=', 12),
(13, 'fajarmgr', 'pbkdf2_sha256$210000$1nL2Z+IljHd+N7XmG+EgzQ==$zjS2jgnrb3xxZf73yp5pGpvKc9uldEOkHSe9eIAhvGA=', 13);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_pegawai`),
  ADD UNIQUE KEY `kode_admin` (`kode_admin`);

--
-- Indexes for table `detail_monitoring`
--
ALTER TABLE `detail_monitoring`
  ADD PRIMARY KEY (`id_detail`),
  ADD UNIQUE KEY `uq_detail_monitoring_parameter` (`monitoring_lingkungan_id_monitoring`,`parameter_lingkungan_id_parameter`),
  ADD KEY `fk_detail_parameter` (`parameter_lingkungan_id_parameter`);

--
-- Indexes for table `driver`
--
ALTER TABLE `driver`
  ADD PRIMARY KEY (`id_pegawai`),
  ADD UNIQUE KEY `no_sim` (`no_sim`);

--
-- Indexes for table `jenis_material`
--
ALTER TABLE `jenis_material`
  ADD PRIMARY KEY (`id_material`);

--
-- Indexes for table `kendaraan`
--
ALTER TABLE `kendaraan`
  ADD PRIMARY KEY (`id_kendaraan`),
  ADD UNIQUE KEY `nomor_polisi` (`nomor_polisi`);

--
-- Indexes for table `lokasi`
--
ALTER TABLE `lokasi`
  ADD PRIMARY KEY (`id_lokasi`);

--
-- Indexes for table `manager`
--
ALTER TABLE `manager`
  ADD PRIMARY KEY (`id_pegawai`);

--
-- Indexes for table `monitoring_lingkungan`
--
ALTER TABLE `monitoring_lingkungan`
  ADD PRIMARY KEY (`id_monitoring`),
  ADD KEY `fk_monitoring_lokasi` (`lokasi_id_lokasi`),
  ADD KEY `fk_monitoring_hse` (`petugas_hse_id_pegawai`),
  ADD KEY `idx_monitoring_tanggal` (`tanggal_monitoring`);

--
-- Indexes for table `parameter_lingkungan`
--
ALTER TABLE `parameter_lingkungan`
  ADD PRIMARY KEY (`id_parameter`);

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`id_pegawai`);

--
-- Indexes for table `pengangkutan`
--
ALTER TABLE `pengangkutan`
  ADD PRIMARY KEY (`id_pengangkutan`),
  ADD KEY `fk_angkut_produksi` (`produksi_tambang_id_produksi`),
  ADD KEY `fk_angkut_asal` (`lokasi_id_lokasi`),
  ADD KEY `fk_angkut_tujuan` (`lokasi_tujuan_id_lokasi`),
  ADD KEY `fk_angkut_ops` (`petugas_operasional_id_pegawai`),
  ADD KEY `idx_angkut_jadwal` (`tanggal_pengangkutan`,`status_pengangkutan`),
  ADD KEY `idx_angkut_driver_jadwal` (`driver_id_pegawai`,`tanggal_pengangkutan`,`status_pengangkutan`),
  ADD KEY `idx_angkut_kendaraan_jadwal` (`kendaraan_id_kendaraan`,`tanggal_pengangkutan`,`status_pengangkutan`);

--
-- Indexes for table `petugas_hse`
--
ALTER TABLE `petugas_hse`
  ADD PRIMARY KEY (`id_pegawai`),
  ADD UNIQUE KEY `no_sertifikasi_hse` (`no_sertifikasi_hse`);

--
-- Indexes for table `petugas_operasional`
--
ALTER TABLE `petugas_operasional`
  ADD PRIMARY KEY (`id_pegawai`);

--
-- Indexes for table `produksi_tambang`
--
ALTER TABLE `produksi_tambang`
  ADD PRIMARY KEY (`id_produksi`),
  ADD KEY `fk_produksi_material` (`jenis_material_id_material`),
  ADD KEY `fk_produksi_lokasi` (`lokasi_id_lokasi`),
  ADD KEY `fk_produksi_ops` (`petugas_operasional_id_pegawai`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`),
  ADD UNIQUE KEY `username` (`username`),
  ADD UNIQUE KEY `pegawai_id_pegawai` (`pegawai_id_pegawai`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `detail_monitoring`
--
ALTER TABLE `detail_monitoring`
  MODIFY `id_detail` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `jenis_material`
--
ALTER TABLE `jenis_material`
  MODIFY `id_material` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `kendaraan`
--
ALTER TABLE `kendaraan`
  MODIFY `id_kendaraan` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `lokasi`
--
ALTER TABLE `lokasi`
  MODIFY `id_lokasi` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `monitoring_lingkungan`
--
ALTER TABLE `monitoring_lingkungan`
  MODIFY `id_monitoring` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `parameter_lingkungan`
--
ALTER TABLE `parameter_lingkungan`
  MODIFY `id_parameter` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pegawai`
--
ALTER TABLE `pegawai`
  MODIFY `id_pegawai` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pengangkutan`
--
ALTER TABLE `pengangkutan`
  MODIFY `id_pengangkutan` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `produksi_tambang`
--
ALTER TABLE `produksi_tambang`
  MODIFY `id_produksi` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `admin`
--
ALTER TABLE `admin`
  ADD CONSTRAINT `fk_admin_pegawai` FOREIGN KEY (`id_pegawai`) REFERENCES `pegawai` (`id_pegawai`) ON UPDATE CASCADE;

--
-- Constraints for table `detail_monitoring`
--
ALTER TABLE `detail_monitoring`
  ADD CONSTRAINT `fk_detail_monitoring` FOREIGN KEY (`monitoring_lingkungan_id_monitoring`) REFERENCES `monitoring_lingkungan` (`id_monitoring`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_detail_parameter` FOREIGN KEY (`parameter_lingkungan_id_parameter`) REFERENCES `parameter_lingkungan` (`id_parameter`) ON UPDATE CASCADE;

--
-- Constraints for table `driver`
--
ALTER TABLE `driver`
  ADD CONSTRAINT `fk_driver_pegawai` FOREIGN KEY (`id_pegawai`) REFERENCES `pegawai` (`id_pegawai`) ON UPDATE CASCADE;

--
-- Constraints for table `manager`
--
ALTER TABLE `manager`
  ADD CONSTRAINT `fk_manager_pegawai` FOREIGN KEY (`id_pegawai`) REFERENCES `pegawai` (`id_pegawai`) ON UPDATE CASCADE;

--
-- Constraints for table `monitoring_lingkungan`
--
ALTER TABLE `monitoring_lingkungan`
  ADD CONSTRAINT `fk_monitoring_hse` FOREIGN KEY (`petugas_hse_id_pegawai`) REFERENCES `petugas_hse` (`id_pegawai`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_monitoring_lokasi` FOREIGN KEY (`lokasi_id_lokasi`) REFERENCES `lokasi` (`id_lokasi`) ON UPDATE CASCADE;

--
-- Constraints for table `pengangkutan`
--
ALTER TABLE `pengangkutan`
  ADD CONSTRAINT `fk_angkut_asal` FOREIGN KEY (`lokasi_id_lokasi`) REFERENCES `lokasi` (`id_lokasi`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_angkut_driver` FOREIGN KEY (`driver_id_pegawai`) REFERENCES `driver` (`id_pegawai`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_angkut_kendaraan` FOREIGN KEY (`kendaraan_id_kendaraan`) REFERENCES `kendaraan` (`id_kendaraan`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_angkut_ops` FOREIGN KEY (`petugas_operasional_id_pegawai`) REFERENCES `petugas_operasional` (`id_pegawai`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_angkut_produksi` FOREIGN KEY (`produksi_tambang_id_produksi`) REFERENCES `produksi_tambang` (`id_produksi`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_angkut_tujuan` FOREIGN KEY (`lokasi_tujuan_id_lokasi`) REFERENCES `lokasi` (`id_lokasi`) ON UPDATE CASCADE;

--
-- Constraints for table `petugas_hse`
--
ALTER TABLE `petugas_hse`
  ADD CONSTRAINT `fk_hse_pegawai` FOREIGN KEY (`id_pegawai`) REFERENCES `pegawai` (`id_pegawai`) ON UPDATE CASCADE;

--
-- Constraints for table `petugas_operasional`
--
ALTER TABLE `petugas_operasional`
  ADD CONSTRAINT `fk_ops_pegawai` FOREIGN KEY (`id_pegawai`) REFERENCES `pegawai` (`id_pegawai`) ON UPDATE CASCADE;

--
-- Constraints for table `produksi_tambang`
--
ALTER TABLE `produksi_tambang`
  ADD CONSTRAINT `fk_produksi_lokasi` FOREIGN KEY (`lokasi_id_lokasi`) REFERENCES `lokasi` (`id_lokasi`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_produksi_material` FOREIGN KEY (`jenis_material_id_material`) REFERENCES `jenis_material` (`id_material`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_produksi_ops` FOREIGN KEY (`petugas_operasional_id_pegawai`) REFERENCES `petugas_operasional` (`id_pegawai`) ON UPDATE CASCADE;

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `fk_user_pegawai` FOREIGN KEY (`pegawai_id_pegawai`) REFERENCES `pegawai` (`id_pegawai`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

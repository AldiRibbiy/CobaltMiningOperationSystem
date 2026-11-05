/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package enums;

import java.time.LocalDate;

/** Pilihan periode waktu untuk filter dashboard dan laporan. */
public enum Periode {
    HARI_INI("Hari Ini"),
    TUJUH_HARI("7 Hari Terakhir"),
    BULAN_INI("Bulan Ini"),
    TAHUN_INI("Tahun Ini"),
    SEMUA("Semua Periode"),
    KUSTOM("Rentang Kustom");

    private final String label;

    Periode(String label) {
        this.label = label;
    }

    public String label() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }

    /** Batas awal periode (inklusif); null berarti tanpa batas. */
    public LocalDate awal(LocalDate kustomAwal) {
        LocalDate hariIni = LocalDate.now();
        switch (this) {
            case HARI_INI: return hariIni;
            case TUJUH_HARI: return hariIni.minusDays(6);
            case BULAN_INI: return hariIni.withDayOfMonth(1);
            case TAHUN_INI: return hariIni.withDayOfYear(1);
            case KUSTOM: return kustomAwal;
            default: return null;
        }
    }

    /** Batas akhir periode (inklusif); null berarti tanpa batas. */
    public LocalDate akhir(LocalDate kustomAkhir) {
        LocalDate hariIni = LocalDate.now();
        switch (this) {
            case HARI_INI: return hariIni;
            case TUJUH_HARI: return hariIni;
            case BULAN_INI: return hariIni;
            case TAHUN_INI: return hariIni;
            case KUSTOM: return kustomAkhir;
            default: return null;
        }
    }

    /** Apakah tanggal berada di dalam rentang (inklusif). */
    public static boolean dalam(LocalDate tanggal, LocalDate awal, LocalDate akhir) {
        if (tanggal == null) return false;
        if (awal != null && tanggal.isBefore(awal)) return false;
        return akhir == null || !tanggal.isAfter(akhir);
    }
}

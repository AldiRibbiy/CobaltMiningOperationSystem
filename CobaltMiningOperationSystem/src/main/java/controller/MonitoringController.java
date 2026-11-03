/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import service.*;
import model.*;
import enums.StatusLokasi;
import java.time.LocalDateTime;
import java.util.*;

/**
 *
 * @author zefrialrizkullah
 */

public final class MonitoringController {
    private final MonitoringService service;
    private final AuthService auth;
    public MonitoringController(MonitoringService service, AuthService a) {
        this.service = service;
        auth = a;
    }
    
    public MonitoringLingkungan buatMonitoring(int lokasi, LocalDateTime tanggal, String catatan) {
        auth.requirePetugasHSE();
        return service.buatMonitoring(lokasi, (PetugasHSE)auth.getCurrentPegawai(), tanggal, catatan);
    }
    
    public DetailMonitoring tambahDetail(int id, int parameter, double nilai, String catatan) {
        auth.requirePetugasHSE();
        return service.tambahDetail(id, parameter, nilai, catatan);
    }
    
    public MonitoringLingkungan ubahMonitoring(int id, int lokasi, LocalDateTime tanggal, String catatan) {
        auth.requirePetugasHSE();
        return service.ubahMonitoring(id, lokasi, tanggal, catatan);
    }

    public void hapusMonitoring(int id) {
        auth.requirePetugasHSE();
        service.hapusMonitoring(id);
    }

    public DetailMonitoring ubahDetail(int idDetail, int parameter, double nilai, String catatan) {
        auth.requirePetugasHSE();
        return service.ubahDetail(idDetail, parameter, nilai, catatan);
    }

    public void hapusDetail(int idDetail) {
        auth.requirePetugasHSE();
        service.hapusDetail(idDetail);
    }

    public void aturTindakLanjut(int id, String tindak) {
        auth.requirePetugasHSE();
        service.aturTindakLanjut(id, tindak);
    }
    
    public void mulaiPenanganan(int id) {
        auth.requirePetugasHSE();
        service.mulaiPenanganan(id);
    }
    
    public void selesaikanPenanganan(int id) {
        auth.requirePetugasHSE();
        service.selesaikanPenanganan(id);
    }
    
    public void ubahStatusLokasi(int id, StatusLokasi status) {
        auth.requirePetugasHSE();
        service.ubahStatusLokasi(id, status);
    }
    
    /** Detail monitoring boleh dilihat Petugas HSE (pemilik modul) dan Manager (laporan). */
    public MonitoringLingkungan cariMonitoringById(int id) {
        if (!auth.isPetugasHSE() && !auth.isManager())throw new exception.ValidationException("Akses ditolak: hanya Petugas HSE dan Manager.");
        return service.cariMonitoringById(id);
    }
    
    public List<MonitoringLingkungan> tampilkanSemuaMonitoring() {
        auth.requirePetugasHSE();
        return service.tampilkanSemuaMonitoring();
    }
    
    public List<MonitoringLingkungan> tampilkanMonitoringByLokasi(int id) {
        auth.requirePetugasHSE();
        return service.tampilkanMonitoringByLokasi(id);
    }
}

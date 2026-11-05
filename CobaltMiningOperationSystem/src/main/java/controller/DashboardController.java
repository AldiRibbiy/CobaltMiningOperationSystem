/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package controller;

import enums.Periode;
import java.time.LocalDate;
import service.AuthService;
import service.DashboardService;

/**
 * Menyediakan data dashboard sesuai hak akses pengguna yang sedang login.
 *
 * @author zefrialrizkullah
 */
public class DashboardController {
    private final DashboardService dashboardService;
    private final AuthService authService;

    public DashboardController(DashboardService dashboardService, AuthService authService) {
        this.dashboardService = dashboardService;
        this.authService = authService;
    }

    private void guard() {
        if (authService == null || !authService.isLoggedIn()) {
            throw new exception.BusinessException("Silakan login terlebih dahulu.");
        }
    }

    public DashboardService.Data admin() {
        guard();
        authService.requireAdmin();
        return dashboardService.admin();
    }

    public java.util.Set<Integer> materialTerpakaiSet() {
        guard();
        authService.requireAdmin();
        return dashboardService.materialTerpakaiSet();
    }

    public DashboardService.Data operasional(Periode periode, LocalDate kustomAwal, LocalDate kustomAkhir) {
        guard();
        authService.requirePetugasOperasional();
        return dashboardService.operasional(periode, kustomAwal, kustomAkhir);
    }

    public DashboardService.Data hse(Periode periode, LocalDate kustomAwal, LocalDate kustomAkhir) {
        guard();
        authService.requirePetugasHSE();
        return dashboardService.hse(periode, kustomAwal, kustomAkhir);
    }

    public DashboardService.Data manager(Periode periode, LocalDate kustomAwal, LocalDate kustomAkhir) {
        guard();
        authService.requireManager();
        return dashboardService.manager(periode, kustomAwal, kustomAkhir);
    }
}

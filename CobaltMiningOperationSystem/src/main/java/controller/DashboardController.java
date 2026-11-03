/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package controller;

import service.AuthService;
import service.DashboardService;

/**
 * Penghubung dashboard per peran. Setiap peran hanya boleh membuka dashboard miliknya,
 * kecuali Manager yang memperoleh ringkasan lintas modul.
 *
 * @author zefrialrizkullah
 */

public final class DashboardController {
    private final DashboardService service;
    private final AuthService auth;

    public DashboardController(DashboardService service, AuthService auth) {
        this.service = service;
        this.auth = auth;
    }

    public DashboardService.Data admin() {
        auth.requireAdmin();
        return service.admin();
    }

    public DashboardService.Data operasional() {
        auth.requirePetugasOperasional();
        return service.operasional();
    }

    public DashboardService.Data hse() {
        auth.requirePetugasHSE();
        return service.hse();
    }

    public DashboardService.Data manager() {
        auth.requireManager();
        return service.manager();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package service;

import enums.StatusPegawai;
import java.util.Optional;
import exception.ValidationException;
import model.*;
import repository.UserRepository;
import util.PasswordUtil;

/**
 *
 * @author zefrialrizkullah
 */

public final class AuthService {
    private final UserRepository users;
    private User current;
    
    public AuthService(UserRepository users) {
        this.users = users;
    }
    
    public User login(String username, String password) {
        if (username == null || username.trim().isEmpty() || password == null || password.isEmpty())throw new ValidationException("Username dan password wajib diisi.");
        User u = users.findByUsername(username.trim()).orElseThrow(()->new ValidationException("Username atau password salah."));
        
        if (!PasswordUtil.verifyPassword(password, u.getPassword()))throw new ValidationException("Username atau password salah.");
        Pegawai p = u.getPegawai();
        
        if (p == null || p.getStatusPegawai() != StatusPegawai.AKTIF)throw new ValidationException("Pegawai tidak aktif atau tidak ditemukan.");
        
        if (!(p instanceof Admin || p instanceof PetugasOperasional || p instanceof PetugasHSE || p instanceof Manager))throw new ValidationException("Tidak memiliki akses login.");
        current = u;
        return u;
    }
    
    public void logout() {
        current = null;
    }
    
    /** Pemilik akun memperbarui username/password-nya sendiri.
     *  Update akun hanya boleh dilakukan oleh pengguna itu sendiri (bukan Admin). */
    public void ubahAkunSendiri(String usernameBaru, String passwordLama, String passwordBaru) {
        User saya = getCurrentUser();
        if (usernameBaru == null || usernameBaru.trim().isEmpty())throw new ValidationException("Username baru wajib diisi.");
        if (passwordLama == null || passwordLama.isEmpty())throw new ValidationException("Password lama wajib diisi untuk konfirmasi perubahan.");
        if (!PasswordUtil.verifyPassword(passwordLama, saya.getPassword()))throw new ValidationException("Password lama tidak sesuai.");
        
        String username = usernameBaru.trim();
        Optional<User> sama = users.findByUsername(username);
        if (sama.isPresent() && sama.get().getIdUser() != saya.getIdUser())throw new ValidationException("Username sudah digunakan pengguna lain.");
        
        String passwordHash = saya.getPassword();
        if (passwordBaru != null && !passwordBaru.isEmpty()) {
            if (passwordBaru.length() < 8)throw new ValidationException("Password baru minimal 8 karakter.");
            passwordHash = PasswordUtil.hashPassword(passwordBaru);
        }
        
        User perubahan = new User(saya.getIdUser(), saya.getPegawai(), username, passwordHash);
        users.update(perubahan);
        current = perubahan;
    }
    
    public boolean isLoggedIn() {
        return current != null;
    }
    
    public User getCurrentUser() {
        if (current == null)throw new ValidationException("Belum login.");
        return current;
    }
    
    public Pegawai getCurrentPegawai() {
        return getCurrentUser().getPegawai();
    }
    
    public boolean isAdmin() {
        return isLoggedIn() && getCurrentPegawai() instanceof Admin;
    }
    
    public boolean isPetugasOperasional() {
        return isLoggedIn() && getCurrentPegawai() instanceof PetugasOperasional;
    }
    
    public boolean isPetugasHSE() {
        return isLoggedIn() && getCurrentPegawai() instanceof PetugasHSE;
    }
    
    public boolean isManager() {
        return isLoggedIn() && getCurrentPegawai() instanceof Manager;
    }
    
    public void requireAdmin() {
        if (!isAdmin())throw new ValidationException("Hanya Admin.");
    }
    
    public void requirePetugasOperasional() {
        if (!isPetugasOperasional())throw new ValidationException("Hanya Petugas Operasional.");
    }
    
    public void requirePetugasHSE() {
        if (!isPetugasHSE())throw new ValidationException("Hanya Petugas HSE.");
    }
    
    public void requireManager() {
        if (!isManager())throw new ValidationException("Hanya Manager.");
    }
}

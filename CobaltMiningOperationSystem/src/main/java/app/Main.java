/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import config.AppConfig;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import view.LoginFrame;

/**
 *
 * @author zefrialrizkullah
 */

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                AppConfig.initialize();
                new LoginFrame().setVisible(true);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Aplikasi tidak dapat dijalankan.\n" + ex.getMessage() 
                        + "\n\nPeriksa koneksi Database.", "C-MOS - Kesalahan Terjadi", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}

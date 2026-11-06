package view;

import config.AppConfig;
import javax.swing.*;

/** Frame untuk pemilik akun memperbarui username dan password miliknya sendiri. */
public class UbahAkunFrame extends javax.swing.JFrame {

    public UbahAkunFrame() {
        initComponents();
        
        JButton[] navButtons = {btnSimpan, btnBatal};

        for (JButton btn : navButtons) {
            btn.setOpaque(true);
            btn.setContentAreaFilled(true);
            btn.setBorderPainted(false);
        }
        
        txtUsername.setText(AppConfig.getAuthController().getCurrentUser().getUsername());
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblHint = new javax.swing.JLabel();
        pnlCard = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblLama = new javax.swing.JLabel();
        pwdLama = new javax.swing.JPasswordField();
        lblBaru = new javax.swing.JLabel();
        pwdBaru = new javax.swing.JPasswordField();
        lblKonfirmasi = new javax.swing.JLabel();
        pwdKonfirmasi = new javax.swing.JPasswordField();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));
        lblTitle.setText("Ubah Akun Saya");

        lblHint.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblHint.setForeground(new java.awt.Color(103, 121, 143));
        lblHint.setText("Perbarui username atau password akun Anda sendiri.");

        pnlCard.setBackground(new java.awt.Color(255, 255, 255));

        lblUsername.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(26, 43, 66));
        lblUsername.setText("Username Baru");

        txtUsername.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        lblLama.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblLama.setForeground(new java.awt.Color(26, 43, 66));
        lblLama.setText("Password Lama");

        pwdLama.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        lblBaru.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblBaru.setForeground(new java.awt.Color(26, 43, 66));
        lblBaru.setText("Password Baru (opsional)");

        pwdBaru.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        lblKonfirmasi.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblKonfirmasi.setForeground(new java.awt.Color(26, 43, 66));
        lblKonfirmasi.setText("Konfirmasi Password Baru");

        pwdKonfirmasi.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        org.jdesktop.layout.GroupLayout pnlCardLayout = new org.jdesktop.layout.GroupLayout(pnlCard);
        pnlCard.setLayout(pnlCardLayout);
        pnlCardLayout.setHorizontalGroup(
            pnlCardLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlCardLayout.createSequentialGroup()
                .add(24, 24, 24)
                .add(pnlCardLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlCardLayout.createSequentialGroup()
                        .add(lblUsername, 230, 230, 230)
                        .add(14, 14, 14)
                        .add(txtUsername, 352, 352, 352))
                    .add(pnlCardLayout.createSequentialGroup()
                        .add(lblLama, 230, 230, 230)
                        .add(14, 14, 14)
                        .add(pwdLama, 352, 352, 352))
                    .add(pnlCardLayout.createSequentialGroup()
                        .add(lblBaru, 230, 230, 230)
                        .add(14, 14, 14)
                        .add(pwdBaru, 352, 352, 352))
                    .add(pnlCardLayout.createSequentialGroup()
                        .add(lblKonfirmasi, 230, 230, 230)
                        .add(14, 14, 14)
                        .add(pwdKonfirmasi, 352, 352, 352))))
        );
        pnlCardLayout.setVerticalGroup(
            pnlCardLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlCardLayout.createSequentialGroup()
                .add(24, 24, 24)
                .add(pnlCardLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblUsername, 20, 20, 20)
                    .add(txtUsername, 32, 32, 32))
                .add(14, 14, 14)
                .add(pnlCardLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblLama, 20, 20, 20)
                    .add(pwdLama, 32, 32, 32))
                .add(14, 14, 14)
                .add(pnlCardLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblBaru, 20, 20, 20)
                    .add(pwdBaru, 32, 32, 32))
                .add(14, 14, 14)
                .add(pnlCardLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblKonfirmasi, 20, 20, 20)
                    .add(pwdKonfirmasi, 32, 32, 32))
                .add(14, 14, 14))
        );

        btnSimpan.setBackground(new java.awt.Color(43, 106, 230));
        btnSimpan.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan Perubahan");
        btnSimpan.setFocusPainted(false);
        btnSimpan.addActionListener(this::btnSimpanActionPerformed);

        btnBatal.setBackground(new java.awt.Color(103, 121, 143));
        btnBatal.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal.setText("Batal");
        btnBatal.setFocusPainted(false);
        btnBatal.addActionListener(this::btnBatalActionPerformed);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(38, 38, 38)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lblTitle, 644, 644, 644)
                            .add(lblHint, 644, 644, 644)
                            .add(pnlCard)))
                    .add(layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(btnBatal, 120, 120, 120)
                        .add(10, 10, 10)
                        .add(btnSimpan, 180, 180, 180)))
                .add(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(26, 26, 26)
                .add(lblTitle, 40, 40, 40)
                .add(6, 6, 6)
                .add(lblHint, 22, 22, 22)
                .add(18, 18, 18)
                .add(pnlCard)
                .add(22, 22, 22)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(btnSimpan, 42, 42, 42)
                    .add(btnBatal, 42, 42, 42))
                .add(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {

        try {

            String baru = new String(pwdBaru.getPassword());

            String konfirmasi = new String(pwdKonfirmasi.getPassword());

            if (!baru.equals(konfirmasi))throw new IllegalArgumentException("Konfirmasi password baru tidak sama.");

            AppConfig.getAuthController().ubahAkunSendiri(

                FormUtil.text(txtUsername),

                new String(pwdLama.getPassword()),

                baru);

            JOptionPane.showMessageDialog(this, "Akun berhasil diperbarui.");

            dispose();

        } catch (Exception ex) {

            FormUtil.error(this, ex);

        }

    }



    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {

        dispose();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel lblBaru;
    private javax.swing.JLabel lblHint;
    private javax.swing.JLabel lblKonfirmasi;
    private javax.swing.JLabel lblLama;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlCard;
    private javax.swing.JPasswordField pwdBaru;
    private javax.swing.JPasswordField pwdKonfirmasi;
    private javax.swing.JPasswordField pwdLama;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

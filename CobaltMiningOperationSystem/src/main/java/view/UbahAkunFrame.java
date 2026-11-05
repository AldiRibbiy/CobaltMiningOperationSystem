package view;

import config.AppConfig;
import javax.swing.*;

/** Frame untuk pemilik akun memperbarui username dan password miliknya sendiri. */
public class UbahAkunFrame extends javax.swing.JFrame {

    public UbahAkunFrame() {
        initComponents();
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
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblLama = new javax.swing.JLabel();
        pwdLama = new javax.swing.JPasswordField();
        lblBaru = new javax.swing.JLabel();
        pwdBaru = new javax.swing.JPasswordField();
        lblKonfirmasi = new javax.swing.JLabel();
        pwdKonfirmasi = new javax.swing.JPasswordField();
        pnlCard = new javax.swing.JPanel();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblTitle.setText("Ubah Akun Saya");
        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));

        lblHint.setText("Perbarui username atau password akun Anda sendiri.");
        lblHint.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblHint.setForeground(new java.awt.Color(103, 121, 143));

        lblUsername.setText("Username Baru");
        lblUsername.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(26, 43, 66));

        txtUsername.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtUsername.setBackground(new java.awt.Color(255, 255, 255));

        lblLama.setText("Password Lama");
        lblLama.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblLama.setForeground(new java.awt.Color(26, 43, 66));

        pwdLama.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        pwdLama.setBackground(new java.awt.Color(255, 255, 255));

        lblBaru.setText("Password Baru (opsional)");
        lblBaru.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblBaru.setForeground(new java.awt.Color(26, 43, 66));

        pwdBaru.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        pwdBaru.setBackground(new java.awt.Color(255, 255, 255));

        lblKonfirmasi.setText("Konfirmasi Password Baru");
        lblKonfirmasi.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblKonfirmasi.setForeground(new java.awt.Color(26, 43, 66));

        pwdKonfirmasi.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        pwdKonfirmasi.setBackground(new java.awt.Color(255, 255, 255));

        pnlCard.setBackground(new java.awt.Color(255, 255, 255));

        btnSimpan.setText("Simpan Perubahan");
        btnSimpan.setFocusPainted(false);
        btnSimpan.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setBackground(new java.awt.Color(43, 106, 230));
        btnSimpan.addActionListener(this::btnSimpanActionPerformed);

        btnBatal.setText("Batal");
        btnBatal.setFocusPainted(false);
        btnBatal.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal.setBackground(new java.awt.Color(103, 121, 143));
        btnBatal.addActionListener(this::btnBatalActionPerformed);

        javax.swing.GroupLayout pnlCardLayout = new javax.swing.GroupLayout(pnlCard);
        pnlCard.setLayout(pnlCardLayout);
        pnlCardLayout.setHorizontalGroup(
            pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCardLayout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addComponent(lblUsername, 230, 230, 230)
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtUsername, 352, 352, 352)
             )
            )
                .addGroup(pnlCardLayout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addComponent(lblLama, 230, 230, 230)
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(pwdLama, 352, 352, 352)
             )
            )
                .addGroup(pnlCardLayout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addComponent(lblBaru, 230, 230, 230)
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(pwdBaru, 352, 352, 352)
             )
            )
                .addGroup(pnlCardLayout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addComponent(lblKonfirmasi, 230, 230, 230)
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(pwdKonfirmasi, 352, 352, 352)
             )
            )
        );
        pnlCardLayout.setVerticalGroup(
            pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCardLayout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(lblUsername, 20, 20, 20)
                  .addComponent(txtUsername, 32, 32, 32)
             )
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(lblLama, 20, 20, 20)
                  .addComponent(pwdLama, 32, 32, 32)
             )
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(lblBaru, 20, 20, 20)
                  .addComponent(pwdBaru, 32, 32, 32)
             )
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(lblKonfirmasi, 20, 20, 20)
                  .addComponent(pwdKonfirmasi, 32, 32, 32)
             )
                 .addGap(14, 14, 14)
            )
        );


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                 .addGap(38, 38, 38)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(lblTitle, 644, 644, 644)
              )
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(lblHint, 644, 644, 644)
              )
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(pnlCard, 644, 644, 644)
              )
             )
                 .addGap(38, 38, 38)
            )
                .addGroup(layout.createSequentialGroup()
                 .addGap(0, 0, Short.MAX_VALUE)
                 .addComponent(btnBatal, 120, 120, 120)
                 .addGap(10, 10, 10)
                 .addComponent(btnSimpan, 180, 180, 180)
                 .addGap(38, 38, 38)
            )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                 .addGap(26, 26, 26)
                 .addComponent(lblTitle, 40, 40, 40)
                 .addGap(6, 6, 6)
                 .addComponent(lblHint, 22, 22, 22)
                 .addGap(18, 18, 18)
                 .addComponent(pnlCard, 218, 218, 218)
                 .addGap(22, 22, 22)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(btnSimpan, 42, 42, 42)
                  .addComponent(btnBatal, 42, 42, 42)
             )
                 .addGap(26, 26, 26)
            )
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

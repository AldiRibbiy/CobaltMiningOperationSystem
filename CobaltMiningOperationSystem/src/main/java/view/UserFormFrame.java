package view;

import config.AppConfig;
import javax.swing.*;

/** Form pembuatan akun pengguna (hanya create; pemilik akun mengatur sendiri). */
public class UserFormFrame extends javax.swing.JFrame {

    public UserFormFrame() {
        initComponents();
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        try { loadOptions(); } catch (Exception ex) { FormUtil.error(this, ex); }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblHint = new javax.swing.JLabel();
        lblPegawai = new javax.swing.JLabel();
        cmbPegawai = new javax.swing.JComboBox();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        pnlCard = new javax.swing.JPanel();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblTitle.setText("Form Akun Pengguna");
        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));

        lblHint.setText("Buat akun untuk pegawai aktif yang belum memiliki akses.");
        lblHint.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblHint.setForeground(new java.awt.Color(103, 121, 143));

        lblPegawai.setText("Pegawai");
        lblPegawai.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblPegawai.setForeground(new java.awt.Color(26, 43, 66));

        cmbPegawai.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        cmbPegawai.setBackground(new java.awt.Color(255, 255, 255));

        lblUsername.setText("Username");
        lblUsername.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(26, 43, 66));

        txtUsername.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtUsername.setBackground(new java.awt.Color(255, 255, 255));

        lblPassword.setText("Password (min. 8 karakter)");
        lblPassword.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(26, 43, 66));

        txtPassword.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtPassword.setBackground(new java.awt.Color(255, 255, 255));

        pnlCard.setBackground(new java.awt.Color(255, 255, 255));

        btnSimpan.setText("Simpan Akun");
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
                 .addComponent(lblPegawai, 230, 230, 230)
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(cmbPegawai, 352, 352, 352)
             )
            )
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
                 .addComponent(lblPassword, 230, 230, 230)
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtPassword, 352, 352, 352)
             )
            )
        );
        pnlCardLayout.setVerticalGroup(
            pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCardLayout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(lblPegawai, 20, 20, 20)
                  .addComponent(cmbPegawai, 32, 32, 32)
             )
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(lblUsername, 20, 20, 20)
                  .addComponent(txtUsername, 32, 32, 32)
             )
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(lblPassword, 20, 20, 20)
                  .addComponent(txtPassword, 32, 32, 32)
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
                 .addComponent(btnSimpan, 160, 160, 160)
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
                 .addComponent(pnlCard, 172, 172, 172)
                 .addGap(22, 22, 22)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(btnSimpan, 42, 42, 42)
                  .addComponent(btnBatal, 42, 42, 42)
             )
                 .addGap(26, 26, 26)
            )
        );
    }// </editor-fold>//GEN-END:initComponents

    private boolean saved;

    public boolean isSaved() { return saved; }



    private void loadOptions() {

        for (model.Pegawai p : AppConfig.getMasterDataController().tampilkanPegawaiTanpaAkun()) {

            cmbPegawai.addItem(new PilihanData(p.getIdPegawai(), p.getNamaPegawai() + " - " + p.getJenisPegawai()));

        }

    }



    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {

        try {

            model.Pegawai pemilik = AppConfig.getMasterDataController()

                .cariPegawaiById(FormUtil.id(cmbPegawai));

            model.User baru = new model.User(0, pemilik,

                FormUtil.text(txtUsername), new String(txtPassword.getPassword()));

            AppConfig.getMasterDataController().tambahUser(baru);

            saved = true;

            JOptionPane.showMessageDialog(this, "Akun pengguna berhasil dibuat.");

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
    private javax.swing.JComboBox cmbPegawai;
    private javax.swing.JLabel lblHint;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPegawai;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlCard;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

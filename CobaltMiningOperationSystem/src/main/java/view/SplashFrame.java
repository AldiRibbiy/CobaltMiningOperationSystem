package view;

import config.AppConfig;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/** Landing page dan loading inisialisasi database. Semua komponen diatur GUI Builder. */
public class SplashFrame extends javax.swing.JFrame {
    private boolean loading;

    public SplashFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        progress.setVisible(false);
        lblStatus.setText("Siap memulai pengelolaan operasional tambang.");
    }

    private void mulai(java.awt.event.ActionEvent evt) {
        if (loading) return;
        loading = true;
        btnMulai.setEnabled(false);
        progress.setVisible(true);
        progress.setIndeterminate(true);
        lblStatus.setText("Menghubungkan database dan mempersiapkan layanan...");
        new SwingWorker<Void, Void>() {
            private Exception error;
            @Override protected Void doInBackground() {
                try { AppConfig.initialize(); } catch (Exception ex) { error = ex; }
                return null;
            }
            @Override protected void done() {
                if (error == null) {
                    dispose();
                    new LoginFrame().setVisible(true);
                } else {
                    progress.setVisible(false);
                    btnMulai.setEnabled(true);
                    loading = false;
                    lblStatus.setText("Koneksi belum berhasil. Periksa database kemudian coba lagi.");
                    JOptionPane.showMessageDialog(SplashFrame.this,
                        "Inisialisasi gagal: " + error.getMessage(), "Koneksi C-MOS", JOptionPane.ERROR_MESSAGE);
                }
            }
        }.execute();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        pnlBackground = new javax.swing.JPanel();
        lblBrand = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblSubtitle = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        btnMulai = new javax.swing.JButton();
        progress = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("C-MOS | Selamat Datang");
        pnlBackground.setBackground(new Color(15, 31, 52));
        lblBrand.setText("C-MOS  /  COBALT MINING SYSTEM");
        lblBrand.setFont(new java.awt.Font("SansSerif", 1, 15));
        lblBrand.setForeground(new Color(100, 168, 255));
        lblTitle.setText("Selamat Datang");
        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 37));
        lblTitle.setForeground(Color.WHITE);
        lblSubtitle.setText("Sistem Pengelolaan Operasional Pertambangan Cobalt");
        lblSubtitle.setFont(new java.awt.Font("SansSerif", 0, 15));
        lblSubtitle.setForeground(new Color(207, 220, 238));
        lblStatus.setText("Memuat aplikasi...");
        lblStatus.setFont(new java.awt.Font("SansSerif", 0, 13));
        lblStatus.setForeground(new Color(207, 220, 238));
        btnMulai.setText("MASUK KE APLIKASI");
        btnMulai.setBackground(new Color(43, 106, 230));
        btnMulai.setForeground(Color.WHITE);
        btnMulai.setFont(new java.awt.Font("SansSerif", 1, 13));
        btnMulai.setFocusPainted(false);
        btnMulai.addActionListener(this::mulai);
        progress.setForeground(new Color(43, 106, 230));
        progress.setVisible(false);

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlBackgroundLayout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblBrand, 540, 540, 540)
                        .addComponent(lblTitle, 540, 540, 540)
                        .addComponent(lblSubtitle, 540, 540, 540)
                        .addComponent(lblStatus, 540, 540, 540)
                        .addComponent(progress, 540, 540, 540)
                        .addComponent(btnMulai, 235, 235, 235))
                    .addGap(60, 60, 60))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlBackgroundLayout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(lblBrand, 28, 28, 28)
                    .addGap(35, 35, 35)
                    .addComponent(lblTitle, 58, 58, 58)
                    .addGap(8, 8, 8)
                    .addComponent(lblSubtitle, 30, 30, 30)
                    .addGap(42, 42, 42)
                    .addComponent(btnMulai, 48, 48, 48)
                    .addGap(20, 20, 20)
                    .addComponent(progress, 12, 12, 12)
                    .addGap(14, 14, 14)
                    .addComponent(lblStatus, 27, 27, 27)
                    .addGap(50, 50, 50))
        );
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JButton btnMulai;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables
}

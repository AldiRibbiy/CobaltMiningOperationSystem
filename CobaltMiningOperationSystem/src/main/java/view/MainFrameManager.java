package view;

import config.AppConfig;
import controller.AuthController;
import javax.swing.*;
import java.awt.*;

/** Frame utama MANAGER dengan sidebar dan area konten yang dapat discroll. */
public class MainFrameManager extends javax.swing.JFrame {
    private final AuthController auth = AppConfig.getAuthController();
    private final java.util.Map<String, JButton> buttons = new java.util.LinkedHashMap<>();
    private final java.util.Map<String, String> titles = new java.util.LinkedHashMap<>();

    public MainFrameManager() {
        initComponents();
        
        JButton[] navButtons = {btnDashboard, btnLaporanProduksi, btnLaporanMonitoring, btnUbahAkun, btnLogout};
        
        for (JButton btn : navButtons) {
            btn.setOpaque(true);
            btn.setContentAreaFilled(true);
            btn.setBorderPainted(false);
        }
        
        if (auth == null || !auth.isLoggedIn() || !auth.isManager()) {
            throw new IllegalStateException("Akses pengguna tidak sesuai.");
        }
        pack();
        setSize(1400, 800);
        setMinimumSize(new java.awt.Dimension(1180, 700));
        setResizable(true);
        setLocationRelativeTo(null);
        lblUser.setText(auth.getCurrentPegawai().getNamaPegawai());
        buttons.put("Dashboard", btnDashboard);
        titles.put("Dashboard", "Dashboard");
        buttons.put("LaporanProduksi", btnLaporanProduksi);
        titles.put("LaporanProduksi", "Laporan Produksi");
        buttons.put("LaporanMonitoring", btnLaporanMonitoring);
        titles.put("LaporanMonitoring", "Laporan Monitoring");
        onMenu("Dashboard");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRoot = new javax.swing.JPanel();
        pnlSidebar = new javax.swing.JPanel();
        lblBrand = new javax.swing.JLabel();
        lblBrandSub = new javax.swing.JLabel();
        lblNavTitle = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JButton();
        btnLaporanProduksi = new javax.swing.JButton();
        btnLaporanMonitoring = new javax.swing.JButton();
        pnlWorkspace = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        lblEyebrow = new javax.swing.JLabel();
        lblPageTitle = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();
        scrollContent = new javax.swing.JScrollPane();
        pnlPageHost = new javax.swing.JPanel();
        btnUbahAkun = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(true);

        pnlRoot.setBackground(new java.awt.Color(244, 247, 252));

        pnlSidebar.setBackground(new java.awt.Color(16, 30, 51));

        lblBrand.setText("C-MOS");
        lblBrand.setFont(new java.awt.Font("SansSerif", 1, 31)); // NOI18N
        lblBrand.setForeground(new java.awt.Color(255, 255, 255));

        lblBrandSub.setText("COBALT MINING SYSTEM");
        lblBrandSub.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        lblBrandSub.setForeground(new java.awt.Color(145, 167, 194));

        lblNavTitle.setText("NAVIGASI  /  MANAGER");
        lblNavTitle.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        lblNavTitle.setForeground(new java.awt.Color(145, 167, 194));

        btnDashboard.setText("Dashboard");
        btnDashboard.setFocusPainted(false);
        btnDashboard.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setBackground(new java.awt.Color(27, 47, 74));
        btnDashboard.addActionListener(this::btnDashboardActionPerformed);

        btnLaporanProduksi.setText("Laporan Produksi");
        btnLaporanProduksi.setFocusPainted(false);
        btnLaporanProduksi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnLaporanProduksi.setForeground(new java.awt.Color(255, 255, 255));
        btnLaporanProduksi.setBackground(new java.awt.Color(27, 47, 74));
        btnLaporanProduksi.addActionListener(this::btnLaporanProduksiActionPerformed);

        btnLaporanMonitoring.setText("Laporan Monitoring");
        btnLaporanMonitoring.setFocusPainted(false);
        btnLaporanMonitoring.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnLaporanMonitoring.setForeground(new java.awt.Color(255, 255, 255));
        btnLaporanMonitoring.setBackground(new java.awt.Color(27, 47, 74));
        btnLaporanMonitoring.addActionListener(this::btnLaporanMonitoringActionPerformed);

        pnlWorkspace.setBackground(new java.awt.Color(244, 247, 252));

        pnlHeader.setBackground(new java.awt.Color(255, 255, 255));

        lblEyebrow.setText("COBALT MINING  /  MANAGER");
        lblEyebrow.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        lblEyebrow.setForeground(new java.awt.Color(43, 106, 230));

        lblPageTitle.setText("Dashboard");
        lblPageTitle.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblPageTitle.setForeground(new java.awt.Color(26, 43, 66));

        lblUser.setText("Pengguna");
        lblUser.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        lblUser.setForeground(new java.awt.Color(26, 43, 66));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblRole.setText("MANAGER");
        lblRole.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblRole.setForeground(new java.awt.Color(103, 121, 143));
        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pnlContent.setBackground(new java.awt.Color(244, 247, 252));

        scrollContent.setBackground(new java.awt.Color(244, 247, 252));

        pnlPageHost.setBackground(new java.awt.Color(244, 247, 252));

        btnUbahAkun.setText("Ubah Akun");
        btnUbahAkun.setFocusPainted(false);
        btnUbahAkun.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnUbahAkun.setForeground(new java.awt.Color(255, 255, 255));
        btnUbahAkun.setBackground(new java.awt.Color(27, 47, 74));
        btnUbahAkun.addActionListener(this::btnUbahAkunActionPerformed);

        btnLogout.setText("Keluar Akun");
        btnLogout.setFocusPainted(false);
        btnLogout.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setBackground(new java.awt.Color(27, 47, 74));
        btnLogout.addActionListener(this::btnLogoutActionPerformed);

        javax.swing.GroupLayout pnlRootLayout = new javax.swing.GroupLayout(pnlRoot);
        pnlRoot.setLayout(pnlRootLayout);
        pnlRootLayout.setHorizontalGroup(
            pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlRootLayout.createSequentialGroup()
                 .addComponent(pnlSidebar, 250, 250, 250)
                 .addGap(0, 0, 0)
                 .addComponent(pnlWorkspace, 0, 934, Short.MAX_VALUE)
            )
        );
        pnlRootLayout.setVerticalGroup(
            pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addComponent(pnlSidebar, 0, 712, Short.MAX_VALUE)
                 .addComponent(pnlWorkspace, 0, 712, Short.MAX_VALUE)
            )
        );

        javax.swing.GroupLayout pnlSidebarLayout = new javax.swing.GroupLayout(pnlSidebar);
        pnlSidebar.setLayout(pnlSidebarLayout);
        pnlSidebarLayout.setHorizontalGroup(
            pnlSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSidebarLayout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addGroup(pnlSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblBrand, 202, 202, 202)
                  .addComponent(lblBrandSub, 202, 202, 202)
                  .addComponent(lblNavTitle, 202, 202, 202)
                  .addComponent(btnDashboard, 202, 202, 202)
                  .addComponent(btnLaporanProduksi, 202, 202, 202)
                  .addComponent(btnLaporanMonitoring, 202, 202, 202)
                  .addComponent(btnUbahAkun, 202, 202, 202)
                  .addComponent(btnLogout, 202, 202, 202)
             )
                 .addGap(24, 24, 24)
            )
        );
        pnlSidebarLayout.setVerticalGroup(
            pnlSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSidebarLayout.createSequentialGroup()
                 .addGap(26, 26, 26)
                 .addComponent(lblBrand, 44, 44, 44)
                 .addGap(2, 2, 2)
                 .addComponent(lblBrandSub, 20, 20, 20)
                 .addGap(22, 22, 22)
                 .addComponent(lblNavTitle, 18, 18, 18)
                 .addGap(10, 10, 10)
                 .addComponent(btnDashboard, 42, 42, 42)
                 .addGap(6, 6, 6)
                 .addComponent(btnLaporanProduksi, 42, 42, 42)
                 .addGap(6, 6, 6)
                 .addComponent(btnLaporanMonitoring, 42, 42, 42)
                 .addGap(0, 0, Short.MAX_VALUE)
                 .addComponent(btnUbahAkun, 42, 42, 42)
                 .addGap(6, 6, 6)
                 .addComponent(btnLogout, 42, 42, 42)
                 .addGap(24, 24, 24)
            )
        );

        javax.swing.GroupLayout pnlWorkspaceLayout = new javax.swing.GroupLayout(pnlWorkspace);
        pnlWorkspace.setLayout(pnlWorkspaceLayout);
        pnlWorkspaceLayout.setHorizontalGroup(
            pnlWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addComponent(pnlHeader, 0, 934, Short.MAX_VALUE)
                 .addComponent(pnlContent, 0, 934, Short.MAX_VALUE)
            )
        );
        pnlWorkspaceLayout.setVerticalGroup(
            pnlWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlWorkspaceLayout.createSequentialGroup()
                 .addComponent(pnlHeader, 88, 88, 88)
                 .addGap(12, 12, 12)
                 .addComponent(pnlContent, 0, 612, Short.MAX_VALUE)
            )
        );

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlHeaderLayout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(pnlHeaderLayout.createSequentialGroup()
                   .addComponent(lblEyebrow, 460, 460, 460)
              )
                  .addGroup(pnlHeaderLayout.createSequentialGroup()
                   .addComponent(lblPageTitle, 460, 460, 460)
              )
             )
                 .addGap(0, 0, Short.MAX_VALUE)
                 .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblUser, 220, 220, 220)
                  .addComponent(lblRole, 220, 220, 220)
             )
                 .addGap(24, 24, 24)
            )
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGroup(pnlHeaderLayout.createSequentialGroup()
                  .addGap(14, 14, 14)
                  .addComponent(lblEyebrow, 18, 18, 18)
                  .addGap(2, 2, 2)
                  .addComponent(lblPageTitle, 40, 40, 40)
                  .addGap(14, 14, 14)
             )
                 .addGroup(pnlHeaderLayout.createSequentialGroup()
                  .addGap(16, 16, 16)
                  .addComponent(lblUser, 24, 24, 24)
                  .addGap(3, 3, 3)
                  .addComponent(lblRole, 20, 20, 20)
             )
            )
        );

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addComponent(scrollContent, 0, 934, Short.MAX_VALUE)
            )
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addComponent(scrollContent, 0, 612, Short.MAX_VALUE)
            )
        );

        pnlPageHost.setLayout(new java.awt.BorderLayout());

        scrollContent.setViewportView(pnlPageHost);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                 .addComponent(pnlRoot, 0, 1184, Short.MAX_VALUE)
            )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                 .addComponent(pnlRoot, 0, 712, Short.MAX_VALUE)
            )
        );
    }// </editor-fold>//GEN-END:initComponents

    private void onMenu(String menu) {

        if ("Logout".equals(menu)) {

            int answer = JOptionPane.showConfirmDialog(this, "Keluar dari akun C-MOS?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            if (answer == JOptionPane.YES_OPTION) {

                auth.logout();

                new LoginFrame().setVisible(true);

                dispose();

            }

            return;

        }



        if ("UbahAkun".equals(menu)) {

            new UbahAkunFrame().setVisible(true);

            return;

        }



        if (!buttons.containsKey(menu)) return;

        lblPageTitle.setText(titles.getOrDefault(menu, menu));

        JPanel page = ViewFactory.create(menu, "Manager", this::onMenu);

        pnlPageHost.removeAll();

        // Area halaman menggunakan BorderLayout dari GUI Builder.
        // Komponen konten mengisi seluruh lebar viewport.

        pnlPageHost.add(page, java.awt.BorderLayout.CENTER);

        pnlPageHost.revalidate();

        pnlPageHost.repaint();

        scrollContent.getVerticalScrollBar().setUnitIncrement(20);

        scrollContent.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        scrollContent.getViewport().setViewPosition(new java.awt.Point(0, 0));

    }

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) { onMenu("Dashboard"); }

    private void btnLaporanProduksiActionPerformed(java.awt.event.ActionEvent evt) { onMenu("LaporanProduksi"); }

    private void btnLaporanMonitoringActionPerformed(java.awt.event.ActionEvent evt) { onMenu("LaporanMonitoring"); }

    private void btnUbahAkunActionPerformed(java.awt.event.ActionEvent evt) { onMenu("UbahAkun"); }

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) { onMenu("Logout"); }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnLaporanMonitoring;
    private javax.swing.JButton btnLaporanProduksi;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUbahAkun;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblBrandSub;
    private javax.swing.JLabel lblEyebrow;
    private javax.swing.JLabel lblNavTitle;
    private javax.swing.JLabel lblPageTitle;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlPageHost;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlSidebar;
    private javax.swing.JPanel pnlWorkspace;
    private javax.swing.JScrollPane scrollContent;
    // End of variables declaration//GEN-END:variables
}

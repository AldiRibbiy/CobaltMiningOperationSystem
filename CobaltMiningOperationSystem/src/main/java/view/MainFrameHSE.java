package view;
import config.AppConfig;
import controller.AuthController;
import javax.swing.*;
import java.awt.*;
public class MainFrameHSE extends javax.swing.JFrame {
    private final AuthController auth = AppConfig.getAuthController();
    private String active = "";
    private final java.util.Map<String, JButton> buttons = new java.util.LinkedHashMap<>();

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
        if (!buttons.containsKey(menu)) return;
        active = menu;
        for (java.util.Map.Entry<String, JButton> item : buttons.entrySet()) {
            item.getValue().setBackground(item.getKey().equals(menu) ? new Color(43, 106, 230) : new Color(27, 47, 74));
        }
        lblPageTitle.setText(menu.replace("Laporan", "Laporan "));
        JPanel page = ViewFactory.create(menu, "HSE", this::onMenu);
        pnlContent.removeAll();
        pnlContent.setLayout(new BorderLayout());
        pnlContent.add(page, BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
    }

    public MainFrameHSE() {
        initComponents();
        
        JButton[] navButtons = {btnDashboard, btnMonitoring, btnLogout};

        for (JButton btn : navButtons) {
            btn.setOpaque(true);
            btn.setContentAreaFilled(true);
            btn.setBorderPainted(false);
        }
        
        if (auth == null || !auth.isLoggedIn() || !auth.isPetugasHSE()) {
            throw new IllegalStateException("Akses pengguna tidak sesuai.");
        }
        setSize(1200, 750);
        setResizable(false);
        setLocationRelativeTo(null);
        lblUser.setText(auth.getCurrentPegawai().getNamaPegawai());
        buttons.put("Dashboard", btnDashboard);
        buttons.put("Monitoring", btnMonitoring);
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
        btnMonitoring = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        pnlWorkspace = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        lblEyebrow = new javax.swing.JLabel();
        lblPageTitle = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlRoot.setBackground(new java.awt.Color(244, 247, 252));

        pnlSidebar.setBackground(new java.awt.Color(69, 40, 41));

        lblBrand.setFont(new java.awt.Font("SansSerif", 1, 31)); // NOI18N
        lblBrand.setForeground(new java.awt.Color(243, 232, 223));
        lblBrand.setText("C-MOS");

        lblBrandSub.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        lblBrandSub.setForeground(new java.awt.Color(232, 209, 197));
        lblBrandSub.setText("COBALT MINING SYSTEM");

        lblNavTitle.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        lblNavTitle.setForeground(new java.awt.Color(232, 209, 197));
        lblNavTitle.setText("NAVIGASI  /  HSE");

        btnDashboard.setBackground(new java.awt.Color(232, 209, 197));
        btnDashboard.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(87, 89, 91));
        btnDashboard.setText("Dashboard");
        btnDashboard.addActionListener(this::btnDashboardActionPerformed);

        btnMonitoring.setBackground(new java.awt.Color(232, 209, 197));
        btnMonitoring.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnMonitoring.setForeground(new java.awt.Color(87, 89, 91));
        btnMonitoring.setText("Monitoring Lingkungan");
        btnMonitoring.addActionListener(this::btnMonitoringActionPerformed);

        btnLogout.setBackground(new java.awt.Color(232, 209, 197));
        btnLogout.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(87, 89, 91));
        btnLogout.setText("Keluar Akun");
        btnLogout.addActionListener(this::btnLogoutActionPerformed);

        org.jdesktop.layout.GroupLayout pnlSidebarLayout = new org.jdesktop.layout.GroupLayout(pnlSidebar);
        pnlSidebar.setLayout(pnlSidebarLayout);
        pnlSidebarLayout.setHorizontalGroup(
            pnlSidebarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlSidebarLayout.createSequentialGroup()
                .add(pnlSidebarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlSidebarLayout.createSequentialGroup()
                        .add(28, 28, 28)
                        .add(lblBrand, 200, 200, 200))
                    .add(pnlSidebarLayout.createSequentialGroup()
                        .add(29, 29, 29)
                        .add(lblBrandSub, 210, 210, 210))
                    .add(pnlSidebarLayout.createSequentialGroup()
                        .add(28, 28, 28)
                        .add(lblNavTitle, 215, 215, 215))
                    .add(pnlSidebarLayout.createSequentialGroup()
                        .add(22, 22, 22)
                        .add(btnDashboard, 210, 210, 210))
                    .add(pnlSidebarLayout.createSequentialGroup()
                        .add(22, 22, 22)
                        .add(btnMonitoring, 210, 210, 210))
                    .add(pnlSidebarLayout.createSequentialGroup()
                        .add(22, 22, 22)
                        .add(btnLogout, 210, 210, 210)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSidebarLayout.setVerticalGroup(
            pnlSidebarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlSidebarLayout.createSequentialGroup()
                .add(pnlSidebarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlSidebarLayout.createSequentialGroup()
                        .add(24, 24, 24)
                        .add(lblBrand, 46, 46, 46))
                    .add(pnlSidebarLayout.createSequentialGroup()
                        .add(76, 76, 76)
                        .add(lblBrandSub, 20, 20, 20))
                    .add(pnlSidebarLayout.createSequentialGroup()
                        .add(137, 137, 137)
                        .add(lblNavTitle, 26, 26, 26))
                    .add(pnlSidebarLayout.createSequentialGroup()
                        .add(177, 177, 177)
                        .add(btnDashboard, 42, 42, 42))
                    .add(pnlSidebarLayout.createSequentialGroup()
                        .add(229, 229, 229)
                        .add(btnMonitoring, 42, 42, 42))
                    .add(pnlSidebarLayout.createSequentialGroup()
                        .add(653, 653, 653)
                        .add(btnLogout, 42, 42, 42)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout pnlRootLayout = new org.jdesktop.layout.GroupLayout(pnlRoot);
        pnlRoot.setLayout(pnlRootLayout);
        pnlRootLayout.setHorizontalGroup(
            pnlRootLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlRootLayout.createSequentialGroup()
                .add(pnlSidebar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        pnlRootLayout.setVerticalGroup(
            pnlRootLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlSidebar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlWorkspace.setBackground(new java.awt.Color(244, 247, 252));

        pnlHeader.setBackground(new java.awt.Color(255, 255, 255));

        lblEyebrow.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        lblEyebrow.setForeground(new java.awt.Color(43, 106, 230));
        lblEyebrow.setText("COBALT MINING  /  HSE");

        lblPageTitle.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblPageTitle.setForeground(new java.awt.Color(26, 43, 66));
        lblPageTitle.setText("Dashboard");

        lblUser.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        lblUser.setForeground(new java.awt.Color(26, 43, 66));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setText("Pengguna");

        lblRole.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblRole.setForeground(new java.awt.Color(103, 121, 143));
        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRole.setText("HSE");

        org.jdesktop.layout.GroupLayout pnlHeaderLayout = new org.jdesktop.layout.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlHeaderLayout.createSequentialGroup()
                .add(26, 26, 26)
                .add(pnlHeaderLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblEyebrow, 520, 520, 520)
                    .add(lblPageTitle, 550, 550, 550))
                .add(104, 104, 104)
                .add(pnlHeaderLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblRole, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlHeaderLayout.createSequentialGroup()
                .add(10, 10, 10)
                .add(lblEyebrow, 24, 24, 24))
            .add(pnlHeaderLayout.createSequentialGroup()
                .add(35, 35, 35)
                .add(lblPageTitle, 45, 45, 45))
            .add(pnlHeaderLayout.createSequentialGroup()
                .add(13, 13, 13)
                .add(lblUser, 26, 26, 26))
            .add(pnlHeaderLayout.createSequentialGroup()
                .add(43, 43, 43)
                .add(lblRole, 25, 25, 25))
        );

        pnlContent.setBackground(new java.awt.Color(244, 247, 252));

        org.jdesktop.layout.GroupLayout pnlContentLayout = new org.jdesktop.layout.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 616, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout pnlWorkspaceLayout = new org.jdesktop.layout.GroupLayout(pnlWorkspace);
        pnlWorkspace.setLayout(pnlWorkspaceLayout);
        pnlWorkspaceLayout.setHorizontalGroup(
            pnlWorkspaceLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlWorkspaceLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlWorkspaceLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(pnlHeader, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(pnlContent, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnlWorkspaceLayout.setVerticalGroup(
            pnlWorkspaceLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlWorkspaceLayout.createSequentialGroup()
                .add(12, 12, 12)
                .add(pnlHeader, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(pnlContent, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(pnlRoot, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(pnlWorkspace, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlRoot, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(pnlWorkspace, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 720, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) { onMenu("Dashboard"); }
    private void btnMonitoringActionPerformed(java.awt.event.ActionEvent evt) { onMenu("Monitoring"); }
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) { onMenu("Logout"); }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMonitoring;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblBrandSub;
    private javax.swing.JLabel lblEyebrow;
    private javax.swing.JLabel lblNavTitle;
    private javax.swing.JLabel lblPageTitle;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlSidebar;
    private javax.swing.JPanel pnlWorkspace;
    // End of variables declaration//GEN-END:variables
}

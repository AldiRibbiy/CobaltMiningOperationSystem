package view;

import config.AppConfig;
import javax.swing.JOptionPane;

/** Landing page C-MOS: profil PT. Cobalt, modul operasional, tim pengembang, dan menu login.
 * Desain dibuat dengan GUI Builder (LandingFrame.form); navigasi gulir dijalankan lewat Timer. */

public class LandingFrame extends javax.swing.JFrame {

    public LandingFrame() {
        initComponents();
        setLocationRelativeTo(null);

        // Kursor tangan pada tombol dan navigasi (perilaku interaksi, bukan desain).
        javax.swing.JComponent[] interaktif = {btnLoginTop, btnHeroLogin, btnPelajari,
            lblNavTentang, lblNavOperasi, lblNavTim};
        for (javax.swing.JComponent komponen : interaktif) {
            komponen.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTopBar = new javax.swing.JPanel();
        lblLogoSm = new javax.swing.JLabel();
        lblBrandTop = new javax.swing.JLabel();
        lblBrandTopSub = new javax.swing.JLabel();
        lblNavTentang = new javax.swing.JLabel();
        lblNavOperasi = new javax.swing.JLabel();
        lblNavTim = new javax.swing.JLabel();
        btnLoginTop = new javax.swing.JButton();
        pnlTopAccent = new javax.swing.JPanel();
        scrollMain = new javax.swing.JScrollPane();
        pnlPage = new javax.swing.JPanel();
        lblHeroKicker = new javax.swing.JLabel();
        lblHeroTitle = new javax.swing.JLabel();
        lblHeroSub = new javax.swing.JLabel();
        btnHeroLogin = new javax.swing.JButton();
        btnPelajari = new javax.swing.JButton();
        imgHero = new javax.swing.JLabel();
        lblHeroCaption = new javax.swing.JLabel();
        lblTentangKicker = new javax.swing.JLabel();
        lblTentangTitle = new javax.swing.JLabel();
        lblTentangLead = new javax.swing.JLabel();
        lblTentangP1 = new javax.swing.JLabel();
        lblTentangP2 = new javax.swing.JLabel();
        lblTentangP3 = new javax.swing.JLabel();
        imgTentang = new javax.swing.JLabel();
        lblTentangCaption = new javax.swing.JLabel();
        lblStatValue0 = new javax.swing.JLabel();
        lblStatTitle0 = new javax.swing.JLabel();
        lblStatSub0 = new javax.swing.JLabel();
        lblStatValue1 = new javax.swing.JLabel();
        lblStatTitle1 = new javax.swing.JLabel();
        lblStatSub1 = new javax.swing.JLabel();
        lblStatValue2 = new javax.swing.JLabel();
        lblStatTitle2 = new javax.swing.JLabel();
        lblStatSub2 = new javax.swing.JLabel();
        lblStatValue3 = new javax.swing.JLabel();
        lblStatTitle3 = new javax.swing.JLabel();
        lblStatSub3 = new javax.swing.JLabel();
        lblOpsKicker = new javax.swing.JLabel();
        lblOpsTitle = new javax.swing.JLabel();
        lblOpsSub = new javax.swing.JLabel();
        imgOps0 = new javax.swing.JLabel();
        lblOpsCardTitle0 = new javax.swing.JLabel();
        lblOpsCardDesc0 = new javax.swing.JLabel();
        lblOpsCardTag0 = new javax.swing.JLabel();
        imgOps1 = new javax.swing.JLabel();
        lblOpsCardTitle1 = new javax.swing.JLabel();
        lblOpsCardDesc1 = new javax.swing.JLabel();
        lblOpsCardTag1 = new javax.swing.JLabel();
        imgOps2 = new javax.swing.JLabel();
        lblOpsCardTitle2 = new javax.swing.JLabel();
        lblOpsCardDesc2 = new javax.swing.JLabel();
        lblOpsCardTag2 = new javax.swing.JLabel();
        lblCmosKicker = new javax.swing.JLabel();
        lblCmosTitle = new javax.swing.JLabel();
        lblCmosDesc = new javax.swing.JLabel();
        imgCmosLogo = new javax.swing.JLabel();
        lblFeat0 = new javax.swing.JLabel();
        lblFeat1 = new javax.swing.JLabel();
        lblFeat2 = new javax.swing.JLabel();
        lblFeat3 = new javax.swing.JLabel();
        lblTimKicker = new javax.swing.JLabel();
        lblTimTitle = new javax.swing.JLabel();
        lblTimSub = new javax.swing.JLabel();
        imgTim0 = new javax.swing.JLabel();
        lblTimNama0 = new javax.swing.JLabel();
        lblTimNim0 = new javax.swing.JLabel();
        imgTim1 = new javax.swing.JLabel();
        lblTimNama1 = new javax.swing.JLabel();
        lblTimNim1 = new javax.swing.JLabel();
        imgTim2 = new javax.swing.JLabel();
        lblTimNama2 = new javax.swing.JLabel();
        lblTimNim2 = new javax.swing.JLabel();
        imgTim3 = new javax.swing.JLabel();
        lblTimNama3 = new javax.swing.JLabel();
        lblTimNim3 = new javax.swing.JLabel();
        imgFooterLogo = new javax.swing.JLabel();
        lblFooter1 = new javax.swing.JLabel();
        lblFooter2 = new javax.swing.JLabel();
        lblFooter3 = new javax.swing.JLabel();
        pnlStatAccent0 = new javax.swing.JPanel();
        pnlStatAccent1 = new javax.swing.JPanel();
        pnlStatAccent2 = new javax.swing.JPanel();
        pnlStatAccent3 = new javax.swing.JPanel();
        pnlOpsAccent0 = new javax.swing.JPanel();
        pnlOpsAccent1 = new javax.swing.JPanel();
        pnlOpsAccent2 = new javax.swing.JPanel();
        pnlTimAccent0 = new javax.swing.JPanel();
        pnlTimAccent1 = new javax.swing.JPanel();
        pnlTimAccent2 = new javax.swing.JPanel();
        pnlTimAccent3 = new javax.swing.JPanel();
        pnlStat0 = new javax.swing.JPanel();
        pnlStat1 = new javax.swing.JPanel();
        pnlStat2 = new javax.swing.JPanel();
        pnlStat3 = new javax.swing.JPanel();
        pnlOpsCard0 = new javax.swing.JPanel();
        pnlOpsCard1 = new javax.swing.JPanel();
        pnlOpsCard2 = new javax.swing.JPanel();
        pnlFeat0 = new javax.swing.JPanel();
        pnlFeat1 = new javax.swing.JPanel();
        pnlFeat2 = new javax.swing.JPanel();
        pnlFeat3 = new javax.swing.JPanel();
        pnlTim0 = new javax.swing.JPanel();
        pnlTim1 = new javax.swing.JPanel();
        pnlTim2 = new javax.swing.JPanel();
        pnlTim3 = new javax.swing.JPanel();
        pnlHeroBg = new javax.swing.JPanel();
        pnlTentangBg = new javax.swing.JPanel();
        pnlOpsBg = new javax.swing.JPanel();
        pnlCmosBg = new javax.swing.JPanel();
        pnlTimBg = new javax.swing.JPanel();
        pnlFooterBg = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("C-MOS | PT. Cobalt");
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 800));

        pnlTopBar.setBackground(new java.awt.Color(73, 54, 40));

        lblLogoSm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cobalt-symbol-sm.png")));

        lblBrandTop.setText("C-MOS"); // NOI18N
        lblBrandTop.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblBrandTop.setForeground(new java.awt.Color(214, 192, 179));

        lblBrandTopSub.setText("COBALT MINING SYSTEM"); // NOI18N
        lblBrandTopSub.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        lblBrandTopSub.setForeground(new java.awt.Color(228, 224, 225));

        lblNavTentang.setText("Tentang"); // NOI18N
        lblNavTentang.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblNavTentang.setForeground(new java.awt.Color(228, 224, 225));
        lblNavTentang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNavTentangMouseClicked(evt);
            }
        });

        lblNavOperasi.setText("Operasional"); // NOI18N
        lblNavOperasi.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblNavOperasi.setForeground(new java.awt.Color(228, 224, 225));
        lblNavOperasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNavOperasiMouseClicked(evt);
            }
        });

        lblNavTim.setText("Tim Kami"); // NOI18N
        lblNavTim.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblNavTim.setForeground(new java.awt.Color(228, 224, 225));
        lblNavTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNavTimMouseClicked(evt);
            }
        });

        btnLoginTop.setText("MASUK"); // NOI18N
        btnLoginTop.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnLoginTop.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginTop.setBackground(new java.awt.Color(171, 136, 109));
        btnLoginTop.setFocusPainted(false);
        btnLoginTop.setBorderPainted(false);
        btnLoginTop.addActionListener(this::btnLoginTopActionPerformed);

        pnlTopAccent.setBackground(new java.awt.Color(171, 136, 109));

        org.jdesktop.layout.GroupLayout pnlTopBarLayout = new org.jdesktop.layout.GroupLayout(pnlTopBar);
        pnlTopBar.setLayout(pnlTopBarLayout);
        pnlTopBarLayout.setHorizontalGroup(
            pnlTopBarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlTopBarLayout.createSequentialGroup()
                .add(40, 40, 40)
                .add(lblLogoSm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlTopBarLayout.createSequentialGroup()
                .add(110, 110, 110)
                .add(lblBrandTop, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlTopBarLayout.createSequentialGroup()
                .add(110, 110, 110)
                .add(lblBrandTopSub, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 220, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlTopBarLayout.createSequentialGroup()
                .add(660, 660, 660)
                .add(lblNavTentang, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlTopBarLayout.createSequentialGroup()
                .add(760, 760, 760)
                .add(lblNavOperasi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlTopBarLayout.createSequentialGroup()
                .add(890, 890, 890)
                .add(lblNavTim, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlTopBarLayout.createSequentialGroup()
                .add(1120, 1120, 1120)
                .add(btnLoginTop, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlTopBarLayout.createSequentialGroup()
                .add(0, 0, 0)
                .add(pnlTopAccent, 0, 1280, Short.MAX_VALUE))
        );
        pnlTopBarLayout.setVerticalGroup(
            pnlTopBarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlTopBarLayout.createSequentialGroup()
                .add(24, 24, 24)
                .add(lblLogoSm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlTopBarLayout.createSequentialGroup()
                .add(15, 15, 15)
                .add(lblBrandTop, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlTopBarLayout.createSequentialGroup()
                .add(47, 47, 47)
                .add(lblBrandTopSub, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlTopBarLayout.createSequentialGroup()
                .add(32, 32, 32)
                .add(lblNavTentang, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlTopBarLayout.createSequentialGroup()
                .add(32, 32, 32)
                .add(lblNavOperasi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlTopBarLayout.createSequentialGroup()
                .add(32, 32, 32)
                .add(lblNavTim, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlTopBarLayout.createSequentialGroup()
                .add(22, 22, 22)
                .add(btnLoginTop, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlTopBarLayout.createSequentialGroup()
                .add(86, 86, 86)
                .add(pnlTopAccent, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        scrollMain.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollMain.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        pnlPage.setBackground(new java.awt.Color(243, 238, 231));

        lblHeroKicker.setText("◆  SISTEM INFORMASI MANAJEMEN OPERASIONAL PERTAMBANGAN"); // NOI18N
        lblHeroKicker.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblHeroKicker.setForeground(new java.awt.Color(171, 136, 109));

        lblHeroTitle.setText("<html>COBALT MINING<br>OPERATION SYSTEM</html>"); // NOI18N
        lblHeroTitle.setFont(new java.awt.Font("SansSerif", 1, 38)); // NOI18N
        lblHeroTitle.setForeground(new java.awt.Color(250, 247, 243));

        lblHeroSub.setText("<html>Aplikasi desktop terintegrasi untuk mengelola <b>produksi tambang</b>, <b>pengangkutan material</b>, armada <b>kendaraan &amp; driver</b>, serta <b>monitoring lingkungan</b> PT. Cobalt — semuanya terpusat dalam satu sistem.</html>"); // NOI18N
        lblHeroSub.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblHeroSub.setForeground(new java.awt.Color(214, 192, 179));

        btnHeroLogin.setText("MASUK KE SISTEM »"); // NOI18N
        btnHeroLogin.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnHeroLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnHeroLogin.setBackground(new java.awt.Color(171, 136, 109));
        btnHeroLogin.setFocusPainted(false);
        btnHeroLogin.setBorderPainted(false);
        btnHeroLogin.addActionListener(this::btnHeroLoginActionPerformed);

        btnPelajari.setText("PELAJARI LEBIH LANJUT"); // NOI18N
        btnPelajari.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnPelajari.setForeground(new java.awt.Color(214, 192, 179));
        btnPelajari.setBackground(new java.awt.Color(63, 50, 40));
        btnPelajari.setFocusPainted(false);
        btnPelajari.setBorderPainted(false);
        btnPelajari.addActionListener(this::btnPelajariActionPerformed);

        imgHero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/landing/hero_tambang_display.png")));

        lblHeroCaption.setText("Ilustrasi area tambang terbuka PT. Cobalt — lokasi PIT dan stockpile"); // NOI18N
        lblHeroCaption.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblHeroCaption.setForeground(new java.awt.Color(148, 133, 124));
        lblHeroCaption.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblTentangKicker.setText("◆  TENTANG PERUSAHAAN"); // NOI18N
        lblTentangKicker.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblTentangKicker.setForeground(new java.awt.Color(171, 136, 109));

        lblTentangTitle.setText("PT. COBALT"); // NOI18N
        lblTentangTitle.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        lblTentangTitle.setForeground(new java.awt.Color(26, 43, 66));

        lblTentangLead.setText("Perusahaan pertambangan kobalt dengan pengelolaan operasional yang terpusat dan berkelanjutan."); // NOI18N
        lblTentangLead.setFont(new java.awt.Font("SansSerif", 2, 13)); // NOI18N
        lblTentangLead.setForeground(new java.awt.Color(71, 86, 105));

        lblTentangP1.setText("<html>PT. Cobalt merupakan perusahaan pertambangan yang mengelola kegiatan <b>produksi tambang</b>, <b>pengangkutan hasil tambang</b>, penggunaan kendaraan operasional dan driver, hingga <b>pemantauan kondisi lingkungan</b>. Seluruh kegiatan berjalan pada lokasi PIT (area penambangan) dan STOCKPILE (penampungan material) yang tersebar di berbagai titik operasional.</html>"); // NOI18N
        lblTentangP1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblTentangP1.setForeground(new java.awt.Color(71, 86, 105));

        lblTentangP2.setText("<html>Setiap hari, tim operasional mencatat hasil produksi material seperti <i>Cobalt Ore</i> dan <i>Overburden</i>, merencanakan pengangkutan menggunakan armada dump truck, serta memantau parameter lingkungan seperti debu, pH air, dan kebisingan. Data yang saling berkaitan tersebut dikelola secara terstruktur agar operasional berjalan aman, efektif, dan berkelanjutan.</html>"); // NOI18N
        lblTentangP2.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblTentangP2.setForeground(new java.awt.Color(71, 86, 105));

        lblTentangP3.setText("<html>Melalui digitalisasi proses operasional, PT. Cobalt mendukung prinsip pertambangan yang bertanggung jawab — sejalan dengan <b>SDG 8</b> (Pekerjaan Layak dan Pertumbuhan Ekonomi), <b>SDG 12</b> (Konsumsi dan Produksi yang Bertanggung Jawab), serta <b>SDG 13</b> (Penanganan Perubahan Iklim).</html>"); // NOI18N
        lblTentangP3.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblTentangP3.setForeground(new java.awt.Color(71, 86, 105));

        imgTentang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/landing/tentang_display.png")));

        lblTentangCaption.setText("Tim operasional memverifikasi rencana kerja di area tambang"); // NOI18N
        lblTentangCaption.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblTentangCaption.setForeground(new java.awt.Color(148, 133, 124));
        lblTentangCaption.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblStatValue0.setText("15"); // NOI18N
        lblStatValue0.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblStatValue0.setForeground(new java.awt.Color(26, 43, 66));
        lblStatValue0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblStatTitle0.setText("LOKASI TAMBANG"); // NOI18N
        lblStatTitle0.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblStatTitle0.setForeground(new java.awt.Color(103, 121, 143));
        lblStatTitle0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblStatSub0.setText("PIT dan Stockpile"); // NOI18N
        lblStatSub0.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblStatSub0.setForeground(new java.awt.Color(103, 121, 143));
        lblStatSub0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblStatValue1.setText("3"); // NOI18N
        lblStatValue1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblStatValue1.setForeground(new java.awt.Color(26, 43, 66));
        lblStatValue1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblStatTitle1.setText("MODUL OPERASIONAL"); // NOI18N
        lblStatTitle1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblStatTitle1.setForeground(new java.awt.Color(103, 121, 143));
        lblStatTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblStatSub1.setText("Produksi · Pengangkutan · Monitoring"); // NOI18N
        lblStatSub1.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblStatSub1.setForeground(new java.awt.Color(103, 121, 143));
        lblStatSub1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblStatValue2.setText("4"); // NOI18N
        lblStatValue2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblStatValue2.setForeground(new java.awt.Color(26, 43, 66));
        lblStatValue2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblStatTitle2.setText("PERAN PENGGUNA"); // NOI18N
        lblStatTitle2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblStatTitle2.setForeground(new java.awt.Color(103, 121, 143));
        lblStatTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblStatSub2.setText("Admin · Operasional · HSE · Manager"); // NOI18N
        lblStatSub2.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblStatSub2.setForeground(new java.awt.Color(103, 121, 143));
        lblStatSub2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblStatValue3.setText("SDG"); // NOI18N
        lblStatValue3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblStatValue3.setForeground(new java.awt.Color(26, 43, 66));
        lblStatValue3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblStatTitle3.setText("8 · 12 · 13"); // NOI18N
        lblStatTitle3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblStatTitle3.setForeground(new java.awt.Color(103, 121, 143));
        lblStatTitle3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblStatSub3.setText("Pertambangan berkelanjutan"); // NOI18N
        lblStatSub3.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblStatSub3.setForeground(new java.awt.Color(103, 121, 143));
        lblStatSub3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblOpsKicker.setText("◆  KEGIATAN OPERASIONAL"); // NOI18N
        lblOpsKicker.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblOpsKicker.setForeground(new java.awt.Color(171, 136, 109));

        lblOpsTitle.setText("Tiga Pilar Operasional Tambang Kobalt"); // NOI18N
        lblOpsTitle.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        lblOpsTitle.setForeground(new java.awt.Color(26, 43, 66));

        lblOpsSub.setText("Data mengalir dari produksi di PIT hingga pemantauan lingkungan — saling terhubung dalam satu basis data terpusat."); // NOI18N
        lblOpsSub.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblOpsSub.setForeground(new java.awt.Color(103, 121, 143));

        imgOps0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/landing/modul_produksi_card.png")));

        lblOpsCardTitle0.setText("Produksi Tambang"); // NOI18N
        lblOpsCardTitle0.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblOpsCardTitle0.setForeground(new java.awt.Color(26, 43, 66));

        lblOpsCardDesc0.setText("<html>Pencatatan hasil produksi material berdasarkan jenis material, lokasi PIT, tanggal produksi, dan jumlah produksi. Sistem mengelola <b>jumlah material yang masih tersedia</b> secara otomatis setiap kali pengangkutan diselesaikan.</html>"); // NOI18N
        lblOpsCardDesc0.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblOpsCardDesc0.setForeground(new java.awt.Color(71, 86, 105));

        lblOpsCardTag0.setText("MODUL 01 · PRODUKSI"); // NOI18N
        lblOpsCardTag0.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblOpsCardTag0.setForeground(new java.awt.Color(171, 136, 109));

        imgOps1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/landing/modul_pengangkutan_card.png")));

        lblOpsCardTitle1.setText("Pengangkutan Material"); // NOI18N
        lblOpsCardTitle1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblOpsCardTitle1.setForeground(new java.awt.Color(26, 43, 66));

        lblOpsCardDesc1.setText("<html>Perencanaan dan pelaksanaan pengangkutan material dari PIT menuju stockpile dengan <b>validasi operasional</b>: ketersediaan material, kapasitas kendaraan, ketersediaan driver, dan kondisi lokasi.</html>"); // NOI18N
        lblOpsCardDesc1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblOpsCardDesc1.setForeground(new java.awt.Color(71, 86, 105));

        lblOpsCardTag1.setText("MODUL 02 · PENGANGKUTAN"); // NOI18N
        lblOpsCardTag1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblOpsCardTag1.setForeground(new java.awt.Color(171, 136, 109));

        imgOps2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/landing/modul_monitoring_card.png")));

        lblOpsCardTitle2.setText("Monitoring Lingkungan"); // NOI18N
        lblOpsCardTitle2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblOpsCardTitle2.setForeground(new java.awt.Color(26, 43, 66));

        lblOpsCardDesc2.setText("<html>Pencatatan hasil pengukuran parameter lingkungan dengan status <b>NORMAL atau PERINGATAN</b>, lengkap dengan tindak lanjut, status penanganan, monitoring ulang, dan riwayat kondisi lokasi.</html>"); // NOI18N
        lblOpsCardDesc2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblOpsCardDesc2.setForeground(new java.awt.Color(71, 86, 105));

        lblOpsCardTag2.setText("MODUL 03 · MONITORING HSE"); // NOI18N
        lblOpsCardTag2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblOpsCardTag2.setForeground(new java.awt.Color(171, 136, 109));

        lblCmosKicker.setText("◆  APLIKASI C-MOS"); // NOI18N
        lblCmosKicker.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblCmosKicker.setForeground(new java.awt.Color(171, 136, 109));

        lblCmosTitle.setText("Cobalt Mining Operation System"); // NOI18N
        lblCmosTitle.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        lblCmosTitle.setForeground(new java.awt.Color(250, 247, 243));

        lblCmosDesc.setText("<html>C-MOS adalah aplikasi desktop berbasis <b>Java</b> yang terintegrasi dengan basis data <b>MySQL</b> untuk memusatkan data operasional pertambangan PT. Cobalt. Sistem menerapkan pembagian hak akses berbasis peran, validasi operasional otomatis, serta penyajian dashboard dan laporan — dari pencatatan produksi hingga monitoring lingkungan.</html>"); // NOI18N
        lblCmosDesc.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblCmosDesc.setForeground(new java.awt.Color(214, 192, 179));

        imgCmosLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cobalt-symbol-210.png")));

        lblFeat0.setText("<html><b>Role-Based Access Control</b><br>Hak akses Admin, Petugas Operasional, Petugas HSE, dan Manager</html>"); // NOI18N
        lblFeat0.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblFeat0.setForeground(new java.awt.Color(228, 224, 225));

        lblFeat1.setText("<html><b>Validasi Operasional Otomatis</b><br>Material tersedia, kapasitas kendaraan, dan ketersediaan driver tervalidasi</html>"); // NOI18N
        lblFeat1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblFeat1.setForeground(new java.awt.Color(228, 224, 225));

        lblFeat2.setText("<html><b>Dashboard, Statistik & Laporan</b><br>Ringkasan visual untuk pengawasan dan keputusan berbasis data</html>"); // NOI18N
        lblFeat2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblFeat2.setForeground(new java.awt.Color(228, 224, 225));

        lblFeat3.setText("<html><b>Monitoring Lingkungan Terstruktur</b><br>Status NORMAL/PERINGATAN, tindak lanjut, dan monitoring ulang</html>"); // NOI18N
        lblFeat3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblFeat3.setForeground(new java.awt.Color(228, 224, 225));

        lblTimKicker.setText("◆  TIM PENGEMBANG"); // NOI18N
        lblTimKicker.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblTimKicker.setForeground(new java.awt.Color(171, 136, 109));

        lblTimTitle.setText("Kelompok 13 — Tim C-MOS"); // NOI18N
        lblTimTitle.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        lblTimTitle.setForeground(new java.awt.Color(26, 43, 66));

        lblTimSub.setText("Mahasiswa Program Studi Sistem Informasi, Fakultas Teknik, Universitas Mulawarman — Proyek Praktikum Sistem Basis Data 2026."); // NOI18N
        lblTimSub.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblTimSub.setForeground(new java.awt.Color(103, 121, 143));

        imgTim0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/landing/tim_ahmad_card.png")));

        lblTimNama0.setText("Ahmad Ribbiy Aldi"); // NOI18N
        lblTimNama0.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblTimNama0.setForeground(new java.awt.Color(26, 43, 66));
        lblTimNama0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblTimNim0.setText("2509116100"); // NOI18N
        lblTimNim0.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblTimNim0.setForeground(new java.awt.Color(103, 121, 143));
        lblTimNim0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        imgTim1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/landing/tim_eko_card.png")));

        lblTimNama1.setText("Eko Satrio Wibowo"); // NOI18N
        lblTimNama1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblTimNama1.setForeground(new java.awt.Color(26, 43, 66));
        lblTimNama1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblTimNim1.setText("2509116028"); // NOI18N
        lblTimNim1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblTimNim1.setForeground(new java.awt.Color(103, 121, 143));
        lblTimNim1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        imgTim2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/landing/tim_rasya_card.png")));

        lblTimNama2.setText("Rasya Aditya Ramadani"); // NOI18N
        lblTimNama2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblTimNama2.setForeground(new java.awt.Color(26, 43, 66));
        lblTimNama2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblTimNim2.setText("2509116082"); // NOI18N
        lblTimNim2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblTimNim2.setForeground(new java.awt.Color(103, 121, 143));
        lblTimNim2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        imgTim3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/landing/tim_zefri_card.png")));

        lblTimNama3.setText("Zefri Al Rizqullah"); // NOI18N
        lblTimNama3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblTimNama3.setForeground(new java.awt.Color(26, 43, 66));
        lblTimNama3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblTimNim3.setText("2509116084"); // NOI18N
        lblTimNim3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblTimNim3.setForeground(new java.awt.Color(103, 121, 143));
        lblTimNim3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        imgFooterLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cobalt-symbol-footer.png")));

        lblFooter1.setText("© 2026 C-MOS — Cobalt Mining Operation System · Kelompok 13 COBALT"); // NOI18N
        lblFooter1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblFooter1.setForeground(new java.awt.Color(214, 192, 179));

        lblFooter2.setText("Program Studi Sistem Informasi · Fakultas Teknik · Universitas Mulawarman"); // NOI18N
        lblFooter2.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblFooter2.setForeground(new java.awt.Color(148, 133, 124));

        lblFooter3.setText("Java · NetBeans GUI Builder · MySQL"); // NOI18N
        lblFooter3.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblFooter3.setForeground(new java.awt.Color(171, 136, 109));
        lblFooter3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pnlStatAccent0.setBackground(new java.awt.Color(171, 136, 109));

        pnlStatAccent1.setBackground(new java.awt.Color(171, 136, 109));

        pnlStatAccent2.setBackground(new java.awt.Color(171, 136, 109));

        pnlStatAccent3.setBackground(new java.awt.Color(171, 136, 109));

        pnlOpsAccent0.setBackground(new java.awt.Color(171, 136, 109));

        pnlOpsAccent1.setBackground(new java.awt.Color(171, 136, 109));

        pnlOpsAccent2.setBackground(new java.awt.Color(171, 136, 109));

        pnlTimAccent0.setBackground(new java.awt.Color(171, 136, 109));

        pnlTimAccent1.setBackground(new java.awt.Color(171, 136, 109));

        pnlTimAccent2.setBackground(new java.awt.Color(171, 136, 109));

        pnlTimAccent3.setBackground(new java.awt.Color(171, 136, 109));

        pnlStat0.setBackground(new java.awt.Color(234, 216, 192));

        pnlStat1.setBackground(new java.awt.Color(234, 216, 192));

        pnlStat2.setBackground(new java.awt.Color(234, 216, 192));

        pnlStat3.setBackground(new java.awt.Color(234, 216, 192));

        pnlOpsCard0.setBackground(new java.awt.Color(255, 255, 255));

        pnlOpsCard1.setBackground(new java.awt.Color(255, 255, 255));

        pnlOpsCard2.setBackground(new java.awt.Color(255, 255, 255));

        pnlFeat0.setBackground(new java.awt.Color(63, 50, 40));

        pnlFeat1.setBackground(new java.awt.Color(63, 50, 40));

        pnlFeat2.setBackground(new java.awt.Color(63, 50, 40));

        pnlFeat3.setBackground(new java.awt.Color(63, 50, 40));

        pnlTim0.setBackground(new java.awt.Color(255, 255, 255));

        pnlTim1.setBackground(new java.awt.Color(255, 255, 255));

        pnlTim2.setBackground(new java.awt.Color(255, 255, 255));

        pnlTim3.setBackground(new java.awt.Color(255, 255, 255));

        pnlHeroBg.setBackground(new java.awt.Color(17, 14, 12));

        pnlTentangBg.setBackground(new java.awt.Color(243, 238, 231));

        pnlOpsBg.setBackground(new java.awt.Color(250, 247, 243));

        pnlCmosBg.setBackground(new java.awt.Color(45, 34, 26));

        pnlTimBg.setBackground(new java.awt.Color(243, 238, 231));

        pnlFooterBg.setBackground(new java.awt.Color(45, 34, 26));

        org.jdesktop.layout.GroupLayout pnlPageLayout = new org.jdesktop.layout.GroupLayout(pnlPage);
        pnlPage.setLayout(pnlPageLayout);
        pnlPageLayout.setHorizontalGroup(
            pnlPageLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(lblHeroKicker, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 560, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(lblHeroTitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 580, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(lblHeroSub, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 560, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(btnHeroLogin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 220, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(306, 306, 306)
                .add(btnPelajari, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 230, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(672, 672, 672)
                .add(imgHero, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 530, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(672, 672, 672)
                .add(lblHeroCaption, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 530, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(lblTentangKicker, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 400, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(lblTentangTitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 580, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(lblTentangLead, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 560, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(lblTentangP1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 560, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(lblTentangP2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 560, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(lblTentangP3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 560, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(672, 672, 672)
                .add(imgTentang, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 530, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(672, 672, 672)
                .add(lblTentangCaption, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 530, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(lblStatValue0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(lblStatTitle0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(lblStatSub0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(358, 358, 358)
                .add(lblStatValue1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(358, 358, 358)
                .add(lblStatTitle1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(358, 358, 358)
                .add(lblStatSub1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(646, 646, 646)
                .add(lblStatValue2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(646, 646, 646)
                .add(lblStatTitle2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(646, 646, 646)
                .add(lblStatSub2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(934, 934, 934)
                .add(lblStatValue3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(934, 934, 934)
                .add(lblStatTitle3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(934, 934, 934)
                .add(lblStatSub3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(lblOpsKicker, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 400, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(lblOpsTitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 900, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(lblOpsSub, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(imgOps0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 370, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(94, 94, 94)
                .add(lblOpsCardTitle0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 322, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(94, 94, 94)
                .add(lblOpsCardDesc0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 322, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(94, 94, 94)
                .add(lblOpsCardTag0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 322, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(455, 455, 455)
                .add(imgOps1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 370, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(479, 479, 479)
                .add(lblOpsCardTitle1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 322, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(479, 479, 479)
                .add(lblOpsCardDesc1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 322, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(479, 479, 479)
                .add(lblOpsCardTag1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 322, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(840, 840, 840)
                .add(imgOps2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 370, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(864, 864, 864)
                .add(lblOpsCardTitle2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 322, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(864, 864, 864)
                .add(lblOpsCardDesc2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 322, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(864, 864, 864)
                .add(lblOpsCardTag2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 322, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(lblCmosKicker, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 400, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(lblCmosTitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 560, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(lblCmosDesc, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 540, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(imgCmosLogo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(688, 688, 688)
                .add(lblFeat0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 500, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(688, 688, 688)
                .add(lblFeat1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 500, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(688, 688, 688)
                .add(lblFeat2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 500, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(688, 688, 688)
                .add(lblFeat3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 500, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(lblTimKicker, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 400, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(lblTimTitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 700, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(lblTimSub, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(82, 82, 82)
                .add(imgTim0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 240, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(lblTimNama0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(lblTimNim0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(374, 374, 374)
                .add(imgTim1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 240, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(362, 362, 362)
                .add(lblTimNama1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(362, 362, 362)
                .add(lblTimNim1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(666, 666, 666)
                .add(imgTim2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 240, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(654, 654, 654)
                .add(lblTimNama2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(654, 654, 654)
                .add(lblTimNim2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(958, 958, 958)
                .add(imgTim3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 240, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(946, 946, 946)
                .add(lblTimNama3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(946, 946, 946)
                .add(lblTimNim3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(imgFooterLogo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(132, 132, 132)
                .add(lblFooter1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 620, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(132, 132, 132)
                .add(lblFooter2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 620, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(780, 780, 780)
                .add(lblFooter3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 434, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(pnlStatAccent0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(358, 358, 358)
                .add(pnlStatAccent1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(646, 646, 646)
                .add(pnlStatAccent2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(934, 934, 934)
                .add(pnlStatAccent3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(pnlOpsAccent0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 370, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(455, 455, 455)
                .add(pnlOpsAccent1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 370, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(840, 840, 840)
                .add(pnlOpsAccent2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 370, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(pnlTimAccent0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(362, 362, 362)
                .add(pnlTimAccent1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(654, 654, 654)
                .add(pnlTimAccent2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(946, 946, 946)
                .add(pnlTimAccent3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(pnlStat0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(358, 358, 358)
                .add(pnlStat1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(646, 646, 646)
                .add(pnlStat2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(934, 934, 934)
                .add(pnlStat3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(pnlOpsCard0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 370, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(455, 455, 455)
                .add(pnlOpsCard1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 370, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(840, 840, 840)
                .add(pnlOpsCard2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 370, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(664, 664, 664)
                .add(pnlFeat0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 546, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(664, 664, 664)
                .add(pnlFeat1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 546, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(664, 664, 664)
                .add(pnlFeat2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 546, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(664, 664, 664)
                .add(pnlFeat3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 546, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(pnlTim0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(362, 362, 362)
                .add(pnlTim1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(654, 654, 654)
                .add(pnlTim2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(946, 946, 946)
                .add(pnlTim3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(0, 0, 0)
                .add(pnlHeroBg, 0, 1264, Short.MAX_VALUE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(0, 0, 0)
                .add(pnlTentangBg, 0, 1264, Short.MAX_VALUE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(0, 0, 0)
                .add(pnlOpsBg, 0, 1264, Short.MAX_VALUE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(0, 0, 0)
                .add(pnlCmosBg, 0, 1264, Short.MAX_VALUE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(0, 0, 0)
                .add(pnlTimBg, 0, 1264, Short.MAX_VALUE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(0, 0, 0)
                .add(pnlFooterBg, 0, 1264, Short.MAX_VALUE))
        );
        pnlPageLayout.setVerticalGroup(
            pnlPageLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlPageLayout.createSequentialGroup()
                .add(118, 118, 118)
                .add(lblHeroKicker, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(146, 146, 146)
                .add(lblHeroTitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(278, 278, 278)
                .add(lblHeroSub, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(396, 396, 396)
                .add(btnHeroLogin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(396, 396, 396)
                .add(btnPelajari, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(90, 90, 90)
                .add(imgHero, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 302, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(400, 400, 400)
                .add(lblHeroCaption, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(660, 660, 660)
                .add(lblTentangKicker, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(688, 688, 688)
                .add(lblTentangTitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(734, 734, 734)
                .add(lblTentangLead, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(782, 782, 782)
                .add(lblTentangP1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(904, 904, 904)
                .add(lblTentangP2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1026, 1026, 1026)
                .add(lblTentangP3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(660, 660, 660)
                .add(imgTentang, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 398, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1064, 1064, 1064)
                .add(lblTentangCaption, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1162, 1162, 1162)
                .add(lblStatValue0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1204, 1204, 1204)
                .add(lblStatTitle0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1224, 1224, 1224)
                .add(lblStatSub0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1162, 1162, 1162)
                .add(lblStatValue1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1204, 1204, 1204)
                .add(lblStatTitle1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1224, 1224, 1224)
                .add(lblStatSub1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1162, 1162, 1162)
                .add(lblStatValue2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1204, 1204, 1204)
                .add(lblStatTitle2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1224, 1224, 1224)
                .add(lblStatSub2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1162, 1162, 1162)
                .add(lblStatValue3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1204, 1204, 1204)
                .add(lblStatTitle3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1224, 1224, 1224)
                .add(lblStatSub3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1364, 1364, 1364)
                .add(lblOpsKicker, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1392, 1392, 1392)
                .add(lblOpsTitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1438, 1438, 1438)
                .add(lblOpsSub, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1485, 1485, 1485)
                .add(imgOps0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1768, 1768, 1768)
                .add(lblOpsCardTitle0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1804, 1804, 1804)
                .add(lblOpsCardDesc0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1930, 1930, 1930)
                .add(lblOpsCardTag0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1485, 1485, 1485)
                .add(imgOps1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1768, 1768, 1768)
                .add(lblOpsCardTitle1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1804, 1804, 1804)
                .add(lblOpsCardDesc1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1930, 1930, 1930)
                .add(lblOpsCardTag1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1485, 1485, 1485)
                .add(imgOps2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1768, 1768, 1768)
                .add(lblOpsCardTitle2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1804, 1804, 1804)
                .add(lblOpsCardDesc2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1930, 1930, 1930)
                .add(lblOpsCardTag2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2096, 2096, 2096)
                .add(lblCmosKicker, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2124, 2124, 2124)
                .add(lblCmosTitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2174, 2174, 2174)
                .add(lblCmosDesc, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2352, 2352, 2352)
                .add(imgCmosLogo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 146, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2104, 2104, 2104)
                .add(lblFeat0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2172, 2172, 2172)
                .add(lblFeat1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2240, 2240, 2240)
                .add(lblFeat2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2308, 2308, 2308)
                .add(lblFeat3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2624, 2624, 2624)
                .add(lblTimKicker, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2652, 2652, 2652)
                .add(lblTimTitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2698, 2698, 2698)
                .add(lblTimSub, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2777, 2777, 2777)
                .add(imgTim0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 300, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(3092, 3092, 3092)
                .add(lblTimNama0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(3118, 3118, 3118)
                .add(lblTimNim0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2777, 2777, 2777)
                .add(imgTim1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 300, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(3092, 3092, 3092)
                .add(lblTimNama1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(3118, 3118, 3118)
                .add(lblTimNim1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2777, 2777, 2777)
                .add(imgTim2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 300, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(3092, 3092, 3092)
                .add(lblTimNama2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(3118, 3118, 3118)
                .add(lblTimNim2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2777, 2777, 2777)
                .add(imgTim3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 300, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(3092, 3092, 3092)
                .add(lblTimNama3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(3118, 3118, 3118)
                .add(lblTimNim3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(3330, 3330, 3330)
                .add(imgFooterLogo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(3326, 3326, 3326)
                .add(lblFooter1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(3350, 3350, 3350)
                .add(lblFooter2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(3338, 3338, 3338)
                .add(lblFooter3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1140, 1140, 1140)
                .add(pnlStatAccent0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1140, 1140, 1140)
                .add(pnlStatAccent1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1140, 1140, 1140)
                .add(pnlStatAccent2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1140, 1140, 1140)
                .add(pnlStatAccent3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1480, 1480, 1480)
                .add(pnlOpsAccent0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1480, 1480, 1480)
                .add(pnlOpsAccent1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1480, 1480, 1480)
                .add(pnlOpsAccent2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2760, 2760, 2760)
                .add(pnlTimAccent0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2760, 2760, 2760)
                .add(pnlTimAccent1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2760, 2760, 2760)
                .add(pnlTimAccent2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2760, 2760, 2760)
                .add(pnlTimAccent3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1140, 1140, 1140)
                .add(pnlStat0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1140, 1140, 1140)
                .add(pnlStat1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1140, 1140, 1140)
                .add(pnlStat2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1140, 1140, 1140)
                .add(pnlStat3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1480, 1480, 1480)
                .add(pnlOpsCard0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 500, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1480, 1480, 1480)
                .add(pnlOpsCard1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 500, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1480, 1480, 1480)
                .add(pnlOpsCard2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 500, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2096, 2096, 2096)
                .add(pnlFeat0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 58, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2164, 2164, 2164)
                .add(pnlFeat1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 58, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2232, 2232, 2232)
                .add(pnlFeat2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 58, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2300, 2300, 2300)
                .add(pnlFeat3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 58, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2760, 2760, 2760)
                .add(pnlTim0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 430, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2760, 2760, 2760)
                .add(pnlTim1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 430, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2760, 2760, 2760)
                .add(pnlTim2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 430, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2760, 2760, 2760)
                .add(pnlTim3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 430, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(0, 0, 0)
                .add(pnlHeroBg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 600, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(600, 600, 600)
                .add(pnlTentangBg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 700, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(1300, 1300, 1300)
                .add(pnlOpsBg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 740, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2040, 2040, 2040)
                .add(pnlCmosBg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 520, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(2560, 2560, 2560)
                .add(pnlTimBg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 730, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(pnlPageLayout.createSequentialGroup()
                .add(3290, 3290, 3290)
                .add(pnlFooterBg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        scrollMain.setViewportView(pnlPage);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlTopBar, 0, 1280, Short.MAX_VALUE)
            .add(scrollMain, 0, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .add(pnlTopBar, 88, 88, 88)
                .add(scrollMain, 0, 0, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginTopActionPerformed
        bukaLogin();
    }//GEN-LAST:event_btnLoginTopActionPerformed

    private void btnHeroLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeroLoginActionPerformed
        bukaLogin();
    }//GEN-LAST:event_btnHeroLoginActionPerformed

    private void btnPelajariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPelajariActionPerformed
        gulirHalus(Y_TENTANG);
    }//GEN-LAST:event_btnPelajariActionPerformed

    private void lblNavTentangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNavTentangMouseClicked
        gulirHalus(Y_TENTANG);
    }//GEN-LAST:event_lblNavTentangMouseClicked

    private void lblNavOperasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNavOperasiMouseClicked
        gulirHalus(Y_OPERASIONAL);
    }//GEN-LAST:event_lblNavOperasiMouseClicked

    private void lblNavTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNavTimMouseClicked
        gulirHalus(Y_TIM);
    }//GEN-LAST:event_lblNavTimMouseClicked

private static final int Y_TENTANG = 600;
    private static final int Y_OPERASIONAL = 1300;
    private static final int Y_TIM = 2560;

    /** Menggulir halaman secara halus menuju posisi Y target. */
    private void gulirHalus(int targetY) {
        javax.swing.JViewport viewport = scrollMain.getViewport();
        java.awt.Point dari = viewport.getViewPosition();
        int dariY = dari.y;
        int maks = Math.max(0, pnlPage.getHeight() - viewport.getHeight());
        final int delta = Math.max(-dariY, Math.min(targetY, maks) - dariY);
        if (delta == 0) {
            return;
        }
        if (timerGulir != null && timerGulir.isRunning()) {
            timerGulir.stop();
        }
        final int[] langkah = {0};
        final javax.swing.Timer[] pemilik = new javax.swing.Timer[1];
        pemilik[0] = new javax.swing.Timer(16, e -> {
            langkah[0]++;
            double p = Math.min(1.0, langkah[0] / 30.0);
            double halus = 1 - Math.pow(1 - p, 3);
            int y = (int) Math.round(dariY + delta * halus);
            y = Math.max(0, Math.min(y, Math.max(0, pnlPage.getHeight() - viewport.getHeight())));
            viewport.setViewPosition(new java.awt.Point(0, y));
            if (p >= 1.0) {
                pemilik[0].stop();
            }
        });
        timerGulir = pemilik[0];
        timerGulir.start();
    }

    /** Membuka halaman login; memastikan layanan database sudah siap. */
    private void bukaLogin() {
        try {
            AppConfig.initialize();
            new LoginFrame().setVisible(true);
            dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Belum dapat terhubung ke database cmos_db.\n"
                    + "Jalankan MySQL dan pastikan konfigurasi JDBC benar, lalu coba lagi.\n\n"
                    + "Detail: " + ex.getMessage(),
                    "Koneksi Database C-MOS", JOptionPane.WARNING_MESSAGE);
        }
    }

    private javax.swing.Timer timerGulir;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHeroLogin;
    private javax.swing.JButton btnLoginTop;
    private javax.swing.JButton btnPelajari;
    private javax.swing.JLabel imgCmosLogo;
    private javax.swing.JLabel imgFooterLogo;
    private javax.swing.JLabel imgHero;
    private javax.swing.JLabel imgOps0;
    private javax.swing.JLabel imgOps1;
    private javax.swing.JLabel imgOps2;
    private javax.swing.JLabel imgTentang;
    private javax.swing.JLabel imgTim0;
    private javax.swing.JLabel imgTim1;
    private javax.swing.JLabel imgTim2;
    private javax.swing.JLabel imgTim3;
    private javax.swing.JLabel lblBrandTop;
    private javax.swing.JLabel lblBrandTopSub;
    private javax.swing.JLabel lblCmosDesc;
    private javax.swing.JLabel lblCmosKicker;
    private javax.swing.JLabel lblCmosTitle;
    private javax.swing.JLabel lblFeat0;
    private javax.swing.JLabel lblFeat1;
    private javax.swing.JLabel lblFeat2;
    private javax.swing.JLabel lblFeat3;
    private javax.swing.JLabel lblFooter1;
    private javax.swing.JLabel lblFooter2;
    private javax.swing.JLabel lblFooter3;
    private javax.swing.JLabel lblHeroCaption;
    private javax.swing.JLabel lblHeroKicker;
    private javax.swing.JLabel lblHeroSub;
    private javax.swing.JLabel lblHeroTitle;
    private javax.swing.JLabel lblLogoSm;
    private javax.swing.JLabel lblNavOperasi;
    private javax.swing.JLabel lblNavTentang;
    private javax.swing.JLabel lblNavTim;
    private javax.swing.JLabel lblOpsCardDesc0;
    private javax.swing.JLabel lblOpsCardDesc1;
    private javax.swing.JLabel lblOpsCardDesc2;
    private javax.swing.JLabel lblOpsCardTag0;
    private javax.swing.JLabel lblOpsCardTag1;
    private javax.swing.JLabel lblOpsCardTag2;
    private javax.swing.JLabel lblOpsCardTitle0;
    private javax.swing.JLabel lblOpsCardTitle1;
    private javax.swing.JLabel lblOpsCardTitle2;
    private javax.swing.JLabel lblOpsKicker;
    private javax.swing.JLabel lblOpsSub;
    private javax.swing.JLabel lblOpsTitle;
    private javax.swing.JLabel lblStatSub0;
    private javax.swing.JLabel lblStatSub1;
    private javax.swing.JLabel lblStatSub2;
    private javax.swing.JLabel lblStatSub3;
    private javax.swing.JLabel lblStatTitle0;
    private javax.swing.JLabel lblStatTitle1;
    private javax.swing.JLabel lblStatTitle2;
    private javax.swing.JLabel lblStatTitle3;
    private javax.swing.JLabel lblStatValue0;
    private javax.swing.JLabel lblStatValue1;
    private javax.swing.JLabel lblStatValue2;
    private javax.swing.JLabel lblStatValue3;
    private javax.swing.JLabel lblTentangCaption;
    private javax.swing.JLabel lblTentangKicker;
    private javax.swing.JLabel lblTentangLead;
    private javax.swing.JLabel lblTentangP1;
    private javax.swing.JLabel lblTentangP2;
    private javax.swing.JLabel lblTentangP3;
    private javax.swing.JLabel lblTentangTitle;
    private javax.swing.JLabel lblTimKicker;
    private javax.swing.JLabel lblTimNama0;
    private javax.swing.JLabel lblTimNama1;
    private javax.swing.JLabel lblTimNama2;
    private javax.swing.JLabel lblTimNama3;
    private javax.swing.JLabel lblTimNim0;
    private javax.swing.JLabel lblTimNim1;
    private javax.swing.JLabel lblTimNim2;
    private javax.swing.JLabel lblTimNim3;
    private javax.swing.JLabel lblTimSub;
    private javax.swing.JLabel lblTimTitle;
    private javax.swing.JPanel pnlCmosBg;
    private javax.swing.JPanel pnlFeat0;
    private javax.swing.JPanel pnlFeat1;
    private javax.swing.JPanel pnlFeat2;
    private javax.swing.JPanel pnlFeat3;
    private javax.swing.JPanel pnlFooterBg;
    private javax.swing.JPanel pnlHeroBg;
    private javax.swing.JPanel pnlOpsAccent0;
    private javax.swing.JPanel pnlOpsAccent1;
    private javax.swing.JPanel pnlOpsAccent2;
    private javax.swing.JPanel pnlOpsBg;
    private javax.swing.JPanel pnlOpsCard0;
    private javax.swing.JPanel pnlOpsCard1;
    private javax.swing.JPanel pnlOpsCard2;
    private javax.swing.JPanel pnlPage;
    private javax.swing.JPanel pnlStat0;
    private javax.swing.JPanel pnlStat1;
    private javax.swing.JPanel pnlStat2;
    private javax.swing.JPanel pnlStat3;
    private javax.swing.JPanel pnlStatAccent0;
    private javax.swing.JPanel pnlStatAccent1;
    private javax.swing.JPanel pnlStatAccent2;
    private javax.swing.JPanel pnlStatAccent3;
    private javax.swing.JPanel pnlTentangBg;
    private javax.swing.JPanel pnlTim0;
    private javax.swing.JPanel pnlTim1;
    private javax.swing.JPanel pnlTim2;
    private javax.swing.JPanel pnlTim3;
    private javax.swing.JPanel pnlTimAccent0;
    private javax.swing.JPanel pnlTimAccent1;
    private javax.swing.JPanel pnlTimAccent2;
    private javax.swing.JPanel pnlTimAccent3;
    private javax.swing.JPanel pnlTimBg;
    private javax.swing.JPanel pnlTopAccent;
    private javax.swing.JPanel pnlTopBar;
    private javax.swing.JScrollPane scrollMain;
    // End of variables declaration//GEN-END:variables
}

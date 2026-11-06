package view;

import config.AppConfig;
import controller.*;
import model.*;
import enums.*;
import java.time.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.function.Consumer;

/** Dashboard Administrator: pengawasan administrasi dan akses pengguna. */
public class DashboardAdminPanel extends javax.swing.JPanel {
    private java.util.function.Consumer<String> navigate;

    public DashboardAdminPanel() {
        initComponents();
        
        JButton[] navButtons = {btnKelolaAkun, btnPeriksaAkun};

        for (JButton btn : navButtons) {
            btn.setOpaque(true);
            btn.setContentAreaFilled(true);
            btn.setBorderPainted(false);
        }
        
        try { muatData(); } catch (Exception ex) { FormUtil.error(this, ex); }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblHint = new javax.swing.JLabel();
        pnlKpi0 = new javax.swing.JPanel();
        lblKpiTitle0 = new javax.swing.JLabel();
        lblKpiValue0 = new javax.swing.JLabel();
        lblKpiSub0 = new javax.swing.JLabel();
        pnlKpi1 = new javax.swing.JPanel();
        lblKpiTitle1 = new javax.swing.JLabel();
        lblKpiValue1 = new javax.swing.JLabel();
        lblKpiSub1 = new javax.swing.JLabel();
        pnlKpi2 = new javax.swing.JPanel();
        lblKpiTitle2 = new javax.swing.JLabel();
        lblKpiValue2 = new javax.swing.JLabel();
        lblKpiSub2 = new javax.swing.JLabel();
        pnlKpi3 = new javax.swing.JPanel();
        lblKpiTitle3 = new javax.swing.JLabel();
        lblKpiValue3 = new javax.swing.JLabel();
        lblKpiSub3 = new javax.swing.JLabel();
        pnlKpi4 = new javax.swing.JPanel();
        lblKpiTitle4 = new javax.swing.JLabel();
        lblKpiValue4 = new javax.swing.JLabel();
        lblKpiSub4 = new javax.swing.JLabel();
        pnlKpi5 = new javax.swing.JPanel();
        lblKpiTitle5 = new javax.swing.JLabel();
        lblKpiValue5 = new javax.swing.JLabel();
        lblKpiSub5 = new javax.swing.JLabel();
        pnlKpi6 = new javax.swing.JPanel();
        lblKpiTitle6 = new javax.swing.JLabel();
        lblKpiValue6 = new javax.swing.JLabel();
        lblKpiSub6 = new javax.swing.JLabel();
        pnlKpi7 = new javax.swing.JPanel();
        lblKpiTitle7 = new javax.swing.JLabel();
        lblKpiValue7 = new javax.swing.JLabel();
        lblKpiSub7 = new javax.swing.JLabel();
        pnlPrioritas = new javax.swing.JPanel();
        lblPriTitle = new javax.swing.JLabel();
        lblPriHint = new javax.swing.JLabel();
        lblP1 = new javax.swing.JLabel();
        btnKelolaAkun = new javax.swing.JButton();
        lblP2 = new javax.swing.JLabel();
        btnPeriksaAkun = new javax.swing.JButton();
        pnlChart1 = new javax.swing.JPanel();
        lblSection = new javax.swing.JLabel();

        setBackground(new java.awt.Color(214, 192, 179));

        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 23)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));
        lblTitle.setText("Dashboard Administrator");

        lblHint.setBackground(new java.awt.Color(228, 224, 225));
        lblHint.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblHint.setForeground(new java.awt.Color(103, 121, 143));
        lblHint.setText("Pengawasan administrasi, pengelolaan data master, dan akses pengguna");

        pnlKpi0.setBackground(new java.awt.Color(234, 216, 192));

        lblKpiTitle0.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle0.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiTitle0.setText("PEGAWAI TERDAFTAR");

        lblKpiValue0.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue0.setForeground(new java.awt.Color(26, 43, 66));
        lblKpiValue0.setText("-");

        lblKpiSub0.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub0.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiSub0.setText("aktif dan nonaktif");

        org.jdesktop.layout.GroupLayout pnlKpi0Layout = new org.jdesktop.layout.GroupLayout(pnlKpi0);
        pnlKpi0.setLayout(pnlKpi0Layout);
        pnlKpi0Layout.setHorizontalGroup(
            pnlKpi0Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi0Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(pnlKpi0Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblKpiTitle0, 10, 186, Short.MAX_VALUE)
                    .add(lblKpiValue0, 10, 186, Short.MAX_VALUE)
                    .add(lblKpiSub0, 10, 186, Short.MAX_VALUE)))
        );
        pnlKpi0Layout.setVerticalGroup(
            pnlKpi0Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi0Layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(lblKpiTitle0, 14, 14, 14)
                .add(4, 4, 4)
                .add(lblKpiValue0, 28, 28, 28)
                .add(3, 3, 3)
                .add(lblKpiSub0, 16, 16, 16)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlKpi1.setBackground(new java.awt.Color(234, 216, 192));

        lblKpiTitle1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle1.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiTitle1.setText("AKUN PENGGUNA");

        lblKpiValue1.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue1.setForeground(new java.awt.Color(43, 106, 230));
        lblKpiValue1.setText("-");

        lblKpiSub1.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub1.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiSub1.setText("akun pengguna terdaftar");

        org.jdesktop.layout.GroupLayout pnlKpi1Layout = new org.jdesktop.layout.GroupLayout(pnlKpi1);
        pnlKpi1.setLayout(pnlKpi1Layout);
        pnlKpi1Layout.setHorizontalGroup(
            pnlKpi1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi1Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(pnlKpi1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblKpiTitle1, 10, 186, Short.MAX_VALUE)
                    .add(lblKpiValue1, 10, 186, Short.MAX_VALUE)
                    .add(lblKpiSub1, 10, 186, Short.MAX_VALUE)))
        );
        pnlKpi1Layout.setVerticalGroup(
            pnlKpi1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi1Layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(lblKpiTitle1, 14, 14, 14)
                .add(4, 4, 4)
                .add(lblKpiValue1, 28, 28, 28)
                .add(3, 3, 3)
                .add(lblKpiSub1, 16, 16, 16)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlKpi2.setBackground(new java.awt.Color(234, 216, 192));

        lblKpiTitle2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle2.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiTitle2.setText("AKSES BELUM TERSEDIA");

        lblKpiValue2.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue2.setForeground(new java.awt.Color(183, 121, 31));
        lblKpiValue2.setText("-");

        lblKpiSub2.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub2.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiSub2.setText("pegawai aktif tanpa akun");

        org.jdesktop.layout.GroupLayout pnlKpi2Layout = new org.jdesktop.layout.GroupLayout(pnlKpi2);
        pnlKpi2.setLayout(pnlKpi2Layout);
        pnlKpi2Layout.setHorizontalGroup(
            pnlKpi2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi2Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(pnlKpi2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblKpiTitle2, 10, 186, Short.MAX_VALUE)
                    .add(lblKpiValue2, 10, 186, Short.MAX_VALUE)
                    .add(lblKpiSub2, 10, 186, Short.MAX_VALUE)))
        );
        pnlKpi2Layout.setVerticalGroup(
            pnlKpi2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi2Layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(lblKpiTitle2, 14, 14, 14)
                .add(4, 4, 4)
                .add(lblKpiValue2, 28, 28, 28)
                .add(3, 3, 3)
                .add(lblKpiSub2, 16, 16, 16)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlKpi3.setBackground(new java.awt.Color(234, 216, 192));

        lblKpiTitle3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle3.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiTitle3.setText("AKUN PERLU DIPERIKSA");

        lblKpiValue3.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue3.setForeground(new java.awt.Color(160, 45, 62));
        lblKpiValue3.setText("-");

        lblKpiSub3.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub3.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiSub3.setText("akun milik pegawai nonaktif");

        org.jdesktop.layout.GroupLayout pnlKpi3Layout = new org.jdesktop.layout.GroupLayout(pnlKpi3);
        pnlKpi3.setLayout(pnlKpi3Layout);
        pnlKpi3Layout.setHorizontalGroup(
            pnlKpi3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi3Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(pnlKpi3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblKpiTitle3, 10, 186, Short.MAX_VALUE)
                    .add(lblKpiValue3, 10, 186, Short.MAX_VALUE)
                    .add(lblKpiSub3, 10, 186, Short.MAX_VALUE)))
        );
        pnlKpi3Layout.setVerticalGroup(
            pnlKpi3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi3Layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(lblKpiTitle3, 14, 14, 14)
                .add(4, 4, 4)
                .add(lblKpiValue3, 28, 28, 28)
                .add(3, 3, 3)
                .add(lblKpiSub3, 16, 16, 16)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlKpi4.setBackground(new java.awt.Color(234, 216, 192));

        lblKpiTitle4.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle4.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiTitle4.setText("LOKASI TAMBANG");

        lblKpiValue4.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue4.setForeground(new java.awt.Color(26, 43, 66));
        lblKpiValue4.setText("-");

        lblKpiSub4.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub4.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiSub4.setText("lokasi aktif");

        org.jdesktop.layout.GroupLayout pnlKpi4Layout = new org.jdesktop.layout.GroupLayout(pnlKpi4);
        pnlKpi4.setLayout(pnlKpi4Layout);
        pnlKpi4Layout.setHorizontalGroup(
            pnlKpi4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi4Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(pnlKpi4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblKpiTitle4, 10, 186, Short.MAX_VALUE)
                    .add(lblKpiValue4, 10, 186, Short.MAX_VALUE)
                    .add(lblKpiSub4, 10, 186, Short.MAX_VALUE)))
        );
        pnlKpi4Layout.setVerticalGroup(
            pnlKpi4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi4Layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(lblKpiTitle4, 14, 14, 14)
                .add(4, 4, 4)
                .add(lblKpiValue4, 28, 28, 28)
                .add(3, 3, 3)
                .add(lblKpiSub4, 16, 16, 16)
                .add(12, 14, Short.MAX_VALUE))
        );

        pnlKpi5.setBackground(new java.awt.Color(234, 216, 192));

        lblKpiTitle5.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle5.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiTitle5.setText("ARMADA KENDARAAN");

        lblKpiValue5.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue5.setForeground(new java.awt.Color(31, 122, 140));
        lblKpiValue5.setText("-");

        lblKpiSub5.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub5.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiSub5.setText("kendaraan tersedia");

        org.jdesktop.layout.GroupLayout pnlKpi5Layout = new org.jdesktop.layout.GroupLayout(pnlKpi5);
        pnlKpi5.setLayout(pnlKpi5Layout);
        pnlKpi5Layout.setHorizontalGroup(
            pnlKpi5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi5Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(pnlKpi5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblKpiTitle5, 10, 186, Short.MAX_VALUE)
                    .add(lblKpiValue5, 10, 186, Short.MAX_VALUE)
                    .add(lblKpiSub5, 10, 186, Short.MAX_VALUE)))
        );
        pnlKpi5Layout.setVerticalGroup(
            pnlKpi5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi5Layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(lblKpiTitle5, 14, 14, 14)
                .add(4, 4, 4)
                .add(lblKpiValue5, 28, 28, 28)
                .add(3, 3, 3)
                .add(lblKpiSub5, 16, 16, 16)
                .add(12, 14, Short.MAX_VALUE))
        );

        pnlKpi6.setBackground(new java.awt.Color(234, 216, 192));

        lblKpiTitle6.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle6.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiTitle6.setText("KATALOG JENIS MATERIAL");

        lblKpiValue6.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue6.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiValue6.setText("-");

        lblKpiSub6.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub6.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiSub6.setText("jenis material terdaftar");

        org.jdesktop.layout.GroupLayout pnlKpi6Layout = new org.jdesktop.layout.GroupLayout(pnlKpi6);
        pnlKpi6.setLayout(pnlKpi6Layout);
        pnlKpi6Layout.setHorizontalGroup(
            pnlKpi6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi6Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(pnlKpi6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblKpiTitle6, 10, 186, Short.MAX_VALUE)
                    .add(lblKpiValue6, 10, 186, Short.MAX_VALUE)
                    .add(lblKpiSub6, 10, 186, Short.MAX_VALUE)))
        );
        pnlKpi6Layout.setVerticalGroup(
            pnlKpi6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi6Layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(lblKpiTitle6, 14, 14, 14)
                .add(4, 4, 4)
                .add(lblKpiValue6, 28, 28, 28)
                .add(3, 3, 3)
                .add(lblKpiSub6, 16, 16, 16)
                .add(12, 14, Short.MAX_VALUE))
        );

        pnlKpi7.setBackground(new java.awt.Color(234, 216, 192));

        lblKpiTitle7.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle7.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiTitle7.setText("KATALOG PARAMETER");

        lblKpiValue7.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue7.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiValue7.setText("-");

        lblKpiSub7.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub7.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiSub7.setText("jenis parameter pemantauan terdaftar");

        org.jdesktop.layout.GroupLayout pnlKpi7Layout = new org.jdesktop.layout.GroupLayout(pnlKpi7);
        pnlKpi7.setLayout(pnlKpi7Layout);
        pnlKpi7Layout.setHorizontalGroup(
            pnlKpi7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi7Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(pnlKpi7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblKpiTitle7, 10, 186, Short.MAX_VALUE)
                    .add(lblKpiValue7, 10, 186, Short.MAX_VALUE)
                    .add(lblKpiSub7, 10, 186, Short.MAX_VALUE)))
        );
        pnlKpi7Layout.setVerticalGroup(
            pnlKpi7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi7Layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(lblKpiTitle7, 14, 14, 14)
                .add(4, 4, 4)
                .add(lblKpiValue7, 28, 28, 28)
                .add(3, 3, 3)
                .add(lblKpiSub7, 16, 16, 16)
                .add(12, 14, Short.MAX_VALUE))
        );

        pnlPrioritas.setBackground(new java.awt.Color(73, 54, 40));

        lblPriTitle.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        lblPriTitle.setForeground(new java.awt.Color(214, 192, 179));
        lblPriTitle.setText("PRIORITAS ADMINISTRASI");

        lblPriHint.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblPriHint.setForeground(new java.awt.Color(228, 224, 225));
        lblPriHint.setText("Ketidaksesuaian akses yang perlu ditindak");

        lblP1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblP1.setForeground(new java.awt.Color(214, 192, 179));
        lblP1.setText("-");

        btnKelolaAkun.setBackground(new java.awt.Color(167, 146, 119));
        btnKelolaAkun.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnKelolaAkun.setForeground(new java.awt.Color(255, 255, 255));
        btnKelolaAkun.setText("Kelola Akun");
        btnKelolaAkun.setFocusPainted(false);
        btnKelolaAkun.addActionListener(this::btnKelolaAkunActionPerformed);

        lblP2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblP2.setForeground(new java.awt.Color(214, 192, 179));
        lblP2.setText("-");

        btnPeriksaAkun.setBackground(new java.awt.Color(209, 187, 158));
        btnPeriksaAkun.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnPeriksaAkun.setForeground(new java.awt.Color(255, 255, 255));
        btnPeriksaAkun.setText("Periksa Akun");
        btnPeriksaAkun.setFocusPainted(false);
        btnPeriksaAkun.addActionListener(this::btnPeriksaAkunActionPerformed);

        org.jdesktop.layout.GroupLayout pnlPrioritasLayout = new org.jdesktop.layout.GroupLayout(pnlPrioritas);
        pnlPrioritas.setLayout(pnlPrioritasLayout);
        pnlPrioritasLayout.setHorizontalGroup(
            pnlPrioritasLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlPrioritasLayout.createSequentialGroup()
                .add(16, 16, 16)
                .add(pnlPrioritasLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblPriTitle, 10, 268, Short.MAX_VALUE)
                    .add(lblPriHint, 10, 268, Short.MAX_VALUE)
                    .add(lblP1, 10, 268, Short.MAX_VALUE)
                    .add(btnKelolaAkun, 150, 150, 150)
                    .add(lblP2, 10, 268, Short.MAX_VALUE)
                    .add(btnPeriksaAkun, 150, 150, 150))
                .add(16, 16, 16))
        );
        pnlPrioritasLayout.setVerticalGroup(
            pnlPrioritasLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlPrioritasLayout.createSequentialGroup()
                .add(14, 14, 14)
                .add(lblPriTitle, 18, 18, 18)
                .add(3, 3, 3)
                .add(lblPriHint, 15, 15, 15)
                .add(12, 12, 12)
                .add(lblP1, 20, 20, 20)
                .add(8, 8, 8)
                .add(btnKelolaAkun, 40, 40, 40)
                .add(12, 12, 12)
                .add(lblP2, 20, 20, 20)
                .add(8, 8, 8)
                .add(btnPeriksaAkun, 40, 40, 40)
                .add(14, 136, Short.MAX_VALUE))
        );

        pnlChart1.setBackground(new java.awt.Color(234, 216, 192));

        lblSection.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblSection.setForeground(new java.awt.Color(103, 121, 143));
        lblSection.setText("RINGKASAN DATA MASTER");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(24, 24, 24)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblTitle, 10, 600, Short.MAX_VALUE)
                    .add(lblHint, 10, 600, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(pnlKpi0, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(12, 22, Short.MAX_VALUE)
                        .add(pnlKpi1, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(12, 22, Short.MAX_VALUE)
                        .add(pnlKpi2, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(12, 24, Short.MAX_VALUE)
                        .add(pnlKpi3, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(pnlKpi4, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(12, 22, Short.MAX_VALUE)
                        .add(pnlKpi5, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(12, 22, Short.MAX_VALUE)
                        .add(pnlKpi6, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(12, 24, Short.MAX_VALUE)
                        .add(pnlKpi7, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(pnlChart1, 10, 568, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(pnlPrioritas, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(lblSection, 10, 600, Short.MAX_VALUE))
                .add(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(lblTitle, 40, 40, 40)
                .add(2, 2, 2)
                .add(lblHint, 22, 22, 22)
                .add(14, 14, 14)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlKpi0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(pnlKpi1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(pnlKpi2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(pnlKpi3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(14, 14, 14)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlChart1, 200, 346, Short.MAX_VALUE)
                    .add(pnlPrioritas, 200, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(14, 14, 14)
                .add(lblSection, 20, 20, 20)
                .add(8, 8, 8)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlKpi4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(pnlKpi5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(pnlKpi6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(pnlKpi7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

public DashboardAdminPanel(java.util.function.Consumer<String> nav) {

    this();

    this.navigate = nav;

}

    private void muatData() {

        service.DashboardService.Data d = AppConfig.getDashboardController().admin();



        lblKpiValue0.setText(String.valueOf(d.pegawaiTotal));

        lblKpiSub0.setText(d.pegawaiAktif + " aktif \u00b7 " + d.pegawaiNonaktif + " nonaktif");

        lblKpiValue1.setText(String.valueOf(d.akunTotal));

        lblKpiSub1.setText(d.akunAktif + " aktif \u00b7 " + d.akunNonaktif + " nonaktif");

        lblKpiValue2.setText(String.valueOf(d.aksesBelumTersedia));

        lblKpiValue3.setText(String.valueOf(d.akunPerluDiperiksa));

        lblP1.setText(d.aksesBelumTersedia + " pegawai aktif belum memiliki akun");

        lblP2.setText(d.akunPerluDiperiksa + " akun milik pegawai nonaktif");



        lblKpiValue4.setText(String.valueOf(d.lokasiTotal));

        lblKpiSub4.setText(d.lokasiAktif + " lokasi aktif");

        lblKpiValue5.setText(String.valueOf(d.kendaraanTotal));

        lblKpiSub5.setText(d.kendaraanTersedia + " kendaraan tersedia");

        lblKpiValue6.setText(String.valueOf(d.materialTotal));

        lblKpiSub6.setText("jenis material terdaftar");

        lblKpiValue7.setText(String.valueOf(d.parameterTotal));

        lblKpiSub7.setText("jenis parameter pemantauan terdaftar");



        org.jfree.data.category.DefaultCategoryDataset ds = new org.jfree.data.category.DefaultCategoryDataset();

        for (Map.Entry<String, Integer> e : d.pegawaiPerJenis.entrySet()) {

            ds.addValue(e.getValue(), "Jumlah", e.getKey());

        }

        if (d.pegawaiPerJenis.isEmpty()) {

            DashboardCharts.kosong(pnlChart1, "Belum ada data pegawai.");

        } else {

            DashboardCharts.render(pnlChart1, DashboardCharts.barHorizontal("Distribusi Pegawai", ds));

        }

    }



    private void btnKelolaAkunActionPerformed(java.awt.event.ActionEvent evt) {

        navigate.accept("User");

    }



    private void btnPeriksaAkunActionPerformed(java.awt.event.ActionEvent evt) {

        navigate.accept("Pegawai");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKelolaAkun;
    private javax.swing.JButton btnPeriksaAkun;
    private javax.swing.JLabel lblHint;
    private javax.swing.JLabel lblKpiSub0;
    private javax.swing.JLabel lblKpiSub1;
    private javax.swing.JLabel lblKpiSub2;
    private javax.swing.JLabel lblKpiSub3;
    private javax.swing.JLabel lblKpiSub4;
    private javax.swing.JLabel lblKpiSub5;
    private javax.swing.JLabel lblKpiSub6;
    private javax.swing.JLabel lblKpiSub7;
    private javax.swing.JLabel lblKpiTitle0;
    private javax.swing.JLabel lblKpiTitle1;
    private javax.swing.JLabel lblKpiTitle2;
    private javax.swing.JLabel lblKpiTitle3;
    private javax.swing.JLabel lblKpiTitle4;
    private javax.swing.JLabel lblKpiTitle5;
    private javax.swing.JLabel lblKpiTitle6;
    private javax.swing.JLabel lblKpiTitle7;
    private javax.swing.JLabel lblKpiValue0;
    private javax.swing.JLabel lblKpiValue1;
    private javax.swing.JLabel lblKpiValue2;
    private javax.swing.JLabel lblKpiValue3;
    private javax.swing.JLabel lblKpiValue4;
    private javax.swing.JLabel lblKpiValue5;
    private javax.swing.JLabel lblKpiValue6;
    private javax.swing.JLabel lblKpiValue7;
    private javax.swing.JLabel lblP1;
    private javax.swing.JLabel lblP2;
    private javax.swing.JLabel lblPriHint;
    private javax.swing.JLabel lblPriTitle;
    private javax.swing.JLabel lblSection;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlChart1;
    private javax.swing.JPanel pnlKpi0;
    private javax.swing.JPanel pnlKpi1;
    private javax.swing.JPanel pnlKpi2;
    private javax.swing.JPanel pnlKpi3;
    private javax.swing.JPanel pnlKpi4;
    private javax.swing.JPanel pnlKpi5;
    private javax.swing.JPanel pnlKpi6;
    private javax.swing.JPanel pnlKpi7;
    private javax.swing.JPanel pnlPrioritas;
    // End of variables declaration//GEN-END:variables
}

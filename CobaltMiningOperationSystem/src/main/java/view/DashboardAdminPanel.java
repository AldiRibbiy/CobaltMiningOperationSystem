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
        try { muatData(); } catch (Exception ex) { FormUtil.error(this, ex); }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblHint = new javax.swing.JLabel();
        lblKpiTitle0 = new javax.swing.JLabel();
        lblKpiValue0 = new javax.swing.JLabel();
        lblKpiSub0 = new javax.swing.JLabel();
        pnlKpi0 = new javax.swing.JPanel();
        lblKpiTitle1 = new javax.swing.JLabel();
        lblKpiValue1 = new javax.swing.JLabel();
        lblKpiSub1 = new javax.swing.JLabel();
        pnlKpi1 = new javax.swing.JPanel();
        lblKpiTitle2 = new javax.swing.JLabel();
        lblKpiValue2 = new javax.swing.JLabel();
        lblKpiSub2 = new javax.swing.JLabel();
        pnlKpi2 = new javax.swing.JPanel();
        lblKpiTitle3 = new javax.swing.JLabel();
        lblKpiValue3 = new javax.swing.JLabel();
        lblKpiSub3 = new javax.swing.JLabel();
        pnlKpi3 = new javax.swing.JPanel();
        lblKpiTitle4 = new javax.swing.JLabel();
        lblKpiValue4 = new javax.swing.JLabel();
        lblKpiSub4 = new javax.swing.JLabel();
        pnlKpi4 = new javax.swing.JPanel();
        lblKpiTitle5 = new javax.swing.JLabel();
        lblKpiValue5 = new javax.swing.JLabel();
        lblKpiSub5 = new javax.swing.JLabel();
        pnlKpi5 = new javax.swing.JPanel();
        lblKpiTitle6 = new javax.swing.JLabel();
        lblKpiValue6 = new javax.swing.JLabel();
        lblKpiSub6 = new javax.swing.JLabel();
        pnlKpi6 = new javax.swing.JPanel();
        lblKpiTitle7 = new javax.swing.JLabel();
        lblKpiValue7 = new javax.swing.JLabel();
        lblKpiSub7 = new javax.swing.JLabel();
        pnlKpi7 = new javax.swing.JPanel();
        lblPriTitle = new javax.swing.JLabel();
        lblPriHint = new javax.swing.JLabel();
        lblP1 = new javax.swing.JLabel();
        btnKelolaAkun = new javax.swing.JButton();
        lblP2 = new javax.swing.JLabel();
        btnPeriksaAkun = new javax.swing.JButton();
        pnlPrioritas = new javax.swing.JPanel();
        pnlChart1 = new javax.swing.JPanel();
        lblSection = new javax.swing.JLabel();


        lblTitle.setText("Dashboard Administrator");
        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 23)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));

        lblHint.setText("Pengawasan administrasi, pengelolaan data master, dan akses pengguna");
        lblHint.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblHint.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiTitle0.setText("PEGAWAI TERDAFTAR");
        lblKpiTitle0.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle0.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue0.setText("-");
        lblKpiValue0.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue0.setForeground(new java.awt.Color(26, 43, 66));

        lblKpiSub0.setText("aktif dan nonaktif");
        lblKpiSub0.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub0.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi0.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle1.setText("AKUN PENGGUNA");
        lblKpiTitle1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle1.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue1.setText("-");
        lblKpiValue1.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue1.setForeground(new java.awt.Color(43, 106, 230));

        lblKpiSub1.setText("akun pengguna terdaftar");
        lblKpiSub1.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub1.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi1.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle2.setText("AKSES BELUM TERSEDIA");
        lblKpiTitle2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle2.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue2.setText("-");
        lblKpiValue2.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue2.setForeground(new java.awt.Color(183, 121, 31));

        lblKpiSub2.setText("pegawai aktif tanpa akun, non-driver");
        lblKpiSub2.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub2.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi2.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle3.setText("AKUN PERLU DIPERIKSA");
        lblKpiTitle3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle3.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue3.setText("-");
        lblKpiValue3.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue3.setForeground(new java.awt.Color(160, 45, 62));

        lblKpiSub3.setText("akun milik pegawai nonaktif");
        lblKpiSub3.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub3.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi3.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle4.setText("LOKASI TAMBANG");
        lblKpiTitle4.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle4.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue4.setText("-");
        lblKpiValue4.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue4.setForeground(new java.awt.Color(26, 43, 66));

        lblKpiSub4.setText("lokasi aktif");
        lblKpiSub4.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub4.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi4.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle5.setText("ARMADA KENDARAAN");
        lblKpiTitle5.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle5.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue5.setText("-");
        lblKpiValue5.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue5.setForeground(new java.awt.Color(31, 122, 140));

        lblKpiSub5.setText("kendaraan tersedia");
        lblKpiSub5.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub5.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi5.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle6.setText("KATALOG JENIS MATERIAL");
        lblKpiTitle6.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle6.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue6.setText("-");
        lblKpiValue6.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue6.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiSub6.setText("jenis material terdaftar");
        lblKpiSub6.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub6.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi6.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle7.setText("KATALOG PARAMETER");
        lblKpiTitle7.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle7.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue7.setText("-");
        lblKpiValue7.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue7.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiSub7.setText("jenis parameter pemantauan terdaftar");
        lblKpiSub7.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub7.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi7.setBackground(new java.awt.Color(255, 255, 255));

        lblPriTitle.setText("PRIORITAS ADMINISTRASI");
        lblPriTitle.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        lblPriTitle.setForeground(new java.awt.Color(26, 43, 66));

        lblPriHint.setText("Ketidaksesuaian akses yang perlu ditindak");
        lblPriHint.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblPriHint.setForeground(new java.awt.Color(103, 121, 143));

        lblP1.setText("-");
        lblP1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblP1.setForeground(new java.awt.Color(26, 43, 66));

        btnKelolaAkun.setText("Kelola Akun");
        btnKelolaAkun.setFocusPainted(false);
        btnKelolaAkun.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnKelolaAkun.setForeground(new java.awt.Color(255, 255, 255));
        btnKelolaAkun.setBackground(new java.awt.Color(43, 106, 230));
        btnKelolaAkun.addActionListener(this::btnKelolaAkunActionPerformed);

        lblP2.setText("-");
        lblP2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblP2.setForeground(new java.awt.Color(26, 43, 66));

        btnPeriksaAkun.setText("Periksa Akun");
        btnPeriksaAkun.setFocusPainted(false);
        btnPeriksaAkun.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnPeriksaAkun.setForeground(new java.awt.Color(255, 255, 255));
        btnPeriksaAkun.setBackground(new java.awt.Color(26, 43, 66));
        btnPeriksaAkun.addActionListener(this::btnPeriksaAkunActionPerformed);

        pnlPrioritas.setBackground(new java.awt.Color(255, 255, 255));

        pnlChart1.setBackground(new java.awt.Color(255, 255, 255));

        lblSection.setText("RINGKASAN DATA MASTER");
        lblSection.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblSection.setForeground(new java.awt.Color(103, 121, 143));

        javax.swing.GroupLayout pnlKpi0Layout = new javax.swing.GroupLayout(pnlKpi0);
        pnlKpi0.setLayout(pnlKpi0Layout);
        pnlKpi0Layout.setHorizontalGroup(
            pnlKpi0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi0Layout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addGroup(pnlKpi0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblKpiTitle0, 10, 176, Short.MAX_VALUE)
                  .addComponent(lblKpiValue0, 10, 176, Short.MAX_VALUE)
                  .addComponent(lblKpiSub0, 10, 176, Short.MAX_VALUE)
             )
            )
        );
        pnlKpi0Layout.setVerticalGroup(
            pnlKpi0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi0Layout.createSequentialGroup()
                 .addGap(12, 12, 12)
                 .addComponent(lblKpiTitle0, 14, 14, 14)
                 .addGap(4, 4, 4)
                 .addComponent(lblKpiValue0, 28, 28, 28)
                 .addGap(3, 3, 3)
                 .addComponent(lblKpiSub0, 16, 16, 16)
                 .addGap(12, 12, Short.MAX_VALUE)
            )
        );

        javax.swing.GroupLayout pnlKpi1Layout = new javax.swing.GroupLayout(pnlKpi1);
        pnlKpi1.setLayout(pnlKpi1Layout);
        pnlKpi1Layout.setHorizontalGroup(
            pnlKpi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi1Layout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addGroup(pnlKpi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblKpiTitle1, 10, 176, Short.MAX_VALUE)
                  .addComponent(lblKpiValue1, 10, 176, Short.MAX_VALUE)
                  .addComponent(lblKpiSub1, 10, 176, Short.MAX_VALUE)
             )
            )
        );
        pnlKpi1Layout.setVerticalGroup(
            pnlKpi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi1Layout.createSequentialGroup()
                 .addGap(12, 12, 12)
                 .addComponent(lblKpiTitle1, 14, 14, 14)
                 .addGap(4, 4, 4)
                 .addComponent(lblKpiValue1, 28, 28, 28)
                 .addGap(3, 3, 3)
                 .addComponent(lblKpiSub1, 16, 16, 16)
                 .addGap(12, 12, Short.MAX_VALUE)
            )
        );

        javax.swing.GroupLayout pnlKpi2Layout = new javax.swing.GroupLayout(pnlKpi2);
        pnlKpi2.setLayout(pnlKpi2Layout);
        pnlKpi2Layout.setHorizontalGroup(
            pnlKpi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi2Layout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addGroup(pnlKpi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblKpiTitle2, 10, 176, Short.MAX_VALUE)
                  .addComponent(lblKpiValue2, 10, 176, Short.MAX_VALUE)
                  .addComponent(lblKpiSub2, 10, 176, Short.MAX_VALUE)
             )
            )
        );
        pnlKpi2Layout.setVerticalGroup(
            pnlKpi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi2Layout.createSequentialGroup()
                 .addGap(12, 12, 12)
                 .addComponent(lblKpiTitle2, 14, 14, 14)
                 .addGap(4, 4, 4)
                 .addComponent(lblKpiValue2, 28, 28, 28)
                 .addGap(3, 3, 3)
                 .addComponent(lblKpiSub2, 16, 16, 16)
                 .addGap(12, 12, Short.MAX_VALUE)
            )
        );

        javax.swing.GroupLayout pnlKpi3Layout = new javax.swing.GroupLayout(pnlKpi3);
        pnlKpi3.setLayout(pnlKpi3Layout);
        pnlKpi3Layout.setHorizontalGroup(
            pnlKpi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi3Layout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addGroup(pnlKpi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblKpiTitle3, 10, 176, Short.MAX_VALUE)
                  .addComponent(lblKpiValue3, 10, 176, Short.MAX_VALUE)
                  .addComponent(lblKpiSub3, 10, 176, Short.MAX_VALUE)
             )
            )
        );
        pnlKpi3Layout.setVerticalGroup(
            pnlKpi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi3Layout.createSequentialGroup()
                 .addGap(12, 12, 12)
                 .addComponent(lblKpiTitle3, 14, 14, 14)
                 .addGap(4, 4, 4)
                 .addComponent(lblKpiValue3, 28, 28, 28)
                 .addGap(3, 3, 3)
                 .addComponent(lblKpiSub3, 16, 16, 16)
                 .addGap(12, 12, Short.MAX_VALUE)
            )
        );

        javax.swing.GroupLayout pnlKpi4Layout = new javax.swing.GroupLayout(pnlKpi4);
        pnlKpi4.setLayout(pnlKpi4Layout);
        pnlKpi4Layout.setHorizontalGroup(
            pnlKpi4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi4Layout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addGroup(pnlKpi4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblKpiTitle4, 10, 176, Short.MAX_VALUE)
                  .addComponent(lblKpiValue4, 10, 176, Short.MAX_VALUE)
                  .addComponent(lblKpiSub4, 10, 176, Short.MAX_VALUE)
             )
            )
        );
        pnlKpi4Layout.setVerticalGroup(
            pnlKpi4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi4Layout.createSequentialGroup()
                 .addGap(12, 12, 12)
                 .addComponent(lblKpiTitle4, 14, 14, 14)
                 .addGap(4, 4, 4)
                 .addComponent(lblKpiValue4, 28, 28, 28)
                 .addGap(3, 3, 3)
                 .addComponent(lblKpiSub4, 16, 16, 16)
                 .addGap(12, 12, Short.MAX_VALUE)
            )
        );

        javax.swing.GroupLayout pnlKpi5Layout = new javax.swing.GroupLayout(pnlKpi5);
        pnlKpi5.setLayout(pnlKpi5Layout);
        pnlKpi5Layout.setHorizontalGroup(
            pnlKpi5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi5Layout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addGroup(pnlKpi5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblKpiTitle5, 10, 176, Short.MAX_VALUE)
                  .addComponent(lblKpiValue5, 10, 176, Short.MAX_VALUE)
                  .addComponent(lblKpiSub5, 10, 176, Short.MAX_VALUE)
             )
            )
        );
        pnlKpi5Layout.setVerticalGroup(
            pnlKpi5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi5Layout.createSequentialGroup()
                 .addGap(12, 12, 12)
                 .addComponent(lblKpiTitle5, 14, 14, 14)
                 .addGap(4, 4, 4)
                 .addComponent(lblKpiValue5, 28, 28, 28)
                 .addGap(3, 3, 3)
                 .addComponent(lblKpiSub5, 16, 16, 16)
                 .addGap(12, 12, Short.MAX_VALUE)
            )
        );

        javax.swing.GroupLayout pnlKpi6Layout = new javax.swing.GroupLayout(pnlKpi6);
        pnlKpi6.setLayout(pnlKpi6Layout);
        pnlKpi6Layout.setHorizontalGroup(
            pnlKpi6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi6Layout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addGroup(pnlKpi6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblKpiTitle6, 10, 176, Short.MAX_VALUE)
                  .addComponent(lblKpiValue6, 10, 176, Short.MAX_VALUE)
                  .addComponent(lblKpiSub6, 10, 176, Short.MAX_VALUE)
             )
            )
        );
        pnlKpi6Layout.setVerticalGroup(
            pnlKpi6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi6Layout.createSequentialGroup()
                 .addGap(12, 12, 12)
                 .addComponent(lblKpiTitle6, 14, 14, 14)
                 .addGap(4, 4, 4)
                 .addComponent(lblKpiValue6, 28, 28, 28)
                 .addGap(3, 3, 3)
                 .addComponent(lblKpiSub6, 16, 16, 16)
                 .addGap(12, 12, Short.MAX_VALUE)
            )
        );

        javax.swing.GroupLayout pnlKpi7Layout = new javax.swing.GroupLayout(pnlKpi7);
        pnlKpi7.setLayout(pnlKpi7Layout);
        pnlKpi7Layout.setHorizontalGroup(
            pnlKpi7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi7Layout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addGroup(pnlKpi7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblKpiTitle7, 10, 176, Short.MAX_VALUE)
                  .addComponent(lblKpiValue7, 10, 176, Short.MAX_VALUE)
                  .addComponent(lblKpiSub7, 10, 176, Short.MAX_VALUE)
             )
            )
        );
        pnlKpi7Layout.setVerticalGroup(
            pnlKpi7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi7Layout.createSequentialGroup()
                 .addGap(12, 12, 12)
                 .addComponent(lblKpiTitle7, 14, 14, 14)
                 .addGap(4, 4, 4)
                 .addComponent(lblKpiValue7, 28, 28, 28)
                 .addGap(3, 3, 3)
                 .addComponent(lblKpiSub7, 16, 16, 16)
                 .addGap(12, 12, Short.MAX_VALUE)
            )
        );

        javax.swing.GroupLayout pnlPrioritasLayout = new javax.swing.GroupLayout(pnlPrioritas);
        pnlPrioritas.setLayout(pnlPrioritasLayout);
        pnlPrioritasLayout.setHorizontalGroup(
            pnlPrioritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlPrioritasLayout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addGroup(pnlPrioritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblPriTitle, 10, 260, Short.MAX_VALUE)
                  .addComponent(lblPriHint, 10, 260, Short.MAX_VALUE)
                  .addComponent(lblP1, 10, 260, Short.MAX_VALUE)
                  .addComponent(btnKelolaAkun, 150, 150, 150)
                  .addComponent(lblP2, 10, 260, Short.MAX_VALUE)
                  .addComponent(btnPeriksaAkun, 150, 150, 150)
             )
                 .addGap(16, 16, 16)
            )
        );
        pnlPrioritasLayout.setVerticalGroup(
            pnlPrioritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlPrioritasLayout.createSequentialGroup()
                 .addGap(14, 14, 14)
                 .addComponent(lblPriTitle, 18, 18, 18)
                 .addGap(3, 3, 3)
                 .addComponent(lblPriHint, 15, 15, 15)
                 .addGap(12, 12, 12)
                 .addComponent(lblP1, 20, 20, 20)
                 .addGap(8, 8, 8)
                 .addComponent(btnKelolaAkun, 40, 40, 40)
                 .addGap(12, 12, 12)
                 .addComponent(lblP2, 20, 20, 20)
                 .addGap(8, 8, 8)
                 .addComponent(btnPeriksaAkun, 40, 40, 40)
                 .addGap(14, 14, Short.MAX_VALUE)
            )
        );


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(lblTitle, 10, 600, Short.MAX_VALUE)
              )
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(lblHint, 10, 600, Short.MAX_VALUE)
              )
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(pnlKpi0, 10, 208, Short.MAX_VALUE)
                   .addGap(12, 12, Short.MAX_VALUE)
                   .addComponent(pnlKpi1, 10, 208, Short.MAX_VALUE)
                   .addGap(12, 12, Short.MAX_VALUE)
                   .addComponent(pnlKpi2, 10, 208, Short.MAX_VALUE)
                   .addGap(12, 12, Short.MAX_VALUE)
                   .addComponent(pnlKpi3, 10, 208, Short.MAX_VALUE)
              )
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(pnlKpi4, 10, 208, Short.MAX_VALUE)
                   .addGap(12, 12, Short.MAX_VALUE)
                   .addComponent(pnlKpi5, 10, 208, Short.MAX_VALUE)
                   .addGap(12, 12, Short.MAX_VALUE)
                   .addComponent(pnlKpi6, 10, 208, Short.MAX_VALUE)
                   .addGap(12, 12, Short.MAX_VALUE)
                   .addComponent(pnlKpi7, 10, 208, Short.MAX_VALUE)
              )
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(pnlChart1, 10, 560, Short.MAX_VALUE)
                   .addGap(12, 12, Short.MAX_VALUE)
                   .addComponent(pnlPrioritas, 10, 304, Short.MAX_VALUE)
              )
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(lblSection, 10, 600, Short.MAX_VALUE)
              )
             )
                 .addGap(24, 24, 24)
            )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addComponent(lblTitle, 40, 40, 40)
                 .addGap(2, 2, 2)
                 .addComponent(lblHint, 22, 22, 22)
                 .addGap(14, 14, 14)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(pnlKpi0, 90, 90, 90)
                  .addComponent(pnlKpi1, 90, 90, 90)
                  .addComponent(pnlKpi2, 90, 90, 90)
                  .addComponent(pnlKpi3, 90, 90, 90)
             )
                 .addGap(14, 14, 14)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(pnlChart1, 200, 340, Short.MAX_VALUE)
                  .addComponent(pnlPrioritas, 200, 340, Short.MAX_VALUE)
             )
                 .addGap(14, 14, 14)
                 .addComponent(lblSection, 20, 20, 20)
                 .addGap(8, 8, 8)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(pnlKpi4, 90, 90, 90)
                  .addComponent(pnlKpi5, 90, 90, 90)
                  .addComponent(pnlKpi6, 90, 90, 90)
                  .addComponent(pnlKpi7, 90, 90, 90)
             )
                 .addGap(16, 16, 16)
            )
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

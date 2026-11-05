package view;

import config.AppConfig;
import controller.*;
import model.*;
import enums.*;
import java.time.*;
import java.util.*;
import javax.swing.*;

/** Halaman HSE: katalog kondisi lokasi dan pintasan monitoring. */
public class KondisiLokasiPanel extends javax.swing.JPanel {

    public KondisiLokasiPanel() {
        initComponents();
        try { refreshData(); } catch (Exception ex) { FormUtil.error(this, ex); }
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
        scrollKatalog = new javax.swing.JScrollPane();
        pnlListKartu = new javax.swing.JPanel();
        lblDetailTitle = new javax.swing.JLabel();
        lblDNama = new javax.swing.JLabel();
        lblDBadge = new javax.swing.JLabel();
        lblDJenis = new javax.swing.JLabel();
        lblDStatus = new javax.swing.JLabel();
        lblDMonTerakhir = new javax.swing.JLabel();
        lblDHasil = new javax.swing.JLabel();
        lblDPenanganan = new javax.swing.JLabel();
        lblDTindakLanjut = new javax.swing.JLabel();
        btnBuatMonitoring = new javax.swing.JButton();
        btnInformasikan = new javax.swing.JButton();
        btnSegarkan = new javax.swing.JButton();
        pnlDetail = new javax.swing.JPanel();
        lblParameter = new javax.swing.JLabel();
        scrollParameter = new javax.swing.JScrollPane();
        tblParameter = new javax.swing.JTable();


        lblTitle.setText("Kondisi Lokasi Tambang");
        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));

        lblHint.setText("Katalog PIT dan Stockpile beserta hasil monitoring terakhir");
        lblHint.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblHint.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiTitle0.setText("TOTAL LOKASI");
        lblKpiTitle0.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle0.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue0.setText("-");
        lblKpiValue0.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue0.setForeground(new java.awt.Color(26, 43, 66));

        lblKpiSub0.setText("PIT dan stockpile aktif");
        lblKpiSub0.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub0.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi0.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle1.setText("PERINGATAN TERAKHIR");
        lblKpiTitle1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle1.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue1.setText("-");
        lblKpiValue1.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue1.setForeground(new java.awt.Color(160, 45, 62));

        lblKpiSub1.setText("lokasi dengan hasil terakhir peringatan");
        lblKpiSub1.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub1.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi1.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle2.setText("BELUM DITANGANI");
        lblKpiTitle2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle2.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue2.setText("-");
        lblKpiValue2.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue2.setForeground(new java.awt.Color(183, 121, 31));

        lblKpiSub2.setText("peringatan yang belum selesai ditangani");
        lblKpiSub2.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub2.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi2.setBackground(new java.awt.Color(255, 255, 255));

        scrollKatalog.setBackground(new java.awt.Color(244, 247, 252));

        pnlListKartu.setBackground(new java.awt.Color(244, 247, 252));

        lblDetailTitle.setText("DETAIL LOKASI");
        lblDetailTitle.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        lblDetailTitle.setForeground(new java.awt.Color(26, 43, 66));

        lblDNama.setText("-");
        lblDNama.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lblDNama.setForeground(new java.awt.Color(26, 43, 66));

        lblDBadge.setText("PERLU TINDAK LANJUT");
        lblDBadge.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblDBadge.setForeground(new java.awt.Color(255, 255, 255));
        lblDBadge.setBackground(new java.awt.Color(160, 45, 62));
        lblDBadge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDBadge.setOpaque(true);

        lblDJenis.setText("-");
        lblDJenis.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblDJenis.setForeground(new java.awt.Color(103, 121, 143));

        lblDStatus.setText("-");
        lblDStatus.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblDStatus.setForeground(new java.awt.Color(103, 121, 143));

        lblDMonTerakhir.setText("-");
        lblDMonTerakhir.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblDMonTerakhir.setForeground(new java.awt.Color(26, 43, 66));

        lblDHasil.setText("-");
        lblDHasil.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        lblDHasil.setForeground(new java.awt.Color(26, 43, 66));

        lblDPenanganan.setText("-");
        lblDPenanganan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblDPenanganan.setForeground(new java.awt.Color(103, 121, 143));

        lblDTindakLanjut.setText("-");
        lblDTindakLanjut.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblDTindakLanjut.setForeground(new java.awt.Color(103, 121, 143));

        btnBuatMonitoring.setText("Buat Monitoring Lokasi Ini");
        btnBuatMonitoring.setFocusPainted(false);
        btnBuatMonitoring.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnBuatMonitoring.setForeground(new java.awt.Color(255, 255, 255));
        btnBuatMonitoring.setBackground(new java.awt.Color(43, 106, 230));
        btnBuatMonitoring.addActionListener(this::btnBuatMonitoringActionPerformed);

        btnInformasikan.setText("Informasikan ke Manager");
        btnInformasikan.setFocusPainted(false);
        btnInformasikan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnInformasikan.setForeground(new java.awt.Color(255, 255, 255));
        btnInformasikan.setBackground(new java.awt.Color(183, 121, 31));
        btnInformasikan.addActionListener(this::btnInformasikanActionPerformed);

        btnSegarkan.setText("Lihat / Kelola Pengukuran");
        btnSegarkan.setFocusPainted(false);
        btnSegarkan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnSegarkan.setForeground(new java.awt.Color(255, 255, 255));
        btnSegarkan.setBackground(new java.awt.Color(103, 121, 143));
        btnSegarkan.addActionListener(this::btnSegarkanActionPerformed);

        pnlDetail.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout pnlListKartuLayout = new javax.swing.GroupLayout(pnlListKartu);
        pnlListKartu.setLayout(pnlListKartuLayout);
        pnlListKartuLayout.setHorizontalGroup(
            pnlListKartuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlListKartuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 0, Short.MAX_VALUE)
            )
        );
        pnlListKartuLayout.setVerticalGroup(
            pnlListKartuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlListKartuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 0, Short.MAX_VALUE)
            )
        );

        lblParameter.setText("PARAMETER PENGUKURAN TERAKHIR");
        lblParameter.setFont(new java.awt.Font("SansSerif", 1, 12));
        lblParameter.setForeground(new java.awt.Color(26, 43, 66));
        tblParameter.setFont(new java.awt.Font("SansSerif", 0, 12));
        tblParameter.setRowHeight(25);
        tblParameter.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{}, new String[]{"Parameter", "Nilai", "Hasil"}) {
            @Override public boolean isCellEditable(int r,int c){ return false; }
        });
        scrollParameter.setViewportView(tblParameter);

        javax.swing.GroupLayout pnlDetailLayout = new javax.swing.GroupLayout(pnlDetail);
        pnlDetail.setLayout(pnlDetailLayout);
        pnlDetailLayout.setHorizontalGroup(
            pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlDetailLayout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblDetailTitle, 10, 272, Short.MAX_VALUE)
                  .addComponent(lblDNama, 10, 272, Short.MAX_VALUE)
                  .addComponent(lblDBadge, 10, 272, Short.MAX_VALUE)
                  .addComponent(lblDJenis, 10, 272, Short.MAX_VALUE)
                  .addComponent(lblDStatus, 10, 272, Short.MAX_VALUE)
                  .addComponent(lblDMonTerakhir, 10, 272, Short.MAX_VALUE)
                  .addComponent(lblDHasil, 10, 272, Short.MAX_VALUE)
                  .addComponent(lblDPenanganan, 10, 272, Short.MAX_VALUE)
                  .addComponent(lblDTindakLanjut, 10, 272, Short.MAX_VALUE)
                  .addComponent(lblParameter, 10, 272, Short.MAX_VALUE)
                  .addComponent(scrollParameter, 10, 272, Short.MAX_VALUE)
                  .addComponent(btnBuatMonitoring, 240, 240, 240)
                  .addComponent(btnInformasikan, 240, 240, 240)
                  .addComponent(btnSegarkan, 240, 240, 240)
             )
                 .addGap(16, 16, 16)
            )
        );
        pnlDetailLayout.setVerticalGroup(
            pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlDetailLayout.createSequentialGroup()
                 .addGap(14, 14, 14)
                 .addComponent(lblDetailTitle, 18, 18, 18)
                 .addGap(6, 6, 6)
                 .addComponent(lblDNama, 24, 24, 24)
                 .addGap(6, 6, 6)
                 .addComponent(lblDBadge, 22, 22, 22)
                 .addGap(8, 8, 8)
                 .addComponent(lblDJenis, 18, 18, 18)
                 .addGap(4, 4, 4)
                 .addComponent(lblDStatus, 18, 18, 18)
                 .addGap(10, 10, 10)
                 .addComponent(lblDMonTerakhir, 18, 18, 18)
                 .addGap(4, 4, 4)
                 .addComponent(lblDHasil, 20, 20, 20)
                 .addGap(4, 4, 4)
                 .addComponent(lblDPenanganan, 18, 18, 18)
                 .addGap(8, 8, 8)
                 .addComponent(lblDTindakLanjut, 48, 48, 48)
                 .addGap(8, 8, 8)
                 .addComponent(lblParameter, 18, 18, 18)
                 .addGap(5, 5, 5)
                 .addComponent(scrollParameter, 100, 132, 160)
                 .addGap(12, 12, 12)
                 .addComponent(btnBuatMonitoring, 42, 42, 42)
                 .addGap(8, 8, 8)
                 .addComponent(btnInformasikan, 42, 42, 42)
                 .addGap(8, 8, 8)
                 .addComponent(btnSegarkan, 36, 36, 36)
                 .addGap(14, 14, Short.MAX_VALUE)
            )
        );

        scrollKatalog.setViewportView(pnlListKartu);

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
              )
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(scrollKatalog, 10, 544, Short.MAX_VALUE)
                   .addGap(12, 12, Short.MAX_VALUE)
                   .addComponent(pnlDetail, 10, 312, Short.MAX_VALUE)
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
                 .addGap(12, 12, 12)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(pnlKpi0, 90, 90, 90)
                  .addComponent(pnlKpi1, 90, 90, 90)
                  .addComponent(pnlKpi2, 90, 90, 90)
             )
                 .addGap(14, 14, 14)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(scrollKatalog, 200, 660, Short.MAX_VALUE)
                  .addComponent(pnlDetail, 200, 660, Short.MAX_VALUE)
             )
                 .addGap(16, 16, 16)
            )
        );
    }// </editor-fold>//GEN-END:initComponents

    private final java.util.List<model.Lokasi> lokasiList = new ArrayList<>();

    private final java.util.Map<Integer, java.util.List<model.MonitoringLingkungan>> riwayatPerLokasi = new LinkedHashMap<>();

    private model.Lokasi terpilih;



    private void refreshData() {

        lokasiList.clear();

        lokasiList.addAll(AppConfig.getMonitoringController().tampilkanSemuaLokasi());

        riwayatPerLokasi.clear();

        int peringatan = 0;

        int belum = 0;

        for (model.Lokasi l : lokasiList) {

            java.util.List<model.MonitoringLingkungan> riwayat =

                AppConfig.getMonitoringController().tampilkanMonitoringByLokasi(l.getIdLokasi());

            riwayatPerLokasi.put(l.getIdLokasi(), riwayat);

            model.MonitoringLingkungan akhir = riwayat.isEmpty() ? null : riwayat.get(0);

            if (akhir != null && akhir.getStatusMonitoring() == enums.StatusMonitoring.PERINGATAN) {

                peringatan++;

                if (akhir.getStatusPenanganan() != enums.StatusPenanganan.SELESAI)belum++;

            }

        }

        lblKpiValue0.setText(String.valueOf(lokasiList.size()));

        lblKpiValue1.setText(String.valueOf(peringatan));

        lblKpiValue2.setText(String.valueOf(belum));



        pnlListKartu.removeAll();

        pnlListKartu.setLayout(new javax.swing.BoxLayout(pnlListKartu, javax.swing.BoxLayout.PAGE_AXIS));

        for (model.Lokasi l : lokasiList) {

            KartuLokasiPanel kartu = new KartuLokasiPanel();

            java.util.List<model.MonitoringLingkungan> riwayat = riwayatPerLokasi.get(l.getIdLokasi());

            model.MonitoringLingkungan akhir = riwayat == null || riwayat.isEmpty() ? null : riwayat.get(0);

            kartu.setData(l, akhir);

            pasangAksiKartu(kartu, () -> pilihLokasi(l));

            pnlListKartu.add(kartu);

            pnlListKartu.add(javax.swing.Box.createVerticalStrut(10));

        }

        pnlListKartu.revalidate();

        pnlListKartu.repaint();

        if (!lokasiList.isEmpty())pilihLokasi(lokasiList.get(0));

    }



    private void pasangAksiKartu(java.awt.Component komponen, Runnable aksi) {
        komponen.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
        komponen.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override public void mouseClicked(java.awt.event.MouseEvent e) { aksi.run(); }
        });
        if (komponen instanceof java.awt.Container) {
            for (java.awt.Component child : ((java.awt.Container)komponen).getComponents()) {
                pasangAksiKartu(child, aksi);
            }
        }
    }

    private model.MonitoringLingkungan monitoringTerakhir(int idLokasi) {

        java.util.List<model.MonitoringLingkungan> riwayat = riwayatPerLokasi.get(idLokasi);

        return riwayat == null || riwayat.isEmpty() ? null : riwayat.get(0);

    }



    private void pilihLokasi(model.Lokasi l) {

        terpilih = l;

        model.MonitoringLingkungan akhir = monitoringTerakhir(l.getIdLokasi());

        lblDNama.setText(l.getNamaLokasi());
        javax.swing.table.DefaultTableModel parameterModel = (javax.swing.table.DefaultTableModel)tblParameter.getModel();
        parameterModel.setRowCount(0);
        if (akhir != null) {
            for (model.DetailMonitoring detail : akhir.getDetailMonitoring()) {
                parameterModel.addRow(new Object[]{
                    detail.getParameter().getNamaParameter(),
                    detail.getNilaiPengukuran() + " " + detail.getParameter().getSatuan(),
                    detail.getStatusDetail()
                });
            }
        }

        boolean pit = l.getJenisLokasi() == enums.JenisLokasi.PIT;

        lblDJenis.setText(pit ? "PIT - area penambangan" : "STOCKPILE - area penampungan material");

        lblDStatus.setText("Status operasional: " + l.getStatusOperasional());

        if (akhir == null) {

            lblDMonTerakhir.setText("Belum ada kegiatan monitoring");

            lblDHasil.setText("Hasil: belum ada data");

            lblDHasil.setForeground(new java.awt.Color(103, 121, 143));

            lblDPenanganan.setText("Penanganan: -");

            lblDTindakLanjut.setText("Tindak lanjut: -");

            lblDBadge.setVisible(false);

            btnInformasikan.setEnabled(false);
            btnSegarkan.setEnabled(false);

        } else {

            java.time.format.DateTimeFormatter fmt = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

            lblDMonTerakhir.setText("Monitoring terakhir: "

                + (akhir.getTanggalMonitoring() == null ? "-" : akhir.getTanggalMonitoring().format(fmt)));

            boolean peringatan = akhir.getStatusMonitoring() == enums.StatusMonitoring.PERINGATAN;

            lblDHasil.setText("Hasil: " + akhir.getStatusMonitoring());

            lblDHasil.setForeground(peringatan ? new java.awt.Color(160, 45, 62) : new java.awt.Color(46, 125, 70));

            lblDPenanganan.setText("Penanganan: " + akhir.getStatusPenanganan());

            lblDTindakLanjut.setText("Tindak lanjut: "

                + (akhir.getTindakLanjut() == null || akhir.getTindakLanjut().trim().isEmpty() ? "-" : akhir.getTindakLanjut()));

            boolean perluTindak = peringatan && akhir.getStatusPenanganan() != enums.StatusPenanganan.SELESAI;

            lblDBadge.setVisible(perluTindak);

            btnInformasikan.setEnabled(perluTindak);
            btnSegarkan.setEnabled(true);

        }

    }



    private void btnBuatMonitoringActionPerformed(java.awt.event.ActionEvent evt) {

        try {

            if (terpilih == null)throw new IllegalArgumentException("Pilih lokasi terlebih dahulu.");

            MonitoringFormFrame f = new MonitoringFormFrame();

            f.pilihLokasi(terpilih.getIdLokasi());

            f.setVisible(true);

            f.addWindowListener(new java.awt.event.WindowAdapter() {

                @Override public void windowClosed(java.awt.event.WindowEvent e) { refreshData(); }

            });

        } catch (Exception ex) { FormUtil.error(this, ex); }

    }



    private void btnInformasikanActionPerformed(java.awt.event.ActionEvent evt) {

        try {

            if (terpilih == null)throw new IllegalArgumentException("Pilih lokasi terlebih dahulu.");

            model.MonitoringLingkungan akhir = monitoringTerakhir(terpilih.getIdLokasi());

            if (akhir == null)throw new IllegalArgumentException("Lokasi ini belum memiliki monitoring.");

            if (JOptionPane.showConfirmDialog(this,

                "Meneruskan informasi peringatan lokasi " + terpilih.getNamaLokasi() + " ke Manager?",

                "Konfirmasi", JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION)return;

            AppConfig.getMonitoringController().informasikanManager(akhir.getIdMonitoring());

            JOptionPane.showMessageDialog(this, "Informasi peringatan telah diteruskan ke Manager.");

            refreshData();

        } catch (Exception ex) { FormUtil.error(this, ex); }

    }



    private void btnSegarkanActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if (terpilih == null) throw new IllegalArgumentException("Pilih lokasi terlebih dahulu.");
            model.MonitoringLingkungan mon = monitoringTerakhir(terpilih.getIdLokasi());
            if (mon == null) throw new IllegalArgumentException("Lokasi ini belum memiliki kegiatan monitoring.");
            MonitoringDetailFrame f = new MonitoringDetailFrame(mon.getIdMonitoring(), false);
            f.setVisible(true);
            f.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override public void windowClosed(java.awt.event.WindowEvent e) { refreshData(); }
            });
        } catch(Exception ex) { FormUtil.error(this, ex); }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuatMonitoring;
    private javax.swing.JButton btnInformasikan;
    private javax.swing.JButton btnSegarkan;
    private javax.swing.JLabel lblDBadge;
    private javax.swing.JLabel lblDHasil;
    private javax.swing.JLabel lblDJenis;
    private javax.swing.JLabel lblDMonTerakhir;
    private javax.swing.JLabel lblDNama;
    private javax.swing.JLabel lblDPenanganan;
    private javax.swing.JLabel lblDStatus;
    private javax.swing.JLabel lblDTindakLanjut;
    private javax.swing.JLabel lblDetailTitle;
    private javax.swing.JLabel lblHint;
    private javax.swing.JLabel lblKpiSub0;
    private javax.swing.JLabel lblKpiSub1;
    private javax.swing.JLabel lblKpiSub2;
    private javax.swing.JLabel lblKpiTitle0;
    private javax.swing.JLabel lblKpiTitle1;
    private javax.swing.JLabel lblKpiTitle2;
    private javax.swing.JLabel lblKpiValue0;
    private javax.swing.JLabel lblKpiValue1;
    private javax.swing.JLabel lblKpiValue2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlDetail;
    private javax.swing.JLabel lblParameter;
    private javax.swing.JScrollPane scrollParameter;
    private javax.swing.JTable tblParameter;
    private javax.swing.JPanel pnlKpi0;
    private javax.swing.JPanel pnlKpi1;
    private javax.swing.JPanel pnlKpi2;
    private javax.swing.JPanel pnlListKartu;
    private javax.swing.JScrollPane scrollKatalog;
    // End of variables declaration//GEN-END:variables
}

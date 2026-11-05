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

/** Dashboard Petugas HSE: kondisi lingkungan dan prioritas penanganan. */
public class DashboardHSEPanel extends javax.swing.JPanel {
    private java.util.function.Consumer<String> navigate;

    public DashboardHSEPanel() {
        initComponents();
        cmbPeriode.setSelectedIndex(2);
        choAwal.setDate(java.sql.Date.valueOf(LocalDate.now().withDayOfMonth(1)));
        choAkhir.setDate(java.sql.Date.valueOf(LocalDate.now()));
        try { refreshData(); } catch (Exception ex) { FormUtil.error(this, ex); }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblHint = new javax.swing.JLabel();
        lblPeriode = new javax.swing.JLabel();
        cmbPeriode = new javax.swing.JComboBox();
        choAwal = new com.toedter.calendar.JDateChooser();
        choAkhir = new com.toedter.calendar.JDateChooser();
        btnTerapkan = new javax.swing.JButton();
        pnlFilter = new javax.swing.JPanel();
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
        lblPriTitle = new javax.swing.JLabel();
        btnLihatDetail = new javax.swing.JButton();
        scrollPrioritas = new javax.swing.JScrollPane();
        tblPrioritas = new javax.swing.JTable();
        pnlChart1 = new javax.swing.JPanel();
        pnlPrioritas = new javax.swing.JPanel();


        lblTitle.setText("Dashboard Petugas HSE");
        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 23)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));

        lblHint.setText("Pemantauan kondisi lingkungan dan prioritas penanganan");
        lblHint.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblHint.setForeground(new java.awt.Color(103, 121, 143));

        lblPeriode.setText("Periode");
        lblPeriode.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblPeriode.setForeground(new java.awt.Color(26, 43, 66));

        cmbPeriode.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        cmbPeriode.setBackground(new java.awt.Color(255, 255, 255));
        cmbPeriode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hari Ini", "7 Hari Terakhir", "Bulan Ini", "Tahun Ini", "Semua Periode", "Rentang Kustom" }));

        choAwal.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        choAwal.setBackground(new java.awt.Color(255, 255, 255));

        choAkhir.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        choAkhir.setBackground(new java.awt.Color(255, 255, 255));

        btnTerapkan.setText("Terapkan");
        btnTerapkan.setFocusPainted(false);
        btnTerapkan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnTerapkan.setForeground(new java.awt.Color(255, 255, 255));
        btnTerapkan.setBackground(new java.awt.Color(43, 106, 230));
        btnTerapkan.addActionListener(this::btnTerapkanActionPerformed);

        pnlFilter.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle0.setText("TOTAL MONITORING");
        lblKpiTitle0.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle0.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue0.setText("-");
        lblKpiValue0.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue0.setForeground(new java.awt.Color(26, 43, 66));

        lblKpiSub0.setText("periode terpilih");
        lblKpiSub0.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub0.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi0.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle1.setText("HASIL NORMAL");
        lblKpiTitle1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle1.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue1.setText("-");
        lblKpiValue1.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue1.setForeground(new java.awt.Color(46, 125, 70));

        lblKpiSub1.setText("periode terpilih");
        lblKpiSub1.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub1.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi1.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle2.setText("MONITORING PERINGATAN");
        lblKpiTitle2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle2.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue2.setText("-");
        lblKpiValue2.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue2.setForeground(new java.awt.Color(160, 45, 62));

        lblKpiSub2.setText("periode terpilih");
        lblKpiSub2.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub2.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi2.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle3.setText("PENANGANAN BELUM SELESAI");
        lblKpiTitle3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle3.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue3.setText("-");
        lblKpiValue3.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue3.setForeground(new java.awt.Color(183, 121, 31));

        lblKpiSub3.setText("seluruh periode");
        lblKpiSub3.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub3.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi3.setBackground(new java.awt.Color(255, 255, 255));

        lblPriTitle.setText("PRIORITAS PENANGANAN LINGKUNGAN");
        lblPriTitle.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        lblPriTitle.setForeground(new java.awt.Color(26, 43, 66));

        btnLihatDetail.setText("Lihat Detail Pengukuran");
        btnLihatDetail.setFocusPainted(false);
        btnLihatDetail.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnLihatDetail.setForeground(new java.awt.Color(255, 255, 255));
        btnLihatDetail.setBackground(new java.awt.Color(43, 106, 230));
        btnLihatDetail.addActionListener(this::btnLihatDetailActionPerformed);

        scrollPrioritas.setBackground(new java.awt.Color(255, 255, 255));

        tblPrioritas.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        tblPrioritas.setRowHeight(28);
        tblPrioritas.setGridColor(new java.awt.Color(226, 232, 240));

        pnlChart1.setBackground(new java.awt.Color(255, 255, 255));

        pnlPrioritas.setBackground(new java.awt.Color(255, 255, 255));

        tblPrioritas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tanggal", "Lokasi", "Parameter", "Nilai", "Batas Normal", "Penanganan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        javax.swing.GroupLayout pnlFilterLayout = new javax.swing.GroupLayout(pnlFilter);
        pnlFilter.setLayout(pnlFilterLayout);
        pnlFilterLayout.setHorizontalGroup(
            pnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlFilterLayout.createSequentialGroup()
                 .addGap(20, 20, 20)
                 .addComponent(lblPeriode, 56, 56, 56)
                 .addGap(20, 20, 20)
                 .addComponent(cmbPeriode, 156, 156, 156)
                 .addGap(20, 20, 20)
                 .addComponent(choAwal, 132, 132, 132)
                 .addGap(20, 20, 20)
                 .addComponent(choAkhir, 132, 132, 132)
                 .addGap(20, 20, 20)
                 .addComponent(btnTerapkan, 116, 116, 116)
                 .addGap(20, 20, 20)
            )
        );
        pnlFilterLayout.setVerticalGroup(
            pnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlFilterLayout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addGroup(pnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(lblPeriode, 32, 32, 32)
                  .addComponent(cmbPeriode, 30, 30, 30)
                  .addComponent(choAwal, 30, 30, 30)
                  .addComponent(choAkhir, 30, 30, 30)
                  .addComponent(btnTerapkan, 32, 32, 32)
             )
                 .addGap(16, 16, Short.MAX_VALUE)
            )
        );

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

        javax.swing.GroupLayout pnlPrioritasLayout = new javax.swing.GroupLayout(pnlPrioritas);
        pnlPrioritas.setLayout(pnlPrioritasLayout);
        pnlPrioritasLayout.setHorizontalGroup(
            pnlPrioritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlPrioritasLayout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addComponent(lblPriTitle, 10, 400, Short.MAX_VALUE)
                 .addGap(0, 0, Short.MAX_VALUE)
                 .addComponent(btnLihatDetail, 210, 210, 210)
                 .addGap(16, 16, 16)
            )
                .addGroup(pnlPrioritasLayout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addComponent(scrollPrioritas, 10, 804, Short.MAX_VALUE)
                 .addGap(16, 16, 16)
            )
        );
        pnlPrioritasLayout.setVerticalGroup(
            pnlPrioritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlPrioritasLayout.createSequentialGroup()
                 .addGap(14, 14, 14)
                 .addGroup(pnlPrioritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblPriTitle, 20, 20, 20)
                  .addComponent(btnLihatDetail, 40, 40, 40)
             )
                 .addGap(8, 8, 8)
                 .addComponent(scrollPrioritas, 240, 240, Short.MAX_VALUE)
                 .addGap(14, 14, 14)
            )
        );

        scrollPrioritas.setViewportView(tblPrioritas);

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
                   .addComponent(pnlFilter, 712, 712, 712)
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
                   .addComponent(pnlPrioritas, 10, 868, Short.MAX_VALUE)
              )
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(pnlChart1, 10, 868, Short.MAX_VALUE)
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
                 .addComponent(pnlFilter, 62, 62, 62)
                 .addGap(12, 12, 12)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(pnlKpi0, 90, 90, 90)
                  .addComponent(pnlKpi1, 90, 90, 90)
                  .addComponent(pnlKpi2, 90, 90, 90)
                  .addComponent(pnlKpi3, 90, 90, 90)
             )
                 .addGap(14, 14, 14)
                 .addComponent(pnlPrioritas, 326, 326, 326)
                 .addGap(14, 14, 14)
                 .addComponent(pnlChart1, 200, 300, 300)
                 .addGap(16, 16, 16)
            )
        );
    }// </editor-fold>//GEN-END:initComponents

public DashboardHSEPanel(java.util.function.Consumer<String> nav) {

    this();

    this.navigate = nav;

}



    private enums.Periode periodeDipilih() {

        switch (cmbPeriode.getSelectedIndex()) {

            case 0: return enums.Periode.HARI_INI;

            case 1: return enums.Periode.TUJUH_HARI;

            case 2: return enums.Periode.BULAN_INI;

            case 3: return enums.Periode.TAHUN_INI;

            case 4: return enums.Periode.SEMUA;

            default: return enums.Periode.KUSTOM;

        }

    }



    private java.time.LocalDate tanggal(com.toedter.calendar.JDateChooser chooser) {

        java.util.Date nilai = chooser.getDate();

        return nilai == null ? null : nilai.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

    }



    private static String ton(double nilai) {

        return (Math.round(nilai * 10.0) / 10.0) + "";

    }



    private void btnTerapkanActionPerformed(java.awt.event.ActionEvent evt) {

        try { refreshData(); } catch (Exception ex) { FormUtil.error(this, ex); }

    }

    private final java.util.List<service.DashboardService.PrioritasRow> barisPrioritas = new ArrayList<>();



    private void refreshData() {

        enums.Periode periode = periodeDipilih();

        boolean kustom = periode == enums.Periode.KUSTOM;

        choAwal.setEnabled(kustom);

        choAkhir.setEnabled(kustom);

        LocalDate awal = tanggal(choAwal);

        LocalDate akhir = tanggal(choAkhir);

        if (kustom) {

            if (awal == null || akhir == null)throw new IllegalArgumentException("Pilih rentang tanggal untuk periode kustom.");

            if (awal.isAfter(akhir))throw new IllegalArgumentException("Tanggal awal tidak boleh setelah tanggal akhir.");

        }



        service.DashboardService.Data d = AppConfig.getDashboardController().hse(periode, awal, akhir);

        lblKpiValue0.setText(String.valueOf(d.monitoringTotal));

        lblKpiValue1.setText(String.valueOf(d.monitoringNormal));

        lblKpiValue2.setText(String.valueOf(d.monitoringPeringatan));

        lblKpiValue3.setText(String.valueOf(d.penangananBelumSelesai));



        barisPrioritas.clear();

        barisPrioritas.addAll(d.prioritas);

        DefaultTableModel model = new DefaultTableModel(

            new String[]{"Tanggal", "Lokasi", "Parameter", "Nilai", "Batas Normal", "Penanganan"}, 0) {

            @Override public boolean isCellEditable(int r, int c) { return false; }

        };

        java.time.format.DateTimeFormatter fmt = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (service.DashboardService.PrioritasRow r : d.prioritas) {

            model.addRow(new Object[]{r.tanggal == null ? "-" : r.tanggal.format(fmt), r.lokasi,

                r.parameter, r.nilai + " " + r.satuan, r.batasTeks(), r.penanganan});

        }

        tblPrioritas.setModel(model);

        tblPrioritas.setAutoCreateRowSorter(true);

        tblPrioritas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);



        org.jfree.data.category.DefaultCategoryDataset ds = new org.jfree.data.category.DefaultCategoryDataset();

        boolean ada = false;

        for (Map.Entry<String, Integer> e : d.peringatanPerParameter.entrySet()) {

            ds.addValue(e.getValue(), "Peringatan", e.getKey());

            if (e.getValue() > 0)ada = true;

        }

        if (!ada) {

            DashboardCharts.kosong(pnlChart1, "Tidak ada peringatan pada periode ini.");

        } else {

            DashboardCharts.render(pnlChart1, DashboardCharts.barHorizontal("Peringatan Berdasarkan Parameter", ds));

        }

    }



    private void btnLihatDetailActionPerformed(java.awt.event.ActionEvent evt) {

        try {

            int row = tblPrioritas.getSelectedRow();

            if (row < 0)throw new IllegalArgumentException("Pilih salah satu baris prioritas terlebih dahulu.");

            int id = barisPrioritas.get(tblPrioritas.convertRowIndexToModel(row)).idMonitoring;

            MonitoringReadOnlyFrame f = new MonitoringReadOnlyFrame(id);

            f.setVisible(true);

        } catch (Exception ex) { FormUtil.error(this, ex); }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLihatDetail;
    private javax.swing.JButton btnTerapkan;
    private com.toedter.calendar.JDateChooser choAkhir;
    private com.toedter.calendar.JDateChooser choAwal;
    private javax.swing.JComboBox cmbPeriode;
    private javax.swing.JLabel lblHint;
    private javax.swing.JLabel lblKpiSub0;
    private javax.swing.JLabel lblKpiSub1;
    private javax.swing.JLabel lblKpiSub2;
    private javax.swing.JLabel lblKpiSub3;
    private javax.swing.JLabel lblKpiTitle0;
    private javax.swing.JLabel lblKpiTitle1;
    private javax.swing.JLabel lblKpiTitle2;
    private javax.swing.JLabel lblKpiTitle3;
    private javax.swing.JLabel lblKpiValue0;
    private javax.swing.JLabel lblKpiValue1;
    private javax.swing.JLabel lblKpiValue2;
    private javax.swing.JLabel lblKpiValue3;
    private javax.swing.JLabel lblPeriode;
    private javax.swing.JLabel lblPriTitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlChart1;
    private javax.swing.JPanel pnlFilter;
    private javax.swing.JPanel pnlKpi0;
    private javax.swing.JPanel pnlKpi1;
    private javax.swing.JPanel pnlKpi2;
    private javax.swing.JPanel pnlKpi3;
    private javax.swing.JPanel pnlPrioritas;
    private javax.swing.JScrollPane scrollPrioritas;
    private javax.swing.JTable tblPrioritas;
    // End of variables declaration//GEN-END:variables
}

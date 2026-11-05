package view;

import config.AppConfig;
import controller.*;
import model.*;
import enums.*;
import java.time.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;

/** Laporan Produksi */
public class LaporanProduksiPanel extends javax.swing.JPanel {

    public LaporanProduksiPanel() {
        initComponents();
        btnTampilkan.setOpaque(true); btnTampilkan.setContentAreaFilled(true); btnTampilkan.setBorderPainted(false);
        choAwal.setDate(java.sql.Date.valueOf(LocalDate.now().minusDays(29)));
        choAkhir.setDate(java.sql.Date.valueOf(LocalDate.now()));
        try { refreshData(); } catch (Exception ex) { FormUtil.error(this, ex); }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblHint = new javax.swing.JLabel();
        lblAwal = new javax.swing.JLabel();
        choAwal = new com.toedter.calendar.JDateChooser();
        lblAkhir = new javax.swing.JLabel();
        choAkhir = new com.toedter.calendar.JDateChooser();
        btnTampilkan = new javax.swing.JButton();
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
        scrollTable = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();


        lblTitle.setText("Laporan Produksi");
        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));

        lblHint.setText("Rincian produksi per periode untuk mendukung keputusan Manager");
        lblHint.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblHint.setForeground(new java.awt.Color(103, 121, 143));

        lblAwal.setText("Dari");
        lblAwal.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblAwal.setForeground(new java.awt.Color(26, 43, 66));

        choAwal.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        choAwal.setBackground(new java.awt.Color(255, 255, 255));

        lblAkhir.setText("s/d");
        lblAkhir.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblAkhir.setForeground(new java.awt.Color(26, 43, 66));

        choAkhir.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        choAkhir.setBackground(new java.awt.Color(255, 255, 255));

        btnTampilkan.setText("Tampilkan");
        btnTampilkan.setFocusPainted(false);
        btnTampilkan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnTampilkan.setForeground(new java.awt.Color(255, 255, 255));
        btnTampilkan.setBackground(new java.awt.Color(43, 106, 230));
        btnTampilkan.addActionListener(this::btnTampilkanActionPerformed);

        pnlFilter.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle0.setText("TOTAL PRODUKSI PERIODE (TON)");
        lblKpiTitle0.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle0.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue0.setText("-");
        lblKpiValue0.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue0.setForeground(new java.awt.Color(26, 43, 66));

        lblKpiSub0.setText("berdasarkan rentang tanggal");
        lblKpiSub0.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub0.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi0.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle1.setText("STOK SAAT INI (TON)");
        lblKpiTitle1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle1.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue1.setText("-");
        lblKpiValue1.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue1.setForeground(new java.awt.Color(46, 125, 70));

        lblKpiSub1.setText("sisa material catatan terpilih");
        lblKpiSub1.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub1.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi1.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle2.setText("JUMLAH CATATAN");
        lblKpiTitle2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle2.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue2.setText("-");
        lblKpiValue2.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue2.setForeground(new java.awt.Color(43, 106, 230));

        lblKpiSub2.setText("catatan produksi periode");
        lblKpiSub2.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub2.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi2.setBackground(new java.awt.Color(255, 255, 255));

        scrollTable.setBackground(new java.awt.Color(255, 255, 255));

        tblData.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        tblData.setRowHeight(28);
        tblData.setGridColor(new java.awt.Color(226, 232, 240));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Tanggal", "Material", "Lokasi", "Produksi (ton)", "Tersedia (ton)"
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
                 .addComponent(lblAwal, 36, 36, 36)
                 .addGap(20, 20, 20)
                 .addComponent(choAwal, 130, 130, 130)
                 .addGap(20, 20, 20)
                 .addComponent(lblAkhir, 26, 26, 26)
                 .addGap(20, 20, 20)
                 .addComponent(choAkhir, 130, 130, 130)
                 .addGap(20, 20, 20)
                 .addComponent(btnTampilkan, 120, 120, 120)
                 .addGap(20, 20, 20)
            )
        );
        pnlFilterLayout.setVerticalGroup(
            pnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlFilterLayout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addGroup(pnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(lblAwal, 32, 32, 32)
                  .addComponent(choAwal, 30, 30, 30)
                  .addComponent(lblAkhir, 32, 32, 32)
                  .addComponent(choAkhir, 30, 30, 30)
                  .addComponent(btnTampilkan, 32, 32, 32)
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
                  .addComponent(lblKpiTitle0, 10, 180, Short.MAX_VALUE)
                  .addComponent(lblKpiValue0, 10, 180, Short.MAX_VALUE)
                  .addComponent(lblKpiSub0, 10, 180, Short.MAX_VALUE)
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
                  .addComponent(lblKpiTitle1, 10, 180, Short.MAX_VALUE)
                  .addComponent(lblKpiValue1, 10, 180, Short.MAX_VALUE)
                  .addComponent(lblKpiSub1, 10, 180, Short.MAX_VALUE)
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
                  .addComponent(lblKpiTitle2, 10, 180, Short.MAX_VALUE)
                  .addComponent(lblKpiValue2, 10, 180, Short.MAX_VALUE)
                  .addComponent(lblKpiSub2, 10, 180, Short.MAX_VALUE)
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

        scrollTable.setViewportView(tblData);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(lblTitle, 10, 500, Short.MAX_VALUE)
              )
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(lblHint, 10, 500, Short.MAX_VALUE)
              )
             )
                 .addGap(0, 0, Short.MAX_VALUE)
                 .addGap(24, 24, 24)
            )
                .addGroup(layout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(pnlFilter, 562, 562, 562)
              )
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(pnlKpi0, 10, 212, Short.MAX_VALUE)
                   .addGap(12, 12, Short.MAX_VALUE)
                   .addComponent(pnlKpi1, 10, 212, Short.MAX_VALUE)
                   .addGap(12, 12, Short.MAX_VALUE)
                   .addComponent(pnlKpi2, 10, 212, Short.MAX_VALUE)
              )
                  .addGroup(layout.createSequentialGroup()
                   .addGap(12, 12, 12)
                   .addComponent(scrollTable, 10, 868, Short.MAX_VALUE)
                   .addGap(24, 24, 24)
              )
             )
            )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                 .addGroup(layout.createSequentialGroup()
                  .addGap(16, 16, 16)
                  .addComponent(lblTitle, 40, 40, 40)
                  .addGap(2, 2, 2)
                  .addComponent(lblHint, 22, 22, 22)
             )
                 .addGap(12, 12, 12)
                 .addComponent(pnlFilter, 62, 62, 62)
                 .addGap(12, 12, 12)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(pnlKpi0, 90, 90, 90)
                  .addComponent(pnlKpi1, 90, 90, 90)
                  .addComponent(pnlKpi2, 90, 90, 90)
             )
                 .addGap(12, 12, 12)
                 .addComponent(scrollTable, 520, 520, Short.MAX_VALUE)
                 .addGap(16, 16, 16)
            )
        );
    }// </editor-fold>//GEN-END:initComponents

    private final controller.LaporanController laporan = AppConfig.getLaporanController();



    private LocalDate tanggal(JDateChooser chooser, String label) {

        java.util.Date nilai = chooser.getDate();

        if (nilai == null)throw new IllegalArgumentException(label + " wajib dipilih.");

        return nilai.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

    }



    private void refreshData() {

        LocalDate awal = tanggal(choAwal, "Tanggal awal"), akhir = tanggal(choAkhir, "Tanggal akhir");

        if (awal.isAfter(akhir))throw new IllegalArgumentException("Tanggal awal tidak boleh setelah tanggal akhir.");

        java.util.List<service.LaporanService.BarisProduksi> data = laporan.laporanProduksi(awal, akhir);

        DefaultTableModel model = new DefaultTableModel(

            new String[]{"No.", "Tanggal", "Material", "Lokasi", "Produksi (ton)", "Tersedia (ton)"}, 0) {

            @Override public boolean isCellEditable(int r, int c) { return false; }

        };

        double total = 0;

        double sisa = 0;

        for (service.LaporanService.BarisProduksi b : data) {

            model.addRow(new Object[]{model.getRowCount() + 1, b.tanggal, b.material, b.lokasi, b.jumlahProduksi, b.sisaSaatIni});

            total += b.jumlahProduksi;

            sisa += b.sisaSaatIni;

        }

        tblData.setModel(model);

        tblData.setAutoCreateRowSorter(true);

        tblData.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        FormUtil.nomorUrut(tblData);

        lblKpiValue0.setText((Math.round(total * 10.0) / 10.0) + "");

        lblKpiValue1.setText((Math.round(sisa * 10.0) / 10.0) + "");

        lblKpiValue2.setText(String.valueOf(data.size()));

    }



    private void btnTampilkanActionPerformed(java.awt.event.ActionEvent evt) {

        try { refreshData(); } catch (Exception ex) { FormUtil.error(this, ex); }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTampilkan;
    private com.toedter.calendar.JDateChooser choAkhir;
    private com.toedter.calendar.JDateChooser choAwal;
    private javax.swing.JLabel lblAkhir;
    private javax.swing.JLabel lblAwal;
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
    private javax.swing.JPanel pnlFilter;
    private javax.swing.JPanel pnlKpi0;
    private javax.swing.JPanel pnlKpi1;
    private javax.swing.JPanel pnlKpi2;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JTable tblData;
    // End of variables declaration//GEN-END:variables
}

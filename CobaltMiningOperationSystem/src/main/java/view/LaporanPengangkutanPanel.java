package view;
import config.AppConfig;
import controller.*;
import service.LaporanService;
import java.time.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

public class LaporanPengangkutanPanel extends javax.swing.JPanel {
    private final LaporanController laporan = AppConfig.getLaporanController();

    public LaporanPengangkutanPanel() {
        initComponents();

        JButton[] navButtons = {btnTampilkan};

        for (JButton btn : navButtons) {
            btn.setOpaque(true);
            btn.setContentAreaFilled(true);
            btn.setBorderPainted(false);
        }

        choAwal.setDate(java.sql.Date.valueOf(LocalDate.now().minusDays(29)));
        choAkhir.setDate(java.sql.Date.valueOf(LocalDate.now()));
        try { refreshData(); } catch(Exception ex) { FormUtil.error(this,ex); }

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
        scrollTable = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        pnlFilter = new javax.swing.JPanel();


        lblTitle.setText("Laporan Pengangkutan");
        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));

        lblHint.setText("Periode tanggal selesai pengangkutan (status SELESAI).");
        lblHint.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblHint.setForeground(new java.awt.Color(103, 121, 143));

        lblAwal.setText("Tanggal Awal");
        lblAwal.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblAwal.setForeground(new java.awt.Color(26, 43, 66));

        choAwal.setBackground(new java.awt.Color(255, 255, 255));

        lblAkhir.setText("Tanggal Akhir");
        lblAkhir.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblAkhir.setForeground(new java.awt.Color(26, 43, 66));

        choAkhir.setBackground(new java.awt.Color(255, 255, 255));

        btnTampilkan.setText("Tampilkan");
        btnTampilkan.setFocusPainted(false);
        btnTampilkan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnTampilkan.setForeground(new java.awt.Color(255, 255, 255));
        btnTampilkan.setBackground(new java.awt.Color(43, 106, 230));
        btnTampilkan.addActionListener(this::btnTampilkanActionPerformed);

        scrollTable.setBackground(new java.awt.Color(255, 255, 255));

        tblData.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        tblData.setRowHeight(28);
        tblData.setGridColor(new java.awt.Color(226, 232, 240));

        pnlFilter.setBackground(new java.awt.Color(255, 255, 255));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Tanggal Selesai", "Material", "Lokasi Tujuan", "Muatan (ton)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
                 .addComponent(lblAwal, 110, 110, 110)
                 .addGap(8, 8, 8)
                 .addComponent(choAwal, 170, 170, 170)
                 .addGap(24, 24, 24)
                 .addComponent(lblAkhir, 110, 110, 110)
                 .addGap(8, 8, 8)
                 .addComponent(choAkhir, 170, 170, 170)
                 .addGap(16, 16, 16)
                 .addComponent(btnTampilkan, 140, 140, 140)
                 .addGap(20, 20, 20)
            )
        );
        pnlFilterLayout.setVerticalGroup(
            pnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlFilterLayout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addGroup(pnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(lblAwal, 20, 20, 20)
                  .addComponent(choAwal, 30, 30, 30)
                  .addComponent(lblAkhir, 20, 20, 20)
                  .addComponent(choAkhir, 30, 30, 30)
                  .addComponent(btnTampilkan, 32, 32, 32)
             )
                 .addGap(16, 16, 16)
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
                   .addComponent(lblTitle, 520, 520, 520)
              )
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(lblHint, 520, 520, 520)
              )
             )
                 .addGap(0, 0, Short.MAX_VALUE)
                 .addGap(24, 24, 24)
            )
                .addGroup(layout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addComponent(pnlFilter, 796, 796, 796)
            )
                .addGroup(layout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addComponent(scrollTable, 240, 380, Short.MAX_VALUE)
                 .addGap(24, 24, 24)
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
                 .addGap(14, 14, 14)
                 .addComponent(pnlFilter, 62, 62, 62)
                 .addGap(14, 14, 14)
                 .addComponent(scrollTable, 240, 380, Short.MAX_VALUE)
                 .addGap(20, 20, 20)
            )
        );
    }// </editor-fold>//GEN-END:initComponents

    private LocalDate tanggal(JDateChooser chooser, String label) {
        java.util.Date nilai = chooser.getDate();

        if (nilai == null)throw new IllegalArgumentException(label+" wajib dipilih.");
        return nilai.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    private void refreshData() {
        LocalDate awal = tanggal(choAwal, "Tanggal awal"), akhir = tanggal(choAkhir, "Tanggal akhir");

        if (awal.isAfter(akhir))throw new IllegalArgumentException("Tanggal awal tidak boleh setelah tanggal akhir.");
        java.util.List<LaporanService.BarisPengangkutan> data = laporan.laporanPengangkutan(awal, akhir);
        javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(
            new String[]{"No.", "Tanggal Selesai", "Material", "Lokasi Tujuan", "Muatan (ton)"}, 0){
            @Override public boolean isCellEditable(int r,int c){return false;}
        };

        for (LaporanService.BarisPengangkutan b : data)model.addRow(new Object[]{model.getRowCount() + 1, b.tanggalSelesai, b.material, b.tujuan, b.jumlahMuatan});
        tblData.setModel(model);
        tblData.setAutoCreateRowSorter(true);
        tblData.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        FormUtil.nomorUrut(tblData);
    }

    private void btnTampilkanActionPerformed(java.awt.event.ActionEvent evt) {
        try{refreshData();}catch(Exception ex){FormUtil.error(this,ex);}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTampilkan;
    private com.toedter.calendar.JDateChooser choAkhir;
    private com.toedter.calendar.JDateChooser choAwal;
    private javax.swing.JLabel lblAkhir;
    private javax.swing.JLabel lblAwal;
    private javax.swing.JLabel lblHint;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlFilter;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JTable tblData;
    // End of variables declaration//GEN-END:variables
}

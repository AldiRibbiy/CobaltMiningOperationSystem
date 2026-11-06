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
        scrollTable = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        pnlFilter = new javax.swing.JPanel();
        lblAwal = new javax.swing.JLabel();
        choAwal = new com.toedter.calendar.JDateChooser();
        lblAkhir = new javax.swing.JLabel();
        choAkhir = new com.toedter.calendar.JDateChooser();
        btnTampilkan = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));
        lblTitle.setText("Laporan Pengangkutan");

        lblHint.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblHint.setForeground(new java.awt.Color(103, 121, 143));
        lblHint.setText("Periode tanggal selesai pengangkutan.");

        scrollTable.setBackground(new java.awt.Color(255, 255, 255));

        tblData.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        tblData.setRowHeight(28);
        tblData.setGridColor(new java.awt.Color(226, 232, 240));
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
        scrollTable.setViewportView(tblData);

        pnlFilter.setBackground(new java.awt.Color(255, 255, 255));

        lblAwal.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblAwal.setForeground(new java.awt.Color(26, 43, 66));
        lblAwal.setText("Tanggal Awal");

        choAwal.setBackground(new java.awt.Color(255, 255, 255));

        lblAkhir.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblAkhir.setForeground(new java.awt.Color(26, 43, 66));
        lblAkhir.setText("Tanggal Akhir");

        choAkhir.setBackground(new java.awt.Color(255, 255, 255));

        btnTampilkan.setBackground(new java.awt.Color(43, 106, 230));
        btnTampilkan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnTampilkan.setForeground(new java.awt.Color(255, 255, 255));
        btnTampilkan.setText("Tampilkan");
        btnTampilkan.setFocusPainted(false);
        btnTampilkan.addActionListener(this::btnTampilkanActionPerformed);

        org.jdesktop.layout.GroupLayout pnlFilterLayout = new org.jdesktop.layout.GroupLayout(pnlFilter);
        pnlFilter.setLayout(pnlFilterLayout);
        pnlFilterLayout.setHorizontalGroup(
            pnlFilterLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlFilterLayout.createSequentialGroup()
                .add(20, 20, 20)
                .add(lblAwal, 110, 110, 110)
                .add(8, 8, 8)
                .add(choAwal, 170, 170, 170)
                .add(24, 24, 24)
                .add(lblAkhir, 110, 110, 110)
                .add(8, 8, 8)
                .add(choAkhir, 170, 170, 170)
                .add(16, 16, 16)
                .add(btnTampilkan, 140, 140, 140)
                .add(20, 20, 20))
        );
        pnlFilterLayout.setVerticalGroup(
            pnlFilterLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlFilterLayout.createSequentialGroup()
                .add(16, 16, 16)
                .add(pnlFilterLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblAwal, 20, 20, 20)
                    .add(choAwal, 30, 30, 30)
                    .add(lblAkhir, 20, 20, 20)
                    .add(choAkhir, 30, 30, 30)
                    .add(btnTampilkan, 32, 32, 32))
                .add(16, 16, 16))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(24, 24, 24)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lblTitle, 520, 520, 520)
                            .add(lblHint, 520, 520, 520))
                        .add(0, 0, Short.MAX_VALUE))
                    .add(pnlFilter, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(scrollTable, 240, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(lblTitle, 40, 40, 40)
                .add(2, 2, 2)
                .add(lblHint, 22, 22, 22)
                .add(14, 14, 14)
                .add(pnlFilter, 62, 62, 62)
                .add(14, 14, 14)
                .add(scrollTable, 240, 380, Short.MAX_VALUE)
                .add(20, 20, 20))
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

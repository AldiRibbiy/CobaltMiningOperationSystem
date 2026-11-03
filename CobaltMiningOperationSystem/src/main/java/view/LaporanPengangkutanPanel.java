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

        lblTitle.setText("Laporan Pengangkutan");
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));
        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N

        lblHint.setText("Periode tanggal selesai pengangkutan (status SELESAI).");
        lblHint.setForeground(new java.awt.Color(103, 121, 143));
        lblHint.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        lblAwal.setText("Tanggal Awal");
        lblAwal.setForeground(new java.awt.Color(26, 43, 66));

        lblAkhir.setText("Tanggal Akhir");
        lblAkhir.setForeground(new java.awt.Color(26, 43, 66));

        btnTampilkan.setText("Tampilkan");
        btnTampilkan.setBackground(new java.awt.Color(43, 106, 230));
        btnTampilkan.setForeground(new java.awt.Color(255, 255, 255));
        btnTampilkan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnTampilkan.setFocusPainted(false);
        btnTampilkan.addActionListener(this::btnTampilkanActionPerformed);

        scrollTable.setBackground(new java.awt.Color(255, 255, 255));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblData.setRowHeight(28);
        scrollTable.setViewportView(tblData);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle, 800, 800, 800))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblHint, 840, 840, 840))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblAwal, 110, 110, 110)
                .addGap(8, 8, 8)
                .addComponent(choAwal, 165, 165, 165)
                .addGap(24, 24, 24)
                .addComponent(lblAkhir, 110, 110, 110)
                .addGap(8, 8, 8)
                .addComponent(choAkhir, 165, 165, 165)
                .addGap(24, 24, 24)
                .addComponent(btnTampilkan, 140, 140, 140))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(scrollTable, 865, 865, 865))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitle, 42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblHint, 25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(lblAwal, 32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(choAwal, 32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(lblAkhir, 32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(choAkhir, 32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(btnTampilkan, 32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(scrollTable, 370, 370, 370))
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
            new String[]{"ID", "Tanggal Selesai", "Material", "Lokasi Tujuan", "Muatan (ton)"}, 0){
            @Override public boolean isCellEditable(int r,int c){return false;}
        };

        for (LaporanService.BarisPengangkutan b : data)model.addRow(new Object[]{b.id, b.tanggalSelesai, b.material, b.tujuan, b.jumlahMuatan});
        tblData.setModel(model);
        tblData.setAutoCreateRowSorter(true);
        tblData.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    }

    private void btnTampilkanActionPerformed(java.awt.event.ActionEvent evt) {
        try{refreshData();}catch(Exception ex){FormUtil.error(this,ex);}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser choAkhir;
    private com.toedter.calendar.JDateChooser choAwal;
    private javax.swing.JButton btnTampilkan;
    private javax.swing.JLabel lblAkhir;
    private javax.swing.JLabel lblAwal;
    private javax.swing.JLabel lblHint;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JTable tblData;
    // End of variables declaration//GEN-END:variables
}

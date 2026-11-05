package view;
import config.AppConfig;
import controller.*;
import model.*;
import enums.*;
import java.time.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MonitoringReadOnlyFrame extends javax.swing.JFrame {
    private int monitoringId;
    private boolean readOnly;
    private MonitoringLingkungan data;

    private void refreshData(){
        data=AppConfig.getMonitoringController().cariMonitoringById(monitoringId);
        lblInfo.setText("Lokasi: "+data.getLokasi().getNamaLokasi()+"  |  Status Monitoring: "+data.getStatusMonitoring()
            +"  |  Status Penanganan: "+data.getStatusPenanganan());
        java.util.List<DetailMonitoring> details=data.getDetailMonitoring();
        DefaultTableModel model=new DefaultTableModel(new String[]{"Parameter","Nilai","Satuan","Hasil"},0){
            @Override public boolean isCellEditable(int r,int c){return false;}
        };
        for(DetailMonitoring d:details)model.addRow(new Object[]{d.getParameter().getNamaParameter(),d.getNilaiPengukuran(),d.getParameter().getSatuan(),d.getStatusDetail()});
        tblDetail.setModel(model);
    }

    private DetailMonitoring detailTerpilih(){
        int row=tblDetail.getSelectedRow();
        if(row<0)throw new IllegalArgumentException("Pilih pengukuran pada tabel terlebih dahulu.");
        int modelRow=tblDetail.convertRowIndexToModel(row);
        return data.getDetailMonitoring().get(modelRow);
    }

    public MonitoringReadOnlyFrame(int id){
        this();monitoringId=id;this.readOnly=true;
        try{refreshData();}catch(Exception ex){FormUtil.error(this,ex);}
    }

    public MonitoringReadOnlyFrame() {
        initComponents();

        JButton[] navButtons = {btnTutup};

        for (JButton btn : navButtons) {
            btn.setOpaque(true);
            btn.setContentAreaFilled(true);
            btn.setBorderPainted(false);
        }

        pack();setResizable(false);setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        scrollDetail = new javax.swing.JScrollPane();
        tblDetail = new javax.swing.JTable();

        btnTutup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblTitle.setText("Detail Hasil Pengukuran");
        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));

        lblInfo.setText("Rincian hasil pengukuran. Mode baca saja.");
        lblInfo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(103, 121, 143));

        scrollDetail.setBackground(new java.awt.Color(255, 255, 255));

        tblDetail.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        tblDetail.setRowHeight(28);
        tblDetail.setGridColor(new java.awt.Color(226, 232, 240));







        btnTutup.setText("Tutup");
        btnTutup.setFocusPainted(false);
        btnTutup.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnTutup.setForeground(new java.awt.Color(255, 255, 255));
        btnTutup.setBackground(new java.awt.Color(103, 121, 143));
        btnTutup.addActionListener(this::btnTutupActionPerformed);

        tblDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parameter", "Nilai", "Satuan", "Hasil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        scrollDetail.setViewportView(tblDetail);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(32,32,32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTitle, 656, 656, 656)
                        .addComponent(lblInfo, 656, 656, 656)
                        .addComponent(scrollDetail, 656, 656, 656))
                    .addGap(32,32,32))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnTutup, 120, 120, 120)
                    .addGap(32,32,32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(24,24,24)
                    .addComponent(lblTitle, 40, 40, 40)
                    .addGap(4,4,4)
                    .addComponent(lblInfo, 22, 22, 22)
                    .addGap(14,14,14)
                    .addComponent(scrollDetail, 320, 320, 320)
                    .addGap(14,14,14)
                    .addComponent(btnTutup, 42, 42, 42)
                    .addGap(24,24,24))
        );
    }// </editor-fold>//GEN-END:initComponents













    private void btnTutupActionPerformed(java.awt.event.ActionEvent evt){dispose();}

    // Variables declaration - do not modify//GEN-BEGIN:variables


    private javax.swing.JButton btnTutup;

    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrollDetail;
    private javax.swing.JTable tblDetail;
    // End of variables declaration//GEN-END:variables
}

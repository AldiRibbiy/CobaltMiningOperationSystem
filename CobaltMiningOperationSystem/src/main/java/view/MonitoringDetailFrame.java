package view;
import config.AppConfig;
import controller.*;
import model.*;
import enums.*;
import java.time.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MonitoringDetailFrame extends javax.swing.JFrame {
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

        btnTambah.setEnabled(!readOnly);
        btnUbah.setEnabled(!readOnly && !details.isEmpty());
        btnHapus.setEnabled(!readOnly && !details.isEmpty());
        btnTindak.setEnabled(!readOnly && data.getStatusMonitoring()==StatusMonitoring.PERINGATAN
            && data.getStatusPenanganan()!=StatusPenanganan.SELESAI);
        btnMulai.setEnabled(!readOnly && data.getStatusMonitoring()==StatusMonitoring.PERINGATAN
            && (data.getStatusPenanganan()==StatusPenanganan.BELUM_DITANGANI));
        btnSelesai.setEnabled(!readOnly && data.getStatusPenanganan()==StatusPenanganan.DALAM_PENANGANAN);

        if(!readOnly && data.getStatusMonitoring()==StatusMonitoring.PERINGATAN
                && (data.getTindakLanjut()==null||data.getTindakLanjut().trim().isEmpty())){
            lblInfo.setText(lblInfo.getText()+"  |  Isi tindak lanjut untuk memulai penanganan.");
        }
    }

    private DetailMonitoring detailTerpilih(){
        int row=tblDetail.getSelectedRow();
        if(row<0)throw new IllegalArgumentException("Pilih pengukuran pada tabel terlebih dahulu.");
        int modelRow=tblDetail.convertRowIndexToModel(row);
        return data.getDetailMonitoring().get(modelRow);
    }

    public MonitoringDetailFrame(int id,boolean readOnly){
        this();monitoringId=id;this.readOnly=readOnly;
        try{refreshData();}catch(Exception ex){FormUtil.error(this,ex);}
    }

    public MonitoringDetailFrame() {
        initComponents();

        JButton[] navButtons = {btnTambah, btnUbah, btnHapus, btnTindak, btnMulai, btnSelesai, btnTutup};

        for (JButton btn : navButtons) {
            btn.setOpaque(true);
            btn.setContentAreaFilled(true);
            btn.setBorderPainted(false);
        }

        setSize(735,600);setResizable(false);setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        scrollDetail = new javax.swing.JScrollPane();
        tblDetail = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnTindak = new javax.swing.JButton();
        btnMulai = new javax.swing.JButton();
        btnSelesai = new javax.swing.JButton();
        btnTutup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblTitle.setText("DETAIL MONITORING");
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));
        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N

        lblInfo.setText("Pilih pengukuran dan tindak lanjut.");
        lblInfo.setForeground(new java.awt.Color(103, 121, 143));
        lblInfo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        scrollDetail.setBackground(new java.awt.Color(255, 255, 255));
        scrollDetail.setViewportView(tblDetail);

        btnTambah.setText("Tambah Pengukuran");
        btnTambah.setBackground(new java.awt.Color(43, 106, 230));
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnTambah.setFocusPainted(false);
        btnTambah.addActionListener(this::btnTambahActionPerformed);

        btnUbah.setText("Ubah Pengukuran");
        btnUbah.setBackground(new java.awt.Color(26, 43, 66));
        btnUbah.setForeground(new java.awt.Color(255, 255, 255));
        btnUbah.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnUbah.setFocusPainted(false);
        btnUbah.addActionListener(this::btnUbahActionPerformed);

        btnHapus.setText("Hapus Pengukuran");
        btnHapus.setBackground(new java.awt.Color(160, 45, 62));
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnHapus.setFocusPainted(false);
        btnHapus.addActionListener(this::btnHapusActionPerformed);

        btnTindak.setText("Tindak Lanjut");
        btnTindak.setBackground(new java.awt.Color(26, 43, 66));
        btnTindak.setForeground(new java.awt.Color(255, 255, 255));
        btnTindak.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnTindak.setFocusPainted(false);
        btnTindak.addActionListener(this::btnTindakActionPerformed);

        btnMulai.setText("Mulai Penanganan");
        btnMulai.setBackground(new java.awt.Color(26, 43, 66));
        btnMulai.setForeground(new java.awt.Color(255, 255, 255));
        btnMulai.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnMulai.setFocusPainted(false);
        btnMulai.addActionListener(this::btnMulaiActionPerformed);

        btnSelesai.setText("Selesai Penanganan");
        btnSelesai.setBackground(new java.awt.Color(26, 43, 66));
        btnSelesai.setForeground(new java.awt.Color(255, 255, 255));
        btnSelesai.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnSelesai.setFocusPainted(false);
        btnSelesai.addActionListener(this::btnSelesaiActionPerformed);

        btnTutup.setText("Tutup");
        btnTutup.setBackground(new java.awt.Color(103, 121, 143));
        btnTutup.setForeground(new java.awt.Color(255, 255, 255));
        btnTutup.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnTutup.setFocusPainted(false);
        btnTutup.addActionListener(this::btnTutupActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitle, 650, 650, 650))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblInfo, 650, 650, 650))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(scrollDetail, 650, 650, 650))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnTambah, 190, 190, 190)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUbah, 190, 190, 190)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHapus, 190, 190, 190))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnTindak, 190, 190, 190)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMulai, 190, 190, 190)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSelesai, 190, 190, 190))
            .addGroup(layout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(btnTutup, 190, 190, 190))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle, 40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(lblInfo, 28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(scrollDetail, 290, 290, 290))
            .addGroup(layout.createSequentialGroup()
                .addGap(432, 432, 432)
                .addComponent(btnTambah, 42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(432, 432, 432)
                .addComponent(btnUbah, 42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(432, 432, 432)
                .addComponent(btnHapus, 42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(492, 492, 492)
                .addComponent(btnTindak, 42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(492, 492, 492)
                .addComponent(btnMulai, 42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(492, 492, 492)
                .addComponent(btnSelesai, 42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(552, 552, 552)
                .addComponent(btnTutup, 42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt){
        DetailMonitoringFormFrame f=new DetailMonitoringFormFrame(monitoringId);f.setVisible(true);
        f.addWindowListener(new java.awt.event.WindowAdapter(){@Override public void windowClosed(java.awt.event.WindowEvent e){refreshData();}});
    }

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt){
        try{
            DetailMonitoringFormFrame f=new DetailMonitoringFormFrame(detailTerpilih());f.setVisible(true);
            f.addWindowListener(new java.awt.event.WindowAdapter(){@Override public void windowClosed(java.awt.event.WindowEvent e){refreshData();}});
        }catch(Exception ex){FormUtil.error(this,ex);}
    }

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt){
        try{
            DetailMonitoring d=detailTerpilih();
            if(JOptionPane.showConfirmDialog(this,"Hapus pengukuran "+d.getParameter().getNamaParameter()+"?","Konfirmasi",JOptionPane.YES_NO_OPTION)!=JOptionPane.YES_OPTION)return;
            AppConfig.getMonitoringController().hapusDetail(d.getIdDetail());
            refreshData();
        }catch(Exception ex){FormUtil.error(this,ex);}
    }

    private void btnTindakActionPerformed(java.awt.event.ActionEvent evt){
        String s=JOptionPane.showInputDialog(this,"Tindak lanjut:",data.getTindakLanjut()==null?"":data.getTindakLanjut());
        if(s!=null)try{AppConfig.getMonitoringController().aturTindakLanjut(monitoringId,s);refreshData();}catch(Exception ex){FormUtil.error(this,ex);}
    }

    private void btnMulaiActionPerformed(java.awt.event.ActionEvent evt){
        try{
            AppConfig.getMonitoringController().mulaiPenanganan(monitoringId);
            JOptionPane.showMessageDialog(this,"Penanganan dimulai. Status penanganan: DALAM PENANGANAN.");
            refreshData();
        }catch(Exception ex){FormUtil.error(this,ex);}
    }

    private void btnSelesaiActionPerformed(java.awt.event.ActionEvent evt){
        try{
            AppConfig.getMonitoringController().selesaikanPenanganan(monitoringId);
            JOptionPane.showMessageDialog(this,"Penanganan diselesaikan. Status penanganan: SELESAI.");
            refreshData();
        }catch(Exception ex){FormUtil.error(this,ex);}
    }

    private void btnTutupActionPerformed(java.awt.event.ActionEvent evt){dispose();}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnMulai;
    private javax.swing.JButton btnSelesai;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTindak;
    private javax.swing.JButton btnTutup;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrollDetail;
    private javax.swing.JTable tblDetail;
    // End of variables declaration//GEN-END:variables
}

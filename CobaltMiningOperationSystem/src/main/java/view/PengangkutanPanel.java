package view;
import config.AppConfig;
import controller.*;
import model.*;
import enums.*;
import java.time.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class PengangkutanPanel extends javax.swing.JPanel {
    private final DataScreen screen=new DataScreen("Pengangkutan");
    private final java.util.List<Pengangkutan> records=new java.util.ArrayList<>();

    public PengangkutanPanel() {
        initComponents();

        JButton[] navButtons = {btnAdd, btnMulai, btnSelesai, btnBatalkan, btnRefresh};

        for (JButton btn : navButtons) {
            btn.setOpaque(true);
            btn.setContentAreaFilled(true);
            btn.setBorderPainted(false);
        }

        try { refreshData(); } catch(Exception ex) { FormUtil.error(this,ex); }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblSubtitle = new javax.swing.JLabel();
        scrollTable = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnMulai = new javax.swing.JButton();
        btnSelesai = new javax.swing.JButton();
        btnBatalkan = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        lblTitle.setText("Pengangkutan");
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));
        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N

        lblSubtitle.setText("C-MOS / Pengangkutan");
        lblSubtitle.setForeground(new java.awt.Color(103, 121, 143));
        lblSubtitle.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

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

        btnAdd.setText("Tambah Data");
        btnAdd.setBackground(new java.awt.Color(43, 106, 230));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAdd.setFocusPainted(false);
        btnAdd.addActionListener(this::btnAddActionPerformed);

        btnMulai.setText("Mulai Perjalanan");
        btnMulai.setBackground(new java.awt.Color(26, 43, 66));
        btnMulai.setForeground(new java.awt.Color(255, 255, 255));
        btnMulai.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnMulai.setFocusPainted(false);
        btnMulai.addActionListener(this::btnMulaiActionPerformed);

        btnSelesai.setText("Selesaikan");
        btnSelesai.setBackground(new java.awt.Color(26, 43, 66));
        btnSelesai.setForeground(new java.awt.Color(255, 255, 255));
        btnSelesai.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnSelesai.setFocusPainted(false);
        btnSelesai.addActionListener(this::btnSelesaiActionPerformed);

        btnBatalkan.setText("Batalkan");
        btnBatalkan.setBackground(new java.awt.Color(160, 45, 62));
        btnBatalkan.setForeground(new java.awt.Color(255, 255, 255));
        btnBatalkan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnBatalkan.setFocusPainted(false);
        btnBatalkan.addActionListener(this::btnBatalkanActionPerformed);

        btnRefresh.setText("Refresh");
        btnRefresh.setBackground(new java.awt.Color(103, 121, 143));
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnRefresh.setFocusPainted(false);
        btnRefresh.addActionListener(this::btnRefreshActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle, 800, 800, 800))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblSubtitle, 840, 840, 840))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(scrollTable, 865, 865, 865))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnAdd, 150, 150, 150)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMulai, 160, 160, 160)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSelesai, 150, 150, 150)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBatalkan, 150, 150, 150)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRefresh, 125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitle, 42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblSubtitle, 25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(scrollTable, 370, 370, 370))
            .addGroup(layout.createSequentialGroup()
                .addGap(534, 534, 534)
                .addComponent(btnAdd, 40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(534, 534, 534)
                .addComponent(btnMulai, 40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(534, 534, 534)
                .addComponent(btnSelesai, 40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(534, 534, 534)
                .addComponent(btnBatalkan, 40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(534, 534, 534)
                .addComponent(btnRefresh, 40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshData() {
        records.clear();records.addAll(AppConfig.getPengangkutanController().tampilkanSemuaPengangkutan());
        screen.handle("Refresh",tblData,this);
    }

    private Pengangkutan selected() {
        int row=tblData.getSelectedRow();
        if(row<0)throw new IllegalArgumentException("Pilih satu baris data terlebih dahulu.");
        return records.get(tblData.convertRowIndexToModel(row));
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            PengangkutanFormFrame f=new PengangkutanFormFrame();
            f.setVisible(true);
            f.addWindowListener(new java.awt.event.WindowAdapter(){
                @Override public void windowClosed(java.awt.event.WindowEvent e){if(f.isSaved())refreshData();}
            });
        }catch(Exception ex){FormUtil.error(this,ex);}
    }

    private void btnMulaiActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            AppConfig.getPengangkutanController().mulaiPengangkutan(selected().getIdPengangkutan());
            JOptionPane.showMessageDialog(this,"Pengangkutan dimulai. Kendaraan dan driver kini bertugas.");
            refreshData();
        }catch(Exception ex){FormUtil.error(this,ex);}
    }

    private void btnSelesaiActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            AppConfig.getPengangkutanController().selesaikanPengangkutan(selected().getIdPengangkutan());
            JOptionPane.showMessageDialog(this,"Pengangkutan selesai. Stok produksi diperbarui.");
            refreshData();
        }catch(Exception ex){FormUtil.error(this,ex);}
    }

    private void btnBatalkanActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if(JOptionPane.showConfirmDialog(this,"Batalkan pengangkutan terpilih?","Konfirmasi",JOptionPane.YES_NO_OPTION)!=JOptionPane.YES_OPTION)return;
            AppConfig.getPengangkutanController().batalkanPengangkutan(selected().getIdPengangkutan());
            JOptionPane.showMessageDialog(this,"Pengangkutan dibatalkan. Stok produksi tidak berkurang.");
            refreshData();
        }catch(Exception ex){FormUtil.error(this,ex);}
    }

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {
        try{refreshData();}catch(Exception ex){FormUtil.error(this,ex);}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBatalkan;
    private javax.swing.JButton btnMulai;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSelesai;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JTable tblData;
    // End of variables declaration//GEN-END:variables
}

package view;
import config.AppConfig;
import controller.*;
import model.*;
import enums.*;
import java.awt.Color;
import java.time.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class PegawaiPanel extends javax.swing.JPanel {
    private final DataScreen screen=new DataScreen("Pegawai");
    private final java.util.List<Pegawai> records=new java.util.ArrayList<>();

    public PegawaiPanel() {
        initComponents();
        
        JButton[] navButtons = {btnAdd, btnEdit, btnDelete, btnRefresh};

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
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));
        lblTitle.setText("Pegawai");

        lblSubtitle.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblSubtitle.setForeground(new java.awt.Color(103, 121, 143));
        lblSubtitle.setText("C-MOS / Pegawai");

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

        btnAdd.setBackground(new java.awt.Color(43, 106, 230));
        btnAdd.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Tambah Data");
        btnAdd.setFocusPainted(false);
        btnAdd.addActionListener(this::btnAddActionPerformed);

        btnEdit.setBackground(new java.awt.Color(26, 43, 66));
        btnEdit.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Ubah Data");
        btnEdit.setFocusPainted(false);
        btnEdit.addActionListener(this::btnEditActionPerformed);

        btnDelete.setBackground(new java.awt.Color(160, 45, 62));
        btnDelete.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Hapus Data");
        btnDelete.setFocusPainted(false);
        btnDelete.addActionListener(this::btnDeleteActionPerformed);

        btnRefresh.setBackground(new java.awt.Color(26, 43, 66));
        btnRefresh.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Muat Ulang");
        btnRefresh.setFocusPainted(false);
        btnRefresh.addActionListener(this::btnRefreshActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblTitle, 800, 800, 800))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(btnAdd, 155, 155, 155))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(185, 185, 185)
                                    .addComponent(btnEdit, 155, 155, 155))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(350, 350, 350)
                                    .addComponent(btnDelete, 155, 155, 155)))
                            .addGap(200, 200, 200)
                            .addComponent(btnRefresh, 155, 155, 155))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(lblSubtitle, 840, 840, 840))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTable, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblTitle, 42, 42, 42))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(lblSubtitle, 25, 25, 25)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh, 40, 40, 40)
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd, 40, 40, 40)
                            .addComponent(btnEdit, 40, 40, 40)
                            .addComponent(btnDelete, 40, 40, 40))))
                .addGap(18, 18, 18)
                .addComponent(scrollTable, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshData() {
        records.clear();records.addAll(AppConfig.getMasterDataController().tampilkanSemuaPegawai());
        screen.handle("Refresh",tblData,this);
    }
    private Pegawai selected() {
        int row=tblData.getSelectedRow();
        if(row<0)throw new IllegalArgumentException("Pilih satu baris data terlebih dahulu.");
        return records.get(tblData.convertRowIndexToModel(row));
    }
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {
        try{refreshData();}catch(Exception ex){FormUtil.error(this,ex);}
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            PegawaiFormFrame f=new PegawaiFormFrame();
            f.setVisible(true);
            f.addWindowListener(new java.awt.event.WindowAdapter(){
                @Override public void windowClosed(java.awt.event.WindowEvent e){if(f.isSaved())refreshData();}
            });
        }catch(Exception ex){FormUtil.error(this,ex);}
    }
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            PegawaiFormFrame f=new PegawaiFormFrame(selected());
            f.setVisible(true);
            f.addWindowListener(new java.awt.event.WindowAdapter(){
                @Override public void windowClosed(java.awt.event.WindowEvent e){if(f.isSaved())refreshData();}
            });
        }catch(Exception ex){FormUtil.error(this,ex);}
    }
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            Pegawai item=selected();
            if(JOptionPane.showConfirmDialog(this,"Hapus data terpilih?","Konfirmasi",JOptionPane.YES_NO_OPTION)!=JOptionPane.YES_OPTION)return;
            AppConfig.getMasterDataController().hapusPegawai(item.getIdPegawai());
            refreshData();
        }catch(Exception ex){FormUtil.error(this,ex);}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JTable tblData;
    // End of variables declaration//GEN-END:variables
}

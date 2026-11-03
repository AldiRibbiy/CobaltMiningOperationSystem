package view;
import config.AppConfig;
import controller.*;
import model.*;
import enums.*;
import java.time.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class LokasiPanel extends javax.swing.JPanel {
    private final DataScreen screen=new DataScreen("Lokasi");
    private final java.util.List<Lokasi> records=new java.util.ArrayList<>();

    public LokasiPanel() {
        initComponents();
        
        JButton[] navButtons = {btnAdd, btnEdit, btnDelete};

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

        lblTitle.setText("Lokasi");
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));
        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N

        lblSubtitle.setText("C-MOS / Lokasi");
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

        btnEdit.setText("Ubah Data");
        btnEdit.setBackground(new java.awt.Color(26, 43, 66));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnEdit.setFocusPainted(false);
        btnEdit.addActionListener(this::btnEditActionPerformed);

        btnDelete.setText("Hapus Data");
        btnDelete.setBackground(new java.awt.Color(160, 45, 62));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnDelete.setFocusPainted(false);
        btnDelete.addActionListener(this::btnDeleteActionPerformed);

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
                .addComponent(btnAdd, 155, 155, 155))
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(btnEdit, 155, 155, 155))
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(btnDelete, 155, 155, 155))
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
                .addGap(94, 94, 94)
                .addComponent(btnAdd, 40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(btnEdit, 40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(btnDelete, 40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshData() {
        records.clear();records.addAll(AppConfig.getMasterDataController().tampilkanSemuaLokasi());
        screen.handle("Refresh",tblData,this);
    }
    
    private Lokasi selected() {
        int row=tblData.getSelectedRow();
        if(row<0)throw new IllegalArgumentException("Pilih satu baris data terlebih dahulu.");
        return records.get(tblData.convertRowIndexToModel(row));
    }
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            LokasiFormFrame f=new LokasiFormFrame();
            f.setVisible(true);
            f.addWindowListener(new java.awt.event.WindowAdapter(){
                @Override public void windowClosed(java.awt.event.WindowEvent e){if(f.isSaved())refreshData();}
            });
        }catch(Exception ex){FormUtil.error(this,ex);}
    }
    
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            LokasiFormFrame f=new LokasiFormFrame(selected());
            f.setVisible(true);
            f.addWindowListener(new java.awt.event.WindowAdapter(){
                @Override public void windowClosed(java.awt.event.WindowEvent e){if(f.isSaved())refreshData();}
            });
        }catch(Exception ex){FormUtil.error(this,ex);}
    }
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            Lokasi item=selected();
            if(JOptionPane.showConfirmDialog(this,"Hapus data terpilih?","Konfirmasi",JOptionPane.YES_NO_OPTION)!=JOptionPane.YES_OPTION)return;
            AppConfig.getMasterDataController().hapusLokasi(item.getIdLokasi());
            refreshData();
        }catch(Exception ex){FormUtil.error(this,ex);}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JTable tblData;
    // End of variables declaration//GEN-END:variables
}

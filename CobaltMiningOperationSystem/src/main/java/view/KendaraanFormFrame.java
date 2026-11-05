package view;
import config.AppConfig;
import controller.*;
import model.*;
import enums.*;
import java.time.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class KendaraanFormFrame extends javax.swing.JFrame {
    private Kendaraan original;
    private boolean saved;
    public boolean isSaved(){return saved;}

    public KendaraanFormFrame() {
        initComponents();
        btnSimpan.addActionListener(this::btnSimpanActionPerformed);
        btnBatal.addActionListener(this::btnBatalActionPerformed);
        
        JButton[] navButtons = {btnSimpan, btnBatal};

        for (JButton btn : navButtons) {
            btn.setOpaque(true);
            btn.setContentAreaFilled(true);
            btn.setBorderPainted(false);
        }
        
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        try { loadOptions(); } catch(Exception ex) { FormUtil.error(this,ex); }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblHint = new javax.swing.JLabel();
        lblJenis = new javax.swing.JLabel();
        txtJenis = new javax.swing.JTextField();
        lblPolisi = new javax.swing.JLabel();
        txtPolisi = new javax.swing.JTextField();
        lblKapasitas = new javax.swing.JLabel();
        txtKapasitas = new javax.swing.JTextField();
        lblTahun = new javax.swing.JLabel();
        txtTahun = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox();
        pnlCard = new javax.swing.JPanel();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblTitle.setText("Form Kendaraan");
        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));

        lblHint.setText("Isi data sesuai ketentuan C-MOS.");
        lblHint.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblHint.setForeground(new java.awt.Color(103, 121, 143));

        lblJenis.setText("Jenis Kendaraan");
        lblJenis.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblJenis.setForeground(new java.awt.Color(26, 43, 66));

        txtJenis.setBackground(new java.awt.Color(255, 255, 255));

        lblPolisi.setText("Nomor Polisi");
        lblPolisi.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblPolisi.setForeground(new java.awt.Color(26, 43, 66));

        txtPolisi.setBackground(new java.awt.Color(255, 255, 255));

        lblKapasitas.setText("Kapasitas (ton)");
        lblKapasitas.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblKapasitas.setForeground(new java.awt.Color(26, 43, 66));

        txtKapasitas.setBackground(new java.awt.Color(255, 255, 255));

        lblTahun.setText("Tahun");
        lblTahun.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblTahun.setForeground(new java.awt.Color(26, 43, 66));

        txtTahun.setBackground(new java.awt.Color(255, 255, 255));

        lblStatus.setText("Status Kendaraan");
        lblStatus.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(26, 43, 66));

        cmbStatus.setEnabled(false);
        cmbStatus.setBackground(new java.awt.Color(255, 255, 255));

        pnlCard.setBackground(new java.awt.Color(255, 255, 255));

        btnSimpan.setText("Simpan");
        btnSimpan.setFocusPainted(false);
        btnSimpan.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setBackground(new java.awt.Color(43, 106, 230));

        btnBatal.setText("Batal");
        btnBatal.setFocusPainted(false);
        btnBatal.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal.setBackground(new java.awt.Color(26, 43, 66));

        javax.swing.GroupLayout pnlCardLayout = new javax.swing.GroupLayout(pnlCard);
        pnlCard.setLayout(pnlCardLayout);
        pnlCardLayout.setHorizontalGroup(
            pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCardLayout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addComponent(lblJenis, 230, 230, 230)
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtJenis, 352, 352, 352)
             )
            )
                .addGroup(pnlCardLayout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addComponent(lblPolisi, 230, 230, 230)
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtPolisi, 352, 352, 352)
             )
            )
                .addGroup(pnlCardLayout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addComponent(lblKapasitas, 230, 230, 230)
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtKapasitas, 352, 352, 352)
             )
            )
                .addGroup(pnlCardLayout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addComponent(lblTahun, 230, 230, 230)
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtTahun, 352, 352, 352)
             )
            )
                .addGroup(pnlCardLayout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addComponent(lblStatus, 230, 230, 230)
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(cmbStatus, 352, 352, 352)
             )
            )
        );
        pnlCardLayout.setVerticalGroup(
            pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCardLayout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(lblJenis, 20, 20, 20)
                  .addComponent(txtJenis, 32, 32, 32)
             )
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(lblPolisi, 20, 20, 20)
                  .addComponent(txtPolisi, 32, 32, 32)
             )
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(lblKapasitas, 20, 20, 20)
                  .addComponent(txtKapasitas, 32, 32, 32)
             )
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(lblTahun, 20, 20, 20)
                  .addComponent(txtTahun, 32, 32, 32)
             )
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(lblStatus, 20, 20, 20)
                  .addComponent(cmbStatus, 32, 32, 32)
             )
                 .addGap(14, 14, 14)
            )
        );


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                 .addGap(38, 38, 38)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(lblTitle, 644, 644, 644)
              )
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(lblHint, 644, 644, 644)
              )
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(pnlCard, 644, 644, 644)
              )
             )
                 .addGap(38, 38, 38)
            )
                .addGroup(layout.createSequentialGroup()
                 .addGap(0, 0, Short.MAX_VALUE)
                 .addComponent(btnBatal, 120, 120, 120)
                 .addGap(10, 10, 10)
                 .addComponent(btnSimpan, 150, 150, 150)
                 .addGap(38, 38, 38)
            )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                 .addGap(26, 26, 26)
                 .addComponent(lblTitle, 40, 40, 40)
                 .addGap(6, 6, 6)
                 .addComponent(lblHint, 22, 22, 22)
                 .addGap(18, 18, 18)
                 .addComponent(pnlCard, 264, 264, 264)
                 .addGap(22, 22, 22)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(btnSimpan, 42, 42, 42)
                  .addComponent(btnBatal, 42, 42, 42)
             )
                 .addGap(26, 26, 26)
            )
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loadOptions() {
        cmbStatus.setEnabled(false);
        cmbStatus.setToolTipText("Status otomatis dari sistem");
        cmbStatus.setModel(new DefaultComboBoxModel<>(new String[]{"TERSEDIA","DIGUNAKAN","NONAKTIF"}));
    }
    public KendaraanFormFrame(Kendaraan original) {
        this();
        this.original=original;
        if(original!=null) {
        txtJenis.setText(original.getJenisKendaraan());
        txtPolisi.setText(original.getNomorPolisi());
        txtKapasitas.setText(String.valueOf(original.getKapasitas()));
        txtTahun.setText(String.valueOf(original.getTahunKendaraan()));
        cmbStatus.setSelectedItem(String.valueOf(original.getStatusKendaraan()));
        }
    }

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {
        try {

        FormUtil.require(FormUtil.text(txtJenis),"Jenis kendaraan");FormUtil.require(FormUtil.text(txtPolisi),"Nomor polisi");
        Kendaraan k=new Kendaraan(original==null?0:original.getIdKendaraan(),FormUtil.text(txtJenis),FormUtil.text(txtPolisi),Double.parseDouble(FormUtil.text(txtKapasitas)),Integer.parseInt(FormUtil.text(txtTahun)),(original == null ? StatusKendaraan.TERSEDIA : original.getStatusKendaraan()));
        if(original==null)AppConfig.getMasterDataController().tambahKendaraan(k);
        else AppConfig.getMasterDataController().ubahKendaraan(k);

            saved=true;
            JOptionPane.showMessageDialog(this,"Data berhasil disimpan.");
            dispose();
        } catch(Exception ex) { FormUtil.error(this,ex); }
    }
    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) { dispose(); }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox cmbStatus;
    private javax.swing.JLabel lblHint;
    private javax.swing.JLabel lblJenis;
    private javax.swing.JLabel lblKapasitas;
    private javax.swing.JLabel lblPolisi;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTahun;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlCard;
    private javax.swing.JTextField txtJenis;
    private javax.swing.JTextField txtKapasitas;
    private javax.swing.JTextField txtPolisi;
    private javax.swing.JTextField txtTahun;
    // End of variables declaration//GEN-END:variables
}

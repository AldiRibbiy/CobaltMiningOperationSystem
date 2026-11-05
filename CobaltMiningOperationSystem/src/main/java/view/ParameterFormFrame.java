package view;
import config.AppConfig;
import controller.*;
import model.*;
import enums.*;
import java.time.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ParameterFormFrame extends javax.swing.JFrame {
    private ParameterLingkungan original;
    private boolean saved;
    public boolean isSaved(){return saved;}

    public ParameterFormFrame() {
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
        lblNama = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        lblSatuan = new javax.swing.JLabel();
        txtSatuan = new javax.swing.JTextField();
        lblMin = new javax.swing.JLabel();
        txtMin = new javax.swing.JTextField();
        lblMax = new javax.swing.JLabel();
        txtMax = new javax.swing.JTextField();
        lblKet = new javax.swing.JLabel();
        txtKet = new javax.swing.JTextField();
        pnlCard = new javax.swing.JPanel();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblTitle.setText("Form Parameter Lingkungan");
        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));

        lblHint.setText("Isi data sesuai ketentuan C-MOS.");
        lblHint.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblHint.setForeground(new java.awt.Color(103, 121, 143));

        lblNama.setText("Nama Parameter");
        lblNama.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblNama.setForeground(new java.awt.Color(26, 43, 66));

        txtNama.setBackground(new java.awt.Color(255, 255, 255));

        lblSatuan.setText("Satuan");
        lblSatuan.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblSatuan.setForeground(new java.awt.Color(26, 43, 66));

        txtSatuan.setBackground(new java.awt.Color(255, 255, 255));

        lblMin.setText("Batas Minimum (opsional)");
        lblMin.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblMin.setForeground(new java.awt.Color(26, 43, 66));

        txtMin.setBackground(new java.awt.Color(255, 255, 255));

        lblMax.setText("Batas Maksimum (opsional)");
        lblMax.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblMax.setForeground(new java.awt.Color(26, 43, 66));

        txtMax.setBackground(new java.awt.Color(255, 255, 255));

        lblKet.setText("Keterangan");
        lblKet.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblKet.setForeground(new java.awt.Color(26, 43, 66));

        txtKet.setBackground(new java.awt.Color(255, 255, 255));

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
                 .addComponent(lblNama, 230, 230, 230)
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtNama, 352, 352, 352)
             )
            )
                .addGroup(pnlCardLayout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addComponent(lblSatuan, 230, 230, 230)
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtSatuan, 352, 352, 352)
             )
            )
                .addGroup(pnlCardLayout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addComponent(lblMin, 230, 230, 230)
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtMin, 352, 352, 352)
             )
            )
                .addGroup(pnlCardLayout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addComponent(lblMax, 230, 230, 230)
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtMax, 352, 352, 352)
             )
            )
                .addGroup(pnlCardLayout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addComponent(lblKet, 230, 230, 230)
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtKet, 352, 352, 352)
             )
            )
        );
        pnlCardLayout.setVerticalGroup(
            pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCardLayout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(lblNama, 20, 20, 20)
                  .addComponent(txtNama, 32, 32, 32)
             )
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(lblSatuan, 20, 20, 20)
                  .addComponent(txtSatuan, 32, 32, 32)
             )
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(lblMin, 20, 20, 20)
                  .addComponent(txtMin, 32, 32, 32)
             )
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(lblMax, 20, 20, 20)
                  .addComponent(txtMax, 32, 32, 32)
             )
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(lblKet, 20, 20, 20)
                  .addComponent(txtKet, 32, 32, 32)
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

    }
    public ParameterFormFrame(ParameterLingkungan original) {
        this();
        this.original=original;
        if(original!=null) {
        txtNama.setText(original.getNamaParameter());
        txtSatuan.setText(original.getSatuan());
        txtMin.setText(original.getBatasMinimum()==null?"":String.valueOf(original.getBatasMinimum()));
        txtMax.setText(original.getBatasMaksimum()==null?"":String.valueOf(original.getBatasMaksimum()));
        txtKet.setText(original.getKeterangan());
        }
    }

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {
        try {

        FormUtil.require(FormUtil.text(txtNama),"Nama parameter");
        String min=FormUtil.text(txtMin),max=FormUtil.text(txtMax);
        Double a=min.isEmpty()?null:Double.valueOf(min),b=max.isEmpty()?null:Double.valueOf(max);
        if(a!=null&&b!=null&&a>b)throw new IllegalArgumentException("Batas minimum melebihi maksimum.");
        ParameterLingkungan p=new ParameterLingkungan(original==null?0:original.getIdParameter(),FormUtil.text(txtNama),FormUtil.text(txtSatuan),a,b,FormUtil.text(txtKet));
        if(original==null)AppConfig.getMasterDataController().tambahParameter(p);
        else AppConfig.getMasterDataController().ubahParameter(p);

            saved=true;
            JOptionPane.showMessageDialog(this,"Data berhasil disimpan.");
            dispose();
        } catch(Exception ex) { FormUtil.error(this,ex); }
    }
    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) { dispose(); }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel lblHint;
    private javax.swing.JLabel lblKet;
    private javax.swing.JLabel lblMax;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblSatuan;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlCard;
    private javax.swing.JTextField txtKet;
    private javax.swing.JTextField txtMax;
    private javax.swing.JTextField txtMin;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtSatuan;
    // End of variables declaration//GEN-END:variables
}

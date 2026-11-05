package view;
import config.AppConfig;
import controller.*;
import model.*;
import enums.*;
import java.time.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DetailMonitoringFormFrame extends javax.swing.JFrame {
    private DetailMonitoring original;
    private boolean saved;
    public boolean isSaved(){return saved;}
    private int monitoringId;

    public DetailMonitoringFormFrame() {
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
        lblParameter = new javax.swing.JLabel();
        cmbParameter = new javax.swing.JComboBox();
        lblNilai = new javax.swing.JLabel();
        txtNilai = new javax.swing.JTextField();
        lblCatatan = new javax.swing.JLabel();
        txtCatatan = new javax.swing.JTextField();
        pnlCard = new javax.swing.JPanel();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblTitle.setText("Form Pengukuran Monitoring");
        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));

        lblHint.setText("Isi data sesuai ketentuan C-MOS.");
        lblHint.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblHint.setForeground(new java.awt.Color(103, 121, 143));

        lblParameter.setText("Parameter Lingkungan");
        lblParameter.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblParameter.setForeground(new java.awt.Color(26, 43, 66));

        cmbParameter.setBackground(new java.awt.Color(255, 255, 255));

        lblNilai.setText("Nilai Pengukuran");
        lblNilai.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblNilai.setForeground(new java.awt.Color(26, 43, 66));

        txtNilai.setBackground(new java.awt.Color(255, 255, 255));

        lblCatatan.setText("Catatan");
        lblCatatan.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblCatatan.setForeground(new java.awt.Color(26, 43, 66));

        txtCatatan.setBackground(new java.awt.Color(255, 255, 255));

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
                 .addComponent(lblParameter, 230, 230, 230)
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(cmbParameter, 352, 352, 352)
             )
            )
                .addGroup(pnlCardLayout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addComponent(lblNilai, 230, 230, 230)
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtNilai, 352, 352, 352)
             )
            )
                .addGroup(pnlCardLayout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addComponent(lblCatatan, 230, 230, 230)
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtCatatan, 352, 352, 352)
             )
            )
        );
        pnlCardLayout.setVerticalGroup(
            pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCardLayout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(lblParameter, 20, 20, 20)
                  .addComponent(cmbParameter, 32, 32, 32)
             )
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(lblNilai, 20, 20, 20)
                  .addComponent(txtNilai, 32, 32, 32)
             )
                 .addGap(14, 14, 14)
                 .addGroup(pnlCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(lblCatatan, 20, 20, 20)
                  .addComponent(txtCatatan, 32, 32, 32)
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
                 .addComponent(pnlCard, 172, 172, 172)
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
        for (ParameterLingkungan v : AppConfig.getMasterDataController().tampilkanSemuaParameter()) { cmbParameter.addItem(new PilihanData(v.getIdParameter(), v.getNamaParameter() + " (" + v.getSatuan() + ")")); }
    }
    public DetailMonitoringFormFrame(int monitoringId) {
        this();this.monitoringId=monitoringId;
    }

    /** Mode ubah: parameter, nilai, dan catatan dipra-isi dari detail terpilih. */
    public DetailMonitoringFormFrame(DetailMonitoring original) {
        this(original.getMonitoring().getIdMonitoring());
        this.original = original;

        if (original != null) {
            setTitle("Ubah Pengukuran #" + original.getIdDetail());
            lblTitle.setText("Form Pengukuran Monitoring (Ubah)");
            FormUtil.select(cmbParameter, original.getParameter().getIdParameter());
            txtNilai.setText(String.valueOf(original.getNilaiPengukuran()));
            txtCatatan.setText(original.getCatatan() == null ? "" : original.getCatatan());
        }
    }

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {
        try {

        double nilai;
        try { nilai=Double.parseDouble(FormUtil.text(txtNilai).replace(',', '.')); }
        catch(NumberFormatException e){throw new IllegalArgumentException("Nilai pengukuran harus berupa angka, contoh: 7.5");}
        if(original==null)AppConfig.getMonitoringController().tambahDetail(monitoringId,FormUtil.id(cmbParameter),nilai,FormUtil.text(txtCatatan));
        else AppConfig.getMonitoringController().ubahDetail(original.getIdDetail(),FormUtil.id(cmbParameter),nilai,FormUtil.text(txtCatatan));

            saved=true;
            JOptionPane.showMessageDialog(this,original==null?"Data berhasil disimpan.":"Data berhasil diperbarui.");
            dispose();
        } catch(Exception ex) { FormUtil.error(this,ex); }
    }
    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) { dispose(); }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox cmbParameter;
    private javax.swing.JLabel lblCatatan;
    private javax.swing.JLabel lblHint;
    private javax.swing.JLabel lblNilai;
    private javax.swing.JLabel lblParameter;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlCard;
    private javax.swing.JTextField txtCatatan;
    private javax.swing.JTextField txtNilai;
    // End of variables declaration//GEN-END:variables
}

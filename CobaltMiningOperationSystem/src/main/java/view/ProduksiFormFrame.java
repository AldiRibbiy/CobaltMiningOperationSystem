package view;
import config.AppConfig;
import controller.*;
import model.*;
import enums.*;
import java.time.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ProduksiFormFrame extends javax.swing.JFrame {
    private ProduksiTambang original;
    private boolean saved;
    public boolean isSaved(){return saved;}

    public ProduksiFormFrame() {
        initComponents();
        
        JButton[] navButtons = {btnSimpan, btnBatal};

        for (JButton btn : navButtons) {
            btn.setOpaque(true);
            btn.setContentAreaFilled(true);
            btn.setBorderPainted(false);
        }
        
        txtTanggal.setDateFormatString("dd/MM/yyyy");
        txtTanggal.setMaxSelectableDate(new Date());
        setSize(720, 525);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        try { loadOptions(); } catch(Exception ex) { FormUtil.error(this,ex); }

    }

    private LocalDate getTanggalProduksi() {
        Date tanggal = txtTanggal.getDate();

        if (tanggal == null)throw new IllegalArgumentException("Silakan pilih tanggal produksi.");
        return tanggal.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    private void setTanggalProduksi(LocalDate tanggal) {
        txtTanggal.setDate(tanggal == null ? null : Date.from(tanggal.atStartOfDay(ZoneId.systemDefault()).toInstant()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblHint = new javax.swing.JLabel();
        lblMaterial = new javax.swing.JLabel();
        cmbMaterial = new javax.swing.JComboBox();
        lblLokasi = new javax.swing.JLabel();
        cmbLokasi = new javax.swing.JComboBox();
        lblTanggal = new javax.swing.JLabel();
        txtTanggal = new com.toedter.calendar.JDateChooser();
        lblJumlah = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblTitle.setText("FORM PRODUKSI");
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));
        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N

        lblHint.setText("Isi data sesuai ketentuan C-MOS.");
        lblHint.setForeground(new java.awt.Color(103, 121, 143));
        lblHint.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        lblMaterial.setText("Material");
        lblMaterial.setForeground(new java.awt.Color(26, 43, 66));

        lblLokasi.setText("Lokasi PIT Aktif");
        lblLokasi.setForeground(new java.awt.Color(26, 43, 66));

        lblTanggal.setText("Tanggal Produksi");
        lblTanggal.setForeground(new java.awt.Color(26, 43, 66));

        lblJumlah.setText("Jumlah Produksi (ton)");
        lblJumlah.setForeground(new java.awt.Color(26, 43, 66));

        btnSimpan.setText("Simpan");
        btnSimpan.setBackground(new java.awt.Color(43, 106, 230));
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnSimpan.setFocusPainted(false);
        btnSimpan.addActionListener(this::btnSimpanActionPerformed);

        btnBatal.setText("Batal");
        btnBatal.setBackground(new java.awt.Color(26, 43, 66));
        btnBatal.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnBatal.setFocusPainted(false);
        btnBatal.addActionListener(this::btnBatalActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblTitle, 650, 650, 650))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblHint, 650, 650, 650))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblMaterial, 260, 260, 260))
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(cmbMaterial, 365, 365, 365))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblLokasi, 260, 260, 260))
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(cmbLokasi, 365, 365, 365))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblTanggal, 260, 260, 260))
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(txtTanggal, 365, 365, 365))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblJumlah, 260, 260, 260))
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(txtJumlah, 365, 365, 365))
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(btnSimpan, 173, 173, 173))
            .addGroup(layout.createSequentialGroup()
                .addGap(501, 501, 501)
                .addComponent(btnBatal, 174, 174, 174))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblTitle, 43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblHint, 25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(lblMaterial, 32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(cmbMaterial, 32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(lblLokasi, 32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(cmbLokasi, 32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(lblTanggal, 32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(txtTanggal, 32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(lblJumlah, 32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(txtJumlah, 32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(btnSimpan, 42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(btnBatal, 42, 42, 42)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loadOptions() {
        for (JenisMaterial v : AppConfig.getMasterDataController().tampilkanSemuaMaterial()) { cmbMaterial.addItem(new PilihanData(v.getIdMaterial(), v.getNamaMaterial())); }
        for (Lokasi v : AppConfig.getMasterDataController().tampilkanLokasiPitAktif()) { cmbLokasi.addItem(new PilihanData(v.getIdLokasi(), v.getNamaLokasi())); }
    }
    public ProduksiFormFrame(ProduksiTambang original) {
        this();
        this.original=original;
        if(original!=null) {
        setTitle("Ubah Produksi #" + original.getIdProduksi());
        lblTitle.setText("FORM PRODUKSI (UBAH)");
        FormUtil.select(cmbMaterial,original.getMaterial().getIdMaterial());
        FormUtil.select(cmbLokasi,original.getLokasi().getIdLokasi());
        setTanggalProduksi(original.getTanggalProduksi());
        txtJumlah.setText(String.valueOf(original.getJumlahProduksi()));
        }
    }

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {
        try {

        int mat=FormUtil.id(cmbMaterial),lok=FormUtil.id(cmbLokasi);
        LocalDate t=getTanggalProduksi();
        double jumlah;
        try { jumlah=Double.parseDouble(FormUtil.text(txtJumlah).replace(',', '.')); }
        catch(NumberFormatException e){throw new IllegalArgumentException("Jumlah produksi harus berupa angka, contoh: 120.5");}
        if(jumlah<=0)throw new IllegalArgumentException("Jumlah produksi harus lebih besar dari nol.");
        if(original==null)AppConfig.getProduksiController().tambahProduksi(mat,lok,t,jumlah);
        else AppConfig.getProduksiController().ubahProduksi(original.getIdProduksi(),mat,lok,t,jumlah);

            saved=true;
            JOptionPane.showMessageDialog(this,"Data berhasil disimpan.");
            dispose();
        } catch(Exception ex) { FormUtil.error(this,ex); }
    }
    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) { dispose(); }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox cmbLokasi;
    private javax.swing.JComboBox cmbMaterial;
    private javax.swing.JLabel lblHint;
    private javax.swing.JLabel lblJumlah;
    private javax.swing.JLabel lblLokasi;
    private javax.swing.JLabel lblMaterial;
    private javax.swing.JLabel lblTanggal;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtJumlah;
    private com.toedter.calendar.JDateChooser txtTanggal;
    // End of variables declaration//GEN-END:variables
}

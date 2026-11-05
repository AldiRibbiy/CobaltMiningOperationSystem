package view;
import com.toedter.calendar.JDateChooser;
import config.AppConfig;
import controller.*;
import model.*;
import enums.*;
import java.time.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class PegawaiFormFrame extends javax.swing.JFrame {
    private Pegawai original;
    private boolean saved;
    public boolean isSaved(){return saved;}

    public PegawaiFormFrame() {
        initComponents();

        JButton[] navButtons = {btnSimpan, btnBatal};

        for (JButton btn : navButtons) {
            btn.setOpaque(true);
            btn.setContentAreaFilled(true);
            btn.setBorderPainted(false);
        }

        txtTanggal.setDateFormatString("dd/MM/yyyy");
        txtKhusus2.setDateFormatString("dd/MM/yyyy");
        setSize(720, 620);
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
        cmbJenis = new javax.swing.JComboBox();
        lblNama = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        lblHp = new javax.swing.JLabel();
        txtHp = new javax.swing.JTextField();
        lblTanggal = new javax.swing.JLabel();
        txtTanggal = new com.toedter.calendar.JDateChooser();
        lblStatus = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox();
        lblKhusus1 = new javax.swing.JLabel();
        txtKhusus1 = new javax.swing.JTextField();
        cmbKhusus1 = new javax.swing.JComboBox();
        lblKhusus2 = new javax.swing.JLabel();
        txtKhusus2 = new com.toedter.calendar.JDateChooser();
        lblDriverStatus = new javax.swing.JLabel();
        cmbDriverStatus = new javax.swing.JComboBox();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));
        lblTitle.setText("FORM PEGAWAI");

        lblHint.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblHint.setForeground(new java.awt.Color(103, 121, 143));
        lblHint.setText("Pilih jenis pegawai; kolom khusus menyesuaikan otomatis.");

        lblJenis.setForeground(new java.awt.Color(26, 43, 66));
        lblJenis.setText("Jenis Pegawai");

        cmbJenis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADMIN", "OPERASIONAL", "HSE", "MANAGER", "DRIVER" }));
        cmbJenis.addActionListener(this::cmbJenisActionPerformed);

        lblNama.setForeground(new java.awt.Color(26, 43, 66));
        lblNama.setText("Nama Pegawai");

        lblHp.setForeground(new java.awt.Color(26, 43, 66));
        lblHp.setText("Nomor HP");

        lblTanggal.setForeground(new java.awt.Color(26, 43, 66));
        lblTanggal.setText("Tanggal Masuk");

        lblStatus.setForeground(new java.awt.Color(26, 43, 66));
        lblStatus.setText("Status Pegawai");

        cmbStatus.setEnabled(false);
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AKTIF", "NONAKTIF" }));

        lblKhusus1.setForeground(new java.awt.Color(26, 43, 66));
        lblKhusus1.setText("Data Khusus");

        cmbKhusus1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PAGI", "SIANG", "MALAM" }));

        lblKhusus2.setForeground(new java.awt.Color(26, 43, 66));
        lblKhusus2.setText("Tanggal Khusus");

        lblDriverStatus.setForeground(new java.awt.Color(26, 43, 66));
        lblDriverStatus.setText("Status Driver");

        cmbDriverStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TERSEDIA", "NONAKTIF" }));

        btnSimpan.setBackground(new java.awt.Color(43, 106, 230));
        btnSimpan.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.setFocusPainted(false);
        btnSimpan.addActionListener(this::btnSimpanActionPerformed);

        btnBatal.setBackground(new java.awt.Color(26, 43, 66));
        btnBatal.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal.setText("Batal");
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
                .addComponent(lblJenis, 260, 260, 260)
                .addGap(15, 15, 15)
                .addComponent(cmbJenis, 365, 365, 365))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblNama, 260, 260, 260)
                .addGap(15, 15, 15)
                .addComponent(txtNama, 365, 365, 365))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblHp, 260, 260, 260)
                .addGap(15, 15, 15)
                .addComponent(txtHp, 365, 365, 365))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblTanggal, 260, 260, 260)
                .addGap(15, 15, 15)
                .addComponent(txtTanggal, 365, 365, 365))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblStatus, 260, 260, 260)
                .addGap(15, 15, 15)
                .addComponent(cmbStatus, 365, 365, 365))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblKhusus1, 260, 260, 260)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKhusus1, 365, 365, 365)
                    .addComponent(cmbKhusus1, 365, 365, 365)))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblKhusus2, 260, 260, 260)
                .addGap(15, 15, 15)
                .addComponent(txtKhusus2, 365, 365, 365))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblDriverStatus, 260, 260, 260)
                .addGap(15, 15, 15)
                .addComponent(cmbDriverStatus, 365, 365, 365))
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(btnSimpan, 173, 173, 173)
                .addGap(18, 18, 18)
                .addComponent(btnBatal, 174, 174, 174))
        );
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitle, 36, 36, 36)
                .addGap(1, 1, 1)
                .addComponent(lblHint, 22, 22, 22)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblJenis, 24, 24, 24)
                    .addComponent(cmbJenis, 34, 34, 34))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblNama, 24, 24, 24)
                    .addComponent(txtNama, 34, 34, 34))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblHp, 24, 24, 24)
                    .addComponent(txtHp, 34, 34, 34))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblTanggal, 24, 24, 24)
                    .addComponent(txtTanggal, 34, 34, 34))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblStatus, 24, 24, 24)
                    .addComponent(cmbStatus, 34, 34, 34))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblKhusus1, 24, 24, 24)
                    .addComponent(txtKhusus1, 34, 34, 34)
                    .addComponent(cmbKhusus1, 34, 34, 34))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblKhusus2, 24, 24, 24)
                    .addComponent(txtKhusus2, 34, 34, 34))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblDriverStatus, 24, 24, 24)
                    .addComponent(cmbDriverStatus, 34, 34, 34))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSimpan, 42, 42, 42)
                    .addComponent(btnBatal, 42, 42, 42))
                .addGap(28, 28, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loadOptions() {
        cmbJenis.setModel(new DefaultComboBoxModel<>(new String[]{"ADMIN","OPERASIONAL","HSE","MANAGER","DRIVER"}));
        cmbStatus.setEnabled(false);
        cmbStatus.setToolTipText("Status otomatis dari sistem");
        cmbStatus.setModel(new DefaultComboBoxModel<>(new String[]{"AKTIF","NONAKTIF"}));
        cmbKhusus1.setModel(new DefaultComboBoxModel<>(new String[]{"PAGI","SIANG","MALAM"}));
        cmbDriverStatus.setModel(new DefaultComboBoxModel<>(new String[]{"TERSEDIA","NONAKTIF"}));
        cmbJenis.setSelectedIndex(-1);
        terapkanKolomDinamis();
    }

    /** Menampilkan hanya kolom khusus yang relevan untuk jenis pegawai terpilih. */
    private void terapkanKolomDinamis() {
        String jenis = cmbJenis.getSelectedItem() == null ? "" : String.valueOf(cmbJenis.getSelectedItem());

        boolean isAdmin = "ADMIN".equals(jenis);
        boolean isOps = "OPERASIONAL".equals(jenis);
        boolean isHse = "HSE".equals(jenis);
        boolean isManager = "MANAGER".equals(jenis);
        boolean isDriver = "DRIVER".equals(jenis);

        lblKhusus1.setVisible(isAdmin || isOps || isHse || isManager || isDriver);
        lblKhusus1.setText(isAdmin ? "Kode Admin" : isOps ? "Shift Kerja" : isHse ? "No. Sertifikasi HSE"
                : isManager ? "Divisi Tanggung Jawab" : "No. SIM");
        txtKhusus1.setVisible(isAdmin || isHse || isManager || isDriver);
        cmbKhusus1.setVisible(isOps);

        boolean pakaiTanggalKhusus = isAdmin || isHse || isDriver;
        lblKhusus2.setText(isAdmin ? "Tanggal Mulai Akses" : isHse ? "Masa Berlaku Sertifikasi" : "Masa Berlaku SIM");
        lblKhusus2.setVisible(pakaiTanggalKhusus);
        txtKhusus2.setVisible(pakaiTanggalKhusus);

        lblDriverStatus.setVisible(isDriver);
        cmbDriverStatus.setVisible(isDriver);
        revalidate();
        repaint();
    }

    private void cmbJenisActionPerformed(java.awt.event.ActionEvent evt) {
        // Kolom dinamis mengikuti jenis; isian lama dibersihkan saat membuat data baru.
        terapkanKolomDinamis();

        if (original == null) {
            txtKhusus1.setText("");
            cmbKhusus1.setSelectedIndex(-1);
            txtKhusus2.setDate(null);
            cmbDriverStatus.setSelectedIndex(-1);
        }
    }

    public PegawaiFormFrame(Pegawai original) {
        this();
        this.original=original;
        if(original!=null) {
            setTitle("Ubah Pegawai #" + original.getIdPegawai());
            lblTitle.setText("FORM PEGAWAI (UBAH)");
            String jenis = original.getJenisPegawai();
            String pilihan = jenis.startsWith("PETUGAS") ? jenis.substring("PETUGAS".length()) : jenis;
            cmbJenis.setSelectedItem(pilihan);
            cmbJenis.setEnabled(false);
            txtNama.setText(original.getNamaPegawai());
            txtHp.setText(original.getNoHp());
            txtTanggal.setDate(java.sql.Date.valueOf(original.getTanggalMasuk()));
            cmbStatus.setSelectedItem(String.valueOf(original.getStatusPegawai()));
            terapkanKolomDinamis();

            if(original instanceof Admin){
                txtKhusus1.setText(((Admin)original).getKodeAdmin());
                txtKhusus2.setDate(java.sql.Date.valueOf(((Admin)original).getTanggalMulaiAkses()));
            }
            if(original instanceof PetugasOperasional){cmbKhusus1.setSelectedItem(String.valueOf(((PetugasOperasional)original).getShiftKerja()));}
            if(original instanceof PetugasHSE){
                txtKhusus1.setText(((PetugasHSE)original).getNoSertifikasiHSE());
                txtKhusus2.setDate(java.sql.Date.valueOf(((PetugasHSE)original).getMasaBerlakuSertifikasi()));
            }
            if(original instanceof Manager){txtKhusus1.setText(((Manager)original).getDivisiTanggungJawab());}
            if(original instanceof Driver){
                txtKhusus1.setText(((Driver)original).getNoSim());
                txtKhusus2.setDate(java.sql.Date.valueOf(((Driver)original).getMasaBerlakuSim()));
                // Status BERTUGAS hanya terjadi lewat pengangkutan; tetap ditampilkan agar tidak terganti.
                if(((Driver)original).getStatusDriver()==StatusDriver.BERTUGAS)cmbDriverStatus.addItem("BERTUGAS");
                cmbDriverStatus.setSelectedItem(String.valueOf(((Driver)original).getStatusDriver()));
            }
        }
    }

    private LocalDate tanggal(JDateChooser chooser, String label) {
        Date nilai = chooser.getDate();

        if (nilai == null)throw new IllegalArgumentException(label+" wajib dipilih.");
        return nilai.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {
        try {

        String kind=String.valueOf(cmbJenis.getSelectedItem());
        String nama=FormUtil.text(txtNama), hp=FormUtil.text(txtHp), khusus=FormUtil.text(txtKhusus1);
        FormUtil.require(nama,"Nama pegawai");FormUtil.require(hp,"Nomor HP");
        int id=original==null?0:original.getIdPegawai();
        LocalDate tanggal=tanggal(txtTanggal,"Tanggal masuk");
        StatusPegawai status=(original == null ? StatusPegawai.AKTIF : original.getStatusPegawai());
        Pegawai p;
        switch(kind){
          case "ADMIN":p=new Admin(id,nama,hp,tanggal,status,khusus,tanggal(txtKhusus2,"Tanggal mulai akses"));break;
          case "OPERASIONAL":{
              if(cmbKhusus1.getSelectedItem()==null)throw new IllegalArgumentException("Shift kerja wajib dipilih.");
              p=new PetugasOperasional(id,nama,hp,tanggal,status,ShiftKerja.valueOf(String.valueOf(cmbKhusus1.getSelectedItem())));break;
          }
          case "HSE":p=new PetugasHSE(id,nama,hp,tanggal,status,khusus,tanggal(txtKhusus2,"Masa berlaku sertifikasi"));break;
          case "MANAGER":p=new Manager(id,nama,hp,tanggal,status,khusus);break;
          case "DRIVER":{
              if(cmbDriverStatus.getSelectedItem()==null)throw new IllegalArgumentException("Status driver wajib dipilih.");
              p=new Driver(id,nama,hp,tanggal,status,khusus,tanggal(txtKhusus2,"Masa berlaku SIM"),
                      StatusDriver.valueOf(String.valueOf(cmbDriverStatus.getSelectedItem())));break;
          }
          default:throw new IllegalArgumentException("Jenis pegawai tidak dikenal.");
        }
        if(original==null) AppConfig.getMasterDataController().tambahPegawai(p);
        else AppConfig.getMasterDataController().ubahPegawai(p);

            saved=true;
            JOptionPane.showMessageDialog(this,"Data berhasil disimpan.");
            dispose();
        } catch(Exception ex) { FormUtil.error(this,ex); }
    }
    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) { dispose(); }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox cmbDriverStatus;
    private javax.swing.JComboBox cmbJenis;
    private javax.swing.JComboBox cmbKhusus1;
    private javax.swing.JComboBox cmbStatus;
    private javax.swing.JLabel lblDriverStatus;
    private javax.swing.JLabel lblHint;
    private javax.swing.JLabel lblHp;
    private javax.swing.JLabel lblJenis;
    private javax.swing.JLabel lblKhusus1;
    private javax.swing.JLabel lblKhusus2;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTanggal;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtHp;
    private javax.swing.JTextField txtKhusus1;
    private com.toedter.calendar.JDateChooser txtKhusus2;
    private javax.swing.JTextField txtNama;
    private com.toedter.calendar.JDateChooser txtTanggal;
    // End of variables declaration//GEN-END:variables
}

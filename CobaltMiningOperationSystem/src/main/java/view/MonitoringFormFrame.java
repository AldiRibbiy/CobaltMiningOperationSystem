package view;
import com.toedter.calendar.JDateChooser;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import config.AppConfig;
import controller.*;
import model.*;
import enums.*;
import java.time.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MonitoringFormFrame extends javax.swing.JFrame {
    private MonitoringLingkungan original;
    private boolean saved;
    public boolean isSaved(){return saved;}

    public MonitoringFormFrame() {
        initComponents();
        txtTanggal.setDate(new Date());
        txtTanggal.setDateFormatString("dd/MM/yyyy");
        txtTanggal.setMaxSelectableDate(new Date());
        
        JButton[] navButtons = {btnSimpan, btnBatal};

        for (JButton btn : navButtons) {
            btn.setOpaque(true);
            btn.setContentAreaFilled(true);
            btn.setBorderPainted(false);
        }
        
        setSize(720, 525);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        try { loadOptions(); } catch(Exception ex) { FormUtil.error(this,ex); }

    }

    private LocalDate getTanggalMonitoring() {
        Date tanggal = txtTanggal.getDate();

        if (tanggal == null) {
            throw new IllegalArgumentException(
                "Silakan pilih tanggal monitoring."
            );
        }

        return tanggal.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblHint = new javax.swing.JLabel();
        lblLokasi = new javax.swing.JLabel();
        cmbLokasi = new javax.swing.JComboBox();
        lblTanggal = new javax.swing.JLabel();
        lblCatatan = new javax.swing.JLabel();
        txtCatatan = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        txtTanggal = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));
        lblTitle.setText("FORM MONITORING");

        lblHint.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblHint.setForeground(new java.awt.Color(103, 121, 143));
        lblHint.setText("Isi data sesuai ketentuan C-MOS.");

        lblLokasi.setForeground(new java.awt.Color(26, 43, 66));
        lblLokasi.setText("Lokasi");

        lblTanggal.setForeground(new java.awt.Color(26, 43, 66));
        lblTanggal.setText("Tanggal Waktu");

        lblCatatan.setForeground(new java.awt.Color(26, 43, 66));
        lblCatatan.setText("Catatan");

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
                .addComponent(lblLokasi, 260, 260, 260))
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(btnSimpan, 173, 173, 173)
                .addGap(18, 18, 18)
                .addComponent(btnBatal, 174, 174, 174))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTanggal, javax.swing.GroupLayout.Alignment.TRAILING, 260, 260, 260)
                    .addComponent(lblCatatan, 260, 260, 260))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtCatatan)
                    .addComponent(cmbLokasi, javax.swing.GroupLayout.Alignment.LEADING, 365, 365, Short.MAX_VALUE)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(lblLokasi, 32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(lblCatatan, 32, 32, 32))
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
                                .addComponent(cmbLokasi, 32, 32, 32)))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTanggal, 32, 32, 32)
                            .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCatatan, 32, 32, 32)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBatal, 42, 42, 42)
                    .addComponent(btnSimpan, 42, 42, 42))
                .addGap(54, 54, 54))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loadOptions() {
        for (Lokasi v : AppConfig.getMasterDataController().tampilkanLokasiAktif()) { cmbLokasi.addItem(new PilihanData(v.getIdLokasi(), String.valueOf(v.getNamaLokasi()))); }
    }
    
    public MonitoringFormFrame(MonitoringLingkungan original) {
        this();

        this.original = original;

        if (original != null) {
            setTitle("Ubah Monitoring #" + original.getIdMonitoring());
            lblTitle.setText("FORM MONITORING (UBAH)");
            setTanggalMonitoring(original.getTanggalMonitoring());
            txtTanggal.setMaxSelectableDate(null);
            FormUtil.select(cmbLokasi, original.getLokasi().getIdLokasi());
            txtCatatan.setText(original.getCatatan() == null ? "" : original.getCatatan());
        }
    }

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int idLokasi = FormUtil.id(cmbLokasi);

            LocalDateTime tanggalMonitoring =
                    getTanggalMonitoring().atStartOfDay();

            String catatan = FormUtil.text(txtCatatan);

            if (original == null) {
                AppConfig.getMonitoringController().buatMonitoring(
                        idLokasi,
                        tanggalMonitoring,
                        catatan
                );
                JOptionPane.showMessageDialog(this, "Data monitoring berhasil disimpan.");
            } else {
                AppConfig.getMonitoringController().ubahMonitoring(
                        original.getIdMonitoring(),
                        idLokasi,
                        tanggalMonitoring,
                        catatan
                );
                JOptionPane.showMessageDialog(this, "Data monitoring berhasil diperbarui.");
            }

            saved = true;
            dispose();

        } catch (Exception ex) {
            FormUtil.error(this, ex);
        }
    }
    
    private void setTanggalMonitoring(LocalDateTime tanggal) {
        if (tanggal == null) {
            txtTanggal.setDate(null);
            return;
        }

        Date date = Date.from(
            tanggal.atZone(ZoneId.systemDefault()).toInstant()
        );

        txtTanggal.setDate(date);
    }
    
    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) { dispose(); }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox cmbLokasi;
    private javax.swing.JLabel lblCatatan;
    private javax.swing.JLabel lblHint;
    private javax.swing.JLabel lblLokasi;
    private javax.swing.JLabel lblTanggal;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCatatan;
    private com.toedter.calendar.JDateChooser txtTanggal;
    // End of variables declaration//GEN-END:variables
}

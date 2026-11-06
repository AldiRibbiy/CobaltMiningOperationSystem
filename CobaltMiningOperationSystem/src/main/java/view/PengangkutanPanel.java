package view;

import config.AppConfig;
import controller.*;
import model.*;
import enums.*;
import java.time.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/** Halaman pengangkutan dengan KPI, filter, sorting, dan panel detail. */
public class PengangkutanPanel extends javax.swing.JPanel {

    public PengangkutanPanel() {
        initComponents();
        JButton[] navButtons = {btnAdd, btnMulai, btnSelesai, btnBatalkan};

for (JButton btn : navButtons) {
    btn.setOpaque(true);
    btn.setContentAreaFilled(true);
    btn.setBorderPainted(false);
}

        cmbStatus.addActionListener(e -> terapkanFilter());
        txtCari.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
    public void insertUpdate(javax.swing.event.DocumentEvent e) { terapkanFilter(); }
    public void removeUpdate(javax.swing.event.DocumentEvent e) { terapkanFilter(); }
    public void changedUpdate(javax.swing.event.DocumentEvent e) { terapkanFilter(); }
});
        tblData.getSelectionModel().addListSelectionListener(evt -> {
            if (!evt.getValueIsAdjusting()) {
                try { if (tblData.getSelectedRow() >= 0)isiDetail(selected()); } catch (Exception ignored) { }
            }
        });
        try { refreshData(); } catch (Exception ex) { FormUtil.error(this, ex); }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFilter = new javax.swing.JPanel();
        lblCari = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox();
        pnlKpi0 = new javax.swing.JPanel();
        lblKpiTitle0 = new javax.swing.JLabel();
        lblKpiValue0 = new javax.swing.JLabel();
        lblKpiSub0 = new javax.swing.JLabel();
        pnlKpi1 = new javax.swing.JPanel();
        lblKpiTitle1 = new javax.swing.JLabel();
        lblKpiValue1 = new javax.swing.JLabel();
        lblKpiSub1 = new javax.swing.JLabel();
        pnlKpi2 = new javax.swing.JPanel();
        lblKpiTitle2 = new javax.swing.JLabel();
        lblKpiValue2 = new javax.swing.JLabel();
        lblKpiSub2 = new javax.swing.JLabel();
        pnlKpi3 = new javax.swing.JPanel();
        lblKpiTitle3 = new javax.swing.JLabel();
        lblKpiValue3 = new javax.swing.JLabel();
        lblKpiSub3 = new javax.swing.JLabel();
        pnlKpi4 = new javax.swing.JPanel();
        lblKpiTitle4 = new javax.swing.JLabel();
        lblKpiValue4 = new javax.swing.JLabel();
        lblKpiSub4 = new javax.swing.JLabel();
        pnlKpi5 = new javax.swing.JPanel();
        lblKpiTitle5 = new javax.swing.JLabel();
        lblKpiValue5 = new javax.swing.JLabel();
        lblKpiSub5 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblSubtitle = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnMulai = new javax.swing.JButton();
        btnSelesai = new javax.swing.JButton();
        btnBatalkan = new javax.swing.JButton();
        scrollTable = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        pnlDetail = new javax.swing.JPanel();
        lblDetTitle = new javax.swing.JLabel();
        lblDetHint = new javax.swing.JLabel();
        lblD1 = new javax.swing.JLabel();
        lblD2 = new javax.swing.JLabel();
        lblD3 = new javax.swing.JLabel();
        lblD4 = new javax.swing.JLabel();
        lblD5 = new javax.swing.JLabel();
        lblD6 = new javax.swing.JLabel();
        lblD7 = new javax.swing.JLabel();
        lblD8 = new javax.swing.JLabel();
        lblD9 = new javax.swing.JLabel();
        lblD10 = new javax.swing.JLabel();
        lblD11 = new javax.swing.JLabel();
        lblD12 = new javax.swing.JLabel();
        lblD13 = new javax.swing.JLabel();
        lblD14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(214, 192, 179));

        pnlFilter.setBackground(new java.awt.Color(234, 216, 192));

        lblCari.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblCari.setForeground(new java.awt.Color(26, 43, 66));
        lblCari.setText("Cari");

        txtCari.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        lblStatus.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(26, 43, 66));
        lblStatus.setText("Status");

        cmbStatus.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Semua Status", "DIJADWALKAN", "DALAM_PERJALANAN", "SELESAI", "DIBATALKAN" }));

        org.jdesktop.layout.GroupLayout pnlFilterLayout = new org.jdesktop.layout.GroupLayout(pnlFilter);
        pnlFilter.setLayout(pnlFilterLayout);
        pnlFilterLayout.setHorizontalGroup(
            pnlFilterLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlFilterLayout.createSequentialGroup()
                .add(20, 20, 20)
                .add(lblCari, 40, 40, 40)
                .add(20, 20, 20)
                .add(txtCari, 220, 220, 220)
                .add(20, 20, 20)
                .add(lblStatus, 50, 50, 50)
                .add(20, 20, 20)
                .add(cmbStatus, 170, 170, 170)
                .add(20, 20, 20))
        );
        pnlFilterLayout.setVerticalGroup(
            pnlFilterLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlFilterLayout.createSequentialGroup()
                .add(16, 16, 16)
                .add(pnlFilterLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblCari, 32, 32, 32)
                    .add(txtCari, 30, 30, 30)
                    .add(lblStatus, 32, 32, 32)
                    .add(cmbStatus, 30, 30, 30))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlKpi0.setBackground(new java.awt.Color(234, 216, 192));

        lblKpiTitle0.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle0.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiTitle0.setText("TOTAL PENGANGKUTAN");

        lblKpiValue0.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lblKpiValue0.setForeground(new java.awt.Color(26, 43, 66));
        lblKpiValue0.setText("-");

        lblKpiSub0.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub0.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiSub0.setText("seluruh riwayat");

        org.jdesktop.layout.GroupLayout pnlKpi0Layout = new org.jdesktop.layout.GroupLayout(pnlKpi0);
        pnlKpi0.setLayout(pnlKpi0Layout);
        pnlKpi0Layout.setHorizontalGroup(
            pnlKpi0Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi0Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(pnlKpi0Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblKpiTitle0, 10, 148, Short.MAX_VALUE)
                    .add(lblKpiValue0, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(lblKpiSub0, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlKpi0Layout.setVerticalGroup(
            pnlKpi0Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi0Layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(lblKpiTitle0, 14, 14, 14)
                .add(4, 4, 4)
                .add(lblKpiValue0, 28, 28, 28)
                .add(3, 3, 3)
                .add(lblKpiSub0, 16, 16, 16)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlKpi1.setBackground(new java.awt.Color(234, 216, 192));

        lblKpiTitle1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle1.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiTitle1.setText("DIJADWALKAN");

        lblKpiValue1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lblKpiValue1.setForeground(new java.awt.Color(43, 106, 230));
        lblKpiValue1.setText("-");

        lblKpiSub1.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub1.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiSub1.setText("menunggu perjalanan");

        org.jdesktop.layout.GroupLayout pnlKpi1Layout = new org.jdesktop.layout.GroupLayout(pnlKpi1);
        pnlKpi1.setLayout(pnlKpi1Layout);
        pnlKpi1Layout.setHorizontalGroup(
            pnlKpi1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi1Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(pnlKpi1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblKpiTitle1, 10, 161, Short.MAX_VALUE)
                    .add(lblKpiValue1, 10, 161, Short.MAX_VALUE)
                    .add(lblKpiSub1, 10, 161, Short.MAX_VALUE)))
        );
        pnlKpi1Layout.setVerticalGroup(
            pnlKpi1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi1Layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(lblKpiTitle1, 14, 14, 14)
                .add(4, 4, 4)
                .add(lblKpiValue1, 28, 28, 28)
                .add(3, 3, 3)
                .add(lblKpiSub1, 16, 16, 16)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlKpi2.setBackground(new java.awt.Color(234, 216, 192));

        lblKpiTitle2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle2.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiTitle2.setText("DALAM PERJALANAN");

        lblKpiValue2.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lblKpiValue2.setForeground(new java.awt.Color(183, 121, 31));
        lblKpiValue2.setText("-");

        lblKpiSub2.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub2.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiSub2.setText("sedang berlangsung");

        org.jdesktop.layout.GroupLayout pnlKpi2Layout = new org.jdesktop.layout.GroupLayout(pnlKpi2);
        pnlKpi2.setLayout(pnlKpi2Layout);
        pnlKpi2Layout.setHorizontalGroup(
            pnlKpi2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi2Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(pnlKpi2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblKpiTitle2, 10, 161, Short.MAX_VALUE)
                    .add(lblKpiValue2, 10, 161, Short.MAX_VALUE)
                    .add(lblKpiSub2, 10, 161, Short.MAX_VALUE)))
        );
        pnlKpi2Layout.setVerticalGroup(
            pnlKpi2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi2Layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(lblKpiTitle2, 14, 14, 14)
                .add(4, 4, 4)
                .add(lblKpiValue2, 28, 28, 28)
                .add(3, 3, 3)
                .add(lblKpiSub2, 16, 16, 16)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlKpi3.setBackground(new java.awt.Color(234, 216, 192));

        lblKpiTitle3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle3.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiTitle3.setText("SELESAI");

        lblKpiValue3.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lblKpiValue3.setForeground(new java.awt.Color(46, 125, 70));
        lblKpiValue3.setText("-");

        lblKpiSub3.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub3.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiSub3.setText("stok produksi terpotong");

        org.jdesktop.layout.GroupLayout pnlKpi3Layout = new org.jdesktop.layout.GroupLayout(pnlKpi3);
        pnlKpi3.setLayout(pnlKpi3Layout);
        pnlKpi3Layout.setHorizontalGroup(
            pnlKpi3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi3Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(pnlKpi3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblKpiTitle3, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(lblKpiValue3, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(lblKpiSub3, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlKpi3Layout.setVerticalGroup(
            pnlKpi3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi3Layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(lblKpiTitle3, 14, 14, 14)
                .add(4, 4, 4)
                .add(lblKpiValue3, 28, 28, 28)
                .add(3, 3, 3)
                .add(lblKpiSub3, 16, 16, 16)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlKpi4.setBackground(new java.awt.Color(234, 216, 192));

        lblKpiTitle4.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle4.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiTitle4.setText("KENDARAAN TERSEDIA");

        lblKpiValue4.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lblKpiValue4.setForeground(new java.awt.Color(31, 122, 140));
        lblKpiValue4.setText("-");

        lblKpiSub4.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub4.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiSub4.setText("siap ditugaskan");

        org.jdesktop.layout.GroupLayout pnlKpi4Layout = new org.jdesktop.layout.GroupLayout(pnlKpi4);
        pnlKpi4.setLayout(pnlKpi4Layout);
        pnlKpi4Layout.setHorizontalGroup(
            pnlKpi4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi4Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(pnlKpi4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblKpiTitle4, 10, 161, Short.MAX_VALUE)
                    .add(lblKpiValue4, 10, 161, Short.MAX_VALUE)
                    .add(lblKpiSub4, 10, 161, Short.MAX_VALUE)))
        );
        pnlKpi4Layout.setVerticalGroup(
            pnlKpi4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi4Layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(lblKpiTitle4, 14, 14, 14)
                .add(4, 4, 4)
                .add(lblKpiValue4, 28, 28, 28)
                .add(3, 3, 3)
                .add(lblKpiSub4, 16, 16, 16)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlKpi5.setBackground(new java.awt.Color(234, 216, 192));

        lblKpiTitle5.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle5.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiTitle5.setText("DRIVER TERSEDIA");

        lblKpiValue5.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lblKpiValue5.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiValue5.setText("-");

        lblKpiSub5.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub5.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiSub5.setText("siap ditugaskan");

        org.jdesktop.layout.GroupLayout pnlKpi5Layout = new org.jdesktop.layout.GroupLayout(pnlKpi5);
        pnlKpi5.setLayout(pnlKpi5Layout);
        pnlKpi5Layout.setHorizontalGroup(
            pnlKpi5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi5Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(pnlKpi5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblKpiTitle5, 10, 144, Short.MAX_VALUE)
                    .add(lblKpiValue5, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(lblKpiSub5, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlKpi5Layout.setVerticalGroup(
            pnlKpi5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlKpi5Layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(lblKpiTitle5, 14, 14, 14)
                .add(4, 4, 4)
                .add(lblKpiValue5, 28, 28, 28)
                .add(3, 3, 3)
                .add(lblKpiSub5, 16, 16, 16)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));
        lblTitle.setText("Pengangkutan");

        lblSubtitle.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblSubtitle.setForeground(new java.awt.Color(103, 121, 143));
        lblSubtitle.setText("Pusat pemantauan perjalanan, kendaraan, dan driver");

        btnAdd.setBackground(new java.awt.Color(43, 106, 230));
        btnAdd.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Tambah");
        btnAdd.setFocusPainted(false);
        btnAdd.addActionListener(this::btnAddActionPerformed);

        btnMulai.setBackground(new java.awt.Color(26, 43, 66));
        btnMulai.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnMulai.setForeground(new java.awt.Color(255, 255, 255));
        btnMulai.setText("Mulai Perjalanan");
        btnMulai.setFocusPainted(false);
        btnMulai.addActionListener(this::btnMulaiActionPerformed);

        btnSelesai.setBackground(new java.awt.Color(46, 125, 70));
        btnSelesai.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnSelesai.setForeground(new java.awt.Color(255, 255, 255));
        btnSelesai.setText("Selesaikan");
        btnSelesai.setFocusPainted(false);
        btnSelesai.addActionListener(this::btnSelesaiActionPerformed);

        btnBatalkan.setBackground(new java.awt.Color(160, 45, 62));
        btnBatalkan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnBatalkan.setForeground(new java.awt.Color(255, 255, 255));
        btnBatalkan.setText("Batalkan");
        btnBatalkan.setFocusPainted(false);
        btnBatalkan.addActionListener(this::btnBatalkanActionPerformed);

        scrollTable.setBackground(new java.awt.Color(255, 255, 255));

        tblData.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Tanggal", "Produksi", "Kendaraan", "Driver", "Muatan (ton)", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblData.setGridColor(new java.awt.Color(226, 232, 240));
        tblData.setRowHeight(28);
        scrollTable.setViewportView(tblData);

        pnlDetail.setBackground(new java.awt.Color(234, 216, 192));

        lblDetTitle.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        lblDetTitle.setForeground(new java.awt.Color(26, 43, 66));
        lblDetTitle.setText("DETAIL PENGANGKUTAN");

        lblDetHint.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblDetHint.setForeground(new java.awt.Color(103, 121, 143));
        lblDetHint.setText("Pilih data pada tabel untuk melihat rincian lengkap.");

        lblD1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblD1.setForeground(new java.awt.Color(26, 43, 66));
        lblD1.setText("Status: -");

        lblD2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblD2.setForeground(new java.awt.Color(26, 43, 66));
        lblD2.setText("Tanggal: -");

        lblD3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblD3.setForeground(new java.awt.Color(26, 43, 66));
        lblD3.setText("Sumber produksi: -");

        lblD4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblD4.setForeground(new java.awt.Color(26, 43, 66));
        lblD4.setText("Material: -");

        lblD5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblD5.setForeground(new java.awt.Color(26, 43, 66));
        lblD5.setText("Asal: -");

        lblD6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblD6.setForeground(new java.awt.Color(26, 43, 66));
        lblD6.setText("Tujuan: -");

        lblD7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblD7.setForeground(new java.awt.Color(26, 43, 66));
        lblD7.setText("Muatan: -");

        lblD8.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblD8.setForeground(new java.awt.Color(26, 43, 66));
        lblD8.setText("Kendaraan: -");

        lblD9.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblD9.setForeground(new java.awt.Color(26, 43, 66));
        lblD9.setText("Plat: -");

        lblD10.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblD10.setForeground(new java.awt.Color(26, 43, 66));
        lblD10.setText("Driver: -");

        lblD11.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblD11.setForeground(new java.awt.Color(26, 43, 66));
        lblD11.setText("Petugas Ops: -");

        lblD12.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblD12.setForeground(new java.awt.Color(26, 43, 66));
        lblD12.setText("Waktu mulai: -");

        lblD13.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblD13.setForeground(new java.awt.Color(26, 43, 66));
        lblD13.setText("Waktu selesai: -");

        lblD14.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblD14.setForeground(new java.awt.Color(26, 43, 66));
        lblD14.setText("Sisa stok produksi: -");

        org.jdesktop.layout.GroupLayout pnlDetailLayout = new org.jdesktop.layout.GroupLayout(pnlDetail);
        pnlDetail.setLayout(pnlDetailLayout);
        pnlDetailLayout.setHorizontalGroup(
            pnlDetailLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlDetailLayout.createSequentialGroup()
                .add(20, 20, 20)
                .add(pnlDetailLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblDetTitle, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(lblDetHint, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(pnlDetailLayout.createSequentialGroup()
                        .add(pnlDetailLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lblD1, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(lblD2, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(lblD3, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(lblD4, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(lblD5, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(lblD6, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(lblD7, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(24, 24, 24)
                        .add(pnlDetailLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lblD8, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(lblD9, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(lblD10, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(lblD11, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(lblD12, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(lblD13, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(lblD14, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .add(20, 20, 20))
        );
        pnlDetailLayout.setVerticalGroup(
            pnlDetailLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlDetailLayout.createSequentialGroup()
                .add(14, 14, 14)
                .add(lblDetTitle, 24, 24, 24)
                .add(4, 4, 4)
                .add(lblDetHint, 18, 18, 18)
                .add(14, 14, 14)
                .add(pnlDetailLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblD1, 22, 22, 22)
                    .add(lblD8, 22, 22, 22))
                .add(6, 6, 6)
                .add(pnlDetailLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblD2, 22, 22, 22)
                    .add(lblD9, 22, 22, 22))
                .add(6, 6, 6)
                .add(pnlDetailLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblD3, 22, 22, 22)
                    .add(lblD10, 22, 22, 22))
                .add(6, 6, 6)
                .add(pnlDetailLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblD4, 22, 22, 22)
                    .add(lblD11, 22, 22, 22))
                .add(6, 6, 6)
                .add(pnlDetailLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblD5, 22, 22, 22)
                    .add(lblD12, 22, 22, 22))
                .add(6, 6, 6)
                .add(pnlDetailLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblD6, 22, 22, 22)
                    .add(lblD13, 22, 22, 22))
                .add(6, 6, 6)
                .add(pnlDetailLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblD7, 22, 22, 22)
                    .add(lblD14, 22, 22, 22))
                .add(14, 14, 14))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(24, 24, 24)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(pnlFilter, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, pnlDetail, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, scrollTable)
                            .add(layout.createSequentialGroup()
                                .add(pnlKpi0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(pnlKpi1, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(pnlKpi2, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(pnlKpi3, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(pnlKpi4, 10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(pnlKpi5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(lblTitle, 10, 460, Short.MAX_VALUE)
                                    .add(lblSubtitle, 10, 460, Short.MAX_VALUE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btnAdd, 120, 120, 120)
                                .add(8, 8, 8)
                                .add(btnMulai, 165, 165, 165)
                                .add(8, 8, 8)
                                .add(btnSelesai, 140, 140, 140)
                                .add(8, 8, 8)
                                .add(btnBatalkan, 120, 120, 120)))
                        .add(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(lblTitle, 40, 40, 40)
                        .add(2, 2, 2)
                        .add(lblSubtitle, 22, 22, 22))
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                        .add(btnAdd, 42, 42, 42)
                        .add(btnMulai, 42, 42, 42)
                        .add(btnSelesai, 42, 42, 42)
                        .add(btnBatalkan, 42, 42, 42)))
                .add(12, 12, 12)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlKpi0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(pnlKpi1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(pnlKpi2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(pnlKpi4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(pnlKpi5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(pnlKpi3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(12, 12, 12)
                .add(pnlFilter, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(12, 12, 12)
                .add(scrollTable, 260, 327, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pnlDetail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private final java.util.List<model.Pengangkutan> records = new ArrayList<>();

    private javax.swing.table.TableRowSorter<DefaultTableModel> sorter;



    private void refreshData() {

        records.clear();

        records.addAll(AppConfig.getPengangkutanController().tampilkanSemuaPengangkutan());

        DefaultTableModel model = new DefaultTableModel(

            new String[]{"No.", "Tanggal", "Produksi", "Kendaraan", "Driver", "Muatan (ton)", "Status"}, 0) {

            @Override public boolean isCellEditable(int r, int c) { return false; }

        };

        int dijadwalkan = 0, perjalanan = 0, selesai = 0;

        for (model.Pengangkutan p : records) {

            model.addRow(new Object[]{model.getRowCount() + 1, p.getTanggalPengangkutan(),

                p.getProduksi() == null ? "-" : "#" + p.getProduksi().getIdProduksi(),

                p.getKendaraan() == null ? "-" : p.getKendaraan().getNomorPolisi(),

                p.getDriver() == null ? "-" : p.getDriver().getNamaPegawai(),

                p.getJumlahMuatan(), p.getStatusPengangkutan()});

            switch (p.getStatusPengangkutan()) {

                case DIJADWALKAN: dijadwalkan++; break;

                case DALAM_PERJALANAN: perjalanan++; break;

                case SELESAI: selesai++; break;

                default: break;

            }

        }

        tblData.setModel(model);

        sorter = new javax.swing.table.TableRowSorter<>(model);

        tblData.setRowSorter(sorter);

        tblData.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        FormUtil.nomorUrut(tblData);

        muatKpi(dijadwalkan, perjalanan, selesai);

        terapkanFilter();

        if (!records.isEmpty()) {

            tblData.setRowSelectionInterval(0, 0);

            isiDetail(records.get(0));

        } else {

            kosongkanDetail();

        }

    }



    private void muatKpi(int dijadwalkan, int perjalanan, int selesai) {

        lblKpiValue0.setText(String.valueOf(records.size()));

        lblKpiValue1.setText(String.valueOf(dijadwalkan));

        lblKpiValue2.setText(String.valueOf(perjalanan));

        lblKpiValue3.setText(String.valueOf(selesai));

        lblKpiValue4.setText(String.valueOf(AppConfig.getMasterDataController().tampilkanKendaraanTersedia().size()));

        lblKpiValue5.setText(String.valueOf(AppConfig.getMasterDataController().tampilkanDriverTersedia().size()));

    }



    private void terapkanFilter() {

        if (sorter == null)return;

        java.util.List<javax.swing.RowFilter<Object, Object>> aturan = new ArrayList<>();

        String kata = txtCari.getText().trim();

        if (!kata.isEmpty())aturan.add(javax.swing.RowFilter.regexFilter("(?i)" + java.util.regex.Pattern.quote(kata), 2, 3, 4, 6));

        int pilih = cmbStatus.getSelectedIndex();

        if (pilih > 0)aturan.add(javax.swing.RowFilter.regexFilter("^" + java.util.regex.Pattern.quote(String.valueOf(cmbStatus.getSelectedItem())) + "$", 6));

        sorter.setRowFilter(aturan.isEmpty() ? null : javax.swing.RowFilter.andFilter(aturan));

    }



    private model.Pengangkutan selected() {

        int row = tblData.getSelectedRow();

        if (row < 0)throw new IllegalArgumentException("Pilih satu baris data terlebih dahulu.");

        return records.get(tblData.convertRowIndexToModel(row));

    }



    private void isiDetail(model.Pengangkutan p) {

        java.time.format.DateTimeFormatter fmt = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        lblD1.setText("Status: " + p.getStatusPengangkutan());

        lblD2.setText("Tanggal: " + p.getTanggalPengangkutan());

        lblD3.setText("Sumber produksi: " + (p.getLokasiAsal() == null ? "-" : p.getLokasiAsal().getNamaLokasi()));

        lblD4.setText("Material: " + (p.getProduksi() == null || p.getProduksi().getMaterial() == null

            ? "-" : p.getProduksi().getMaterial().getNamaMaterial()));

        lblD5.setText("Asal: " + (p.getLokasiAsal() == null ? "-" : p.getLokasiAsal().getNamaLokasi()));

        lblD6.setText("Tujuan: " + (p.getLokasiTujuan() == null ? "-" : p.getLokasiTujuan().getNamaLokasi()));

        lblD7.setText("Muatan: " + p.getJumlahMuatan() + " ton");

        lblD8.setText("Kendaraan: " + (p.getKendaraan() == null ? "-" : p.getKendaraan().getJenisKendaraan()));

        lblD9.setText("Plat: " + (p.getKendaraan() == null ? "-" : p.getKendaraan().getNomorPolisi())

            + "  \u00b7  kapasitas " + (p.getKendaraan() == null ? "-" : p.getKendaraan().getKapasitas()) + " ton");

        lblD10.setText("Driver: " + (p.getDriver() == null ? "-" : p.getDriver().getNamaPegawai())

            + (p.getDriver() == null ? "" : "  \u00b7  SIM " + p.getDriver().getNoSim()));

        lblD11.setText("Petugas Ops: " + (p.getPetugasOperasional() == null ? "-" : p.getPetugasOperasional().getNamaPegawai()));

        lblD12.setText("Waktu mulai: " + (p.getWaktuMulai() == null ? "-" : p.getWaktuMulai().format(fmt)));

        lblD13.setText("Waktu selesai: " + (p.getWaktuSelesai() == null ? "-" : p.getWaktuSelesai().format(fmt)));

        lblD14.setText("Sisa stok produksi: "

            + (p.getProduksi() == null ? "-" : p.getProduksi().getJumlahTersedia()) + " ton");

    }



    private void kosongkanDetail() {

        for (int i = 1; i <= 14; i++) {

            javax.swing.JLabel lbl = null;

            switch (i) {

                case 1: lbl = lblD1; break;

                case 2: lbl = lblD2; break;

                case 3: lbl = lblD3; break;

                case 4: lbl = lblD4; break;

                case 5: lbl = lblD5; break;

                case 6: lbl = lblD6; break;

                case 7: lbl = lblD7; break;

                case 8: lbl = lblD8; break;

                case 9: lbl = lblD9; break;

                case 10: lbl = lblD10; break;

                case 11: lbl = lblD11; break;

                case 12: lbl = lblD12; break;

                case 13: lbl = lblD13; break;

                default: lbl = lblD14; break;

            }

            lbl.setText(lbl.getText().split(":")[0] + ": -");

        }

    }







    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {

        try {

            PengangkutanFormFrame f = new PengangkutanFormFrame();

            f.setVisible(true);

            f.addWindowListener(new java.awt.event.WindowAdapter() {

                @Override public void windowClosed(java.awt.event.WindowEvent e) { if (f.isSaved())refreshData(); }

            });

        } catch (Exception ex) { FormUtil.error(this, ex); }

    }



    private void btnMulaiActionPerformed(java.awt.event.ActionEvent evt) {

        try {

            AppConfig.getPengangkutanController().mulaiPengangkutan(selected().getIdPengangkutan());

            JOptionPane.showMessageDialog(this, "Pengangkutan dimulai. Kendaraan dan driver kini bertugas.");

            refreshData();

        } catch (Exception ex) { FormUtil.error(this, ex); }

    }



    private void btnSelesaiActionPerformed(java.awt.event.ActionEvent evt) {

        try {

            AppConfig.getPengangkutanController().selesaikanPengangkutan(selected().getIdPengangkutan());

            JOptionPane.showMessageDialog(this, "Pengangkutan selesai. Stok produksi diperbarui.");

            refreshData();

        } catch (Exception ex) { FormUtil.error(this, ex); }

    }



    private void btnBatalkanActionPerformed(java.awt.event.ActionEvent evt) {

        try {

            if (JOptionPane.showConfirmDialog(this, "Batalkan pengangkutan terpilih?",

                "Konfirmasi", JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION)return;

            AppConfig.getPengangkutanController().batalkanPengangkutan(selected().getIdPengangkutan());

            JOptionPane.showMessageDialog(this, "Pengangkutan dibatalkan. Stok produksi tidak berkurang.");

            refreshData();

        } catch (Exception ex) { FormUtil.error(this, ex); }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBatalkan;
    private javax.swing.JButton btnMulai;
    private javax.swing.JButton btnSelesai;
    private javax.swing.JComboBox cmbStatus;
    private javax.swing.JLabel lblCari;
    private javax.swing.JLabel lblD1;
    private javax.swing.JLabel lblD10;
    private javax.swing.JLabel lblD11;
    private javax.swing.JLabel lblD12;
    private javax.swing.JLabel lblD13;
    private javax.swing.JLabel lblD14;
    private javax.swing.JLabel lblD2;
    private javax.swing.JLabel lblD3;
    private javax.swing.JLabel lblD4;
    private javax.swing.JLabel lblD5;
    private javax.swing.JLabel lblD6;
    private javax.swing.JLabel lblD7;
    private javax.swing.JLabel lblD8;
    private javax.swing.JLabel lblD9;
    private javax.swing.JLabel lblDetHint;
    private javax.swing.JLabel lblDetTitle;
    private javax.swing.JLabel lblKpiSub0;
    private javax.swing.JLabel lblKpiSub1;
    private javax.swing.JLabel lblKpiSub2;
    private javax.swing.JLabel lblKpiSub3;
    private javax.swing.JLabel lblKpiSub4;
    private javax.swing.JLabel lblKpiSub5;
    private javax.swing.JLabel lblKpiTitle0;
    private javax.swing.JLabel lblKpiTitle1;
    private javax.swing.JLabel lblKpiTitle2;
    private javax.swing.JLabel lblKpiTitle3;
    private javax.swing.JLabel lblKpiTitle4;
    private javax.swing.JLabel lblKpiTitle5;
    private javax.swing.JLabel lblKpiValue0;
    private javax.swing.JLabel lblKpiValue1;
    private javax.swing.JLabel lblKpiValue2;
    private javax.swing.JLabel lblKpiValue3;
    private javax.swing.JLabel lblKpiValue4;
    private javax.swing.JLabel lblKpiValue5;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlDetail;
    private javax.swing.JPanel pnlFilter;
    private javax.swing.JPanel pnlKpi0;
    private javax.swing.JPanel pnlKpi1;
    private javax.swing.JPanel pnlKpi2;
    private javax.swing.JPanel pnlKpi3;
    private javax.swing.JPanel pnlKpi4;
    private javax.swing.JPanel pnlKpi5;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtCari;
    // End of variables declaration//GEN-END:variables
}

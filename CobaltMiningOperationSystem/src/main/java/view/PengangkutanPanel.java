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

        lblCari = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox();
        pnlFilter = new javax.swing.JPanel();
        lblKpiTitle0 = new javax.swing.JLabel();
        lblKpiValue0 = new javax.swing.JLabel();
        lblKpiSub0 = new javax.swing.JLabel();
        pnlKpi0 = new javax.swing.JPanel();
        lblKpiTitle1 = new javax.swing.JLabel();
        lblKpiValue1 = new javax.swing.JLabel();
        lblKpiSub1 = new javax.swing.JLabel();
        pnlKpi1 = new javax.swing.JPanel();
        lblKpiTitle2 = new javax.swing.JLabel();
        lblKpiValue2 = new javax.swing.JLabel();
        lblKpiSub2 = new javax.swing.JLabel();
        pnlKpi2 = new javax.swing.JPanel();
        lblKpiTitle3 = new javax.swing.JLabel();
        lblKpiValue3 = new javax.swing.JLabel();
        lblKpiSub3 = new javax.swing.JLabel();
        pnlKpi3 = new javax.swing.JPanel();
        lblKpiTitle4 = new javax.swing.JLabel();
        lblKpiValue4 = new javax.swing.JLabel();
        lblKpiSub4 = new javax.swing.JLabel();
        pnlKpi4 = new javax.swing.JPanel();
        lblKpiTitle5 = new javax.swing.JLabel();
        lblKpiValue5 = new javax.swing.JLabel();
        lblKpiSub5 = new javax.swing.JLabel();
        pnlKpi5 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblSubtitle = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnMulai = new javax.swing.JButton();
        btnSelesai = new javax.swing.JButton();
        btnBatalkan = new javax.swing.JButton();

        scrollTable = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
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
        pnlDetail = new javax.swing.JPanel();


        lblCari.setText("Cari");
        lblCari.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblCari.setForeground(new java.awt.Color(26, 43, 66));

        txtCari.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtCari.setBackground(new java.awt.Color(255, 255, 255));

        lblStatus.setText("Status");
        lblStatus.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(26, 43, 66));

        cmbStatus.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        cmbStatus.setBackground(new java.awt.Color(255, 255, 255));
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua Status", "DIJADWALKAN", "DALAM_PERJALANAN", "SELESAI", "DIBATALKAN" }));

        pnlFilter.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle0.setText("TOTAL PENGANGKUTAN");
        lblKpiTitle0.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle0.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue0.setText("-");
        lblKpiValue0.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lblKpiValue0.setForeground(new java.awt.Color(26, 43, 66));

        lblKpiSub0.setText("seluruh riwayat");
        lblKpiSub0.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub0.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi0.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle1.setText("DIJADWALKAN");
        lblKpiTitle1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle1.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue1.setText("-");
        lblKpiValue1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lblKpiValue1.setForeground(new java.awt.Color(43, 106, 230));

        lblKpiSub1.setText("menunggu perjalanan");
        lblKpiSub1.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub1.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi1.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle2.setText("DALAM PERJALANAN");
        lblKpiTitle2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle2.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue2.setText("-");
        lblKpiValue2.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lblKpiValue2.setForeground(new java.awt.Color(183, 121, 31));

        lblKpiSub2.setText("sedang berlangsung");
        lblKpiSub2.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub2.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi2.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle3.setText("SELESAI");
        lblKpiTitle3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle3.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue3.setText("-");
        lblKpiValue3.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lblKpiValue3.setForeground(new java.awt.Color(46, 125, 70));

        lblKpiSub3.setText("stok produksi terpotong");
        lblKpiSub3.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub3.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi3.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle4.setText("KENDARAAN TERSEDIA");
        lblKpiTitle4.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle4.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue4.setText("-");
        lblKpiValue4.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lblKpiValue4.setForeground(new java.awt.Color(31, 122, 140));

        lblKpiSub4.setText("siap ditugaskan");
        lblKpiSub4.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub4.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi4.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle5.setText("DRIVER TERSEDIA");
        lblKpiTitle5.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle5.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue5.setText("-");
        lblKpiValue5.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lblKpiValue5.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiSub5.setText("siap ditugaskan");
        lblKpiSub5.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub5.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi5.setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setText("Pengangkutan");
        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));

        lblSubtitle.setText("Pusat pemantauan perjalanan, kendaraan, dan driver");
        lblSubtitle.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblSubtitle.setForeground(new java.awt.Color(103, 121, 143));

        btnAdd.setText("Tambah");
        btnAdd.setFocusPainted(false);
        btnAdd.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setBackground(new java.awt.Color(43, 106, 230));
        btnAdd.addActionListener(this::btnAddActionPerformed);

        btnMulai.setText("Mulai Perjalanan");
        btnMulai.setFocusPainted(false);
        btnMulai.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnMulai.setForeground(new java.awt.Color(255, 255, 255));
        btnMulai.setBackground(new java.awt.Color(26, 43, 66));
        btnMulai.addActionListener(this::btnMulaiActionPerformed);

        btnSelesai.setText("Selesaikan");
        btnSelesai.setFocusPainted(false);
        btnSelesai.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnSelesai.setForeground(new java.awt.Color(255, 255, 255));
        btnSelesai.setBackground(new java.awt.Color(46, 125, 70));
        btnSelesai.addActionListener(this::btnSelesaiActionPerformed);

        btnBatalkan.setText("Batalkan");
        btnBatalkan.setFocusPainted(false);
        btnBatalkan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnBatalkan.setForeground(new java.awt.Color(255, 255, 255));
        btnBatalkan.setBackground(new java.awt.Color(160, 45, 62));
        btnBatalkan.addActionListener(this::btnBatalkanActionPerformed);







        scrollTable.setBackground(new java.awt.Color(255, 255, 255));

        tblData.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        tblData.setRowHeight(28);
        tblData.setGridColor(new java.awt.Color(226, 232, 240));

        lblDetTitle.setText("DETAIL PENGANGKUTAN");
        lblDetTitle.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        lblDetTitle.setForeground(new java.awt.Color(26, 43, 66));

        lblDetHint.setText("Pilih data pada tabel untuk melihat rincian lengkap.");
        lblDetHint.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblDetHint.setForeground(new java.awt.Color(103, 121, 143));

        lblD1.setText("Status: -");
        lblD1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblD1.setForeground(new java.awt.Color(26, 43, 66));

        lblD2.setText("Tanggal: -");
        lblD2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblD2.setForeground(new java.awt.Color(26, 43, 66));

        lblD3.setText("Sumber produksi: -");
        lblD3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblD3.setForeground(new java.awt.Color(26, 43, 66));

        lblD4.setText("Material: -");
        lblD4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblD4.setForeground(new java.awt.Color(26, 43, 66));

        lblD5.setText("Asal: -");
        lblD5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblD5.setForeground(new java.awt.Color(26, 43, 66));

        lblD6.setText("Tujuan: -");
        lblD6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblD6.setForeground(new java.awt.Color(26, 43, 66));

        lblD7.setText("Muatan: -");
        lblD7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblD7.setForeground(new java.awt.Color(26, 43, 66));

        lblD8.setText("Kendaraan: -");
        lblD8.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblD8.setForeground(new java.awt.Color(26, 43, 66));

        lblD9.setText("Plat: -");
        lblD9.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblD9.setForeground(new java.awt.Color(26, 43, 66));

        lblD10.setText("Driver: -");
        lblD10.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblD10.setForeground(new java.awt.Color(26, 43, 66));

        lblD11.setText("Petugas Ops: -");
        lblD11.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblD11.setForeground(new java.awt.Color(26, 43, 66));

        lblD12.setText("Waktu mulai: -");
        lblD12.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblD12.setForeground(new java.awt.Color(26, 43, 66));

        lblD13.setText("Waktu selesai: -");
        lblD13.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblD13.setForeground(new java.awt.Color(26, 43, 66));

        lblD14.setText("Sisa stok produksi: -");
        lblD14.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblD14.setForeground(new java.awt.Color(26, 43, 66));

        pnlDetail.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout pnlFilterLayout = new javax.swing.GroupLayout(pnlFilter);
        pnlFilter.setLayout(pnlFilterLayout);
        pnlFilterLayout.setHorizontalGroup(
            pnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlFilterLayout.createSequentialGroup()
                 .addGap(20, 20, 20)
                 .addComponent(lblCari, 40, 40, 40)
                 .addGap(20, 20, 20)
                 .addComponent(txtCari, 220, 220, 220)
                 .addGap(20, 20, 20)
                 .addComponent(lblStatus, 50, 50, 50)
                 .addGap(20, 20, 20)
                 .addComponent(cmbStatus, 170, 170, 170)
                 .addGap(20, 20, 20)
            )
        );
        pnlFilterLayout.setVerticalGroup(
            pnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlFilterLayout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addGroup(pnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(lblCari, 32, 32, 32)
                  .addComponent(txtCari, 30, 30, 30)
                  .addComponent(lblStatus, 32, 32, 32)
                  .addComponent(cmbStatus, 30, 30, 30)
             )
                 .addGap(16, 16, Short.MAX_VALUE)
            )
        );

        javax.swing.GroupLayout pnlKpi0Layout = new javax.swing.GroupLayout(pnlKpi0);
        pnlKpi0.setLayout(pnlKpi0Layout);
        pnlKpi0Layout.setHorizontalGroup(
            pnlKpi0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi0Layout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addGroup(pnlKpi0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblKpiTitle0, 10, 104, Short.MAX_VALUE)
                  .addComponent(lblKpiValue0, 10, 104, Short.MAX_VALUE)
                  .addComponent(lblKpiSub0, 10, 104, Short.MAX_VALUE)
             )
            )
        );
        pnlKpi0Layout.setVerticalGroup(
            pnlKpi0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi0Layout.createSequentialGroup()
                 .addGap(12, 12, 12)
                 .addComponent(lblKpiTitle0, 14, 14, 14)
                 .addGap(4, 4, 4)
                 .addComponent(lblKpiValue0, 28, 28, 28)
                 .addGap(3, 3, 3)
                 .addComponent(lblKpiSub0, 16, 16, 16)
                 .addGap(12, 12, Short.MAX_VALUE)
            )
        );

        javax.swing.GroupLayout pnlKpi1Layout = new javax.swing.GroupLayout(pnlKpi1);
        pnlKpi1.setLayout(pnlKpi1Layout);
        pnlKpi1Layout.setHorizontalGroup(
            pnlKpi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi1Layout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addGroup(pnlKpi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblKpiTitle1, 10, 104, Short.MAX_VALUE)
                  .addComponent(lblKpiValue1, 10, 104, Short.MAX_VALUE)
                  .addComponent(lblKpiSub1, 10, 104, Short.MAX_VALUE)
             )
            )
        );
        pnlKpi1Layout.setVerticalGroup(
            pnlKpi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi1Layout.createSequentialGroup()
                 .addGap(12, 12, 12)
                 .addComponent(lblKpiTitle1, 14, 14, 14)
                 .addGap(4, 4, 4)
                 .addComponent(lblKpiValue1, 28, 28, 28)
                 .addGap(3, 3, 3)
                 .addComponent(lblKpiSub1, 16, 16, 16)
                 .addGap(12, 12, Short.MAX_VALUE)
            )
        );

        javax.swing.GroupLayout pnlKpi2Layout = new javax.swing.GroupLayout(pnlKpi2);
        pnlKpi2.setLayout(pnlKpi2Layout);
        pnlKpi2Layout.setHorizontalGroup(
            pnlKpi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi2Layout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addGroup(pnlKpi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblKpiTitle2, 10, 104, Short.MAX_VALUE)
                  .addComponent(lblKpiValue2, 10, 104, Short.MAX_VALUE)
                  .addComponent(lblKpiSub2, 10, 104, Short.MAX_VALUE)
             )
            )
        );
        pnlKpi2Layout.setVerticalGroup(
            pnlKpi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi2Layout.createSequentialGroup()
                 .addGap(12, 12, 12)
                 .addComponent(lblKpiTitle2, 14, 14, 14)
                 .addGap(4, 4, 4)
                 .addComponent(lblKpiValue2, 28, 28, 28)
                 .addGap(3, 3, 3)
                 .addComponent(lblKpiSub2, 16, 16, 16)
                 .addGap(12, 12, Short.MAX_VALUE)
            )
        );

        javax.swing.GroupLayout pnlKpi3Layout = new javax.swing.GroupLayout(pnlKpi3);
        pnlKpi3.setLayout(pnlKpi3Layout);
        pnlKpi3Layout.setHorizontalGroup(
            pnlKpi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi3Layout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addGroup(pnlKpi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblKpiTitle3, 10, 104, Short.MAX_VALUE)
                  .addComponent(lblKpiValue3, 10, 104, Short.MAX_VALUE)
                  .addComponent(lblKpiSub3, 10, 104, Short.MAX_VALUE)
             )
            )
        );
        pnlKpi3Layout.setVerticalGroup(
            pnlKpi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi3Layout.createSequentialGroup()
                 .addGap(12, 12, 12)
                 .addComponent(lblKpiTitle3, 14, 14, 14)
                 .addGap(4, 4, 4)
                 .addComponent(lblKpiValue3, 28, 28, 28)
                 .addGap(3, 3, 3)
                 .addComponent(lblKpiSub3, 16, 16, 16)
                 .addGap(12, 12, Short.MAX_VALUE)
            )
        );

        javax.swing.GroupLayout pnlKpi4Layout = new javax.swing.GroupLayout(pnlKpi4);
        pnlKpi4.setLayout(pnlKpi4Layout);
        pnlKpi4Layout.setHorizontalGroup(
            pnlKpi4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi4Layout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addGroup(pnlKpi4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblKpiTitle4, 10, 104, Short.MAX_VALUE)
                  .addComponent(lblKpiValue4, 10, 104, Short.MAX_VALUE)
                  .addComponent(lblKpiSub4, 10, 104, Short.MAX_VALUE)
             )
            )
        );
        pnlKpi4Layout.setVerticalGroup(
            pnlKpi4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi4Layout.createSequentialGroup()
                 .addGap(12, 12, 12)
                 .addComponent(lblKpiTitle4, 14, 14, 14)
                 .addGap(4, 4, 4)
                 .addComponent(lblKpiValue4, 28, 28, 28)
                 .addGap(3, 3, 3)
                 .addComponent(lblKpiSub4, 16, 16, 16)
                 .addGap(12, 12, Short.MAX_VALUE)
            )
        );

        javax.swing.GroupLayout pnlKpi5Layout = new javax.swing.GroupLayout(pnlKpi5);
        pnlKpi5.setLayout(pnlKpi5Layout);
        pnlKpi5Layout.setHorizontalGroup(
            pnlKpi5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi5Layout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addGroup(pnlKpi5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblKpiTitle5, 10, 104, Short.MAX_VALUE)
                  .addComponent(lblKpiValue5, 10, 104, Short.MAX_VALUE)
                  .addComponent(lblKpiSub5, 10, 104, Short.MAX_VALUE)
             )
            )
        );
        pnlKpi5Layout.setVerticalGroup(
            pnlKpi5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi5Layout.createSequentialGroup()
                 .addGap(12, 12, 12)
                 .addComponent(lblKpiTitle5, 14, 14, 14)
                 .addGap(4, 4, 4)
                 .addComponent(lblKpiValue5, 28, 28, 28)
                 .addGap(3, 3, 3)
                 .addComponent(lblKpiSub5, 16, 16, 16)
                 .addGap(12, 12, Short.MAX_VALUE)
            )
        );

        javax.swing.GroupLayout pnlDetailLayout = new javax.swing.GroupLayout(pnlDetail);
        pnlDetail.setLayout(pnlDetailLayout);
        pnlDetailLayout.setHorizontalGroup(
            pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlDetailLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDetTitle, 10, 800, Short.MAX_VALUE)
                        .addComponent(lblDetHint, 10, 800, Short.MAX_VALUE))
                    .addGap(20, 20, 20))
                .addGroup(pnlDetailLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblD1, 10, 400, Short.MAX_VALUE)
                        .addComponent(lblD2, 10, 400, Short.MAX_VALUE)
                        .addComponent(lblD3, 10, 400, Short.MAX_VALUE)
                        .addComponent(lblD4, 10, 400, Short.MAX_VALUE)
                        .addComponent(lblD5, 10, 400, Short.MAX_VALUE)
                        .addComponent(lblD6, 10, 400, Short.MAX_VALUE)
                        .addComponent(lblD7, 10, 400, Short.MAX_VALUE)
                    )
                    .addGap(24, 24, 24)
                    .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblD8, 10, 400, Short.MAX_VALUE)
                        .addComponent(lblD9, 10, 400, Short.MAX_VALUE)
                        .addComponent(lblD10, 10, 400, Short.MAX_VALUE)
                        .addComponent(lblD11, 10, 400, Short.MAX_VALUE)
                        .addComponent(lblD12, 10, 400, Short.MAX_VALUE)
                        .addComponent(lblD13, 10, 400, Short.MAX_VALUE)
                        .addComponent(lblD14, 10, 400, Short.MAX_VALUE)
                    )
                    .addGap(20, 20, 20))
        );
        pnlDetailLayout.setVerticalGroup(
            pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlDetailLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(lblDetTitle, 24, 24, 24)
                    .addGap(4, 4, 4)
                    .addComponent(lblDetHint, 18, 18, 18)
                    .addGap(14, 14, 14)
                    .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblD1, 22, 22, 22)
                        .addComponent(lblD8, 22, 22, 22))
                    .addGap(6, 6, 6)
                    .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblD2, 22, 22, 22)
                        .addComponent(lblD9, 22, 22, 22))
                    .addGap(6, 6, 6)
                    .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblD3, 22, 22, 22)
                        .addComponent(lblD10, 22, 22, 22))
                    .addGap(6, 6, 6)
                    .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblD4, 22, 22, 22)
                        .addComponent(lblD11, 22, 22, 22))
                    .addGap(6, 6, 6)
                    .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblD5, 22, 22, 22)
                        .addComponent(lblD12, 22, 22, 22))
                    .addGap(6, 6, 6)
                    .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblD6, 22, 22, 22)
                        .addComponent(lblD13, 22, 22, 22))
                    .addGap(6, 6, 6)
                    .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblD7, 22, 22, 22)
                        .addComponent(lblD14, 22, 22, 22))
                    .addGap(14, 14, 14))
        );

        scrollTable.setViewportView(tblData);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(lblTitle, 10, 460, Short.MAX_VALUE)
              )
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(lblSubtitle, 10, 460, Short.MAX_VALUE)
              )
             )
                 .addGap(0, 0, Short.MAX_VALUE)
                 .addComponent(btnAdd, 120, 120, 120)
                 .addGap(8, 8, 8)
                 .addComponent(btnMulai, 165, 165, 165)
                 .addGap(8, 8, 8)
                 .addComponent(btnSelesai, 140, 140, 140)
                 .addGap(8, 8, 8)
                 .addComponent(btnBatalkan, 120, 120, 120)
                 .addGap(8, 8, 8)

                 .addGap(24, 24, 24)
            )
                .addGroup(layout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(pnlKpi0, 10, 136, Short.MAX_VALUE)
                   .addGap(8, 8, Short.MAX_VALUE)
                   .addComponent(pnlKpi1, 10, 136, Short.MAX_VALUE)
                   .addGap(8, 8, Short.MAX_VALUE)
                   .addComponent(pnlKpi2, 10, 136, Short.MAX_VALUE)
                   .addGap(8, 8, Short.MAX_VALUE)
                   .addComponent(pnlKpi3, 10, 136, Short.MAX_VALUE)
                   .addGap(8, 8, Short.MAX_VALUE)
                   .addComponent(pnlKpi4, 10, 136, Short.MAX_VALUE)
                   .addGap(8, 8, Short.MAX_VALUE)
                   .addComponent(pnlKpi5, 10, 136, Short.MAX_VALUE)
              )
                  .addGroup(layout.createSequentialGroup()
                   .addGap(12, 12, 12)
                   .addComponent(pnlFilter, 580, 580, 580)
              )
                  .addGroup(layout.createSequentialGroup()
                   .addGap(12, 12, 12)
                   .addComponent(scrollTable, 10, 868, Short.MAX_VALUE)
              )
                  .addGroup(layout.createSequentialGroup()
                   .addGap(12, 12, 12)
                   .addComponent(pnlDetail, 10, 868, Short.MAX_VALUE)
                   .addGap(24, 24, 24)
              )
             )
            )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGroup(layout.createSequentialGroup()
                  .addGap(16, 16, 16)
                  .addComponent(lblTitle, 40, 40, 40)
                  .addGap(2, 2, 2)
                  .addComponent(lblSubtitle, 22, 22, 22)
                  .addGap(12, 12, 12)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addComponent(pnlKpi0, 90, 90, 90)
                   .addComponent(pnlKpi1, 90, 90, 90)
                   .addComponent(pnlKpi2, 90, 90, 90)
                   .addComponent(pnlKpi3, 90, 90, 90)
                   .addComponent(pnlKpi4, 90, 90, 90)
                   .addComponent(pnlKpi5, 90, 90, 90)
              )
                  .addGap(12, 12, 12)
                  .addComponent(pnlFilter, 62, 62, 62)
                  .addGap(12, 12, 12)
                  .addComponent(scrollTable, 260, 260, Short.MAX_VALUE)
                  .addGap(12, 12, 12)
                  .addComponent(pnlDetail, 250, 250, 250)
                  .addGap(16, 16, 16)
             )
                 .addGroup(layout.createSequentialGroup()
                  .addGap(16, 16, 16)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                   .addComponent(btnAdd, 42, 42, 42)
                   .addComponent(btnMulai, 42, 42, 42)
                   .addComponent(btnSelesai, 42, 42, 42)
                   .addComponent(btnBatalkan, 42, 42, 42)

              )
             )
            )
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

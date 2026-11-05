package view;

import config.AppConfig;
import controller.*;
import model.*;
import enums.*;
import java.time.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/** Halaman lokasi tambang dengan filter jenis/status dan soft delete. */
public class LokasiPanel extends javax.swing.JPanel {

    public LokasiPanel() {
        initComponents();
        JButton[] navButtons = {btnAdd, btnEdit, btnDelete, btnRefresh};

for (JButton btn : navButtons) {
    btn.setOpaque(true);
    btn.setContentAreaFilled(true);
    btn.setBorderPainted(false);
}

        cmbJenis.addActionListener(e -> terapkanFilter());
        cmbStatus.addActionListener(e -> terapkanFilter());
        txtCari.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
    public void insertUpdate(javax.swing.event.DocumentEvent e) { terapkanFilter(); }
    public void removeUpdate(javax.swing.event.DocumentEvent e) { terapkanFilter(); }
    public void changedUpdate(javax.swing.event.DocumentEvent e) { terapkanFilter(); }
});
        try { refreshData(); } catch (Exception ex) { FormUtil.error(this, ex); }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblSubtitle = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
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
        lblCari = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        lblJenis = new javax.swing.JLabel();
        cmbJenis = new javax.swing.JComboBox();
        lblStatus = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox();
        pnlFilter = new javax.swing.JPanel();
        scrollTable = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();


        lblTitle.setText("Lokasi Tambang");
        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));

        lblSubtitle.setText("Master lokasi PIT dan stockpile; hapus = soft delete");
        lblSubtitle.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblSubtitle.setForeground(new java.awt.Color(103, 121, 143));

        btnAdd.setText("Tambah Data");
        btnAdd.setFocusPainted(false);
        btnAdd.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setBackground(new java.awt.Color(43, 106, 230));
        btnAdd.addActionListener(this::btnAddActionPerformed);

        btnEdit.setText("Ubah Data");
        btnEdit.setFocusPainted(false);
        btnEdit.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setBackground(new java.awt.Color(26, 43, 66));
        btnEdit.addActionListener(this::btnEditActionPerformed);

        btnDelete.setText("Hapus Data");
        btnDelete.setFocusPainted(false);
        btnDelete.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setBackground(new java.awt.Color(160, 45, 62));
        btnDelete.addActionListener(this::btnDeleteActionPerformed);

        btnRefresh.setText("Muat Ulang");
        btnRefresh.setFocusPainted(false);
        btnRefresh.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setBackground(new java.awt.Color(103, 121, 143));
        btnRefresh.addActionListener(this::btnRefreshActionPerformed);

        lblKpiTitle0.setText("LOKASI TAMBANG");
        lblKpiTitle0.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle0.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue0.setText("-");
        lblKpiValue0.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue0.setForeground(new java.awt.Color(26, 43, 66));

        lblKpiSub0.setText("PIT dan stockpile");
        lblKpiSub0.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub0.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi0.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle1.setText("LOKASI AKTIF");
        lblKpiTitle1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle1.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue1.setText("-");
        lblKpiValue1.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue1.setForeground(new java.awt.Color(46, 125, 70));

        lblKpiSub1.setText("siap dioperasikan");
        lblKpiSub1.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub1.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi1.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle2.setText("DIBATASI / LAINNYA");
        lblKpiTitle2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle2.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue2.setText("-");
        lblKpiValue2.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue2.setForeground(new java.awt.Color(183, 121, 31));

        lblKpiSub2.setText("operasional terbatas");
        lblKpiSub2.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub2.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi2.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle3.setText("PIT");
        lblKpiTitle3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle3.setForeground(new java.awt.Color(103, 121, 143));

        lblKpiValue3.setText("-");
        lblKpiValue3.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        lblKpiValue3.setForeground(new java.awt.Color(31, 122, 140));

        lblKpiSub3.setText("area penambangan");
        lblKpiSub3.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblKpiSub3.setForeground(new java.awt.Color(103, 121, 143));

        pnlKpi3.setBackground(new java.awt.Color(255, 255, 255));

        lblCari.setText("Cari");
        lblCari.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblCari.setForeground(new java.awt.Color(26, 43, 66));

        txtCari.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtCari.setBackground(new java.awt.Color(255, 255, 255));

        lblJenis.setText("Jenis");
        lblJenis.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblJenis.setForeground(new java.awt.Color(26, 43, 66));

        cmbJenis.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        cmbJenis.setBackground(new java.awt.Color(255, 255, 255));
        cmbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Semua Jenis", "PIT", "STOCKPILE"}));


        lblStatus.setText("Status");
        lblStatus.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(26, 43, 66));

        cmbStatus.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        cmbStatus.setBackground(new java.awt.Color(255, 255, 255));
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Semua Status", "AKTIF", "DIBATASI", "DITUTUP_SEMENTARA", "NONAKTIF"}));


        pnlFilter.setBackground(new java.awt.Color(255, 255, 255));

        scrollTable.setBackground(new java.awt.Color(255, 255, 255));

        tblData.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        tblData.setRowHeight(28);
        tblData.setGridColor(new java.awt.Color(226, 232, 240));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Lokasi", "Jenis", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        javax.swing.GroupLayout pnlKpi0Layout = new javax.swing.GroupLayout(pnlKpi0);
        pnlKpi0.setLayout(pnlKpi0Layout);
        pnlKpi0Layout.setHorizontalGroup(
            pnlKpi0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlKpi0Layout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addGroup(pnlKpi0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblKpiTitle0, 10, 176, Short.MAX_VALUE)
                  .addComponent(lblKpiValue0, 10, 176, Short.MAX_VALUE)
                  .addComponent(lblKpiSub0, 10, 176, Short.MAX_VALUE)
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
                  .addComponent(lblKpiTitle1, 10, 176, Short.MAX_VALUE)
                  .addComponent(lblKpiValue1, 10, 176, Short.MAX_VALUE)
                  .addComponent(lblKpiSub1, 10, 176, Short.MAX_VALUE)
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
                  .addComponent(lblKpiTitle2, 10, 176, Short.MAX_VALUE)
                  .addComponent(lblKpiValue2, 10, 176, Short.MAX_VALUE)
                  .addComponent(lblKpiSub2, 10, 176, Short.MAX_VALUE)
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
                  .addComponent(lblKpiTitle3, 10, 176, Short.MAX_VALUE)
                  .addComponent(lblKpiValue3, 10, 176, Short.MAX_VALUE)
                  .addComponent(lblKpiSub3, 10, 176, Short.MAX_VALUE)
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

        javax.swing.GroupLayout pnlFilterLayout = new javax.swing.GroupLayout(pnlFilter);
        pnlFilter.setLayout(pnlFilterLayout);
        pnlFilterLayout.setHorizontalGroup(
            pnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlFilterLayout.createSequentialGroup()
                 .addGap(20, 20, 20)
                 .addComponent(lblCari, 40, 40, 40)
                 .addGap(20, 20, 20)
                 .addComponent(txtCari, 190, 190, 190)
                 .addGap(20, 20, 20)
                 .addComponent(lblJenis, 44, 44, 44)
                 .addGap(20, 20, 20)
                 .addComponent(cmbJenis, 130, 130, 130)
                 .addGap(20, 20, 20)
                 .addComponent(lblStatus, 50, 50, 50)
                 .addGap(20, 20, 20)
                 .addComponent(cmbStatus, 120, 120, 120)
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
                  .addComponent(lblJenis, 32, 32, 32)
                  .addComponent(cmbJenis, 30, 30, 30)
                  .addComponent(lblStatus, 32, 32, 32)
                  .addComponent(cmbStatus, 30, 30, 30)
             )
                 .addGap(16, 16, Short.MAX_VALUE)
            )
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
                 .addComponent(btnAdd, 140, 140, 140)
                 .addGap(8, 8, 8)
                 .addComponent(btnEdit, 120, 120, 120)
                 .addGap(8, 8, 8)
                 .addComponent(btnDelete, 140, 140, 140)
                 .addGap(8, 8, 8)
                 .addComponent(btnRefresh, 130, 130, 130)
                 .addGap(24, 24, 24)
            )
                .addGroup(layout.createSequentialGroup()
                 .addGap(24, 24, 24)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(pnlKpi0, 10, 208, Short.MAX_VALUE)
                   .addGap(12, 12, Short.MAX_VALUE)
                   .addComponent(pnlKpi1, 10, 208, Short.MAX_VALUE)
                   .addGap(12, 12, Short.MAX_VALUE)
                   .addComponent(pnlKpi2, 10, 208, Short.MAX_VALUE)
                   .addGap(12, 12, Short.MAX_VALUE)
                   .addComponent(pnlKpi3, 10, 208, Short.MAX_VALUE)
              )
                  .addGroup(layout.createSequentialGroup()
                   .addGap(12, 12, 12)
                   .addComponent(pnlFilter, 714, 714, 714)
              )
                  .addGroup(layout.createSequentialGroup()
                   .addGap(12, 12, 12)
                   .addComponent(scrollTable, 10, 868, Short.MAX_VALUE)
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
              )
                  .addGap(12, 12, 12)
                  .addComponent(pnlFilter, 62, 62, 62)
                  .addGap(12, 12, 12)
                  .addComponent(scrollTable, 540, 540, Short.MAX_VALUE)
                  .addGap(16, 16, 16)
             )
                 .addGroup(layout.createSequentialGroup()
                  .addGap(16, 16, 16)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                   .addComponent(btnAdd, 42, 42, 42)
                   .addComponent(btnEdit, 42, 42, 42)
                   .addComponent(btnDelete, 42, 42, 42)
                   .addComponent(btnRefresh, 42, 42, 42)
              )
             )
            )
        );
    }// </editor-fold>//GEN-END:initComponents

    private final java.util.List<model.Lokasi> records = new ArrayList<>();

    private javax.swing.table.TableRowSorter<DefaultTableModel> sorter;



    private void refreshData() {

        records.clear();

        records.addAll(AppConfig.getMasterDataController().tampilkanSemuaLokasi());

        DefaultTableModel model = new DefaultTableModel(

            new String[]{"No.", "Lokasi", "Jenis", "Status"}, 0) {

            @Override public boolean isCellEditable(int r, int c) { return false; }

        };

        for (model.Lokasi l : records) {

            model.addRow(new Object[]{model.getRowCount() + 1, l.getNamaLokasi(),

                l.getJenisLokasi(), l.getStatusOperasional()});

        }

        tblData.setModel(model);

        sorter = new javax.swing.table.TableRowSorter<>(model);

        tblData.setRowSorter(sorter);

        tblData.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        FormUtil.nomorUrut(tblData);

        muatKpi();

        terapkanFilter();

    }



    private void muatKpi() {

        int[] k = AppConfig.getMasterDataController().ringkasanLokasi();

        lblKpiValue0.setText(String.valueOf(k[0]));

        lblKpiSub0.setText(k[1] + " PIT \u00b7 " + k[2] + " stockpile");

        lblKpiValue1.setText(String.valueOf(k[3]));

        lblKpiValue2.setText(String.valueOf(k[0] - k[3]));

        lblKpiValue3.setText(String.valueOf(k[1]));

    }



    private void terapkanFilter() {

        if (sorter == null)return;

        java.util.List<javax.swing.RowFilter<Object, Object>> aturan = new ArrayList<>();

        String kata = txtCari.getText().trim();

        if (!kata.isEmpty())aturan.add(javax.swing.RowFilter.regexFilter("(?i)" + java.util.regex.Pattern.quote(kata), 1, 2, 3));

        int pilihJenis = cmbJenis.getSelectedIndex();

        if (pilihJenis > 0)aturan.add(javax.swing.RowFilter.regexFilter("^" + java.util.regex.Pattern.quote(String.valueOf(cmbJenis.getSelectedItem())) + "$", 2));

        int pilihStatus = cmbStatus.getSelectedIndex();

        if (pilihStatus > 0)aturan.add(javax.swing.RowFilter.regexFilter("^" + java.util.regex.Pattern.quote(String.valueOf(cmbStatus.getSelectedItem())) + "$", 3));

        sorter.setRowFilter(aturan.isEmpty() ? null : javax.swing.RowFilter.andFilter(aturan));

    }



    private model.Lokasi selected() {

        int row = tblData.getSelectedRow();

        if (row < 0)throw new IllegalArgumentException("Pilih satu baris data terlebih dahulu.");

        return records.get(tblData.convertRowIndexToModel(row));

    }



    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {

        try { refreshData(); } catch (Exception ex) { FormUtil.error(this, ex); }

    }



    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {

        try {

            LokasiFormFrame f = new LokasiFormFrame();

            f.setVisible(true);

            f.addWindowListener(new java.awt.event.WindowAdapter() {

                @Override public void windowClosed(java.awt.event.WindowEvent e) { if (f.isSaved())refreshData(); }

            });

        } catch (Exception ex) { FormUtil.error(this, ex); }

    }



    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {

        try {

            LokasiFormFrame f = new LokasiFormFrame(selected());

            f.setVisible(true);

            f.addWindowListener(new java.awt.event.WindowAdapter() {

                @Override public void windowClosed(java.awt.event.WindowEvent e) { if (f.isSaved())refreshData(); }

            });

        } catch (Exception ex) { FormUtil.error(this, ex); }

    }



    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {

        try {

            model.Lokasi item = selected();

            if (JOptionPane.showConfirmDialog(this,

                "Hapus lokasi " + item.getNamaLokasi() + "?\nLokasi disembunyikan dari daftar (soft delete); "

                + "riwayat produksi dan monitoring tetap tersimpan.",

                "Konfirmasi Soft Delete", JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION)return;

            AppConfig.getMasterDataController().hapusLokasi(item.getIdLokasi());

            JOptionPane.showMessageDialog(this, "Lokasi dihapus secara lembut (soft delete).");

            refreshData();

        } catch (Exception ex) { FormUtil.error(this, ex); }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JComboBox cmbJenis;
    private javax.swing.JComboBox cmbStatus;
    private javax.swing.JLabel lblCari;
    private javax.swing.JLabel lblJenis;
    private javax.swing.JLabel lblKpiSub0;
    private javax.swing.JLabel lblKpiSub1;
    private javax.swing.JLabel lblKpiSub2;
    private javax.swing.JLabel lblKpiSub3;
    private javax.swing.JLabel lblKpiTitle0;
    private javax.swing.JLabel lblKpiTitle1;
    private javax.swing.JLabel lblKpiTitle2;
    private javax.swing.JLabel lblKpiTitle3;
    private javax.swing.JLabel lblKpiValue0;
    private javax.swing.JLabel lblKpiValue1;
    private javax.swing.JLabel lblKpiValue2;
    private javax.swing.JLabel lblKpiValue3;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlFilter;
    private javax.swing.JPanel pnlKpi0;
    private javax.swing.JPanel pnlKpi1;
    private javax.swing.JPanel pnlKpi2;
    private javax.swing.JPanel pnlKpi3;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtCari;
    // End of variables declaration//GEN-END:variables
}

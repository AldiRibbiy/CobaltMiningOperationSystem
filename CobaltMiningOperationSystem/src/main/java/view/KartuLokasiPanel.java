package view;

import java.util.*;
import javax.swing.*;

/** Kartu katalog lokasi (template GUI Builder) untuk halaman Kondisi Lokasi. */
public class KartuLokasiPanel extends javax.swing.JPanel {

    public KartuLokasiPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlStripe = new javax.swing.JPanel();
        lblNama = new javax.swing.JLabel();
        lblJenis = new javax.swing.JLabel();
        lblStatusOps = new javax.swing.JLabel();
        lblMonitoring = new javax.swing.JLabel();
        lblHasil = new javax.swing.JLabel();
        lblPenanganan = new javax.swing.JLabel();
        lblBadge = new javax.swing.JLabel();


        pnlStripe.setBackground(new java.awt.Color(148, 163, 184));

        lblNama.setText("Nama Lokasi");
        lblNama.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        lblNama.setForeground(new java.awt.Color(26, 43, 66));

        lblJenis.setText("PIT");
        lblJenis.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblJenis.setForeground(new java.awt.Color(255, 255, 255));
        lblJenis.setBackground(new java.awt.Color(43, 106, 230));
        lblJenis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJenis.setOpaque(true);

        lblStatusOps.setText("AKTIF");
        lblStatusOps.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblStatusOps.setForeground(new java.awt.Color(103, 121, 143));

        lblMonitoring.setText("Monitoring terakhir: belum ada");
        lblMonitoring.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblMonitoring.setForeground(new java.awt.Color(103, 121, 143));

        lblHasil.setText("Hasil: belum ada data");
        lblHasil.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        lblHasil.setForeground(new java.awt.Color(26, 43, 66));

        lblPenanganan.setText("Penanganan: -");
        lblPenanganan.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblPenanganan.setForeground(new java.awt.Color(103, 121, 143));

        lblBadge.setText("PERLU TINDAK LANJUT");
        lblBadge.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblBadge.setForeground(new java.awt.Color(255, 255, 255));
        lblBadge.setBackground(new java.awt.Color(160, 45, 62));
        lblBadge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBadge.setOpaque(true);


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                 .addComponent(pnlStripe, 10, 10, 10)
                 .addGap(14, 14, 14)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(lblNama, 10, 300, Short.MAX_VALUE)
                   .addGap(0, 0, Short.MAX_VALUE)
                   .addComponent(lblBadge, 10, 170, 170)
              )
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(lblJenis, 90, 90, 90)
                   .addGap(8, 8, 8)
                   .addComponent(lblStatusOps, 10, 150, Short.MAX_VALUE)
              )
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(lblMonitoring, 10, 470, Short.MAX_VALUE)
              )
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(lblHasil, 10, 470, Short.MAX_VALUE)
              )
                  .addGroup(layout.createSequentialGroup()
                   .addComponent(lblPenanganan, 10, 470, Short.MAX_VALUE)
              )
             )
                 .addGap(14, 14, 14)
            )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                 .addGap(12, 12, 12)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(pnlStripe, 108, 108, Short.MAX_VALUE)
                  .addGroup(layout.createSequentialGroup()
                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNama, 20, 20, 20)
                    .addComponent(lblBadge, 18, 18, 18)
               )
                   .addGap(4, 4, 4)
                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJenis, 18, 18, 18)
                    .addComponent(lblStatusOps, 18, 18, 18)
               )
                   .addGap(5, 5, 5)
                   .addComponent(lblMonitoring, 17, 17, 17)
                   .addGap(3, 3, 3)
                   .addComponent(lblHasil, 18, 18, 18)
                   .addGap(3, 3, 3)
                   .addComponent(lblPenanganan, 15, 15, 15)
              )
             )
                 .addGap(12, 12, 12)
            )
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setData(model.Lokasi lokasi, model.MonitoringLingkungan terakhir) {

        lblNama.setText(lokasi.getNamaLokasi());

        boolean pit = lokasi.getJenisLokasi() == enums.JenisLokasi.PIT;

        lblJenis.setText(pit ? "PIT" : "STOCKPILE");

        lblJenis.setBackground(pit ? new java.awt.Color(43, 106, 230) : new java.awt.Color(31, 122, 140));

        lblStatusOps.setText(String.valueOf(lokasi.getStatusOperasional()));

        if (terakhir == null) {

            lblMonitoring.setText("Monitoring terakhir: belum ada");

            lblHasil.setText("Hasil: belum ada data");

            lblHasil.setForeground(new java.awt.Color(103, 121, 143));

            lblPenanganan.setText("Penanganan: -");

            pnlStripe.setBackground(new java.awt.Color(148, 163, 184));

            lblBadge.setVisible(false);

        } else {

            java.time.format.DateTimeFormatter fmt = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

            lblMonitoring.setText("Monitoring terakhir: "

                + (terakhir.getTanggalMonitoring() == null ? "-" : terakhir.getTanggalMonitoring().format(fmt)));

            boolean peringatan = terakhir.getStatusMonitoring() == enums.StatusMonitoring.PERINGATAN;

            lblHasil.setText("Hasil: " + terakhir.getStatusMonitoring());

            lblHasil.setForeground(peringatan ? new java.awt.Color(160, 45, 62) : new java.awt.Color(46, 125, 70));

            lblPenanganan.setText("Penanganan: " + terakhir.getStatusPenanganan());

            boolean belumSelesai = terakhir.getStatusPenanganan() == enums.StatusPenanganan.BELUM_DITANGANI

                || terakhir.getStatusPenanganan() == enums.StatusPenanganan.DALAM_PENANGANAN;

            pnlStripe.setBackground(peringatan

                ? (belumSelesai ? new java.awt.Color(160, 45, 62) : new java.awt.Color(183, 121, 31))

                : new java.awt.Color(46, 125, 70));

            lblBadge.setVisible(peringatan && belumSelesai);

        }

        revalidate();

        repaint();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBadge;
    private javax.swing.JLabel lblHasil;
    private javax.swing.JLabel lblJenis;
    private javax.swing.JLabel lblMonitoring;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblPenanganan;
    private javax.swing.JLabel lblStatusOps;
    private javax.swing.JPanel pnlStripe;
    // End of variables declaration//GEN-END:variables
}

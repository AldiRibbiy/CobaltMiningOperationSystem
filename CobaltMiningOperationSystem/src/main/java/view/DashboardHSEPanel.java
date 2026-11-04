package view;
import config.AppConfig;
import model.*;
import enums.*;
import java.util.*;
import javax.swing.*;
import org.jfree.chart.JFreeChart;

/** Dashboard Dashboard Petugas HSE - KPI dan grafik dibangun dari data DashboardController. */
public class DashboardHSEPanel extends javax.swing.JPanel {
    public DashboardHSEPanel() {
        initComponents();
        try { muatData(); } catch(Exception ex) { FormUtil.error(this,ex); }
    }

    private void muatData() {
        service.DashboardService.Data d = AppConfig.getDashboardController().hse();

        lblKpiValue0.setText(String.valueOf(d.monitoringTotal));
        lblKpiValue1.setText(String.valueOf(d.monitoringNormal));
        lblKpiValue2.setText(String.valueOf(d.monitoringPeringatan));
        lblKpiValue3.setText(String.valueOf(d.penangananBelum));
        lblKpiValue4.setText(String.valueOf(d.penangananProses));
        lblKpiValue5.setText(String.valueOf(d.penangananSelesai));


        org.jfree.data.general.DefaultPieDataset<String> dsPie = new org.jfree.data.general.DefaultPieDataset<>();
        dsPie.setValue("Normal", d.monitoringNormal);
        dsPie.setValue("Peringatan", d.monitoringPeringatan);

        DashboardCharts.render(pnlChart1, DashboardCharts.pie("Status Monitoring", dsPie));

        if (d.peringatanPerParameter.isEmpty()) {
            DashboardCharts.kosong(pnlChart2, "Belum ada peringatan parameter lingkungan.");
        } else {
            org.jfree.data.category.DefaultCategoryDataset dsBar = new org.jfree.data.category.DefaultCategoryDataset();

            for (java.util.Map.Entry<String, Integer> e : d.peringatanPerParameter.entrySet()) {
                dsBar.addValue(e.getValue(), "Peringatan", e.getKey());
            }
            DashboardCharts.render(pnlChart2, DashboardCharts.bar("Peringatan per Parameter", dsBar));
        }
    }

    static String ton(double nilai) {
        return (Math.round(nilai * 10.0) / 10.0) + " ton";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblHint = new javax.swing.JLabel();
        pnlKpi0 = new javax.swing.JPanel();
        lblKpiTitle0 = new javax.swing.JLabel();
        lblKpiValue0 = new javax.swing.JLabel();
        pnlKpi1 = new javax.swing.JPanel();
        lblKpiTitle1 = new javax.swing.JLabel();
        lblKpiValue1 = new javax.swing.JLabel();
        pnlKpi2 = new javax.swing.JPanel();
        lblKpiTitle2 = new javax.swing.JLabel();
        lblKpiValue2 = new javax.swing.JLabel();
        pnlKpi3 = new javax.swing.JPanel();
        lblKpiTitle3 = new javax.swing.JLabel();
        lblKpiValue3 = new javax.swing.JLabel();
        pnlKpi4 = new javax.swing.JPanel();
        lblKpiTitle4 = new javax.swing.JLabel();
        lblKpiValue4 = new javax.swing.JLabel();
        pnlKpi5 = new javax.swing.JPanel();
        lblKpiTitle5 = new javax.swing.JLabel();
        lblKpiValue5 = new javax.swing.JLabel();
        pnlChart1 = new javax.swing.JPanel();
        pnlChart2 = new javax.swing.JPanel();

        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 23)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(26, 43, 66));
        lblTitle.setText("Dashboard Petugas HSE");

        lblHint.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblHint.setForeground(new java.awt.Color(103, 121, 143));
        lblHint.setText("Kondisi lingkungan, peringatan, dan progres penanganan");

        pnlKpi0.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle0.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle0.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiTitle0.setText("TOTAL MONITORING");

        lblKpiValue0.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        lblKpiValue0.setForeground(new java.awt.Color(26, 43, 66));
        lblKpiValue0.setText("-");

        javax.swing.GroupLayout pnlKpi0Layout = new javax.swing.GroupLayout(pnlKpi0);
        pnlKpi0.setLayout(pnlKpi0Layout);
        pnlKpi0Layout.setHorizontalGroup(
            pnlKpi0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKpi0Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlKpi0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKpiTitle0, 240, 240, 240)
                    .addComponent(lblKpiValue0, 240, 240, 240))
                .addGap(16, 16, 16))
        );
        pnlKpi0Layout.setVerticalGroup(
            pnlKpi0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKpi0Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblKpiTitle0, 16, 16, 16)
                .addGap(4, 4, 4)
                .addComponent(lblKpiValue0, 36, 36, 36)
                .addGap(10, 10, 10))
        );

        pnlKpi1.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle1.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiTitle1.setText("HASIL NORMAL");

        lblKpiValue1.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        lblKpiValue1.setForeground(new java.awt.Color(46, 125, 70));
        lblKpiValue1.setText("-");

        javax.swing.GroupLayout pnlKpi1Layout = new javax.swing.GroupLayout(pnlKpi1);
        pnlKpi1.setLayout(pnlKpi1Layout);
        pnlKpi1Layout.setHorizontalGroup(
            pnlKpi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKpi1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlKpi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKpiTitle1, 240, 240, 240)
                    .addComponent(lblKpiValue1, 240, 240, 240))
                .addGap(16, 16, 16))
        );
        pnlKpi1Layout.setVerticalGroup(
            pnlKpi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKpi1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblKpiTitle1, 16, 16, 16)
                .addGap(4, 4, 4)
                .addComponent(lblKpiValue1, 36, 36, 36)
                .addGap(10, 10, 10))
        );

        pnlKpi2.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle2.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiTitle2.setText("PERINGATAN");

        lblKpiValue2.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        lblKpiValue2.setForeground(new java.awt.Color(160, 45, 62));
        lblKpiValue2.setText("-");

        javax.swing.GroupLayout pnlKpi2Layout = new javax.swing.GroupLayout(pnlKpi2);
        pnlKpi2.setLayout(pnlKpi2Layout);
        pnlKpi2Layout.setHorizontalGroup(
            pnlKpi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKpi2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlKpi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKpiTitle2, 240, 240, 240)
                    .addComponent(lblKpiValue2, 240, 240, 240))
                .addGap(16, 16, 16))
        );
        pnlKpi2Layout.setVerticalGroup(
            pnlKpi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKpi2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblKpiTitle2, 16, 16, 16)
                .addGap(4, 4, 4)
                .addComponent(lblKpiValue2, 36, 36, 36)
                .addGap(10, 10, 10))
        );

        pnlKpi3.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle3.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiTitle3.setText("BELUM DITANGANI");

        lblKpiValue3.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        lblKpiValue3.setForeground(new java.awt.Color(183, 121, 31));
        lblKpiValue3.setText("-");

        javax.swing.GroupLayout pnlKpi3Layout = new javax.swing.GroupLayout(pnlKpi3);
        pnlKpi3.setLayout(pnlKpi3Layout);
        pnlKpi3Layout.setHorizontalGroup(
            pnlKpi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKpi3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlKpi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKpiTitle3, 240, 240, 240)
                    .addComponent(lblKpiValue3, 240, 240, 240))
                .addGap(16, 16, 16))
        );
        pnlKpi3Layout.setVerticalGroup(
            pnlKpi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKpi3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblKpiTitle3, 16, 16, 16)
                .addGap(4, 4, 4)
                .addComponent(lblKpiValue3, 36, 36, 36)
                .addGap(10, 10, 10))
        );

        pnlKpi4.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle4.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle4.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiTitle4.setText("DALAM PENANGANAN");

        lblKpiValue4.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        lblKpiValue4.setForeground(new java.awt.Color(43, 106, 230));
        lblKpiValue4.setText("-");

        javax.swing.GroupLayout pnlKpi4Layout = new javax.swing.GroupLayout(pnlKpi4);
        pnlKpi4.setLayout(pnlKpi4Layout);
        pnlKpi4Layout.setHorizontalGroup(
            pnlKpi4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKpi4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlKpi4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKpiTitle4, 240, 240, 240)
                    .addComponent(lblKpiValue4, 240, 240, 240))
                .addGap(16, 16, 16))
        );
        pnlKpi4Layout.setVerticalGroup(
            pnlKpi4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKpi4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblKpiTitle4, 16, 16, 16)
                .addGap(4, 4, 4)
                .addComponent(lblKpiValue4, 36, 36, 36)
                .addGap(10, 10, 10))
        );

        pnlKpi5.setBackground(new java.awt.Color(255, 255, 255));

        lblKpiTitle5.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblKpiTitle5.setForeground(new java.awt.Color(103, 121, 143));
        lblKpiTitle5.setText("PENANGANAN SELESAI");

        lblKpiValue5.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        lblKpiValue5.setForeground(new java.awt.Color(31, 122, 140));
        lblKpiValue5.setText("-");

        javax.swing.GroupLayout pnlKpi5Layout = new javax.swing.GroupLayout(pnlKpi5);
        pnlKpi5.setLayout(pnlKpi5Layout);
        pnlKpi5Layout.setHorizontalGroup(
            pnlKpi5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKpi5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlKpi5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKpiTitle5, 240, 240, 240)
                    .addComponent(lblKpiValue5, 240, 240, 240))
                .addGap(16, 16, 16))
        );
        pnlKpi5Layout.setVerticalGroup(
            pnlKpi5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKpi5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblKpiTitle5, 16, 16, 16)
                .addGap(4, 4, 4)
                .addComponent(lblKpiValue5, 36, 36, 36)
                .addGap(10, 10, 10))
        );

        pnlChart1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlChart1Layout = new javax.swing.GroupLayout(pnlChart1);
        pnlChart1.setLayout(pnlChart1Layout);
        pnlChart1Layout.setHorizontalGroup(
            pnlChart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );
        pnlChart1Layout.setVerticalGroup(
            pnlChart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pnlChart2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlChart2Layout = new javax.swing.GroupLayout(pnlChart2);
        pnlChart2.setLayout(pnlChart2Layout);
        pnlChart2Layout.setHorizontalGroup(
            pnlChart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );
        pnlChart2Layout.setVerticalGroup(
            pnlChart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, 810, 810, 810)
                    .addComponent(lblHint, 810, 810, 810)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlKpi0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(pnlKpi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(pnlKpi2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlKpi3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(pnlKpi4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(pnlKpi5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlChart1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(pnlChart2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblTitle, 42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(lblHint, 24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(pnlKpi0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(pnlKpi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(pnlKpi2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(pnlKpi3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(pnlKpi4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(pnlKpi5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlChart1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlChart2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblHint;
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
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlChart1;
    private javax.swing.JPanel pnlChart2;
    private javax.swing.JPanel pnlKpi0;
    private javax.swing.JPanel pnlKpi1;
    private javax.swing.JPanel pnlKpi2;
    private javax.swing.JPanel pnlKpi3;
    private javax.swing.JPanel pnlKpi4;
    private javax.swing.JPanel pnlKpi5;
    // End of variables declaration//GEN-END:variables
}

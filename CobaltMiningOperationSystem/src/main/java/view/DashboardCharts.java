package view;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ChartFactory;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author zefrialrizkullah
 */

public final class DashboardCharts {
    private static final Color NAVY = new Color(26, 43, 66);
    private static final Color SLATE = new Color(103, 121, 143);
    private static final Color[] PALET = {
        new Color(43, 106, 230),
        NAVY,
        new Color(46, 125, 70),
        new Color(183, 121, 31),
        new Color(160, 45, 62),
        new Color(31, 122, 140),
        SLATE
    };

    private DashboardCharts() {}

    public static JFreeChart bar(String judul, DefaultCategoryDataset data) {
        JFreeChart chart = ChartFactory.createBarChart(judul, null, null, data,
                PlotOrientation.VERTICAL, false, true, false);
        gaya(chart);

        CategoryPlot plot = chart.getCategoryPlot();

        for (int i = 0;i<PALET.length;i++)plot.getRenderer().setSeriesPaint(i, PALET[i % PALET.length]);
        plot.getRenderer().setDefaultItemLabelFont(new Font("SansSerif", Font.PLAIN, 11));
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinePaint(new Color(226, 232, 240));
        return chart;
    }

    public static JFreeChart pie(String judul, DefaultPieDataset<String> data) {
        JFreeChart chart = ChartFactory.createPieChart(judul, data, true, true, false);
        gaya(chart);
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 11));
        plot.setLegendItemShape(new java.awt.geom.Rectangle2D.Double(-4, -4, 8, 8));
        plot.setShadowXOffset(0);
        plot.setShadowYOffset(0);
        int i = 0;

        for (Object kunci : data.getKeys())plot.setSectionPaint((String) kunci, PALET[i++ % PALET.length]);
        return chart;
    }

    /** Menempatkan grafik ke panel placeholder hasil desain GUI Builder. */
    public static void render(JPanel placeholder, JFreeChart chart) {
        placeholder.removeAll();
        placeholder.setLayout(new java.awt.BorderLayout());
        ChartPanel panel = new ChartPanel(chart);
        panel.setMouseWheelEnabled(true);
        placeholder.add(panel, java.awt.BorderLayout.CENTER);
        placeholder.revalidate();
        placeholder.repaint();
    }

    /** Menampilkan pesan bila belum ada data untuk digambarkan. */
    public static void kosong(JPanel placeholder, String pesan) {
        placeholder.removeAll();
        placeholder.setLayout(new java.awt.BorderLayout());
        javax.swing.JLabel label = new javax.swing.JLabel(pesan, javax.swing.SwingConstants.CENTER);
        label.setForeground(SLATE);
        placeholder.add(label, java.awt.BorderLayout.CENTER);
        placeholder.revalidate();
        placeholder.repaint();
    }

    private static void gaya(JFreeChart chart) {
        chart.setBackgroundPaint(Color.WHITE);
        chart.getTitle().setFont(new Font("SansSerif", Font.BOLD, 13));
        chart.getTitle().setPaint(NAVY);

        if (chart.getLegend() != null) {
            chart.getLegend().setBackgroundPaint(Color.WHITE);
            chart.getLegend().setItemFont(new Font("SansSerif", Font.PLAIN, 11));
        }
    }
}

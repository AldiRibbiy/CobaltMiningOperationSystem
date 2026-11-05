package view;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.ui.TextAnchor;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
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
    private static final Color BLUE = new Color(43, 106, 230);
    private static final Color RED = new Color(160, 45, 62);
    private static final Color[] PALET = {
        BLUE,
        NAVY,
        new Color(46, 125, 70),
        new Color(183, 121, 31),
        RED,
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

    /** Bar chart horizontal: nama kategori lengkap terbaca dan jumlah ditampilkan pada ujung bar. */
    public static JFreeChart barHorizontal(String judul, DefaultCategoryDataset data) {
        JFreeChart chart = ChartFactory.createBarChart(judul, null, null, data,
                PlotOrientation.HORIZONTAL, false, true, false);
        gaya(chart, 15);

        CategoryPlot plot = chart.getCategoryPlot();
        CategoryAxis sumbuKategori = plot.getDomainAxis();
        sumbuKategori.setTickLabelFont(new Font("SansSerif", Font.PLAIN, 13));
        sumbuKategori.setMaximumCategoryLabelWidthRatio(0.85f);
        NumberAxis sumbuNilai = (NumberAxis) plot.getRangeAxis();
        sumbuNilai.setTickLabelFont(new Font("SansSerif", Font.PLAIN, 12));

        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, BLUE);
        renderer.setDefaultItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setDefaultItemLabelsVisible(true);
        renderer.setDefaultItemLabelFont(new Font("SansSerif", Font.BOLD, 12));
        renderer.setDefaultItemLabelPaint(NAVY);
        renderer.setPositiveItemLabelPositionFallback(new org.jfree.chart.labels.ItemLabelPosition(
                org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE3,
                TextAnchor.BASELINE_LEFT));
        renderer.setItemMargin(0.12);
        renderer.setShadowVisible(false);
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinePaint(new Color(226, 232, 240));
        return chart;
    }

    /** Line chart tren berdasarkan waktu dengan titik penanda dan font besar. */
    public static JFreeChart line(String judul, DefaultCategoryDataset data) {
        JFreeChart chart = ChartFactory.createLineChart(judul, null, null, data,
                PlotOrientation.VERTICAL, false, true, false);
        gaya(chart, 15);

        CategoryPlot plot = chart.getCategoryPlot();
        CategoryAxis sumbuKategori = plot.getDomainAxis();
        sumbuKategori.setTickLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        sumbuKategori.setMaximumCategoryLabelWidthRatio(1.2f);
        NumberAxis sumbuNilai = (NumberAxis) plot.getRangeAxis();
        sumbuNilai.setTickLabelFont(new Font("SansSerif", Font.PLAIN, 12));

        LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
        renderer.setDefaultPaint(BLUE);
        renderer.setDefaultStroke(new java.awt.BasicStroke(2.4f));
        renderer.setDefaultShapesVisible(true);
        renderer.setDefaultShapesFilled(true);
        renderer.setSeriesShape(0, new java.awt.geom.Ellipse2D.Double(-3.5, -3.5, 7, 7));
        renderer.setDefaultItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setDefaultItemLabelsVisible(true);
        renderer.setDefaultItemLabelFont(new Font("SansSerif", Font.BOLD, 11));
        renderer.setDefaultItemLabelPaint(NAVY);
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinePaint(new Color(226, 232, 240));
        plot.setDomainGridlinePaint(new Color(226, 232, 240));
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
        gaya(chart, 13);
    }

    private static void gaya(JFreeChart chart, int ukuranJudul) {
        chart.setBackgroundPaint(Color.WHITE);
        if (chart.getTitle() != null) {
            chart.getTitle().setFont(new Font("SansSerif", Font.BOLD, ukuranJudul));
            chart.getTitle().setPaint(NAVY);
        }

        if (chart.getLegend() != null) {
            chart.getLegend().setBackgroundPaint(Color.WHITE);
            chart.getLegend().setItemFont(new Font("SansSerif", Font.PLAIN, 12));
        }
    }
}

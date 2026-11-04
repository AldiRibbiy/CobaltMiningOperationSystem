package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * Kumpulan gaya tampilan bersama C-MOS (font, warna tabel, status navigasi).
 * Seluruh antarmuka tetap dirancang melalui GUI Builder (berkas .form);
 * kelas ini hanya menyatukan properti visual agar konsisten di semua halaman.
 *
 * @author zefrialrizkullah
 */
public final class Ui {
    public static final Color NAVY      = new Color(15, 29, 51);
    public static final Color NAV_REST  = new Color(26, 44, 73);
    public static final Color NAV_ACTIVE = new Color(43, 106, 230);
    public static final Color INK       = new Color(22, 35, 58);
    public static final Color SLATE     = new Color(96, 112, 137);
    public static final Color HEADER_BG = new Color(241, 245, 251);
    public static final Color HEADER_FG = new Color(90, 107, 135);
    public static final Color ALT_ROW   = new Color(247, 250, 253);
    public static final Color SELECTION = new Color(219, 231, 250);

    private Ui() {
    }

    /** Tombol polos satu warna (flat) ala aplikasi modern. */
    public static void flat(JButton... buttons) {
        for (JButton b : buttons) {
            b.setOpaque(true);
            b.setContentAreaFilled(true);
            b.setBorderPainted(false);
            b.setFocusPainted(false);
        }
    }

    /** Sorot menu sidebar yang sedang aktif. */
    public static void navActive(java.util.Map<String, JButton> buttons, String active) {
        for (java.util.Map.Entry<String, JButton> item : buttons.entrySet()) {
            item.getValue().setBackground(item.getKey().equals(active) ? NAV_ACTIVE : NAV_REST);
        }
    }

    /** Tabel data modern: header lembut, garis horizontal halus, baris selang-seling. */
    public static void styleTable(JTable table) {
        table.setRowHeight(30);
        table.setFont(new Font("SansSerif", Font.PLAIN, 12));
        table.setForeground(INK);
        table.setBackground(Color.WHITE);
        table.setGridColor(new Color(237, 241, 247));
        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(false);
        table.setSelectionBackground(SELECTION);
        table.setSelectionForeground(INK);
        table.setAutoCreateRowSorter(true);
        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 38));
        table.getTableHeader().setDefaultRenderer(new HeaderRenderer());
        table.setDefaultRenderer(Object.class, new RowRenderer());
        if (table.getParent() instanceof javax.swing.JViewport) {
            table.getParent().setBackground(Color.WHITE);
        }
    }

    /** Header tabel berwarna lembut dengan teks tegas. */
    private static final class HeaderRenderer extends DefaultTableCellRenderer {
        private HeaderRenderer() {
            setOpaque(true);
            setHorizontalAlignment(LEFT);
            setBorder(BorderFactory.createEmptyBorder(0, 12, 0, 12));
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected,
                boolean focused, int row, int column) {
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);
            setBackground(HEADER_BG);
            setForeground(HEADER_FG);
            setFont(new Font("SansSerif", Font.BOLD, 11));
            return this;
        }
    }

    /** Baris data selang-seling putih / biru sangat muda. */
    private static final class RowRenderer extends DefaultTableCellRenderer {
        private RowRenderer() {
            setOpaque(true);
            setBorder(BorderFactory.createEmptyBorder(0, 12, 0, 12));
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected,
                boolean focused, int row, int column) {
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);
            setHorizontalAlignment(LEFT);
            if (selected) {
                setBackground(SELECTION);
                setForeground(INK);
            } else {
                setBackground(row % 2 == 0 ? Color.WHITE : ALT_ROW);
                setForeground(INK);
            }
            return this;
        }
    }
}

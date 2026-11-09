/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

public class mjt
extends JTable {
    private static final Color DEd = new Color(8235754);
    private static final Color DEe = new Color(0xE0E0E0);
    private static final Color DEf = new Color(0xC0C0C0);
    private static final Color DEg = new Color(0xD9D9D9);
    private static final Color DEh = new Color(3435966);
    private static final Color DEi = new Color(0xD9D9D9);
    private static final Color DEj = new Color(0xACACAC);
    public static final Color DEk = new Color(240, 240, 240);

    public mjt() {
    }

    public mjt(TableModel tableModel) {
        super(tableModel);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        this.a(graphics);
    }

    protected void a(Graphics graphics) {
        int n = this.getRowCount();
        Rectangle rectangle = graphics.getClipBounds();
        int n2 = rectangle.y + rectangle.height;
        if (n * this.rowHeight < n2) {
            for (int i = n; i <= n2 / this.rowHeight; ++i) {
                graphics.setColor(this.aeC(i));
                graphics.fillRect(rectangle.x, i * this.rowHeight, rectangle.width, this.rowHeight);
            }
        }
    }

    @Override
    public boolean getScrollableTracksViewportHeight() {
        if (this.getParent() instanceof JViewport) {
            JViewport jViewport = (JViewport)this.getParent();
            return jViewport.getHeight() > this.getPreferredSize().height;
        }
        return false;
    }

    protected Color aeC(int n) {
        return n % 2 == 0 ? this.eCS() : this.getBackground();
    }

    private Color eCS() {
        return DEk;
    }

    @Override
    public Component prepareRenderer(TableCellRenderer tableCellRenderer, int n, int n2) {
        Component component = super.prepareRenderer(tableCellRenderer, n, n2);
        boolean bl = this.hasFocus();
        boolean bl2 = this.isCellSelected(n, n2);
        if (bl2) {
            component.setBackground(UIManager.getColor("Table.selectionBackground"));
            component.setForeground(UIManager.getColor("Table.selectionForeground"));
        } else {
            component.setBackground(this.aeC(n));
            component.setForeground(UIManager.getColor("Table.foreground"));
        }
        if (component instanceof JComponent) {
            JComponent jComponent = (JComponent)component;
            if (!this.getCellSelectionEnabled() && !this.isEditing()) {
                jComponent.setBorder(null);
            }
            this.a(jComponent, n, n2);
        }
        return component;
    }

    private void a(JComponent jComponent, boolean bl, boolean bl2) {
        Border border = bl ? BorderFactory.createMatteBorder(0, 0, 1, 0, bl2 ? DEd : DEe) : BorderFactory.createEmptyBorder(0, 0, 1, 0);
        if (this.getShowVerticalLines()) {
            Color color = bl2 ? (bl ? DEh : DEg) : (bl ? DEj : DEi);
            MatteBorder matteBorder = BorderFactory.createMatteBorder(0, 0, 0, 1, color);
            border = BorderFactory.createCompoundBorder(border, matteBorder);
        }
        jComponent.setBorder(border);
    }

    private void a(JComponent jComponent, int n, int n2) {
        String string = null;
        if (jComponent.getPreferredSize().width > this.getCellRect((int)n, (int)n2, (boolean)false).width) {
            string = this.getValueAt(n, n2).toString();
        }
        jComponent.setToolTipText(string);
    }

    @Override
    public Point getToolTipLocation(MouseEvent mouseEvent) {
        if (this.getToolTipText(mouseEvent) == null) {
            return null;
        }
        int n = this.rowAtPoint(mouseEvent.getPoint());
        int n2 = this.columnAtPoint(mouseEvent.getPoint());
        if (n == -1 || n2 == -1) {
            return null;
        }
        return this.getCellRect(n, n2, false).getLocation();
    }

    @Override
    protected void configureEnclosingScrollPane() {
        super.configureEnclosingScrollPane();
    }
}


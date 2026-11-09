/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class mpe
extends JLabel
implements TableCellRenderer {
    public mpe() {
        this.setOpaque(true);
        this.setBackground(Color.WHITE);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
        if (bl) {
            this.setBackground(Color.BLUE);
            this.setForeground(Color.WHITE);
            this.setText(((JLabel)object).getText());
        } else {
            this.setBackground(Color.WHITE);
            this.setForeground(Color.BLACK);
            this.setText(((JLabel)object).getText());
        }
        return this;
    }
}


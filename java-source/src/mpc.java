/*
 * Decompiled with CFR.
 */
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class mpc
extends JComboBox
implements TableCellRenderer {
    public mpc(String[] stringArray) {
        super(stringArray);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
        if (bl) {
            this.setForeground(jTable.getSelectionForeground());
            super.setBackground(jTable.getSelectionBackground());
        } else {
            this.setForeground(jTable.getForeground());
            this.setBackground(jTable.getBackground());
        }
        this.setSelectedItem(object);
        return this;
    }
}


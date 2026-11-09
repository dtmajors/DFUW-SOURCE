/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 */
import java.awt.Component;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class mlm
extends JTable {
    private lfn ga = lfn.eqw();
    private mlg DJa = null;
    private DefaultCellEditor DJb = new DefaultCellEditor(new JCheckBox());
    private aux DEC = null;

    public mlm() {
    }

    public mlm(mlg mlg2) {
        super(mlg2);
        this.DJa = mlg2;
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    public void cp(List list) {
        this.DJa.co(list);
    }

    @Override
    public TableCellEditor getCellEditor(int n, int n2) {
        if (n2 == 0) {
            return this.DJb;
        }
        return super.getCellEditor(n, n2);
    }

    public TableCellRenderer eEh() {
        DefaultTableCellRenderer defaultTableCellRenderer = new DefaultTableCellRenderer(this){
            final /* synthetic */ mlm DJc;
            {
                this.DJc = mlm2;
            }

            public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
                if (n2 == 0) {
                    if (object instanceof JCheckBox) {
                        JCheckBox jCheckBox = (JCheckBox)object;
                        return jCheckBox;
                    }
                    if (object instanceof Boolean) {
                        lfn.b(5, ".getTableCellRendererComponent()", "boolean... madness!");
                    }
                }
                return super.getTableCellRendererComponent(jTable, object, bl, bl2, n, n2);
            }
        };
        return defaultTableCellRenderer;
    }
}


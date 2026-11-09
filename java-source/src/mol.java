/*
 * Decompiled with CFR.
 */
import java.awt.Component;
import java.awt.Insets;
import java.util.Hashtable;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class mol
extends JButton
implements TableCellRenderer {
    public static final int NONE = 0;
    public static final int DOWN = 1;
    public static final int UP = 2;
    int DSI = -1;
    Hashtable DSJ = new Hashtable();
    JButton DSK;
    JButton DSL;

    public mol() {
        this.setMargin(new Insets(0, 0, 0, 0));
        this.setHorizontalTextPosition(2);
        this.setIcon(new moj());
        this.DSK = new JButton();
        this.DSK.setMargin(new Insets(0, 0, 0, 0));
        this.DSK.setHorizontalTextPosition(2);
        this.DSK.setIcon(new moi(1, false, false));
        this.DSK.setPressedIcon(new moi(1, false, true));
        this.DSL = new JButton();
        this.DSL.setMargin(new Insets(0, 0, 0, 0));
        this.DSL.setHorizontalTextPosition(2);
        this.DSL.setIcon(new moi(0, false, false));
        this.DSL.setPressedIcon(new moi(0, false, true));
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
        JButton jButton = this;
        Object v = this.DSJ.get(new Integer(n2));
        if (v != null) {
            jButton = (Integer)v == 1 ? this.DSK : this.DSL;
        }
        jButton.setText(object == null ? "" : object.toString());
        boolean bl3 = n2 == this.DSI;
        jButton.getModel().setPressed(bl3);
        jButton.getModel().setArmed(bl3);
        return jButton;
    }

    public void afb(int n) {
        this.DSI = n;
    }

    public void afc(int n) {
        if (n < 0) {
            return;
        }
        Integer n2 = null;
        Object v = this.DSJ.get(new Integer(n));
        n2 = v == null ? new Integer(1) : ((Integer)v == 1 ? new Integer(2) : new Integer(1));
        this.DSJ.clear();
        this.DSJ.put(new Integer(n), n2);
    }

    public int getState(int n) {
        Object v = this.DSJ.get(new Integer(n));
        int n2 = v == null ? 0 : ((Integer)v == 1 ? 1 : 2);
        return n2;
    }
}


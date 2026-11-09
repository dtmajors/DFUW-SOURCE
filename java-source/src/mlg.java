/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.table.AbstractTableModel;

public class mlg
extends AbstractTableModel {
    private List fu = null;
    private final String[] DIf = new String[]{"Bones"};
    private final int DIg = this.DIf.length;

    public mlg(List list) {
        this.fu = list;
    }

    public void ae(int n, String string) {
        if (n >= 0 && n < this.DIf.length) {
            this.DIf[n] = string;
        }
    }

    @Override
    public boolean isCellEditable(int n, int n2) {
        switch (n2) {
            case 0: {
                return true;
            }
        }
        return false;
    }

    public void co(List list) {
        this.fu = list;
    }

    @Override
    public int getRowCount() {
        if (this.fu != null) {
            return this.fu.size();
        }
        return 0;
    }

    @Override
    public int getColumnCount() {
        return this.DIg;
    }

    public void a(lbz lbz2) {
        this.fu.add(lbz2);
        this.fireTableDataChanged();
    }

    public lbz aeK(int n) {
        int n2 = n;
        lbz lbz2 = null;
        if (n2 >= 0 && n2 < this.fu.size()) {
            lbz2 = (lbz)this.fu.get(n2);
        }
        return lbz2;
    }

    public boolean aeL(int n) {
        lbz lbz2 = this.aeK(n);
        if (lbz2 != null) {
            this.fu.remove(lbz2);
            this.fireTableDataChanged();
            return true;
        }
        return false;
    }

    @Override
    public Object getValueAt(int n, int n2) {
        lbz lbz2 = this.aeK(n);
        if (lbz2 == null) {
            return "Refresh table!";
        }
        switch (n2) {
            case 0: {
                JCheckBox jCheckBox = new JCheckBox(lbz2.emu(), lbz2.emt());
                jCheckBox.setBackground(Color.WHITE);
                return jCheckBox;
            }
        }
        return null;
    }

    @Override
    public void setValueAt(Object object, int n, int n2) {
        lbz lbz2 = this.aeK(n);
        if (lbz2 == null) {
            return;
        }
        switch (n2) {
            case 0: {
                if (!(object instanceof Boolean)) break;
                if (lbz2.emt()) {
                    lbz2.yh(false);
                } else {
                    lbz2.yh(true);
                }
                this.fireTableDataChanged();
                break;
            }
        }
    }

    @Override
    public String getColumnName(int n) {
        return this.DIf[n];
    }
}


/*
 * Decompiled with CFR.
 */
import java.util.List;

public class mlv
extends mom {
    private List fu = null;
    private final String[] DIf = new String[]{"Set Name", "Type", "TimePerUnit"};
    private final int DIg = this.DIf.length;

    public mlv() {
    }

    public mlv(List list) {
        this.fu = list;
    }

    public void co(List list) {
        this.fu = list;
    }

    public Class getColumnClass(int n) {
        switch (n) {
            case 1: {
                return Integer.class;
            }
            case 2: {
                return Double.class;
            }
        }
        return String.class;
    }

    @Override
    public boolean isCellEditable(int n, int n2) {
        switch (n2) {
            default: 
        }
        return false;
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

    public void c(lkd lkd2) {
        this.fu.add(lkd2);
        this.fireTableDataChanged();
    }

    public lkd aeO(int n) {
        int n2 = n;
        if (this.DSM != null && n < this.DSM.length) {
            n2 = this.DSM[n];
        }
        if (n2 < this.fu.size()) {
            lkd lkd2 = (lkd)this.fu.get(n2);
            return lkd2;
        }
        return null;
    }

    public boolean aeL(int n) {
        lkd lkd2 = this.aeO(n);
        if (lkd2 != null) {
            this.fu.remove(lkd2);
            this.fireTableDataChanged();
            return true;
        }
        return false;
    }

    @Override
    public Object getValueAt(int n, int n2) {
        lkd lkd2 = this.aeO(n);
        if (lkd2 != null) {
            switch (n2) {
                case 0: {
                    return lkd2.dZF();
                }
                case 1: {
                    return new Integer(lkd2.dZn());
                }
                case 2: {
                    return new Double(lkd2.dZo());
                }
            }
            lfn.b(4, this.getClass().getName(), "Default case for Type[" + n2 + "] called. Ops?");
            return null;
        }
        return "[null]";
    }

    @Override
    public String getColumnName(int n) {
        return this.DIf[n];
    }
}


/*
 * Decompiled with CFR.
 */
import java.util.List;

public class mln
extends mom {
    private List fu = null;
    private final String[] DIf = new String[]{"Name", "ID", "Duration"};
    private final int DIg = this.DIf.length;

    public mln() {
    }

    public mln(List list) {
        this.fu = list;
    }

    public Class getColumnClass(int n) {
        switch (n) {
            case 1: {
                return Integer.class;
            }
            case 2: {
                return Float.class;
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

    public void b(lkl lkl2) {
        this.fu.add(lkl2);
        this.fireTableDataChanged();
    }

    public lkl aeN(int n) {
        int n2 = n;
        if (this.DSM != null && n < this.DSM.length) {
            n2 = this.DSM[n];
        }
        if (n2 < this.fu.size()) {
            lkl lkl2 = (lkl)this.fu.get(n2);
            return lkl2;
        }
        return null;
    }

    public boolean aeL(int n) {
        lkl lkl2 = this.aeN(n);
        if (lkl2 != null) {
            this.fu.remove(lkl2);
            this.fireTableDataChanged();
            return true;
        }
        return false;
    }

    @Override
    public Object getValueAt(int n, int n2) {
        lkl lkl2 = this.aeN(n);
        if (lkl2 != null) {
            switch (n2) {
                case 0: {
                    return lkl2.dZF();
                }
                case 1: {
                    return new Integer(lkl2.etH());
                }
                case 2: {
                    return new Float(lkl2.Bw());
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


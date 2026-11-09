/*
 * Decompiled with CFR.
 */
import java.util.List;

public class mmc
extends mom {
    private List fu = null;
    private final String[] DIf = new String[]{"Ref. Pose", "This Set's Bones"};
    private final int DIg = this.DIf.length;

    public mmc() {
    }

    public mmc(List list) {
        this.fu = list;
    }

    public Class getColumnClass(int n) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int n, int n2) {
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

    public void a(mmb mmb2) {
        this.fu.add(mmb2);
        this.fireTableDataChanged();
    }

    public mmb aeP(int n) {
        int n2 = n;
        if (this.DSM != null && n < this.DSM.length) {
            n2 = this.DSM[n];
        }
        if (n2 < this.fu.size()) {
            mmb mmb2 = (mmb)this.fu.get(n2);
            return mmb2;
        }
        return null;
    }

    public boolean aeL(int n) {
        mmb mmb2 = this.aeP(n);
        if (mmb2 != null) {
            this.fu.remove(mmb2);
            this.fireTableDataChanged();
            return true;
        }
        return false;
    }

    @Override
    public Object getValueAt(int n, int n2) {
        mmb mmb2 = this.aeP(n);
        if (mmb2 != null) {
            switch (n2) {
                case 0: {
                    return mmb2.eFi();
                }
                case 1: {
                    return mmb2.eFj();
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


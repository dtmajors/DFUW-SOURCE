/*
 * Decompiled with CFR.
 */
import java.util.List;

public class mwe
extends mom {
    private lfn ga = lfn.eqw();
    private List fu = null;
    private final String[] DIf = new String[]{"Filename"};
    private final int DIg = this.DIf.length;

    public mwe() {
    }

    public mwe(List list) {
        this.fu = list;
    }

    public Class getColumnClass(int n) {
        switch (n) {
            default: 
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

    public void ac(jrw jrw2) {
        this.fu.add(jrw2);
        this.fireTableDataChanged();
    }

    public jrw afO(int n) {
        int n2 = n;
        if (this.DSM != null && n < this.DSM.length && n >= 0) {
            n2 = this.DSM[n];
        }
        jrw jrw2 = null;
        if (n2 >= 0 && n2 < this.fu.size()) {
            jrw2 = (jrw)this.fu.get(n2);
        }
        return jrw2;
    }

    public boolean aeL(int n) {
        jrw jrw2 = this.afO(n);
        if (jrw2 != null) {
            this.fu.remove(jrw2);
            this.fireTableDataChanged();
            return true;
        }
        return false;
    }

    @Override
    public Object getValueAt(int n, int n2) {
        jrw jrw2 = this.afO(n);
        if (jrw2 == null) {
            return "Refresh table!";
        }
        switch (n2) {
            case 0: {
                return jrw2.getName();
            }
        }
        lfn.b(4, this.getClass().getName(), "Default case for Type[" + n2 + "] called. Ops?");
        return null;
    }

    @Override
    public String getColumnName(int n) {
        return this.DIf[n];
    }
}


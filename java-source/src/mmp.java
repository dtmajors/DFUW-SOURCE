/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lkv
 */
import java.util.List;

public class mmp
extends mom {
    private lfn ga = lfn.eqw();
    private List fu = null;
    private final String[] DIf = new String[]{"Name", "From State", "To State", "Reversable"};
    private final int DIg = this.DIf.length;
    private lks dQT;

    public mmp() {
    }

    public mmp(List list, lks lks2) {
        this.dQT = lks2;
        this.fu = list;
    }

    public void cs(List list) {
        this.fu = list;
    }

    public void e(lks lks2) {
        this.dQT = lks2;
    }

    public Class getColumnClass(int n) {
        switch (n) {
            case 3: {
                return Boolean.class;
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

    public void d(lky lky2) {
        this.fu.add(lky2);
        this.fireTableDataChanged();
    }

    public lky aeU(int n) {
        int n2 = n;
        if (this.DSM != null && n < this.DSM.length) {
            n2 = this.DSM[n];
        }
        if (n2 < this.fu.size()) {
            lky lky2 = (lky)this.fu.get(n2);
            return lky2;
        }
        return null;
    }

    public boolean aeL(int n) {
        lky lky2 = this.aeU(n);
        if (lky2 != null) {
            this.fu.remove(lky2);
            this.fireTableDataChanged();
            return true;
        }
        return false;
    }

    @Override
    public Object getValueAt(int n, int n2) {
        lky lky2 = this.aeU(n);
        if (lky2 != null) {
            switch (n2) {
                case 0: {
                    return lky2.getName();
                }
                case 1: {
                    return lkv.adr((int)lky2.euu());
                }
                case 2: {
                    return lkv.adr((int)lky2.euv());
                }
                case 3: {
                    return lky2.euw();
                }
            }
            lfn.b(4, this.getClass().getName(), "Default case for Type[" + n2 + "] called. Error?");
            return null;
        }
        return "[null]";
    }

    @Override
    public String getColumnName(int n) {
        return this.DIf[n];
    }
}


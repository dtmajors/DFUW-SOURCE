/*
 * Decompiled with CFR.
 */
import java.util.List;

public class mmm
extends mom {
    private List fu = null;
    private final String[] DIf = new String[]{"Nr (ID)", "SetNr", "Speed", "Weight", "Position", "Priority", "Enabled"};
    private final int DIg = this.DIf.length;

    public mmm() {
    }

    public mmm(List list) {
        this.fu = list;
    }

    public void cr(List list) {
        this.fu = list;
    }

    public Class getColumnClass(int n) {
        switch (n) {
            case 0: 
            case 5: {
                return Integer.class;
            }
            case 2: 
            case 3: {
                return Float.class;
            }
            case 4: {
                return Double.class;
            }
            case 6: {
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

    public void e(lkw lkw2) {
        this.fu.add(lkw2);
        this.fireTableDataChanged();
    }

    public lkw aeT(int n) {
        int n2 = n;
        if (this.DSM != null && n < this.DSM.length) {
            n2 = this.DSM[n];
        }
        if (n2 < this.fu.size()) {
            lkw lkw2 = (lkw)this.fu.get(n2);
            return lkw2;
        }
        return null;
    }

    public boolean aeL(int n) {
        lkw lkw2 = this.aeT(n);
        if (lkw2 != null) {
            this.fu.remove(lkw2);
            this.fireTableDataChanged();
            return true;
        }
        return false;
    }

    @Override
    public Object getValueAt(int n, int n2) {
        lkw lkw2 = this.aeT(n);
        if (lkw2 != null) {
            switch (n2) {
                case 0: {
                    return new Integer(lkw2.bEU());
                }
                case 1: {
                    return lkw2.dZF();
                }
                case 2: {
                    return new Float(lkw2.bEX());
                }
                case 3: {
                    return new Float(lkw2.bEY());
                }
                case 4: {
                    return new Double(lkw2.bEZ());
                }
                case 5: {
                    return new Integer(lkw2.bES());
                }
                case 6: {
                    return new Boolean(lkw2.bEW());
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


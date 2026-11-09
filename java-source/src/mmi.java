/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lkv
 */
import java.util.List;

public class mmi
extends mom {
    private List fu = null;
    private final String[] DIf = new String[]{"Name", "ID", "Partial", "Loop", "Duration", "Stop @Pos", "Disable Partial", "Fallback", "SetName"};
    private int[] DMT = new int[]{180, 40, 40, 40, 55, 75, 86, 60, 180};
    private final int DIg = this.DIf.length;

    public mmi() {
        if (this.DIf.length != this.DMT.length) assert (false) : "Column count must be the same as columwidth count! ";
    }

    public mmi(List list) {
        this.fu = list;
    }

    public void cp(List list) {
        this.fu = list;
    }

    public Class getColumnClass(int n) {
        switch (n) {
            case 1: {
                return Integer.class;
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 7: {
                return Boolean.class;
            }
            case 4: {
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

    public void e(lkr lkr2) {
        this.fu.add(lkr2);
        this.fireTableDataChanged();
    }

    public lkr aeS(int n) {
        int n2 = n;
        if (this.DSM != null && n < this.DSM.length) {
            n2 = this.DSM[n];
        }
        if (n2 < this.fu.size()) {
            lkr lkr2 = (lkr)this.fu.get(n2);
            return lkr2;
        }
        lfn.b(5, this.getClass().getSimpleName(), "getObjectAt() : Could not find Object at Row[" + n + "], rowIndex[" + n2 + "]");
        return null;
    }

    public boolean aeL(int n) {
        lkr lkr2 = this.aeS(n);
        if (lkr2 != null) {
            this.fu.remove(lkr2);
            this.fireTableDataChanged();
            return true;
        }
        return false;
    }

    @Override
    public Object getValueAt(int n, int n2) {
        lkr lkr2 = this.aeS(n);
        if (lkr2 != null) {
            switch (n2) {
                case 0: {
                    return lkv.adr((int)(lkr2.etO() & 0xFFFF));
                }
                case 1: {
                    return new Integer(lkr2.etO());
                }
                case 2: {
                    return lkr2.isPartial();
                }
                case 3: {
                    return lkr2.isLooping();
                }
                case 4: {
                    return new Float(lkr2.etP());
                }
                case 5: {
                    return lkr2.etY();
                }
                case 6: {
                    return lkr2.etR();
                }
                case 7: {
                    return lkr2.eub();
                }
                case 8: {
                    return lkr2.getSetName();
                }
            }
            lfn.b(4, this.getClass().getName(), "Default case for Type[" + n2 + "] called. Ops?");
            return null;
        }
        switch (n2) {
            case 0: {
                return "[UKNOWN STATE]";
            }
        }
        lfn.b(4, this.getClass().getName(), "Default case for Type[" + n2 + "] called. Ops?");
        return null;
    }

    @Override
    public String getColumnName(int n) {
        return this.DIf[n];
    }

    public int[] eFw() {
        return this.DMT;
    }
}


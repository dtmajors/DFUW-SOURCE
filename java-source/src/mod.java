/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.util.List;
import javax.swing.ImageIcon;

public class mod
extends mom {
    private List fu = null;
    private final String[] DIf = new String[]{"Filename", "Weight(%)", "Weight(%)", "Min Dist.(m)", "Rnd.Rotate (Rad)", "col", "Preview"};

    public mod() {
    }

    public mod(List list) {
        this.fu = list;
    }

    public Class getColumnClass(int n) {
        switch (n) {
            case 0: {
                return String.class;
            }
            case 2: {
                return Integer.class;
            }
            case 5: {
                return Color.class;
            }
            case 6: {
                return ImageIcon.class;
            }
        }
        return Float.class;
    }

    @Override
    public boolean isCellEditable(int n, int n2) {
        switch (n2) {
            case 1: 
            case 2: {
                return true;
            }
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
        return this.DIf.length;
    }

    public void b(mof mof2) {
        this.fu.add(mof2);
        this.fireTableDataChanged();
    }

    public mof aeY(int n) {
        int n2 = n;
        if (this.DSM != null && n < this.DSM.length) {
            n2 = this.DSM[n];
        }
        mof mof2 = (mof)this.fu.get(n2);
        return mof2;
    }

    public boolean aeL(int n) {
        mof mof2 = this.aeY(n);
        if (mof2 == null) {
            return false;
        }
        this.fu.remove(mof2);
        this.fireTableRowsDeleted(n, n);
        return true;
    }

    @Override
    public void setValueAt(Object object, int n, int n2) {
        mof mof2 = this.aeY(n);
        if (mof2 == null) {
            lfn.b(5, "SFObjectScatterTableModel", "setValueAt() No object at row = " + n);
            return;
        }
        switch (n2) {
            case 1: {
                assert (object instanceof Integer) : "Wrong Type: " + object.getClass().getSimpleName();
                mof2.afa((Integer)object);
                lfn.b(0, this.getClass().getSimpleName(), "setValueAt() weighting % = " + mof2.eHt());
                break;
            }
            case 2: {
                assert (object instanceof Integer) : "Wrong Type: " + object.getClass().getSimpleName();
                mof2.afa((Integer)object);
                lfn.b(0, this.getClass().getSimpleName(), "setValueAt() weighting % = " + mof2.eHt());
                this.fireTableDataChanged();
                break;
            }
            default: {
                lfn.b(4, this.getClass().getName(), "SetValue not supported for Type[" + n2 + "] called. Ops?");
                return;
            }
        }
    }

    @Override
    public Object getValueAt(int n, int n2) {
        mof mof2 = this.aeY(n);
        switch (n2) {
            case 0: {
                return mof2.eHq();
            }
            case 1: {
                return new Float(mof2.eHt());
            }
            case 2: {
                return new Integer(mof2.eHt());
            }
            case 3: {
                return new Float(mof2.eHr());
            }
            case 4: {
                return new Float(mof2.eHp());
            }
            case 5: {
                return mof2.eHs();
            }
            case 6: {
                return mof2.eHv();
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


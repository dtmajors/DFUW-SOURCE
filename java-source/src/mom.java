/*
 * Decompiled with CFR.
 */
import javax.swing.table.DefaultTableModel;

public class mom
extends DefaultTableModel {
    protected int[] DSM;
    protected mon DSN;
    protected int DSO = 0;
    protected boolean mCB = false;

    @Override
    public Object getValueAt(int n, int n2) {
        int n3 = n;
        if (this.DSM != null) {
            n3 = this.DSM[n];
        }
        return super.getValueAt(n3, n2);
    }

    @Override
    public void setValueAt(Object object, int n, int n2) {
        int n3 = n;
        if (this.DSM != null) {
            n3 = this.DSM[n];
        }
        super.setValueAt(object, n3, n2);
    }

    public void eHE() {
        this.aq(this.DSO, this.mCB);
    }

    public void aq(int n, boolean bl) {
        this.DSO = n;
        this.mCB = bl;
        if (this.DSN == null) {
            this.DSN = new mon(this);
        }
        this.DSN.ar(n, bl);
        this.fireTableDataChanged();
    }

    public int[] eHF() {
        int n = this.getRowCount();
        if (this.DSM != null && this.DSM.length == n) {
            return this.DSM;
        }
        this.DSM = new int[n];
        for (int i = 0; i < n; ++i) {
            this.DSM[i] = i;
        }
        return this.DSM;
    }
}


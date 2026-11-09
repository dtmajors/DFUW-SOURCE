/*
 * Decompiled with CFR.
 */
import javax.swing.JTable;

public class mmy
extends JTable {
    private mmi DOg = null;

    public mmy() {
    }

    public mmy(mmi mmi2) {
        super(mmi2);
        this.DOg = mmi2;
    }

    public lkr eFT() {
        lfn.b(0, this.getClass().getName(), "Getting selected object!");
        return this.DOg.aeS(this.getSelectedRow());
    }

    public mmi eFU() {
        return (mmi)this.getModel();
    }
}


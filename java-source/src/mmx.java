/*
 * Decompiled with CFR.
 */
import javax.swing.JTable;

public class mmx
extends JTable {
    private lfn ga = lfn.eqw();
    private mmd DOf = null;

    public mmx() {
    }

    public mmx(mmd mmd2) {
        super(mmd2);
        this.DOf = mmd2;
    }

    public lkl eFS() {
        return this.DOf.aeN(this.getSelectedRow());
    }
}


/*
 * Decompiled with CFR.
 */
import javax.swing.JTable;

public class mll
extends JTable {
    private mli DIZ = null;

    public mll() {
    }

    public mll(mli mli2) {
        super(mli2);
        this.DIZ = mli2;
    }

    public String eEg() {
        lfn.b(0, this.getClass().getName(), "Getting selected object!");
        return this.DIZ.aeM(this.getSelectedRow());
    }
}


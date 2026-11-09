/*
 * Decompiled with CFR.
 */
import java.awt.dnd.DropTarget;
import javax.swing.JTable;

public class mwb
extends JTable
implements mxy {
    private mwe EON = null;

    public mwb() {
    }

    public mwb(mwe mwe2) {
        super(mwe2);
        this.EON = mwe2;
        myc myc2 = new myc();
        new DropTarget(this, 1, myc2, true);
    }

    @Override
    public void a(String string, double d2, double d3) {
        lfn.b(0, this.getClass().getName(), "dropString called with String: " + string);
        jrw jrw2 = new jrw(string);
        this.EON.ac(jrw2);
    }

    public jrw eQO() {
        lfn.b(0, this.getClass().getName(), "Getting selected object!");
        return this.EON.afO(this.getSelectedRow());
    }
}


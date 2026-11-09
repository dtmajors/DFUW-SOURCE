/*
 * Decompiled with CFR.
 */
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;

public class mkf
extends JList
implements mxy {
    mkg DFj;
    String DFk = null;
    mjx DFl = null;

    public mkf(ListModel listModel) {
        super(listModel);
    }

    public mkf(Object[] objectArray) {
        super(objectArray);
    }

    public mkf(Vector vector) {
        super(vector);
    }

    public mkf() {
    }

    @Override
    public void a(String string, double d2, double d3) {
        lfn.b(0, this.getClass().getName(), "dropString called with String: " + string);
        if (string.contains("\n")) {
            StringTokenizer stringTokenizer = new StringTokenizer(string, "\n");
            while (stringTokenizer.hasMoreElements()) {
                this.Cj(stringTokenizer.nextToken());
            }
        } else {
            this.Cj(string);
        }
    }

    private void Cj(String string) {
        if (this.DFk == null) {
            this.Ck(string);
        } else if ((string = string.toLowerCase()).endsWith(this.DFk)) {
            this.Ck(string);
        } else {
            lfn.b(3, this.getClass().getName(), "addFromDrop() : The String [" + string + "] doesnt end with [" + this.DFk + "]. Not dropped.");
        }
    }

    private void Ck(String string) {
        if (this.DFl != null) {
            string = this.DFl.Ce(string);
        }
        if (string != null) {
            ((DefaultListModel)this.getModel()).addElement(string);
        }
    }

    public final mkg eDl() {
        return this.DFj;
    }

    public final void a(mkg mkg2) {
        this.DFj = mkg2;
    }

    public final String eDm() {
        return this.DFk;
    }

    public final void Cl(String string) {
        this.DFk = string.toLowerCase();
    }

    public final mjx eDn() {
        return this.DFl;
    }

    public final void a(mjx mjx2) {
        this.DFl = mjx2;
    }
}


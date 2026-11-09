/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  dta
 *  dtc
 *  eg
 */
import java.util.Vector;

public class nad {
    private static nad EXU = new nad();
    private Vector<a> EXV = new Vector();
    private int EXW = -1;
    private eg DSv = null;
    private boolean bdP = false;
    private aux DEC = null;

    public void b(eg eg2) {
        this.DSv = eg2;
    }

    public void r(aux aux2) {
        this.DEC = aux2;
    }

    public static nad eUa() {
        return EXU;
    }

    public void ut(ldv ldv2) {
        for (int i = 0; i < this.EXV.size(); ++i) {
            this.EXV.get(i).uw(ldv2);
        }
    }

    public void aw(ldv ldv2, ldv ldv3) {
        if (ldv2 == null || ldv3 == null) {
            return;
        }
        if (this.bdP) {
            return;
        }
        this.eUc();
        this.a(new e(this, ldv2, ldv3));
        lfn.b(0, "SFUndoManager", "adding action " + this.EXV.lastElement() + " at " + (this.EXV.size() - 1));
        ++this.EXW;
    }

    public void uu(ldv ldv2) {
        if (this.bdP) {
            return;
        }
        this.eUc();
        this.a(new c(this, ldv2));
        lfn.b(0, "SFUndoManager", "adding action " + this.EXV.lastElement() + " at " + (this.EXV.size() - 1));
        ++this.EXW;
    }

    public void eUb() {
        if (this.bdP) {
            return;
        }
        this.eUc();
        this.a(new b(this));
        lfn.b(0, "SFUndoManager", "adding action " + this.EXV.lastElement() + " at " + (this.EXV.size() - 1));
        ++this.EXW;
    }

    public void uv(ldv ldv2) {
        if (this.bdP) {
            return;
        }
        this.eUc();
        this.a(new d(this, ldv2));
        lfn.b(0, "SFUndoManager", "adding action " + this.EXV.lastElement() + " at " + (this.EXV.size() - 1));
        ++this.EXW;
    }

    private void eUc() {
        int n2 = this.EXV.size() - this.EXW - 1;
        for (int i = 0; i < n2; ++i) {
            this.EXV.remove(this.EXW + 1);
        }
        if (this.EXW > -1) {
            this.EXV.get(this.EXW).eUg();
        }
    }

    public void undo() {
        if (this.EXW == -1) {
            return;
        }
        lfn.b(0, "SFUndoManager", "undoing operation " + this.EXW + "/" + this.EXV.size() + " " + this.EXV.get(this.EXW));
        this.eUd();
        this.EXV.get(this.EXW).eUg();
        this.EXV.get(this.EXW).eUf();
        this.eUe();
        --this.EXW;
    }

    private void a(a a2) {
        this.EXV.add(a2);
        if (this.EXV.size() > 1000) {
            this.EXV.remove(0);
            --this.EXW;
        }
    }

    public void redo() {
        ++this.EXW;
        if (this.EXW >= this.EXV.size()) {
            --this.EXW;
            return;
        }
        lfn.b(0, "SFUndoManager", "REdoing operation " + this.EXW + "/" + this.EXV.size() + " " + this.EXV.get(this.EXW));
        this.eUd();
        this.EXV.get(this.EXW).perform();
        this.eUe();
    }

    private void eUd() {
        this.bdP = true;
    }

    private void eUe() {
        this.bdP = false;
    }

    private dtc bzt() {
        return ((dta)this.DSv.getMessageDelegator()).bzt();
    }

    static /* synthetic */ dtc a(nad nad2) {
        return nad2.bzt();
    }

    static /* synthetic */ aux b(nad nad2) {
        return nad2.DEC;
    }

    static /* synthetic */ eg c(nad nad2) {
        return nad2.DSv;
    }
}


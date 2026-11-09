/*
 * Decompiled with CFR.
 */
import java.util.List;

public abstract class dwx
extends btk {
    private dvh hfD = null;
    private dwf hfw = null;
    private List<dwy> fyQ = null;

    protected dvh bDN() {
        return this.hfD;
    }

    protected dwf bDO() {
        return this.hfw;
    }

    protected dwx(dvh dvh2, dwf dwf2) {
        this.hfD = dvh2;
        this.hfw = dwf2;
        this.fyQ = lcn.emA();
    }

    public abstract void sO();

    protected void bDP() {
        if (!this.fyQ.isEmpty()) {
            for (dwy dwy2 : this.fyQ) {
                dwy2.b(this);
            }
        }
        this.fyQ.clear();
        this.hfD = null;
    }

    protected void bDQ() {
        if (!this.fyQ.isEmpty()) {
            for (dwy dwy2 : this.fyQ) {
                dwy2.c(this);
            }
        }
        this.fyQ.clear();
        this.hfD = null;
    }

    public void a(dwy dwy2) {
        if (dwy2 == null) {
            return;
        }
        if (!this.fyQ.contains(dwy2)) {
            this.fyQ.add(dwy2);
        }
    }

    public void b(dwy dwy2) {
        if (dwy2 == null) {
            return;
        }
        this.fyQ.remove(dwy2);
    }
}


/*
 * Decompiled with CFR.
 */
public abstract class ged
extends geh {
    public ldv doP = null;
    public ldv ehv = null;
    public ldv ehw = null;
    public boolean dsK = false;
    public boolean bhI = false;

    private ged() {
        super(768);
    }

    ged(int n) {
        super(n);
    }

    public ldv aSO() {
        return this.doP;
    }

    public void kX(ldv ldv2) {
        this.doP = ldv2;
    }

    public ldv bUk() {
        return this.ehv;
    }

    public void qj(ldv ldv2) {
        this.ehv = ldv2;
    }

    public ldv bUl() {
        return this.ehw;
    }

    public void qk(ldv ldv2) {
        this.ehw = ldv2;
    }

    public boolean bUm() {
        return this.dsK;
    }

    public void lQ(boolean bl) {
        this.dsK = bl;
    }

    public boolean bUn() {
        return this.bhI;
    }

    public void aH(boolean bl) {
        this.bhI = bl;
    }
}


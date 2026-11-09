/*
 * Decompiled with CFR.
 */
public abstract class klp
extends khd {
    protected ldv gWL = null;
    protected boolean dsK = false;

    klp() {
    }

    public void a(klp klp2) {
        this.gWL = klp2.gWL;
        this.dsK = klp2.dsK;
        super.d(klp2);
    }

    public ldv bSr() {
        return this.gWL;
    }

    public void pV(ldv ldv2) {
        this.gWL = ldv2;
    }

    public boolean bUm() {
        return this.dsK;
    }

    public void lQ(boolean bl) {
        this.dsK = bl;
    }
}


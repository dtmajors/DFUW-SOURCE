/*
 * Decompiled with CFR.
 */
public abstract class brm {
    protected ldv GUID = null;
    protected brs dIK = null;
    private ldv aXR = null;

    public final ldv getGUID() {
        return this.GUID;
    }

    public final void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }

    public final brs avT() {
        return this.dIK;
    }

    public final void c(brs brs2) {
        this.dIK = brs2;
    }

    public final ldv AV() {
        return this.aXR;
    }

    public final void cJ(ldv ldv2) {
        this.aXR = ldv2;
    }

    public boolean auf() {
        return true;
    }

    public abstract brm aue();

    public final ldv AW() {
        assert (this.dIK != null);
        if (this.dIK.awn() == null) {
            return null;
        }
        return this.dIK.awn().awo().getGUID();
    }

    public final ldv avU() {
        assert (this.dIK != null);
        brs brs2 = this.dIK.awn();
        while (brs2.awn() != null) {
            brs2 = brs2.awn();
        }
        return brs2.awo().getGUID();
    }

    public String toString() {
        return this.getClass().getSimpleName() + ": GUID=" + this.GUID;
    }
}


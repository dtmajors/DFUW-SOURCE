/*
 * Decompiled with CFR.
 */
public class ept
extends eqr {
    private ldv cAw = null;
    private int iuO = bbs.Recruit.ordinal();

    public ldv abB() {
        return this.cAw;
    }

    public void gx(ldv ldv2) {
        this.cAw = ldv2;
    }

    public bbs bIQ() {
        return bbs.getValueByOrdinal(this.iuO);
    }

    public void d(bbs bbs2) {
        this.iuO = bbs2 == null ? this.iuO : bbs2.ordinal();
    }

    ept() {
        super(32014, 775);
    }
}


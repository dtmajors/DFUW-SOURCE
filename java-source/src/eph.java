/*
 * Decompiled with CFR.
 */
public class eph
extends eqr {
    private ldv aEF = null;
    private int iwC = cla.eHn.ordinal();

    public ldv afl() {
        return this.aEF;
    }

    public void fx(ldv ldv2) {
        this.aEF = ldv2;
    }

    public cla bKs() {
        return cla.getValueByOrdinal(this.iwC);
    }

    public void e(cla cla2) {
        this.iwC = cla2 == null ? this.iwC : cla2.ordinal();
    }

    eph() {
        super(32027, 1033);
    }
}


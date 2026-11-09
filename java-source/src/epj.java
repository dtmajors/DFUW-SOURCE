/*
 * Decompiled with CFR.
 */
public class epj
extends eqr {
    private ldv aEF = null;
    private int iwD = ayx.cCr.ordinal();

    public ldv afl() {
        return this.aEF;
    }

    public void fx(ldv ldv2) {
        this.aEF = ldv2;
    }

    public ayx bKt() {
        return ayx.getValueByOrdinal(this.iwD);
    }

    public void f(ayx ayx2) {
        this.iwD = ayx2 == null ? this.iwD : ayx2.ordinal();
    }

    epj() {
        super(32063, 1038);
    }
}


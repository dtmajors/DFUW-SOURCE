/*
 * Decompiled with CFR.
 */
public class eoz
extends eqr {
    private ldv aEF = null;
    private int iwu = ayx.cCr.ordinal();

    public ldv afl() {
        return this.aEF;
    }

    public void fx(ldv ldv2) {
        this.aEF = ldv2;
    }

    public ayx bKk() {
        return ayx.getValueByOrdinal(this.iwu);
    }

    public void e(ayx ayx2) {
        this.iwu = ayx2 == null ? this.iwu : ayx2.ordinal();
    }

    eoz() {
        super(32028, 1034);
    }
}


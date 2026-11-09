/*
 * Decompiled with CFR.
 */
public class epg
extends eqr {
    private ldv aEF = null;
    private int iwB = azf.cEa.ordinal();

    public ldv afl() {
        return this.aEF;
    }

    public void fx(ldv ldv2) {
        this.aEF = ldv2;
    }

    public azf bKr() {
        return azf.getValueByOrdinal(this.iwB);
    }

    public void d(azf azf2) {
        this.iwB = azf2 == null ? this.iwB : azf2.ordinal();
    }

    epg() {
        super(32029, 1035);
    }
}


/*
 * Decompiled with CFR.
 */
public class eqn
extends eqr {
    private ldv aES = null;
    private int aEU = bcr.cXg.ordinal();
    private int aEV = bcr.cXg.ordinal();

    public ldv alD() {
        return this.aES;
    }

    public void pk(ldv ldv2) {
        this.aES = ldv2;
    }

    public bcr ali() {
        return bcr.getValueByOrdinal(this.aEU);
    }

    public void a(bcr bcr2) {
        this.aEU = bcr2 == null ? this.aEU : bcr2.ordinal();
    }

    public bcr alj() {
        return bcr.getValueByOrdinal(this.aEV);
    }

    public void b(bcr bcr2) {
        this.aEV = bcr2 == null ? this.aEV : bcr2.ordinal();
    }

    eqn() {
        super(32031, 1539);
    }
}


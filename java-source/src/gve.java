/*
 * Decompiled with CFR.
 */
public class gve
extends gux {
    private ldv ade = null;
    private ldv aES = null;
    private int jst = bcr.cXg.ordinal();

    public ldv iG() {
        return this.ade;
    }

    public void ch(ldv ldv2) {
        this.ade = ldv2;
    }

    public ldv alD() {
        return this.aES;
    }

    public void pk(ldv ldv2) {
        this.aES = ldv2;
    }

    public bcr bYf() {
        return bcr.getValueByOrdinal(this.jst);
    }

    public void f(bcr bcr2) {
        this.jst = bcr2 == null ? this.jst : bcr2.ordinal();
    }

    gve() {
        super(32278);
    }
}


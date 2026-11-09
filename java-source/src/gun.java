/*
 * Decompiled with CFR.
 */
public class gun
extends gux {
    private ldv ade = null;
    private ldv aES = null;
    private int jsf = bcr.cXg.ordinal();

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

    public bcr bXT() {
        return bcr.getValueByOrdinal(this.jsf);
    }

    public void e(bcr bcr2) {
        this.jsf = bcr2 == null ? this.jsf : bcr2.ordinal();
    }

    gun() {
        super(32268);
    }
}


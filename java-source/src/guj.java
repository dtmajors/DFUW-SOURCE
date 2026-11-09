/*
 * Decompiled with CFR.
 */
public class guj
extends gux {
    private ldv ade = null;
    private ldv aES = null;
    private int ivI = bcr.cXg.ordinal();

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

    public bcr bJA() {
        return bcr.getValueByOrdinal(this.ivI);
    }

    public void d(bcr bcr2) {
        this.ivI = bcr2 == null ? this.ivI : bcr2.ordinal();
    }

    guj() {
        super(32264);
    }
}


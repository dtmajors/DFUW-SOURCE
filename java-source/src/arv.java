/*
 * Decompiled with CFR.
 */
public class arv
implements asm {
    private final ldv ade;
    private final ldv bRN;
    private final ldv Ri;
    private boolean bRL = false;

    public arv(ldv ldv2, ldv ldv3, ldv ldv4, boolean bl) {
        this.ade = ldv2;
        this.Ri = ldv3;
        this.bRN = ldv4;
        this.bRL = bl;
    }

    public ldv iG() {
        return this.ade;
    }

    public ldv Sq() {
        return this.bRN;
    }

    public ldv qd() {
        return this.Ri;
    }

    public boolean lh() {
        return this.bRL;
    }

    @Override
    public boolean St() {
        return this.Ri != null && this.bRN != null;
    }
}


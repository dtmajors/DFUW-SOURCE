/*
 * Decompiled with CFR.
 */
public class mii {
    private ldv dbT;
    private ldv nTN;

    mii() {
    }

    public ldv cag() {
        return this.dbT;
    }

    public void qP(ldv ldv2) {
        this.dbT = ldv2;
    }

    public ldv dRt() {
        return this.nTN;
    }

    public void tk(ldv ldv2) {
        this.nTN = ldv2;
    }

    public String toString() {
        return this.getClass().getSimpleName() + ": RequestGuid=" + this.dbT + ", RequestingObjectGuid=" + this.nTN;
    }
}


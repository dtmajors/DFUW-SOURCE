/*
 * Decompiled with CFR.
 */
public class ksk
extends ksl {
    protected ldv Rs = null;
    protected String pYD = null;

    ksk() {
        this.pZN = 8;
    }

    public ldv oq() {
        return this.Rs;
    }

    public void hC(ldv ldv2) {
        this.Rs = ldv2;
    }

    public String egn() {
        return this.pYD;
    }

    public void xc(String string) {
        this.pYD = string;
    }

    public String toString() {
        return "SFResourceRequest: XMLFilename=[" + this.pYD + "], ObjectGUID=[" + this.Rs + "]";
    }
}


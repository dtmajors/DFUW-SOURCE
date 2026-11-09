/*
 * Decompiled with CFR.
 */
public enum hxi {
    lke,
    lkf,
    lkg,
    lkh,
    lki,
    lkj,
    lkk,
    lkl,
    lkm,
    lkn,
    lko;


    public int cDs() {
        return 1 << this.ordinal();
    }

    public boolean isSet(int n) {
        return (this.cDs() & n) != 0;
    }
}


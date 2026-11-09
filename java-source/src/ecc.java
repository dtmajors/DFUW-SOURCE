/*
 * Decompiled with CFR.
 */
public class ecc
extends ecm {
    private int[] ilp;
    private ldv[] ilq;

    public ecc() {
        super(3087);
    }

    public int[] bFr() {
        return this.ilp;
    }

    public void P(int[] nArray) {
        this.ilp = nArray;
    }

    public ldv[] bFs() {
        return this.ilq;
    }

    public void i(ldv[] ldvArray) {
        this.ilq = ldvArray;
    }
}


/*
 * Decompiled with CFR.
 */
public abstract class eqr
extends dxq {
    private int ija = 0;

    public int bKQ() {
        return 0xFFF00 & this.ija;
    }

    public int bHc() {
        return this.ija;
    }

    @Deprecated
    private eqr() {
        super(32000);
    }

    protected eqr(int n, int n2) {
        super(n);
        this.ija = n2;
    }
}


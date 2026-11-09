/*
 * Decompiled with CFR.
 */
public abstract class cwk
extends cwg {
    protected boolean fEU = false;
    protected ldv fEV = null;
    protected ldv fEW = null;
    protected String fEX = null;
    protected boolean fEY = false;
    protected int atf = -1;
    protected ljq atc = null;
    protected int[] fEZ = null;
    protected long fFa = 0L;

    public cwk(int n, boolean bl) {
        super(cwf.b.fEE, n, bl);
    }

    public final boolean bdy() {
        return this.fEU;
    }

    public final ldv bdz() {
        return this.fEW;
    }

    public final void gZ(boolean bl) {
        this.fEY = bl;
    }

    public final void ru(int n) {
        this.atf = n;
    }

    public final void Y(ljq ljq2) {
        this.atc = ljq2;
    }

    public final void I(int[] nArray) {
        this.fEZ = nArray;
    }

    public final void W(long l2) {
        this.fFa = l2;
    }

    public final boolean bdA() {
        return this.fEY;
    }
}


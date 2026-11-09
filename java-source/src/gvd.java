/*
 * Decompiled with CFR.
 */
public class gvd
extends gux {
    public static final int jso = 0;
    public static final int jsp = 1;
    public static final int jsq = 2;
    private int[] bqd = null;
    private int[] iIY = null;
    private ljq Position = null;
    private float jsr = 0.0f;
    private int aFF = 0;
    private int jss = bqy.dFL.ordinal();

    public int[] CX() {
        return this.bqd;
    }

    public void g(int[] nArray) {
        this.bqd = nArray;
    }

    public int[] bSu() {
        return this.iIY;
    }

    public void al(int[] nArray) {
        this.iIY = nArray;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public float bYc() {
        return this.jsr;
    }

    public void jI(float f) {
        this.jsr = f;
    }

    public int bYd() {
        return this.aFF;
    }

    public void KK(int n) {
        this.aFF = n < 0 || n > 2 ? 0 : n;
    }

    public bqy bYe() {
        return bqy.getValueByOrdinal(this.jss);
    }

    public void c(bqy bqy2) {
        this.jss = bqy2 == null ? this.jss : bqy2.ordinal();
    }

    gvd() {
        super(32279);
    }

    public void cg(int n, int n2) {
        this.bqd = new int[]{n};
        this.iIY = new int[]{n2};
    }

    public void d(int[] nArray, int[] nArray2) {
        this.bqd = nArray;
        this.iIY = nArray2;
    }

    public void jJ(float f) {
        this.aFF = 1;
        this.jsr = f;
    }

    public void jK(float f) {
        this.aFF = 2;
        this.jsr = f;
    }
}


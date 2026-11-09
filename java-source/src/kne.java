/*
 * Decompiled with CFR.
 */
public class kne
extends knm {
    public static final int jfl = 1;
    public static final int pPn = 2;
    public static final int ikF = 4;
    public static final int jfm = 8;
    public static final int jfn = 16;
    public static final int jfo = 32;
    public static final int jfp = 64;
    public static final int jfq = 128;
    public static final int jfr = 256;
    public static final int jfs = 512;
    private int pPH = 0;
    private boolean pPI = false;
    private ljq biE = null;
    private lgl biF = null;

    kne() {
        this.Jv(776);
    }

    public boolean edV() {
        return this.pPI;
    }

    public void xo(boolean bl) {
        this.pPI = bl;
    }

    public int edW() {
        return this.pPH;
    }

    public void Zo(int n) {
        this.pPH = n;
    }

    public ljq getDeltaPos() {
        return this.biE;
    }

    public void setDeltaPos(ljq ljq2) {
        this.biE = ljq2;
    }

    public lgl getDeltaRot() {
        return this.biF;
    }

    public void setDeltaRot(lgl lgl2) {
        this.biF = lgl2;
    }
}


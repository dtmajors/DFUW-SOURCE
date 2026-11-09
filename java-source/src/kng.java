/*
 * Decompiled with CFR.
 */
public class kng
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
    private int pPK = 0;
    private ljq biE = null;
    private lgl biF = null;

    kng() {
        this.Jv(777);
    }

    public int edY() {
        return this.pPK;
    }

    public void Zq(int n) {
        this.pPK = n;
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


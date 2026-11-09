/*
 * Decompiled with CFR.
 */
public class knf
extends knm {
    public static final int jfl = 1;
    public static final int pPn = 2;
    public static final int jfr = 4;
    public static final int jfs = 8;
    private int pPJ;
    private ljq biE;
    private lgl biF;

    knf() {
        this.Jv(781);
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

    public int edX() {
        return this.pPJ;
    }

    public void Zp(int n) {
        this.pPJ = n;
    }
}


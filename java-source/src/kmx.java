/*
 * Decompiled with CFR.
 */
public class kmx
extends knm {
    public static final int jfl = 1;
    public static final int pPl = 8;
    public static final int pPm = 16;
    public static final int pPn = 32;
    public static final int pPo = 64;
    public static final int pPp = 128;
    public static final int pPq = 256;
    public static final int pPr = 512;
    public static final int jfr = 1024;
    public static final int jfs = 2048;
    public int pPs = 0;
    public float pPt = -1.0f;
    public int pPu = -1;
    public ljq biE = null;
    public ljq dOB = null;

    kmx() {
        this.Jv(773);
    }

    public int edL() {
        return this.pPs;
    }

    public void Zi(int n) {
        this.pPs = n;
    }

    public float edM() {
        return this.pPt;
    }

    public void mD(float f) {
        this.pPt = f;
    }

    public int edN() {
        return this.pPu;
    }

    public void Zj(int n) {
        this.pPu = n;
    }

    public ljq getDeltaPos() {
        return this.biE;
    }

    public void setDeltaPos(ljq ljq2) {
        this.biE = ljq2;
    }

    public ljq edO() {
        return this.dOB;
    }

    public void dt(ljq ljq2) {
        this.dOB = ljq2;
    }
}


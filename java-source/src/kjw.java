/*
 * Decompiled with CFR.
 */
public class kjw
extends kjx {
    public static final int iGU = 1;
    public static final int iGV = 2;
    public static final int iGW = 4;
    public static final int iGX = 8;
    public static final int iGY = 16;
    public static final int iGZ = 32;
    private int iHa;
    private float gSx;
    private float bWP;
    private ljq mx;
    private float gSy;
    private float fXV;

    kjw() {
        this.Jv(1802);
        this.mx = new ljq();
    }

    public int bNO() {
        return this.iHa;
    }

    public void Ga(int n) {
        this.iHa = n;
    }

    public float bvp() {
        return this.gSx;
    }

    public void hA(float f) {
        this.gSx = f;
    }

    public float bnS() {
        return this.bWP;
    }

    public void gL(float f) {
        this.bWP = f;
    }

    public float bvq() {
        return this.gSy;
    }

    public void hB(float f) {
        this.gSy = f;
    }

    public float getSpeed() {
        return this.fXV;
    }

    public void setSpeed(float f) {
        this.fXV = f;
    }

    public ljq bpa() {
        return this.mx;
    }

    public void cq(ljq ljq2) {
        this.mx = ljq2;
    }
}


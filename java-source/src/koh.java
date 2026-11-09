/*
 * Decompiled with CFR.
 */
public class koh
extends kpo {
    public static final int pSW = 1;
    public static final int pSX = 2;
    private int pSY;
    private boolean iSt;
    private ljq Position;
    private float Radius;
    private float pSZ = 15.0f;

    public koh() {
        this.Jv(524);
    }

    public int eeH() {
        return this.pSY;
    }

    public void ZQ(int n) {
        this.pSY = n;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public float getRadius() {
        return this.Radius;
    }

    public void setRadius(float f) {
        this.Radius = f;
    }

    public boolean bQI() {
        return this.iSt;
    }

    public void lm(boolean bl) {
        this.iSt = bl;
    }

    public float eeI() {
        return this.pSZ;
    }

    public void mE(float f) {
        this.pSZ = f;
    }
}


/*
 * Decompiled with CFR.
 */
public class khn
extends kht {
    public static final int plP = 1;
    public static final int pxL = 2;
    private int pxM;
    private boolean Active = true;
    private ljq pxN = null;
    private float pxO = 1.0f;

    khn() {
        this.Jv(3084);
    }

    public int dZq() {
        return this.pxM;
    }

    public void Xt(int n) {
        this.pxM = n;
    }

    public boolean djZ() {
        return this.Active;
    }

    public void setActive(boolean bl) {
        this.Active = bl;
    }

    public ljq dZr() {
        return this.pxN;
    }

    public void df(ljq ljq2) {
        this.pxN = ljq2;
    }

    public float dZs() {
        return this.pxO;
    }

    public void lU(float f) {
        this.pxO = f;
    }
}


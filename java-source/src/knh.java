/*
 * Decompiled with CFR.
 */
public class knh
extends knm {
    public static final int jfl = 0;
    public static final int pPn = 1;
    public static final int pPA = 2;
    private int pPL = 0;
    private boolean avz = true;
    private ljq biE = new ljq(0.0f, 0.0f, 0.0f);
    private lgl biF = new lgl(0.0f, 0.0f, 0.0f, 1.0f);

    knh() {
        this.Jv(784);
    }

    public boolean isEnabled() {
        return this.avz;
    }

    public void setEnabled(boolean bl) {
        this.avz = bl;
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

    public int edZ() {
        return this.pPL;
    }

    public void Zr(int n) {
        this.pPL = n;
    }
}


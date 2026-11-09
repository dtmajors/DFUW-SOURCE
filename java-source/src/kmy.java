/*
 * Decompiled with CFR.
 */
public class kmy
extends knm {
    public static final int jfl = 1;
    public static final int pPn = 2;
    public static final int jfr = 4;
    public static final int jfs = 8;
    public static final int plP = 16;
    private int pPv = 0;
    private boolean Active = false;
    private ljq biE = null;
    private lgl biF = null;

    kmy() {
        this.Jv(772);
    }

    public int edP() {
        return this.pPv;
    }

    public void Zk(int n) {
        this.pPv = n;
    }

    public boolean isActive() {
        return this.Active;
    }

    public void setActive(boolean bl) {
        this.Active = bl;
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


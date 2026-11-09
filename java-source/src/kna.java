/*
 * Decompiled with CFR.
 */
public class kna
extends knm {
    public static final int jfl = 1;
    public static final int pPn = 2;
    public static final int pPw = 4;
    public static final int pPx = 8;
    public static final int pPy = 16;
    public static final int pPz = 32;
    public static final int pPA = 64;
    private int pPB = 0;
    private ljq pPC = null;
    private lgl pPD = null;
    private boolean avz = true;

    kna() {
        this.Jv(774);
    }

    public int edQ() {
        return this.pPB;
    }

    public void Zl(int n) {
        this.pPB = n;
    }

    public boolean isEnabled() {
        return this.avz;
    }

    public void setEnabled(boolean bl) {
        this.avz = bl;
    }

    public ljq edR() {
        return this.pPC;
    }

    public void du(ljq ljq2) {
        this.pPC = ljq2;
    }

    public lgl edS() {
        return this.pPD;
    }

    public void U(lgl lgl2) {
        this.pPD = lgl2;
    }
}


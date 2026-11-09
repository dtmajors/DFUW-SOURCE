/*
 * Decompiled with CFR.
 */
public class knk
extends knm {
    public static final int jfl = 1;
    public static final int pPn = 2;
    public static final int pPO = 4;
    private int pPP = 0;
    private String tt = null;
    private ljq bhi = null;
    private ljq pPQ = null;
    private boolean gAY = false;

    knk() {
        this.Jv(780);
    }

    @Override
    public String toString() {
        return "Trans= " + this.bhi + ", Dir= " + this.pPQ + ", Type= " + this.pPP;
    }

    public String getFrameName() {
        return this.tt;
    }

    public void setFrameName(String string) {
        this.tt = string;
    }

    public ljq eea() {
        return this.pPQ;
    }

    public void dv(ljq ljq2) {
        this.pPQ = ljq2;
    }

    public ljq bUp() {
        return this.bhi;
    }

    public void aj(ljq ljq2) {
        this.bhi = ljq2;
    }

    public int eeb() {
        return this.pPP;
    }

    public void Zs(int n) {
        this.pPP = n;
    }

    public boolean isModifyDirection() {
        return this.gAY;
    }

    public void setModifyDirection(boolean bl) {
        this.gAY = bl;
    }
}


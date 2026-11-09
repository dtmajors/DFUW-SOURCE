/*
 * Decompiled with CFR.
 */
public class lgc {
    private int rlF = -1;
    private lcq dMT = null;

    public lgc() {
    }

    public lgc(int n, lcq lcq2) {
        this.rlF = n;
        this.dMT = lcq2;
    }

    public lcq getColor() {
        return this.dMT;
    }

    public void setColor(lcq lcq2) {
        this.dMT = lcq2;
    }

    public int eqD() {
        return this.rlF;
    }

    public void acH(int n) {
        this.rlF = n;
    }
}


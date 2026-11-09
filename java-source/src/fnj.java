/*
 * Decompiled with CFR.
 */
public class fnj
extends fmm {
    private int iQT = 0;

    public fnj() {
        super(8003);
    }

    public int bQg() {
        return this.iQT;
    }

    public void GV(int n) {
        this.iQT = n;
    }

    public boolean GW(int n) {
        return (this.iQT & n) != 0;
    }

    public void GX(int n) {
        this.iQT |= n;
    }

    public void GY(int n) {
        this.iQT &= ~n;
    }
}


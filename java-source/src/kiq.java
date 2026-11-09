/*
 * Decompiled with CFR.
 */
public class kiq
extends kit {
    public static final int pBC = 1;
    public static final int pBD = 2;
    protected int iED = 0;
    protected int iEE = 0;
    protected int pBE = -1;

    kiq() {
        this.Jv(2050);
    }

    public int getScreenX() {
        return this.iED;
    }

    public void Fy(int n) {
        this.iED = n;
    }

    public int getScreenY() {
        return this.iEE;
    }

    public void Fz(int n) {
        this.iEE = n;
    }

    public int eaJ() {
        return this.pBE;
    }

    public void XY(int n) {
        this.pBE = n;
    }
}


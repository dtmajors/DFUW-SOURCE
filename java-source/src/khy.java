/*
 * Decompiled with CFR.
 */
public class khy
extends kht {
    public static final int pyO = 1;
    public static final int pyP = 2;
    public static final int pyQ = 4;
    public static final int pyR = 8;
    public static final int pyS = 16;
    public static final int pyT = 32;
    public static final int plP = 64;
    public static final int pxz = 128;
    protected int pyU = 0;
    protected double QM = 0.0;
    protected boolean Active = false;
    protected ldv pyV = null;
    protected boolean dsK = false;

    khy() {
        this.Jv(3073);
    }

    public double bLK() {
        return this.QM;
    }

    public void cm(double d2) {
        this.QM = d2;
    }

    public int dZH() {
        return this.pyU;
    }

    public void XA(int n) {
        this.pyU = n;
    }

    public boolean isActive() {
        return this.Active;
    }

    public void setActive(boolean bl) {
        this.Active = bl;
    }

    public ldv dZI() {
        return this.pyV;
    }

    public void tz(ldv ldv2) {
        this.pyV = ldv2;
    }

    public boolean bUm() {
        return this.dsK;
    }

    public void lQ(boolean bl) {
        this.dsK = bl;
    }
}


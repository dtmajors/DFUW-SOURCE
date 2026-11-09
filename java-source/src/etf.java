/*
 * Decompiled with CFR.
 */
public class etf
extends euk {
    public static final int iBN = 0;
    public static final int iBO = 1;
    public static final int iBP = 2;
    public static final int iBQ = 3;
    public static final int iBR = 4;
    public static final int iBS = 5;
    public static final int iBT = 6;
    public static final int iBU = 7;
    public static final int iBV = -1;
    public static final int iBW = -2;
    public static final int iBX = -3;
    public static final int iBY = -4;
    public static final int iBZ = -5;
    public static final int iCa = -6;
    public static final int iCb = -7;
    public static final int iCc = -8;
    private int gKV = 0;
    private boolean iCd = false;
    private int hfP = 0;

    public etf() {
        super(19986);
    }

    public int getReason() {
        return this.gKV;
    }

    public void EW(int n) {
        this.gKV = n;
    }

    public boolean bLq() {
        return this.iCd;
    }

    public void kK(boolean bl) {
        this.iCd = bl;
    }

    public int bBH() {
        return this.hfP;
    }

    public void EX(int n) {
        this.hfP = n;
    }

    public boolean bLr() {
        return this.gKV > 0;
    }

    public boolean bLs() {
        return this.gKV < 0;
    }
}


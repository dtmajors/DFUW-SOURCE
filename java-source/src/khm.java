/*
 * Decompiled with CFR.
 */
public class khm
extends kht {
    public static final int pxx = 1;
    public static final int pxy = 2;
    public static final int pxz = 4;
    public static final int plP = 8;
    public static final int pxA = 16;
    public static final int pxB = 32;
    public static final int pxC = 64;
    public static final int pxD = 128;
    public static final int pxE = 256;
    public static final int pxF = 0;
    public static final int pxG = 1;
    private int pxH = 0;
    private int pxI = 0;
    private boolean pxJ;
    private boolean ikh;
    private boolean dsK;
    private boolean Active;
    private ldv atv;
    private double pxK;
    private String gsj;
    private int dRH;

    khm() {
        this.Jv(3079);
    }

    public int dZm() {
        return this.pxH;
    }

    public void Xr(int n) {
        this.pxH = n;
    }

    public int dZn() {
        return this.pxI;
    }

    public void Xs(int n) {
        this.pxI = n;
    }

    public boolean isActive() {
        return this.Active;
    }

    public void setActive(boolean bl) {
        this.Active = bl;
    }

    public ldv bjA() {
        return this.atv;
    }

    public void mx(ldv ldv2) {
        this.atv = ldv2;
    }

    public double dZo() {
        return this.pxK;
    }

    public void dK(double d2) {
        this.pxK = d2;
    }

    public boolean bUm() {
        return this.dsK;
    }

    public void lQ(boolean bl) {
        this.dsK = bl;
    }

    public boolean bEW() {
        return this.ikh;
    }

    public void jQ(boolean bl) {
        this.ikh = bl;
    }

    public boolean dZp() {
        return this.pxJ;
    }

    public void wF(boolean bl) {
        this.pxJ = bl;
    }

    public String getSetName() {
        return this.gsj;
    }

    public void setSetName(String string) {
        this.gsj = string;
    }

    public int bEU() {
        return this.dRH;
    }

    public void Do(int n) {
        this.dRH = n;
    }
}


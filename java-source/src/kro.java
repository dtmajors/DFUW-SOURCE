/*
 * Decompiled with CFR.
 */
public class kro
extends krp {
    public static final int pXY = 1;
    public static final int pXZ = 2;
    public static final int pXV = 4;
    public static final int pJn = 8;
    public static final int pYa = 16;
    public static final int pYb = 1024;
    public static final int pYc = 2048;
    public static final int pYd = 4096;
    public static final int pYe = 8192;
    public static final int pYf = 16384;
    public static final int pYg = 32768;
    protected int pYh = -1;
    protected boolean pYi = false;
    protected float pYj = -1.0f;
    protected float pYk = -1.0f;
    protected ldv Rs = null;
    protected ljq pYl = null;
    protected ljq pYm = null;
    protected ljq pYn = null;
    protected ljq pYo = null;

    kro() {
        this.Jv(2307);
    }

    public int egb() {
        return this.pYh;
    }

    public void aax(int n) {
        this.pYh = n;
    }

    public boolean egc() {
        return this.pYi;
    }

    public void xA(boolean bl) {
        this.pYi = bl;
    }

    public float egd() {
        return this.pYj;
    }

    public void mN(float f) {
        this.pYj = f;
    }

    public float ege() {
        return this.pYk;
    }

    public void mO(float f) {
        this.pYk = f;
    }

    public ldv oq() {
        return this.Rs;
    }

    public void hC(ldv ldv2) {
        this.Rs = ldv2;
    }

    public ljq egf() {
        return this.pYl;
    }

    public void dB(ljq ljq2) {
        this.pYl = ljq2;
    }

    public ljq egg() {
        return this.pYm;
    }

    public void dC(ljq ljq2) {
        this.pYm = ljq2;
    }

    public ljq egh() {
        return this.pYn;
    }

    public void dD(ljq ljq2) {
        this.pYn = ljq2;
    }

    public ljq egi() {
        return this.pYo;
    }

    public void dE(ljq ljq2) {
        this.pYo = ljq2;
    }
}


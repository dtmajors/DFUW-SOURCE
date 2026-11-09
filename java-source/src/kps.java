/*
 * Decompiled with CFR.
 */
public class kps
extends kpz {
    public static final int pUY = 1;
    public static final int pUZ = 2;
    public static final int pVa = 4;
    public static final int pVb = 8;
    public static final int pVc = 16;
    public static final int pVd = 32;
    public static final int pVe = 64;
    public static final int pVf = 128;
    public static final int pVg = 256;
    public static final int pVh = 512;
    public static final int pVi = 1024;
    public static final int pVj = 2048;
    public static final int pVk = 4096;
    private int pVl = 0;
    private int pVm = 0;
    private ljr hfg = null;
    private ljr hfh = null;
    private ljr pVn = null;
    private int[] pVo = new int[4];
    private int[] pVp = new int[4];
    private float biu = 0.0f;

    kps() {
        this.Jv(3589);
    }

    public int efu() {
        return this.pVl;
    }

    public void aam(int n) {
        this.pVl = n;
    }

    public int efv() {
        return this.pVm;
    }

    public void aan(int n) {
        this.pVm = n;
    }

    public ljr bBn() {
        return this.hfg;
    }

    public void f(ljr ljr2) {
        this.hfg = ljr2;
    }

    public ljr bBo() {
        return this.hfh;
    }

    public void g(ljr ljr2) {
        this.hfh = ljr2;
    }

    public float getPower() {
        return this.biu;
    }

    public void setPower(float f) {
        this.biu = f;
    }

    public void k(ljr ljr2) {
        this.pVn = ljr2;
    }

    public ljr efw() {
        return this.pVn;
    }

    public void bJ(int n, int n2) {
        this.pVo[0] = n;
        this.pVp[0] = n2;
    }

    public void bK(int n, int n2) {
        this.pVo[1] = n;
        this.pVp[1] = n2;
    }

    public void bL(int n, int n2) {
        this.pVo[2] = n;
        this.pVp[2] = n2;
    }

    public void bM(int n, int n2) {
        this.pVo[3] = n;
        this.pVp[3] = n2;
    }
}


/*
 * Decompiled with CFR.
 */
public class kiv
extends kit {
    public static final int pBj = 1;
    public static final int plP = 4;
    public static final int pBU = 8;
    public static final int pBV = 16;
    public static final int pBW = 32;
    public static final int pBX = 64;
    public static final int pBY = 128;
    public static final int pBZ = 256;
    public static final int pCa = 512;
    public static final int pCb = 1024;
    public static final int pCc = 2048;
    public static final int pCd = 4096;
    public static final int pCe = 8192;
    public static final int pCf = 16384;
    public static final int pCg = 32768;
    public static final int pCh = 65536;
    public static final int pCi = 131072;
    public static final int pCj = 262144;
    public static final int pCk = 524288;
    public static final int pCl = 0x100000;
    public static final int pCm = 0x200000;
    public static final int pCn = 0x400000;
    private int pCo = 0;
    private boolean Active = false;
    private ldv hs = null;
    private ldv Rs = null;
    private boolean pCp;
    private boolean pCq;
    private boolean pCr;
    private ljq iNo = null;
    private ljq pCs = null;
    private float pCt;
    private float pCu;
    private float pCv;
    private float pCw;
    private float pCx;
    private float pCy;
    private float pCz;
    private float pCA;
    private float pCB;
    private float pCC;
    private float pCD;
    private float pCE;
    private String pCF = null;
    private float pCG;
    private boolean pCH;
    private boolean pCI;

    kiv() {
        this.Jv(2056);
    }

    public int eaO() {
        return this.pCo;
    }

    public void Yd(int n) {
        this.pCo = n;
    }

    public void setActive(boolean bl) {
        this.Active = bl;
    }

    public boolean djZ() {
        return this.Active;
    }

    public ldv dZh() {
        return this.hs;
    }

    public void e(ldv ldv2) {
        this.hs = ldv2;
    }

    public ldv oq() {
        return this.Rs;
    }

    public void hC(ldv ldv2) {
        this.Rs = ldv2;
    }

    public void wN(boolean bl) {
        this.pCp = bl;
    }

    public boolean eaP() {
        return this.pCp;
    }

    public void wO(boolean bl) {
        this.pCq = bl;
    }

    public boolean eaQ() {
        return this.pCq;
    }

    public void wP(boolean bl) {
        this.pCr = bl;
    }

    public boolean eaR() {
        return this.pCr;
    }

    public void cI(ljq ljq2) {
        this.iNo = ljq2;
    }

    public ljq bPP() {
        return this.iNo;
    }

    public void dh(ljq ljq2) {
        this.pCs = ljq2;
    }

    public ljq eaS() {
        return this.pCs;
    }

    public void mf(float f) {
        this.pCt = f;
    }

    public float eaT() {
        return this.pCt;
    }

    public void mg(float f) {
        this.pCu = f;
    }

    public float eaU() {
        return this.pCu;
    }

    public void mh(float f) {
        this.pCv = f;
    }

    public float eaV() {
        return this.pCv;
    }

    public void mi(float f) {
        this.pCw = f;
    }

    public float eaW() {
        return this.pCw;
    }

    public void mj(float f) {
        this.pCx = f;
    }

    public float eaX() {
        return this.pCx;
    }

    public void mk(float f) {
        this.pCy = f;
    }

    public float eaY() {
        return this.pCy;
    }

    public void ml(float f) {
        this.pCz = f;
    }

    public float eaZ() {
        return this.pCz;
    }

    public void mm(float f) {
        this.pCA = f;
    }

    public float eba() {
        return this.pCA;
    }

    public void mn(float f) {
        this.pCB = f;
    }

    public float ebb() {
        return this.pCB;
    }

    public void mo(float f) {
        this.pCC = f;
    }

    public float ebc() {
        return this.pCC;
    }

    public void mp(float f) {
        this.pCD = f;
    }

    public float ebd() {
        return this.pCD;
    }

    public void mq(float f) {
        this.pCE = f;
    }

    public float ebe() {
        return this.pCE;
    }

    public void wJ(String string) {
        this.pCF = string;
    }

    public String ebf() {
        return this.pCF;
    }

    public void mr(float f) {
        this.pCG = f;
    }

    public float ebg() {
        return this.pCG;
    }

    public void wQ(boolean bl) {
        this.pCH = bl;
    }

    public boolean ebh() {
        return this.pCH;
    }

    public void wR(boolean bl) {
        this.pCI = bl;
    }

    public boolean ebi() {
        return this.pCI;
    }
}


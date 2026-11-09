/*
 * Decompiled with CFR.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class klt
extends klp {
    public static final int iYd = 1;
    public static final int iYe = 2;
    public static final int iYy = 4;
    public static final int iYz = 8;
    public static final int iYA = 16;
    public static final int iYB = 32;
    public static final int iYC = 64;
    public static final int iYD = 128;
    public static final int iYE = 256;
    public static final int iYF = 512;
    public static final int iYG = 1024;
    public static final int iYH = 2048;
    public static final int iYI = 4096;
    public static final int iYJ = 8192;
    public static final int iYK = 16384;
    public static final int iYL = 32768;
    public static final int iYM = 65536;
    public static final int iYN = 131072;
    public static final int iYO = 262144;
    public static final int iYP = 524288;
    public static final int iYQ = 0x100000;
    public static final int iYR = 0x200000;
    public static final int iYS = 0x400000;
    public static final int iYT = 0x800000;
    public static final int iYU = 0x1000000;
    public static final int iYV = 0x2000000;
    public static final int iYW = 0x4000000;
    public static final int iTh = 0x8000000;
    public static final int iYX = 0x10000000;
    private int iYY;
    private String fFC = "";
    private ljq Position = new ljq();
    private float gWn;
    private float gWo;
    private float gWp;
    private float gWq;
    private float gWr;
    private float gWs;
    private float gWt;
    private float gWu;
    private float gWv;
    private float gWw;
    private float gWx;
    private float gWy;
    private float gWz;
    private float gWA;
    private float gWB;
    private float gWC;
    private float gWD;
    private float gWE;
    private float gWF;
    private float gWG;
    private float gWH;
    private float gWI;
    private ljr gWJ;
    private ljr gWK;
    private int gtp;
    private ljq mw;

    klt() {
        this.Jv(2562);
        this.gWn = 6.0f;
        this.gWo = 2.0f;
        this.gWp = 0.95f;
        this.gWq = 4.0f;
        this.gWr = 8.0f;
        this.gWs = 0.0f;
        this.gWt = 200.0f;
        this.gWu = 2.0f;
        this.gWv = 1.0f;
        this.gWw = 1.67f;
        this.gWx = 0.4f;
        this.gWy = 1.33f;
        this.gWz = 0.0f;
        this.gWA = 6.0f;
        this.gWB = 0.6f;
        this.gWC = 20.21f;
        this.gWD = 0.0f;
        this.gWE = 1.93f;
        this.gWF = 10.0f;
        this.gWG = 0.73f;
        this.gWH = 0.1f;
        this.gWI = 0.2f;
        this.gtp = 200;
        this.gWJ = new ljr(1.0f, 1.0f, 1.0f, 1.0f);
        this.gWK = new ljr(0.2f, 0.2f, 0.1f, 0.0f);
        this.mw = new ljq(0.0f, 0.0f, 1.0f);
    }

    public int bSq() {
        return this.iYY;
    }

    public void Ij(int n) {
        this.iYY = n;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public float bwQ() {
        return this.gWn;
    }

    public void hS(float f) {
        this.gWn = f;
    }

    public float bwR() {
        return this.gWo;
    }

    public void hT(float f) {
        this.gWo = f;
    }

    public float bwS() {
        return this.gWp;
    }

    public void hU(float f) {
        this.gWp = f;
        lfn.b(0, this.getClass().getName(), "LaunchAccel is: " + this.gWp);
    }

    public float bwT() {
        return this.gWq;
    }

    public void hV(float f) {
        this.gWq = f;
    }

    public float bwU() {
        return this.gWr;
    }

    public void hW(float f) {
        this.gWr = f;
    }

    public float bwV() {
        return this.gWs;
    }

    public void hX(float f) {
        this.gWs = f;
    }

    public float bwW() {
        return this.gWt;
    }

    public void hY(float f) {
        this.gWt = f;
    }

    public float bwX() {
        return this.gWu;
    }

    public void hZ(float f) {
        this.gWu = f;
    }

    public float bwY() {
        return this.gWv;
    }

    public void ia(float f) {
        this.gWv = f;
    }

    public float bwZ() {
        return this.gWw;
    }

    public void ib(float f) {
        this.gWw = f;
    }

    public float bxa() {
        return this.gWx;
    }

    public void ic(float f) {
        this.gWx = f;
    }

    public float bxb() {
        return this.gWy;
    }

    public void id(float f) {
        this.gWy = f;
    }

    public float bxc() {
        return this.gWz;
    }

    public void ie(float f) {
        this.gWz = f;
    }

    public float bxd() {
        return this.gWA;
    }

    public void if(float f) {
        this.gWA = f;
    }

    public float bxe() {
        return this.gWB;
    }

    public void ig(float f) {
        this.gWB = f;
    }

    public float bxf() {
        return this.gWC;
    }

    public void ih(float f) {
        this.gWC = f;
    }

    public float bxg() {
        return this.gWD;
    }

    public void ii(float f) {
        this.gWD = f;
    }

    public float bxh() {
        return this.gWE;
    }

    public void ij(float f) {
        this.gWE = f;
    }

    public float bxi() {
        return this.gWF;
    }

    public void ik(float f) {
        this.gWF = f;
    }

    public float bxj() {
        return this.gWG;
    }

    public void il(float f) {
        this.gWG = f;
    }

    public float bxk() {
        return this.gWH;
    }

    public void im(float f) {
        this.gWH = f;
    }

    public float bxl() {
        return this.gWI;
    }

    public void in(float f) {
        this.gWI = f;
    }

    public ljr edd() {
        return this.gWJ;
    }

    public void i(ljr ljr2) {
        this.gWJ = ljr2;
    }

    public ljr ede() {
        return this.gWK;
    }

    public void j(ljr ljr2) {
        this.gWK = ljr2;
    }

    public int getNumParticles() {
        return this.gtp;
    }

    public void setNumParticles(int n) {
        this.gtp = n;
    }

    public ljq boZ() {
        return this.mw;
    }

    public void ca(ljq ljq2) {
        this.mw = ljq2;
    }
}


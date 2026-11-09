/*
 * Decompiled with CFR.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class fwf
extends fwc {
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
    private String fFC;
    private ljq Position;
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
    private lcq eoo;
    private lcq eop;
    private int gtp;
    private ljq mw;
    private ldv gWL = null;

    fwf() {
        super(6658);
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

    public void hS(float f2) {
        this.gWn = f2;
    }

    public float bwR() {
        return this.gWo;
    }

    public void hT(float f2) {
        this.gWo = f2;
    }

    public float bwS() {
        return this.gWp;
    }

    public void hU(float f2) {
        this.gWp = f2;
        lfn.b(0, this.getClass().getName(), "LaunchAccel is: " + this.gWp);
    }

    public float bwT() {
        return this.gWq;
    }

    public void hV(float f2) {
        this.gWq = f2;
    }

    public float bwU() {
        return this.gWr;
    }

    public void hW(float f2) {
        this.gWr = f2;
    }

    public float bwV() {
        return this.gWs;
    }

    public void hX(float f2) {
        this.gWs = f2;
    }

    public float bwW() {
        return this.gWt;
    }

    public void hY(float f2) {
        this.gWt = f2;
    }

    public float bwX() {
        return this.gWu;
    }

    public void hZ(float f2) {
        this.gWu = f2;
    }

    public float bwY() {
        return this.gWv;
    }

    public void ia(float f2) {
        this.gWv = f2;
    }

    public float bwZ() {
        return this.gWw;
    }

    public void ib(float f2) {
        this.gWw = f2;
    }

    public float bxa() {
        return this.gWx;
    }

    public void ic(float f2) {
        this.gWx = f2;
    }

    public float bxb() {
        return this.gWy;
    }

    public void id(float f2) {
        this.gWy = f2;
    }

    public float bxc() {
        return this.gWz;
    }

    public void ie(float f2) {
        this.gWz = f2;
    }

    public float bxd() {
        return this.gWA;
    }

    public void if(float f2) {
        this.gWA = f2;
    }

    public float bxe() {
        return this.gWB;
    }

    public void ig(float f2) {
        this.gWB = f2;
    }

    public float bxf() {
        return this.gWC;
    }

    public void ih(float f2) {
        this.gWC = f2;
    }

    public float bxg() {
        return this.gWD;
    }

    public void ii(float f2) {
        this.gWD = f2;
    }

    public float bxh() {
        return this.gWE;
    }

    public void ij(float f2) {
        this.gWE = f2;
    }

    public float bxi() {
        return this.gWF;
    }

    public void ik(float f2) {
        this.gWF = f2;
    }

    public float bxj() {
        return this.gWG;
    }

    public void il(float f2) {
        this.gWG = f2;
    }

    public float bxk() {
        return this.gWH;
    }

    public void im(float f2) {
        this.gWH = f2;
    }

    public float bxl() {
        return this.gWI;
    }

    public void in(float f2) {
        this.gWI = f2;
    }

    public lcq getStartColor() {
        return this.eoo;
    }

    public void setStartColor(lcq lcq2) {
        this.eoo = lcq2;
    }

    public lcq getEndColor() {
        return this.eop;
    }

    public void setEndColor(lcq lcq2) {
        this.eop = lcq2;
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

    public ldv bSr() {
        return this.gWL;
    }

    public void pV(ldv ldv2) {
        this.gWL = ldv2;
    }
}


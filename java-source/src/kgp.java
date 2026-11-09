/*
 * Decompiled with CFR.
 */
public class kgp
extends kgh {
    public static final int ppo = 1;
    public static final int ppp = 2;
    public static final int ppq = 4;
    public static final int ppr = 8;
    public static final int pps = 16;
    public static final int ppt = 32;
    public static final int ppu = 64;
    public static final int ppv = 128;
    public static final int ppw = 256;
    public static final int ppx = 512;
    public static final int ppy = 1024;
    public static final int ppz = 2048;
    public static final int ppA = 4096;
    public static final int ppB = 8192;
    public static final int ppC = 16384;
    public static final int pnE = 32768;
    public static final int ppD = 65536;
    public static final int ppE = 131072;
    public static final int ppF = 262144;
    public static final int ppG = 524288;
    public static final int ppH = 0x100000;
    public static final int ppI = 0x200000;
    public static final int ppJ = 0x400000;
    public static final int ppK = 0x800000;
    public static final int ppL = 0x1000000;
    public static final int ppM = 0x2000000;
    public static final int ppN = 0x4000000;
    public static final int ppO = 0x8000000;
    public static final int ppP = 0x10000000;
    public static final int ppQ = 1;
    public static final int ppR = 2;
    public static final int ppS = 4;
    public static final int ppT = 8;
    public static final int ppU = 16;
    public static final int ppV = 32;
    public static final int ppW = 64;
    public static final int ppX = 128;
    public static final int ppY = 256;
    public static final int ppZ = 0;
    public static final int pqa = 1;
    public static final int pqb = 2;
    public static final int pqc = 0;
    public static final int pqd = 1;
    public static final int pqe = 2;
    public static final int pqf = 3;
    private int pqg;
    private boolean pqh;
    private boolean pqi;
    private boolean pqj;
    private boolean pqk;
    private boolean pql;
    private boolean pqm;
    private boolean pqn;
    private boolean pqo;
    private boolean pqp;
    private boolean pqq;
    private boolean pqr;
    private boolean pqs;
    private boolean pqt;
    private boolean pqu;
    private boolean pnW;
    private boolean pqv;
    private boolean pqw;
    private boolean pqx;
    private boolean fbS;
    private boolean pqy;
    private boolean EnableGodRays;
    private boolean pqz;
    private boolean pqA;
    private int pqB;
    private int pqC;
    private int pqD;
    private int pqE;
    private int SpecialFXQuality = 100;
    private int gst;
    private int pqF;
    private int pqG;
    private float pqH;
    public boolean pqI;
    public int pqJ;
    private boolean fbN;
    private boolean pqK;
    private int TextureQuality = 0;

    public boolean dYn() {
        return this.EnableGodRays;
    }

    public void wd(boolean bl) {
        this.EnableGodRays = bl;
    }

    public void we(boolean bl) {
        this.pqz = bl;
    }

    public void wf(boolean bl) {
        this.pqA = bl;
    }

    public int dYo() {
        return this.pqB;
    }

    public void WY(int n) {
        this.pqB = n;
    }

    public boolean baA() {
        return this.pqC >= 2;
    }

    public void wg(boolean bl) {
        this.pqC = bl ? 3 : 0;
    }

    public int dYp() {
        return this.SpecialFXQuality;
    }

    public void WZ(int n) {
        this.SpecialFXQuality = n;
    }

    public kgp() {
        this.ed = 5;
    }

    public int dYq() {
        return this.pqg;
    }

    public void Xa(int n) {
        this.pqg = n;
    }

    public void wh(boolean bl) {
        this.fbN = bl;
    }

    public boolean dYr() {
        return this.pqq;
    }

    public void wi(boolean bl) {
        this.pqq = bl;
    }

    public boolean dYs() {
        return this.pqh;
    }

    public void wj(boolean bl) {
        this.pqh = bl;
    }

    public boolean dYt() {
        return this.pqi;
    }

    public void wk(boolean bl) {
        this.pqi = bl;
    }

    public boolean dYu() {
        return this.pqk;
    }

    public void wl(boolean bl) {
        this.pqk = bl;
    }

    public boolean dYv() {
        return this.pqm;
    }

    public void wm(boolean bl) {
        this.pqm = bl;
    }

    public boolean dYw() {
        return this.pqs;
    }

    public void wn(boolean bl) {
        this.pqs = bl;
    }

    public boolean dYx() {
        return this.pqj;
    }

    public void wo(boolean bl) {
        this.pqj = bl;
    }

    public boolean dYy() {
        return this.pqt;
    }

    public void wp(boolean bl) {
        this.pqt = bl;
    }

    public boolean dYz() {
        return this.pqr;
    }

    public void wq(boolean bl) {
        this.pqr = bl;
    }

    public boolean dYA() {
        return this.pql;
    }

    public void wr(boolean bl) {
        this.pql = bl;
    }

    public boolean dYB() {
        return this.pqo;
    }

    public void ws(boolean bl) {
        this.pqo = bl;
    }

    public boolean dYC() {
        return this.pqn;
    }

    public void wt(boolean bl) {
        this.pqn = bl;
    }

    public boolean dYD() {
        return this.pqp;
    }

    public void wu(boolean bl) {
        this.pqp = bl;
    }

    public static int dYE() {
        return 1024;
    }

    public boolean dYF() {
        return this.pqu;
    }

    public void wv(boolean bl) {
        this.pqu = bl;
    }

    public boolean dXv() {
        return this.pnW;
    }

    public void vC(boolean bl) {
        this.pnW = bl;
    }

    public boolean dYG() {
        return this.pqv;
    }

    public void ww(boolean bl) {
        this.pqv = bl;
    }

    public int dYH() {
        return this.pqD;
    }

    public void Xb(int n) {
        this.pqD = n;
    }

    public int dYI() {
        return this.pqE;
    }

    public void Xc(int n) {
        this.pqE = n;
    }

    public int getMaxNumParticles() {
        return this.gst;
    }

    public void setMaxNumParticles(int n) {
        this.gst = n;
    }

    public boolean dYJ() {
        return this.pqw;
    }

    public void wx(boolean bl) {
        this.pqw = bl;
    }

    public int dYK() {
        return this.pqF;
    }

    public void Xd(int n) {
        this.pqF = n;
    }

    public int dYL() {
        return this.pqG;
    }

    public void Xe(int n) {
        this.pqG = n;
    }

    public float dYM() {
        return this.pqH;
    }

    public void lR(float f) {
        this.pqH = f;
    }

    public boolean dYN() {
        return this.pqx;
    }

    public void wy(boolean bl) {
        this.pqx = bl;
    }

    public void wz(boolean bl) {
        this.pqK = bl;
    }

    public boolean dYO() {
        return this.pqK;
    }

    public void gQ(boolean bl) {
        this.fbS = bl;
    }

    public boolean baz() {
        return this.fbS;
    }

    public void wA(boolean bl) {
        this.pqy = bl;
    }

    public boolean dYP() {
        return this.pqy;
    }

    public int dYQ() {
        return this.TextureQuality;
    }

    public void Xf(int n) {
        this.TextureQuality = n;
    }
}


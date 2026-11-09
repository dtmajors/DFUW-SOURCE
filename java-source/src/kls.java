/*
 * Decompiled with CFR.
 */
public class kls
extends klp {
    public static final int iYd = 1;
    public static final int iYe = 2;
    public static final int goz = 4;
    public static final int iTh = 8;
    public static final int iYf = 16;
    public static final int iYg = 32;
    public static final int iYh = 128;
    public static final int iYi = 256;
    public static final int iYj = 512;
    public static final int iYk = 1024;
    public static final int iYl = 2048;
    public static final int iYm = 4096;
    public static final int iYn = 8192;
    public static final int iYo = 16384;
    public static final int iYp = 32768;
    public static final int iYq = 65536;
    public static final int iYr = 131072;
    public static final int iYs = 262144;
    public static final int iYt = 524288;
    public static final int iYu = 0x100000;
    public static final int iYv = 0x200000;
    protected int iYw = 0;
    protected ljq Position = new ljq();
    protected ljq gVx = new ljq();
    protected ljq gVy = new ljq();
    protected lcq gVz = lcq.BRIGHT_WHITE;
    protected lcq gVA = lcq.BRIGHT_WHITE;
    protected float gVB = 0.0f;
    protected float gVC = 0.0f;
    protected float gVD = 0.0f;
    protected float gVE = 0.0f;
    protected float gVF = 0.0f;
    protected float gVG = 0.0f;
    protected float gPP = 0.0f;
    protected boolean gwF = true;
    protected int gVH = 0;
    protected int iYx = 0;
    protected int gVI = 0;
    protected String fFC = "n/a";
    protected boolean gVJ = false;
    protected float gVK = 0.0f;
    protected float gVL = 0.0f;

    kls() {
        this.Jv(2561);
    }

    public int bSo() {
        return this.iYw;
    }

    public void Ih(int n) {
        this.iYw = n;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public ljq bwA() {
        return this.gVx;
    }

    public void cu(ljq ljq2) {
        this.gVx = ljq2;
    }

    public ljq bwB() {
        return this.gVy;
    }

    public void cv(ljq ljq2) {
        this.gVy = ljq2;
    }

    public lcq bwC() {
        return this.gVz;
    }

    public void C(lcq lcq2) {
        this.gVz = lcq2;
        lfn.b(0, this.getClass().getName(), "EmitColor is:" + this.gVz);
    }

    public lcq bwD() {
        return this.gVA;
    }

    public void D(lcq lcq2) {
        this.gVA = lcq2;
        lfn.b(0, this.getClass().getName(), "FadeColor is:" + this.gVA);
    }

    public float bwE() {
        return this.gVB;
    }

    public void hK(float f) {
        this.gVB = f;
    }

    public float bwF() {
        return this.gVC;
    }

    public void hL(float f) {
        this.gVC = f;
    }

    public float bwG() {
        return this.gVD;
    }

    public void hM(float f) {
        this.gVD = f;
    }

    public float bwH() {
        return this.gVE;
    }

    public void hN(float f) {
        this.gVE = f;
    }

    public float bwI() {
        return this.gVF;
    }

    public void hO(float f) {
        this.gVF = f;
    }

    public float bwJ() {
        return this.gVG;
    }

    public void hP(float f) {
        this.gVG = f;
    }

    public float bwK() {
        return this.gPP;
    }

    public void hs(float f) {
        this.gPP = f;
    }

    public boolean isConstantSize() {
        return this.gwF;
    }

    public void setConstantSize(boolean bl) {
        this.gwF = bl;
    }

    public int bwL() {
        return this.gVH;
    }

    public void BF(int n) {
        this.gVH = n;
    }

    public int bSp() {
        return this.iYx;
    }

    public void Ii(int n) {
        this.iYx = n;
    }

    public int bwM() {
        return this.gVI;
    }

    public void BG(int n) {
        this.gVI = n;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public boolean bwN() {
        return this.gVJ;
    }

    public void jj(boolean bl) {
        this.gVJ = bl;
        lfn.b(0, this.getClass().getName(), "AlphaOnlyBlend is:" + this.gVJ);
    }

    public float bwO() {
        return this.gVK;
    }

    public void hQ(float f) {
        this.gVK = f;
    }

    public float bwP() {
        return this.gVL;
    }

    public void hR(float f) {
        this.gVL = f;
    }
}


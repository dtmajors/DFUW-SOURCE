/*
 * Decompiled with CFR.
 */
public class kju
extends kjx {
    public static final int iGD = 1;
    public static final int iGE = 2;
    public static final int iGF = 4;
    public static final int iGG = 8;
    public static final int iGH = 16;
    public static final int iGI = 32;
    public static final int iGJ = 64;
    public static final int iGK = 128;
    public static final int iGL = 256;
    public static final int iGM = 512;
    public static final int iGN = 1024;
    public static final int pFD = 2048;
    public static final int pFE = 4096;
    public static final int pFF = 8192;
    public static final int iGB = 16384;
    private int iGQ;
    private String gSa;
    private ljq gSb;
    private float gSj;
    private lgl gSc;
    private lgl gSd;
    private lcq gSh;
    private float gsO;
    private boolean Visible;
    private boolean Active;
    private ljq gSe;
    private lcq gSi;
    private float gSk;
    private lgl gSg;
    private ljq gSf;

    kju() {
        this.Jv(1800);
    }

    public int bNN() {
        return this.iGQ;
    }

    public void FZ(int n) {
        this.iGQ = n;
    }

    public ljq buZ() {
        return this.gSb;
    }

    public void cm(ljq ljq2) {
        this.gSb = ljq2;
    }

    public lgl ebH() {
        return this.gSc;
    }

    public void I(lgl lgl2) {
        this.gSc = lgl2;
    }

    public lgl ebI() {
        return this.gSd;
    }

    public void J(lgl lgl2) {
        this.gSd = lgl2;
    }

    public ljq bvg() {
        return this.gSe;
    }

    public void cp(ljq ljq2) {
        this.gSe = ljq2;
    }

    public float bvh() {
        return this.gSj;
    }

    public void hw(float f) {
        this.gSj = f;
    }

    public lcq bvi() {
        return this.gSh;
    }

    public void r(lcq lcq2) {
        this.gSh = lcq2;
    }

    public float bvj() {
        return this.gsO;
    }

    public void hx(float f) {
        this.gsO = f;
    }

    public String blU() {
        return this.gSa;
    }

    public void iL(String string) {
        this.gSa = string;
    }

    public boolean isVisible() {
        return this.Visible;
    }

    public void setVisible(boolean bl) {
        this.Visible = bl;
    }

    public boolean isActive() {
        return this.Active;
    }

    public void setActive(boolean bl) {
        this.Active = bl;
    }

    public lcq bvb() {
        return this.gSi;
    }

    public void q(lcq lcq2) {
        this.gSi = lcq2;
    }

    public float bva() {
        return this.gSk;
    }

    public void hv(float f) {
        this.gSk = f;
    }

    public lgl bvc() {
        return this.gSg;
    }

    public void H(lgl lgl2) {
        this.gSg = lgl2;
    }

    public ljq blS() {
        return this.gSf;
    }

    public void bM(ljq ljq2) {
        this.gSf = ljq2;
    }

    @Override
    public String toString() {
        return lda.X(this);
    }

    public String wL(String string) {
        return null;
    }
}


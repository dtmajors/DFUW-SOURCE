/*
 * Decompiled with CFR.
 */
public class fah
extends fal {
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
    public static final int iGO = 2048;
    public static final int iGP = 4096;
    private int iGQ;
    private ljq gSb;
    private ljq iGR;
    private ljq iGS;
    private ljq gSe;
    private float gSj;
    private lcq gSh;
    private float gsO;
    private String gSa;
    private boolean Visible;
    private boolean Active;
    private ljq gSn = new ljq(0.0f, 0.0f, 0.0f);
    private ljq gSo = new ljq(0.0f, 0.0f, 0.0f);

    public fah() {
        super(1797);
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

    public ljq bve() {
        return this.iGR;
    }

    public void cn(ljq ljq2) {
        this.iGR = ljq2;
    }

    public ljq bvf() {
        return this.iGS;
    }

    public void co(ljq ljq2) {
        this.iGS = ljq2;
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

    public void hw(float f2) {
        this.gSj = f2;
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

    public void hx(float f2) {
        this.gsO = f2;
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

    public ljq bvd() {
        return this.gSn;
    }

    public void cl(ljq ljq2) {
        this.gSn = ljq2;
    }

    public ljq bvl() {
        return this.gSo;
    }

    public void ck(ljq ljq2) {
        this.gSo = ljq2;
    }
}


/*
 * Decompiled with CFR.
 */
public class kmh
extends kmn {
    public static final int pxP = 1;
    public static final int pxQ = 2;
    public static final int plP = 4;
    public static final int pMI = 8;
    public static final int pMJ = 16;
    public static final int pMK = 32;
    public static final int pML = 64;
    public static final int pMM = 128;
    public static final int pMN = 256;
    public static final int pMO = 512;
    public static final int pMP = 1024;
    public static final int pLx = 2048;
    public static final int pMQ = 4096;
    public static final int pMR = 8192;
    public static final int pMS = 16384;
    private int pMT;
    private boolean dsK;
    private boolean Active;
    private ljq gvZ = null;
    private boolean pMU;
    private boolean pMV;
    private boolean pMW;
    private boolean pMX;
    private boolean pMY;
    private boolean pMZ;
    private boolean pNa;
    private boolean pNb;
    private float byZ;
    private float pNc;
    private float pNd;
    private boolean pNe;
    private ljq pKE = null;

    kmh() {
        this.Jv(3336);
    }

    void ds(ljq ljq2) {
        this.pKE = ljq2;
    }

    ljq edt() {
        return this.pKE;
    }

    void Zd(int n) {
        this.pMT = n;
    }

    int edu() {
        return this.pMT;
    }

    void lQ(boolean bl) {
        this.dsK = bl;
    }

    boolean ebP() {
        return this.dsK;
    }

    void setActive(boolean bl) {
        this.Active = bl;
    }

    boolean djZ() {
        return this.Active;
    }

    void setOrientation(ljq ljq2) {
        this.gvZ = ljq2;
    }

    ljq getOrientation() {
        return this.gvZ;
    }

    void xf(boolean bl) {
        this.pMU = bl;
    }

    boolean edv() {
        return this.pMU;
    }

    void xg(boolean bl) {
        this.pMV = bl;
    }

    boolean edw() {
        return this.pMV;
    }

    void xh(boolean bl) {
        this.pMW = bl;
    }

    boolean edx() {
        return this.pMW;
    }

    void xi(boolean bl) {
        this.pMX = bl;
    }

    boolean edy() {
        return this.pMX;
    }

    void xj(boolean bl) {
        this.pMY = bl;
    }

    boolean edz() {
        return this.pMY;
    }

    void xk(boolean bl) {
        this.pMZ = bl;
    }

    boolean edA() {
        return this.pMZ;
    }

    void xl(boolean bl) {
        this.pNb = bl;
    }

    boolean edB() {
        return this.pNb;
    }

    void be(float f) {
        this.byZ = f;
    }

    float GX() {
        return this.byZ;
    }

    void mA(float f) {
        this.pNc = f;
    }

    float edC() {
        return this.pNc;
    }

    void mB(float f) {
        this.pNd = f;
    }

    float edD() {
        return this.pNd;
    }

    void xm(boolean bl) {
        this.pNe = bl;
    }

    boolean edE() {
        return this.pNe;
    }
}


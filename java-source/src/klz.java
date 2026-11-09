/*
 * Decompiled with CFR.
 */
public class klz
extends kmn {
    public static final int pxP = 1;
    public static final int pxQ = 2;
    public static final int plP = 4;
    public static final int pKN = 8;
    public static final int pKO = 16;
    public static final int pKP = 32;
    public static final int pKQ = 64;
    public static final int pKR = 0;
    public static final int pKS = 1;
    private int pKT;
    private boolean dsK = false;
    private boolean Active;
    private boolean pKU;
    private ljw pKV = null;
    private lgl Rotation = null;
    private int aZa;
    private int pKW;
    private boolean pKX;
    public int pKY;
    public double pKZ;
    public ljq pLa;
    public lgl pLb;
    public double pLc;
    public ljq pLd;
    public lgl pLe;

    public klz() {
        this.Jv(3348);
    }

    public void setType(int n) {
        this.pKT = n;
    }

    public int getType() {
        return this.pKT;
    }

    public void lQ(boolean bl) {
        this.dsK = bl;
    }

    public boolean ebP() {
        return this.dsK;
    }

    public void setActive(boolean bl) {
        this.Active = bl;
    }

    public boolean djZ() {
        return this.Active;
    }

    public void xd(boolean bl) {
        this.pKU = bl;
    }

    public boolean edh() {
        return this.pKU;
    }

    public void a(ljw ljw2) {
        this.pKV = ljw2;
    }

    public ljw edi() {
        return this.pKV;
    }

    public void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public lgl aw() {
        return this.Rotation;
    }

    public void Za(int n) {
        this.aZa = n;
    }

    public int edj() {
        return this.aZa;
    }

    public void Zb(int n) {
        this.pKW = n;
    }

    public int edk() {
        return this.pKW;
    }

    public void xe(boolean bl) {
        this.pKX = bl;
    }

    public boolean edl() {
        return this.pKX;
    }

    public int edm() {
        return this.pKY;
    }

    public void Zc(int n) {
        this.pKY = n;
    }

    public double edn() {
        return this.pKZ;
    }

    public void dN(double d2) {
        this.pKZ = d2;
    }

    public ljq edo() {
        return this.pLa;
    }

    public void dq(ljq ljq2) {
        this.pLa = ljq2;
    }

    public lgl edp() {
        return this.pLb;
    }

    public void S(lgl lgl2) {
        this.pLb = lgl2;
    }

    public double edq() {
        return this.pLc;
    }

    public void dO(double d2) {
        this.pLc = d2;
    }

    public ljq edr() {
        return this.pLd;
    }

    public void dr(ljq ljq2) {
        this.pLd = ljq2;
    }

    public lgl eds() {
        return this.pLe;
    }

    public void T(lgl lgl2) {
        this.pLe = lgl2;
    }
}


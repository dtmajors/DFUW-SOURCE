/*
 * Decompiled with CFR.
 */
public class kir
extends kit {
    public static final int pBF = 1;
    public static final int pBG = 2;
    public static final int pBH = 4;
    public static final int pBI = 8;
    public static final int pBJ = 16;
    public static final int pBK = 32;
    public static final int pBL = 64;
    public static final int pBM = 128;
    public static final int plP = 256;
    public static final int pBN = 512;
    public static final int pBO = 1024;
    public static final int pBP = 2048;
    private int pBQ = 0;
    private float gFo = 0.0f;
    private float FarPlane = 0.0f;
    private int gFp = 0;
    private int gFq = 0;
    private float gFr = 0.0f;
    private float gFs = 0.0f;
    private float gFt = 0.0f;
    private float gFu = 0.0f;
    private boolean Active = false;
    private ldv pBR = ldv.rfe;
    private int pBS = 1024;
    private int pBT = 768;

    kir() {
        this.Jv(2054);
    }

    public boolean isActive() {
        return this.Active;
    }

    public void setActive(boolean bl) {
        this.Active = bl;
    }

    public int eaK() {
        return this.pBQ;
    }

    public void XZ(int n) {
        this.pBQ = n;
    }

    public float boS() {
        return this.FarPlane;
    }

    public void ha(float f) {
        this.FarPlane = f;
    }

    public float boV() {
        return this.gFr;
    }

    public void hb(float f) {
        this.gFr = f;
    }

    public float boW() {
        return this.gFs;
    }

    public void hc(float f) {
        this.gFs = f;
    }

    public float boX() {
        return this.gFt;
    }

    public void hd(float f) {
        this.gFt = f;
    }

    public float boR() {
        return this.gFo;
    }

    public void gZ(float f) {
        this.gFo = f;
    }

    public float boY() {
        return this.gFu;
    }

    public void he(float f) {
        this.gFu = f;
    }

    public int boU() {
        return this.gFq;
    }

    public void At(int n) {
        this.gFq = n;
    }

    public int boT() {
        return this.gFp;
    }

    public void As(int n) {
        this.gFp = n;
    }

    public ldv eaL() {
        return this.pBR;
    }

    public void tC(ldv ldv2) {
        this.pBR = ldv2;
    }

    public int eaM() {
        return this.pBS;
    }

    public void Ya(int n) {
        this.pBS = n;
    }

    public int eaN() {
        return this.pBT;
    }

    public void Yb(int n) {
        this.pBT = n;
    }
}


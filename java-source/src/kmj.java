/*
 * Decompiled with CFR.
 */
public class kmj
extends kmn {
    public static final int iWB = 1;
    public static final int jbZ = 2;
    public static final int jca = 4;
    public static final int jcb = 8;
    public static final int jcc = 16;
    public static final int pNi = 32;
    public static final int pNj = 64;
    public static final int pNk = 128;
    public static final int pNl = 256;
    public int pNm = 0;
    public ljq jce = null;
    private boolean biD = false;
    public float pNn = 0.0f;
    public boolean fXZ = true;
    public boolean fYa = true;
    public boolean gBD = false;
    public boolean jcg = false;
    public boolean jch = false;
    public ljq jci = null;
    public float jcj = 0.0f;
    public float jck = 0.0f;
    public int edp;
    private ldv pNo;
    private boolean pNp = true;
    private float pNq = 1.0f;

    kmj() {
        this.Jv(3329);
    }

    public void tE(ldv ldv2) {
        this.pNo = ldv2;
    }

    public int edG() {
        return this.pNm;
    }

    public void Zf(int n) {
        this.pNm = n;
    }

    public ljq bSW() {
        return this.jce;
    }

    public void cN(ljq ljq2) {
        this.jce = ljq2;
    }

    public boolean bmv() {
        return this.biD;
    }

    public void aO(boolean bl) {
        this.biD = bl;
    }

    public float edH() {
        return this.pNn;
    }

    public void mC(float f) {
        this.pNn = f;
    }

    public boolean bgI() {
        return this.fXZ;
    }

    public void ho(boolean bl) {
        this.fXZ = bl;
    }

    public boolean bgJ() {
        return this.fYa;
    }

    public void hp(boolean bl) {
        this.fYa = bl;
    }

    public boolean isCapForceToXZPlane() {
        return this.gBD;
    }

    public void setCapForceToXZPlane(boolean bl) {
        this.gBD = bl;
    }

    public boolean bSZ() {
        return this.jcg;
    }

    public void lE(boolean bl) {
        this.jcg = bl;
    }

    public boolean bTa() {
        return this.jch;
    }

    public void lF(boolean bl) {
        this.jch = bl;
    }

    public ljq bTb() {
        return this.jci;
    }

    public void cO(ljq ljq2) {
        this.jci = ljq2;
    }

    public float bTc() {
        return this.jcj;
    }

    public void jn(float f) {
        this.jcj = f;
    }

    public float bTd() {
        return this.jck;
    }

    public void jo(float f) {
        this.jck = f;
    }

    public boolean edI() {
        return this.pNp;
    }

    public void xn(boolean bl) {
        this.pNp = bl;
    }

    public float edJ() {
        return this.pNq;
    }

    public void ip(float f) {
        this.pNq = f;
    }
}


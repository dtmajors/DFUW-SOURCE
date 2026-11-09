/*
 * Decompiled with CFR.
 */
public class kil
extends kii {
    public static final int pAQ = 1;
    public static final int pAR = 2;
    public static final int pAS = 4;
    public static final int goA = 8;
    public static final int goz = 16;
    public static final int pzO = 32;
    public static final int pAT = 64;
    public static final int pAU = 128;
    public static final int pAV = 256;
    public static final int pAW = 512;
    public static final int pAX = 1024;
    public static final int pAY = 2048;
    public static final int pAZ = 4096;
    private int pBa = 0;
    private boolean Active = false;
    private float gFD = 0.0f;
    private float gFE = 0.0f;
    private float gFF = 0.0f;
    private ljq my = null;
    private ljq Position = null;
    private ljq Qe = null;
    private float gFL = 1.0f;
    private float gFK = 200.0f;
    private int gFJ = 128;
    private float pBb = 1.0f;
    private boolean pBc = false;
    private float EnvironmentalVolume = 0.5f;

    kil() {
        this.Jv(1284);
    }

    public int eau() {
        return this.pBa;
    }

    public void XS(int n) {
        this.pBa = n;
    }

    public boolean isActive() {
        return this.Active;
    }

    public void setActive(boolean bl) {
        this.Active = bl;
    }

    public float bpl() {
        return this.gFD;
    }

    public void hg(float f) {
        this.gFD = f;
    }

    public float bpm() {
        return this.gFE;
    }

    public void hh(float f) {
        this.gFE = f;
    }

    public float bpn() {
        return this.gFF;
    }

    public void hi(float f) {
        this.gFF = f;
    }

    public ljq getRotation() {
        return this.my;
    }

    public void setRotation(ljq ljq2) {
        this.my = ljq2;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public ljq Up() {
        return this.Qe;
    }

    public void bi(ljq ljq2) {
        this.Qe = ljq2;
    }

    public float eat() {
        return this.gFL;
    }

    public void mc(float f) {
        this.gFL = f;
    }

    public int ear() {
        return this.gFJ;
    }

    public void XR(int n) {
        this.gFJ = n;
    }

    public float eas() {
        return this.gFK;
    }

    public void mb(float f) {
        this.gFK = f;
    }

    public final float eav() {
        return this.pBb;
    }

    public final void md(float f) {
        this.pBb = f;
    }

    public boolean eaw() {
        return this.pBc;
    }

    public void wM(boolean bl) {
        this.pBc = bl;
    }

    public float eax() {
        return this.EnvironmentalVolume;
    }

    public void me(float f) {
        this.EnvironmentalVolume = f;
    }
}


/*
 * Decompiled with CFR.
 */
public class kic
extends kii {
    public static final int pzJ = 1;
    public static final int pzK = 2;
    public static final int goz = 4;
    public static final int pzL = 8;
    public static final int pzM = 16;
    public static final int pzN = 32;
    public static final int pzO = 64;
    public static final int pzP = 128;
    public static final int pzQ = 256;
    public static final int pzR = 512;
    private int pzS = 0;
    private float bpE = 0.0f;
    private float aSc = 0.0f;
    private ljq Position = null;
    private int eMf = 0;
    private int eMg = 0;
    private ljq eMh = null;
    private long dKH = 0L;
    private ljq Qe = null;
    private long pzT = 0L;
    private int dKI = 0;
    private float dKJ = 1.0f;

    kic() {
        this.Jv(1283);
    }

    public int dZX() {
        return this.pzS;
    }

    public void XH(int n) {
        this.pzS = n;
    }

    public float getMaxDistance() {
        return this.bpE;
    }

    public void setMaxDistance(float f) {
        this.bpE = f;
    }

    public float getMinDistance() {
        return this.aSc;
    }

    public void setMinDistance(float f) {
        this.aSc = f;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public int getInsideConeAngle() {
        return this.eMf;
    }

    public void setInsideConeAngle(int n) {
        this.eMf = n;
    }

    public int getOutsideConeAngle() {
        return this.eMg;
    }

    public void setOutsideConeAngle(int n) {
        this.eMg = n;
    }

    public ljq getConeOrientation() {
        return this.eMh;
    }

    public void setConeOrientation(ljq ljq2) {
        this.eMh = ljq2;
    }

    public long getConeOutsideVolume() {
        return this.dKH;
    }

    public void setConeOutsideVolume(long l) {
        this.dKH = l;
    }

    public ljq Up() {
        return this.Qe;
    }

    public void bi(ljq ljq2) {
        this.Qe = ljq2;
    }

    public long dZY() {
        return this.pzT;
    }

    public void at(long l) {
        this.pzT = l;
    }

    public int axv() {
        return this.dKI;
    }

    public void mU(int n) {
        this.dKI = n;
    }

    public float axw() {
        return this.dKJ;
    }

    public void dh(float f) {
        this.dKJ = f;
    }
}


/*
 * Decompiled with CFR.
 */
public class krt
extends ksk {
    public static final int pYq = 1;
    public static final int pYr = 2;
    public static final int pYs = 1;
    public static final int pYJ = 2;
    public static final int pYK = 4;
    private int pYL;
    private int pYM;
    private boolean pYC;
    private boolean pYN;
    private boolean gRm;
    private boolean gnB;
    private boolean gnC;
    private boolean gnD;
    private float bpE;
    private float aSc;
    private ljq Position;
    private int eMf;
    private int eMg;
    private ljq eMh;
    private long dKH;
    private ljq Qe;
    private int eW;
    private int dKI = 0;
    private float dKJ = 1.0f;
    private boolean gnI = false;

    public krt() {
        this.pZN = 14;
    }

    public int egu() {
        return this.pYL;
    }

    public void aaD(int n) {
        this.pYL = n;
    }

    public int egv() {
        return this.pYM;
    }

    public void aaE(int n) {
        this.pYM = n;
    }

    public boolean egm() {
        return this.pYC;
    }

    public void xC(boolean bl) {
        this.pYC = bl;
    }

    public boolean egw() {
        return this.pYN;
    }

    public void xE(boolean bl) {
        this.pYN = bl;
    }

    public boolean buM() {
        return this.gRm;
    }

    public void wL(boolean bl) {
        this.gRm = bl;
    }

    public boolean isEnableModifyFrequency() {
        return this.gnB;
    }

    public void setEnableModifyFrequency(boolean bl) {
        this.gnB = bl;
    }

    public boolean isEnableModifyPan() {
        return this.gnC;
    }

    public void setEnableModifyPan(boolean bl) {
        this.gnC = bl;
    }

    public boolean isEnableModifyVolume() {
        return this.gnD;
    }

    public void setEnableModifyVolume(boolean bl) {
        this.gnD = bl;
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

    public void setConeOutsideVolume(long l2) {
        this.dKH = l2;
    }

    public ljq Up() {
        return this.Qe;
    }

    public void bi(ljq ljq2) {
        this.Qe = ljq2;
    }

    public int getMode() {
        return this.eW;
    }

    public void setMode(int n) {
        this.eW = n;
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
        if (this.dKJ < 0.0f) {
            this.dKJ = 0.0f;
        }
        if (this.dKJ > 1.0f) {
            this.dKJ = 1.0f;
        }
    }

    public boolean blz() {
        return this.gnI;
    }

    public void hN(boolean bl) {
        this.gnI = bl;
    }
}


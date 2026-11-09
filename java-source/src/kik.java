/*
 * Decompiled with CFR.
 */
public class kik
extends kii {
    public static final int pAO = 1;
    private int pAP = 0;
    private boolean Active = true;
    private float gFD = 0.0f;
    private float gFE = 1.0f;
    private float gFF = 1.0f;
    private ljq gFG = null;
    private ljq gFH = null;
    private ljq Position = null;
    private ljq Qe = null;
    private float gFL = 1.0f;
    private float gFK = 200.0f;
    private int gFJ = 128;

    kik() {
        this.Jv(1285);
    }

    public int eaq() {
        return this.pAP;
    }

    public void XQ(int n) {
        this.pAP = n;
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

    public ljq bpo() {
        return this.gFG;
    }

    public void ce(ljq ljq2) {
        this.gFG = ljq2;
    }

    public ljq bpp() {
        return this.gFH;
    }

    public void cf(ljq ljq2) {
        this.gFH = ljq2;
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

    public float eat() {
        return this.gFL;
    }

    public void mc(float f) {
        this.gFL = f;
    }
}


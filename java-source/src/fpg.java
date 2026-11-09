/*
 * Decompiled with CFR.
 */
public class fpg
extends fpe {
    public static final int iSL = 1;
    public static final int iSM = 2;
    public static final int iSN = 4;
    public static final int iSO = 8;
    public static final int iSP = 16;
    public static final int iSQ = 32;
    public static final int iGX = 64;
    public static final int goz = 128;
    public static final int iSR = 256;
    public static final int iSS = 512;
    public static final int iST = 1024;
    public static final int iSU = 2048;
    public static final int iSV = 4096;
    public static final int iSW = 8192;
    public static final int iSX = 16384;
    public static final int iSY = 32768;
    public static final int iSZ = 65536;
    public static final int iTa = 131072;
    public static final int iTb = 262144;
    protected int ikF = 0;
    protected lco gUA = new lco();
    protected lco gUB = new lco();
    protected lco gUC = new lco();
    protected lco goY = new lco();
    protected lco gpa = new lco();
    protected ljr gUF = new ljr();
    protected ljr gUG = new ljr();
    protected float gpZ = 0.0f;
    protected float gUO = 0.0f;
    protected float gVe = 0.0f;
    protected float gVf = 0.0f;
    protected ljq gUN = new ljq();
    protected ljq mx = new ljq();
    protected ljq Position = new ljq();
    protected boolean iTc = false;
    protected ljr gUP = new ljr(0.0f, 0.0f, 0.0f, 0.0f);

    fpg() {
        super(1537);
    }

    public int bQL() {
        return this.ikF;
    }

    public void Hl(int n) {
        this.ikF = n;
    }

    public lco bws() {
        return this.gUA;
    }

    public void i(lco lco2) {
        this.gUA = lco2;
    }

    public lco bwo() {
        return this.gUB;
    }

    public void j(lco lco2) {
        this.gUB = lco2;
    }

    public lco bmL() {
        return this.goY;
    }

    public void g(lco lco2) {
        this.goY = lco2;
    }

    public lco bwp() {
        return this.gUC;
    }

    public void k(lco lco2) {
        this.gUC = lco2;
    }

    public ljq bpa() {
        return this.mx;
    }

    public void cq(ljq ljq2) {
        this.mx = ljq2;
    }

    public float getRange() {
        return this.gpZ;
    }

    public void setRange(float f) {
        this.gpZ = f;
    }

    public ljq bwv() {
        return this.gUN;
    }

    public void ct(ljq ljq2) {
        this.gUN = ljq2;
    }

    public float bww() {
        return this.gUO;
    }

    public void hH(float f) {
        this.gUO = f;
    }

    public float bwy() {
        return this.gVe;
    }

    public void hI(float f) {
        this.gVe = f;
    }

    public float bwz() {
        return this.gVf;
    }

    public void hJ(float f) {
        this.gVf = f;
    }

    public boolean bQM() {
        return this.iTc;
    }

    public void ln(boolean bl) {
        this.iTc = bl;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public ljr bmN() {
        return this.gUP;
    }

    public void e(ljr ljr2) {
        this.gUP = ljr2;
    }

    public lco bmM() {
        return this.gpa;
    }

    public void h(lco lco2) {
        this.gpa = lco2;
    }

    public ljr bmJ() {
        return this.gUF;
    }

    public void c(ljr ljr2) {
        this.gUF = ljr2;
    }

    public ljr bmK() {
        return this.gUG;
    }

    public void d(ljr ljr2) {
        this.gUG = ljr2;
    }
}


/*
 * Decompiled with CFR.
 */
public abstract class kkh
extends kkj {
    protected ljq Position = new ljq();
    protected ljq my = new ljq();
    protected ljq mx = new ljq();
    protected ljq pFZ = new ljq();
    protected ljq pGa = new ljq();
    protected ljq pGb = new ljq();
    protected ljq gUN = new ljq();
    protected ljr gUP = new ljr();
    protected ljq gUD = new ljq();
    protected ljr gUF = new ljr();
    protected ljq gUE = new ljq();
    protected ljr gUG = new ljr();
    protected float gpZ = 10.0f;
    protected float gUO = 1.0f;
    protected float gVe = 0.5f;
    protected float gVf = 0.4f;
    protected boolean gUI = true;
    protected float pGc = 0.0f;

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public ljq getRotation() {
        return this.my;
    }

    public void setRotation(ljq ljq2) {
        this.my = ljq2;
    }

    public ljq bpa() {
        return this.mx;
    }

    public void cq(ljq ljq2) {
        this.mx = ljq2;
    }

    public ljq ebQ() {
        return this.pFZ;
    }

    public void dk(ljq ljq2) {
        this.pFZ = ljq2;
    }

    public ljq ebR() {
        return this.pGa;
    }

    public void dl(ljq ljq2) {
        this.pGa = ljq2;
    }

    public ljq ebS() {
        return this.pGb;
    }

    public void dm(ljq ljq2) {
        this.pGb = ljq2;
    }

    public ljq bwv() {
        return this.gUN;
    }

    public void ct(ljq ljq2) {
        this.gUN = ljq2;
    }

    public ljr bmN() {
        return this.gUP;
    }

    public void e(ljr ljr2) {
        this.gUP = ljr2;
    }

    public ljr bmJ() {
        return this.gUF;
    }

    public void c(ljr ljr2) {
        this.gUF = ljr2;
    }

    public ljq bwt() {
        return this.gUD;
    }

    public void cr(ljq ljq2) {
        this.gUD = ljq2;
    }

    public ljq bwu() {
        return this.gUE;
    }

    public void cs(ljq ljq2) {
        this.gUE = ljq2;
    }

    public ljr bmK() {
        return this.gUG;
    }

    public void d(ljr ljr2) {
        this.gUG = ljr2;
    }

    public float getRange() {
        return this.gpZ;
    }

    public void setRange(float f) {
        this.gpZ = f;
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

    public boolean isOn() {
        return this.gUI;
    }

    public void hX(boolean bl) {
        this.gUI = bl;
    }

    public float bmI() {
        return this.pGc;
    }

    public void gt(float f) {
        this.pGc = f;
    }
}


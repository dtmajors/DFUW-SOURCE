/*
 * Decompiled with CFR.
 */
public class krj
extends krp {
    public ldv aCE = null;
    public ldv Rs = null;
    public ljq Position = null;
    public lgl Rotation = null;
    public ljq bis = null;
    public float bit = 0.0f;
    public float akO = 0.0f;
    public float pXT = 0.0f;
    public float gEV = 0.0f;
    public boolean pXN = false;
    public boolean pXO = false;
    public boolean pXP = false;
    public ldv[] biw = null;
    public boolean pXQ = true;
    public boolean pXR = true;
    public int pCY = 0;
    public ljq pXS = new ljq(0.0f, 0.0f, 0.0f);
    public float bix = 0.0f;

    krj() {
        this.Jv(2308);
    }

    @Override
    public void ts(ldv ldv2) {
        super.ts(ldv2);
        this.aCE = ldv2;
    }

    public ldv oq() {
        return this.Rs;
    }

    public void hC(ldv ldv2) {
        this.Rs = ldv2;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public lgl aw() {
        return this.Rotation;
    }

    public void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public ljq getStartDirection() {
        return this.bis;
    }

    public void setStartDirection(ljq ljq2) {
        this.bis = ljq2;
    }

    public float aCn() {
        return this.bit;
    }

    public void ab(float f) {
        this.bit = f;
    }

    public float aCc() {
        return this.akO;
    }

    public void dy(float f) {
        this.akO = f;
    }

    public float efZ() {
        return this.pXT;
    }

    public void mM(float f) {
        this.pXT = f;
    }

    public float boA() {
        return this.gEV;
    }

    public void gS(float f) {
        this.gEV = f;
    }

    public boolean efV() {
        return this.pXN;
    }

    public void xx(boolean bl) {
        this.pXN = bl;
    }

    public boolean efW() {
        return this.pXO;
    }

    public void xy(boolean bl) {
        this.pXO = bl;
    }

    public boolean efX() {
        return this.pXP;
    }

    public void xz(boolean bl) {
        this.pXP = bl;
    }

    public ldv[] aCx() {
        return this.biw;
    }

    public void c(ldv[] ldvArray) {
        this.biw = ldvArray;
    }

    public ldv sV() {
        return this.aCE;
    }

    public void jv(ldv ldv2) {
        this.aCE = ldv2;
    }

    public ljq efY() {
        return this.pXS;
    }

    public void dA(ljq ljq2) {
        this.pXS = ljq2;
    }

    public float Bf() {
        return this.bix;
    }

    public void ad(float f) {
        this.bix = f;
    }
}


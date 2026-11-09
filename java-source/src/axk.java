/*
 * Decompiled with CFR.
 */
public abstract class axk
extends btk {
    protected String bhD = null;
    protected String crX = null;
    protected ldv crY = null;
    protected ljq bhF = null;
    private int crZ = -1;
    protected float bhG = 0.0f;
    protected ayb bhH = ayb.cvi;
    protected ldv csa = null;
    protected ljq csb = null;
    private int csc = -1;
    private int csd = -1;

    public String Xt() {
        return this.bhD;
    }

    public void cz(String string) {
        this.bhD = string;
    }

    public float Xu() {
        return this.bhG;
    }

    public void X(float f) {
        this.bhG = f;
    }

    public ljq Xv() {
        return this.bhF;
    }

    public void al(ljq ljq2) {
        this.bhF = ljq2;
    }

    public ldv Xw() {
        return this.crY;
    }

    public void dp(ldv ldv2) {
        this.crY = ldv2;
    }

    public int Xx() {
        return this.crZ;
    }

    public void iq(int n) {
        this.crZ = n;
    }

    public String Xy() {
        return this.crX;
    }

    public void eD(String string) {
        this.crX = string;
    }

    public ayb Xz() {
        return this.bhH;
    }

    public void a(ayb ayb2) {
        this.bhH = ayb2 == null ? this.bhH : ayb2;
    }

    public final ldv XA() {
        return this.csa;
    }

    public final void dq(ldv ldv2) {
        this.csa = ldv2;
    }

    public final ljq XB() {
        return this.csb;
    }

    public final void aF(ljq ljq2) {
        this.csb = ljq2;
    }

    public final int XC() {
        return this.csc;
    }

    public final void ir(int n) {
        this.csc = n;
    }

    public final int XD() {
        return this.csd;
    }

    public final void is(int n) {
        this.csd = n;
    }

    public axk() {
        this.ObjectType = 105;
    }

    public azg XE() {
        azg azg2 = new azg();
        azg2.setGUID(this.GUID);
        azg2.setID(this.bhD);
        azg2.e(this.bhH);
        azg2.c(this.bhF);
        azg2.setRadius(this.bhG);
        azg2.ch(this.crY);
        azg2.g(new ldv[0]);
        azg2.dq(this.csa);
        azg2.aF(this.csb);
        azg2.ir(this.csc);
        azg2.is(this.csd);
        return azg2;
    }
}


/*
 * Decompiled with CFR.
 */
public class klh
extends kld {
    public static final int jxJ = 1;
    public static final int jxK = 2;
    public static final int jxL = 4;
    public static final int jxM = 8;
    public static final int jxN = 16;
    public static final int jxO = 32;
    private int jxP;
    private float Radius;
    private float gPr;
    private float gPs;
    private float gPt;
    private float gPu;
    private int gPv;
    private int gPw;
    private int gPx;
    private int gPy;
    private ljq Position;
    private ljq my;
    protected boolean dsK = false;

    klh() {
        this.Jv(1033);
    }

    public int bZg() {
        return this.jxP;
    }

    public void Lj(int n) {
        this.jxP = n;
    }

    public float getRadius() {
        return this.Radius;
    }

    public void setRadius(float f) {
        this.Radius = f;
    }

    public float buq() {
        return this.gPr;
    }

    public void hp(float f) {
        this.gPr = f;
    }

    public int bus() {
        return this.gPv;
    }

    public void Bu(int n) {
        this.gPv = n;
    }

    public int but() {
        return this.gPw;
    }

    public void Bv(int n) {
        this.gPw = n;
    }

    public float getWidth() {
        return this.gPs;
    }

    public void setWidth(float f) {
        this.gPs = f;
    }

    public float getHeight() {
        return this.gPt;
    }

    public void hq(float f) {
        this.gPt = f;
    }

    public float bur() {
        return this.gPu;
    }

    public void hr(float f) {
        this.gPu = f;
    }

    public int buu() {
        return this.gPx;
    }

    public void Bw(int n) {
        this.gPx = n;
    }

    public int buv() {
        return this.gPy;
    }

    public void Bx(int n) {
        this.gPy = n;
    }

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

    public boolean bUm() {
        return this.dsK;
    }

    public void lQ(boolean bl) {
        this.dsK = bl;
    }
}


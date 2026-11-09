/*
 * Decompiled with CFR.
 */
public class gtp
extends gtn {
    protected ljq Position = null;
    protected ljq my = null;
    protected float daN = -1.0f;
    protected String jrw = null;
    protected String jrx = null;
    protected String jry = null;
    protected ldv jrz = null;
    protected int jrA = -1;
    protected int jrB = -1;
    protected float jrC = -1.0f;
    protected float jrD = -1.0f;
    protected float jrE = -1.0f;

    gtp() {
        super(8969);
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

    public float getScale() {
        return this.daN;
    }

    public void setScale(float f) {
        this.daN = f;
    }

    public String bXu() {
        return this.jrw;
    }

    public void lh(String string) {
        this.jrw = string;
    }

    public String bXv() {
        return this.jrx;
    }

    public void li(String string) {
        this.jrx = string;
    }

    public String bXw() {
        return this.jry;
    }

    public void lj(String string) {
        this.jry = string;
    }

    public ldv bXx() {
        return this.jrz;
    }

    public void qz(ldv ldv2) {
        this.jrz = ldv2;
    }

    public int bXy() {
        return this.jrA;
    }

    public void KE(int n) {
        this.jrA = n;
    }

    public int bXz() {
        return this.jrB;
    }

    public void KF(int n) {
        this.jrB = n;
    }

    public float bXA() {
        return this.jrC;
    }

    public void jF(float f) {
        this.jrC = f;
    }

    public float bXB() {
        return this.jrD;
    }

    public void jG(float f) {
        this.jrD = f;
    }

    public float bXC() {
        return this.jrE;
    }

    public void jH(float f) {
        this.jrE = f;
    }
}


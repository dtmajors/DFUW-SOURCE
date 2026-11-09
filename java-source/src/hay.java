/*
 * Decompiled with CFR.
 */
public class hay
extends hac {
    private int aYG;
    private ljq aZH;
    private ljq aZD;
    private ldv gYb;
    private ldv jzM;
    private float doT = -2.0f;
    private lgl gfq;
    private ldv aUa;
    private boolean jzN = false;
    private boolean jzO = false;
    private float bqb = 2.0f;

    hay() {
        super(4117);
    }

    public void setSourceRotation(lgl lgl2) {
        this.gfq = lgl2;
    }

    public lgl getSourceRotation() {
        return this.gfq;
    }

    public void setVelocity(float f2) {
        this.bqb = f2;
    }

    public float getVelocity() {
        return this.bqb;
    }

    public void mR(boolean bl) {
        this.jzO = bl;
    }

    public boolean caA() {
        return this.jzO;
    }

    public final float getDuration() {
        return this.doT;
    }

    public final void setDuration(float f2) {
        this.doT = f2;
    }

    public final int CD() {
        return this.aYG;
    }

    public final void fJ(int n) {
        this.aYG = n;
    }

    public final ljq getSourcePosition() {
        return this.aZH;
    }

    public final void setSourcePosition(ljq ljq2) {
        this.aZH = ljq2;
    }

    public final ldv bjZ() {
        return this.aUa;
    }

    public final void my(ldv ldv2) {
        this.aUa = ldv2;
    }

    public final ljq getTargetPosition() {
        return this.aZD;
    }

    public final void setTargetPosition(ljq ljq2) {
        this.aZD = ljq2;
    }

    public ldv caB() {
        return this.jzM;
    }

    public void qQ(ldv ldv2) {
        this.jzM = ldv2;
    }

    public ldv byr() {
        return this.gYb;
    }

    public void nO(ldv ldv2) {
        this.gYb = ldv2;
    }

    public void mS(boolean bl) {
        this.jzN = bl;
    }

    public boolean caC() {
        return this.jzN;
    }
}


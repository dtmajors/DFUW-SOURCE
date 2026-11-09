/*
 * Decompiled with CFR.
 */
public class glh
extends glc
implements dxu {
    public int aqs = -1;
    public int SpecialEffectType = 0;
    public ldv aUa = null;
    public ldv akX = null;
    public ljq aZD = null;
    public double oV = 0.0;
    public boolean jkR = true;
    public boolean jkQ = false;
    public int jkS = 0;
    public ldv aZG = null;
    public ljq aZH = null;
    public lgl gfq = null;
    public float doT = 0.0f;
    public float biu = 0.0f;
    public float gfr = 0.0f;
    public ldv gfs = null;

    glh() {
        super(13057);
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public int getSpecialEffectType() {
        return this.SpecialEffectType;
    }

    public void setSpecialEffectType(int n) {
        this.SpecialEffectType = n;
    }

    public ldv bjZ() {
        return this.aUa;
    }

    public void my(ldv ldv2) {
        this.aUa = ldv2;
    }

    public ldv getTargetObjectGUID() {
        return this.akX;
    }

    public void setTargetObjectGUID(ldv ldv2) {
        this.akX = ldv2;
    }

    public ljq getTargetPosition() {
        return this.aZD;
    }

    public void setTargetPosition(ljq ljq2) {
        this.aZD = ljq2;
    }

    public double aAw() {
        return this.oV;
    }

    public void o(double d2) {
        this.oV = d2;
    }

    public boolean bVJ() {
        return this.jkR;
    }

    public void mj(boolean bl) {
        this.jkR = bl;
    }

    public boolean bVK() {
        return this.jkQ;
    }

    public void mk(boolean bl) {
        this.jkQ = bl;
    }

    public int bVL() {
        return this.jkS;
    }

    public void JQ(int n) {
        this.jkS = n;
    }

    public ldv getSourceObjectGUID() {
        return this.aZG;
    }

    public void setSourceObjectGUID(ldv ldv2) {
        this.aZG = ldv2;
    }

    public ljq getSourcePosition() {
        return this.aZH;
    }

    public void setSourcePosition(ljq ljq2) {
        this.aZH = ljq2;
    }

    public lgl getSourceRotation() {
        return this.gfq;
    }

    public void setSourceRotation(lgl lgl2) {
        this.gfq = lgl2;
    }

    public float getDuration() {
        return this.doT;
    }

    public void setDuration(float f) {
        this.doT = f;
    }

    public float getPower() {
        return this.biu;
    }

    public void setPower(float f) {
        this.biu = f;
    }

    public float getPowerRadius() {
        return this.gfr;
    }

    public void setPowerRadius(float f) {
        this.gfr = f;
    }

    public ldv bVM() {
        return this.gfs;
    }

    public void qq(ldv ldv2) {
        this.gfs = ldv2;
    }
}


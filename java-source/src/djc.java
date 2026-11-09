/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class djc
extends dgj {
    private dfo grP = null;
    private String fFC = null;
    private int grQ = 1;
    private lcq eoo = null;
    private lcq eop = null;
    private int gtp = 1;
    private float gsE = 1.0f;
    private float gsf = 1.0f;
    private float doW = 1.0f;
    private float doX = 1.0f;
    private float gsw = 0.0f;
    private float gsx = 0.0f;
    private float gsy = 0.0f;
    private float gsz = 0.0f;
    private float gsA = 0.0f;
    private float dKD = 1.0f;
    private float gtq = 1.0f;
    private float gAP = 0.0f;
    private float gvj = 0.0f;
    private float gvk = 0.0f;
    boolean gsH = false;
    private boolean gsg = false;
    private float gsh = 0.0f;
    private double gvp;
    private double gvq;
    protected dky grJ = null;

    djc() {
        this.gqB = 14;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeObject();
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.createObject();
        if (this.isRelationEffect()) {
            this.setupPositionalRelation(this.getTargetObjectGUID(), this.grP.getGUID(), this.getMainEffectObjectType());
            if (this.gAP > 0.0f) {
                this.grJ = this.setupPositionalSensorOnTargetObject();
            }
        }
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        if (!this.gqU && this.isCameraReady() && !this.isRelationEffect()) {
            float f = ljq.s(this.getTargetPosition(), this.getCameraReadOnlyPosition());
            if (f < this.getMaxCamDistUpdateSpecialEffect()) {
                this.updateObject();
            }
        } else {
            this.updateObject();
        }
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void removeObject() {
        if (this.grP != null) {
            dey.bls().b(this.grP);
            this.grP = null;
        }
    }

    protected void createObject() {
        this.grP = (dfo)dKP.Af(14);
        this.grP.setGUID(this.getMainAtomGuid());
        this.grP.setActive(true);
        this.grP.setEndColor(this.eop);
        this.grP.setEndRotation(this.gsx);
        this.grP.setEndScale(this.doX);
        this.grP.setGravityInfluence(0.0f);
        this.grP.setNumParticles(this.gtp);
        this.grP.setNumTextures(this.grQ);
        this.grP.setParticleAcceleration(0.0f);
        this.grP.setParticleLifeTime(this.gsE);
        if (this.hasInfiniteDuration()) {
            this.grP.gr(this.dKD);
        } else {
            this.gvp = this.getDuration() * this.gvj;
            this.gvq = this.getDuration() * (1.0f - this.gvk);
            this.grP.gr(0.0f);
        }
        this.grP.bL(this.getTargetPosition());
        this.grP.bQ(new ljq(0.0f, 0.0f, 0.0f));
        this.grP.gs(this.gtq);
        this.grP.setPullAcceleration(this.gAP);
        this.grP.bR(this.getTargetPosition());
        this.grP.setRotationTurbulencePercent(this.gsy);
        this.grP.setScaleTurbulencePercent(this.gsz);
        this.grP.setColorTurbulencePercent(this.gsA);
        this.grP.setStartColor(this.eoo);
        this.grP.setStartRotation(this.gsw);
        this.grP.setStartScale(this.doW);
        this.grP.setTextureName(this.fFC);
        this.grP.setWindInfluence(0.0f);
        this.grP.setAnimationFrequency(this.gsf);
        this.grP.hQ(this.gsg);
        this.grP.gn(this.gsh);
        this.sendAtomOverideToChildren(this.grP);
        this.MessageDelegator.a(this.grP);
    }

    protected void updateObject() {
        if (!this.hasInfiniteDuration()) {
            float f = this.calculateTimeVal(this.gvp, this.gvq);
            this.grP.gr(this.dKD * f);
            if (lcq.d(this.getStartColor(), this.getEndColor())) {
                lcq lcq2 = lcq.a(this.eop, this.eoo, f);
                this.grP.setStartColor(lcq2);
            } else {
                lcq lcq3 = lcq.a(this.eoo, this.eop, f);
                this.grP.setEndColor(lcq3);
            }
        }
        if (this.grJ != null) {
            this.grP.bR(this.grJ.av());
        }
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.fFC = null;
        this.grQ = 1;
        this.eoo = lcq.BRIGHT_WHITE;
        this.eop = lcq.BRIGHT_WHITE;
        this.gtp = 1;
        this.gsE = 1.0f;
        this.gsf = 1.0f;
        this.doW = 1.0f;
        this.doX = 1.0f;
        this.gsw = 0.0f;
        this.gsx = 0.0f;
        this.gsy = 0.0f;
        this.gsz = 0.0f;
        this.gsA = 0.0f;
        this.dKD = 1.0f;
        this.gtq = 1.0f;
        this.gAP = 0.0f;
        this.gvj = 0.4f;
        this.gvk = 0.4f;
        this.gsH = false;
        this.gsg = false;
        this.gsh = 0.0f;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        djc djc2 = (djc)dgj2;
        djc2.fFC = this.fFC;
        djc2.grQ = this.grQ;
        djc2.eoo = this.eoo;
        djc2.eop = this.eop;
        djc2.gtp = this.gtp;
        djc2.gsE = this.gsE;
        djc2.gsf = this.gsf;
        djc2.doW = this.doW;
        djc2.doX = this.doX;
        djc2.gsw = this.gsw;
        djc2.gsx = this.gsx;
        djc2.gsy = this.gsy;
        djc2.gsz = this.gsz;
        djc2.gsA = this.gsA;
        djc2.dKD = this.dKD;
        djc2.gtq = this.gtq;
        djc2.gAP = this.gAP;
        djc2.gvj = this.gvj;
        djc2.gvk = this.gvk;
        djc2.gsH = this.gsH;
        djc2.gsg = this.gsg;
        djc2.gsh = this.gsh;
    }

    public float getColorTurbulencePercent() {
        return this.gsA;
    }

    public void setColorTurbulencePercent(float f) {
        this.gsA = f;
    }

    public lcq getEndColor() {
        return this.eop;
    }

    public void setEndColor(lcq lcq2) {
        this.eop = lcq2;
    }

    public float getEndRotation() {
        return this.gsx;
    }

    public void setEndRotation(float f) {
        this.gsx = f;
    }

    public float getEndScale() {
        return this.doX;
    }

    public void setEndScale(float f) {
        this.doX = f;
    }

    public float getExpandPercentTime() {
        return this.gvj;
    }

    public void setExpandPercentTime(float f) {
        this.gvj = f;
    }

    public float getLifeTime() {
        return this.gsE;
    }

    public void setLifeTime(float f) {
        this.gsE = f;
    }

    public float getMaxRadius() {
        return this.dKD;
    }

    public void setMaxRadius(float f) {
        this.dKD = f;
    }

    public int getNumParticles() {
        return this.gtp;
    }

    public void setNumParticles(int n) {
        this.gtp = n;
    }

    public int getNumTextures() {
        return this.grQ;
    }

    public void setNumTextures(int n) {
        this.grQ = n;
    }

    public float getPullAcceleration() {
        return this.gAP;
    }

    public void setPullAcceleration(float f) {
        this.gAP = f;
    }

    public float getRetractPercentTime() {
        return this.gvk;
    }

    public void setRetractPercentTime(float f) {
        this.gvk = f;
    }

    public float getRotationTurbulencePercent() {
        return this.gsy;
    }

    public void setRotationTurbulencePercent(float f) {
        this.gsy = f;
    }

    public float getScaleTurbulencePercent() {
        return this.gsz;
    }

    public void setScaleTurbulencePercent(float f) {
        this.gsz = f;
    }

    public lcq getStartColor() {
        return this.eoo;
    }

    public void setStartColor(lcq lcq2) {
        this.eoo = lcq2;
    }

    public float getStartRotation() {
        return this.gsw;
    }

    public void setStartRotation(float f) {
        this.gsw = f;
    }

    public float getStartScale() {
        return this.doW;
    }

    public void setStartScale(float f) {
        this.doW = f;
    }

    public float getStartSpeed() {
        return this.gtq;
    }

    public void setStartSpeed(float f) {
        this.gtq = f;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public boolean isUsePower() {
        return this.gsH;
    }

    public void setUsePower(boolean bl) {
        this.gsH = bl;
    }

    public float getAnimationFrequency() {
        return this.gsf;
    }

    public void setAnimationFrequency(float f) {
        this.gsf = f;
    }

    public boolean isUseHDRLParticles() {
        return this.gsg;
    }

    public void setUseHDRLParticles(boolean bl) {
        this.gsg = bl;
    }

    public float getMotionBlurModifier() {
        return this.gsh;
    }

    public void setMotionBlurModifier(float f) {
        this.gsh = f;
    }

    public dey getAtom(int n) {
        return this.grP;
    }

    public int getAtomCount() {
        return 1;
    }
}


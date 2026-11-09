/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class djm
extends dgj {
    private dfo grP = null;
    private String fFC = null;
    private int grQ = 1;
    private lcq eoo = null;
    private lcq eop = null;
    private int gtp = 20;
    private float gsE = 1.0f;
    private float gsf = 1.0f;
    private float doW = 1.0f;
    private float doX = 1.0f;
    private float gsw = 0.0f;
    private float gsx = 0.0f;
    private float gsy = 0.0f;
    private float gsz = 0.0f;
    private float gsA = 0.0f;
    private float gsB = 0.5f;
    private float gtq = 1.0f;
    private float gAP = 0.0f;
    private float gwu = 0.1f;
    private float gwv = 0.1f;
    private ljq gAQ = null;
    private ljq grN = null;
    private float gAR = 0.0f;
    private ljq bis = null;
    private boolean gsg = false;
    private float gsh = 0.0f;
    private double gvp;
    private double gvq;

    djm() {
        this.gqB = 29;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeObject();
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        assert (this.getSourcePosition() != null);
        assert (this.getTargetPosition() != null);
        this.createObject();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.updateObject();
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        djm djm2 = (djm)dgj2;
        djm2.fFC = this.fFC;
        djm2.grQ = this.grQ;
        djm2.eoo = this.eoo;
        djm2.eop = this.eop;
        djm2.gtp = this.gtp;
        djm2.gsE = this.gsE;
        djm2.gsf = this.gsf;
        djm2.doW = this.doW;
        djm2.doX = this.doX;
        djm2.gsw = this.gsw;
        djm2.gsx = this.gsx;
        djm2.gsy = this.gsy;
        djm2.gsz = this.gsz;
        djm2.gsA = this.gsA;
        djm2.gsB = this.gsB;
        djm2.gtq = this.gtq;
        djm2.gAP = this.gAP;
        djm2.gwu = this.gwu;
        djm2.gwv = this.gwv;
        djm2.gAQ = this.gAQ;
        djm2.grN = this.grN;
        djm2.gAR = this.gAR;
        djm2.bis = this.bis;
        djm2.gsg = this.gsg;
        djm2.gsh = this.gsh;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.fFC = null;
        this.grQ = 1;
        this.eoo = lcq.BRIGHT_WHITE;
        this.eop = lcq.BRIGHT_WHITE;
        this.gtp = 20;
        this.gsE = 1.0f;
        this.gsf = 1.0f;
        this.doW = 1.0f;
        this.doX = 1.0f;
        this.gsw = 0.0f;
        this.gsx = 0.0f;
        this.gsy = 0.0f;
        this.gsz = 0.0f;
        this.gsA = 0.0f;
        this.gsB = 0.5f;
        this.gtq = 1.0f;
        this.gAP = 0.0f;
        this.gwu = 0.1f;
        this.gwv = 0.1f;
        this.gAQ = new ljq(0.0f, 1.0f, 0.0f);
        this.grN = new ljq(0.0f, 1.0f, 0.0f);
        this.gAR = 0.0f;
        this.bis = new ljq();
        this.gsg = false;
        this.gsh = 0.0f;
    }

    protected void createObject() {
        this.grP = (dfo)dKP.Af(14);
        this.grP.setGUID(this.getMainAtomGuid());
        this.grP.setActive(true);
        this.grP.setEndRotation(this.gsx);
        this.grP.setEndScale(this.doX);
        this.grP.setNumParticles(this.gtp);
        this.grP.setNumTextures(this.grQ);
        this.grP.setParticleLifeTime(this.gsE);
        this.grP.setAnimationFrequency(this.getAnimationFrequency());
        this.grP.gr(this.gsB);
        this.grP.bL(this.getSourcePosition());
        this.grP.setPullAcceleration(this.gAP);
        this.grP.bR(this.getTargetPosition());
        this.grP.setRotationTurbulencePercent(this.gsy);
        this.grP.setScaleTurbulencePercent(this.gsz);
        this.grP.setColorTurbulencePercent(this.gsA);
        this.grP.setStartRotation(this.gsw);
        this.grP.setStartScale(this.doW);
        ljq ljq2 = new ljq(this.getTargetPosition());
        ljq2.et(this.getSourcePosition());
        ljq2.normalize();
        this.grP.gs(this.gtq);
        this.grP.setTextureName(this.fFC);
        this.grP.setWindInfluence(0.0f);
        this.grP.setGravityInfluence(0.0f);
        this.grP.setParticleAcceleration(this.gAR);
        this.grP.bQ(this.bis);
        if (!this.hasInfiniteDuration()) {
            this.grP.setStartColor(this.eoo);
            this.grP.setEndColor(this.eop);
        } else {
            this.gvp = this.getDuration() * this.gwu;
            this.gvq = this.getDuration() * (1.0f - this.gwv);
            float f = this.calculateTimeVal(this.gvp, this.gvq);
            lcq lcq2 = new lcq(this.eoo.r, this.eoo.g, this.eoo.b, 0.0f);
            lcq lcq3 = lcq.a(lcq2, this.eoo, f);
            this.grP.setStartColor(lcq3);
            lcq lcq4 = new lcq(this.eop.r, this.eop.g, this.eop.b, 0.0f);
            lcq lcq5 = lcq.a(lcq4, this.eop, f);
            this.grP.setEndColor(lcq5);
        }
        this.grP.hQ(this.gsg);
        this.grP.gn(this.gsh);
        this.sendAtomOverideToChildren(this.grP);
        this.MessageDelegator.a(this.grP);
    }

    protected void removeObject() {
        if (this.grP != null) {
            dey.bls().b(this.grP);
            this.grP = null;
        }
    }

    protected void updateObject() {
        assert (this.grP != null);
        if (!this.hasInfiniteDuration()) {
            float f = this.calculateTimeVal(this.gvp, this.gvq);
            lcq lcq2 = new lcq(this.eoo.r, this.eoo.g, this.eoo.b, 0.0f);
            lcq lcq3 = lcq.a(lcq2, this.eoo, f);
            this.grP.setStartColor(lcq2);
            lcq lcq4 = new lcq(this.eop.r, this.eop.g, this.eop.b, 0.0f);
            lcq lcq5 = lcq.a(lcq4, this.eop, f);
            this.grP.setEndColor(lcq5);
        }
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

    public float getIntroPercent() {
        return this.gwu;
    }

    public void setIntroPercent(float f) {
        this.gwu = f;
    }

    public float getLifeTime() {
        return this.gsE;
    }

    public void setLifeTime(float f) {
        this.gsE = f;
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

    public float getOffsetScale() {
        return this.gsB;
    }

    public void setOffsetScale(float f) {
        this.gsB = f;
    }

    public float getOuttroPercent() {
        return this.gwv;
    }

    public void setOuttroPercent(float f) {
        this.gwv = f;
    }

    public float getPullAcceleration() {
        return this.gAP;
    }

    public void setPullAcceleration(float f) {
        this.gAP = f;
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

    public ljq getSourceOffset() {
        return this.gAQ;
    }

    public void setSourceOffset(ljq ljq2) {
        this.gAQ = ljq2;
    }

    public ljq getTargetOffset() {
        return this.grN;
    }

    public void setTargetOffset(ljq ljq2) {
        this.grN = ljq2;
    }

    public float getStartAcceleration() {
        return this.gAR;
    }

    public void setStartAcceleration(float f) {
        this.gAR = f;
    }

    public ljq getStartDirection() {
        return this.bis;
    }

    public void setStartDirection(ljq ljq2) {
        this.bis = ljq2;
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


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class djt
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
    private float gsB = 0.5f;
    private float gtq = 1.0f;
    private float doQ = 1.0f;
    private ljq bis = null;
    private float gsu = 0.0f;
    private float gsv = 0.0f;
    private float gsJ = 0.8f;
    private boolean gsH = false;
    private boolean gsg = false;
    private float gsh = 0.0f;

    djt() {
        this.gqB = 44;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeParticle();
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.createParticle();
        assert (this.isRelationEffect());
        assert (this.grP != null);
        this.setDeltaPos(this.getTargetPosition());
        this.setupPositionalRelation(this.getTargetObjectGUID(), this.grP.getGUID(), this.getMainEffectObjectType());
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.updateFadeOut();
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    private void createParticle() {
        assert (this.grP == null);
        this.grP = (dfo)dKP.Af(14);
        this.grP.setGUID(this.getNewEffectGuid());
        this.grP.setActive(true);
        this.grP.setEndColor(this.eop);
        this.grP.setEndRotation(this.gsx);
        this.grP.setEndScale(this.doX);
        this.grP.setGravityInfluence(this.gsv);
        this.grP.setNumParticles(this.gtp);
        this.grP.setNumTextures(this.grQ);
        this.grP.setParticleAcceleration(this.doQ);
        this.grP.setParticleLifeTime(this.gsE);
        this.grP.setAnimationFrequency(this.gsf);
        this.grP.gr(this.gsB);
        this.grP.bL(new ljq());
        this.grP.bQ(this.bis);
        this.grP.gs(this.gtq);
        this.grP.setPullAcceleration(0.0f);
        this.grP.bR(new ljq());
        this.grP.setRotationTurbulencePercent(this.gsy);
        this.grP.setScaleTurbulencePercent(this.gsz);
        this.grP.setColorTurbulencePercent(this.gsA);
        this.grP.setStartColor(this.eoo);
        this.grP.setStartRotation(this.gsw);
        this.grP.setStartScale(this.doW);
        this.grP.setTextureName(this.fFC);
        this.grP.setWindInfluence(this.gsu);
        this.grP.hQ(this.gsg);
        this.grP.gn(this.gsh);
        this.sendAtomOverideToChildren(this.grP);
        this.MessageDelegator.a(this.grP);
    }

    private void updateFadeOut() {
        if (this.hasInfiniteDuration()) {
            return;
        }
        double d2 = this.nx.rgz - this.fC.rgz;
        float f = (float)(d2 / (double)this.getDuration());
        if (f < this.gsJ) {
            return;
        }
        float f2 = (f - this.gsJ) / (1.0f - this.gsJ);
        f2 = lew.A(f2, 0.0f, 1.0f);
        lcq lcq2 = lcq.a(this.eoo, lcq.BLACK_TRANSPARENT, f2);
        this.grP.setStartColor(lcq2);
        this.grP.setEndColor(lcq2);
    }

    private void removeParticle() {
        if (this.grP != null) {
            dey.bls().b(this.grP);
        }
        this.grP = null;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.fFC = null;
        this.grQ = 1;
        this.eoo = lcq.BRIGHT_WHITE;
        this.eop = lcq.BRIGHT_WHITE;
        this.gtp = 1;
        this.gsE = 1.0f;
        this.doW = 1.0f;
        this.doX = 1.0f;
        this.gsw = 0.0f;
        this.gsx = 0.0f;
        this.gsy = 0.0f;
        this.gsz = 0.0f;
        this.gsA = 0.0f;
        this.gsB = 0.5f;
        this.gtq = 1.0f;
        this.doQ = 1.0f;
        this.bis = new ljq();
        this.gsu = 0.0f;
        this.gsv = 0.0f;
        this.gsJ = 0.8f;
        this.gsf = 1.0f;
        this.gsH = false;
        this.gsg = false;
        this.gsh = 0.0f;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        djt djt2 = (djt)dgj2;
        djt2.fFC = this.fFC;
        djt2.grQ = this.grQ;
        djt2.eoo = this.eoo;
        djt2.eop = this.eop;
        djt2.gtp = this.gtp;
        djt2.gsE = this.gsE;
        djt2.gsf = this.gsf;
        djt2.doW = this.doW;
        djt2.doX = this.doX;
        djt2.gsw = this.gsw;
        djt2.gsx = this.gsx;
        djt2.gsy = this.gsy;
        djt2.gsz = this.gsz;
        djt2.gsA = this.gsA;
        djt2.gsB = this.gsB;
        djt2.gtq = this.gtq;
        djt2.doQ = this.doQ;
        djt2.bis = this.bis;
        djt2.gsu = this.gsu;
        djt2.gsv = this.gsv;
        djt2.gsJ = this.gsJ;
        djt2.gsH = this.gsH;
        djt2.gsg = this.gsg;
        djt2.gsh = this.gsh;
    }

    public float getAcceleration() {
        return this.doQ;
    }

    public void setAcceleration(float f) {
        this.doQ = f;
    }

    public float getAnimationFrequency() {
        return this.gsf;
    }

    public void setAnimationFrequency(float f) {
        this.gsf = f;
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

    public float getFadeOffPercentTimeStart() {
        return this.gsJ;
    }

    public void setFadeOffPercentTimeStart(float f) {
        this.gsJ = f;
    }

    public float getGravityInfluence() {
        return this.gsv;
    }

    public void setGravityInfluence(float f) {
        this.gsv = f;
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

    public ljq getStartDirection() {
        return this.bis;
    }

    public void setStartDirection(ljq ljq2) {
        this.bis = ljq2;
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

    public boolean isUseHDRLParticles() {
        return this.gsg;
    }

    public void setUseHDRLParticles(boolean bl) {
        this.gsg = bl;
    }

    public boolean isUsePower() {
        return this.gsH;
    }

    public void setUsePower(boolean bl) {
        this.gsH = bl;
    }

    public float getWindInfluence() {
        return this.gsu;
    }

    public void setWindInfluence(float f) {
        this.gsu = f;
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


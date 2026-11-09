/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dip
extends dgj {
    protected dfo grP = null;
    protected String fFC = null;
    protected int grQ = 1;
    protected lcq gAk = lcq.BRIGHT_WHITE;
    protected float daN = 1.0f;
    protected float gsw = 0.0f;
    protected float gsx = 0.0f;
    protected float gsE = 1.0f;
    protected boolean gsg = false;
    private float gsh = 0.0f;

    dip() {
        this.gqB = 8;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeMissile();
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.createMissile();
        if (this.isRelationEffect()) {
            this.setupPositionalRelation(this.getTargetObjectGUID(), this.grP.getGUID(), this.getMainEffectObjectType());
        }
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dip dip2 = (dip)dgj2;
        dip2.setTextureName(this.getTextureName());
        dip2.setNumTextures(this.getNumTextures());
        dip2.setParticleColor(new lcq(this.getParticleColor()));
        dip2.setScale(this.getScale());
        dip2.setLifeTime(this.getLifeTime());
        dip2.setStartRotation(this.getStartRotation());
        dip2.setEndRotation(this.getEndRotation());
        dip2.gsg = this.gsg;
        dip2.gsh = this.gsh;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.fFC = null;
        this.grQ = 1;
        this.gAk = lcq.BRIGHT_WHITE;
        this.daN = 1.0f;
        this.gsw = 0.0f;
        this.gsx = 0.0f;
        this.gsE = 1.0f;
        this.gsg = false;
        this.gsh = 0.0f;
    }

    protected void createMissile() {
        this.grP = (dfo)dKP.Af(14);
        this.grP.setGUID(this.getMainAtomGuid());
        this.grP.setActive(true);
        this.grP.setEndColor(this.gAk);
        this.grP.setEndRotation(this.gsx);
        this.grP.setEndScale(this.daN);
        this.grP.setGravityInfluence(0.0f);
        this.grP.setNumParticles(1);
        this.grP.setNumTextures(this.grQ);
        this.grP.setParticleAcceleration(0.0f);
        this.grP.setParticleLifeTime(this.gsE);
        this.grP.setAnimationFrequency(this.gsE);
        this.grP.gr(0.0f);
        this.grP.bL(this.getTargetPosition());
        this.grP.bQ(new ljq());
        this.grP.gs(0.0f);
        this.grP.setPullAcceleration(0.0f);
        this.grP.bR(new ljq());
        this.grP.setRotationTurbulencePercent(0.0f);
        this.grP.setScaleTurbulencePercent(0.0f);
        this.grP.setColorTurbulencePercent(0.0f);
        this.grP.setStartColor(this.gAk);
        this.grP.setStartRotation(this.gsw);
        this.grP.setStartScale(this.daN);
        this.grP.setTextureName(this.fFC);
        this.grP.setWindInfluence(0.0f);
        this.grP.hQ(this.gsg);
        this.grP.gn(this.gsh);
        this.sendAtomOverideToChildren(this.grP);
        this.MessageDelegator.a(this.grP);
    }

    protected void removeMissile() {
        if (this.grP != null) {
            dey.bls().b(this.grP);
            this.grP = null;
        }
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    public int getNumTextures() {
        return this.grQ;
    }

    public void setNumTextures(int n2) {
        this.grQ = n2;
    }

    public lcq getParticleColor() {
        return this.gAk;
    }

    public void setParticleColor(lcq lcq2) {
        this.gAk = lcq2;
    }

    public float getScale() {
        return this.daN;
    }

    public void setScale(float f2) {
        this.daN = f2;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public float getEndRotation() {
        return this.gsx;
    }

    public void setEndRotation(float f2) {
        this.gsx = f2;
    }

    public float getLifeTime() {
        return this.gsE;
    }

    public void setLifeTime(float f2) {
        this.gsE = f2;
    }

    public float getStartRotation() {
        return this.gsw;
    }

    public void setStartRotation(float f2) {
        this.gsw = f2;
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

    public void setMotionBlurModifier(float f2) {
        this.gsh = f2;
    }

    public dey getAtom(int n2) {
        return this.grP;
    }

    public int getAtomCount() {
        return 1;
    }
}


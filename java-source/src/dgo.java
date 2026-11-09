/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dgo
extends dgj {
    private dfo grP = null;
    private String fFC = null;
    private int grQ = 1;
    private lcq grR = lcq.BRIGHT_WHITE;
    private lcq grS = lcq.BRIGHT_WHITE;
    private float grT = 1.0f;
    private float grU = 1.0f;
    private float grV = 0.0f;
    private float grW = 0.0f;
    private float grX = 0.0f;
    private float grY = 0.0f;
    private float grZ = 0.5f;
    private ljq gsa = null;
    private ljq gsb = null;
    private float gsc = 0.0f;
    private int gsd = 0;
    private float gse;
    private float gsf = 0.5f;
    private boolean gsg = false;
    private float gsh = 0.0f;
    private dkx gpG = null;

    dgo() {
        this.gqB = 75;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeMissile();
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.createMissile();
        this.updateMissile();
        if (this.isRelationEffect()) {
            this.gpG = this.setupPositionalRelation(this.getTargetObjectGUID(), this.grP.getGUID(), this.getMainEffectObjectType());
        }
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.updateMissile();
    }

    private void updateMissile() {
        if (this.grP == null) {
            return;
        }
        float f2 = ((float)(this.MessageDelegator.arc().rgz - this.fC.rgz) + this.gsc) * this.gse;
        float f3 = mfw.S(this.gsd, f2);
        f3 = lew.A(f3, 0.0f, 1.0f);
        lcq lcq2 = lcq.a(this.grR, this.grS, f3);
        this.grP.setStartColor(lcq2);
        this.grP.setEndColor(lcq2);
        float f4 = ldq.o(this.grT, this.grU, f3);
        this.grP.setStartScale(f4);
        this.grP.setEndScale(f4);
        float f5 = ldq.o(this.grV, this.grW, f3);
        this.grP.setStartRotation(f5);
        float f6 = ldq.o(this.grX, this.grY, f3);
        this.grP.setEndRotation(f6);
        if (this.isRelationEffect() && this.gpG != null) {
            ljq ljq2 = ljq.e(this.gsa, this.gsb, f3);
            this.gpG.setDeltaPos(ljq2);
        }
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dgo dgo2 = (dgo)dgj2;
        dgo2.fFC = this.fFC;
        dgo2.grQ = this.grQ;
        dgo2.grR = this.grR;
        dgo2.grS = this.grS;
        dgo2.grT = this.grT;
        dgo2.grU = this.grU;
        dgo2.grV = this.grV;
        dgo2.grW = this.grW;
        dgo2.grX = this.grX;
        dgo2.grY = this.grY;
        dgo2.grZ = this.grZ;
        dgo2.gsa = this.gsa;
        dgo2.gsb = this.gsb;
        dgo2.gsc = this.gsc;
        dgo2.gse = this.gse;
        dgo2.gsd = this.gsd;
        dgo2.gsf = this.gsf;
        dgo2.gsg = this.gsg;
        dgo2.gsh = this.gsh;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.fFC = null;
        this.grQ = 1;
        this.grR = lcq.BRIGHT_WHITE;
        this.grS = lcq.BRIGHT_WHITE;
        this.grT = 1.0f;
        this.grU = 1.0f;
        this.grV = 0.0f;
        this.grW = 0.0f;
        this.grX = 0.0f;
        this.grY = 0.0f;
        this.grZ = 0.5f;
        this.gsa = new ljq();
        this.gsb = new ljq();
        this.gsc = 0.0f;
        this.gse = 1.0f;
        this.gsd = 0;
        this.gsf = 0.5f;
        this.gsg = false;
        this.gsh = 0.0f;
    }

    protected void createMissile() {
        this.grP = (dfo)dKP.Af(14);
        this.grP.setGUID(this.getMainAtomGuid());
        this.grP.setActive(true);
        this.grP.setEndColor(this.grR);
        this.grP.setEndRotation(this.grX);
        this.grP.setEndScale(this.grT);
        this.grP.setGravityInfluence(0.0f);
        this.grP.setNumParticles(1);
        this.grP.setNumTextures(this.grQ);
        this.grP.setParticleAcceleration(0.0f);
        this.grP.setParticleLifeTime(this.grZ);
        this.grP.setAnimationFrequency(this.gsf);
        this.grP.gr(0.0f);
        this.grP.bL(this.getTargetPosition());
        this.grP.bQ(new ljq());
        this.grP.gs(0.0f);
        this.grP.setPullAcceleration(0.0f);
        this.grP.bR(new ljq());
        this.grP.setRotationTurbulencePercent(0.0f);
        this.grP.setScaleTurbulencePercent(0.0f);
        this.grP.setColorTurbulencePercent(0.0f);
        this.grP.setStartColor(this.grR);
        this.grP.setStartRotation(this.grV);
        this.grP.setStartScale(this.grT);
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

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public int getNumTextures() {
        return this.grQ;
    }

    public void setNumTextures(int n2) {
        this.grQ = n2;
    }

    public lcq getParticleColor_1() {
        return this.grR;
    }

    public void setParticleColor_1(lcq lcq2) {
        this.grR = lcq2;
    }

    public lcq getParticleColor_2() {
        return this.grS;
    }

    public void setParticleColor_2(lcq lcq2) {
        this.grS = lcq2;
    }

    public float getScale_1() {
        return this.grT;
    }

    public void setScale_1(float f2) {
        this.grT = f2;
    }

    public float getScale_2() {
        return this.grU;
    }

    public void setScale_2(float f2) {
        this.grU = f2;
    }

    public float getStartRotation_1() {
        return this.grV;
    }

    public void setStartRotation_1(float f2) {
        this.grV = f2;
    }

    public float getStartRotation_2() {
        return this.grW;
    }

    public void setStartRotation_2(float f2) {
        this.grW = f2;
    }

    public float getEndRotation_1() {
        return this.grX;
    }

    public void setEndRotation_1(float f2) {
        this.grX = f2;
    }

    public float getEndRotation_2() {
        return this.grY;
    }

    public void setEndRotation_2(float f2) {
        this.grY = f2;
    }

    public float getParticleLifeTime() {
        return this.grZ;
    }

    public void setParticleLifeTime(float f2) {
        this.grZ = f2;
    }

    public ljq getTargetOffset_1() {
        return this.gsa;
    }

    public void setTargetOffset_1(ljq ljq2) {
        this.gsa = ljq2;
    }

    public ljq getTargetOffset_2() {
        return this.gsb;
    }

    public void setTargetOffset_2(ljq ljq2) {
        this.gsb = ljq2;
    }

    public float getTimeSeed() {
        return this.gsc;
    }

    public void setTimeSeed(float f2) {
        this.gsc = f2;
    }

    public int getLerpType() {
        return this.gsd;
    }

    public void setLerpType(int n2) {
        this.gsd = n2;
    }

    public float getLerpFrequency() {
        return this.gse;
    }

    public void setLerpFrequency(float f2) {
        this.gse = f2;
    }

    public float getAnimationFrequency() {
        return this.gsf;
    }

    public void setAnimationFrequency(float f2) {
        this.gsf = f2;
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


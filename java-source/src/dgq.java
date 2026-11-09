/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dgq
extends dgj {
    protected dfo grP = null;
    protected String fFC = null;
    protected int grQ = 1;
    protected lcq eoo = null;
    protected lcq eop = null;
    protected int gst = 10;
    protected float gsu = 0.0f;
    protected float gsv = 0.0f;
    protected float doW = 1.0f;
    protected float doX = 1.0f;
    protected float gsw = 0.0f;
    protected float gsx = 0.0f;
    protected float gsy = 0.0f;
    protected float gsz = 0.0f;
    protected float gsA = 0.0f;
    protected float gsB = 0.5f;
    protected float gsC = 1.0f;
    protected float gsD = 1.0f;
    protected float gsE = 1.0f;
    protected ljq gsF = null;
    protected float gsG = 0.0f;
    protected boolean gsH = false;
    private ljq mx = null;
    private ljq gsI = null;
    private float gsJ = 0.9f;
    private float gsf = 1.0f;
    private boolean gsg = false;
    private static double akm = 0.0;
    private static final double gsK = 1.0;

    dgq() {
        this.gqB = 15;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeParticle();
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.createParticle();
        if (this.isRelationEffect()) {
            this.setDeltaPos(this.gsI);
            this.setupPositionalRelation(this.getTargetObjectGUID(), this.grP.getGUID(), this.getMainEffectObjectType());
        }
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.updateBlood();
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void createParticle() {
        int n2;
        if (this.getSourcePosition() != null && this.getTargetPosition() != null) {
            this.mx = new ljq(this.getTargetPosition());
            this.mx.et(this.getSourcePosition());
            this.mx.normalize();
        } else {
            this.aZH = new ljq();
            this.mx = new ljq(0.0f, 0.0f, 1.0f);
        }
        this.grP = (dfo)dKP.Af(14);
        this.grP.setGUID(this.getMainAtomGuid());
        this.grP.setActive(true);
        this.grP.setEndColor(this.eop);
        this.grP.setEndRotation(this.gsx);
        this.grP.setEndScale(this.doX);
        this.grP.setGravityInfluence(this.gsv);
        if (this.gsH) {
            n2 = (int)((float)this.gst * this.getPower());
            if (n2 < 1) {
                n2 = 1;
            }
        } else {
            n2 = this.gst;
        }
        this.grP.setNumParticles(n2);
        this.grP.setNumTextures(this.grQ);
        this.grP.setParticleLifeTime(this.gsE);
        this.grP.setAnimationFrequency(this.gsf);
        this.grP.gr(this.gsB);
        this.gsI = new ljq(this.mx);
        this.gsI.nm(this.gsG);
        this.gsI.es(this.gsF);
        ljq ljq2 = new ljq(this.getTargetPosition());
        ljq2.es(this.gsI);
        this.grP.bL(ljq2);
        this.grP.bQ(this.mx);
        this.grP.gs(this.gsC);
        this.grP.setParticleAcceleration(this.gsD);
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
        this.sendAtomOverideToChildren(this.grP);
        this.MessageDelegator.a(this.grP);
        if (!this.isServerObject()) {
            gmR.bJ(ljq2);
            gmV.a(this.getTargetObjectGUID(), this.getTargetPosition(), this.getSourcePosition(), 1.0f);
            lfn.b(0, ((Object)((Object)this)).getClass().getSimpleName(), "createParticle() :: Last Hit-Sound Play-Time = " + akm);
            if (this.MessageDelegator.arc().rgz > akm + 1.0) {
                gmT.b(this.getTargetObjectGUID(), this.getTargetPosition(), true);
                akm = this.MessageDelegator.arc().rgz;
            }
        }
    }

    protected void removeParticle() {
        if (this.grP == null) {
            return;
        }
        dey.bls().b(this.grP);
        this.grP = null;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.fFC = null;
        this.grQ = 1;
        this.eoo = lcq.BRIGHT_WHITE;
        this.eop = lcq.BRIGHT_WHITE;
        this.gst = 10;
        this.gsu = 0.0f;
        this.gsv = 0.0f;
        this.doW = 1.0f;
        this.doX = 1.0f;
        this.gsw = 0.0f;
        this.gsx = 0.0f;
        this.gsy = 0.0f;
        this.gsz = 0.0f;
        this.gsA = 0.0f;
        this.gsB = 0.5f;
        this.gsC = 1.0f;
        this.gsD = 1.0f;
        this.gsE = 1.0f;
        this.gsF = new ljq();
        this.gsG = 0.0f;
        this.gsH = false;
        this.gsg = false;
        this.gsf = 1.0f;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dgq dgq2 = (dgq)dgj2;
        dgq2.fFC = this.fFC;
        dgq2.grQ = this.grQ;
        dgq2.eoo = this.eoo;
        dgq2.eop = this.eop;
        dgq2.gst = this.gst;
        dgq2.gsu = this.gsu;
        dgq2.gsv = this.gsv;
        dgq2.doW = this.doW;
        dgq2.doX = this.doX;
        dgq2.gsw = this.gsw;
        dgq2.gsx = this.gsx;
        dgq2.gsy = this.gsy;
        dgq2.gsz = this.gsz;
        dgq2.gsA = this.gsA;
        dgq2.gsB = this.gsB;
        dgq2.gsC = this.gsC;
        dgq2.gsD = this.gsD;
        dgq2.gsE = this.gsE;
        dgq2.gsF = this.gsF;
        dgq2.gsG = this.gsG;
        dgq2.gsH = this.gsH;
        dgq2.gsf = this.gsf;
        dgq2.gsg = this.gsg;
    }

    public float getColorTurbulencePercent() {
        return this.gsA;
    }

    public void setColorTurbulencePercent(float f2) {
        this.gsA = f2;
    }

    public float getDirectionAcceleration() {
        return this.gsD;
    }

    public void setDirectionAcceleration(float f2) {
        this.gsD = f2;
    }

    public float getDirectionOffset() {
        return this.gsG;
    }

    public void setDirectionOffset(float f2) {
        this.gsG = f2;
    }

    public float getDirectionSpeed() {
        return this.gsC;
    }

    public void setDirectionSpeed(float f2) {
        this.gsC = f2;
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

    public void setEndRotation(float f2) {
        this.gsx = f2;
    }

    public float getEndScale() {
        return this.doX;
    }

    public void setEndScale(float f2) {
        this.doX = f2;
    }

    public float getGravityInfluence() {
        return this.gsv;
    }

    public void setGravityInfluence(float f2) {
        this.gsv = f2;
    }

    public float getLifeTime() {
        return this.gsE;
    }

    public void setLifeTime(float f2) {
        this.gsE = f2;
    }

    public int getMaxNumParticles() {
        return this.gst;
    }

    public void setMaxNumParticles(int n2) {
        this.gst = n2;
    }

    public int getNumTextures() {
        return this.grQ;
    }

    public void setNumTextures(int n2) {
        this.grQ = n2;
    }

    public float getOffsetScale() {
        return this.gsB;
    }

    public void setOffsetScale(float f2) {
        this.gsB = f2;
    }

    public dfo getParticle() {
        return this.grP;
    }

    public void setParticle(dfo dfo2) {
        this.grP = dfo2;
    }

    public float getRotationTurbulencePercent() {
        return this.gsy;
    }

    public void setRotationTurbulencePercent(float f2) {
        this.gsy = f2;
    }

    public float getScaleTurbulencePercent() {
        return this.gsz;
    }

    public void setScaleTurbulencePercent(float f2) {
        this.gsz = f2;
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

    public void setStartRotation(float f2) {
        this.gsw = f2;
    }

    public float getStartScale() {
        return this.doW;
    }

    public void setStartScale(float f2) {
        this.doW = f2;
    }

    public ljq getTargetPositionOffset() {
        return this.gsF;
    }

    public void setTargetPositionOffset(ljq ljq2) {
        this.gsF = ljq2;
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

    public float getWindInfluence() {
        return this.gsu;
    }

    public void setWindInfluence(float f2) {
        this.gsu = f2;
    }

    public void updateBlood() {
        if (this.hasInfiniteDuration()) {
            return;
        }
        double d2 = this.nx.rgz - this.fC.rgz;
        float f2 = (float)(d2 / (double)this.getDuration());
        if (f2 < this.gsJ) {
            return;
        }
        float f3 = (f2 - this.gsJ) / (1.0f - this.gsJ);
        f3 = lew.A(f3, 0.0f, 1.0f);
        lcq lcq2 = lcq.a(this.eoo, this.eop, f3);
        this.grP.setStartColor(lcq2);
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

    public dey getAtom(int n2) {
        return this.grP;
    }

    public int getAtomCount() {
        return 1;
    }
}


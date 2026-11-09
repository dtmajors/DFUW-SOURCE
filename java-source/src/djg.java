/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class djg
extends dgj {
    private dfo grP = null;
    private String fFC = null;
    private int grQ = 1;
    private lcq eoo = null;
    private lcq eop = null;
    private int gtp = 20;
    private float gsE = 1.0f;
    private float gsf = 1.0f;
    private float gsu = 0.0f;
    private float doW = 1.0f;
    private float doX = 1.0f;
    private float gsw = 0.0f;
    private float gsx = 0.0f;
    private float gsy = 0.0f;
    private float gsz = 0.0f;
    private float gsA = 0.0f;
    private float gsB = 0.5f;
    private float gtq = 1.0f;
    private float doQ = 0.0f;
    private float gBq = 1.0f;
    private boolean gsg = false;
    private float gsh = 0.0f;
    protected dky grJ = null;
    boolean gBt = false;
    boolean gBu = false;

    djg() {
        this.gqB = 11;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeTrail();
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.grJ = this.setupPositionalSensorOnTargetObject();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        if (this.grJ != null && this.grJ.boo() && this.grJ.bop() && !this.gBt) {
            this.gBt = true;
            this.createTrail();
            if (this.isRelationEffect()) {
                this.setupPositionalRelation(this.getTargetObjectGUID(), this.grP.getGUID(), this.getMainEffectObjectType());
            }
        }
        this.updateTrail();
        if (this.isRelationEffect() && !this.gBu && this.getRelation() != null && this.getRelation().boh()) {
            this.gBu = true;
            this.grP.setStartColor(this.eoo);
            this.grP.setEndColor(this.eop);
        }
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void removeTrail() {
        if (this.grP != null) {
            dey.bls().b(this.grP);
            this.grP = null;
        }
    }

    protected void createTrail() {
        this.grP = (dfo)dKP.Af(14);
        this.grP.setGUID(this.getMainAtomGuid());
        this.grP.setActive(true);
        this.grP.setEndColor(this.isRelationEffect() ? new lcq(0.0f, 0.0f, 0.0f, 0.0f) : this.eop);
        this.grP.setEndRotation(this.gsx);
        this.grP.setEndScale(this.doX);
        this.grP.setGravityInfluence(0.0f);
        this.grP.setNumParticles(this.gtp);
        this.grP.setNumTextures(this.grQ);
        this.grP.setParticleAcceleration(0.0f);
        this.grP.setParticleLifeTime(this.gsE);
        this.grP.setAnimationFrequency(this.getAnimationFrequency());
        this.grP.gr(this.gsB);
        this.grP.bL(this.getTargetPosition());
        this.grP.bQ(new ljq(0.0f, 0.0f, 0.0f));
        this.grP.gs(this.gtq);
        this.grP.setPullAcceleration(this.doQ);
        this.grP.bR(this.getTargetPosition());
        this.grP.setRotationTurbulencePercent(this.gsy);
        this.grP.setScaleTurbulencePercent(this.gsz);
        this.grP.setColorTurbulencePercent(this.gsA);
        this.grP.setStartColor(this.isRelationEffect() ? new lcq(0.0f, 0.0f, 0.0f, 0.0f) : this.eoo);
        this.grP.setStartRotation(this.gsw);
        this.grP.setStartScale(this.doW);
        this.grP.setTextureName(this.fFC);
        this.grP.setWindInfluence(this.gsu);
        this.grP.hQ(this.gsg);
        this.grP.gn(this.gsh);
        this.sendAtomOverideToChildren(this.grP);
        this.MessageDelegator.a(this.grP);
    }

    protected void updateTrail() {
        if (!this.gBt) {
            return;
        }
        if (!this.gBu) {
            return;
        }
        if (this.grJ == null) {
            return;
        }
        assert (this.grP != null);
        ljq ljq2 = this.grJ.bom();
        ljq ljq3 = this.grJ.av();
        ljq ljq4 = new ljq(ljq2);
        ljq4.et(ljq3);
        ljq4.normalize();
        ljq ljq5 = new ljq(ljq4);
        ljq5.nm(this.getTrailLength());
        ljq5.es(ljq3);
        if (this.isRelationEffect() && this.getRelation() != null) {
            lgl lgl2 = this.grJ.aw();
            ljq ljq6 = this.getRelation().getDeltaPos().esF();
            String string = this.getSpecialEffectName();
            if (string.equals("se_mount_the_sweeper_tail_01")) {
                ljq6.es(new ljq(0.0f, 0.0f, 10.0f));
            }
            ljq6 = lgl2.eq(ljq6);
            ljq5.es(ljq6);
        }
        this.grP.bR(ljq5);
    }

    public float getAcceleration() {
        return this.doQ;
    }

    public void setAcceleration(float f) {
        this.doQ = f;
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

    public float getWindInfluence() {
        return this.gsu;
    }

    public void setWindInfluence(float f) {
        this.gsu = f;
    }

    public float getTrailLength() {
        return this.gBq;
    }

    public void setTrailLength(float f) {
        this.gBq = f;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.fFC = "";
        this.grQ = 1;
        this.eoo = lcq.BRIGHT_WHITE;
        this.eop = lcq.BRIGHT_WHITE;
        this.gtp = 20;
        this.gsE = 1.0f;
        this.gsu = 0.0f;
        this.doW = 1.0f;
        this.doX = 1.0f;
        this.gsw = 0.0f;
        this.gsx = 0.0f;
        this.gsy = 0.0f;
        this.gsz = 0.0f;
        this.gsA = 0.0f;
        this.gsB = 0.5f;
        this.gtq = 1.0f;
        this.doQ = 0.0f;
        this.gBq = 1.0f;
        this.gsf = 1.0f;
        this.gsg = false;
        this.gsh = 0.0f;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        djg djg2 = (djg)dgj2;
        djg2.fFC = this.fFC;
        djg2.grQ = this.grQ;
        djg2.eoo = this.eoo;
        djg2.eop = this.eop;
        djg2.gtp = this.gtp;
        djg2.gsE = this.gsE;
        djg2.gsu = this.gsu;
        djg2.doW = this.doW;
        djg2.doX = this.doX;
        djg2.gsw = this.gsw;
        djg2.gsx = this.gsx;
        djg2.gsy = this.gsy;
        djg2.gsz = this.gsz;
        djg2.gsA = this.gsA;
        djg2.gsB = this.gsB;
        djg2.gtq = this.gtq;
        djg2.doQ = this.doQ;
        djg2.gBq = this.gBq;
        djg2.gsf = this.gsf;
        djg2.gsg = this.gsg;
        djg2.gsh = this.gsh;
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


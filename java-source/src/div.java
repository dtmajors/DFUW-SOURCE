/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class div
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
    private boolean gAS = true;
    private boolean gAT = true;
    private float gAU = 0.2f;
    private double gvp;
    private double gvq;
    private dkx gAV = null;
    private dky grK = null;

    div() {
        this.gqB = 61;
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
        assert (this.getSourceObjectGUID() != null);
        if (!this.isRelationEffect()) {
            this.createObject();
        } else {
            this.grK = this.setupPositionalSensorOnSourceObject();
        }
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        if (this.isRelationEffect()) {
            if (!this.grK.bop()) {
                return;
            }
            if (this.grP == null) {
                this.createObject();
                this.setDeltaPos(this.gAQ);
                this.gAV = this.setupPositionalRelation(this.getSourceObjectGUID(), this.grP.getGUID(), this.getMainEffectObjectType());
            }
        }
        this.updateObject();
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        div div2 = (div)dgj2;
        div2.fFC = this.fFC;
        div2.grQ = this.grQ;
        div2.eoo = this.eoo;
        div2.eop = this.eop;
        div2.gtp = this.gtp;
        div2.gsE = this.gsE;
        div2.gsf = this.gsf;
        div2.doW = this.doW;
        div2.doX = this.doX;
        div2.gsw = this.gsw;
        div2.gsx = this.gsx;
        div2.gsy = this.gsy;
        div2.gsz = this.gsz;
        div2.gsA = this.gsA;
        div2.gsB = this.gsB;
        div2.gtq = this.gtq;
        div2.gAP = this.gAP;
        div2.gwu = this.gwu;
        div2.gwv = this.gwv;
        div2.gAQ = this.gAQ;
        div2.grN = this.grN;
        div2.gAR = this.gAR;
        div2.bis = this.bis;
        div2.gsg = this.gsg;
        div2.gsh = this.gsh;
        div2.gAS = this.gAS;
        div2.gAT = this.gAT;
        div2.gAU = this.gAU;
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
        this.gAQ = new ljq(0.0f, 0.0f, 0.0f);
        this.grN = new ljq(0.0f, 0.0f, 0.0f);
        this.gAR = 0.0f;
        this.bis = new ljq();
        this.gsg = false;
        this.gsh = 0.0f;
        this.gAS = true;
        this.gAT = true;
        this.gAU = 0.1f;
    }

    protected void createObject() {
        float f2;
        this.grP = (dfo)dKP.Af(14);
        this.grP.setGUID(this.getMainAtomGuid());
        this.grP.setActive(true);
        this.grP.setEndRotation(this.gsx);
        this.grP.setEndScale(this.doX);
        this.grP.setNumParticles(this.gtp);
        this.grP.setNumTextures(this.grQ);
        this.grP.setParticleLifeTime(this.gsE);
        this.grP.setAnimationFrequency(this.gsf);
        this.grP.gr(this.gsB);
        this.grP.bL(this.getSourcePosition());
        this.grP.gs(this.gtq);
        ljq ljq2 = this.getSourcePosition();
        if (this.isRelationEffect()) {
            ljq2 = this.grK.av().esF();
            ljq2.es(this.grK.aw().eq(this.gAQ));
            this.grP.setNumParticles(0);
        }
        ljq ljq3 = new ljq(this.getTargetPosition());
        ljq3.es(this.grN);
        ljq3.et(ljq2);
        float f3 = ljq3.eqN();
        ljq3.normalize();
        ljq ljq4 = new ljq(ljq2);
        ljq4.es(ljq3);
        ljq4.es(this.grN);
        if (this.gAT) {
            f2 = this.CalculateAcceleration(f3);
            this.grP.setPullAcceleration(f2);
        } else {
            this.grP.setPullAcceleration(this.gAP);
        }
        this.grP.bR(ljq4);
        this.grP.setRotationTurbulencePercent(this.gsy);
        this.grP.setScaleTurbulencePercent(this.gsz);
        this.grP.setColorTurbulencePercent(this.gsA);
        this.grP.setStartRotation(this.gsw);
        this.grP.setStartScale(this.doW);
        this.grP.setTextureName(this.fFC);
        this.grP.setWindInfluence(0.0f);
        this.grP.setGravityInfluence(0.0f);
        this.grP.hQ(this.gsg);
        this.grP.gn(this.gsh);
        if (this.hasInfiniteDuration()) {
            this.grP.setStartColor(this.eoo);
            this.grP.setEndColor(this.eop);
        } else {
            this.gvp = this.getDuration() * this.gwu;
            this.gvq = this.getDuration() * (1.0f - this.gwv);
            f2 = this.calculateTimeVal(this.gvp, this.gvq);
            lcq lcq2 = new lcq(this.eoo.r, this.eoo.g, this.eoo.b, 0.0f);
            lcq lcq3 = lcq.a(lcq2, this.eoo, f2);
            this.grP.setStartColor(lcq3);
            lcq lcq4 = new lcq(this.eop.r, this.eop.g, this.eop.b, 0.0f);
            lcq lcq5 = lcq.a(lcq4, this.eop, f2);
            this.grP.setEndColor(lcq5);
        }
        this.grP.setParticleAcceleration(this.gAR);
        this.grP.bQ(this.bis);
        this.sendAtomOverideToChildren(this.grP);
        this.MessageDelegator.a(this.grP);
    }

    private float CalculateAcceleration(float f2) {
        float f3 = this.getLifeTime() * 0.5f;
        return (float)Math.pow(f2, 1.0 / (double)f3);
    }

    protected void removeObject() {
        if (this.grP != null) {
            dey.bls().b(this.grP);
            this.grP = null;
        }
    }

    protected void updateObject() {
        assert (this.grP != null);
        this.updateAccelerationAndSource();
        if (!this.hasInfiniteDuration()) {
            float f2 = this.calculateTimeVal(this.gvp, this.gvq);
            lcq lcq2 = new lcq(this.eoo.r, this.eoo.g, this.eoo.b, 0.0f);
            lcq lcq3 = lcq.a(lcq2, this.eoo, f2);
            this.grP.setStartColor(lcq3);
            lcq lcq4 = new lcq(this.eop.r, this.eop.g, this.eop.b, 0.0f);
            lcq lcq5 = lcq.a(lcq4, this.eop, f2);
            this.grP.setEndColor(lcq5);
        }
    }

    private void updateAccelerationAndSource() {
        if (!this.gAS) {
            return;
        }
        double d2 = this.getDuration() * this.gAU;
        if (this.fC.rgz + d2 > this.MessageDelegator.arc().rgz && !this.isRelationEffect()) {
            return;
        }
        if (this.isRelationEffect()) {
            this.grP.setNumParticles(this.gtp);
        }
        if (this.gAT) {
            Object object;
            float f2;
            double d3 = (double)this.getDuration() * (1.0 - (double)this.gAU);
            ljq ljq2 = this.getSourcePosition();
            if (this.isRelationEffect()) {
                ljq2 = this.grK.av().esF();
                ljq2.es(this.grK.aw().eq(this.gAQ));
            }
            ljq ljq3 = new ljq(this.getTargetPosition());
            ljq3.es(this.grN);
            ljq3.et(ljq2);
            float f3 = ljq3.eqN();
            ljq3.normalize();
            double d4 = this.MessageDelegator.arc().rgz - (this.fC.rgz + d2);
            if (d4 < 0.0) {
                d4 = 0.0;
            }
            if ((f2 = f3 * (float)(d4 / d3)) > f3) {
                f2 = f3;
            }
            ljq3.nm(f2);
            if (!this.isRelationEffect()) {
                object = new ljq(this.getSourcePosition());
                ((ljq)object).es(ljq3);
                this.grP.bL((ljq)object);
            } else {
                object = new lgl();
                ((lgl)object).X(this.grK.aw());
                ((lgl)object).eqR();
                ljq ljq4 = ((lgl)object).eq(ljq3);
                ljq4.es(this.gAQ);
                this.gAV.setDeltaPos(ljq4);
            }
            float f4 = this.CalculateAcceleration(f3 - f2);
            this.grP.setPullAcceleration(f4);
            this.grP.bR(this.getTargetPosition());
        }
    }

    public float getAnimationFrequency() {
        return this.gsf;
    }

    public void setAnimationFrequency(float f2) {
        this.gsf = f2;
    }

    public float getColorTurbulencePercent() {
        return this.gsA;
    }

    public void setColorTurbulencePercent(float f2) {
        this.gsA = f2;
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

    public float getIntroPercent() {
        return this.gwu;
    }

    public void setIntroPercent(float f2) {
        this.gwu = f2;
    }

    public float getLifeTime() {
        return this.gsE;
    }

    public void setLifeTime(float f2) {
        this.gsE = f2;
    }

    public float getMotionBlurModifier() {
        return this.gsh;
    }

    public void setMotionBlurModifier(float f2) {
        this.gsh = f2;
    }

    public int getNumParticles() {
        return this.gtp;
    }

    public void setNumParticles(int n2) {
        this.gtp = n2;
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

    public float getOuttroPercent() {
        return this.gwv;
    }

    public void setOuttroPercent(float f2) {
        this.gwv = f2;
    }

    public float getPullAcceleration() {
        return this.gAP;
    }

    public void setPullAcceleration(float f2) {
        this.gAP = f2;
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

    public ljq getSourceOffset() {
        return this.gAQ;
    }

    public void setSourceOffset(ljq ljq2) {
        this.gAQ = ljq2;
    }

    public float getStartAcceleration() {
        return this.gAR;
    }

    public void setStartAcceleration(float f2) {
        this.gAR = f2;
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

    public void setStartRotation(float f2) {
        this.gsw = f2;
    }

    public float getStartScale() {
        return this.doW;
    }

    public void setStartScale(float f2) {
        this.doW = f2;
    }

    public float getStartSpeed() {
        return this.gtq;
    }

    public void setStartSpeed(float f2) {
        this.gtq = f2;
    }

    public ljq getTargetOffset() {
        return this.grN;
    }

    public void setTargetOffset(ljq ljq2) {
        this.grN = ljq2;
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

    public boolean isCalculatePullAccelerationToReachTarget() {
        return this.gAT;
    }

    public void setCalculatePullAccelerationToReachTarget(boolean bl) {
        this.gAT = bl;
    }

    public boolean isMoveTowardsTargetPosition() {
        return this.gAS;
    }

    public void setMoveTowardsTargetPosition(boolean bl) {
        this.gAS = bl;
    }

    public float getMoveTowardsTargetPositionTimePercent() {
        return this.gAU;
    }

    public void setMoveTowardsTargetPositionTimePercent(float f2) {
        this.gAU = f2;
    }

    public dey getAtom(int n2) {
        return this.grP;
    }

    public int getAtomCount() {
        return 1;
    }
}


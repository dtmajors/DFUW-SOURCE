/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class djf
extends dgj {
    private dfo grP = null;
    private mgk gwl = null;
    private dfz gur = null;
    private float gwm;
    private float gwn;
    private float gwo;
    private float gwp;
    private float gwq;
    private int gwr = 0;
    private ljq grN = null;
    private String fFC = null;
    private int grQ = 1;
    private lcq eoo = null;
    private lcq eop = null;
    private int gtp = 1;
    private float gsu = 0.0f;
    private float gsv = 0.0f;
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
    private float grZ = 1.0f;
    private float gsf = 1.0f;
    private ljq bis = null;
    private boolean gBo = false;
    private float gBp = 1.0f;
    private float gBq = 10.0f;
    private boolean gsg = false;
    private float gsh = 0.0f;
    private boolean gzN = false;
    private float gzO = 0.2f;
    private lcq gzP = null;
    private lcq gzQ = null;
    private int gzR = 10;
    private boolean gzS = false;
    private float gvj = 0.0f;
    private float gvk = 0.0f;
    private double gvp;
    private double gvq;
    ljq gzT = null;
    private dkx grI = null;
    private dky grJ = null;

    public djf() {
        this.gqB = 73;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeObject();
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.setupTrajectory();
        this.createObject();
        if (this.isRelationEffect()) {
            this.grI = this.setupPositionalRelation(this.getTargetObjectGUID(), this.grP.getGUID(), this.getMainEffectObjectType());
            if (this.gBo) {
                this.grJ = this.setupPositionalSensorOnTargetObject();
            }
        }
        if (this.gzN) {
            this.setupTracer();
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
        if (this.gur != null) {
            dey.bls().b(this.gur);
            this.gur = null;
        }
    }

    private void setupTrajectory() {
        this.gwl = new mgk();
        this.gwl.setRadius_1(this.gwm);
        this.gwl.setRadius_2(this.gwn);
        this.gwl.setTimeOfOneRevolution(this.gwo);
        this.gwl.setSpiralFrequency_1(this.gwp);
        this.gwl.setSpiralFrequency_2(this.gwq);
        this.gwl.setTrajectoryPlane(this.gwr);
    }

    private void setupTracer() {
        this.gur = (dfz)dKP.Af(19);
        assert (this.gur != null);
        this.gur.setGUID(this.getNewEffectGuid());
        this.gur.mH(this.grP.getGUID());
        this.gur.setActive(true);
        this.gur.setTracerCreationType(0);
        ljq ljq2 = new ljq(0.5f, 0.0f, 0.0f);
        ljq ljq3 = new ljq(-0.5f, 0.0f, 0.0f);
        ljq2.nm(this.gzO);
        ljq3.nm(this.gzO);
        this.gur.setFirstPoint(ljq2);
        this.gur.setSecondPoint(ljq3);
        this.gur.setOffset(new ljq());
        this.gur.setFallOff(true);
        this.gur.setTracerColorStart(this.gzP);
        this.gur.setTracerColorEnd(this.gzQ);
        this.gur.setMaxNumberOfTracePoints(this.gzR);
        this.gur.setUpperTransparencyEnd(this.gzQ.a);
        this.gur.setUpperTransparencyStart(this.gzP.a);
        this.gur.setLowerTransparencyEnd(this.gzQ.a);
        this.gur.setLowerTransparencyStart(this.gzP.a);
        this.gur.setScale(1.0f);
        this.gur.setFaceCamera(this.gzS);
        this.gur.setMinDistanceBetweenTracePoints(1.0f);
        this.gur.setMaxTracerPointLifeTime(0.0f);
        this.gur.setEnabled(true);
        this.MessageDelegator.a(this.gur);
    }

    protected void createObject() {
        this.gvp = this.getDuration() * this.gvj;
        this.gvq = this.getDuration() * (1.0f - this.gvk);
        this.grP = (dfo)dKP.Af(14);
        this.grP.setGUID(this.getMainAtomGuid());
        this.grP.setActive(true);
        this.grP.setEndColor(this.eop);
        this.grP.setEndRotation(this.gsx);
        this.grP.setEndScale(this.doX);
        this.grP.setGravityInfluence(this.gsv);
        this.grP.setNumParticles(this.gtp);
        this.grP.setNumTextures(this.grQ);
        this.grP.setParticleAcceleration(this.doQ);
        this.grP.setParticleLifeTime(this.grZ);
        this.grP.gr(this.gsB);
        this.grP.setStartColor(this.eoo);
        this.grP.setEndColor(this.eop);
        this.grP.setAnimationFrequency(this.gsf);
        this.updateFade();
        ljq ljq2 = new ljq(this.getTargetPosition());
        ljq2.es(this.grN);
        this.grP.bL(ljq2);
        this.gzT = ljq2;
        this.grP.bQ(this.bis);
        this.grP.gs(this.gtq);
        if (this.gBo) {
            this.grP.setPullAcceleration(this.gBp);
            this.grP.bR(ljq2);
        } else {
            this.grP.setPullAcceleration(0.0f);
            this.grP.bR(new ljq());
        }
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

    protected void updateFade() {
        if (!this.hasInfiniteDuration()) {
            float f = this.calculateTimeVal(this.gvp, this.gvq);
            if (lcq.d(this.eoo, this.eop)) {
                lcq lcq2 = lcq.a(this.eop, this.eoo, f);
                this.grP.setStartColor(lcq2);
            } else {
                lcq lcq3 = lcq.a(this.eoo, this.eop, f);
                this.grP.setEndColor(lcq3);
            }
        }
    }

    protected void updateObject() {
        this.updateFade();
        ljq ljq2 = this.gwl.ez(this.nx.rgz);
        ljq2.es(this.grN);
        if (this.grI != null) {
            this.grI.setDeltaPos(ljq2);
        } else {
            ljq2.es(this.getTargetPosition());
            this.grP.bL(ljq2);
        }
        if (this.gBo) {
            if (this.isRelationEffect()) {
                ljq ljq3 = new ljq(this.grJ.av());
                ljq3.es(ljq2);
                ljq ljq4 = new ljq(this.grJ.bom());
                ljq4.es(this.gzT);
                ljq ljq5 = new ljq(ljq3);
                ljq5.et(ljq4);
                ljq5.normalize();
                ljq5.nm(this.gBq);
                ljq5.es(ljq3);
                this.grP.bL(ljq5);
            } else {
                this.grP.bR(this.gzT);
            }
        }
        this.gzT = ljq2;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gwm = 1.0f;
        this.gwn = 1.0f;
        this.gwo = 0.1f;
        this.gwp = 1.0f;
        this.gwq = 1.0f;
        this.gwr = 0;
        this.grN = new ljq(0.0f, 0.0f, 0.0f);
        this.fFC = null;
        this.grQ = 1;
        this.eoo = lcq.BRIGHT_WHITE;
        this.eop = lcq.BRIGHT_WHITE;
        this.gtp = 1;
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
        this.gtq = 1.0f;
        this.doQ = 1.0f;
        this.grZ = 1.0f;
        this.gsf = 1.0f;
        this.bis = new ljq(0.0f, 0.0f, 0.0f);
        this.gBo = false;
        this.gBp = 1.0f;
        this.gBq = 10.0f;
        this.gvj = 0.0f;
        this.gvk = 0.0f;
        this.gzN = false;
        this.gzO = 0.2f;
        this.gzP = lcq.BRIGHT_WHITE;
        this.gzQ = lcq.BRIGHT_WHITE;
        this.gzR = 10;
        this.gzS = true;
        this.gsg = false;
        this.gsh = 0.0f;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        djf djf2 = (djf)dgj2;
        djf2.gwm = this.gwm;
        djf2.gwn = this.gwn;
        djf2.gwo = this.gwo;
        djf2.gwp = this.gwp;
        djf2.gwq = this.gwq;
        djf2.gwr = this.gwr;
        djf2.grN = this.grN;
        djf2.gsf = this.gsf;
        djf2.fFC = this.fFC;
        djf2.grQ = this.grQ;
        djf2.eoo = this.eoo;
        djf2.eop = this.eop;
        djf2.gtp = this.gtp;
        djf2.gsu = this.gsu;
        djf2.gsv = this.gsv;
        djf2.doW = this.doW;
        djf2.doX = this.doX;
        djf2.gsw = this.gsw;
        djf2.gsx = this.gsx;
        djf2.gsy = this.gsy;
        djf2.gsz = this.gsz;
        djf2.gsA = this.gsA;
        djf2.gsB = this.gsB;
        djf2.gtq = this.gtq;
        djf2.doQ = this.doQ;
        djf2.grZ = this.grZ;
        djf2.bis = this.bis;
        djf2.gBo = this.gBo;
        djf2.gBp = this.gBp;
        djf2.gBq = this.gBq;
        djf2.gvj = this.gvj;
        djf2.gvk = this.gvk;
        djf2.gzN = this.gzN;
        djf2.gzO = this.gzO;
        djf2.gzP = this.gzP;
        djf2.gzQ = this.gzQ;
        djf2.gzR = this.gzR;
        djf2.gzS = this.gzS;
        djf2.gsg = this.gsg;
        djf2.gsh = this.gsh;
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

    public float getGravityInfluence() {
        return this.gsv;
    }

    public void setGravityInfluence(float f) {
        this.gsv = f;
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

    public float getParticleLifeTime() {
        return this.grZ;
    }

    public void setParticleLifeTime(float f) {
        this.grZ = f;
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

    public float getTrailAcceleration() {
        return this.gBp;
    }

    public void setTrailAcceleration(float f) {
        this.gBp = f;
    }

    public float getTrailLength() {
        return this.gBq;
    }

    public void setTrailLength(float f) {
        this.gBq = f;
    }

    public boolean isUseTrail() {
        return this.gBo;
    }

    public void setUseTrail(boolean bl) {
        this.gBo = bl;
    }

    public float getWindInfluence() {
        return this.gsu;
    }

    public void setWindInfluence(float f) {
        this.gsu = f;
    }

    public float getExpandPercentTime() {
        return this.gvj;
    }

    public void setExpandPercentTime(float f) {
        this.gvj = f;
    }

    public float getRetractPercentTime() {
        return this.gvk;
    }

    public void setRetractPercentTime(float f) {
        this.gvk = f;
    }

    public int getNumberOfTracerPoints() {
        return this.gzR;
    }

    public void setNumberOfTracerPoints(int n) {
        this.gzR = n;
    }

    public lcq getTracerColorEnd() {
        return this.gzQ;
    }

    public void setTracerColorEnd(lcq lcq2) {
        this.gzQ = lcq2;
    }

    public lcq getTracerColorStart() {
        return this.gzP;
    }

    public void setTracerColorStart(lcq lcq2) {
        this.gzP = lcq2;
    }

    public boolean isTracerFaceCamera() {
        return this.gzS;
    }

    public void setTracerFaceCamera(boolean bl) {
        this.gzS = bl;
    }

    public float getTracerScale() {
        return this.gzO;
    }

    public void setTracerScale(float f) {
        this.gzO = f;
    }

    public boolean isUseTracer() {
        return this.gzN;
    }

    public void setUseTracer(boolean bl) {
        this.gzN = bl;
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

    public float getRadius_1() {
        return this.gwm;
    }

    public void setRadius_1(float f) {
        this.gwm = f;
    }

    public float getRadius_2() {
        return this.gwn;
    }

    public void setRadius_2(float f) {
        this.gwn = f;
    }

    public float getTimeOfOneRevolution() {
        return this.gwo;
    }

    public void setTimeOfOneRevolution(float f) {
        this.gwo = f;
    }

    public float getSpiralFrequency_1() {
        return this.gwp;
    }

    public void setSpiralFrequency_1(float f) {
        this.gwp = f;
    }

    public float getSpiralFrequency_2() {
        return this.gwq;
    }

    public void setSpiralFrequency_2(float f) {
        this.gwq = f;
    }

    public int getTrajectoryPlane() {
        return this.gwr;
    }

    public void setTrajectoryPlane(int n) {
        this.gwr = n;
    }

    public dey getAtom(int n) {
        if (n == 0) {
            return this.grP;
        }
        if (n == 1) {
            return this.gur;
        }
        return null;
    }

    public int getAtomCount() {
        return 2;
    }
}


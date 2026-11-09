/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class djb
extends dgj {
    private dfo grP = null;
    private mgj grz = null;
    private dfz gur = null;
    private ljq grA = null;
    private ljq grB = null;
    private float fXV = 0.2f;
    private float grC = 1.0f;
    private float grD = 2.0f;
    private float Radius = 2.0f;
    private float grE = 1.0f;
    private float gzM = 1.0f;
    private boolean grF = false;
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
    protected float gvj = 0.0f;
    protected float gvk = 0.0f;
    private boolean grG = false;
    private boolean grH = false;
    private boolean gsH = false;
    private boolean gzN = false;
    private float gzO = 0.2f;
    private lcq gzP = null;
    private lcq gzQ = null;
    private int gzR = 10;
    private boolean gzS = false;
    private double gvp;
    private double gvq;
    private dkx grI = null;
    private dky grJ = null;
    private dky grK = null;
    private ljq gzT = null;
    private boolean gsg = false;
    private float gsh = 0.0f;

    djb() {
        this.gqB = 25;
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
        }
        if (this.grH) {
            assert (this.getTargetObjectGUID() != null);
            assert (this.getSourceObjectGUID() != null);
            this.grJ = this.setupPositionalSensorOnTargetObject();
            this.grK = this.setupPositionalSensorOnSourceObject();
        }
        if (this.gzN) {
            this.setupTracer();
        }
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.updateTrajectory();
        if (!this.gqU && this.isCameraReady() && this.grI == null) {
            float f;
            if (this.gqV) {
                if (this.gqX + this.gqW > this.nx.rgz) {
                    if (this.gqY) {
                        this.updateObject();
                    }
                    return;
                }
                this.updateRangeCheckTime();
            }
            if ((f = mfx.g(this.getCameraReadOnlyPosition(), this.grz.eyA(), this.grz.eyB())) < this.getMaxCamDistUpdateSpecialEffect()) {
                this.gqY = true;
                this.updateObject();
            } else {
                this.gqY = false;
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

    private void updateTrajectory() {
        if (this.grH) {
            ljq ljq2;
            if (this.grK != null) {
                ljq2 = new ljq(this.grK.av());
                ljq2.es(this.grA);
                this.grz.eP(ljq2);
            }
            if (this.grJ != null) {
                ljq2 = new ljq(this.grJ.av());
                ljq2.es(this.grB);
                this.grz.setPoint1(ljq2);
            }
        }
    }

    private void setupTrajectory() {
        this.grz = new mgj();
        if (this.grG) {
            ljq ljq2 = new ljq(this.grA);
            if (this.getSourcePosition() != null) {
                ljq2.es(this.getSourcePosition());
            } else {
                ljq2.es(this.getTargetPosition());
            }
            ljq ljq3 = new ljq(this.grB);
            ljq3.es(this.getTargetPosition());
            this.grz.C(ljq2, ljq3);
        } else if (this.isRelationEffect()) {
            this.grz.C(this.grA, this.grB);
        } else {
            ljq ljq4 = new ljq(this.grA);
            ljq4.es(this.getTargetPosition());
            ljq ljq5 = new ljq(this.grB);
            ljq5.es(this.getTargetPosition());
            this.grz.C(ljq4, ljq5);
        }
        this.grz.setMaxTurnAngle(this.grE);
        this.grz.setRadius(this.Radius);
        this.grz.setSpeed(this.fXV);
        this.grz.setStepLengthMax(this.grD);
        this.grz.setStepLengthMin(this.grC);
        this.grz.setLinearInterpolation(this.grF);
        this.grz.setMaxRadiusDelta(this.getMaxRadiusDelta());
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
        this.gur.setEnabled(true);
        this.MessageDelegator.a(this.gur);
    }

    protected void createObject() {
        this.gvp = this.getDuration() * this.gvj;
        this.gvq = this.getDuration() * (1.0f - this.gvk);
        this.grP = (dfo)dKP.Af(14);
        this.grP.setGUID(this.getMainAtomGuid());
        this.grP.gr(this.gsB);
        this.grP.setActive(true);
        this.grP.setEndColor(this.eop);
        this.grP.setEndRotation(this.gsx);
        this.grP.setEndScale(this.doX);
        this.grP.setGravityInfluence(this.gsv);
        this.grP.setNumParticles(this.gtp);
        this.grP.setNumTextures(this.grQ);
        this.grP.setParticleAcceleration(this.doQ);
        this.grP.setParticleLifeTime(this.grZ);
        this.grP.setAnimationFrequency(this.getAnimationFrequency());
        this.grP.setStartColor(this.eoo);
        this.grP.setEndColor(this.eop);
        this.grP.hQ(this.gsg);
        this.grP.gn(this.gsh);
        this.updateFade();
        ljq ljq2 = this.grz.ez(this.MessageDelegator.arc().rgz);
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
        ljq ljq2 = this.grz.ez(this.MessageDelegator.arc().rgz);
        if (this.grI != null) {
            this.grI.setDeltaPos(ljq2);
        } else {
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
        this.grA = new ljq(1.0f, 0.0f, 0.0f);
        this.grB = new ljq(-1.0f, 0.0f, 0.0f);
        this.fXV = 1.0f;
        this.grC = 1.0f;
        this.grD = 2.0f;
        this.Radius = 2.0f;
        this.grE = 1.0f;
        this.grF = false;
        this.gzM = 0.1f;
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
        this.bis = new ljq();
        this.gBo = false;
        this.gBp = 1.0f;
        this.gBq = 10.0f;
        this.gvj = 0.0f;
        this.gvk = 0.0f;
        this.grG = false;
        this.grH = false;
        this.gsH = false;
        this.gzN = false;
        this.gzO = 0.2f;
        this.gzP = lcq.BRIGHT_WHITE;
        this.gzQ = lcq.BRIGHT_WHITE;
        this.gzR = 10;
        this.gzS = false;
        this.gsg = false;
        this.gsh = 0.0f;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        djb djb2 = (djb)dgj2;
        djb2.grA = this.grA;
        djb2.grB = this.grB;
        djb2.fXV = this.fXV;
        djb2.grC = this.grC;
        djb2.grD = this.grD;
        djb2.Radius = this.Radius;
        djb2.grE = this.grE;
        djb2.grF = this.grF;
        djb2.gzM = this.gzM;
        djb2.fFC = this.fFC;
        djb2.grQ = this.grQ;
        djb2.eoo = this.eoo;
        djb2.eop = this.eop;
        djb2.gtp = this.gtp;
        djb2.gsu = this.gsu;
        djb2.gsv = this.gsv;
        djb2.doW = this.doW;
        djb2.doX = this.doX;
        djb2.gsw = this.gsw;
        djb2.gsx = this.gsx;
        djb2.gsy = this.gsy;
        djb2.gsz = this.gsz;
        djb2.gsA = this.gsA;
        djb2.gsB = this.gsB;
        djb2.gtq = this.gtq;
        djb2.doQ = this.doQ;
        djb2.grZ = this.grZ;
        djb2.bis = this.bis;
        djb2.gBo = this.gBo;
        djb2.gBp = this.gBp;
        djb2.gBq = this.gBq;
        djb2.gvj = this.gvj;
        djb2.gvk = this.gvk;
        djb2.grG = this.grG;
        djb2.grH = this.grH;
        djb2.gsH = this.gsH;
        djb2.gzN = this.gzN;
        djb2.gzO = this.gzO;
        djb2.gzP = this.gzP;
        djb2.gzQ = this.gzQ;
        djb2.gzR = this.gzR;
        djb2.gzS = this.gzS;
        djb2.gsf = this.gsf;
        djb2.gsg = this.gsg;
        djb2.gsh = this.gsh;
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

    public boolean isLinearInterpolation() {
        return this.grF;
    }

    public void setLinearInterpolation(boolean bl) {
        this.grF = bl;
    }

    public float getMaxTurnAngle() {
        return this.grE;
    }

    public void setMaxTurnAngle(float f) {
        this.grE = f;
    }

    public int getNumberOfTracerPoints() {
        return this.gzR;
    }

    public void setNumberOfTracerPoints(int n) {
        this.gzR = n;
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

    public dfo getParticle() {
        return this.grP;
    }

    public void setParticle(dfo dfo2) {
        this.grP = dfo2;
    }

    public float getParticleLifeTime() {
        return this.grZ;
    }

    public void setParticleLifeTime(float f) {
        this.grZ = f;
    }

    public ljq getPoint1() {
        return this.grA;
    }

    public void setPoint1(ljq ljq2) {
        this.grA = ljq2;
    }

    public ljq getPoint2() {
        return this.grB;
    }

    public void setPoint2(ljq ljq2) {
        this.grB = ljq2;
    }

    public float getRadius() {
        return this.Radius;
    }

    public void setRadius(float f) {
        this.Radius = f;
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

    public boolean isSetupSourceAndTargetSensors() {
        return this.grH;
    }

    public void setSetupSourceAndTargetSensors(boolean bl) {
        this.grH = bl;
    }

    public float getSpeed() {
        return this.fXV;
    }

    public void setSpeed(float f) {
        this.fXV = f;
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

    public float getStepLengthMax() {
        return this.grD;
    }

    public void setStepLengthMax(float f) {
        this.grD = f;
    }

    public float getStepLengthMin() {
        return this.grC;
    }

    public void setStepLengthMin(float f) {
        this.grC = f;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
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

    public mgj getTrajectory() {
        return this.grz;
    }

    public void setTrajectory(mgj mgj2) {
        this.grz = mgj2;
    }

    public boolean isUsePower() {
        return this.gsH;
    }

    public void setUsePower(boolean bl) {
        this.gsH = bl;
    }

    public boolean isUseSourceAndTargetPosition() {
        return this.grG;
    }

    public void setUseSourceAndTargetPosition(boolean bl) {
        this.grG = bl;
    }

    public boolean isUseTracer() {
        return this.gzN;
    }

    public void setUseTracer(boolean bl) {
        this.gzN = bl;
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

    public float getAnimationFrequency() {
        return this.gsf;
    }

    public void setAnimationFrequency(float f) {
        this.gsf = f;
    }

    public float getMaxRadiusDelta() {
        return this.gzM;
    }

    public void setMaxRadiusDelta(float f) {
        this.gzM = f;
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


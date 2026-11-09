/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class djd
extends dgj {
    protected dfo grP = null;
    private mgg gvX = null;
    private dfz gur = null;
    private int gvY = 1;
    private ljq gvZ = null;
    private ljq grM = null;
    private float gwa = 1.0f;
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
    protected float gvj = 0.0f;
    protected float gvk = 0.0f;
    boolean gsH = false;
    private boolean gzN = false;
    private float gzO = 0.2f;
    private lcq gzP = null;
    private lcq gzQ = null;
    private int gzR = 10;
    private boolean gzS = false;
    private double gvp;
    private double gvq;
    ljq gzT = null;
    private dkx grI = null;
    private dky grJ = null;
    private boolean gsg = false;
    private float gsh = 0.0f;

    djd() {
        this.gqB = 23;
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
        this.gvX = new mgg();
        this.gvX.setRadius(this.grM);
        this.gvX.setNumLoops(this.gvY);
        this.gvX.setFullCycleTime(this.gwa);
        lgl lgl2 = new lgl(this.gvZ);
        this.gvX.ad(lgl2);
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
        this.grP.setAnimationFrequency(this.getAnimationFrequency());
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
        ljq ljq2 = this.gvX.ez(this.nx.rgz);
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
        this.gvY = 1;
        this.gvZ = new ljq(0.0f, 3.14f, 0.0f);
        this.grM = new ljq(1.0f, 1.0f, 1.0f);
        this.gwa = 1.0f;
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
        this.gsH = false;
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
        djd djd2 = (djd)dgj2;
        djd2.gvY = this.gvY;
        djd2.gvZ = this.gvZ;
        djd2.grM = this.grM;
        djd2.gwa = this.gwa;
        djd2.grN = this.grN;
        djd2.gsf = this.gsf;
        djd2.fFC = this.fFC;
        djd2.grQ = this.grQ;
        djd2.eoo = this.eoo;
        djd2.eop = this.eop;
        djd2.gtp = this.gtp;
        djd2.gsu = this.gsu;
        djd2.gsv = this.gsv;
        djd2.doW = this.doW;
        djd2.doX = this.doX;
        djd2.gsw = this.gsw;
        djd2.gsx = this.gsx;
        djd2.gsy = this.gsy;
        djd2.gsz = this.gsz;
        djd2.gsA = this.gsA;
        djd2.gsB = this.gsB;
        djd2.gtq = this.gtq;
        djd2.doQ = this.doQ;
        djd2.grZ = this.grZ;
        djd2.bis = this.bis;
        djd2.gBo = this.gBo;
        djd2.gBp = this.gBp;
        djd2.gBq = this.gBq;
        djd2.gvj = this.gvj;
        djd2.gvk = this.gvk;
        djd2.gsH = this.gsH;
        djd2.gzN = this.gzN;
        djd2.gzO = this.gzO;
        djd2.gzP = this.gzP;
        djd2.gzQ = this.gzQ;
        djd2.gzR = this.gzR;
        djd2.gzS = this.gzS;
        djd2.gsg = this.gsg;
        djd2.gsh = this.gsh;
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

    public float getFullCycleTime() {
        return this.gwa;
    }

    public void setFullCycleTime(float f) {
        this.gwa = f;
    }

    public float getGravityInfluence() {
        return this.gsv;
    }

    public void setGravityInfluence(float f) {
        this.gsv = f;
    }

    public int getNumLoops() {
        return this.gvY;
    }

    public void setNumLoops(int n) {
        this.gvY = n;
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

    public ljq getOrientation() {
        return this.gvZ;
    }

    public void setOrientation(ljq ljq2) {
        this.gvZ = ljq2;
    }

    public float getParticleLifeTime() {
        return this.grZ;
    }

    public void setParticleLifeTime(float f) {
        this.grZ = f;
    }

    public ljq getRadius() {
        return this.grM;
    }

    public void setRadius(ljq ljq2) {
        this.grM = ljq2;
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

    public boolean isUsePower() {
        return this.gsH;
    }

    public void setUsePower(boolean bl) {
        this.gsH = bl;
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

    public dey getAtom(int n) {
        return this.grP;
    }

    public int getAtomCount() {
        return 1;
    }
}


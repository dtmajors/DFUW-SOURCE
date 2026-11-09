/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dil
extends dgj {
    private dfm gtf = null;
    private ljq gzw = null;
    private String ekh = null;
    private lcq gxq = null;
    private boolean gzH = false;
    private float gzI = 0.5f;
    private float gzJ = 0.1f;
    private float gzK = 0.0f;
    private boolean gzL = true;
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
    private boolean gzN = false;
    private float gzO = 0.2f;
    private lcq gzP = null;
    private lcq gzQ = null;
    private int gzR = 10;
    private boolean gzS = false;
    private boolean grG = false;
    private boolean grH = false;
    private dkx grI = null;
    private dky grJ = null;
    private dky grK = null;
    private ljq gzT = null;

    public dil() {
        this.gqB = 34;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeObject();
        if (this.gur != null) {
            dey.bls().b(this.gur);
            this.gur = null;
        }
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.setupTrajectory();
        this.createObject();
        if (this.isRelationEffect()) {
            this.grI = this.setupPositionalRelation(this.getTargetObjectGUID(), this.gtf.getGUID(), this.getMainEffectObjectType());
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
            float f2;
            if (this.gqV) {
                if (this.gqX + this.gqW > this.nx.rgz) {
                    if (this.gqY) {
                        this.updateObject();
                    }
                    return;
                }
                this.updateRangeCheckTime();
            }
            if ((f2 = mfx.g(this.getCameraReadOnlyPosition(), this.grz.eyA(), this.grz.eyB())) < this.getMaxCamDistUpdateSpecialEffect()) {
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
        if (this.gtf != null) {
            dey.bls().b(this.gtf);
            this.gtf = null;
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
        this.grz.setMaxRadiusDelta(this.gzM);
    }

    private void setupTracer() {
        this.gur = (dfz)dKP.Af(19);
        assert (this.gur != null);
        this.gur.setGUID(this.getNewEffectGuid());
        this.gur.mH(this.gtf.getGUID());
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

    private lgl getMeshRotation() {
        ljq ljq2 = null;
        if (this.grz.eyC()) {
            ljq2 = this.grz.eyz();
            ljq2.et(this.grz.getPoint1());
        } else {
            ljq2 = this.grz.getPoint1();
            ljq2.et(this.grz.eyz());
        }
        ljq2.normalize();
        lgl lgl2 = lgl.q(new ljq(0.0f, 0.0f, 1.0f), ljq2);
        lgl lgl3 = new lgl(this.gzw);
        lgl3.Y(lgl2);
        if (this.gzH) {
            float f2 = (float)(Math.random() * (double)this.gzJ * this.nx.qwh);
            if (this.gzL) {
                this.gzK += f2;
                if (this.gzK > this.gzI) {
                    this.gzK = this.gzI;
                    this.gzL = false;
                }
            } else {
                this.gzK -= f2;
                if (this.gzK < -this.gzI) {
                    this.gzK = -this.gzI;
                    this.gzL = true;
                }
            }
            ljq ljq3 = new ljq(0.0f, this.gzK, 0.0f);
            lgl lgl4 = new lgl(ljq3);
            lgl3.Y(lgl4);
        }
        return lgl3;
    }

    protected void createObject() {
        lgl lgl2 = this.getMeshRotation();
        this.gtf = (dfm)dKP.Af(11);
        this.gtf.setGUID(this.getMainAtomGuid());
        this.gtf.setActive(true);
        this.gtf.setDefaultValues();
        this.gtf.setMeshXML(this.ekh);
        this.gtf.c(this.getTargetPosition());
        this.gtf.a(lgl2);
        this.gtf.n(this.gxq);
        this.MessageDelegator.a(this.gtf);
    }

    protected void updateObject() {
        ljq ljq2 = this.grz.ez(this.MessageDelegator.arc().rgz);
        lgl lgl2 = this.getMeshRotation();
        if (this.grI != null) {
            this.grI.setDeltaPos(ljq2);
            this.grI.setDeltaRot(lgl2);
        } else {
            this.gtf.c(ljq2);
        }
        this.gtf.a(lgl2);
        this.gzT = ljq2;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dil dil2 = (dil)dgj2;
        dil2.gzw = this.gzw;
        dil2.ekh = this.ekh;
        dil2.gzH = this.gzH;
        dil2.gzI = this.gzI;
        dil2.gzJ = this.gzJ;
        dil2.grA = this.grA;
        dil2.grB = this.grB;
        dil2.fXV = this.fXV;
        dil2.grC = this.grC;
        dil2.grD = this.grD;
        dil2.Radius = this.Radius;
        dil2.grE = this.grE;
        dil2.gzM = this.gzM;
        dil2.grF = this.grF;
        dil2.gzN = this.gzN;
        dil2.gzO = this.gzO;
        dil2.gzP = this.gzP;
        dil2.gzQ = this.gzQ;
        dil2.gzR = this.gzR;
        dil2.gzS = this.gzS;
        dil2.grG = this.grG;
        dil2.grH = this.grH;
        dil2.gxq = this.gxq;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gzw = new ljq();
        this.ekh = "";
        this.gzH = true;
        this.gzI = 0.5f;
        this.gzJ = 0.1f;
        this.grA = new ljq();
        this.grB = new ljq(0.0f, 1.0f, 0.0f);
        this.fXV = 0.2f;
        this.grC = 1.0f;
        this.grD = 2.0f;
        this.Radius = 2.0f;
        this.grE = 1.0f;
        this.gzM = 1.0f;
        this.grF = false;
        this.gzN = false;
        this.gzO = 0.2f;
        this.gzP = lcq.BRIGHT_WHITE;
        this.gzQ = lcq.BRIGHT_WHITE;
        this.gzR = 10;
        this.gzS = false;
        this.grG = false;
        this.grH = false;
        this.gxq = lcq.BRIGHT_WHITE;
    }

    public boolean isLinearInterpolation() {
        return this.grF;
    }

    public void setLinearInterpolation(boolean bl) {
        this.grF = bl;
    }

    public float getMaxRadiusDelta() {
        return this.gzM;
    }

    public void setMaxRadiusDelta(float f2) {
        this.gzM = f2;
    }

    public float getMaxTurnAngle() {
        return this.grE;
    }

    public void setMaxTurnAngle(float f2) {
        this.grE = f2;
    }

    public float getMaxYRot() {
        return this.gzI;
    }

    public void setMaxYRot(float f2) {
        this.gzI = f2;
    }

    public float getMaxYRotPrSec() {
        return this.gzJ;
    }

    public void setMaxYRotPrSec(float f2) {
        this.gzJ = f2;
    }

    public String getMeshXML() {
        return this.ekh;
    }

    public void setMeshXML(String string) {
        this.ekh = string;
    }

    public int getNumberOfTracerPoints() {
        return this.gzR;
    }

    public void setNumberOfTracerPoints(int n2) {
        this.gzR = n2;
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

    public void setRadius(float f2) {
        this.Radius = f2;
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

    public void setSpeed(float f2) {
        this.fXV = f2;
    }

    public ljq getStartRotation() {
        return this.gzw;
    }

    public void setStartRotation(ljq ljq2) {
        this.gzw = ljq2;
    }

    public float getStepLengthMax() {
        return this.grD;
    }

    public void setStepLengthMax(float f2) {
        this.grD = f2;
    }

    public float getStepLengthMin() {
        return this.grC;
    }

    public void setStepLengthMin(float f2) {
        this.grC = f2;
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

    public void setTracerScale(float f2) {
        this.gzO = f2;
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

    public boolean isRotateMeshY() {
        return this.gzH;
    }

    public void setRotateMeshY(boolean bl) {
        this.gzH = bl;
    }

    public lcq getMeshColor() {
        return this.gxq;
    }

    public void setMeshColor(lcq lcq2) {
        this.gxq = lcq2;
    }

    public dey getAtom(int n2) {
        return this.gtf;
    }

    public int getAtomCount() {
        return 1;
    }
}


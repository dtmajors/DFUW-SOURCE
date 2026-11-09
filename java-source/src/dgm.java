/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dgm
extends dgj {
    private dfc gry = null;
    private mgj grz = null;
    private ljq grA = null;
    private ljq grB = null;
    private float fXV = 1.0f;
    private float grC = 1.0f;
    private float grD = 2.0f;
    private float Radius = 2.0f;
    private float grE = 1.0f;
    private boolean grF = false;
    private boolean grG = false;
    private boolean grH = false;
    private float bpE = 0.0f;
    private float aSc = 0.0f;
    private int eMf = 360;
    private int eMg = 360;
    private ljq eMh = null;
    private long dKH = 0L;
    private boolean eMi = true;
    private boolean eMj = false;
    private String gnK = null;
    private dkx grI = null;
    private dky grJ = null;
    private dky grK = null;

    dgm() {
        this.gqB = 27;
        this.gqA = Float.valueOf(-1.0f);
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeAudio();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.updateTrajectory();
        if (!this.gqU && this.isCameraReady()) {
            float f2 = mfx.g(this.getCameraReadOnlyPosition(), this.grz.eyA(), this.grz.eyB());
            if (f2 < this.getMaxCamDistUpdateSpecialEffect()) {
                this.updateAudio();
            }
        } else {
            this.updateAudio();
        }
    }

    protected int getMainEffectObjectType() {
        return 3;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.setupTrajectory();
        this.createAudio();
        if (this.isRelationEffect()) {
            this.grI = this.setupPositionalRelation(this.getTargetObjectGUID(), this.gry.getGUID(), this.getMainEffectObjectType());
        }
        if (this.grH) {
            assert (this.getTargetObjectGUID() != null);
            assert (this.getSourceObjectGUID() != null);
            this.grJ = this.setupPositionalSensorOnTargetObject();
            this.grK = this.setupPositionalSensorOnSourceObject();
        }
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dgm dgm2 = (dgm)dgj2;
        dgm2.bpE = this.bpE;
        dgm2.aSc = this.aSc;
        dgm2.eMf = this.eMf;
        dgm2.eMg = this.eMg;
        dgm2.eMh = this.eMh;
        dgm2.dKH = this.dKH;
        dgm2.eMi = this.eMi;
        dgm2.eMj = this.eMj;
        dgm2.gnK = this.gnK;
        dgm2.grA = this.grA;
        dgm2.grB = this.grB;
        dgm2.fXV = this.fXV;
        dgm2.grC = this.grC;
        dgm2.grD = this.grD;
        dgm2.Radius = this.Radius;
        dgm2.grE = this.grE;
        dgm2.grF = this.grF;
        dgm2.grG = this.grG;
        dgm2.grH = this.grH;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.bpE = 100.0f;
        this.aSc = 0.0f;
        this.eMf = 360;
        this.eMg = 360;
        this.eMh = new ljq(0.0f, 1.0f, 0.0f);
        this.dKH = 0L;
        this.eMi = true;
        this.eMj = false;
        this.gnK = null;
        this.grA = new ljq(1.0f, 0.0f, 0.0f);
        this.grB = new ljq(-1.0f, 0.0f, 0.0f);
        this.fXV = 0.2f;
        this.grC = 0.1f;
        this.grD = 0.3f;
        this.Radius = 2.0f;
        this.grE = 1.5707964f;
        this.grF = true;
        this.grG = true;
        this.grH = true;
    }

    protected void createAudio() {
        this.gry = (dfc)dKP.Af(4);
        this.gry.setGUID(this.getMainAtomGuid());
        this.gry.setActive(true);
        this.gry.setConeOrientation(this.eMh);
        this.gry.setConeOutsideVolume(this.dKH);
        this.gry.setInsideConeAngle(this.eMf);
        this.gry.setLooping(this.eMi);
        this.gry.hO(true);
        this.gry.setMaxDistance(this.bpE);
        this.gry.setMinDistance(this.aSc);
        this.gry.setMode(0);
        this.gry.setOutsideConeAngle(this.eMg);
        this.gry.setPlayingOnce(this.eMj);
        this.gry.bi(new ljq());
        this.gry.setXMLFileName(this.gnK);
        ljq ljq2 = this.grz.ez(this.nx.rgz);
        this.gry.bK(ljq2);
        this.gry.c(this);
        this.MessageDelegator.a(this.gry);
    }

    protected void removeAudio() {
        if (this.gry == null) {
            return;
        }
        dey.bls().b(this.gry);
        this.gry = null;
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

    private void updateAudio() {
        ljq ljq2 = this.grz.ez(this.nx.rgz);
        if (this.grI != null) {
            this.grI.setDeltaPos(ljq2);
        } else {
            this.gry.bK(ljq2);
        }
    }

    public ljq getConeOrientation() {
        return this.eMh;
    }

    public void setConeOrientation(ljq ljq2) {
        this.eMh = ljq2;
    }

    public long getConeOutsideVolume() {
        return this.dKH;
    }

    public void setConeOutsideVolume(long l2) {
        this.dKH = l2;
    }

    public int getInsideConeAngle() {
        return this.eMf;
    }

    public void setInsideConeAngle(int n2) {
        this.eMf = n2;
    }

    public boolean isLinearInterpolation() {
        return this.grF;
    }

    public void setLinearInterpolation(boolean bl) {
        this.grF = bl;
    }

    public boolean isLooping() {
        return this.eMi;
    }

    public void setLooping(boolean bl) {
        this.eMi = bl;
    }

    public float getMaxDistance() {
        return this.bpE;
    }

    public void setMaxDistance(float f2) {
        this.bpE = f2;
    }

    public float getMaxTurnAngle() {
        return this.grE;
    }

    public void setMaxTurnAngle(float f2) {
        this.grE = f2;
    }

    public float getMinDistance() {
        return this.aSc;
    }

    public void setMinDistance(float f2) {
        this.aSc = f2;
    }

    public int getOutsideConeAngle() {
        return this.eMg;
    }

    public void setOutsideConeAngle(int n2) {
        this.eMg = n2;
    }

    public boolean isPlayingOnce() {
        return this.eMj;
    }

    public void setPlayingOnce(boolean bl) {
        this.eMj = bl;
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

    public boolean isUseSourceAndTargetPosition() {
        return this.grG;
    }

    public void setUseSourceAndTargetPosition(boolean bl) {
        this.grG = bl;
    }

    public String getXMLFileName() {
        return this.gnK;
    }

    public void setXMLFileName(String string) {
        this.gnK = string;
    }
}


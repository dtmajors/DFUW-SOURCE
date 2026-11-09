/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dhq
extends dgj {
    private dfw gvf = null;
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
    private boolean gvl = false;
    private boolean gvm = true;
    private float Ue = 10.0f;
    private float Uf = 3.0f;
    private String fFC = null;
    private float gvn = 0.0f;
    private lcq gvo = null;
    private int gvg = 7;
    private float gvj = 0.0f;
    private float gvk = 0.0f;
    private double gvp;
    private double gvq;
    private dkx grI = null;
    private dky grJ = null;
    private dky grK = null;

    dhq() {
        this.gqB = 22;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeLight();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.updateTrajectory();
        this.updateLight();
    }

    protected int getMainEffectObjectType() {
        return 2;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.setupTrajectory();
        this.setupLight();
        if (this.isRelationEffect()) {
            this.grI = this.setupPositionalRelation(this.getTargetObjectGUID(), this.gvf.getGUID(), this.getMainEffectObjectType());
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
        dhq dhq2 = (dhq)dgj2;
        dhq2.grA = this.grA;
        dhq2.grB = this.grB;
        dhq2.fXV = this.fXV;
        dhq2.grC = this.grC;
        dhq2.grD = this.grD;
        dhq2.Radius = this.Radius;
        dhq2.grE = this.grE;
        dhq2.grF = this.grF;
        dhq2.grG = this.grG;
        dhq2.grH = this.grH;
        dhq2.gvl = this.gvl;
        dhq2.gvm = this.gvm;
        dhq2.Ue = this.Ue;
        dhq2.Uf = this.Uf;
        dhq2.fFC = this.fFC;
        dhq2.gvn = this.gvn;
        dhq2.gvo = this.gvo;
        dhq2.gvg = this.gvg;
        dhq2.gvj = this.gvj;
        dhq2.gvk = this.gvk;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.grA = new ljq();
        this.grB = new ljq();
        this.fXV = 1.0f;
        this.grC = 1.0f;
        this.grD = 2.0f;
        this.Radius = 2.0f;
        this.grE = 1.0f;
        this.grF = false;
        this.grG = false;
        this.grH = false;
        this.gvl = false;
        this.gvm = true;
        this.Ue = 10.0f;
        this.Uf = 3.0f;
        this.fFC = null;
        this.gvn = 1.0f;
        this.gvo = lcq.BRIGHT_WHITE;
        this.gvg = 7;
        this.gvj = 0.0f;
        this.gvk = 0.0f;
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

    private void setupLight() {
        this.gvf = (dfw)dKP.Af(21);
        this.gvf.setGUID(this.getMainAtomGuid());
        this.gvf.setActive(true);
        this.gvf.setDefaultValues();
        this.gvf.setInnerColor(this.gvo);
        this.gvf.setInnerIntensity(this.gvn);
        this.gvf.setInnerOn(this.gvl);
        if (this.hasInfiniteDuration()) {
            this.gvf.setInnerRadius(this.Uf);
            this.gvf.setOuterRadius(this.Ue);
        } else {
            this.gvf.setInnerRadius(0.0f);
            this.gvf.setOuterRadius(0.0f);
            this.gvp = this.getDuration() * this.gvj;
            this.gvq = this.getDuration() * (1.0f - this.gvk);
        }
        this.gvf.hX(true);
        this.gvf.setOuterColorNumber(this.gvg);
        this.gvf.setOuterOn(this.gvm);
        ljq ljq2 = this.grz.ez(this.nx.rgz);
        this.gvf.c(ljq2);
        this.gvf.setTextureName(this.fFC);
        this.MessageDelegator.a(this.gvf);
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

    private void updateLight() {
        ljq ljq2 = this.grz.ez(this.nx.rgz);
        if (this.grI != null) {
            this.grI.setDeltaPos(ljq2);
        } else {
            this.gvf.c(ljq2);
        }
        if (this.hasInfiniteDuration()) {
            return;
        }
        if (this.gvj != 0.0f && this.gvk != 0.0f) {
            float f2 = this.calculateTimeVal(this.gvp, this.gvq);
            this.gvf.setOuterRadius(f2 * this.Ue);
            this.gvf.setInnerRadius(f2 * this.Uf);
        }
    }

    private void removeLight() {
        if (this.gvf != null) {
            dey.bls().b(this.gvf);
            this.gvf = null;
        }
    }

    public float getExpandPercentTime() {
        return this.gvj;
    }

    public void setExpandPercentTime(float f2) {
        this.gvj = f2;
    }

    public lcq getInnerColor() {
        return this.gvo;
    }

    public void setInnerColor(lcq lcq2) {
        this.gvo = lcq2;
    }

    public float getInnerIntensity() {
        return this.gvn;
    }

    public void setInnerIntensity(float f2) {
        this.gvn = f2;
    }

    public boolean isInnerOn() {
        return this.gvl;
    }

    public void setInnerOn(boolean bl) {
        this.gvl = bl;
    }

    public float getInnerRadius() {
        return this.Uf;
    }

    public void setInnerRadius(float f2) {
        this.Uf = f2;
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

    public void setMaxTurnAngle(float f2) {
        this.grE = f2;
    }

    public int getOuterColorNumber() {
        return this.gvg;
    }

    public void setOuterColorNumber(int n2) {
        this.gvg = n2;
    }

    public boolean isOuterOn() {
        return this.gvm;
    }

    public void setOuterOn(boolean bl) {
        this.gvm = bl;
    }

    public float getOuterRadius() {
        return this.Ue;
    }

    public void setOuterRadius(float f2) {
        this.Ue = f2;
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

    public float getRetractPercentTime() {
        return this.gvk;
    }

    public void setRetractPercentTime(float f2) {
        this.gvk = f2;
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

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public boolean isUseSourceAndTargetPosition() {
        return this.grG;
    }

    public void setUseSourceAndTargetPosition(boolean bl) {
        this.grG = bl;
    }
}


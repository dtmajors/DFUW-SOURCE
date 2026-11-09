/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dhu
extends dgj {
    private dfw gvf = null;
    private mgk gwl = null;
    private float gwm;
    private float gwn;
    private float gwo;
    private float gwp;
    private float gwq;
    private int gwr = 0;
    private ljq grN = null;
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

    dhu() {
        this.gqB = 74;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeLight();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
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
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dhu dhu2 = (dhu)dgj2;
        dhu2.gwm = this.gwm;
        dhu2.gwn = this.gwn;
        dhu2.gwo = this.gwo;
        dhu2.gwp = this.gwp;
        dhu2.gwq = this.gwq;
        dhu2.gwr = this.gwr;
        dhu2.grN = this.grN;
        dhu2.gvl = this.gvl;
        dhu2.gvm = this.gvm;
        dhu2.Ue = this.Ue;
        dhu2.Uf = this.Uf;
        dhu2.fFC = this.fFC;
        dhu2.gvn = this.gvn;
        dhu2.gvo = this.gvo;
        dhu2.gvg = this.gvg;
        dhu2.gvj = this.gvj;
        dhu2.gvk = this.gvk;
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
        this.gwl = new mgk();
        this.gwl.setRadius_1(this.gwm);
        this.gwl.setRadius_2(this.gwn);
        this.gwl.setTimeOfOneRevolution(this.gwo);
        this.gwl.setSpiralFrequency_1(this.gwp);
        this.gwl.setSpiralFrequency_2(this.gwq);
        this.gwl.setTrajectoryPlane(this.gwr);
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
            this.gvp = this.getDuration() * this.gvj;
            this.gvq = this.getDuration() * (1.0f - this.gvk);
            float f2 = this.calculateTimeVal(this.gvp, this.gvq);
            this.gvf.setOuterRadius(f2 * this.Ue);
            this.gvf.setInnerRadius(f2 * this.Uf);
        }
        this.gvf.hX(true);
        this.gvf.setOuterColorNumber(this.gvg);
        this.gvf.setOuterOn(this.gvm);
        if (this.getTargetPosition() != null) {
            ljq ljq2 = new ljq(this.grN);
            ljq2.es(this.getTargetPosition());
            this.gvf.c(ljq2);
        } else {
            this.gvf.c(this.grN);
        }
        this.gvf.setTextureName(this.fFC);
        this.MessageDelegator.a(this.gvf);
    }

    private void updateLight() {
        ljq ljq2 = this.gwl.ez(this.nx.rgz);
        ljq2.es(this.grN);
        if (this.grI != null) {
            this.grI.setDeltaPos(ljq2);
        } else {
            ljq2.es(this.getTargetPosition());
            this.gvf.c(ljq2);
        }
        if (this.hasInfiniteDuration()) {
            return;
        }
        if (this.gvj != 0.0f || this.gvk != 0.0f) {
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

    public float getRadius_1() {
        return this.gwm;
    }

    public void setRadius_1(float f2) {
        this.gwm = f2;
    }

    public float getRadius_2() {
        return this.gwn;
    }

    public void setRadius_2(float f2) {
        this.gwn = f2;
    }

    public float getTimeOfOneRevolution() {
        return this.gwo;
    }

    public void setTimeOfOneRevolution(float f2) {
        this.gwo = f2;
    }

    public float getSpiralFrequency_1() {
        return this.gwp;
    }

    public void setSpiralFrequency_1(float f2) {
        this.gwp = f2;
    }

    public float getSpiralFrequency_2() {
        return this.gwq;
    }

    public void setSpiralFrequency_2(float f2) {
        this.gwq = f2;
    }

    public int getTrajectoryPlane() {
        return this.gwr;
    }

    public void setTrajectoryPlane(int n2) {
        this.gwr = n2;
    }

    public ljq getTargetOffset() {
        return this.grN;
    }

    public void setTargetOffset(ljq ljq2) {
        this.grN = ljq2;
    }

    public boolean isInnerOn() {
        return this.gvl;
    }

    public void setInnerOn(boolean bl) {
        this.gvl = bl;
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

    public float getInnerRadius() {
        return this.Uf;
    }

    public void setInnerRadius(float f2) {
        this.Uf = f2;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public float getInnerIntensity() {
        return this.gvn;
    }

    public void setInnerIntensity(float f2) {
        this.gvn = f2;
    }

    public lcq getInnerColor() {
        return this.gvo;
    }

    public void setInnerColor(lcq lcq2) {
        this.gvo = lcq2;
    }

    public int getOuterColorNumber() {
        return this.gvg;
    }

    public void setOuterColorNumber(int n2) {
        this.gvg = n2;
    }

    public float getExpandPercentTime() {
        return this.gvj;
    }

    public void setExpandPercentTime(float f2) {
        this.gvj = f2;
    }

    public float getRetractPercentTime() {
        return this.gvk;
    }

    public void setRetractPercentTime(float f2) {
        this.gvk = f2;
    }
}


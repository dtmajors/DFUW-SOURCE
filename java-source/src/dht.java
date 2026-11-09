/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dht
extends dgj {
    private dfw gvf = null;
    private mgi grO = null;
    private float grL = 1.57f;
    private float fXV = 0.07961783f;
    private ljq grM = null;
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

    dht() {
        this.gqB = 20;
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
        dht dht2 = (dht)dgj2;
        dht2.grL = this.grL;
        dht2.fXV = this.grL;
        dht2.grM = this.grM;
        dht2.grN = this.grN;
        dht2.gvl = this.gvl;
        dht2.gvm = this.gvm;
        dht2.Ue = this.Ue;
        dht2.Uf = this.Uf;
        dht2.fFC = this.fFC;
        dht2.gvn = this.gvn;
        dht2.gvo = this.gvo;
        dht2.gvg = this.gvg;
        dht2.gvj = this.gvj;
        dht2.gvk = this.gvk;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.grL = 1.57f;
        this.fXV = 0.07961783f;
        this.grM = new ljq(1.0f, 1.0f, 1.0f);
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
        this.grO = new mgi();
        this.grO.K(this.grM.x, this.grM.y, this.grM.rlV);
        this.grO.setSpeed(this.fXV);
        this.grO.setMoveAngle(this.grL);
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
        ljq ljq2 = this.grO.ez(this.nx.rgz);
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

    public float getMoveAngle() {
        return this.grL;
    }

    public void setMoveAngle(float f2) {
        this.grL = f2;
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

    public ljq getRadius() {
        return this.grM;
    }

    public void setRadius(ljq ljq2) {
        this.grM = ljq2;
    }

    public float getRetractPercentTime() {
        return this.gvk;
    }

    public void setRetractPercentTime(float f2) {
        this.gvk = f2;
    }

    public float getSpeed() {
        return this.fXV;
    }

    public void setSpeed(float f2) {
        this.fXV = f2;
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
}


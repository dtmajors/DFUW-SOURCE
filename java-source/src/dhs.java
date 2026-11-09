/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dhs
extends dgj {
    private dfw gvf = null;
    private mgg gvX = null;
    private int gvY = 1;
    private ljq gvZ = null;
    private ljq grM = null;
    private float gwa = 1.0f;
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

    dhs() {
        this.gqB = 21;
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
        dhs dhs2 = (dhs)dgj2;
        dhs2.gvY = this.gvY;
        dhs2.gvZ = this.gvZ;
        dhs2.grM = this.grM;
        dhs2.gwa = this.gwa;
        dhs2.grN = this.grN;
        dhs2.gvl = this.gvl;
        dhs2.gvm = this.gvm;
        dhs2.Ue = this.Ue;
        dhs2.Uf = this.Uf;
        dhs2.fFC = this.fFC;
        dhs2.gvn = this.gvn;
        dhs2.gvo = this.gvo;
        dhs2.gvg = this.gvg;
        dhs2.gvj = this.gvj;
        dhs2.gvk = this.gvk;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gvY = 2;
        this.gvZ = new ljq(0.0f, 3.14f, 0.0f);
        this.grM = new ljq(1.0f, 1.0f, 1.0f);
        this.gwa = 1.0f;
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
        this.gvX = new mgg();
        this.gvX.setRadius(this.grM);
        this.gvX.setNumLoops(this.gvY);
        this.gvX.setFullCycleTime(this.gwa);
        lgl lgl2 = new lgl(this.gvZ);
        this.gvX.ad(lgl2);
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
        ljq ljq2 = this.gvX.ez(this.nx.rgz);
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

    public float getFullCycleTime() {
        return this.gwa;
    }

    public void setFullCycleTime(float f2) {
        this.gwa = f2;
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

    public int getNumLoops() {
        return this.gvY;
    }

    public void setNumLoops(int n2) {
        this.gvY = n2;
    }

    public ljq getOrientation() {
        return this.gvZ;
    }

    public void setOrientation(ljq ljq2) {
        this.gvZ = ljq2;
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


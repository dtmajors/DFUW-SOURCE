/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dhn
extends dgj {
    private float gvO = 0.0f;
    private boolean gvP = false;
    private float gvQ = 1.0f;
    private boolean gvR = false;
    private float gvS = 1.0f;
    private double gvT = 0.0;

    dhn() {
        this.gqB = 58;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.checkLastShake();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.checkShakeUpdate();
    }

    protected int getMainEffectObjectType() {
        return 6;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.startShake();
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dhn dhn2 = (dhn)dgj2;
        dhn2.gvO = this.gvO;
        dhn2.gvP = this.gvP;
        dhn2.gvQ = this.gvQ;
        dhn2.gvR = this.gvR;
        dhn2.gvS = this.gvS;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gvO = 0.0f;
        this.gvP = true;
        this.gvQ = 1.0f;
        this.gvR = true;
        this.gvS = 1.0f;
    }

    private void startShake() {
        this.gvT = this.nx.rgz + (double)this.gvO;
        float f2 = this.getAffectCameraPower();
        if (this.gvP) {
            f2 *= this.gvQ;
        }
        gmQ.a(this.getTargetPosition(), f2, this.getMaxAffectCameraDistance(), this.getGUID(), this.gvO);
    }

    private void checkShakeUpdate() {
        if (this.nx.rgz < this.gvT) {
            return;
        }
        gmQ.b(this.getTargetPosition(), this.getAffectCameraPower(), this.getMaxAffectCameraDistance(), this.getGUID(), this.gvO);
    }

    private void checkLastShake() {
        if (!this.gvR) {
            return;
        }
        gmQ.b(this.getTargetPosition(), this.getAffectCameraPower() * this.gvS, this.getMaxAffectCameraDistance(), this.getGUID(), this.gvO);
    }

    public float getEndShakeMultiplier() {
        return this.gvS;
    }

    public void setEndShakeMultiplier(float f2) {
        this.gvS = f2;
    }

    public boolean isShakeAtEnd() {
        return this.gvR;
    }

    public void setShakeAtEnd(boolean bl) {
        this.gvR = bl;
    }

    public boolean isShakeAtStart() {
        return this.gvP;
    }

    public void setShakeAtStart(boolean bl) {
        this.gvP = bl;
    }

    public float getSingleCameraShakeDuration() {
        return this.gvO;
    }

    public void setSingleCameraShakeDuration(float f2) {
        this.gvO = f2;
    }

    public float getStartShakeMultiplier() {
        return this.gvQ;
    }

    public void setStartShakeMultiplier(float f2) {
        this.gvQ = f2;
    }
}


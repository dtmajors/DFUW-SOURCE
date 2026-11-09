/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class djh
extends dgj {
    private dfp gBv = null;
    private ljq gBw = null;
    private float gBx = 1.0f;
    private float gBy = 1.0f;
    private boolean gBz = false;
    private boolean gBA = true;
    private float gBB = 1.0f;
    private float gBC = 0.0f;

    djh() {
        this.gqB = 55;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeForceField();
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.createForceField();
    }

    protected int getMainEffectObjectType() {
        return 6;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        djh djh2 = (djh)dgj2;
        djh2.gBw = this.gBw;
        djh2.gBx = this.gBx;
        djh2.gBy = this.gBy;
        djh2.gBz = this.gBz;
        djh2.gBA = this.gBA;
        djh2.gBB = this.gBB;
        djh2.gBC = this.gBC;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gBw = new ljq(0.0f, 1.0f, 0.0f);
        this.gBx = 1.0f;
        this.gBy = 1.0f;
        this.gBz = false;
        this.gBA = true;
        this.gBB = 1.0f;
        this.gBC = 0.0f;
    }

    protected void createForceField() {
        assert (this.getTargetPosition() != null);
        this.gBv = (dfp)dKP.Af(26);
        this.gBv.setGUID(this.getMainAtomGuid());
        this.gBv.setActive(true);
        this.gBv.setDefaultValues();
        float f = this.gBB;
        if (this.gBA) {
            f -= -10.0f;
        }
        this.gBv.setRadialAcceleration(this.gBC);
        this.gBv.setDirectionalAcceleration(f);
        this.gBv.Ah(64);
        lcv lcv2 = new lcv();
        lcv2.qFk = this.gBz;
        lcv2.mZ = this.getTargetPosition();
        lcv2.mx = this.gBw.esF();
        if (this.getSourceRotation() != null) {
            lcv2.mx = this.getSourceRotation().eq(lcv2.mx);
        }
        lcv2.mx.normalize();
        lcv2.gPt = this.gBx;
        lcv2.Radius = this.gBy;
        this.gBv.a(lcv2);
        this.MessageDelegator.a(this.gBv);
    }

    protected void removeForceField() {
        if (this.gBv != null) {
            dey.bls().b(this.gBv);
            this.gBv = null;
        }
    }

    public boolean isCylinderCapped() {
        return this.gBz;
    }

    public void setCylinderCapped(boolean bl) {
        this.gBz = bl;
    }

    public float getCylinderHeight() {
        return this.gBx;
    }

    public void setCylinderHeight(float f) {
        this.gBx = f;
    }

    public float getCylinderRadius() {
        return this.gBy;
    }

    public void setCylinderRadius(float f) {
        this.gBy = f;
    }

    public float getDirectionalAcceleration() {
        return this.gBB;
    }

    public void setDirectionalAcceleration(float f) {
        this.gBB = f;
    }

    public ljq getForceDirection() {
        return this.gBw;
    }

    public void setForceDirection(ljq ljq2) {
        this.gBw = ljq2;
    }

    public float getRadialAcceleration() {
        return this.gBC;
    }

    public void setRadialAcceleration(float f) {
        this.gBC = f;
    }

    public boolean isRemoveGravityAcceleration() {
        return this.gBA;
    }

    public void setRemoveGravityAcceleration(boolean bl) {
        this.gBA = bl;
    }
}


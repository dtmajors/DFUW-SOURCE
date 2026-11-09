/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class djr
extends dgj {
    private String gCp = null;
    private ljq gCq = null;
    private ljq gCr = null;
    private float gCs = 0.0f;
    private float gCt = 0.0f;
    private ljq grN = null;
    private double gCu = 0.0;

    djr() {
        this.gqB = 81;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        if (this.gCu <= this.MessageDelegator.arc().rgz) {
            this.gCu = this.MessageDelegator.arc().rgz + (double)lew.aj(this.gCs, this.gCt);
            ljq ljq2 = new ljq(this.getTargetPosition());
            ljq2.es(this.grN);
            ljq2.es(ljq.B(this.gCr, this.gCq));
            if (!this.isRelationEffect()) {
                this.startGenericMainEffect(this.gCp, ljq2);
            } else {
                this.startGenericRelationEffect(this.gCp, ljq2, this.getTargetObjectGUID());
            }
        }
    }

    protected int getMainEffectObjectType() {
        return 6;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.gCu = this.MessageDelegator.arc().rgz;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        djr djr2 = (djr)dgj2;
        djr2.gCp = this.gCp;
        djr2.gCq = this.gCq;
        djr2.gCr = this.gCr;
        djr2.gCs = this.gCs;
        djr2.gCt = this.gCt;
        djr2.grN = this.grN;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gCp = null;
        this.gCq = new ljq();
        this.gCr = new ljq();
        this.gCs = 0.1f;
        this.gCt = 0.5f;
        this.grN = new ljq();
    }

    public String getTargetPositionSFXName() {
        return this.gCp;
    }

    public void setTargetPositionSFXName(String string) {
        this.gCp = string;
    }

    public ljq getMaxRadius() {
        return this.gCq;
    }

    public void setMaxRadius(ljq ljq2) {
        this.gCq = ljq2;
    }

    public ljq getMinRadius() {
        return this.gCr;
    }

    public void setMinRadius(ljq ljq2) {
        this.gCr = ljq2;
    }

    public float getMinStartTime() {
        return this.gCs;
    }

    public void setMinStartTime(float f) {
        this.gCs = f;
    }

    public float getMaxStartTime() {
        return this.gCt;
    }

    public void setMaxStartTime(float f) {
        this.gCt = f;
    }

    public ljq getTargetOffset() {
        return this.grN;
    }

    public void setTargetOffset(ljq ljq2) {
        this.grN = ljq2;
    }
}


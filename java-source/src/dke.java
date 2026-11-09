/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dke
extends dgj {
    private String gCU = null;

    dke() {
        this.gqB = 80;
    }

    protected void cleanUpSpecialEffect() {
        if (!this.isRelationEffect()) {
            this.startGenericMainEffect(this.gCU, this.getTargetPosition());
        } else {
            this.startGenericRelationEffect(this.gCU, this.getTargetPosition(), this.getTargetObjectGUID());
        }
        super.cleanUpSpecialEffect();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
    }

    protected int getMainEffectObjectType() {
        return 6;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dke dke2 = (dke)dgj2;
        dke2.gCU = this.gCU;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gCU = "";
    }

    public String getSFXName() {
        return this.gCU;
    }

    public void setSFXName(String string) {
        this.gCU = string;
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dkh
extends dgj {
    private String gCv = null;

    dkh() {
        this.gqB = 79;
    }

    protected void cleanUpSpecialEffect() {
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
        this.startGenericFullEffect(this.gCv, this.getSourcePosition(), this.getTargetPosition(), this.getSourceObjectGUID(), this.getTargetObjectGUID(), this.getSourceRotation());
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dkh dkh2 = (dkh)dgj2;
        dkh2.gCv = this.gCv;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gCv = "";
    }

    public String getNewSpecialEffectName() {
        return this.gCv;
    }

    public void setNewSpecialEffectName(String string) {
        this.gCv = string;
    }
}


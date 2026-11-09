/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class djs
extends dgj {
    private String gCv = null;

    djs() {
        this.gqB = 63;
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
        if (!this.isRelationEffect()) {
            this.startGenericMainEffect(this.gCv, this.getSourcePosition());
        } else {
            this.startGenericRelationEffect(this.gCv, this.getSourcePosition(), this.getSourceObjectGUID());
        }
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        djs djs2 = (djs)dgj2;
        djs2.gCv = this.gCv;
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


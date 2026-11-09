/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dhd
extends dgj {
    private String guo = null;
    private float gup = 0.0f;
    private boolean guq = false;

    dhd() {
        this.gqB = 62;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        if (this.guq) {
            return;
        }
        if (this.fC.rgz + (double)this.gup < this.MessageDelegator.arc().rgz) {
            if (!this.isRelationEffect()) {
                this.startGenericMainEffect(this.guo, this.getTargetPosition());
            } else {
                this.startGenericRelationEffect(this.guo, this.getTargetPosition(), this.getTargetObjectGUID());
            }
            this.guq = true;
        }
    }

    protected int getMainEffectObjectType() {
        return 6;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dhd dhd2 = (dhd)dgj2;
        dhd2.guo = this.guo;
        dhd2.gup = this.gup;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.guo = "";
        this.gup = 0.0f;
    }

    public float getDelayTime() {
        return this.gup;
    }

    public void setDelayTime(float f2) {
        this.gup = f2;
    }

    public String getDelayedSpecialEffectName() {
        return this.guo;
    }

    public void setDelayedSpecialEffectName(String string) {
        this.guo = string;
    }
}


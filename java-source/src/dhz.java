/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dhz
extends dgj {
    private String gxj = null;
    private int gxk = 1;
    private float gxl = 1.0f;
    private Double gxm = null;
    private float gxn = 0.0f;
    private float gxo = 0.0f;

    public dhz() {
        this.gqB = 92;
    }

    public void setDefaultValues() {
        this.gxj = "";
        this.gxk = 1;
        this.gxl = 1.0f;
        this.gxn = 0.0f;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.gxo = ((float)Math.random() - 0.5f) * 2.0f * this.gxn;
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        if (this.gxk != 0 && (this.gxm == null || this.MessageDelegator.arc().rgz > this.gxm + (double)this.gxl + (double)this.gxo)) {
            if (!this.isRelationEffect()) {
                this.startGenericMainEffect(this.gxj, this.getTargetPosition(), this.getSourcePosition());
            } else {
                this.startGenericRelationEffect(this.gxj, this.getTargetPosition(), this.getTargetObjectGUID());
            }
            this.gxo = ((float)Math.random() - 0.5f) * 2.0f * this.gxn;
            this.gxm = this.MessageDelegator.arc().rgz;
            --this.gxk;
        }
    }

    public void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dhz dhz2 = (dhz)dgj2;
        dhz2.gxj = this.gxj;
        dhz2.gxk = this.gxk;
        dhz2.gxl = this.gxl;
        dhz2.gxn = this.gxn;
    }

    public String getLoopedEffectName() {
        return this.gxj;
    }

    public void setLoopedEffectName(String string) {
        this.gxj = string;
    }

    public int getLoopCount() {
        return this.gxk;
    }

    public void setLoopCount(int n2) {
        this.gxk = n2;
    }

    public void setLoopDuration(float f2) {
        this.gxl = f2;
    }

    public float getLoopDuration() {
        return this.gxl;
    }

    public float getLoopRandomDeviation() {
        return this.gxn;
    }

    public void setLoopRandomDeviation(float f2) {
        this.gxn = f2;
    }
}


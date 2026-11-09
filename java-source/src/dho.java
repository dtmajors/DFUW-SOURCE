/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dho
extends dgj {
    private dfw gvf = null;
    private int gvg = 7;
    private float gvB = 5.0f;
    private float gvC = 1.0f;
    private float gvE = 1.0f;
    private float gvF = 0.0f;
    private float gvU = 0.01f;
    private boolean gvl = false;
    private boolean gvm = true;
    private String fFC = null;
    private float gvn = 1.0f;
    private lcq gvo = null;
    private ljq gsF = null;
    private float gvV = 0.1f;
    private float gvW = 0.1f;
    private boolean gta = false;
    private double gvp;
    private double gvq;

    dho() {
        this.gqB = 28;
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
        this.createLight();
        if (this.gsF != null && !this.gsF.esJ()) {
            this.biE = this.gsF;
        }
        if (this.isRelationEffect()) {
            ljq ljq2 = new ljq(this.gsF);
            if (this.gta) {
                ljq2.es(this.getTargetPosition());
            }
            this.setDeltaPos(ljq2);
            this.setupPositionalRelation(this.getTargetObjectGUID(), this.gvf.getGUID(), this.getMainEffectObjectType());
        }
    }

    private void createLight() {
        this.gvf = (dfw)dKP.Af(21);
        this.gvf.setGUID(this.getMainAtomGuid());
        this.gvf.setActive(true);
        this.gvf.setDefaultValues();
        this.gvf.setInnerColor(this.gvo);
        this.gvf.setInnerIntensity(this.gvn);
        this.gvf.setInnerOn(this.gvl);
        if (this.hasInfiniteDuration() || this.gvV == 0.0f) {
            float f2 = (this.gvE - this.gvF) * (float)Math.random() + this.gvF;
            float f3 = (this.gvB - this.gvC) * (float)Math.random() + this.gvC;
            this.gvf.setInnerRadius(f2);
            this.gvf.setOuterRadius(f3);
            this.gvp = this.getDuration() * this.gvV;
            this.gvq = this.getDuration() * (1.0f - this.gvW);
        } else {
            this.gvp = this.getDuration() * this.gvV;
            this.gvq = this.getDuration() * (1.0f - this.gvW);
            this.gvf.setInnerRadius(0.0f);
            this.gvf.setOuterRadius(0.0f);
        }
        this.gvf.hX(true);
        this.gvf.setOuterColorNumber(this.gvg);
        this.gvf.setOuterOn(this.gvm);
        if (this.getTargetPosition() != null) {
            ljq ljq2 = new ljq(this.getTargetPosition());
            ljq2.es(this.gsF);
            this.gvf.c(ljq2);
        } else {
            this.gvf.c(new ljq());
        }
        this.gvf.setTextureName(this.fFC);
        this.MessageDelegator.a(this.gvf);
    }

    private void removeLight() {
        if (this.gvf != null) {
            dey.bls().b(this.gvf);
            this.gvf = null;
        }
    }

    private void updateLight() {
        float f2 = 1.0f;
        if (this.hasInfiniteDuration()) {
            f2 = this.calculateTimeVal(this.gvp, this.gvq);
        }
        if (f2 < 1.0f) {
            float f3;
            if (this.gvm) {
                f3 = this.gvC * f2;
                this.gvf.setOuterRadius(f3);
            }
            if (this.gvl) {
                f3 = this.gvF * f2;
                this.gvf.setInnerRadius(f3);
            }
        } else {
            float f4;
            float f5;
            float f6;
            if (this.gvm) {
                f6 = this.gvf.getOuterRadius();
                f4 = f6 + (f5 = (this.gvB - this.gvC) * lew.eqr() * this.gvU);
                if (f4 > this.gvB) {
                    f4 = this.gvB;
                } else if (f4 < this.gvC) {
                    f4 = this.gvC;
                }
                this.gvf.setOuterRadius(f4);
            }
            if (this.gvl) {
                f6 = this.gvf.getInnerRadius();
                f4 = f6 + (f5 = (this.gvE - this.gvF) * lew.eqr() * this.gvU);
                if (f4 > this.gvE) {
                    f4 = this.gvE;
                } else if (f4 < this.gvF) {
                    f4 = this.gvF;
                }
                this.gvf.setInnerRadius(f4);
            }
        }
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dho dho2 = (dho)dgj2;
        dho2.gvg = this.gvg;
        dho2.gvB = this.gvB;
        dho2.gvC = this.gvC;
        dho2.gvE = this.gvE;
        dho2.gvF = this.gvF;
        dho2.gvU = this.gvU;
        dho2.gvl = this.gvl;
        dho2.gvm = this.gvm;
        dho2.fFC = this.fFC;
        dho2.gvn = this.gvn;
        dho2.gvo = this.gvo;
        dho2.gsF = this.gsF;
        dho2.gvV = this.gvV;
        dho2.gvW = this.gvW;
        dho2.gta = this.gta;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gvg = 7;
        this.gvB = 5.0f;
        this.gvC = 1.0f;
        this.gvE = 1.0f;
        this.gvF = 0.0f;
        this.gvU = 0.01f;
        this.gvl = false;
        this.gvm = true;
        this.fFC = null;
        this.gvn = 1.0f;
        this.gvo = lcq.BRIGHT_WHITE;
        this.gsF = new ljq();
        this.gvV = 0.1f;
        this.gvW = 0.1f;
        this.gta = false;
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

    public float getMaxInnerRadius() {
        return this.gvE;
    }

    public void setMaxInnerRadius(float f2) {
        this.gvE = f2;
    }

    public float getMaxOuterRadius() {
        return this.gvB;
    }

    public void setMaxOuterRadius(float f2) {
        this.gvB = f2;
    }

    public float getMaxPercentRadiusUpdate() {
        return this.gvU;
    }

    public void setMaxPercentRadiusUpdate(float f2) {
        this.gvU = f2;
    }

    public float getMinInnerRadius() {
        return this.gvF;
    }

    public void setMinInnerRadius(float f2) {
        this.gvF = f2;
    }

    public float getMinOuterRadius() {
        return this.gvC;
    }

    public void setMinOuterRadius(float f2) {
        this.gvC = f2;
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

    public ljq getTargetPositionOffset() {
        return this.gsF;
    }

    public void setTargetPositionOffset(ljq ljq2) {
        this.gsF = ljq2;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public float getExtroPercentTime() {
        return this.gvW;
    }

    public void setExtroPercentTime(float f2) {
        this.gvW = f2;
    }

    public float getIntroPercentTime() {
        return this.gvV;
    }

    public void setIntroPercentTime(float f2) {
        this.gvV = f2;
    }

    public boolean isUseTargetPositionAsDeltaPos() {
        return this.gta;
    }

    public void setUseTargetPositionAsDeltaPos(boolean bl) {
        this.gta = bl;
    }
}


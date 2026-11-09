/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dhp
extends dgj {
    private dfw gvf = null;
    private int gvg = 7;
    private float gvh = 5.0f;
    private float gvi = 2.0f;
    private float gvj = 0.4f;
    private float gvk = 0.0f;
    private boolean gvl = false;
    private boolean gvm = false;
    private String fFC = null;
    private float gvn;
    private lcq gvo = null;
    private double gvp;
    private double gvq;

    dhp() {
        this.gqB = 13;
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
        if (this.isRelationEffect()) {
            this.setupPositionalRelation(this.getTargetObjectGUID(), this.gvf.getGUID(), this.getMainEffectObjectType());
        }
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dhp dhp2 = (dhp)dgj2;
        dhp2.gvg = this.gvg;
        dhp2.gvh = this.gvh;
        dhp2.gvi = this.gvi;
        dhp2.gvj = this.gvj;
        dhp2.gvk = this.gvk;
        dhp2.gvl = this.gvl;
        dhp2.gvm = this.gvm;
        dhp2.fFC = this.fFC;
        dhp2.gvn = this.gvn;
        dhp2.gvo = this.gvo;
    }

    private void createLight() {
        this.gvf = (dfw)dKP.Af(21);
        this.gvf.setGUID(this.getMainAtomGuid());
        this.gvf.setActive(true);
        this.gvf.setDefaultValues();
        this.gvf.setInnerColor(this.gvo);
        this.gvf.setInnerIntensity(this.gvn);
        this.gvf.setInnerOn(this.gvl);
        if (this.hasInfiniteDuration()) {
            this.gvf.setInnerRadius(this.gvi);
            this.gvf.setOuterRadius(this.gvh);
        } else {
            this.gvf.setInnerRadius(0.0f);
            this.gvf.setOuterRadius(0.0f);
            this.gvp = this.getDuration() * this.gvj;
            this.gvq = this.getDuration() * (1.0f - this.gvk);
        }
        this.gvf.hX(true);
        this.gvf.setOuterColorNumber(this.gvg);
        this.gvf.setOuterOn(this.gvm);
        if (this.getTargetPosition() != null) {
            this.gvf.c(this.getTargetPosition());
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

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gvg = 7;
        this.gvh = 5.0f;
        this.gvi = 2.0f;
        this.gvj = 0.4f;
        this.gvk = 0.4f;
        this.gvl = false;
        this.gvm = true;
        this.fFC = null;
        this.gvn = 1.0f;
        this.gvo = lcq.BRIGHT_WHITE;
    }

    private void updateLight() {
        float f2;
        float f3;
        if (this.hasInfiniteDuration()) {
            return;
        }
        float f4 = this.calculateTimeVal(this.gvp, this.gvq);
        if (f4 == 1.0f) {
            float f5 = (float)Math.random() - 0.5f;
            f3 = this.gvh * 0.5f + this.gvh * 0.5f * f5;
            f2 = this.gvi * 0.5f + this.gvi * 0.5f * f5;
        } else {
            f3 = this.gvh * f4;
            f2 = this.gvi * f4;
        }
        this.gvf.setOuterRadius(f3);
        this.gvf.setInnerRadius(f2);
    }

    public float getExpandPercentTime() {
        return this.gvj;
    }

    public void setExpandPercentTime(float f2) {
        this.gvj = f2;
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

    public float getInnerMaxRadius() {
        return this.gvi;
    }

    public void setInnerMaxRadius(float f2) {
        this.gvi = f2;
    }

    public boolean isInnerOn() {
        return this.gvl;
    }

    public void setInnerOn(boolean bl) {
        this.gvl = bl;
    }

    public int getOuterColorNumber() {
        return this.gvg;
    }

    public void setOuterColorNumber(int n2) {
        this.gvg = n2;
    }

    public float getOuterMaxRadius() {
        return this.gvh;
    }

    public void setOuterMaxRadius(float f2) {
        this.gvh = f2;
    }

    public boolean isOuterOn() {
        return this.gvm;
    }

    public void setOuterOn(boolean bl) {
        this.gvm = bl;
    }

    public float getRetractPercentTime() {
        return this.gvk;
    }

    public void setRetractPercentTime(float f2) {
        this.gvk = f2;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }
}


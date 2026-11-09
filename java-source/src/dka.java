/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dka
extends dgj {
    private dfw gvf = null;
    private int gvg = 5;
    private float Radius = 5.0f;
    private float gCI = 0.0f;
    private float gCJ = 0.001f;
    private double gCK = -1.0;

    dka() {
        this.gqB = 50;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeLight();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.checkLight();
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
        dka dka2 = (dka)dgj2;
        dka2.gvg = this.gvg;
        dka2.Radius = this.Radius;
        dka2.gCI = this.gCI;
        dka2.gCJ = this.gCJ;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gvg = 5;
        this.Radius = 5.0f;
        this.gCJ = 0.001f;
        this.gCI = 0.0f;
    }

    private void createLight() {
        this.gvf = (dfw)dKP.Af(21);
        this.gvf.setGUID(this.getMainAtomGuid());
        this.gvf.setActive(true);
        this.gvf.setDefaultValues();
        this.gvf.setInnerColor(lcq.BRIGHT_WHITE);
        this.gvf.setInnerIntensity(0.0f);
        this.gvf.setInnerOn(false);
        this.gvf.setInnerRadius(0.0f);
        this.gvf.hX(true);
        if (this.gCI <= 0.0f) {
            this.gCK = this.MessageDelegator.arc().rgz;
            this.gvf.setOuterOn(true);
        } else {
            this.gvf.setOuterOn(false);
            this.gvf.hX(false);
        }
        this.gvf.setOuterColorNumber(this.gvg);
        this.gvf.setOuterRadius(this.Radius);
        if (this.getTargetPosition() != null) {
            this.gvf.c(this.getTargetPosition());
        } else {
            this.gvf.c(new ljq());
        }
        this.gvf.setTextureName("");
        this.MessageDelegator.a(this.gvf);
    }

    private void removeLight() {
        if (this.gvf != null) {
            dey.bls().b(this.gvf);
            this.gvf = null;
        }
    }

    private void checkLight() {
        if (this.gCK < 0.0) {
            double d2 = this.MessageDelegator.arc().rgz - this.fC.rgz;
            if (d2 >= (double)this.gCI) {
                this.gCK = this.MessageDelegator.arc().rgz;
                this.gvf.setOuterOn(true);
            }
        } else {
            double d3 = this.MessageDelegator.arc().rgz - this.gCK;
            if (d3 >= (double)this.gCJ) {
                this.removeLight();
            }
        }
    }

    public float getFlashDuration() {
        return this.gCJ;
    }

    public void setFlashDuration(float f) {
        this.gCJ = f;
    }

    public int getOuterColorNumber() {
        return this.gvg;
    }

    public void setOuterColorNumber(int n) {
        this.gvg = n;
    }

    public float getRadius() {
        return this.Radius;
    }

    public void setRadius(float f) {
        this.Radius = f;
    }

    public dfw getSphericalLight() {
        return this.gvf;
    }

    public void setSphericalLight(dfw dfw2) {
        this.gvf = dfw2;
    }

    public float getTimeDelay() {
        return this.gCI;
    }

    public void setTimeDelay(float f) {
        this.gCI = f;
    }
}


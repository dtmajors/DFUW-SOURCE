/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dkc
extends dgj {
    private dfw gvf = null;
    private boolean gvm = true;
    private boolean gvl = false;
    private String fFC = null;
    private int gvg = 5;
    private float Uf = 4.0f;
    private float Ue = 5.0f;
    private lcq gvo = lcq.BRIGHT_WHITE;
    private float gvn = 1.0f;

    dkc() {
        this.gqB = 5;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeLight();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
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
        dkc dkc2 = (dkc)dgj2;
        dkc2.setOuterOn(this.gvm);
        dkc2.setInnerOn(this.gvl);
        dkc2.setTextureName(this.fFC);
        dkc2.setOuterColorNumber(this.gvg);
        dkc2.setInnerRadius(this.Uf);
        dkc2.setOuterRadius(this.Ue);
        dkc2.setInnerColor(new lcq(this.gvo));
        dkc2.setInnerIntensity(this.gvn);
    }

    private void createLight() {
        this.gvf = (dfw)dKP.Af(21);
        this.gvf.setGUID(this.getMainAtomGuid());
        this.gvf.setActive(true);
        this.gvf.setDefaultValues();
        this.gvf.setInnerColor(this.gvo);
        this.gvf.setInnerIntensity(this.gvn);
        this.gvf.setInnerOn(this.gvl);
        this.gvf.setInnerRadius(this.Uf);
        this.gvf.hX(true);
        this.gvf.setOuterColorNumber(this.gvg);
        this.gvf.setOuterOn(this.gvm);
        this.gvf.setOuterRadius(this.Ue);
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

    public boolean isOuterOn() {
        return this.gvm;
    }

    public void setOuterOn(boolean bl) {
        this.gvm = bl;
    }

    public boolean isInnerOn() {
        return this.gvl;
    }

    public void setInnerOn(boolean bl) {
        this.gvl = bl;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public int getOuterColorNumber() {
        return this.gvg;
    }

    public void setOuterColorNumber(int n) {
        this.gvg = n;
    }

    public float getInnerRadius() {
        return this.Uf;
    }

    public void setInnerRadius(float f) {
        this.Uf = f;
    }

    public float getOuterRadius() {
        return this.Ue;
    }

    public void setOuterRadius(float f) {
        this.Ue = f;
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

    public void setInnerIntensity(float f) {
        this.gvn = f;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gvm = true;
        this.gvl = false;
        this.fFC = null;
        this.gvg = 0;
        this.Uf = 1.0f;
        this.Ue = 10.0f;
        this.gvo = lcq.BRIGHT_WHITE;
        this.gvn = 1.0f;
    }
}


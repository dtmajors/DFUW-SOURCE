/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dhl
extends dgj {
    private dfw gvf = null;
    private int gvg = 7;
    private float Ue = 5.0f;
    private float Uf = 2.0f;
    private boolean gvA = false;
    private float gvB = 0.0f;
    private float gvC = 0.0f;
    private boolean gvD = false;
    private float gvE = 0.0f;
    private float gvF = 0.0f;
    private float gvG = 50.0f;
    private boolean gvH = false;
    private float gvI = 10.0f;
    private float gvJ = 50.0f;
    private boolean gvl = false;
    private boolean gvm = false;
    private String fFC = null;
    private float gvn = 1.0f;
    private lcq gvo = null;
    private ljq gsF = null;
    private double gvK = 0.0;

    dhl() {
        this.gqB = 19;
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
            this.setupPositionalRelation(this.getTargetObjectGUID(), this.gvf.getGUID(), this.getMainEffectObjectType());
        }
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dhl dhl2 = (dhl)dgj2;
        dhl2.gvg = this.gvg;
        dhl2.Ue = this.Ue;
        dhl2.Uf = this.Uf;
        dhl2.gvA = this.gvA;
        dhl2.gvB = this.gvB;
        dhl2.gvC = this.gvC;
        dhl2.gvD = this.gvD;
        dhl2.gvE = this.gvE;
        dhl2.gvF = this.gvF;
        dhl2.gvG = this.gvG;
        dhl2.gvH = this.gvH;
        dhl2.gvI = this.gvI;
        dhl2.gvJ = this.gvJ;
        dhl2.gvl = this.gvl;
        dhl2.gvm = this.gvm;
        dhl2.fFC = this.fFC;
        dhl2.gvn = this.gvn;
        dhl2.gvo = this.gvo;
        dhl2.gsF = this.gsF;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gvg = 7;
        this.Ue = 5.0f;
        this.Uf = 2.0f;
        this.gvA = false;
        this.gvB = 0.0f;
        this.gvC = 0.0f;
        this.gvD = false;
        this.gvE = 0.0f;
        this.gvF = 0.0f;
        this.gvG = 50.0f;
        this.gvH = false;
        this.gvI = 10.0f;
        this.gvJ = 50.0f;
        this.gvl = false;
        this.gvm = true;
        this.fFC = null;
        this.gvn = 1.0f;
        this.gvo = lcq.BRIGHT_WHITE;
        this.gsF = new ljq();
    }

    private void createLight() {
        float f2;
        this.gvf = (dfw)dKP.Af(21);
        this.gvf.setGUID(this.getMainAtomGuid());
        this.gvf.setActive(true);
        this.gvf.setDefaultValues();
        this.gvf.setInnerColor(this.gvo);
        this.gvf.setInnerIntensity(this.gvn);
        this.gvf.setInnerOn(this.gvl);
        if (this.gvD) {
            f2 = this.gvF + (float)Math.random() * (this.gvE - this.gvF);
            this.gvf.setInnerRadius(f2);
        } else {
            this.gvf.setInnerRadius(this.Uf);
        }
        if (this.gvA) {
            f2 = this.gvC + (float)Math.random() * (this.gvB - this.gvC);
            this.gvf.setOuterRadius(f2);
        } else {
            this.gvf.setOuterRadius(this.Ue);
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
        if (this.gvH) {
            float f3 = this.gvJ - this.gvI;
            this.gvG = this.gvI + f3 * (float)Math.random();
        }
    }

    private void removeLight() {
        if (this.gvf != null) {
            dey.bls().b(this.gvf);
            this.gvf = null;
        }
    }

    private void updateLight() {
        double d2 = this.nx.rgz - this.gvK;
        float f2 = 1.0f / this.gvG;
        if (d2 >= (double)f2) {
            float f3;
            if (this.gvf.isOn()) {
                this.gvf.hX(false);
            } else {
                this.gvf.hX(true);
            }
            this.gvK = this.nx.rgz;
            if (this.gvH) {
                f3 = this.gvJ - this.gvI;
                this.gvG = this.gvI + f3 * (float)Math.random();
            }
            if (this.gvf.isOn()) {
                if (this.gvD && this.gvl) {
                    f3 = this.gvF + (float)Math.random() * (this.gvE - this.gvF);
                    this.gvf.setInnerRadius(f3);
                }
                if (this.gvA && this.gvm) {
                    f3 = this.gvC + (float)Math.random() * (this.gvB - this.gvC);
                    this.gvf.setOuterRadius(f3);
                }
            }
        }
    }

    public float getFlashFrequency() {
        return this.gvG;
    }

    public void setFlashFrequency(float f2) {
        this.gvG = f2;
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

    public float getInnerRadius() {
        return this.Uf;
    }

    public void setInnerRadius(float f2) {
        this.Uf = f2;
    }

    public float getMaxFlashFrequency() {
        return this.gvJ;
    }

    public void setMaxFlashFrequency(float f2) {
        this.gvJ = f2;
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

    public float getMinFlashFrequency() {
        return this.gvI;
    }

    public void setMinFlashFrequency(float f2) {
        this.gvI = f2;
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

    public float getOuterRadius() {
        return this.Ue;
    }

    public void setOuterRadius(float f2) {
        this.Ue = f2;
    }

    public boolean isRandomFlashFrequency() {
        return this.gvH;
    }

    public void setRandomFlashFrequency(boolean bl) {
        this.gvH = bl;
    }

    public boolean isRandomInnerRadius() {
        return this.gvD;
    }

    public void setRandomInnerRadius(boolean bl) {
        this.gvD = bl;
    }

    public boolean isRandomOuterRadius() {
        return this.gvA;
    }

    public void setRandomOuterRadius(boolean bl) {
        this.gvA = bl;
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
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dis
extends dgj {
    private dfw gAx = null;
    private dfw gAy = null;
    private dfw gAz = null;
    private int gAA;
    private int gAB;
    private int gAC;
    private float gAD;
    private float gAE;
    private float gAF;
    private float gAG;
    private float gAH;
    private float gAI;
    private boolean gAJ;
    private boolean gAK;
    private boolean gAL;
    private float gAM = 0.01f;
    private float gAN = 0.01f;
    private float gAO = 0.01f;
    private ljq gsF;

    dis() {
        this.gqB = 90;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeLights();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.updateLights();
    }

    protected int getMainEffectObjectType() {
        return 6;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        assert (!this.isRelationEffect());
        this.createLights();
    }

    private dfw createLight(int n2, float f2, float f3) {
        dfw dfw2 = (dfw)dKP.Af(21);
        dfw2.setGUID(this.getNewEffectGuid());
        dfw2.setActive(true);
        dfw2.setDefaultValues();
        dfw2.setInnerColor(lcq.BRIGHT_WHITE);
        dfw2.setInnerIntensity(0.0f);
        dfw2.setInnerOn(false);
        dfw2.hX(true);
        dfw2.setOuterOn(true);
        dfw2.setOuterColorNumber(n2);
        float f4 = (f2 - f3) * (float)Math.random() + f3;
        dfw2.setOuterRadius(f4);
        if (this.getTargetPosition() != null) {
            ljq ljq2 = new ljq(this.getTargetPosition());
            ljq2.es(this.gsF);
            dfw2.c(ljq2);
        } else {
            dfw2.c(new ljq(this.gsF));
        }
        dfw2.setTextureName("");
        this.MessageDelegator.a(dfw2);
        return dfw2;
    }

    private void createLights() {
        if (this.gAJ) {
            this.gAx = this.createLight(this.gAA, this.gAD, this.gAE);
        }
        if (this.gAK) {
            this.gAy = this.createLight(this.gAB, this.gAF, this.gAG);
        }
        if (this.gAL) {
            this.gAz = this.createLight(this.gAC, this.gAH, this.gAI);
        }
    }

    private void removeLights() {
        if (this.gAx != null) {
            dey.bls().b(this.gAx);
            this.gAx = null;
        }
        if (this.gAy != null) {
            dey.bls().b(this.gAy);
            this.gAy = null;
        }
        if (this.gAz != null) {
            dey.bls().b(this.gAz);
            this.gAz = null;
        }
    }

    private void calculateRadius(dfw dfw2, float f2, float f3, float f4) {
        float f5;
        float f6 = dfw2.getOuterRadius();
        float f7 = f6 + (f5 = (f2 - f3) * lew.eqr() * f4);
        if (f7 > f2) {
            f7 = f2;
        } else if (f7 < f3) {
            f7 = f3;
        }
        dfw2.setOuterRadius(f7);
    }

    private void updateLights() {
        if (this.gAx != null) {
            this.calculateRadius(this.gAx, this.gAD, this.gAE, this.gAM);
        }
        if (this.gAy != null) {
            this.calculateRadius(this.gAy, this.gAF, this.gAG, this.gAN);
        }
        if (this.gAz != null) {
            this.calculateRadius(this.gAz, this.gAH, this.gAI, this.gAO);
        }
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dis dis2 = (dis)dgj2;
        dis2.gAA = this.gAA;
        dis2.gAB = this.gAB;
        dis2.gAC = this.gAC;
        dis2.gAD = this.gAD;
        dis2.gAE = this.gAE;
        dis2.gAF = this.gAF;
        dis2.gAG = this.gAG;
        dis2.gAH = this.gAH;
        dis2.gAI = this.gAI;
        dis2.gAJ = this.gAJ;
        dis2.gAK = this.gAK;
        dis2.gAL = this.gAL;
        dis2.gAM = this.gAM;
        dis2.gAN = this.gAN;
        dis2.gAO = this.gAO;
        dis2.gsF = this.gsF;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gAA = 0;
        this.gAB = 1;
        this.gAC = 2;
        this.gAD = 1.0f;
        this.gAE = 0.8f;
        this.gAF = 0.9f;
        this.gAG = 0.8f;
        this.gAH = 0.85f;
        this.gAI = 0.5f;
        this.gAJ = true;
        this.gAK = true;
        this.gAL = false;
        this.gAM = 0.01f;
        this.gAN = 0.01f;
        this.gAO = 0.01f;
        this.gsF = new ljq();
    }

    public final int getColorNumber1() {
        return this.gAA;
    }

    public final void setColorNumber1(int n2) {
        this.gAA = n2;
    }

    public final int getColorNumber2() {
        return this.gAB;
    }

    public final void setColorNumber2(int n2) {
        this.gAB = n2;
    }

    public final int getColorNumber3() {
        return this.gAC;
    }

    public final void setColorNumber3(int n2) {
        this.gAC = n2;
    }

    public final float getMaxRadius1() {
        return this.gAD;
    }

    public final void setMaxRadius1(float f2) {
        this.gAD = f2;
    }

    public final float getMinRadius1() {
        return this.gAE;
    }

    public final void setMinRadius1(float f2) {
        this.gAE = f2;
    }

    public final float getMaxRadius2() {
        return this.gAF;
    }

    public final void setMaxRadius2(float f2) {
        this.gAF = f2;
    }

    public final float getMinRadius2() {
        return this.gAG;
    }

    public final void setMinRadius2(float f2) {
        this.gAG = f2;
    }

    public final float getMaxRadius3() {
        return this.gAH;
    }

    public final void setMaxRadius3(float f2) {
        this.gAH = f2;
    }

    public final float getMinRadius3() {
        return this.gAI;
    }

    public final void setMinRadius3(float f2) {
        this.gAI = f2;
    }

    public final boolean isLight1On() {
        return this.gAJ;
    }

    public final void setLight1On(boolean bl) {
        this.gAJ = bl;
    }

    public final boolean isLight2On() {
        return this.gAK;
    }

    public final void setLight2On(boolean bl) {
        this.gAK = bl;
    }

    public final boolean isLight3On() {
        return this.gAL;
    }

    public final void setLight3On(boolean bl) {
        this.gAL = bl;
    }

    public final float getMaxPercentRadiusUpdate1() {
        return this.gAM;
    }

    public final void setMaxPercentRadiusUpdate1(float f2) {
        this.gAM = f2;
    }

    public final float getMaxPercentRadiusUpdate2() {
        return this.gAN;
    }

    public final void setMaxPercentRadiusUpdate2(float f2) {
        this.gAN = f2;
    }

    public final float getMaxPercentRadiusUpdate3() {
        return this.gAO;
    }

    public final void setMaxPercentRadiusUpdate3(float f2) {
        this.gAO = f2;
    }

    public final ljq getTargetPositionOffset() {
        return this.gsF;
    }

    public final void setTargetPositionOffset(ljq ljq2) {
        this.gsF = ljq2;
    }
}


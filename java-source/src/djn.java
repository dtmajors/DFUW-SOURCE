/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class djn
extends dgj {
    private dfw gvf = null;
    private boolean gvm = true;
    private boolean gvl = false;
    private String fFC = null;
    private int gvg = 5;
    private float gBY = 0.0f;
    private float gBZ = 0.0f;
    private float gCa = 1.0f;
    private float gCb = 1.0f;
    private lcq gCc = lcq.BRIGHT_WHITE;
    private lcq gCd = lcq.BRIGHT_WHITE_TRANSPARENT;
    private float gCe = 1.0f;
    private float gCf = 1.0f;
    private float gse = 1.0f;
    private float gsc = 1.0f;
    private int gsd = 0;
    private float gvj = 0.0f;
    private float gvk = 0.0f;
    private double gvp;
    private double gvq;

    djn() {
        this.gqB = 77;
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
        this.updateLight();
        if (this.isRelationEffect()) {
            this.setupPositionalRelation(this.getTargetObjectGUID(), this.gvf.getGUID(), this.getMainEffectObjectType());
        }
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        djn djn2 = (djn)dgj2;
        djn2.gvm = this.gvm;
        djn2.gvl = this.gvl;
        djn2.fFC = this.fFC;
        djn2.gvg = this.gvg;
        djn2.gBY = this.gBY;
        djn2.gBZ = this.gBZ;
        djn2.gCa = this.gCa;
        djn2.gCb = this.gCb;
        djn2.gCc = this.gCc;
        djn2.gCd = this.gCd;
        djn2.gCe = this.gCe;
        djn2.gCf = this.gCf;
        djn2.gse = this.gse;
        djn2.gsc = this.gsc;
        djn2.gsd = this.gsd;
        djn2.gvj = this.gvj;
        djn2.gvk = this.gvk;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gvm = true;
        this.gvl = false;
        this.fFC = null;
        this.gvg = 5;
        this.gBY = 0.0f;
        this.gBZ = 0.0f;
        this.gCa = 1.0f;
        this.gCb = 1.0f;
        this.gCc = lcq.BRIGHT_WHITE;
        this.gCd = lcq.BRIGHT_WHITE_TRANSPARENT;
        this.gCe = 1.0f;
        this.gCf = 1.0f;
        this.gse = 1.0f;
        this.gsc = 1.0f;
        this.gsd = 0;
        this.gvj = 0.0f;
        this.gvk = 0.0f;
    }

    private void createLight() {
        this.gvf = (dfw)dKP.Af(21);
        this.gvf.setGUID(this.getMainAtomGuid());
        this.gvf.setActive(true);
        this.gvf.setDefaultValues();
        this.gvf.setInnerColor(this.gCc);
        this.gvf.setInnerIntensity(this.gCe);
        this.gvf.setInnerOn(this.gvl);
        this.gvf.setInnerRadius(this.gBY);
        this.gvf.hX(true);
        this.gvf.setOuterColorNumber(this.gvg);
        this.gvf.setOuterOn(this.gvm);
        this.gvf.setOuterRadius(this.gBZ);
        if (this.getTargetPosition() != null) {
            this.gvf.c(this.getTargetPosition());
        } else {
            this.gvf.c(new ljq());
        }
        this.gvf.setTextureName(this.fFC);
        if (!this.hasInfiniteDuration()) {
            this.gvp = this.getDuration() * this.gvj;
            this.gvq = this.getDuration() * (1.0f - this.gvk);
            float f = this.calculateTimeVal(this.gvp, this.gvq);
            this.gvf.setOuterRadius(f * this.gvf.getOuterRadius());
            this.gvf.setInnerRadius(f * this.gvf.getInnerRadius());
        }
        this.MessageDelegator.a(this.gvf);
    }

    private void removeLight() {
        if (this.gvf != null) {
            dey.bls().b(this.gvf);
            this.gvf = null;
        }
    }

    private void updateLight() {
        float f;
        if (this.gvf == null) {
            return;
        }
        float f2 = ((float)(this.MessageDelegator.arc().rgz - this.fC.rgz) + this.gsc) * this.gse;
        float f3 = mfw.S(this.gsd, f2);
        f3 = lew.A(f3, 0.0f, 1.0f);
        if (this.gvm) {
            f = ldq.o(this.gBZ, this.gCb, f3);
            this.gvf.setOuterRadius(f);
        }
        if (this.gvl) {
            f = ldq.o(this.gBY, this.gCa, f3);
            lcq lcq2 = lcq.a(this.gCc, this.gCd, f3);
            float f4 = ldq.o(this.gCe, this.gCf, f3);
            this.gvf.setInnerRadius(f);
            this.gvf.setInnerColor(lcq2);
            this.gvf.setInnerIntensity(f4);
        }
        if (this.hasInfiniteDuration()) {
            return;
        }
        if (this.gvj != 0.0f || this.gvk != 0.0f) {
            f = this.calculateTimeVal(this.gvp, this.gvq);
            this.gvf.setOuterRadius(f * this.gvf.getOuterRadius());
            this.gvf.setInnerRadius(f * this.gvf.getInnerRadius());
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

    public float getInnerStartRadius() {
        return this.gBY;
    }

    public void setInnerStartRadius(float f) {
        this.gBY = f;
    }

    public float getOuterStartRadius() {
        return this.gBZ;
    }

    public void setOuterStartRadius(float f) {
        this.gBZ = f;
    }

    public float getInnerEndRadius() {
        return this.gCa;
    }

    public void setInnerEndRadius(float f) {
        this.gCa = f;
    }

    public float getOuterEndRadius() {
        return this.gCb;
    }

    public void setOuterEndRadius(float f) {
        this.gCb = f;
    }

    public lcq getInnerStartColor() {
        return this.gCc;
    }

    public void setInnerStartColor(lcq lcq2) {
        this.gCc = lcq2;
    }

    public lcq getInnerEndColor() {
        return this.gCd;
    }

    public void setInnerEndColor(lcq lcq2) {
        this.gCd = lcq2;
    }

    public float getInnerStartIntensity() {
        return this.gCe;
    }

    public void setInnerStartIntensity(float f) {
        this.gCe = f;
    }

    public float getInnerEndIntensity() {
        return this.gCf;
    }

    public void setInnerEndIntensity(float f) {
        this.gCf = f;
    }

    public float getLerpFrequency() {
        return this.gse;
    }

    public void setLerpFrequency(float f) {
        this.gse = f;
    }

    public float getTimeSeed() {
        return this.gsc;
    }

    public void setTimeSeed(float f) {
        this.gsc = f;
    }

    public int getLerpType() {
        return this.gsd;
    }

    public void setLerpType(int n) {
        this.gsd = n;
    }

    public float getExpandPercentTime() {
        return this.gvj;
    }

    public void setExpandPercentTime(float f) {
        this.gvj = f;
    }

    public float getRetractPercentTime() {
        return this.gvk;
    }

    public void setRetractPercentTime(float f) {
        this.gvk = f;
    }
}


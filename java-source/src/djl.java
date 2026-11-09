/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class djl
extends dgj {
    private dfq gBM = null;
    private float gBN = 0.8f;
    private float gpZ = 0.0f;
    private lcq dMT = null;
    private float goZ = 0.0f;
    private lcq gBO = null;
    private float gpb = 0.0f;
    private float gBP = 0.0f;
    private float gBQ = 0.0f;
    private float gBR = 0.0f;
    private float gBS = 0.0f;
    private float gBT = 0.0f;
    private float gBU = 0.0f;
    private float gBV = 0.0f;
    private float gBW = 0.0f;

    djl() {
        this.gqB = 99;
        this.gBM = (dfq)dKP.Af(28);
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.setInheritDuration(true);
        this.gBN = 0.8f;
        this.gpZ = this.gBM.getRange();
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.gBM.c(this.getTargetPosition());
        this.gBM.setGUID(this.getNewEffectGuid());
        this.MessageDelegator.a(this.gBM);
        if (this.isRelationEffect()) {
            this.gBM.a(new dfq.a(this){
                final /* synthetic */ djl gBX;
                {
                    this.gBX = djl2;
                }

                public void a(dfq dfq2) {
                    if (this.gBX.getState() != 6) {
                        this.gBX.setupPositionalRelation(this.gBX.getTargetObjectGUID(), dfq2.bmO(), this.gBX.getMainEffectObjectType());
                    }
                }
            });
        }
    }

    public void doTickSpecialEffect() {
        float f;
        super.doTickSpecialEffect();
        if (this.gBM.bmO() == null) {
            return;
        }
        if (this.getDuration() != -2.0f && this.gBN < 1.0f && (f = (float)((this.nx.rgz - this.fC.rgz) / (double)this.getDuration())) >= this.gBN) {
            float f2 = 1.0f - (f - this.gBN) / (1.0f - this.gBN);
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            this.gBM.setRange(f2 * this.gpZ);
        }
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        dey.bls().b(this.gBM);
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        djl djl2 = (djl)dgj2;
        this.gBM.b(djl2.gBM);
        djl2.gpZ = this.gpZ;
        djl2.gBN = this.gBN;
    }

    protected int getMainEffectObjectType() {
        return 2;
    }

    public float getRange() {
        return this.gpZ;
    }

    public void setRange(float f) {
        this.gBM.setRange(f);
        this.gpZ = f;
    }

    public lcq getColor() {
        lco lco2 = this.gBM.bmL();
        return new lcq(lco2.bVf(), lco2.bVg(), lco2.bVh(), 1.0f);
    }

    public void setColor(lcq lcq2) {
        lco lco2 = this.gBM.bmL();
        lco2.nb(lcq2.r);
        lco2.nc(lcq2.g);
        lco2.nd(lcq2.b);
        this.gBM.g(lco2);
    }

    public float getColorMultiplier() {
        return this.gBM.getColorMultiplier();
    }

    public void setColorMultiplier(float f) {
        this.gBM.setColorMultiplier(f);
    }

    public lcq getFlickerColor() {
        lco lco2 = this.gBM.bmM();
        return new lcq(lco2.bVf(), lco2.bVg(), lco2.bVh(), 1.0f);
    }

    public void setFlickerColor(lcq lcq2) {
        lco lco2 = this.gBM.bmM();
        lco2.nb(lcq2.r);
        lco2.nc(lcq2.g);
        lco2.nd(lcq2.b);
        this.gBM.h(lco2);
    }

    public float getFlickerColorMultiplier() {
        return this.gBM.getFlickerColorMultiplier();
    }

    public void setFlickerColorMultiplier(float f) {
        this.gBM.setFlickerColorMultiplier(f);
    }

    public float getFlickerColorAmplitude() {
        return this.gBM.bmJ().x;
    }

    public void setFlickerColorAmplitude(float f) {
        ljr ljr2 = this.gBM.bmJ();
        ljr2.x = f;
        this.gBM.c(ljr2);
    }

    public float getFlickerColorFrequency() {
        return this.gBM.bmJ().y;
    }

    public void setFlickerColorFrequency(float f) {
        ljr ljr2 = this.gBM.bmJ();
        ljr2.y = f;
        this.gBM.c(ljr2);
    }

    public float getFlickerColorPhase() {
        return this.gBM.bmJ().rlV;
    }

    public void setFlickerColorPhase(float f) {
        ljr ljr2 = this.gBM.bmJ();
        ljr2.rlV = f;
        this.gBM.c(ljr2);
    }

    public float getFlickerColorNoise() {
        return this.gBM.bmJ().rlW;
    }

    public void setFlickerColorNoise(float f) {
        ljr ljr2 = this.gBM.bmJ();
        ljr2.rlW = f;
        this.gBM.c(ljr2);
    }

    public float getFlickerRangeAmplitude() {
        return this.gBM.bmK().x;
    }

    public void setFlickerRangeAmplitude(float f) {
        ljr ljr2 = this.gBM.bmK();
        ljr2.x = f;
        this.gBM.d(ljr2);
    }

    public float getFlickerRangeFrequency() {
        return this.gBM.bmK().y;
    }

    public void setFlickerRangeFrequency(float f) {
        ljr ljr2 = this.gBM.bmK();
        ljr2.y = f;
        this.gBM.d(ljr2);
    }

    public float getFlickerRangePhase() {
        return this.gBM.bmK().rlV;
    }

    public void setFlickerRangePhase(float f) {
        ljr ljr2 = this.gBM.bmK();
        ljr2.rlV = f;
        this.gBM.d(ljr2);
    }

    public float getFlickerRangeNoise() {
        return this.gBM.bmK().rlW;
    }

    public void setFlickerRangeNoise(float f) {
        ljr ljr2 = this.gBM.bmK();
        ljr2.rlW = f;
        this.gBM.d(ljr2);
    }

    public float getFadeOutStartPercent() {
        return this.gBN;
    }

    public void setFadeOutStartPercent(float f) {
        this.gBN = f;
    }

    public int getAtomCount() {
        return 1;
    }

    public dey getAtom(int n) {
        return this.gBM;
    }
}


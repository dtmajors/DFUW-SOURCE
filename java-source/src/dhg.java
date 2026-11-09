/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dhg
extends dgj {
    private dfg gsY = null;
    private String fFC;
    private float grZ;
    private int grQ = 1;
    private float doW;
    private float doX;
    private float gsw;
    private float gsx;
    private lcq eoo;
    private lcq eop;
    private float gsZ = 1.0f;
    private ljq grN = null;
    private boolean gsg;
    private float gsh = 0.0f;

    dhg() {
        this.gqB = 60;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeParticle();
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.createParticle();
        if (this.isRelationEffect()) {
            this.setDeltaPos(this.grN);
            this.setupPositionalRelation(this.getTargetObjectGUID(), this.gsY.getGUID(), this.getMainEffectObjectType());
        }
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void createParticle() {
        this.gsY = (dfg)dKP.Af(25);
        this.gsY.setGUID(this.getMainAtomGuid());
        this.gsY.setActive(true);
        this.gsY.setEndColor(this.eop);
        this.gsY.setEndRotation(this.gsx);
        this.gsY.setEndScale(this.doX);
        this.gsY.setNumTextures(this.grQ);
        this.gsY.setParticleLifeTime(this.grZ);
        ljq ljq2 = new ljq(this.getTargetPosition());
        ljq2.es(this.grN);
        this.gsY.bL(ljq2);
        this.gsY.setStartColor(this.eoo);
        this.gsY.setStartRotation(this.gsw);
        this.gsY.setStartScale(this.doW);
        this.gsY.setTextureName(this.fFC);
        this.gsY.hQ(this.gsg);
        this.gsY.gm((float)this.getStartTime().rgz);
        this.gsY.setDepthModifier(this.gsZ);
        this.gsY.gn(this.gsh);
        this.MessageDelegator.a(this.gsY);
    }

    protected void removeParticle() {
        if (this.gsY == null) {
            return;
        }
        dey.bls().b(this.gsY);
        this.gsY = null;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.fFC = "";
        this.grQ = 1;
        this.eoo = lcq.BRIGHT_WHITE;
        this.eop = lcq.BRIGHT_WHITE;
        this.doW = 1.0f;
        this.doX = 1.0f;
        this.gsw = 0.0f;
        this.gsx = 0.0f;
        this.gsg = false;
        this.grZ = 1.0f;
        this.gsZ = 1.0f;
        this.gsh = 0.0f;
        this.grN = new ljq();
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dhg dhg2 = (dhg)dgj2;
        dhg2.fFC = this.fFC;
        dhg2.grQ = this.grQ;
        dhg2.eoo = this.eoo;
        dhg2.eop = this.eop;
        dhg2.doW = this.doW;
        dhg2.doX = this.doX;
        dhg2.gsw = this.gsw;
        dhg2.gsx = this.gsx;
        dhg2.gsg = this.gsg;
        dhg2.grZ = this.grZ;
        dhg2.gsZ = this.gsZ;
        dhg2.gsh = this.gsh;
        dhg2.grN = this.grN;
    }

    public float getDepthModifier() {
        return this.gsZ;
    }

    public void setDepthModifier(float f2) {
        this.gsZ = f2;
    }

    public lcq getEndColor() {
        return this.eop;
    }

    public void setEndColor(lcq lcq2) {
        this.eop = lcq2;
    }

    public float getEndRotation() {
        return this.gsx;
    }

    public void setEndRotation(float f2) {
        this.gsx = f2;
    }

    public float getEndScale() {
        return this.doX;
    }

    public void setEndScale(float f2) {
        this.doX = f2;
    }

    public float getMotionBlurModifier() {
        return this.gsh;
    }

    public void setMotionBlurModifier(float f2) {
        this.gsh = f2;
    }

    public int getNumTextures() {
        return this.grQ;
    }

    public void setNumTextures(int n2) {
        this.grQ = n2;
    }

    public float getParticleLifeTime() {
        return this.grZ;
    }

    public void setParticleLifeTime(float f2) {
        this.grZ = f2;
    }

    public lcq getStartColor() {
        return this.eoo;
    }

    public void setStartColor(lcq lcq2) {
        this.eoo = lcq2;
    }

    public float getStartRotation() {
        return this.gsw;
    }

    public void setStartRotation(float f2) {
        this.gsw = f2;
    }

    public float getStartScale() {
        return this.doW;
    }

    public void setStartScale(float f2) {
        this.doW = f2;
    }

    public ljq getTargetOffset() {
        return this.grN;
    }

    public void setTargetOffset(ljq ljq2) {
        this.grN = ljq2;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public boolean isUseHDRLParticles() {
        return this.gsg;
    }

    public void setUseHDRLParticles(boolean bl) {
        this.gsg = bl;
    }

    public dey getAtom(int n2) {
        return this.gsY;
    }

    public int getAtomCount() {
        return 1;
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.Map;

public class dgs
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
    private String byk = "";
    private boolean gta = false;
    private ljq gtb = null;
    private lgl gtc = null;
    private String gtd = null;
    private ldv gte = null;

    dgs() {
        this.gqB = 85;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeParticle();
        this.removeAttachPointRelation();
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        if (!this.isRelationEffect()) {
            return;
        }
        this.checkAttachPoint();
        this.createParticle();
        ljq ljq2 = new ljq(this.grN);
        ljq2.es(this.gtb);
        if (this.gta) {
            ljq2.es(this.getTargetPosition());
        }
        this.setDeltaPos(ljq2);
        this.setDeltaRot(this.gtc);
        this.createAttachPointRelation();
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
        ljq2.es(this.gtb);
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
        this.byk = "";
        this.gta = false;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dgs dgs2 = (dgs)dgj2;
        dgs2.fFC = this.fFC;
        dgs2.grQ = this.grQ;
        dgs2.eoo = this.eoo;
        dgs2.eop = this.eop;
        dgs2.doW = this.doW;
        dgs2.doX = this.doX;
        dgs2.gsw = this.gsw;
        dgs2.gsx = this.gsx;
        dgs2.gsg = this.gsg;
        dgs2.grZ = this.grZ;
        dgs2.gsZ = this.gsZ;
        dgs2.gsh = this.gsh;
        dgs2.grN = this.grN;
        dgs2.byk = this.byk;
        dgs2.gta = this.gta;
    }

    private void checkAttachPoint() {
        this.gtb = new ljq();
        this.gtc = new lgl();
        this.gtd = "";
        if (this.getTargetObjectGUID() == null) {
            return;
        }
        amf amf2 = this.MessageDelegator.bzx().bzt().d(this.getTargetObjectGUID());
        if (amf2 == null) {
            return;
        }
        if (!(amf2 instanceof bvd)) {
            return;
        }
        bvd bvd2 = (bvd)amf2;
        Map<String, eh> map = ei.ao(bvd2.getFileName());
        eh eh2 = map.get(this.byk);
        if (eh2 == null) {
            return;
        }
        this.gtb = new ljq(eh2.fb());
        this.gtc = new lgl(eh2.getRotation());
        this.gtd = eh2.getFrameName();
    }

    private void createAttachPointRelation() {
        this.gte = this.getNewEffectGuid();
        knd knd2 = (knd)this.MessageDelegator.h(775);
        knd2.wD(false);
        knd2.jM(true);
        knd2.aE(false);
        knd2.lQ(false);
        knd2.ts(this.getGUID());
        knd2.qj(this.getTargetObjectGUID());
        knd2.qk(this.gsY.getGUID());
        knd2.kX(this.gte);
        knd2.ak(this.getDeltaRot().eqT());
        knd2.aj(this.getDeltaPos());
        knd2.setFrameName(this.gtd);
        knd2.bM(new ljq(1.0f, 1.0f, 1.0f));
        knd2.Jd(1);
        this.MessageDelegator.a(knd2);
    }

    private void removeAttachPointRelation() {
        if (this.gte == null) {
            return;
        }
        knd knd2 = (knd)this.MessageDelegator.h(775);
        knd2.wD(false);
        knd2.jM(true);
        knd2.aE(false);
        knd2.ts(this.getGUID());
        knd2.kX(this.gte);
        knd2.Jd(2);
        this.MessageDelegator.a(knd2);
        this.gte = null;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public float getParticleLifeTime() {
        return this.grZ;
    }

    public void setParticleLifeTime(float f2) {
        this.grZ = f2;
    }

    public int getNumTextures() {
        return this.grQ;
    }

    public void setNumTextures(int n2) {
        this.grQ = n2;
    }

    public float getStartScale() {
        return this.doW;
    }

    public void setStartScale(float f2) {
        this.doW = f2;
    }

    public float getEndScale() {
        return this.doX;
    }

    public void setEndScale(float f2) {
        this.doX = f2;
    }

    public float getStartRotation() {
        return this.gsw;
    }

    public void setStartRotation(float f2) {
        this.gsw = f2;
    }

    public float getEndRotation() {
        return this.gsx;
    }

    public void setEndRotation(float f2) {
        this.gsx = f2;
    }

    public lcq getStartColor() {
        return this.eoo;
    }

    public void setStartColor(lcq lcq2) {
        this.eoo = lcq2;
    }

    public lcq getEndColor() {
        return this.eop;
    }

    public void setEndColor(lcq lcq2) {
        this.eop = lcq2;
    }

    public float getDepthModifier() {
        return this.gsZ;
    }

    public void setDepthModifier(float f2) {
        this.gsZ = f2;
    }

    public ljq getTargetOffset() {
        return this.grN;
    }

    public void setTargetOffset(ljq ljq2) {
        this.grN = ljq2;
    }

    public boolean isUseHDRLParticles() {
        return this.gsg;
    }

    public void setUseHDRLParticles(boolean bl) {
        this.gsg = bl;
    }

    public float getMotionBlurModifier() {
        return this.gsh;
    }

    public void setMotionBlurModifier(float f2) {
        this.gsh = f2;
    }

    public boolean isUseTargetPositionAsDeltaPos() {
        return this.gta;
    }

    public void setUseTargetPositionAsDeltaPos(boolean bl) {
        this.gta = bl;
    }

    public String getAttachPointName() {
        return this.byk;
    }

    public void setAttachPointName(String string) {
        this.byk = string;
    }

    public dey getAtom(int n2) {
        return this.gsY;
    }

    public int getAtomCount() {
        return 1;
    }
}


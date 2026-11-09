/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.Map;

public class dgu
extends dgj {
    protected dfo grP = null;
    private String fFC = null;
    private int grQ = 1;
    private lcq eoo = null;
    private lcq eop = null;
    private int gtp = 1;
    private float gsf = 1.0f;
    private float doW = 1.0f;
    private float doX = 1.0f;
    private float gsw = 0.0f;
    private float gsx = 0.0f;
    private float gsy = 0.0f;
    private float gsz = 0.0f;
    private float gsA = 0.0f;
    private float gsB = 0.5f;
    private float gtq = 1.0f;
    private ljq bis = null;
    private float gsu = 0.0f;
    private float gsv = 0.0f;
    private ljq grN = null;
    private boolean gsg = false;
    private float gsh = 0.0f;
    private float grZ = 1.0f;
    private float gtr = 1.0f;
    private float gsJ = 0.8f;
    private String byk = "";
    private boolean gta = false;
    private ljq gtb = null;
    private lgl gtc = null;
    private String gtd = null;
    private ldv gte = null;

    dgu() {
        this.gqB = 84;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeObject();
        this.removeAttachPointRelation();
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        if (!this.isRelationEffect()) {
            return;
        }
        this.checkAttachPoint();
        this.createObject();
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
        this.updateColor();
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dgu dgu2 = (dgu)dgj2;
        dgu2.fFC = this.fFC;
        dgu2.grQ = this.grQ;
        dgu2.eoo = this.eoo;
        dgu2.eop = this.eop;
        dgu2.gtp = this.gtp;
        dgu2.grZ = this.grZ;
        dgu2.gsf = this.gsf;
        dgu2.doW = this.doW;
        dgu2.doX = this.doX;
        dgu2.gsw = this.gsw;
        dgu2.gsx = this.gsx;
        dgu2.gsy = this.gsy;
        dgu2.gsz = this.gsz;
        dgu2.gsA = this.gsA;
        dgu2.gsB = this.gsB;
        dgu2.gtq = this.gtq;
        dgu2.gtr = this.gtr;
        dgu2.bis = this.bis;
        dgu2.gsu = this.gsu;
        dgu2.gsv = this.gsv;
        dgu2.gsJ = this.gsJ;
        dgu2.grN = this.grN;
        dgu2.gsg = this.gsg;
        dgu2.gsh = this.gsh;
        dgu2.byk = this.byk;
        dgu2.gta = this.gta;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.fFC = "";
        this.grQ = 1;
        this.eoo = lcq.BRIGHT_WHITE;
        this.eop = lcq.BRIGHT_WHITE_TRANSPARENT;
        this.gtp = 1;
        this.grZ = 1.0f;
        this.gsf = 1.0f;
        this.doW = 1.0f;
        this.doX = 1.0f;
        this.gsw = 0.0f;
        this.gsx = 0.0f;
        this.gsy = 0.0f;
        this.gsz = 0.0f;
        this.gsA = 0.0f;
        this.gsB = 0.5f;
        this.gtq = 1.0f;
        this.gtr = 1.0f;
        this.bis = new ljq();
        this.gsu = 0.0f;
        this.gsv = 0.0f;
        this.gsJ = 0.8f;
        this.grN = new ljq();
        this.gsg = false;
        this.gsh = 0.0f;
        this.byk = "";
        this.gta = false;
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

    protected void createObject() {
        this.grP = (dfo)dKP.Af(14);
        this.grP.setGUID(this.getMainAtomGuid());
        this.grP.setActive(true);
        this.grP.setEndRotation(this.gsx);
        this.grP.setEndScale(this.doX);
        this.grP.setNumParticles(this.gtp);
        this.grP.setNumTextures(this.grQ);
        this.grP.setParticleLifeTime(this.grZ);
        this.grP.setAnimationFrequency(this.gsf);
        this.grP.gr(this.gsB);
        ljq ljq2 = new ljq(this.grN);
        ljq2.es(this.getTargetPosition());
        ljq2.es(this.gtb);
        this.grP.bL(ljq2);
        this.grP.setPullAcceleration(0.0f);
        this.grP.bR(new ljq());
        this.grP.setRotationTurbulencePercent(this.gsy);
        this.grP.setScaleTurbulencePercent(this.gsz);
        this.grP.setColorTurbulencePercent(this.gsA);
        this.grP.setStartRotation(this.gsw);
        this.grP.setStartScale(this.doW);
        this.grP.bQ(this.bis);
        this.grP.gs(this.gtq);
        this.grP.setTextureName(this.fFC);
        this.grP.setWindInfluence(this.gsu);
        this.grP.setGravityInfluence(this.gsv);
        this.grP.setParticleAcceleration(this.gtr);
        this.grP.setStartColor(this.eoo);
        this.grP.setEndColor(this.eop);
        this.grP.hQ(this.gsg);
        this.grP.gn(this.gsh);
        this.sendAtomOverideToChildren(this.grP);
        this.MessageDelegator.a(this.grP);
    }

    protected void removeObject() {
        if (this.grP == null) {
            return;
        }
        dey.bls().b(this.grP);
        this.grP = null;
    }

    protected void updateColor() {
        assert (this.grP != null);
        if (this.hasInfiniteDuration()) {
            return;
        }
        if ((double)this.gsJ >= 1.0) {
            return;
        }
        double d2 = this.nx.rgz - this.fC.rgz;
        float f2 = (float)(d2 / (double)this.getDuration());
        if (f2 < this.gsJ) {
            return;
        }
        if (this.eop.a != 0.0f) {
            this.eop = new lcq(this.eop.r, this.eop.g, this.eop.b, 0.0f);
            this.grP.setEndColor(this.eop);
        }
        float f3 = (f2 - this.gsJ) / (1.0f - this.gsJ);
        f3 = lew.A(f3, 0.0f, 1.0f);
        lcq lcq2 = lcq.a(this.eoo, this.eop, f3);
        this.grP.setStartColor(lcq2);
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
        knd2.qk(this.grP.getGUID());
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

    public int getNumTextures() {
        return this.grQ;
    }

    public void setNumTextures(int n2) {
        this.grQ = n2;
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

    public int getNumParticles() {
        return this.gtp;
    }

    public void setNumParticles(int n2) {
        this.gtp = n2;
    }

    public float getAnimationFrequency() {
        return this.gsf;
    }

    public void setAnimationFrequency(float f2) {
        this.gsf = f2;
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

    public float getRotationTurbulencePercent() {
        return this.gsy;
    }

    public void setRotationTurbulencePercent(float f2) {
        this.gsy = f2;
    }

    public float getScaleTurbulencePercent() {
        return this.gsz;
    }

    public void setScaleTurbulencePercent(float f2) {
        this.gsz = f2;
    }

    public float getColorTurbulencePercent() {
        return this.gsA;
    }

    public void setColorTurbulencePercent(float f2) {
        this.gsA = f2;
    }

    public float getOffsetScale() {
        return this.gsB;
    }

    public void setOffsetScale(float f2) {
        this.gsB = f2;
    }

    public float getStartSpeed() {
        return this.gtq;
    }

    public void setStartSpeed(float f2) {
        this.gtq = f2;
    }

    public ljq getStartDirection() {
        return this.bis;
    }

    public void setStartDirection(ljq ljq2) {
        this.bis = ljq2;
    }

    public float getWindInfluence() {
        return this.gsu;
    }

    public void setWindInfluence(float f2) {
        this.gsu = f2;
    }

    public float getGravityInfluence() {
        return this.gsv;
    }

    public void setGravityInfluence(float f2) {
        this.gsv = f2;
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

    public float getParticleLifeTime() {
        return this.grZ;
    }

    public void setParticleLifeTime(float f2) {
        this.grZ = f2;
    }

    public float getParticleAcceleration() {
        return this.gtr;
    }

    public void setParticleAcceleration(float f2) {
        this.gtr = f2;
    }

    public float getFadeOffPercentTimeStart() {
        return this.gsJ;
    }

    public void setFadeOffPercentTimeStart(float f2) {
        this.gsJ = f2;
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
        return this.grP;
    }

    public int getAtomCount() {
        return 1;
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.Map;

public class diw
extends dgj {
    protected dfo grP = null;
    private ldv gAW = null;
    private String fFC = null;
    private int grQ = 1;
    private lcq eoo = null;
    private lcq eop = null;
    private int gtp = 1;
    private float gsE = 1.0f;
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
    private float doQ = 1.0f;
    private ljq bis = null;
    private float gsu = 0.0f;
    private float gsv = 0.0f;
    private boolean gsg = false;
    private float gsh = 0.0f;
    private float gsJ = 0.8f;
    private boolean gAX = false;
    private String byk = null;
    private ljq grN = null;
    private boolean gAY = true;

    diw() {
        this.gqB = 38;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeFrameRelation();
        this.removeObject();
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void initializeSpecialEffect() {
        if (!this.isRelationEffect()) {
            return;
        }
        super.initializeSpecialEffect();
        this.createObject();
        boolean bl = this.setupFrameRelation();
        if (!bl) {
            this.removeObject();
        }
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.updateObject();
    }

    private void removeFrameRelation() {
        if (this.gAW == null) {
            return;
        }
        knk knk2 = (knk)this.MessageDelegator.h(780);
        knk2.Zs(2);
        knk2.lQ(false);
        knk2.jM(false);
        knk2.wD(false);
        knk2.qj(this.getTargetObjectGUID());
        knk2.qk(this.grP.getGUID());
        knk2.ts(this.getGUID());
        knk2.kX(this.gAW);
        this.MessageDelegator.a(knk2);
        this.gAW = null;
    }

    private boolean setupFrameRelation() {
        assert (this.getTargetObjectGUID() != null);
        bvd bvd2 = (bvd)this.MessageDelegator.bzx().bzt().d(this.getTargetObjectGUID());
        if (bvd2 == null) {
            return false;
        }
        Map<String, eh> map = ei.ao(bvd2.getFileName());
        if (map == null) {
            return false;
        }
        eh eh2 = map.get(this.byk);
        if (eh2 == null) {
            return false;
        }
        if (eh2.fa() != 0) {
            return false;
        }
        this.gAW = this.getNewEffectGuid();
        knk knk2 = (knk)this.MessageDelegator.h(780);
        assert (knk2 != null);
        knk2.Zs(1);
        knk2.lQ(false);
        knk2.jM(false);
        knk2.wD(false);
        knk2.setFrameName(eh2.getFrameName());
        ljq ljq2 = new ljq(eh2.fb());
        ljq2.es(this.grN);
        knk2.aj(ljq2);
        knk2.dv(this.bis);
        knk2.setModifyDirection(this.gAY);
        knk2.kX(this.gAW);
        knk2.qj(this.getTargetObjectGUID());
        knk2.qk(this.grP.getGUID());
        knk2.ts(this.getGUID());
        this.MessageDelegator.a(knk2);
        return true;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        diw diw2 = (diw)dgj2;
        diw2.fFC = this.fFC;
        diw2.grQ = this.grQ;
        diw2.eoo = this.eoo;
        diw2.eop = this.eop;
        diw2.gtp = this.gtp;
        diw2.gsE = this.gsE;
        diw2.gsf = this.gsf;
        diw2.doW = this.doW;
        diw2.doX = this.doX;
        diw2.gsw = this.gsw;
        diw2.gsx = this.gsx;
        diw2.gsy = this.gsy;
        diw2.gsz = this.gsz;
        diw2.gsA = this.gsA;
        diw2.gsB = this.gsB;
        diw2.gtq = this.gtq;
        diw2.doQ = this.doQ;
        diw2.bis = this.bis;
        diw2.gsu = this.gsu;
        diw2.gsv = this.gsv;
        diw2.gsJ = this.gsJ;
        diw2.gAX = this.gAX;
        diw2.gsg = this.gsg;
        diw2.byk = this.byk;
        diw2.grN = this.grN;
        diw2.gAY = this.gAY;
        diw2.gsh = this.gsh;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.fFC = "";
        this.grQ = 1;
        this.eoo = lcq.BRIGHT_WHITE;
        this.eop = lcq.BRIGHT_WHITE_TRANSPARENT;
        this.gtp = 1;
        this.gsE = 1.0f;
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
        this.doQ = 1.0f;
        this.bis = new ljq();
        this.gsu = 0.0f;
        this.gsv = 0.0f;
        this.gsJ = 0.8f;
        this.gAX = false;
        this.gsg = false;
        this.byk = "";
        this.grN = new ljq();
        this.gAY = false;
        this.gsh = 0.0f;
    }

    protected void createObject() {
        this.grP = (dfo)dKP.Af(14);
        this.grP.setGUID(this.getMainAtomGuid());
        this.grP.setActive(true);
        this.grP.setEndRotation(this.gsx);
        this.grP.setEndScale(this.doX);
        this.grP.setNumParticles(this.gtp);
        this.grP.setNumTextures(this.grQ);
        this.grP.setParticleLifeTime(this.gsE);
        this.grP.setAnimationFrequency(this.gsf);
        this.grP.gr(this.gsB);
        ljq ljq2 = new ljq(this.grN);
        ljq2.es(this.getTargetPosition());
        this.grP.bL(ljq2);
        this.grP.setPullAcceleration(0.0f);
        this.grP.bR(new ljq());
        this.grP.setRotationTurbulencePercent(this.gsy);
        this.grP.setScaleTurbulencePercent(this.gsz);
        this.grP.setColorTurbulencePercent(this.gsA);
        this.grP.setStartRotation(this.gsw);
        this.grP.setStartScale(this.doW);
        if (this.gAX) {
            assert (this.getTargetPosition() != null && this.getSourcePosition() != null);
            ljq ljq3 = new ljq(this.getSourcePosition());
            ljq ljq4 = new ljq(this.getTargetPosition());
            ljq4.es(this.grN);
            ljq3.et(ljq4);
            ljq3.normalize();
            this.grP.bQ(ljq3);
        } else {
            this.grP.bQ(this.bis);
        }
        this.grP.gs(this.gtq);
        this.grP.setTextureName(this.fFC);
        this.grP.setWindInfluence(this.gsu);
        this.grP.setGravityInfluence(this.gsv);
        this.grP.setParticleAcceleration(this.doQ);
        this.grP.setStartColor(this.eoo);
        this.grP.setEndColor(this.eop);
        this.grP.hQ(this.gsg);
        this.grP.gn(this.gsh);
        this.sendAtomOverideToChildren(this.grP);
        this.MessageDelegator.a(this.grP);
    }

    protected void removeObject() {
        if (this.grP != null) {
            dey.bls().b(this.grP);
            this.grP = null;
        }
    }

    protected void updateObject() {
        if (this.grP == null) {
            return;
        }
        if (this.hasInfiniteDuration()) {
            return;
        }
        double d2 = this.nx.rgz - this.fC.rgz;
        float f2 = (float)(d2 / (double)this.getDuration());
        if (f2 < this.gsJ) {
            return;
        }
        float f3 = (f2 - this.gsJ) / (1.0f - this.gsJ);
        f3 = lew.A(f3, 0.0f, 1.0f);
        lcq lcq2 = lcq.a(this.eoo, this.eop, f3);
        this.grP.setStartColor(lcq2);
    }

    public float getAcceleration() {
        return this.doQ;
    }

    public void setAcceleration(float f2) {
        this.doQ = f2;
    }

    public float getAnimationFrequency() {
        return this.gsf;
    }

    public void setAnimationFrequency(float f2) {
        this.gsf = f2;
    }

    public String getAttachPointName() {
        return this.byk;
    }

    public void setAttachPointName(String string) {
        this.byk = string;
    }

    public float getColorTurbulencePercent() {
        return this.gsA;
    }

    public void setColorTurbulencePercent(float f2) {
        this.gsA = f2;
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

    public float getFadeOffPercentTimeStart() {
        return this.gsJ;
    }

    public void setFadeOffPercentTimeStart(float f2) {
        this.gsJ = f2;
    }

    public boolean isGetStartDirectionFromSourceAndTargetPosition() {
        return this.gAX;
    }

    public void setGetStartDirectionFromSourceAndTargetPosition(boolean bl) {
        this.gAX = bl;
    }

    public float getGravityInfluence() {
        return this.gsv;
    }

    public void setGravityInfluence(float f2) {
        this.gsv = f2;
    }

    public float getLifeTime() {
        return this.gsE;
    }

    public void setLifeTime(float f2) {
        this.gsE = f2;
    }

    public boolean isModifyDirection() {
        return this.gAY;
    }

    public void setModifyDirection(boolean bl) {
        this.gAY = bl;
    }

    public int getNumParticles() {
        return this.gtp;
    }

    public void setNumParticles(int n2) {
        this.gtp = n2;
    }

    public int getNumTextures() {
        return this.grQ;
    }

    public void setNumTextures(int n2) {
        this.grQ = n2;
    }

    public float getOffsetScale() {
        return this.gsB;
    }

    public void setOffsetScale(float f2) {
        this.gsB = f2;
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

    public lcq getStartColor() {
        return this.eoo;
    }

    public void setStartColor(lcq lcq2) {
        this.eoo = lcq2;
    }

    public ljq getStartDirection() {
        return this.bis;
    }

    public void setStartDirection(ljq ljq2) {
        this.bis = ljq2;
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

    public float getStartSpeed() {
        return this.gtq;
    }

    public void setStartSpeed(float f2) {
        this.gtq = f2;
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

    public float getWindInfluence() {
        return this.gsu;
    }

    public void setWindInfluence(float f2) {
        this.gsu = f2;
    }

    public float getMotionBlurModifier() {
        return this.gsh;
    }

    public void setMotionBlurModifier(float f2) {
        this.gsh = f2;
    }

    public dey getAtom(int n2) {
        return this.grP;
    }

    public int getAtomCount() {
        return 1;
    }
}


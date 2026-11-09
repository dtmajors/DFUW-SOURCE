/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.Map;

public class dkb
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
    private float gCL = 1.0f;
    private float gCM = 2.0f;
    private float gAR = 1.0f;
    private float gCN = 2.0f;
    private float gCO = 1.0f;
    private float gsJ = 0.8f;
    private boolean gCP = true;
    private boolean gCQ = true;
    private boolean gzU = false;
    private String gto = "";
    private boolean gta = false;
    private ljq gtb = null;

    dkb() {
        this.gqB = 56;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeObject();
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.checkAttachPoint();
        this.createObject();
        if (this.isRelationEffect()) {
            ljq ljq2 = new ljq(this.grN);
            if (this.gzU) {
                ljq2.es(this.gtb);
            }
            if (this.gta) {
                ljq2.es(this.getTargetPosition());
            }
            this.setDeltaPos(ljq2);
            dkx dkx2 = this.setupPositionalRelation(this.getTargetObjectGUID(), this.grP.getGUID(), this.getMainEffectObjectType());
        }
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.updateColor();
        this.updateLifeTime();
        this.updateAcceleration();
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dkb dkb2 = (dkb)dgj2;
        dkb2.fFC = this.fFC;
        dkb2.grQ = this.grQ;
        dkb2.eoo = this.eoo;
        dkb2.eop = this.eop;
        dkb2.gtp = this.gtp;
        dkb2.gCL = this.gCL;
        dkb2.gCM = this.gCM;
        dkb2.gsf = this.gsf;
        dkb2.doW = this.doW;
        dkb2.doX = this.doX;
        dkb2.gsw = this.gsw;
        dkb2.gsx = this.gsx;
        dkb2.gsy = this.gsy;
        dkb2.gsz = this.gsz;
        dkb2.gsA = this.gsA;
        dkb2.gsB = this.gsB;
        dkb2.gtq = this.gtq;
        dkb2.gAR = this.gAR;
        dkb2.gCN = this.gCN;
        dkb2.gCO = this.gCO;
        dkb2.bis = this.bis;
        dkb2.gsu = this.gsu;
        dkb2.gsv = this.gsv;
        dkb2.gsJ = this.gsJ;
        dkb2.grN = this.grN;
        dkb2.gsg = this.gsg;
        dkb2.gsh = this.gsh;
        dkb2.gzU = this.gzU;
        dkb2.gto = this.gto;
        dkb2.gta = this.gta;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.fFC = "";
        this.grQ = 1;
        this.eoo = lcq.BRIGHT_WHITE;
        this.eop = lcq.BRIGHT_WHITE_TRANSPARENT;
        this.gtp = 1;
        this.gCL = 1.0f;
        this.gCM = 1.0f;
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
        this.gAR = 1.0f;
        this.gCN = 1.0f;
        this.gCO = 1.0f;
        this.bis = new ljq();
        this.gsu = 0.0f;
        this.gsv = 0.0f;
        this.gsJ = 0.8f;
        this.grN = new ljq();
        this.gsg = false;
        this.gsh = 0.0f;
        this.gzU = false;
        this.gto = "";
        this.gta = false;
    }

    private void checkAttachPoint() {
        if (!this.gzU) {
            return;
        }
        this.gtb = new ljq();
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
        if (map == null) {
            return;
        }
        eh eh2 = map.get(this.gto);
        if (eh2 == null) {
            return;
        }
        this.gtb = new ljq(eh2.fb());
    }

    protected void createObject() {
        this.grP = (dfo)dKP.Af(14);
        this.grP.setGUID(this.getMainAtomGuid());
        this.grP.setActive(true);
        this.grP.setEndRotation(this.gsx);
        this.grP.setEndScale(this.doX);
        this.grP.setNumParticles(this.gtp);
        this.grP.setNumTextures(this.grQ);
        this.grP.setParticleLifeTime(this.gCL);
        this.grP.setAnimationFrequency(this.gsf);
        this.grP.gr(this.gsB);
        ljq ljq2 = new ljq(this.grN);
        ljq2.es(this.getTargetPosition());
        if (this.gzU) {
            ljq2.es(this.gtb);
        }
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
        this.grP.setParticleAcceleration(this.gAR);
        this.grP.setStartColor(this.eoo);
        this.grP.setEndColor(this.eop);
        this.grP.hQ(this.gsg);
        this.grP.gn(this.gsh);
        this.sendAtomOverideToChildren(this.grP);
        this.MessageDelegator.a(this.grP);
        if (this.gCL == this.gCM) {
            this.gCP = false;
        }
        if (this.gAR == this.gCN) {
            this.gCQ = false;
        }
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
        double d2 = this.nx.rgz - this.fC.rgz;
        float f = (float)(d2 / (double)this.getDuration());
        if (f < this.gsJ) {
            return;
        }
        if (this.eop.a != 0.0f) {
            this.eop = new lcq(this.eop.r, this.eop.g, this.eop.b, 0.0f);
            this.grP.setEndColor(this.eop);
        }
        float f2 = (f - this.gsJ) / (1.0f - this.gsJ);
        f2 = lew.A(f2, 0.0f, 1.0f);
        lcq lcq2 = lcq.a(this.eoo, this.eop, f2);
        this.grP.setStartColor(lcq2);
    }

    private void updateLifeTime() {
        if (!this.gCP) {
            return;
        }
        float f = (float)(this.nx.rgz - this.fC.rgz);
        float f2 = this.gCM - this.gCL;
        if (f > Math.abs(f2)) {
            this.gCP = false;
            f = Math.abs(f2);
        }
        float f3 = this.gCL;
        f3 = this.gCM < this.gCL ? (f3 -= f) : (f3 += f);
        this.grP.setParticleLifeTime(f3);
    }

    private void updateAcceleration() {
        if (!this.gCQ) {
            return;
        }
        float f = (float)(this.nx.rgz - this.fC.rgz);
        float f2 = this.gAR + f * this.gCO;
        if (f2 > this.gCN) {
            f2 = this.gCN;
            this.gCQ = false;
        }
        this.grP.setParticleAcceleration(f2);
    }

    public float getStartAcceleration() {
        return this.gAR;
    }

    public void setStartAcceleration(float f) {
        this.gAR = f;
    }

    public float getAnimationFrequency() {
        return this.gsf;
    }

    public void setAnimationFrequency(float f) {
        this.gsf = f;
    }

    public float getColorTurbulencePercent() {
        return this.gsA;
    }

    public void setColorTurbulencePercent(float f) {
        this.gsA = f;
    }

    public lcq getEndColor() {
        return this.eop;
    }

    public void setEndColor(lcq lcq2) {
        this.eop = lcq2;
    }

    public float getEndLifeTime() {
        return this.gCM;
    }

    public void setEndLifeTime(float f) {
        this.gCM = f;
    }

    public float getEndRotation() {
        return this.gsx;
    }

    public void setEndRotation(float f) {
        this.gsx = f;
    }

    public float getEndScale() {
        return this.doX;
    }

    public void setEndScale(float f) {
        this.doX = f;
    }

    public float getFadeOffPercentTimeStart() {
        return this.gsJ;
    }

    public void setFadeOffPercentTimeStart(float f) {
        this.gsJ = f;
    }

    public float getGravityInfluence() {
        return this.gsv;
    }

    public void setGravityInfluence(float f) {
        this.gsv = f;
    }

    public float getMotionBlurModifier() {
        return this.gsh;
    }

    public void setMotionBlurModifier(float f) {
        this.gsh = f;
    }

    public int getNumParticles() {
        return this.gtp;
    }

    public void setNumParticles(int n) {
        this.gtp = n;
    }

    public int getNumTextures() {
        return this.grQ;
    }

    public void setNumTextures(int n) {
        this.grQ = n;
    }

    public float getOffsetScale() {
        return this.gsB;
    }

    public void setOffsetScale(float f) {
        this.gsB = f;
    }

    public float getRotationTurbulencePercent() {
        return this.gsy;
    }

    public void setRotationTurbulencePercent(float f) {
        this.gsy = f;
    }

    public float getScaleTurbulencePercent() {
        return this.gsz;
    }

    public void setScaleTurbulencePercent(float f) {
        this.gsz = f;
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

    public float getStartLifeTime() {
        return this.gCL;
    }

    public void setStartLifeTime(float f) {
        this.gCL = f;
    }

    public float getStartRotation() {
        return this.gsw;
    }

    public void setStartRotation(float f) {
        this.gsw = f;
    }

    public float getStartScale() {
        return this.doW;
    }

    public void setStartScale(float f) {
        this.doW = f;
    }

    public float getStartSpeed() {
        return this.gtq;
    }

    public void setStartSpeed(float f) {
        this.gtq = f;
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

    public void setWindInfluence(float f) {
        this.gsu = f;
    }

    public float getEndAcceleration() {
        return this.gCN;
    }

    public void setEndAcceleration(float f) {
        this.gCN = f;
    }

    public float getAccelerationUpdateFrequency() {
        return this.gCO;
    }

    public void setAccelerationUpdateFrequency(float f) {
        this.gCO = f;
    }

    public boolean isUseMeshAttachPoint() {
        return this.gzU;
    }

    public void setUseMeshAttachPoint(boolean bl) {
        this.gzU = bl;
    }

    public String getMeshAttachPointName() {
        return this.gto;
    }

    public void setMeshAttachPointName(String string) {
        this.gto = string;
    }

    public boolean isUseTargetPositionAsDeltaPos() {
        return this.gta;
    }

    public void setUseTargetPositionAsDeltaPos(boolean bl) {
        this.gta = bl;
    }

    public dey getAtom(int n) {
        return this.grP;
    }

    public int getAtomCount() {
        return 1;
    }
}


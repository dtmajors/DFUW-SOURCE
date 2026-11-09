/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.List;

public class dja
extends dgj {
    private List gBj = null;
    private int gBk = 2;
    private ljq gBl = null;
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
    private float gAP = 0.0f;
    private ljq gBm = null;
    private boolean gBn = false;
    private float gsJ = 0.8f;
    private boolean gsH = false;
    private boolean gsg = false;
    private float gsh = 0.0f;

    dja() {
        this.gqB = 26;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeParticles();
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.createParticles();
        if (this.isRelationEffect()) {
            assert (this.gBj != null);
            for (dfo dfo2 : this.gBj) {
                this.setupPositionalRelation(this.getTargetObjectGUID(), dfo2.getGUID(), this.getMainEffectObjectType());
            }
        }
    }

    protected void doTickSpecialEffect() {
        this.updateFadeOut();
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    private void createParticles() {
        this.gBj = lcn.abH(this.gBk);
        for (int i = 0; i < this.gBk; ++i) {
            ljq ljq2 = new ljq(this.gBl.x * lew.eqr(), this.gBl.y, this.gBl.rlV * lew.eqr());
            ljq2.es(this.getTargetPosition());
            dfo dfo2 = this.createParticle(ljq2);
            this.gBj.add(dfo2);
            this.sendAtomOverideToChildren(dfo2);
            this.MessageDelegator.a(dfo2);
        }
    }

    private void updateFadeOut() {
        Object object;
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
            for (int i = 0; i < this.gBj.size(); ++i) {
                object = (dfo)this.gBj.get(i);
                ((dfo)object).setEndColor(this.eop);
            }
        }
        float f2 = (f - this.gsJ) / (1.0f - this.gsJ);
        f2 = lew.A(f2, 0.0f, 1.0f);
        object = lcq.a(this.eoo, this.eop, f2);
        for (int i = 0; i < this.gBj.size(); ++i) {
            dfo dfo2 = (dfo)this.gBj.get(i);
            dfo2.setStartColor((lcq)object);
        }
    }

    private dfo createParticle(ljq ljq2) {
        dfo dfo2 = (dfo)dKP.Af(14);
        dfo2.setGUID(this.getNewEffectGuid());
        dfo2.setActive(true);
        dfo2.setEndColor(this.eop);
        dfo2.setEndRotation(this.gsx);
        dfo2.setEndScale(this.doX);
        dfo2.setGravityInfluence(this.gsv);
        dfo2.setNumParticles(this.gtp);
        dfo2.setNumTextures(this.grQ);
        dfo2.setParticleAcceleration(this.doQ);
        dfo2.setParticleLifeTime(this.gsE);
        dfo2.setAnimationFrequency(this.getAnimationFrequency());
        dfo2.gr(this.gsB);
        dfo2.bL(ljq2);
        dfo2.bQ(this.bis);
        dfo2.gs(this.gtq);
        dfo2.setPullAcceleration(this.gAP);
        if (this.gBn) {
            ljq ljq3 = new ljq(this.getTargetPosition());
            ljq3.es(this.gBm);
            dfo2.bR(ljq3);
        } else {
            ljq ljq4 = new ljq(ljq2);
            ljq4.es(this.gBm);
            dfo2.bR(ljq4);
        }
        dfo2.setRotationTurbulencePercent(this.gsy);
        dfo2.setScaleTurbulencePercent(this.gsz);
        dfo2.setColorTurbulencePercent(this.gsA);
        dfo2.setStartColor(this.eoo);
        dfo2.setStartRotation(this.gsw);
        dfo2.setStartScale(this.doW);
        dfo2.setTextureName(this.fFC);
        dfo2.setWindInfluence(this.gsu);
        dfo2.hQ(this.gsg);
        dfo2.gn(this.gsh);
        return dfo2;
    }

    private void removeParticles() {
        if (this.gBj == null) {
            return;
        }
        for (int i = 0; i < this.gBj.size(); ++i) {
            dfo dfo2 = (dfo)this.gBj.get(i);
            dey.bls().b(dfo2);
        }
        this.gBj = null;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gBk = 2;
        this.gBl = new ljq(1.0f, 1.0f, 1.0f);
        this.fFC = null;
        this.grQ = 1;
        this.eoo = lcq.BRIGHT_WHITE;
        this.eop = lcq.BRIGHT_WHITE;
        this.gtp = 1;
        this.gsE = 1.0f;
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
        this.gAP = 0.0f;
        this.gBm = new ljq();
        this.gBn = true;
        this.gsJ = 0.8f;
        this.gsf = 1.0f;
        this.gsH = false;
        this.gsg = false;
        this.gsh = 0.0f;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dja dja2 = (dja)dgj2;
        dja2.gBk = this.gBk;
        dja2.gBl = this.gBl;
        dja2.fFC = this.fFC;
        dja2.grQ = this.grQ;
        dja2.eoo = this.eoo;
        dja2.eop = this.eop;
        dja2.gtp = this.gtp;
        dja2.gsE = this.gsE;
        dja2.gsf = this.gsf;
        dja2.doW = this.doW;
        dja2.doX = this.doX;
        dja2.gsw = this.gsw;
        dja2.gsx = this.gsx;
        dja2.gsy = this.gsy;
        dja2.gsz = this.gsz;
        dja2.gsA = this.gsA;
        dja2.gsB = this.gsB;
        dja2.gtq = this.gtq;
        dja2.doQ = this.doQ;
        dja2.bis = this.bis;
        dja2.gsu = this.gsu;
        dja2.gsv = this.gsv;
        dja2.gAP = this.gAP;
        dja2.gBm = this.gBm;
        dja2.gBn = this.gBn;
        dja2.gsJ = this.gsJ;
        dja2.gsH = this.gsH;
        dja2.gsg = this.gsg;
        dja2.gsh = this.gsh;
    }

    public float getAcceleration() {
        return this.doQ;
    }

    public void setAcceleration(float f) {
        this.doQ = f;
    }

    public float getColorTurbulencePercent() {
        return this.gsA;
    }

    public void setColorTurbulencePercent(float f) {
        this.gsA = f;
    }

    public boolean isCommonPullPoint() {
        return this.gBn;
    }

    public void setCommonPullPoint(boolean bl) {
        this.gBn = bl;
    }

    public ljq getEmitterRadius() {
        return this.gBl;
    }

    public void setEmitterRadius(ljq ljq2) {
        this.gBl = ljq2;
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

    public float getLifeTime() {
        return this.gsE;
    }

    public void setLifeTime(float f) {
        this.gsE = f;
    }

    public int getNumberOfEmitters() {
        return this.gBk;
    }

    public void setNumberOfEmitters(int n) {
        this.gBk = n;
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

    public float getPullAcceleration() {
        return this.gAP;
    }

    public void setPullAcceleration(float f) {
        this.gAP = f;
    }

    public ljq getPullPointTargetOffset() {
        return this.gBm;
    }

    public void setPullPointTargetOffset(ljq ljq2) {
        this.gBm = ljq2;
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

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public boolean isUsePower() {
        return this.gsH;
    }

    public void setUsePower(boolean bl) {
        this.gsH = bl;
    }

    public float getWindInfluence() {
        return this.gsu;
    }

    public void setWindInfluence(float f) {
        this.gsu = f;
    }

    public float getAnimationFrequency() {
        return this.gsf;
    }

    public void setAnimationFrequency(float f) {
        this.gsf = f;
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

    public void setMotionBlurModifier(float f) {
        this.gsh = f;
    }

    public dey getAtom(int n) {
        if (this.gBj == null) {
            return null;
        }
        return (dey)this.gBj.get(n);
    }

    public int getAtomCount() {
        if (this.gBj == null) {
            return 0;
        }
        return this.gBj.size();
    }
}


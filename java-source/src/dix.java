/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dix
extends dgj {
    private ldv gAZ = null;
    private ldv dUC = null;
    private String fFC = null;
    private int grQ = 1;
    private lcq eoo = null;
    private lcq eop = null;
    private int gtp = 20;
    private float gsE = 1.0f;
    private float gsf = 1.0f;
    private float gsu = 0.0f;
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
    private boolean gsg = false;
    private float gsh = 0.0f;
    private float gBa = 1.0f;
    private float gsJ = 0.8f;
    private float gBb = 0.5f;
    private float gBc = 1.0f;
    private boolean gBd = true;
    private ljq gBe = null;
    private boolean gBf = false;
    private ljq gBg = null;
    private boolean gBh = false;
    private double gBi = 0.0;

    dix() {
        this.gqB = 31;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removePositionalReportSensor();
        if (this.gBf) {
            this.removePhysicsStateSensor();
        }
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        if (!this.isRelationEffect()) {
            return;
        }
        this.gBg = this.getTargetPosition();
        this.setupPositionalReportSensor();
        if (this.gBf) {
            this.setupPhysicsStateSensor();
        }
    }

    private void spawnNewParticle() {
        dfo dfo2 = (dfo)dKP.Af(14);
        dfo2.setGUID(this.getNewEffectGuid());
        dfo2.setActive(true);
        dfo2.setEndColor(this.eop);
        dfo2.setEndRotation(this.gsx);
        dfo2.setEndScale(this.doX);
        dfo2.setGravityInfluence(0.0f);
        dfo2.setNumParticles(this.gtp);
        dfo2.setNumTextures(this.grQ);
        dfo2.setParticleAcceleration(this.doQ);
        dfo2.setParticleLifeTime(this.gsE);
        dfo2.setAnimationFrequency(this.gsf);
        dfo2.gr(this.gsB);
        ljq ljq2 = new ljq(this.gBg);
        ljq2.es(this.gBe);
        dfo2.bL(ljq2);
        dfo2.bQ(this.bis);
        dfo2.gs(this.gtq);
        dfo2.setPullAcceleration(0.0f);
        dfo2.bR(new ljq());
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
        double d2 = this.gBa * this.gsJ;
        gmS.a(dfo2, this.nx.rgz + (double)this.gBa, this.nx.rgz + d2);
        this.gBi = this.nx.rgz + ((double)this.gBb + Math.random() * (double)(this.gBc - this.gBb));
    }

    private void setupPositionalReportSensor() {
        this.gAZ = this.getNewEffectGuid();
        kpl kpl2 = (kpl)this.MessageDelegator.h(517);
        kpl2.aag(1);
        kpl2.aah(3);
        kpl2.aai(1);
        kpl2.aaj(1);
        kpl2.lQ(false);
        kpl2.jM(false);
        kpl2.wD(false);
        kpl2.ts(this.getGUID());
        kpl2.sy(this.gAZ);
        kpl2.hK(this.getTargetObjectGUID());
        kpl2.zP(10);
        this.MessageDelegator.a(kpl2);
    }

    private void removePositionalReportSensor() {
        if (this.gAZ == null) {
            return;
        }
        kpl kpl2 = (kpl)this.MessageDelegator.h(517);
        kpl2.jM(false);
        kpl2.wD(false);
        kpl2.ts(this.getGUID());
        kpl2.sy(this.gAZ);
        kpl2.hK(this.getTargetObjectGUID());
        kpl2.aag(2);
        this.MessageDelegator.a(kpl2);
        this.gAZ = null;
    }

    private void decreasePositionalReportWindowCounter() {
        if (this.gAZ == null) {
            return;
        }
        kpl kpl2 = (kpl)this.MessageDelegator.h(517);
        kpl2.jM(false);
        kpl2.wD(false);
        kpl2.ts(this.getGUID());
        kpl2.sy(this.gAZ);
        kpl2.hK(this.getTargetObjectGUID());
        kpl2.aag(4);
        this.MessageDelegator.a(kpl2);
    }

    private void setupPhysicsStateSensor() {
        this.dUC = this.getNewEffectGuid();
        kpk kpk2 = (kpk)this.MessageDelegator.h(519);
        kpk2.jM(false);
        kpk2.wD(false);
        kpk2.ts(this.getGUID());
        kpk2.lQ(false);
        kpk2.hK(this.getTargetObjectGUID());
        kpk2.sy(this.dUC);
        kpk2.aae(1);
        kpk2.aaf(1);
        this.MessageDelegator.a(kpk2);
    }

    private void removePhysicsStateSensor() {
        if (this.dUC == null) {
            return;
        }
        kpk kpk2 = (kpk)this.MessageDelegator.h(519);
        kpk2.jM(false);
        kpk2.wD(false);
        kpk2.ts(this.getGUID());
        kpk2.lQ(false);
        kpk2.hK(this.getTargetObjectGUID());
        kpk2.sy(this.dUC);
        kpk2.aae(2);
        this.MessageDelegator.a(kpk2);
        this.dUC = null;
    }

    private void decreasePhysicsStateSensorWindowCounter() {
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        if (!this.gBd) {
            if (this.gBf) {
                if (this.gBh && this.gBi <= this.nx.rgz) {
                    this.spawnNewParticle();
                }
            } else if (this.gBi <= this.nx.rgz) {
                this.spawnNewParticle();
            }
        }
    }

    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 516: {
                kwp kwp2 = (kwp)ktv2;
                this.gBg = kwp2.av();
                if (this.gBd && this.gBi <= this.nx.rgz) {
                    if (this.gBf) {
                        if (this.gBh) {
                            this.spawnNewParticle();
                        }
                    } else {
                        this.spawnNewParticle();
                    }
                }
                this.decreasePositionalReportWindowCounter();
                break;
            }
            case 518: {
                kwo kwo2 = (kwo)ktv2;
                this.gBh = kwo2.edl;
                this.decreasePhysicsStateSensorWindowCounter();
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    private double getNewSpawnTime(double d2) {
        double d3 = (double)this.gBb + Math.random() * (double)(this.gBc - this.gBb);
        return d3 + d2;
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

    public float getColorTurbulencePercent() {
        return this.gsA;
    }

    public void setColorTurbulencePercent(float f2) {
        this.gsA = f2;
    }

    public float getDustBallLifeTime() {
        return this.gBa;
    }

    public void setDustBallLifeTime(float f2) {
        this.gBa = f2;
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

    public float getLifeTime() {
        return this.gsE;
    }

    public void setLifeTime(float f2) {
        this.gsE = f2;
    }

    public float getMaxTimeForSpawn() {
        return this.gBc;
    }

    public void setMaxTimeForSpawn(float f2) {
        this.gBc = f2;
    }

    public float getMinTimeForSpawn() {
        return this.gBb;
    }

    public void setMinTimeForSpawn(float f2) {
        this.gBb = f2;
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

    public boolean isSpawnOnlyIfMoving() {
        return this.gBd;
    }

    public void setSpawnOnlyIfMoving(boolean bl) {
        this.gBd = bl;
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

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public float getWindInfluence() {
        return this.gsu;
    }

    public void setWindInfluence(float f2) {
        this.gsu = f2;
    }

    public ljq getTargetPosOffset() {
        return this.gBe;
    }

    public void setTargetPosOffset(ljq ljq2) {
        this.gBe = ljq2;
    }

    public boolean isOnlyActivateIfInContact() {
        return this.gBf;
    }

    public void setOnlyActivateIfInContact(boolean bl) {
        this.gBf = bl;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dix dix2 = (dix)dgj2;
        dix2.fFC = this.fFC;
        dix2.grQ = this.grQ;
        dix2.eoo = this.eoo;
        dix2.eop = this.eop;
        dix2.gtp = this.gtp;
        dix2.gsE = this.gsE;
        dix2.gsf = this.gsf;
        dix2.gsu = this.gsu;
        dix2.doW = this.doW;
        dix2.doX = this.doX;
        dix2.gsw = this.gsw;
        dix2.gsx = this.gsx;
        dix2.gsy = this.gsy;
        dix2.gsz = this.gsz;
        dix2.gsA = this.gsA;
        dix2.gsB = this.gsB;
        dix2.gtq = this.gtq;
        dix2.doQ = this.doQ;
        dix2.bis = this.bis;
        dix2.gBa = this.gBa;
        dix2.gsJ = this.gsJ;
        dix2.gBb = this.gBb;
        dix2.gBc = this.gBc;
        dix2.gBd = this.gBd;
        dix2.gBe = this.gBe;
        dix2.gBf = this.gBf;
        dix2.gsg = this.gsg;
        dix2.gsh = this.gsh;
    }

    public void setDefaultValues() {
        this.fFC = null;
        this.grQ = 1;
        this.eoo = lcq.BRIGHT_WHITE;
        this.eop = lcq.BRIGHT_WHITE_TRANSPARENT;
        this.gtp = 20;
        this.gsE = 0.5f;
        this.gsf = 1.0f;
        this.gsu = 0.0f;
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
        this.gBa = 1.0f;
        this.gsJ = 0.8f;
        this.gBb = 0.2f;
        this.gBc = 0.5f;
        this.gBd = true;
        this.gBe = new ljq();
        this.gBf = false;
        this.gsg = false;
        this.gsh = 0.0f;
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
}


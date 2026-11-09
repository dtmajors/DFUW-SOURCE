/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cew
 *  dgj
 *  dta
 *  dtn
 *  lcr
 *  lcw
 */
public class diy
extends dgj {
    protected dfo grP = null;
    protected String fFC = null;
    protected int grQ = 1;
    protected lcq eoo = null;
    protected lcq eop = null;
    protected int gtp = 1;
    protected float gsu = 0.0f;
    protected float doW = 1.0f;
    protected float doX = 1.0f;
    protected float gsw = 0.0f;
    protected float gsx = 0.0f;
    protected float gsy = 0.0f;
    protected float gsz = 0.0f;
    protected float gsA = 0.0f;
    protected float gsB = 0.5f;
    protected float gtq = 1.0f;
    protected float doQ = 1.0f;
    protected ljq bis = null;
    protected float gsJ = 0.8f;
    protected boolean gsH = false;
    private boolean gsg = false;
    private float gsh = 0.0f;

    diy() {
        this.gqB = 9;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeParticle();
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        if (lcw.emW()) {
            amf amf2;
            dta dta2 = this.MessageDelegator.bzx().bzt().od(lcr.qzp);
            if (dta2 == null) {
                lfn.b(5, "SFSpecialEffectParticleExplosion", "initializeSpecialEffect() : system os is null");
                return;
            }
            if (!(dta2 instanceof dtn)) {
                lfn.b(5, "SFSpecialEffectParticleExplosion", "initializeSpecialEffect() : os is not system");
                return;
            }
            dtn dtn2 = (dtn)dta2;
            if (dtn2.bAn() == null) {
                lfn.b(5, "SFSpecialEffectParticleExplosion", "initializeSpecialEffect() :client info is null ");
                return;
            }
            if (dtn2.bAn().gYZ == null) {
                lfn.b(5, "SFSpecialEffectParticleExplosion", "initializeSpecialEffect() :client meshobject guid is null");
                return;
            }
            if (!dtn2.bAn().gYZ.equals(this.akX)) {
                return;
            }
            if (dtn2.bzt() != null && (amf2 = dtn2.bzt().d(dtn2.bAn().gYZ)) instanceof bvi) {
                boolean bl;
                bvi bvi2 = (bvi)((Object)amf2);
                cbx cbx2 = bvi2.aze();
                if (cbx2 == null) {
                    return;
                }
                boolean bl2 = cbx2.aIq();
                boolean bl3 = bl = cbx2 instanceof cew ? ((cew)cbx2).km(this.akX) : false;
                if (bl2 && !bl) {
                    return;
                }
            }
        }
        this.createParticle();
        if (this.isRelationEffect()) {
            this.setupPositionalRelation(this.getTargetObjectGUID(), this.grP.getGUID(), this.getMainEffectObjectType());
        }
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.updateFadeOut();
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void createParticle() {
        this.grP = (dfo)dKP.Af(14);
        this.grP.setGUID(this.getMainAtomGuid());
        this.grP.setActive(true);
        this.grP.setEndColor(this.eop);
        this.grP.setEndRotation(this.gsx);
        if (this.gsH) {
            this.grP.setEndScale(this.doX * this.getPower());
        } else {
            this.grP.setEndScale(this.doX);
        }
        this.grP.setGravityInfluence(0.0f);
        this.grP.setNumParticles(this.gtp);
        this.grP.setNumTextures(this.grQ);
        this.grP.setParticleAcceleration(this.doQ);
        float f2 = this.getDuration();
        this.grP.setParticleLifeTime(f2 /= 1.67f);
        this.grP.setAnimationFrequency(f2);
        this.grP.gr(this.gsB);
        if (!this.isRelationEffect()) {
            ljq ljq2 = new ljq(this.getTargetPosition());
            this.grP.bL(ljq2);
        } else {
            this.grP.bL(this.getTargetPosition());
        }
        this.grP.bQ(this.bis);
        this.grP.gs(this.gtq);
        this.grP.setPullAcceleration(0.0f);
        this.grP.bR(new ljq());
        this.grP.setRotationTurbulencePercent(this.gsy);
        this.grP.setScaleTurbulencePercent(this.gsz);
        this.grP.setColorTurbulencePercent(this.gsA);
        this.grP.setStartColor(this.eoo);
        this.grP.setStartRotation(this.gsw);
        this.grP.setStartScale(this.doW);
        this.grP.setTextureName(this.fFC);
        this.grP.setWindInfluence(this.gsu);
        this.grP.hQ(this.gsg);
        this.grP.gn(this.gsh);
        this.sendAtomOverideToChildren(this.grP);
        this.MessageDelegator.a(this.grP);
    }

    protected void removeParticle() {
        if (this.grP == null) {
            return;
        }
        dey.bls().b(this.grP);
        this.grP = null;
    }

    protected void updateFadeOut() {
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
        if (this.grP != null) {
            this.grP.setStartColor(lcq2);
        }
    }

    public float getAcceleration() {
        return this.doQ;
    }

    public void setAcceleration(float f2) {
        this.doQ = f2;
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

    public void setDefaultValues() {
        super.setDefaultValues();
        this.fFC = "";
        this.grQ = 1;
        this.eoo = lcq.BRIGHT_WHITE;
        this.eop = lcq.BRIGHT_WHITE;
        this.gtp = 1;
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
        this.bis = new ljq(0.0f, 1.0f, 0.0f);
        this.gsH = false;
        this.gsJ = 0.8f;
        this.gsg = false;
        this.gsh = 0.0f;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        diy diy2 = (diy)dgj2;
        diy2.fFC = this.fFC;
        diy2.grQ = this.grQ;
        diy2.eoo = this.eoo;
        diy2.eop = this.eop;
        diy2.gtp = this.gtp;
        diy2.gsu = this.gsu;
        diy2.doW = this.doW;
        diy2.doX = this.doX;
        diy2.gsw = this.gsw;
        diy2.gsx = this.gsx;
        diy2.gsy = this.gsy;
        diy2.gsz = this.gsz;
        diy2.gsA = this.gsA;
        diy2.gsB = this.gsB;
        diy2.gtq = this.gtq;
        diy2.doQ = this.doQ;
        diy2.bis = this.bis;
        diy2.gsH = this.gsH;
        diy2.gsJ = this.gsJ;
        diy2.gsg = this.gsg;
        diy2.gsh = this.gsh;
    }

    public boolean isUsePower() {
        return this.gsH;
    }

    public void setUsePower(boolean bl) {
        this.gsH = bl;
    }

    public float getFadeOffPercentTimeStart() {
        return this.gsJ;
    }

    public void setFadeOffPercentTimeStart(float f2) {
        this.gsJ = f2;
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

    public dey getAtom(int n2) {
        return this.grP;
    }

    public int getAtomCount() {
        return 1;
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.Iterator;
import java.util.LinkedList;

public class dhb
extends dgj {
    private LinkedList gtK = lcn.emA();
    private String gtL = null;
    private int grQ = 1;
    private float gsf = 0.0f;
    private float grZ = 0.0f;
    private lcq gtM = null;
    private lcq gtN = null;
    private ljq gtO = null;
    private ljq gtP = null;
    private int gtQ = 0;
    private int gtR = 0;
    private float gtS = 1.0f;
    private float gtT = 2.0f;
    private float gtU = 1.0f;
    private float gtV = 1.0f;
    private float gtW = 0.0f;
    private float gtX = 0.0f;
    private float gtY = 99999.0f;
    private float gtZ = 99999.0f;
    private float bzb = 100.0f;
    private float gsw = 0.0f;
    private float gsx = 0.0f;
    private boolean gsg = false;
    private boolean gua = true;
    private String gub = null;
    private String guc = null;
    private boolean gud = false;
    private boolean gue = false;
    private int guf = 7;
    private float gug = 1.0f;
    private float gsh = 0.0f;
    private ljq guh = null;
    private ljq gui = null;
    private int guj = 0;
    private int guk = 0;

    dhb() {
        this.gqB = 46;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeAll();
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        if (this.gub != null && this.gub != "") {
            this.guj = del.dr(this.gub);
            if (this.guj <= 0) {
                // empty if block
            }
        }
        if (this.guc != null && this.guc != "") {
            this.guk = del.dr(this.guc);
            if (this.guk <= 0) {
                // empty if block
            }
        }
        this.setDeltaPos(null);
        this.setDeltaRot(null);
        this.createParticleShooters();
        assert (!this.isRelationEffect()) : "This effect can NOT be a relationeffect";
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.checkShooters();
    }

    protected int getMainEffectObjectType() {
        return 6;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gtL = "";
        this.grQ = 1;
        this.gsf = 0.25f;
        this.grZ = 1.0f;
        this.gtM = lcq.BRIGHT_WHITE;
        this.gtN = lcq.BRIGHT_WHITE;
        this.gtO = new ljq(-0.78, -3.14, -0.78);
        this.gtP = new ljq(0.78, 3.14, 0.78);
        this.gtQ = 1;
        this.gtR = 5;
        this.gtS = 25.0f;
        this.gtT = 40.0f;
        this.gtU = 1.0f;
        this.gtV = 1.0f;
        this.gtW = 1.0f;
        this.gtX = 2.0f;
        this.gtY = 1000.0f;
        this.gtZ = 1000.0f;
        this.bzb = 150.0f;
        this.gsw = 0.0f;
        this.gsx = 0.0f;
        this.gsg = false;
        this.gua = true;
        this.gub = "";
        this.guc = "";
        this.gud = false;
        this.gue = false;
        this.guf = 7;
        this.gug = 1.0f;
        this.gsh = 0.0f;
        this.guh = new ljq();
        this.gui = new ljq();
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dhb dhb2 = (dhb)dgj2;
        dhb2.gtL = this.gtL;
        dhb2.grQ = this.grQ;
        dhb2.gsf = this.gsf;
        dhb2.grZ = this.grZ;
        dhb2.gtM = this.gtM;
        dhb2.gtN = this.gtN;
        dhb2.gtO = this.gtO;
        dhb2.gtP = this.gtP;
        dhb2.gtQ = this.gtQ;
        dhb2.gtR = this.gtR;
        dhb2.gtS = this.gtS;
        dhb2.gtT = this.gtT;
        dhb2.gtU = this.gtU;
        dhb2.gtV = this.gtV;
        dhb2.gtW = this.gtW;
        dhb2.gtX = this.gtX;
        dhb2.gtY = this.gtY;
        dhb2.gtZ = this.gtZ;
        dhb2.bzb = this.bzb;
        dhb2.gsw = this.gsw;
        dhb2.gsx = this.gsx;
        dhb2.gsg = this.gsg;
        dhb2.gua = this.gua;
        dhb2.gub = this.gub;
        dhb2.guc = this.guc;
        dhb2.gud = this.gud;
        dhb2.gue = this.gue;
        dhb2.guf = this.guf;
        dhb2.gug = this.gug;
        dhb2.gsh = this.gsh;
        dhb2.guh = this.guh;
        dhb2.gui = this.gui;
    }

    private void createParticleShooters() {
        int n2 = this.gtQ + (int)((double)(this.gtR - this.gtQ) * Math.random());
        if (n2 <= 0) {
            n2 = 1;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            dfo dfo2 = null;
            dfo2 = (dfo)dKP.Af(14);
            dfo2.setGUID(this.getNewEffectGuid());
            lcq lcq2 = lcq.b(this.gtM, this.gtN);
            float f2 = this.getRandomFloatValue(this.gtW, this.gtX);
            ljq ljq2 = ljq.B(this.guh, this.gui);
            ljq2.es(this.getTargetPosition());
            dfo2.setActive(true);
            dfo2.setEndColor(lcq2);
            dfo2.setEndRotation(this.gsx);
            dfo2.setEndScale(f2);
            dfo2.setGravityInfluence(0.0f);
            dfo2.setNumParticles(1);
            dfo2.setNumTextures(this.grQ);
            dfo2.setParticleAcceleration(0.0f);
            dfo2.setParticleLifeTime(this.grZ);
            dfo2.setAnimationFrequency(this.gsf);
            dfo2.gr(0.0f);
            dfo2.bL(ljq2);
            dfo2.bQ(new ljq());
            dfo2.gs(0.0f);
            dfo2.setPullAcceleration(0.0f);
            dfo2.bR(new ljq());
            dfo2.setRotationTurbulencePercent(0.0f);
            dfo2.setScaleTurbulencePercent(0.0f);
            dfo2.setColorTurbulencePercent(0.0f);
            dfo2.setStartColor(lcq2);
            dfo2.setStartRotation(this.gsw);
            dfo2.setStartScale(f2);
            dfo2.setTextureName(this.gtL);
            dfo2.setWindInfluence(0.0f);
            dfo2.hQ(this.gsg);
            dfo2.gn(this.gsh);
            this.sendAtomOverideToChildren(dfo2);
            this.MessageDelegator.a(dfo2);
            dlb dlb2 = new dlb();
            dlb2.setGUID(this.getNewEffectGuid());
            dlb2.hC(dfo2.getGUID());
            dlb2.ac(this.getRandomFloatValue(this.gtS, this.gtT));
            dlb2.gT(this.getRandomFloatValue(this.gtY, this.gtZ));
            dlb2.dy(f2 * 0.25f);
            dlb2.setMaxVelocity(this.bzb);
            dlb2.ij(false);
            dlb2.bN(dfo2.blJ());
            dlb2.gS((float)this.getStartTime().rgz);
            dlb2.gV(this.getRandomFloatValue(this.gtU, this.gtV));
            dlb2.setUseCollision(this.gua);
            ljq ljq3 = ljq.B(this.gtO, this.gtP);
            ljq ljq4 = lgl.a(new lgl(ljq3), new ljq(0.0f, 1.0f, 0.0f));
            dlb2.setStartDirection(ljq4);
            this.MessageDelegator.a(dlb2);
            dfw dfw2 = null;
            if (this.gue) {
                dfw2 = this.createLight(dfo2.getGUID(), dfo2.blJ(), f2 * this.gug);
            }
            lil<dfo, dlb, Object> lil2 = new lil<dfo, dlb, Object>(dfo2, dlb2, dfw2);
            this.gtK.add(lil2);
            if (this.guk <= 0) continue;
            this.startGenericRelationEffect(this.guk, dfo2.blJ(), dfo2.getGUID());
        }
    }

    private dfw createLight(ldv ldv2, ljq ljq2, float f2) {
        dfw dfw2 = (dfw)dKP.Af(21);
        dfw2.setGUID(this.getNewEffectGuid());
        dfw2.setActive(true);
        dfw2.setDefaultValues();
        dfw2.setInnerColor(lcq.BRIGHT_WHITE);
        dfw2.setInnerIntensity(0.0f);
        dfw2.setInnerOn(false);
        dfw2.setInnerRadius(0.0f);
        dfw2.hX(true);
        dfw2.setOuterColorNumber(this.guf);
        dfw2.setOuterOn(true);
        dfw2.setOuterRadius(f2);
        dfw2.c(ljq2);
        dfw2.setTextureName("");
        this.MessageDelegator.a(dfw2);
        this.setupPositionalRelation(ldv2, dfw2.getGUID(), 2);
        return dfw2;
    }

    private void checkShooters() {
        Iterator iterator = this.gtK.iterator();
        while (iterator.hasNext()) {
            lil lil2 = (lil)iterator.next();
            assert (lil2 != null);
            dlb dlb2 = (dlb)lil2.reY;
            if (!dlb2.boB()) continue;
            dfo dfo2 = (dfo)lil2.reX;
            dfw dfw2 = (dfw)lil2.reZ;
            iterator.remove();
            if (this.guj > 0) {
                this.startGenericMainEffect(this.guj, dlb2.boK());
            }
            if (this.gud) {
                gmR.bJ(dlb2.boK());
            }
            dey.bls().b(dfo2);
            this.MessageDelegator.hd(dlb2.getGUID());
            if (dfw2 == null) continue;
            dey.bls().b(dfw2);
        }
    }

    private void removeAll() {
        for (lil lil2 : this.gtK) {
            assert (lil2 != null);
            dlb dlb2 = (dlb)lil2.reY;
            dfo dfo2 = (dfo)lil2.reX;
            dfw dfw2 = (dfw)lil2.reZ;
            dey.bls().b(dfo2);
            this.MessageDelegator.hd(dlb2.getGUID());
            if (dfw2 == null) continue;
            dey.bls().b(dfw2);
        }
        this.gtK.clear();
    }

    public float getAnimationFrequency() {
        return this.gsf;
    }

    public void setAnimationFrequency(float f2) {
        this.gsf = f2;
    }

    public boolean isDoSplatterOnImpact() {
        return this.gud;
    }

    public void setDoSplatterOnImpact(boolean bl) {
        this.gud = bl;
    }

    public float getEndRotation() {
        return this.gsx;
    }

    public void setEndRotation(float f2) {
        this.gsx = f2;
    }

    public String getImpactEffectName() {
        return this.gub;
    }

    public void setImpactEffectName(String string) {
        this.gub = string;
    }

    public int getLightNumber() {
        return this.guf;
    }

    public void setLightNumber(int n2) {
        this.guf = n2;
    }

    public float getLightRadiusMultiplier() {
        return this.gug;
    }

    public void setLightRadiusMultiplier(float f2) {
        this.gug = f2;
    }

    public lcq getMaxColor() {
        return this.gtN;
    }

    public void setMaxColor(lcq lcq2) {
        this.gtN = lcq2;
    }

    public float getMaxDebrisScale() {
        return this.gtX;
    }

    public void setMaxDebrisScale(float f2) {
        this.gtX = f2;
    }

    public float getMaxMass() {
        return this.gtV;
    }

    public void setMaxMass(float f2) {
        this.gtV = f2;
    }

    public float getMaxMaxTravel() {
        return this.gtZ;
    }

    public void setMaxMaxTravel(float f2) {
        this.gtZ = f2;
    }

    public int getMaxNumberOfDebris() {
        return this.gtR;
    }

    public void setMaxNumberOfDebris(int n2) {
        this.gtR = n2;
    }

    public ljq getMaxStartingAngle() {
        return this.gtP;
    }

    public void setMaxStartingAngle(ljq ljq2) {
        this.gtP = ljq2;
    }

    public float getMaxStartVelocity() {
        return this.gtT;
    }

    public void setMaxStartVelocity(float f2) {
        this.gtT = f2;
    }

    public ljq getMaxTargetOffset() {
        return this.gui;
    }

    public void setMaxTargetOffset(ljq ljq2) {
        this.gui = ljq2;
    }

    public float getMaxVelocity() {
        return this.bzb;
    }

    public void setMaxVelocity(float f2) {
        this.bzb = f2;
    }

    public lcq getMinColor() {
        return this.gtM;
    }

    public void setMinColor(lcq lcq2) {
        this.gtM = lcq2;
    }

    public float getMinDebrisScale() {
        return this.gtW;
    }

    public void setMinDebrisScale(float f2) {
        this.gtW = f2;
    }

    public float getMinMass() {
        return this.gtU;
    }

    public void setMinMass(float f2) {
        this.gtU = f2;
    }

    public float getMinMaxTravel() {
        return this.gtY;
    }

    public void setMinMaxTravel(float f2) {
        this.gtY = f2;
    }

    public int getMinNumberOfDebris() {
        return this.gtQ;
    }

    public void setMinNumberOfDebris(int n2) {
        this.gtQ = n2;
    }

    public ljq getMinStartingAngle() {
        return this.gtO;
    }

    public void setMinStartingAngle(ljq ljq2) {
        this.gtO = ljq2;
    }

    public float getMinStartVelocity() {
        return this.gtS;
    }

    public void setMinStartVelocity(float f2) {
        this.gtS = f2;
    }

    public ljq getMinTargetOffset() {
        return this.guh;
    }

    public void setMinTargetOffset(ljq ljq2) {
        this.guh = ljq2;
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

    public LinkedList getParticleShooterList() {
        return this.gtK;
    }

    public void setParticleShooterList(LinkedList linkedList) {
        this.gtK = linkedList;
    }

    public String getParticleTexture() {
        return this.gtL;
    }

    public void setParticleTexture(String string) {
        this.gtL = string;
    }

    public String getRelationEffectName() {
        return this.guc;
    }

    public void setRelationEffectName(String string) {
        this.guc = string;
    }

    public float getStartRotation() {
        return this.gsw;
    }

    public void setStartRotation(float f2) {
        this.gsw = f2;
    }

    public boolean isUseCollision() {
        return this.gua;
    }

    public void setUseCollision(boolean bl) {
        this.gua = bl;
    }

    public boolean isUseHDRLParticles() {
        return this.gsg;
    }

    public void setUseHDRLParticles(boolean bl) {
        this.gsg = bl;
    }

    public boolean isUseSphereLights() {
        return this.gue;
    }

    public void setUseSphereLights(boolean bl) {
        this.gue = bl;
    }

    public float getMotionBlurModifier() {
        return this.gsh;
    }

    public void setMotionBlurModifier(float f2) {
        this.gsh = f2;
    }

    public dey getAtom(int n2) {
        lil lil2 = (lil)this.gtK.get(n2);
        return (dfo)lil2.reX;
    }

    public int getAtomCount() {
        return this.gtK.size();
    }
}


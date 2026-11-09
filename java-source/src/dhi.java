/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class dhi
extends dgj {
    private LinkedList gtK = lcn.emA();
    private Vector<dfg> gvr = new Vector();
    private String gtL = null;
    private int grQ = 1;
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
    private float gvs = 0.0f;
    private float gvt = 0.0f;
    private float gvu = 0.0f;
    private float gvv = 0.0f;
    private float gsZ = 1.0f;
    private boolean gsg = false;
    private float gsh = 0.0f;
    private boolean gua = true;
    private String gub = null;
    private String guc = null;
    private boolean gud = false;
    private boolean gue = false;
    private int guf = 7;
    private float gug = 1.0f;
    private ljq guh = null;
    private ljq gui = null;
    private boolean gvw = false;
    private int guj = 0;
    private int guk = 0;
    private boolean gsH = false;

    dhi() {
        this.gqB = 47;
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
        this.gvs = 0.0f;
        this.gvt = 0.0f;
        this.gvu = 0.0f;
        this.gvv = 0.0f;
        this.gsg = false;
        this.gua = true;
        this.gsH = false;
        this.gub = "";
        this.guc = "";
        this.gud = false;
        this.gue = false;
        this.guf = 7;
        this.gug = 1.0f;
        this.guh = new ljq();
        this.gui = new ljq();
        this.gsZ = 1.0f;
        this.gvw = false;
        this.gsh = 0.0f;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dhi dhi2 = (dhi)dgj2;
        dhi2.gtL = this.gtL;
        dhi2.grQ = this.grQ;
        dhi2.grZ = this.grZ;
        dhi2.gtM = this.gtM;
        dhi2.gtN = this.gtN;
        dhi2.gtO = this.gtO;
        dhi2.gtP = this.gtP;
        dhi2.gtQ = this.gtQ;
        dhi2.gtR = this.gtR;
        dhi2.gtS = this.gtS;
        dhi2.gtT = this.gtT;
        dhi2.gtU = this.gtU;
        dhi2.gtV = this.gtV;
        dhi2.gtW = this.gtW;
        dhi2.gtX = this.gtX;
        dhi2.gtY = this.gtY;
        dhi2.gtZ = this.gtZ;
        dhi2.bzb = this.bzb;
        dhi2.gvs = this.gvs;
        dhi2.gvt = this.gvt;
        dhi2.gvu = this.gvu;
        dhi2.gvv = this.gvv;
        dhi2.gsg = this.gsg;
        dhi2.gua = this.gua;
        dhi2.gub = this.gub;
        dhi2.guc = this.guc;
        dhi2.gud = this.gud;
        dhi2.gue = this.gue;
        dhi2.guf = this.guf;
        dhi2.gug = this.gug;
        dhi2.guh = this.guh;
        dhi2.gui = this.gui;
        dhi2.gsH = this.gsH;
        dhi2.gsZ = this.gsZ;
        dhi2.gvw = this.gvw;
        dhi2.gsh = this.gsh;
    }

    private void createParticleShooters() {
        int n2 = this.gtQ + (int)((double)(this.gtR - this.gtQ) * Math.random());
        if (n2 <= 0) {
            n2 = 1;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            dfg dfg2 = null;
            dfg2 = (dfg)dKP.Af(25);
            dfg2.setGUID(this.getNewEffectGuid());
            lcq lcq2 = lcq.b(this.gtM, this.gtN);
            float f2 = this.getRandomFloatValue(this.gtW, this.gtX);
            ljq ljq2 = ljq.B(this.guh, this.gui);
            ljq2.es(this.getTargetPosition());
            float f3 = this.getRandomFloatValue(this.gvu, this.gvv);
            float f4 = this.getRandomFloatValue(this.gvs, this.gvt);
            dfg2.setActive(true);
            if (this.gvw) {
                dfg2.setEndColor(lcq2);
            } else {
                dfg2.setEndColor(this.gtM);
            }
            dfg2.setEndRotation(f3);
            dfg2.setEndScale(f2);
            dfg2.setNumTextures(this.grQ);
            dfg2.setParticleLifeTime(this.grZ);
            dfg2.bL(ljq2);
            if (this.gvw) {
                dfg2.setStartColor(lcq2);
            } else {
                dfg2.setStartColor(this.gtN);
            }
            dfg2.setStartRotation(f4);
            dfg2.setStartScale(f2);
            dfg2.setTextureName(this.gtL);
            dfg2.hQ(this.gsg);
            dfg2.setDepthModifier(this.gsZ);
            dfg2.gm((float)this.getStartTime().rgz);
            dfg2.gn(this.gsh);
            this.MessageDelegator.a(dfg2);
            this.gvr.add(dfg2);
            dlb dlb2 = new dlb();
            dlb2.setGUID(this.getNewEffectGuid());
            dlb2.hC(dfg2.getGUID());
            dlb2.ac(this.getRandomFloatValue(this.gtS, this.gtT));
            dlb2.gT(this.getRandomFloatValue(this.gtY, this.gtZ));
            dlb2.dy(f2 * 0.25f);
            dlb2.setMaxVelocity(this.bzb);
            dlb2.ij(false);
            dlb2.bN(dfg2.blJ());
            dlb2.gS((float)this.getStartTime().rgz);
            dlb2.gV(this.getRandomFloatValue(this.gtU, this.gtV));
            dlb2.setUseCollision(this.gua);
            ljq ljq3 = ljq.B(this.gtO, this.gtP);
            ljq ljq4 = lgl.a(new lgl(ljq3), new ljq(0.0f, 1.0f, 0.0f));
            dlb2.setStartDirection(ljq4);
            this.MessageDelegator.a(dlb2);
            dfw dfw2 = null;
            if (this.gue) {
                dfw2 = this.createLight(dfg2.getGUID(), dfg2.blJ(), f2 * this.gug);
            }
            lil<dfg, dlb, Object> lil2 = new lil<dfg, dlb, Object>(dfg2, dlb2, dfw2);
            this.gtK.add(lil2);
            if (this.guk <= 0) continue;
            this.startGenericRelationEffect(this.guk, dfg2.blJ(), dfg2.getGUID());
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
            dfg dfg2 = (dfg)lil2.reX;
            dfw dfw2 = (dfw)lil2.reZ;
            iterator.remove();
            if (this.guj > 0) {
                this.startGenericMainEffect(this.guj, dlb2.boK());
            }
            if (this.gud) {
                gmR.bJ(dlb2.boK());
            }
            dey.bls().b(dfg2);
            this.MessageDelegator.hd(dlb2.getGUID());
            if (dfw2 == null) continue;
            dey.bls().b(dfw2);
        }
    }

    private void removeAll() {
        for (lil lil2 : this.gtK) {
            assert (lil2 != null);
            dlb dlb2 = (dlb)lil2.reY;
            dfg dfg2 = (dfg)lil2.reX;
            dfw dfw2 = (dfw)lil2.reZ;
            dey.bls().b(dfg2);
            this.MessageDelegator.hd(dlb2.getGUID());
            if (dfw2 == null) continue;
            dey.bls().b(dfw2);
        }
        this.gtK.clear();
    }

    public boolean isDoSplatterOnImpact() {
        return this.gud;
    }

    public void setDoSplatterOnImpact(boolean bl) {
        this.gud = bl;
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

    public float getMaxEndRotation() {
        return this.gvv;
    }

    public void setMaxEndRotation(float f2) {
        this.gvv = f2;
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

    public float getMaxStartRotation() {
        return this.gvt;
    }

    public void setMaxStartRotation(float f2) {
        this.gvt = f2;
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

    public float getMinEndRotation() {
        return this.gvu;
    }

    public void setMinEndRotation(float f2) {
        this.gvu = f2;
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

    public float getMinStartRotation() {
        return this.gvs;
    }

    public void setMinStartRotation(float f2) {
        this.gvs = f2;
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

    public boolean isUsePower() {
        return this.gsH;
    }

    public void setUsePower(boolean bl) {
        this.gsH = bl;
    }

    public boolean isUseSphereLights() {
        return this.gue;
    }

    public void setUseSphereLights(boolean bl) {
        this.gue = bl;
    }

    public float getDepthModifier() {
        return this.gsZ;
    }

    public void setDepthModifier(float f2) {
        this.gsZ = f2;
    }

    public boolean isUseRandomColor() {
        return this.gvw;
    }

    public void setUseRandomColor(boolean bl) {
        this.gvw = bl;
    }

    public float getMotionBlurModifier() {
        return this.gsh;
    }

    public void setMotionBlurModifier(float f2) {
        this.gsh = f2;
    }

    public dey getAtom(int n2) {
        if (this.gvr == null) {
            return null;
        }
        return this.gvr.get(n2);
    }

    public int getAtomCount() {
        if (this.gvr == null) {
            return 0;
        }
        return this.gvr.size();
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dkl
extends dgj {
    dfu gDB = null;
    private int gDC;
    private int gDD;
    private boolean gDE;
    private boolean gDF;
    private boolean gDG;
    private boolean gDH;
    private float gDI;
    private float gDJ;
    private float gDK;
    private float gDL;
    private lcq gDM;
    private lcq gDN;
    private lcq gDO;
    private ljq gDP;
    private ljq gDQ;
    private ljp gDR;
    private ljp gDS;
    private ljp gDT;
    private ljp gDU;
    private ljp gDV;
    private int gDW;
    private String gDX;
    private String gDY;
    private boolean gpf;
    private float gtt = 1.0f;
    private boolean gDZ = true;
    dkx gyZ = null;
    private int gzt = 0;

    public dkl() {
        this.gqB = 57;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeRenderBox();
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.createRenderBox();
        this.gzt = this.MessageDelegator.arc().lpr;
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        if (this.isRelationEffect() && this.gyZ == null && this.nx.lpr > this.gzt + 2) {
            this.gyZ = this.setupPositionalRelation(this.getTargetObjectGUID(), this.gDB.getGUID(), this.getMainEffectObjectType());
        }
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dkl dkl2 = (dkl)dgj2;
        dkl2.gDC = this.gDC;
        dkl2.gDD = this.gDD;
        dkl2.gDE = this.gDE;
        dkl2.gDF = this.gDF;
        dkl2.gDG = this.gDG;
        dkl2.gDH = this.gDH;
        dkl2.gDI = this.gDI;
        dkl2.gDJ = this.gDJ;
        dkl2.gDK = this.gDK;
        dkl2.gDL = this.gDK;
        dkl2.gDM = this.gDM;
        dkl2.gDN = this.gDN;
        dkl2.gDO = this.gDO;
        dkl2.gDP = this.gDP;
        dkl2.gDQ = this.gDQ;
        dkl2.gDR = this.gDR;
        dkl2.gDS = this.gDS;
        dkl2.gDT = this.gDT;
        dkl2.gDU = this.gDU;
        dkl2.gDV = this.gDV;
        dkl2.gDW = this.gDW;
        dkl2.gDX = this.gDX;
        dkl2.gDY = this.gDY;
        dkl2.gpf = this.gpf;
        dkl2.gtt = this.gtt;
        dkl2.gDZ = this.gDZ;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gDC = 100;
        this.gDD = 10;
        this.gDE = false;
        this.gDF = false;
        this.gDG = true;
        this.gDH = false;
        this.gDI = 0.5f;
        this.gDJ = 3.0f;
        this.gDK = 0.1f;
        this.gDL = 1.0f;
        this.gDM = lcq.BRIGHT_WHITE;
        this.gDN = lcq.BRIGHT_WHITE;
        this.gDO = lcq.BRIGHT_WHITE_TRANSPARENT;
        this.gDP = new ljq(0.0f, -1.0f, 0.0f);
        this.gDQ = new ljq(20.0f, 30.0f, 20.0f);
        this.gDR = new ljp(1.0f, 4.0f);
        this.gDS = new ljp(0.1f, 0.25f);
        this.gDT = new ljp(0.0f, -5.0f);
        this.gDU = new ljp(0.1f, 0.1f);
        this.gDV = new ljp(0.3f, 0.3f);
        this.gDW = 0;
        this.gDX = "";
        this.gDY = "";
        this.gpf = false;
        this.gtt = 1.0f;
        this.gDZ = true;
    }

    private void createRenderBox() {
        this.gDB = (dfu)dKP.Af(23);
        this.gDB.setGUID(this.getMainAtomGuid());
        this.gDB.setActive(true);
        this.gDB.setNumberOfRays(this.gDC);
        this.gDB.setNumParticlesPerLine(this.gDD);
        this.gDB.setUseImpact(this.gDE);
        this.gDB.setUseWindInfluence(this.gDF);
        this.gDB.setUpdateAllLinesEveryFrame(this.gDG);
        this.gDB.setUseCollisionTest(this.gDH);
        this.gDB.setMaxWindLerp(this.gDI);
        this.gDB.setImpactLifeTime(this.gDJ);
        this.gDB.setMaxParticleSwingFrequency(this.gDL);
        this.gDB.setMaxParticleSwingRadius(this.gDK);
        this.gDB.setMainColor(this.gDM);
        this.gDB.setImpactStartColor(this.gDN);
        this.gDB.setImpactEndColor(this.gDO);
        this.gDB.setStartingDirection(this.gDP);
        this.gDB.setTextureRepeat(this.gDR);
        this.gDB.setTextureScale(this.gDS);
        this.gDB.setTextureScrollSpeed(this.gDT);
        this.gDB.setImpactTextureStartScale(this.gDU);
        this.gDB.setImpactTextureEndScale(this.gDV);
        this.gDB.setRenderBoxUsageType(this.gDW);
        this.gDB.setMainTexture(this.gDX);
        this.gDB.setImpactTexture(this.gDY);
        this.gDB.setAttachToCamera(this.gpf);
        if (this.gDZ) {
            ljq ljq2 = new ljq(this.getTargetPosition());
            ljq2.y -= this.gDQ.y;
            ljq ljq3 = new ljq(this.gDQ);
            ljq3.y *= 2.0f;
            this.gDB.setOffsetValues(ljq3);
            this.gDB.c(ljq2);
        } else {
            this.gDB.setOffsetValues(this.gDQ);
            this.gDB.c(this.getTargetPosition());
        }
        this.MessageDelegator.a(this.gDB);
    }

    private void removeRenderBox() {
        if (this.gDB != null) {
            dey.bls().b(this.gDB);
            this.gDB = null;
        }
    }

    public boolean isAttachToCamera() {
        return this.gpf;
    }

    public void setAttachToCamera(boolean bl) {
        this.gpf = bl;
    }

    public float getFadeOutPercentTime() {
        return this.gtt;
    }

    public void setFadeOutPercentTime(float f) {
        this.gtt = f;
    }

    public lcq getImpactEndColor() {
        return this.gDO;
    }

    public void setImpactEndColor(lcq lcq2) {
        this.gDO = lcq2;
    }

    public float getImpactLifeTime() {
        return this.gDJ;
    }

    public void setImpactLifeTime(float f) {
        this.gDJ = f;
    }

    public lcq getImpactStartColor() {
        return this.gDN;
    }

    public void setImpactStartColor(lcq lcq2) {
        this.gDN = lcq2;
    }

    public String getImpactTexture() {
        return this.gDY;
    }

    public void setImpactTexture(String string) {
        this.gDY = string;
    }

    public ljp getImpactTextureEndScale() {
        return this.gDV;
    }

    public void setImpactTextureEndScale(ljp ljp2) {
        this.gDV = ljp2;
    }

    public ljp getImpactTextureStartScale() {
        return this.gDU;
    }

    public void setImpactTextureStartScale(ljp ljp2) {
        this.gDU = ljp2;
    }

    public lcq getMainColor() {
        return this.gDM;
    }

    public void setMainColor(lcq lcq2) {
        this.gDM = lcq2;
    }

    public String getMainTexture() {
        return this.gDX;
    }

    public void setMainTexture(String string) {
        this.gDX = string;
    }

    public float getMaxParticleSwingFrequency() {
        return this.gDL;
    }

    public void setMaxParticleSwingFrequency(float f) {
        this.gDL = f;
    }

    public float getMaxParticleSwingRadius() {
        return this.gDK;
    }

    public void setMaxParticleSwingRadius(float f) {
        this.gDK = f;
    }

    public float getMaxWindLerp() {
        return this.gDI;
    }

    public void setMaxWindLerp(float f) {
        this.gDI = f;
    }

    public int getNumberOfRays() {
        return this.gDC;
    }

    public void setNumberOfRays(int n) {
        this.gDC = n;
    }

    public int getNumParticlesPerLine() {
        return this.gDD;
    }

    public void setNumParticlesPerLine(int n) {
        this.gDD = n;
    }

    public ljq getOffsetValues() {
        return this.gDQ;
    }

    public void setOffsetValues(ljq ljq2) {
        this.gDQ = ljq2;
    }

    public int getRenderBoxUsageType() {
        return this.gDW;
    }

    public void setRenderBoxUsageType(int n) {
        this.gDW = n;
    }

    public ljq getStartingDirection() {
        return this.gDP;
    }

    public void setStartingDirection(ljq ljq2) {
        this.gDP = ljq2;
    }

    public ljp getTextureRepeat() {
        return this.gDR;
    }

    public void setTextureRepeat(ljp ljp2) {
        this.gDR = ljp2;
    }

    public ljp getTextureScale() {
        return this.gDS;
    }

    public void setTextureScale(ljp ljp2) {
        this.gDS = ljp2;
    }

    public ljp getTextureScrollSpeed() {
        return this.gDT;
    }

    public void setTextureScrollSpeed(ljp ljp2) {
        this.gDT = ljp2;
    }

    public boolean isUpdateAllLinesEveryFrame() {
        return this.gDG;
    }

    public void setUpdateAllLinesEveryFrame(boolean bl) {
        this.gDG = bl;
    }

    public boolean isUseCollisionTest() {
        return this.gDH;
    }

    public void setUseCollisionTest(boolean bl) {
        this.gDH = bl;
    }

    public boolean isUseImpact() {
        return this.gDE;
    }

    public void setUseImpact(boolean bl) {
        this.gDE = bl;
    }

    public boolean isUseWindInfluence() {
        return this.gDF;
    }

    public void setUseWindInfluence(boolean bl) {
        this.gDF = bl;
    }

    public boolean isTreatOffsetAsRadius() {
        return this.gDZ;
    }

    public void setTreatOffsetAsRadius(boolean bl) {
        this.gDZ = bl;
    }
}


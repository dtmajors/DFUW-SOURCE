/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class dfu
extends dey {
    klc gpe = null;
    private boolean gpf = true;
    private int dcq = 0;
    private ldv gpg;
    private ldv gph;

    public dfu() {
        this.gnv = 23;
        assert (gnw != null);
        this.gpe = (klc)gnw.h(1038);
        this.setDefaultValues();
    }

    @Override
    public void setDefaultValues() {
        super.setDefaultValues();
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            this.gph = this.MessageDelegator.bzv();
            this.createRenderBox();
            if (this.gpf) {
                this.bmX();
            }
        }
        super.initialize();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.dcq == 0) {
            return;
        }
        this.updateObject();
    }

    private void updateObject() {
        if (this.dcq == 0) {
            return;
        }
        this.gpe.YL(this.dcq);
        this.dcq = 0;
    }

    @Override
    public String toString() {
        return "Renderbox Atom";
    }

    private void createRenderBox() {
        this.gpe.lQ(false);
        this.gpe.wD(false);
        this.gpe.jM(false);
        this.gpe.hC(this.gph);
        this.gpe.ts(this.GUID);
        this.gpe.YL(1);
        this.MessageDelegator.a(this.gpe);
        this.dcq = 0;
    }

    private void bmX() {
        if (this.gpg != null) {
            return;
        }
        this.gpg = this.MessageDelegator.bzv();
        knf knf2 = (knf)this.MessageDelegator.h(781);
        knf2.Zp(1);
        knf2.jM(false);
        knf2.wD(false);
        knf2.kX(this.gpg);
        knf2.qk(this.gph);
        knf2.qj(lcr.rg);
        knf2.setDeltaPos(new ljq(0.0f, 0.0f, 0.0f));
        knf2.setDeltaRot(new lgl(0.0f, 0.0f, 0.0f, 1.0f));
        knf2.ts(this.GUID);
        this.MessageDelegator.a(knf2);
    }

    private void bmY() {
        if (this.gpg == null) {
            return;
        }
        knf knf2 = (knf)this.MessageDelegator.h(781);
        knf2.Zp(2);
        knf2.jM(false);
        knf2.wD(false);
        knf2.kX(this.gpg);
        knf2.qk(this.gph);
        knf2.qj(lcr.rg);
        knf2.setDeltaPos(new ljq(0.0f, 0.0f, 0.0f));
        knf2.setDeltaRot(new lgl(0.0f, 0.0f, 0.0f, 1.0f));
        knf2.ts(this.GUID);
        this.MessageDelegator.a(knf2);
        this.MessageDelegator.oa(this.gpg);
        this.gpg = null;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (this.Initialized) {
            this.bmY();
            this.apM();
        }
    }

    protected void apM() {
        klb klb2 = (klb)this.MessageDelegator.h(1026);
        klb2.ts(this.GUID);
        klb2.HX(klb.iHB);
        klb2.hC(this.gph);
        this.MessageDelegator.a(klb2);
        this.MessageDelegator.oa(this.gph);
        this.gph = null;
    }

    public lcq getImpactEndColor() {
        return this.gpe.getImpactEndColor();
    }

    public void setImpactEndColor(lcq lcq2) {
        this.gpe.setImpactEndColor(lcq2);
        this.dcq |= 8;
    }

    public float getImpactLifeTime() {
        return this.gpe.getImpactLifeTime();
    }

    public void setImpactLifeTime(float f2) {
        this.gpe.setImpactLifeTime(f2);
        this.dcq |= 0x4000;
    }

    public lcq getImpactStartColor() {
        return this.gpe.getImpactStartColor();
    }

    public void setImpactStartColor(lcq lcq2) {
        this.gpe.setImpactStartColor(lcq2);
        this.dcq |= 4;
    }

    public String getImpactTexture() {
        return this.gpe.getImpactTexture();
    }

    public void setImpactTexture(String string) {
        this.gpe.setImpactTexture(string);
    }

    public ljp getImpactTextureEndScale() {
        return this.gpe.getImpactTextureEndScale();
    }

    public void setImpactTextureEndScale(ljp ljp2) {
        this.gpe.setImpactTextureEndScale(ljp2);
        this.dcq |= 0x400;
    }

    public ljp getImpactTextureStartScale() {
        return this.gpe.getImpactTextureStartScale();
    }

    public void setImpactTextureStartScale(ljp ljp2) {
        this.gpe.setImpactTextureStartScale(ljp2);
        this.dcq |= 0x200;
    }

    public lcq getMainColor() {
        return this.gpe.getMainColor();
    }

    public void setMainColor(lcq lcq2) {
        this.gpe.setMainColor(lcq2);
        this.dcq |= 2;
    }

    public String getMainTexture() {
        return this.gpe.getMainTexture();
    }

    public void setMainTexture(String string) {
        this.gpe.setMainTexture(string);
    }

    public float getMaxParticleSwingFrequency() {
        return this.gpe.getMaxParticleSwingFrequency();
    }

    public void setMaxParticleSwingFrequency(float f2) {
        this.gpe.setMaxParticleSwingFrequency(f2);
        this.dcq |= 0x10000;
    }

    public float getMaxParticleSwingRadius() {
        return this.gpe.getMaxParticleSwingRadius();
    }

    public void setMaxParticleSwingRadius(float f2) {
        this.gpe.setMaxParticleSwingRadius(f2);
        this.dcq |= 0x8000;
    }

    public float getMaxWindLerp() {
        return this.gpe.getMaxWindLerp();
    }

    public void setMaxWindLerp(float f2) {
        this.gpe.setMaxWindLerp(f2);
        this.dcq |= 0x2000;
    }

    public int getNumberOfRays() {
        return this.gpe.getNumberOfRays();
    }

    public void setNumberOfRays(int n2) {
        this.gpe.setNumberOfRays(n2);
        this.dcq |= 0x10;
    }

    public int getNumParticlesPerLine() {
        return this.gpe.getNumParticlesPerLine();
    }

    public void setNumParticlesPerLine(int n2) {
        this.gpe.setNumParticlesPerLine(n2);
        this.dcq |= 0x20;
    }

    public ljq getOffsetValues() {
        return this.gpe.getOffsetValues();
    }

    public void setOffsetValues(ljq ljq2) {
        this.gpe.setOffsetValues(ljq2);
        this.dcq |= 0x800;
    }

    public ljq av() {
        return this.gpe.av();
    }

    public void c(ljq ljq2) {
        this.gpe.c(ljq2);
    }

    public int getRenderBoxUsageType() {
        return this.gpe.ecA();
    }

    public void setRenderBoxUsageType(int n2) {
        this.gpe.YM(n2);
    }

    public ljq getStartingDirection() {
        return this.gpe.getStartingDirection();
    }

    public void setStartingDirection(ljq ljq2) {
        this.gpe.setStartingDirection(ljq2);
        this.dcq |= 0x1000;
    }

    public ljp getTextureRepeat() {
        return this.gpe.getTextureRepeat();
    }

    public void setTextureRepeat(ljp ljp2) {
        this.gpe.setTextureRepeat(ljp2);
        this.dcq |= 0x40;
    }

    public ljp getTextureScale() {
        return this.gpe.getTextureScale();
    }

    public void setTextureScale(ljp ljp2) {
        this.gpe.setTextureScale(ljp2);
        this.dcq |= 0x80;
    }

    public ljp getTextureScrollSpeed() {
        return this.gpe.getTextureScrollSpeed();
    }

    public void setTextureScrollSpeed(ljp ljp2) {
        this.gpe.setTextureScrollSpeed(ljp2);
        this.dcq |= 0x100;
    }

    public boolean isUpdateAllLinesEveryFrame() {
        return this.gpe.isUpdateAllLinesEveryFrame();
    }

    public void setUpdateAllLinesEveryFrame(boolean bl) {
        this.gpe.setUpdateAllLinesEveryFrame(bl);
        this.dcq |= 0x80000;
    }

    public boolean isUseCollisionTest() {
        return this.gpe.isUseCollisionTest();
    }

    public void setUseCollisionTest(boolean bl) {
        this.gpe.setUseCollisionTest(bl);
        this.dcq |= 0x100000;
    }

    public boolean isUseImpact() {
        return this.gpe.isUseImpact();
    }

    public void setUseImpact(boolean bl) {
        this.gpe.setUseImpact(bl);
        this.dcq |= 0x20000;
    }

    public boolean isUseWindInfluence() {
        return this.gpe.isUseWindInfluence();
    }

    public void setUseWindInfluence(boolean bl) {
        this.gpe.setUseWindInfluence(bl);
        this.dcq |= 0x40000;
    }

    public boolean isAttachToCamera() {
        return this.gpf;
    }

    public void setAttachToCamera(boolean bl) {
        this.gpf = bl;
    }

    public ldv bmZ() {
        return this.gph;
    }

    public void hW(boolean bl) {
        this.gpe.hW(bl);
    }

    public void gv(float f2) {
        this.gpe.gv(f2);
    }

    public void gw(float f2) {
        this.gpe.gw(f2);
    }

    public void gx(float f2) {
        this.gpe.gx(f2);
    }
}


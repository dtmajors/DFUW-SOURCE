/*
 * Decompiled with CFR.
 */
public class dfo
extends dey {
    private static final int gnO = 1;
    private static final int gnP = 2;
    private static final int gnQ = 4;
    private static final int gnR = 8;
    private int gnS = 0;
    private int gnT = 0;
    private int gnU = 0;
    private int gnV = 0;
    private int gnW = 0;
    private int gnX = 0;
    private int gnY = 0;
    private int gnZ = 0;
    private int goa = 0;
    klr goS = null;
    private int dcq = 0;
    private double goT;
    private double goU;

    dfo() {
        this.gnv = 14;
        assert (gnw != null);
        this.goS = (klr)gnw.h(2563);
        this.gnx = false;
        this.gny = false;
    }

    @Override
    public void setDefaultValues() {
        super.setDefaultValues();
    }

    @Override
    public void doTick(ldz ldz2) {
        this.updateObject();
        this.blN();
    }

    public String getTextureName() {
        return this.goS.getTextureName();
    }

    public void setTextureName(String string) {
        this.goS.setTextureName(string);
    }

    public ljq blJ() {
        return this.goS.blJ();
    }

    public void bL(ljq ljq2) {
        this.goS.bL(ljq2);
        this.dcq |= 4;
    }

    public float getParticleLifeTime() {
        return this.goS.getParticleLifeTime();
    }

    public void setParticleLifeTime(float f2) {
        this.goS.setParticleLifeTime(f2);
        this.dcq |= 8;
    }

    public float bmw() {
        return this.goS.bmw();
    }

    public void gr(float f2) {
        this.goS.gr(f2);
        this.dcq |= 0x10;
    }

    public float getParticleAcceleration() {
        return this.goS.getParticleAcceleration();
    }

    public void setParticleAcceleration(float f2) {
        this.goS.setParticleAcceleration(f2);
        this.dcq |= 0x20;
    }

    public float bmx() {
        return this.goS.bmx();
    }

    public void gs(float f2) {
        this.goS.gs(f2);
        this.dcq |= 0x40;
    }

    public ljq bmy() {
        return this.goS.bmy();
    }

    public void bQ(ljq ljq2) {
        this.goS.bQ(ljq2);
        this.dcq |= 0x80;
    }

    public ljq bmz() {
        return this.goS.bmz();
    }

    public void bR(ljq ljq2) {
        this.goS.bR(ljq2);
        this.dcq |= 0x100;
    }

    public float getPullAcceleration() {
        return this.goS.getPullAcceleration();
    }

    public void setPullAcceleration(float f2) {
        this.goS.setPullAcceleration(f2);
        this.dcq |= 0x200;
    }

    public float getGravityInfluence() {
        return this.goS.getGravityInfluence();
    }

    public void setGravityInfluence(float f2) {
        this.goS.setGravityInfluence(f2);
        this.dcq |= 0x400;
    }

    public float getWindInfluence() {
        return this.goS.getWindInfluence();
    }

    public void setWindInfluence(float f2) {
        this.goS.setWindInfluence(f2);
        this.dcq |= 0x800;
    }

    public int getNumTextures() {
        return this.goS.getNumTextures();
    }

    public void setNumTextures(int n2) {
        this.goS.setNumTextures(n2);
        this.dcq |= 0x1000;
    }

    public float getStartScale() {
        return this.goS.getStartScale();
    }

    public void setStartScale(float f2) {
        this.goS.setStartScale(f2);
        this.dcq |= 0x2000;
    }

    public float getEndScale() {
        return this.goS.getEndScale();
    }

    public void setEndScale(float f2) {
        this.goS.setEndScale(f2);
        this.dcq |= 0x4000;
    }

    public float getStartRotation() {
        return this.goS.getStartRotation();
    }

    public void setStartRotation(float f2) {
        this.goS.setStartRotation(f2);
        this.dcq |= 0x8000;
    }

    public float getEndRotation() {
        return this.goS.getEndRotation();
    }

    public void setEndRotation(float f2) {
        this.goS.setEndRotation(f2);
        this.dcq |= 0x10000;
    }

    public lcq getStartColor() {
        return this.goS.getStartColor();
    }

    public void setStartColor(lcq lcq2) {
        this.goS.setStartColor(lcq2);
        this.dcq |= 0x20000;
    }

    public lcq getEndColor() {
        return this.goS.getEndColor();
    }

    public void setEndColor(lcq lcq2) {
        this.goS.setEndColor(lcq2);
        this.dcq |= 0x40000;
    }

    public float getScaleTurbulencePercent() {
        return this.goS.getScaleTurbulencePercent();
    }

    public void setScaleTurbulencePercent(float f2) {
        this.goS.setScaleTurbulencePercent(f2);
        this.dcq |= 0x80000;
    }

    public float getRotationTurbulencePercent() {
        return this.goS.getRotationTurbulencePercent();
    }

    public void setRotationTurbulencePercent(float f2) {
        this.goS.setRotationTurbulencePercent(f2);
        this.dcq |= 0x100000;
    }

    public float getColorTurbulencePercent() {
        return this.goS.getColorTurbulencePercent();
    }

    public void setColorTurbulencePercent(float f2) {
        this.goS.setColorTurbulencePercent(f2);
        this.dcq |= 0x200000;
    }

    public int getNumParticles() {
        return this.goS.getNumParticles();
    }

    public void setNumParticles(int n2) {
        this.goS.setNumParticles(n2);
        this.dcq |= 0x400000;
    }

    public float getAnimationFrequency() {
        return this.goS.getAnimationFrequency();
    }

    public void setAnimationFrequency(float f2) {
        this.goS.setAnimationFrequency(f2);
        this.dcq |= 0x800000;
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            this.bmA();
            this.Initialized = true;
        }
    }

    @Override
    public void cleanUp() {
        if (!this.CleanedUp) {
            super.cleanUp();
            if (this.Initialized) {
                this.blI();
            }
            this.CleanedUp = true;
        }
    }

    private void bmA() {
        this.goS.ts(this.GUID);
        this.goS.pV(this.GUID);
        this.goS.lQ(false);
        this.goS.wD(false);
        this.goS.jM(false);
        this.goS.YY(1);
        this.dcq = 0;
        klr klr2 = (klr)gnw.h(2563);
        klr2.a(this.goS);
        klr2.wD(true);
        this.MessageDelegator.a(klr2);
    }

    @Override
    public void receiveResourceResponse(ktf ktf2) {
        super.receiveResourceResponse(ktf2);
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 5888) {
            this.gnx = true;
            kvc kvc2 = (kvc)ktv2;
            if (kvc2.getResult() == 0) {
                this.gny = true;
            }
        } else {
            super.receiveResponse(ktv2);
        }
    }

    private void updateObject() {
        if (this.dcq == 0) {
            return;
        }
        assert ((this.dcq & 2) == 0);
        this.goS.YY(this.dcq);
        this.MessageDelegator.a(this.goS);
        this.dcq = 0;
    }

    protected final void blI() {
        if (!this.gny) {
            return;
        }
        klr klr2 = (klr)gnw.h(2563);
        klr2.ts(this.GUID);
        klr2.pV(this.GUID);
        klr2.lQ(false);
        klr2.wD(false);
        klr2.jM(false);
        klr2.YY(2);
        this.MessageDelegator.a(klr2);
        this.dcq = 0;
    }

    public double bmB() {
        return this.goT;
    }

    public void bL(double d2) {
        this.goT = d2;
    }

    public double bmC() {
        return this.goU;
    }

    public void bM(double d2) {
        this.goU = d2;
    }

    public boolean blK() {
        return this.goS.blK();
    }

    public void hQ(boolean bl) {
        this.goS.hQ(bl);
        this.dcq |= 0x1000000;
    }

    public float blM() {
        return this.goS.blM();
    }

    public void gn(float f2) {
        this.goS.gn(f2);
    }

    public void setScaleY(float f2) {
        this.goS.setScaleY(f2);
    }

    public float getScaleY() {
        return this.goS.getScaleY();
    }

    public void bJ(int n2, int n3) {
        if (n2 == 0) {
            return;
        }
        this.gnS = n2;
        this.gnW = n3;
        this.goa |= 1;
    }

    public void bK(int n2, int n3) {
        if (n2 == 0) {
            return;
        }
        this.gnT = n2;
        this.gnX = n3;
        this.goa |= 2;
    }

    public void bL(int n2, int n3) {
        if (n2 == 0) {
            return;
        }
        this.gnU = n2;
        this.gnY = n3;
        this.goa |= 4;
    }

    public void bM(int n2, int n3) {
        if (n2 == 0) {
            return;
        }
        this.gnV = n2;
        this.gnZ = n3;
        this.goa |= 8;
    }

    private void blN() {
        if (this.goa == 0) {
            return;
        }
        kps kps2 = (kps)gnw.h(3589);
        kps2.wD(false);
        kps2.jM(false);
        kps2.ts(this.GUID);
        kps2.hC(this.GUID);
        if ((this.goa & 1) != 0) {
            kps2.bJ(this.gnS, this.gnW);
            kps2.aam(kps2.efu() | 0x100);
        }
        if ((this.goa & 2) != 0) {
            kps2.bJ(this.gnT, this.gnX);
            kps2.aam(kps2.efu() | 0x200);
        }
        if ((this.goa & 4) != 0) {
            kps2.bJ(this.gnU, this.gnY);
            kps2.aam(kps2.efu() | 0x400);
        }
        if ((this.goa & 8) != 0) {
            kps2.bJ(this.gnV, this.gnZ);
            kps2.aam(kps2.efu() | 0x800);
        }
        this.MessageDelegator.a(kps2);
        this.goa = 0;
    }
}


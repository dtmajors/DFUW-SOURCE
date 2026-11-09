/*
 * Decompiled with CFR.
 */
public class dfg
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
    private klo gob = null;
    private int dcq = 0;

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

    dfg() {
        this.gnv = 25;
        this.gob = (klo)gnw.h(2564);
        this.gnx = false;
        this.gny = false;
    }

    @Override
    public void setDefaultValues() {
        super.setDefaultValues();
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.updateObject();
        this.blN();
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            this.blH();
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

    @Override
    public void receiveResourceResponse(ktf ktf2) {
        super.receiveResourceResponse(ktf2);
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 5888) {
            kvc kvc2 = (kvc)ktv2;
            this.gnx = true;
            if (kvc2.getResult() == 0) {
                this.gny = true;
            }
        } else {
            super.receiveResponse(ktv2);
        }
    }

    private void blH() {
        this.gob.ts(this.GUID);
        this.gob.lQ(false);
        this.gob.wD(false);
        this.gob.jM(false);
        this.gob.pV(this.GUID);
        this.gob.YW(1);
        this.dcq = 0;
        klo klo2 = (klo)gnw.h(2564);
        klo2.a(this.gob);
        klo2.wD(true);
        this.MessageDelegator.a(klo2);
    }

    private void updateObject() {
        if (this.dcq == 0) {
            return;
        }
        assert ((this.dcq & 2) == 0);
        this.gob.YW(this.dcq);
        this.MessageDelegator.a(this.gob);
        this.dcq = 0;
    }

    protected final void blI() {
        if (!this.gny) {
            return;
        }
        klo klo2 = (klo)gnw.h(2564);
        klo2.YW(2);
        klo2.ts(this.GUID);
        klo2.lQ(false);
        klo2.wD(false);
        klo2.jM(false);
        klo2.pV(this.GUID);
        this.MessageDelegator.a(klo2);
        this.dcq = 0;
    }

    public lcq getEndColor() {
        return this.gob.getEndColor();
    }

    public void setEndColor(lcq lcq2) {
        this.gob.setEndColor(lcq2);
        this.dcq |= 0x400;
    }

    public float getEndRotation() {
        return this.gob.getEndRotation();
    }

    public void setEndRotation(float f2) {
        this.gob.setEndRotation(f2);
        this.dcq |= 0x100;
    }

    public float getEndScale() {
        return this.gob.getEndScale();
    }

    public void setEndScale(float f2) {
        this.gob.setEndScale(f2);
        this.dcq |= 0x40;
    }

    public int getNumTextures() {
        return this.gob.getNumTextures();
    }

    public void setNumTextures(int n2) {
        this.gob.setNumTextures(n2);
        this.dcq |= 0x10;
    }

    public float getParticleLifeTime() {
        return this.gob.getParticleLifeTime();
    }

    public void setParticleLifeTime(float f2) {
        this.gob.setParticleLifeTime(f2);
        this.dcq |= 8;
    }

    public ljq blJ() {
        return this.gob.blJ();
    }

    public void bL(ljq ljq2) {
        this.gob.bL(ljq2);
        this.dcq |= 4;
    }

    public lcq getStartColor() {
        return this.gob.getStartColor();
    }

    public void setStartColor(lcq lcq2) {
        this.gob.setStartColor(lcq2);
        this.dcq |= 0x200;
    }

    public float getStartRotation() {
        return this.gob.getStartRotation();
    }

    public void setStartRotation(float f2) {
        this.gob.setStartRotation(f2);
        this.dcq |= 0x80;
    }

    public float getStartScale() {
        return this.gob.getStartScale();
    }

    public void setStartScale(float f2) {
        this.gob.setStartScale(f2);
        this.dcq |= 0x20;
    }

    public String getTextureName() {
        return this.gob.getTextureName();
    }

    public void setTextureName(String string) {
        this.gob.setTextureName(string);
    }

    public boolean blK() {
        return this.gob.blK();
    }

    public void hQ(boolean bl) {
        this.gob.hQ(bl);
        this.dcq |= 0x800;
    }

    public float blL() {
        return this.gob.getStartTime();
    }

    public void gm(float f2) {
        this.gob.setStartTime(f2);
        this.dcq |= 0x1000;
    }

    public float getDepthModifier() {
        return this.gob.getDepthModifier();
    }

    public void setDepthModifier(float f2) {
        this.gob.setDepthModifier(f2);
        this.dcq |= 0x2000;
    }

    public void gn(float f2) {
        this.gob.gn(f2);
        this.dcq |= 0x4000;
    }

    public float blM() {
        return this.gob.blM();
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


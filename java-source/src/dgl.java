/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 *  lcw
 */
public class dgl
extends dgj {
    private dfr grb = null;
    private lcq eoo = null;
    private lcq eop = null;
    private String fFC = null;
    private int grn = 512;
    private int gro = 256;
    private float grp = 0.1f;
    private float grq = 1.0f;
    private int gri = 2;
    private float grr = 0.1f;
    private float grd = 0.9f;
    private boolean grs = false;
    private boolean grt = false;
    private int gru = 10;
    private int grv = 10;
    private float grw = 0.0f;
    private float grx = 0.0f;

    dgl() {
        this.gqB = 87;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeSprite();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.checkSprite();
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.createSprite();
    }

    protected int getMainEffectObjectType() {
        return 6;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dgl dgl2 = (dgl)dgj2;
        dgl2.eoo = this.eoo;
        dgl2.eop = this.eop;
        dgl2.fFC = this.fFC;
        dgl2.grn = this.grn;
        dgl2.gro = this.gro;
        dgl2.grp = this.grp;
        dgl2.grq = this.grq;
        dgl2.gri = this.gri;
        dgl2.grr = this.grr;
        dgl2.grd = this.grd;
        dgl2.grs = this.grs;
        dgl2.grt = this.grt;
        dgl2.gru = this.gru;
        dgl2.grv = this.grv;
        dgl2.grw = this.grw;
        dgl2.grx = this.grx;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.eoo = lcq.BRIGHT_WHITE_TRANSPARENT;
        this.eop = lcq.BRIGHT_WHITE;
        this.fFC = null;
        this.grn = 512;
        this.gro = 256;
        this.grp = 0.1f;
        this.grq = 1.0f;
        this.gri = 2;
        this.grr = 0.1f;
        this.grd = 0.9f;
        this.grs = false;
        this.grt = false;
        this.gru = 10;
        this.grv = 10;
        this.grw = 0.0f;
        this.grx = 0.0f;
    }

    private ljp getScalingFromPercent(float f2) {
        float f3 = f2;
        float f4 = f2;
        return new ljp(f3, f4);
    }

    private ljp getTranslationFromScale(ljp ljp2) {
        float f2 = (float)lcw.qFT / 2.0f;
        float f3 = (float)lcw.qFU / 2.0f;
        return new ljp((f2 -= ljp2.x * (float)(this.grn / 2)) + this.grw, (f3 -= ljp2.y * (float)(this.gro / 2)) + this.grx);
    }

    private ljp getStartScaling() {
        if (this.grr <= 0.0f) {
            return this.getScalingFromPercent(this.grq);
        }
        return this.getScalingFromPercent(this.grp);
    }

    private lcq getStartingColor() {
        if (this.grr <= 0.0f) {
            return this.eop;
        }
        return this.eoo;
    }

    private void createSprite() {
        ljp ljp2 = this.getStartScaling();
        ljp ljp3 = this.getTranslationFromScale(ljp2);
        this.grb = (dfr)dKP.Af(15);
        this.grb.setTextureName(this.fFC);
        this.grb.setVisible(true);
        this.grb.setGUID(this.getNewEffectGuid());
        this.grb.k(ljp3);
        this.grb.j(ljp2);
        this.grb.hT(false);
        this.grb.hU(false);
        this.grb.hV(true);
        if (this.gri == 0) {
            this.grb.fb(0.01f);
        } else if (this.gri == 1) {
            this.grb.fb(0.02f);
        } else if (this.gri == 2) {
            this.grb.fb(1.01f);
        }
        this.grb.setColor(this.getStartingColor());
        this.MessageDelegator.a(this.grb);
    }

    private void removeSprite() {
        if (this.grb == null) {
            return;
        }
        this.MessageDelegator.hd(this.grb.getGUID());
        this.grb = null;
    }

    private void shakeTranslation(ljp ljp2) {
        ljp2.x += lew.aj(-this.gru / 2, this.gru / 2);
        ljp2.y += lew.aj(-this.grv / 2, this.grv / 2);
    }

    private void checkSprite() {
        if (this.grb == null) {
            return;
        }
        if (this.hasInfiniteDuration()) {
            return;
        }
        double d2 = this.MessageDelegator.arc().rgz - this.fC.rgz;
        float f2 = (float)(d2 / (double)this.getDuration());
        if (this.grr > 0.0f && this.grr >= f2) {
            float f3 = f2 / this.grr;
            f3 = lew.A(f3, 0.0f, 1.0f);
            float f4 = ldq.o(this.grp, this.grq, f3);
            lcq lcq2 = lcq.a(this.eoo, this.eop, f3);
            ljp ljp2 = this.getScalingFromPercent(f4);
            ljp ljp3 = this.getTranslationFromScale(ljp2);
            if (this.grs) {
                this.shakeTranslation(ljp3);
            }
            this.grb.j(ljp2);
            this.grb.k(ljp3);
            this.grb.setColor(lcq2);
        } else if (f2 < this.grd) {
            ljp ljp4 = this.getScalingFromPercent(this.grq);
            ljp ljp5 = this.getTranslationFromScale(ljp4);
            if (this.grt) {
                this.shakeTranslation(ljp5);
            }
            this.grb.j(ljp4);
            this.grb.k(ljp5);
            this.grb.setColor(this.eop);
        } else {
            if (this.grt) {
                ljp ljp6 = this.getScalingFromPercent(this.grq);
                ljp ljp7 = this.getTranslationFromScale(ljp6);
                this.shakeTranslation(ljp7);
                this.grb.j(ljp6);
                this.grb.k(ljp7);
            }
            float f5 = f2 - this.grd;
            float f6 = 1.0f - this.grd;
            float f7 = 1.0f - f2;
            float f8 = f7 / f6;
            f8 = 1.0f - lew.A(f8, 0.0f, 1.0f);
            lcq lcq3 = new lcq(this.eop.r, this.eop.g, this.eop.b, 0.0f);
            lcq lcq4 = lcq.a(this.eop, lcq3, f8);
            this.grb.setColor(lcq4);
        }
    }

    public lcq getEndColor() {
        return this.eop;
    }

    public void setEndColor(lcq lcq2) {
        this.eop = lcq2;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public float getPercentScreenSizeStart() {
        return this.grp;
    }

    public void setPercentScreenSizeStart(float f2) {
        this.grp = f2;
    }

    public float getPercentScreenSizeEnd() {
        return this.grq;
    }

    public void setPercentScreenSizeEnd(float f2) {
        this.grq = f2;
    }

    public int getSpecialEffect2DLayer() {
        return this.gri;
    }

    public void setSpecialEffect2DLayer(int n2) {
        this.gri = n2;
    }

    public float getIntroTimePercent() {
        return this.grr;
    }

    public void setIntroTimePercent(float f2) {
        this.grr = f2;
    }

    public float getFadeOutTimePercent() {
        return this.grd;
    }

    public void setFadeOutTimePercent(float f2) {
        this.grd = f2;
    }

    public boolean isShakeOnIntro() {
        return this.grs;
    }

    public void setShakeOnIntro(boolean bl) {
        this.grs = bl;
    }

    public boolean isShakeAfterIntro() {
        return this.grt;
    }

    public void setShakeAfterIntro(boolean bl) {
        this.grt = bl;
    }

    public int getMaxShakeXPixels() {
        return this.gru;
    }

    public void setMaxShakeXPixels(int n2) {
        this.gru = n2;
    }

    public int getMaxShakeYPixels() {
        return this.grv;
    }

    public void setMaxShakeYPixels(int n2) {
        this.grv = n2;
    }

    public void setStartColor(lcq lcq2) {
        this.eoo = lcq2;
    }

    public lcq getStartColor() {
        return this.eoo;
    }

    public int getSpriteSizeX() {
        return this.grn;
    }

    public void setSpriteSizeX(int n2) {
        this.grn = n2;
    }

    public int getSpriteSizeY() {
        return this.gro;
    }

    public void setSpriteSizeY(int n2) {
        this.gro = n2;
    }

    public float getOffsetX() {
        return this.grw;
    }

    public void setOffsetX(float f2) {
        this.grw = f2;
    }

    public float getOffsetY() {
        return this.grx;
    }

    public void setOffsetY(float f2) {
        this.grx = f2;
    }
}


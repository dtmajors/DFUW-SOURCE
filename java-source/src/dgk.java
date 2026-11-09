/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cug
 *  dgj
 *  dta
 *  dtn
 *  lcr
 *  lcw
 */
public class dgk
extends dgj {
    private dfr grb = null;
    private lcq eoo = null;
    private lcq eop = null;
    private float grc = 0.0f;
    private float grd = 1.0f;
    private String fFC = null;
    private int gre = 256;
    private float grf = 1.0f;
    private boolean grg = true;
    private float grh = 1.0f;
    private int gri = 0;
    private float grj = 0.2f;
    private float grk = 0.1f;
    private boolean grl = false;
    private boolean grm = false;

    dgk() {
        this.gqB = 53;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeSprite();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.checkSpriteColor();
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
        dgk dgk2 = (dgk)dgj2;
        dgk2.eoo = this.eoo;
        dgk2.eop = this.eop;
        dgk2.grc = this.grc;
        dgk2.grd = this.grd;
        dgk2.fFC = this.fFC;
        dgk2.gre = this.gre;
        dgk2.grf = this.grf;
        dgk2.grg = this.grg;
        dgk2.grh = this.grh;
        dgk2.gri = this.gri;
        dgk2.grj = this.grj;
        dgk2.grk = this.grk;
        dgk2.grl = this.grl;
        dgk2.grm = this.grm;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.eoo = lcq.BRIGHT_WHITE;
        this.eop = lcq.BRIGHT_WHITE_TRANSPARENT;
        this.grc = 0.1f;
        this.grd = 0.1f;
        this.fFC = "";
        this.gre = 256;
        this.grf = 1.0f;
        this.grg = false;
        this.grh = 0.5f;
        this.gri = 0;
        this.grj = 0.2f;
        this.grk = 0.1f;
        this.grl = false;
        this.grm = false;
    }

    private void checkPhysicalVisibility() {
        ljq ljq2 = this.getCameraPosition();
        ljq ljq3 = new ljq(this.getTargetPosition());
        ljq3.et(ljq2);
        ljq ljq4 = new ljq(ljq3);
        ljq4.normalize();
        ljq ljq5 = new ljq(ljq4);
        ljq5.nm(0.1f);
        ljq3.et(ljq5);
        float f2 = ljq3.eqN();
        kji kji2 = (kji)this.MessageDelegator.h(2818);
        kji2.iBr = false;
        kji2.hsP = false;
        kji2.Yg(2);
        kji2.Yh(2);
        kji2.ca(ljq2);
        kji2.cq(ljq4);
        kji2.setLength(f2);
        kji2.wU(false);
        kji2.ec = this.getGUID();
        kji2.Ye(0);
        this.MessageDelegator.a(kji2);
    }

    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 4866: {
                this.handleLineContainmentResponse((kuj)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    private void handleLineContainmentResponse(kuj kuj2) {
        if (kuj2.bqd == null) {
            this.createActualSprite();
            return;
        }
        if (kuj2.bqd.length == 0) {
            this.createActualSprite();
            return;
        }
        boolean bl = false;
        for (int i2 = 0; i2 < kuj2.bqd.length; ++i2) {
            if (lea.enW().k(kuj2.bqd[i2], cug.fgz, true) || lea.enW().isDescendant(kuj2.bqd[i2], cug.fkw)) continue;
            bl = true;
            break;
        }
        if (!bl) {
            this.createActualSprite();
        }
    }

    private void createSprite() {
        if (this.grg) {
            if (!this.isTargetPositionFacingCamera(this.grh)) {
                return;
            }
            if (!this.isTargetPositionWithinCameraDistance()) {
                return;
            }
        }
        if (this.grl) {
            this.checkPhysicalVisibility();
        } else {
            this.createActualSprite();
        }
    }

    private void createActualSprite() {
        Object object;
        Object object2;
        float f2 = 1.0f;
        if (this.grm) {
            dta dta2 = this.MessageDelegator.bzx().bzt().od(lcr.qzp);
            if (dta2 == null) {
                lfn.b(5, "SFSpecialEffect2DFlash", "createActualSprite() : system os is null");
                return;
            }
            if (!(dta2 instanceof dtn)) {
                lfn.b(5, "SFSpecialEffect2DFlash", "createActualSprite() : os is not system");
                return;
            }
            dtn dtn2 = (dtn)dta2;
            if (dtn2.bAn() == null) {
                lfn.b(5, "SFSpecialEffect2DFlash", "createActualSprite() :client info is null ");
                return;
            }
            if (dtn2.bAn().gYZ == null) {
                lfn.b(5, "SFSpecialEffect2DFlash", "createActualSprite() :client meshobject guid is null");
                return;
            }
            if (!dtn2.bAn().gYZ.equals(this.akX)) {
                return;
            }
            if (dtn2.bzt() != null && (object2 = dtn2.bzt().d(dtn2.bAn().gYZ)) instanceof bvi) {
                int n2;
                object = (bvi)((Object)object2);
                cbx cbx2 = object.aze();
                if (cbx2 == null) {
                    return;
                }
                boolean bl = cbx2.aIq();
                ldv ldv2 = this.aZG;
                if (ldv2 != null) {
                    n2 = lcr.tT((ldv)this.aZG);
                    ldv2 = lcr.abW((int)n2);
                }
                n2 = cbx2.km(ldv2) ? 1 : 0;
                if (bl && n2 == 0) {
                    return;
                }
            }
        } else {
            float f3 = this.getTargetPositionDistanceFromCamera();
            f2 = f3 / this.getMaxAffectCameraDistance();
            f2 = lew.A(f2, 0.0f, 1.0f);
            if (f3 < this.getMaxAffectCameraDistance() * this.grj) {
                f2 = 0.0f;
            }
            if ((f2 = 1.0f - f2) < this.grk) {
                f2 = this.grk;
            }
        }
        this.eoo = new lcq(this.eoo.r, this.eoo.g, this.eoo.b, this.eoo.a * f2);
        int n3 = (int)((float)lcw.qFT * this.grf);
        int n4 = (int)((float)lcw.qFU * this.grf);
        object2 = new ljp();
        ((ljp)object2).x = (float)n3 / (float)this.gre;
        ((ljp)object2).y = (float)n4 / (float)this.gre;
        object = new ljp();
        ((ljp)object).x = (int)((float)lcw.qFT / 2.0f * (1.0f - this.grf));
        ((ljp)object).y = (int)((float)lcw.qFT / 2.0f * (1.0f - this.grf));
        this.grb = (dfr)dKP.Af(15);
        this.grb.setTextureName(this.fFC);
        this.grb.setVisible(true);
        this.grb.setGUID(this.getNewEffectGuid());
        this.grb.k((ljp)object);
        this.grb.j((ljp)object2);
        this.grb.hT(false);
        this.grb.hU(false);
        this.grb.hV(true);
        if (this.gri == 0) {
            this.grb.fb(0.01f);
        } else {
            this.grb.fb(0.02f);
        }
        if (this.grc <= 0.0f || this.hasInfiniteDuration()) {
            this.grb.setColor(this.eoo);
        } else {
            this.grb.setColor(this.eop);
        }
        this.MessageDelegator.a(this.grb);
    }

    private void removeSprite() {
        if (this.grb == null) {
            return;
        }
        this.MessageDelegator.hd(this.grb.getGUID());
    }

    private void checkSpriteColor() {
        if (this.grb == null) {
            return;
        }
        if (this.hasInfiniteDuration()) {
            return;
        }
        if (this.grc == 0.0f && this.grd == 1.0f) {
            return;
        }
        double d2 = this.MessageDelegator.arc().rgz - this.fC.rgz;
        float f2 = (float)(d2 / (double)this.getDuration());
        if (this.grc > 0.0f && f2 < this.grc) {
            float f3 = f2 / this.grc;
            f3 = lew.A(f3, 0.0f, 1.0f);
            lcq lcq2 = lcq.a(this.eop, this.eoo, f3);
            this.grb.setColor(lcq2);
        } else if (this.grd < 1.0f && f2 > this.grd) {
            float f4 = (f2 - this.grd) / (1.0f - this.grd);
            if (f4 > 1.0f) {
                f4 = 1.0f;
            }
            lcq lcq3 = lcq.a(this.eoo, this.eop, f4);
            this.grb.setColor(lcq3);
        } else {
            this.grb.setColor(this.eoo);
        }
    }

    public boolean isCameraDependent() {
        return this.grg;
    }

    public void setCameraDependent(boolean bl) {
        this.grg = bl;
    }

    public float getDotCameraDependent() {
        return this.grh;
    }

    public void setDotCameraDependent(float f2) {
        this.grh = f2;
    }

    public lcq getEndColor() {
        return this.eop;
    }

    public void setEndColor(lcq lcq2) {
        this.eop = lcq2;
    }

    public float getFadeInTimePercent() {
        return this.grc;
    }

    public void setFadeInTimePercent(float f2) {
        this.grc = f2;
    }

    public float getFadeOutTimePercent() {
        return this.grd;
    }

    public void setFadeOutTimePercent(float f2) {
        this.grd = f2;
    }

    public float getPercentScreenSize() {
        return this.grf;
    }

    public void setPercentScreenSize(float f2) {
        this.grf = f2;
    }

    public int getSpecialEffect2DLayer() {
        return this.gri;
    }

    public void setSpecialEffect2DLayer(int n2) {
        this.gri = n2;
    }

    public int getSpriteSize() {
        return this.gre;
    }

    public void setSpriteSize(int n2) {
        this.gre = n2;
    }

    public lcq getStartColor() {
        return this.eoo;
    }

    public void setStartColor(lcq lcq2) {
        this.eoo = lcq2;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public float getPercentOfMaxDistanceToAffectMaxium() {
        return this.grj;
    }

    public void setPercentOfMaxDistanceToAffectMaxium(float f2) {
        this.grj = f2;
    }

    public float getMinAffectTransparancy() {
        return this.grk;
    }

    public void setMinAffectTransparancy(float f2) {
        this.grk = f2;
    }

    public boolean isCheckPhysicalVisibility() {
        return this.grl;
    }

    public void setCheckPhysicalVisibility(boolean bl) {
        this.grl = bl;
    }

    public boolean isCheckOnlyIfTargetIsPlayer() {
        return this.grm;
    }

    public void setCheckOnlyIfTargetIsPlayer(boolean bl) {
        this.grm = bl;
    }
}


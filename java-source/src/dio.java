/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dio
extends dgj {
    private dfm[] gyB = null;
    private dkx[] gyC = null;
    private String gxy = null;
    private String gxz = null;
    private String ekh = null;
    private float grd = 0.9f;
    private float gzZ = 0.0f;
    private lcq gtg = null;
    private lcq gth = null;
    private float gtj = 1.0f;
    private float gtk = 1.0f;
    private boolean gxL = true;
    private boolean gAa = true;
    private ljq gyW = null;
    private ljq gyX = null;
    private ljq gAb = null;
    private ljq gAc = null;
    private ljq gyv = null;
    private ljq gyw = null;
    private int gyA = 0;
    private int gAd = 0;
    private boolean gAe = false;
    private double gAf = 0.0;
    private lgl gAg = null;
    private lgl gAh = null;
    private ljq gAi = null;
    private ljq gAj = null;

    dio() {
        this.gqB = 59;
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.checkRelations();
        this.checkPositions();
        this.checkMeshFadeOut();
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeMeshes();
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.createMeshes();
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dio dio2 = (dio)dgj2;
        dio2.gxy = this.gxy;
        dio2.gxz = this.gxz;
        dio2.ekh = this.ekh;
        dio2.grd = this.grd;
        dio2.gzZ = this.gzZ;
        dio2.gtg = this.gtg;
        dio2.gth = this.gth;
        dio2.gtj = this.gtj;
        dio2.gtk = this.gtk;
        dio2.gxL = this.gxL;
        dio2.gyW = this.gyW;
        dio2.gyX = this.gyX;
        dio2.gAb = this.gAb;
        dio2.gAc = this.gAc;
        dio2.gyv = this.gyv;
        dio2.gyw = this.gyw;
        dio2.gyA = this.gyA;
        dio2.gAa = this.gAa;
    }

    public void setDefaultValues() {
        this.gxy = "";
        this.gxz = "";
        this.ekh = "";
        this.grd = 0.9f;
        this.gzZ = 0.5f;
        this.gtg = lcq.BRIGHT_WHITE;
        this.gth = lcq.BRIGHT_WHITE_TRANSPARENT;
        this.gtj = 1.0f;
        this.gtk = 1.0f;
        this.gxL = true;
        this.gyW = new ljq();
        this.gyX = new ljq();
        this.gAb = new ljq(0.0f, -2.0f, 0.0f);
        this.gAc = new ljq();
        this.gyv = new ljq();
        this.gyw = new ljq(0.0f, 0.5f, 0.0f);
        this.gyA = 2;
        this.gAa = true;
    }

    private void createMeshes() {
        this.gyB = new dfm[this.gyA];
        for (int i2 = 0; i2 < this.gyA; ++i2) {
            this.gyB[i2] = this.createMesh(i2);
        }
    }

    private dfm createMesh(int n2) {
        dfm dfm2 = null;
        dfm2 = (dfm)dKP.Af(11);
        if (n2 == 0) {
            dfm2.setGUID(this.getMainAtomGuid());
        } else {
            dfm2.setGUID(this.getNewEffectGuid());
        }
        dfm2.setActive(true);
        dfm2.setDefaultValues();
        dfm2.setMeshXML(this.ekh);
        ljq ljq2 = new ljq(this.getTargetPosition());
        ljq2.es(this.gAb);
        ljq2.es(ljq.D(this.gyw, n2));
        dfm2.c(ljq2);
        dfm2.a(new lgl(this.gyW));
        if (this.gAa) {
            dfm2.n(this.gth);
        } else {
            dfm2.n(this.gtg);
        }
        if (this.gtj != 1.0f) {
            dfm2.setScale(this.gtj);
        }
        this.MessageDelegator.a(dfm2);
        return dfm2;
    }

    private void checkRelations() {
        if (!this.isRelationEffect()) {
            return;
        }
        if (this.gyC != null) {
            return;
        }
        if (this.gyB.length == 0) {
            return;
        }
        if (!this.gyB[0].blt()) {
            return;
        }
        this.gyC = new dkx[this.gyA];
        for (int i2 = 0; i2 < this.gyA; ++i2) {
            this.gyC[i2] = this.createRelation(i2, this.gyB[i2]);
        }
    }

    private dkx createRelation(int n2, dfm dfm2) {
        dkx dkx2 = this.setupPositionalRelation(this.getTargetObjectGUID(), dfm2.getGUID(), this.getMainEffectObjectType());
        ljq ljq2 = new ljq(this.gAb);
        ljq2.es(ljq.D(this.gyw, n2));
        dkx2.setDeltaPos(ljq2);
        dkx2.setDeltaRot(new lgl(this.gyW));
        return dkx2;
    }

    private void checkPositions() {
        ljq ljq2;
        if (this.gyB.length == 0) {
            return;
        }
        if (this.gAd < 0) {
            return;
        }
        dfm dfm2 = this.gyB[this.gAd];
        assert (dfm2 != null);
        if (!dfm2.blt()) {
            return;
        }
        if (!this.gAe) {
            dfm2.n(this.gtg);
            this.gAe = true;
            this.gAf = this.MessageDelegator.arc().rgz;
            this.gAg = new lgl(this.gyW);
            ljq2 = new ljq(this.gyX);
            ljq2.es(ljq.D(this.gyv, this.gAd));
            this.gAh = new lgl(ljq2);
            this.gAi = new ljq(this.gAb);
            this.gAi.es(ljq.D(this.gyw, this.gAd));
            this.gAj = new ljq(this.gAc);
            this.gAj.es(ljq.D(this.gyw, this.gAd));
        }
        if (this.gAf + (double)this.gzZ <= this.MessageDelegator.arc().rgz) {
            if (this.gtj != this.gtk) {
                dfm2.setScale(this.gtk);
            }
            this.updateMeshPositionRotation(this.gAd, this.gAj, this.gAh);
            ljq2 = new ljq(this.gAj);
            ljq2.es(this.getTargetPosition());
            this.gAe = false;
            if (this.isRelationEffect()) {
                this.startGenericRelationEffect(this.gxy, ljq2, this.getTargetObjectGUID());
            } else {
                this.startGenericMainEffect(this.gxy, ljq2);
            }
            ++this.gAd;
            if (this.gAd >= this.gyA) {
                if (this.isRelationEffect()) {
                    this.startGenericRelationEffect(this.gxz, ljq2, this.getTargetObjectGUID());
                } else {
                    this.startGenericMainEffect(this.gxz, ljq2);
                }
                this.gAd = -1;
            }
        } else {
            float f2 = (float)(this.MessageDelegator.arc().rgz - this.gAf) / this.gzZ;
            if (this.gxL) {
                f2 *= f2;
            }
            if (f2 > 1.0f) {
                f2 = 1.0f;
            } else if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            ljq ljq3 = ljq.e(this.gAi, this.gAj, f2);
            lgl lgl2 = lgl.b(this.gAg, this.gAh, f2);
            this.updateMeshPositionRotation(this.gAd, ljq3, lgl2);
            if (this.gtj != this.gtk) {
                dfm2.setScale(ldq.o(this.gtj, this.gtk, f2));
            }
        }
    }

    private void updateMeshPositionRotation(int n2, ljq ljq2, lgl lgl2) {
        dfm dfm2 = this.gyB[n2];
        if (this.isRelationEffect()) {
            dkx dkx2 = this.gyC[n2];
            dkx2.setDeltaPos(ljq2);
            dkx2.setDeltaRot(lgl2);
        } else {
            ljq ljq3 = new ljq(ljq2);
            ljq3.es(this.getTargetPosition());
            dfm2.c(ljq3);
            dfm2.a(lgl2);
        }
    }

    private void checkMeshFadeOut() {
        if (this.hasInfiniteDuration()) {
            return;
        }
        if (this.gyB == null) {
            return;
        }
        if ((double)this.grd < 1.0) {
            double d2 = this.MessageDelegator.arc().rgz - this.fC.rgz;
            float f2 = (float)(d2 / (double)this.getDuration());
            if (f2 < this.grd) {
                return;
            }
            float f3 = (f2 - this.grd) / (1.0f - this.grd);
            f3 = lew.A(f3, 0.0f, 1.0f);
            lcq lcq2 = lcq.a(this.gtg, this.gth, f3);
            for (int i2 = 0; i2 < this.gyB.length; ++i2) {
                dfm dfm2 = this.gyB[i2];
                dfm2.n(lcq2);
            }
        }
    }

    private void removeMeshes() {
        if (this.gyB == null) {
            return;
        }
        for (int i2 = 0; i2 < this.gyB.length; ++i2) {
            dfm dfm2 = this.gyB[i2];
            if (dfm2 == null) continue;
            dey.bls().b(dfm2);
        }
        this.gyB = null;
    }

    public float getFadeOutTimePercent() {
        return this.grd;
    }

    public void setFadeOutTimePercent(float f2) {
        this.grd = f2;
    }

    public String getFinalEffectName() {
        return this.gxz;
    }

    public void setFinalEffectName(String string) {
        this.gxz = string;
    }

    public float getMeshAnimateTime() {
        return this.gzZ;
    }

    public void setMeshAnimateTime(float f2) {
        this.gzZ = f2;
    }

    public lcq getMeshEndColor() {
        return this.gth;
    }

    public void setMeshEndColor(lcq lcq2) {
        this.gth = lcq2;
    }

    public ljq getMeshEndPosition() {
        return this.gAc;
    }

    public void setMeshEndPosition(ljq ljq2) {
        this.gAc = ljq2;
    }

    public ljq getMeshEndRotation() {
        return this.gyX;
    }

    public void setMeshEndRotation(ljq ljq2) {
        this.gyX = ljq2;
    }

    public float getMeshEndScale() {
        return this.gtk;
    }

    public void setMeshEndScale(float f2) {
        this.gtk = f2;
    }

    public String getMeshImpactEffectName() {
        return this.gxy;
    }

    public void setMeshImpactEffectName(String string) {
        this.gxy = string;
    }

    public ljq getMeshOffsetPosition() {
        return this.gyw;
    }

    public void setMeshOffsetPosition(ljq ljq2) {
        this.gyw = ljq2;
    }

    public ljq getMeshOffsetRotation() {
        return this.gyv;
    }

    public void setMeshOffsetRotation(ljq ljq2) {
        this.gyv = ljq2;
    }

    public lcq getMeshStartColor() {
        return this.gtg;
    }

    public void setMeshStartColor(lcq lcq2) {
        this.gtg = lcq2;
    }

    public ljq getMeshStartPosition() {
        return this.gAb;
    }

    public void setMeshStartPosition(ljq ljq2) {
        this.gAb = ljq2;
    }

    public ljq getMeshStartRotation() {
        return this.gyW;
    }

    public void setMeshStartRotation(ljq ljq2) {
        this.gyW = ljq2;
    }

    public float getMeshStartScale() {
        return this.gtj;
    }

    public void setMeshStartScale(float f2) {
        this.gtj = f2;
    }

    public String getMeshXML() {
        return this.ekh;
    }

    public void setMeshXML(String string) {
        this.ekh = string;
    }

    public boolean isNonLinearAnimation() {
        return this.gxL;
    }

    public void setNonLinearAnimation(boolean bl) {
        this.gxL = bl;
    }

    public int getNumberOfMeshes() {
        return this.gyA;
    }

    public void setNumberOfMeshes(int n2) {
        this.gyA = n2;
    }

    public boolean isStartAnimationWithEndColor() {
        return this.gAa;
    }

    public void setStartAnimationWithEndColor(boolean bl) {
        this.gAa = bl;
    }

    public dey getAtom(int n2) {
        if (this.gyB == null) {
            return null;
        }
        return this.gyB[n2];
    }

    public int getAtomCount() {
        if (this.gyB == null) {
            return 0;
        }
        return this.gyB.length;
    }
}


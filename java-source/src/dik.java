/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dik
extends dgj {
    private dfm gtf = null;
    private String ekh = null;
    private float grd = 0.8f;
    private float gzo = 0.8f;
    private lcq gtg = null;
    private lcq gth = null;
    private boolean gti = false;
    private float gtj = 1.0f;
    private float gtk = 1.0f;
    private boolean gtl = true;
    private ljq gzF = null;
    private float gzq = 0.0f;
    private float gzG = 0.0f;
    private boolean gzr = true;
    private float gzs = 0.5f;
    private dkx gyZ = null;
    private int gzt = 0;
    private ljq gon = null;
    private ljq goo = null;
    private ljq etB = null;
    private boolean gzu = false;

    dik() {
        this.gqB = 51;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeMesh();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.checkMeshColor();
        this.checkMeshScale();
        this.checkMeshPosition();
        if (this.isRelationEffect() && this.gyZ == null && this.nx.lpr > this.gzt + 2) {
            this.gyZ = this.setupPositionalRelation(this.getTargetObjectGUID(), this.gtf.getGUID(), this.getMainEffectObjectType());
        }
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.createMesh();
        this.gzt = this.MessageDelegator.arc().lpr;
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dik dik2 = (dik)dgj2;
        dik2.ekh = this.ekh;
        dik2.gtg = this.gtg;
        dik2.gth = this.gth;
        dik2.grd = this.grd;
        dik2.gtj = this.gtj;
        dik2.gtk = this.gtk;
        dik2.gtl = this.gtl;
        dik2.gzF = this.gzF;
        dik2.gzq = this.gzq;
        dik2.gzG = this.gzG;
        dik2.gzr = this.gzr;
        dik2.gzs = this.gzs;
        dik2.gzo = this.gzo;
        dik2.gti = this.gti;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.ekh = "";
        this.gtg = lcq.BRIGHT_WHITE;
        this.gth = lcq.BRIGHT_WHITE;
        this.gtj = 1.0f;
        this.gtk = 1.0f;
        this.grd = 0.8f;
        this.gtl = true;
        this.gzF = new ljq(0.0f, 1.0f, 0.0f);
        this.gzq = 1.0f;
        this.gzG = -1.0f;
        this.gzr = true;
        this.gzs = 0.5f;
        this.gzo = 1.0f;
        this.gti = false;
    }

    protected void createMesh() {
        this.gtf = (dfm)dKP.Af(11);
        this.gtf.setGUID(this.getMainAtomGuid());
        this.gtf.setActive(true);
        this.gtf.setDefaultValues();
        this.gtf.setMeshXML(this.ekh);
        this.gon = new ljq(this.getTargetPosition());
        this.goo = new ljq(this.getTargetPosition());
        this.etB = new ljq(this.gon);
        this.gon.es(ljq.D(this.gzF, this.gzq));
        this.goo.es(ljq.D(this.gzF, this.gzG));
        this.gtf.c(this.gon);
        this.gtf.a(new lgl());
        this.gtf.n(this.gtg);
        if (this.gtj != 1.0f) {
            this.gtf.setScale(this.gtj);
        }
        this.MessageDelegator.a(this.gtf);
    }

    protected void removeMesh() {
        if (this.gtf != null) {
            dey.bls().b(this.gtf);
            this.gtf = null;
        }
    }

    private void checkMeshColor() {
        if (this.hasInfiniteDuration()) {
            return;
        }
        if (this.grd >= 1.0f) {
            return;
        }
        double d2 = this.MessageDelegator.arc().rgz - this.fC.rgz;
        float f2 = (float)(d2 / (double)this.getDuration());
        if (f2 < this.grd) {
            return;
        }
        float f3 = (f2 - this.grd) / (1.0f - this.grd);
        if (this.gti) {
            f3 *= f3;
        }
        f3 = lew.A(f3, 0.0f, 1.0f);
        lcq lcq2 = lcq.a(this.gtg, this.gth, f3);
        this.gtf.n(lcq2);
    }

    private void checkMeshScale() {
        if (this.hasInfiniteDuration()) {
            return;
        }
        if (this.gzo >= 1.0f) {
            return;
        }
        if (this.gtj == this.gtk) {
            return;
        }
        double d2 = this.MessageDelegator.arc().rgz - this.fC.rgz;
        float f2 = (float)(d2 / (double)this.getDuration());
        if (f2 < this.gzo) {
            return;
        }
        float f3 = (f2 - this.gzo) / (1.0f - this.gzo);
        if (this.gtl) {
            f3 *= f3;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        float f4 = this.gtj * (1.0f - f3) + this.gtk * f3;
        this.gtf.setScale(f4);
    }

    private void checkMeshPosition() {
        if (this.hasInfiniteDuration()) {
            return;
        }
        double d2 = this.MessageDelegator.arc().rgz - this.fC.rgz;
        float f2 = (float)(d2 / (double)(this.getDuration() * this.gzs));
        if (this.gzu && f2 > 1.0f) {
            return;
        }
        float f3 = f2;
        if (this.gzr) {
            f3 *= f3;
        }
        if (f3 >= 1.0f) {
            this.gzu = true;
            f3 = 1.0f;
        }
        ljq.a(this.gon, this.goo, f3, this.etB);
        if (this.gyZ != null) {
            this.gyZ.setDeltaPos(this.etB);
        } else {
            this.gtf.c(this.etB);
        }
    }

    public float getEndOffset() {
        return this.gzG;
    }

    public void setEndOffset(float f2) {
        this.gzG = f2;
    }

    public float getFadeOutTimePercent() {
        return this.grd;
    }

    public void setFadeOutTimePercent(float f2) {
        this.grd = f2;
    }

    public lcq getMeshEndColor() {
        return this.gth;
    }

    public void setMeshEndColor(lcq lcq2) {
        this.gth = lcq2;
    }

    public float getMeshEndScale() {
        return this.gtk;
    }

    public void setMeshEndScale(float f2) {
        this.gtk = f2;
    }

    public lcq getMeshStartColor() {
        return this.gtg;
    }

    public void setMeshStartColor(lcq lcq2) {
        this.gtg = lcq2;
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

    public boolean isNonLinearMovement() {
        return this.gzr;
    }

    public void setNonLinearMovement(boolean bl) {
        this.gzr = bl;
    }

    public boolean isNonLinearScale() {
        return this.gtl;
    }

    public void setNonLinearScale(boolean bl) {
        this.gtl = bl;
    }

    public ljq getOffsetDirection() {
        return this.gzF;
    }

    public void setOffsetDirection(ljq ljq2) {
        this.gzF = ljq2;
    }

    public float getPercentTimeMovement() {
        return this.gzs;
    }

    public void setPercentTimeMovement(float f2) {
        this.gzs = f2;
    }

    public float getScaleOutTimePercent() {
        return this.gzo;
    }

    public void setScaleOutTimePercent(float f2) {
        this.gzo = f2;
    }

    public float getStartOffset() {
        return this.gzq;
    }

    public void setStartOffset(float f2) {
        this.gzq = f2;
    }

    public boolean isNonLinearColorFade() {
        return this.gti;
    }

    public void setNonLinearColorFade(boolean bl) {
        this.gti = bl;
    }

    public dey getAtom(int n2) {
        return this.gtf;
    }

    public int getAtomCount() {
        return 1;
    }
}


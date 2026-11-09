/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dkj
extends dgj {
    private dfm gtf = null;
    private String ekh = null;
    private lcq gtg = null;
    private lcq gth = null;
    private boolean gti = false;
    private float gtj = 1.0f;
    private float gtk = 1.0f;
    private boolean gtl = false;
    private ljq gyW = null;
    private ljq gyX = null;
    private boolean gyY = false;
    private float gDr = 1.0f;
    private float gDs = 1.0f;
    private float gDt = 1.0f;
    private dkx gyZ = null;

    dkj() {
        this.gqB = 66;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeMesh();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.checkMeshColor();
        this.checkMeshScale();
        this.checkMeshRotation();
        if (this.isRelationEffect() && this.gyZ == null && this.gtf != null && this.gtf.blt()) {
            this.gyZ = this.setupPositionalRelation(this.getTargetObjectGUID(), this.gtf.getGUID(), this.getMainEffectObjectType());
        }
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.createMesh();
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dkj dkj2 = (dkj)dgj2;
        dkj2.ekh = this.ekh;
        dkj2.gtg = this.gtg;
        dkj2.gth = this.gth;
        dkj2.gtj = this.gtj;
        dkj2.gtk = this.gtk;
        dkj2.gtl = this.gtl;
        dkj2.gti = this.gti;
        dkj2.gyW = this.gyW;
        dkj2.gyX = this.gyX;
        dkj2.gyY = this.gyY;
        dkj2.gDr = this.gDr;
        dkj2.gDs = this.gDs;
        dkj2.gDt = this.gDt;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.ekh = "";
        this.gtg = lcq.BRIGHT_WHITE;
        this.gth = lcq.BRIGHT_WHITE;
        this.gtj = 1.0f;
        this.gtk = 1.0f;
        this.gtl = true;
        this.gti = false;
        this.gyW = new ljq();
        this.gyX = new ljq();
        this.gyY = false;
        this.gDr = 1.0f;
        this.gDs = 1.0f;
        this.gDt = 1.0f;
    }

    protected void createMesh() {
        this.gtf = (dfm)dKP.Af(11);
        this.gtf.setGUID(this.getMainAtomGuid());
        this.gtf.setActive(true);
        this.gtf.setDefaultValues();
        this.gtf.setMeshXML(this.ekh);
        this.gtf.c(this.getTargetPosition());
        if (this.getSourceRotation() == null) {
            this.gtf.a(new lgl(this.gyW));
        } else {
            this.gtf.a(this.getSourceRotation());
        }
        this.gtf.n(this.gtg);
        this.gtf.o(new lcq(this.gDr, this.gDs, this.gDt, 1.0f, true));
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
        double d2 = this.MessageDelegator.arc().rgz - this.fC.rgz;
        float f = (float)(d2 / (double)this.getDuration());
        if (this.gti) {
            f *= f;
        }
        f = lew.A(f, 0.0f, 1.0f);
        lcq lcq2 = lcq.a(this.gtg, this.gth, f);
        this.gtf.n(lcq2);
    }

    private void checkMeshScale() {
        if (this.hasInfiniteDuration()) {
            return;
        }
        if (this.gtj == this.gtk) {
            return;
        }
        double d2 = this.MessageDelegator.arc().rgz - this.fC.rgz;
        float f = (float)(d2 / (double)this.getDuration());
        if (this.gtl) {
            f *= f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        float f2 = this.gtj * (1.0f - f) + this.gtk * f;
        this.gtf.setScale(f2);
    }

    private void checkMeshRotation() {
        if (this.hasInfiniteDuration()) {
            return;
        }
        if (this.gyW.equals(this.gyX)) {
            return;
        }
        double d2 = this.MessageDelegator.arc().rgz - this.fC.rgz;
        float f = (float)(d2 / (double)this.getDuration());
        if (this.gyY) {
            f *= f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        ljq ljq2 = ljq.e(this.gyW, this.gyX, f);
        if (this.gyZ == null) {
            this.gtf.a(new lgl(ljq2));
        } else {
            this.gyZ.setDeltaRot(new lgl(ljq2));
        }
    }

    public String getMeshXML() {
        return this.ekh;
    }

    public void setMeshXML(String string) {
        this.ekh = string;
    }

    public lcq getMeshStartColor() {
        return this.gtg;
    }

    public void setMeshStartColor(lcq lcq2) {
        this.gtg = lcq2;
    }

    public lcq getMeshEndColor() {
        return this.gth;
    }

    public void setMeshEndColor(lcq lcq2) {
        this.gth = lcq2;
    }

    public boolean isNonLinearColorFade() {
        return this.gti;
    }

    public void setNonLinearColorFade(boolean bl) {
        this.gti = bl;
    }

    public float getMeshStartScale() {
        return this.gtj;
    }

    public void setMeshStartScale(float f) {
        this.gtj = f;
    }

    public float getMeshEndScale() {
        return this.gtk;
    }

    public void setMeshEndScale(float f) {
        this.gtk = f;
    }

    public boolean isNonLinearScale() {
        return this.gtl;
    }

    public void setNonLinearScale(boolean bl) {
        this.gtl = bl;
    }

    public ljq getMeshStartRotation() {
        return this.gyW;
    }

    public void setMeshStartRotation(ljq ljq2) {
        this.gyW = ljq2;
    }

    public ljq getMeshEndRotation() {
        return this.gyX;
    }

    public void setMeshEndRotation(ljq ljq2) {
        this.gyX = ljq2;
    }

    public boolean isNonLinearRotation() {
        return this.gyY;
    }

    public void setNonLinearRotation(boolean bl) {
        this.gyY = bl;
    }

    public float getTextureSCrollMultiplier_X() {
        return this.gDs;
    }

    public void setTextureSCrollMultiplier_X(float f) {
        this.gDs = f;
    }

    public float getTextureSCrollMultiplier_Y() {
        return this.gDt;
    }

    public void setTextureSCrollMultiplier_Y(float f) {
        this.gDt = f;
    }

    public float getMeshExplosionTime() {
        return this.gDr;
    }

    public void setMeshExplosionTime(float f) {
        this.gDr = f;
    }

    public dey getAtom(int n) {
        return this.gtf;
    }

    public int getAtomCount() {
        return 1;
    }
}


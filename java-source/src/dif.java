/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dif
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
    private dkx gyZ = null;

    dif() {
        this.gqB = 52;
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
        dif dif2 = (dif)dgj2;
        dif2.ekh = this.ekh;
        dif2.gtg = this.gtg;
        dif2.gth = this.gth;
        dif2.gtj = this.gtj;
        dif2.gtk = this.gtk;
        dif2.gtl = this.gtl;
        dif2.gti = this.gti;
        dif2.gyW = this.gyW;
        dif2.gyX = this.gyX;
        dif2.gyY = this.gyY;
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
    }

    protected void createMesh() {
        this.gtf = (dfm)dKP.Af(11);
        this.gtf.setGUID(this.getMainAtomGuid());
        this.gtf.setActive(true);
        this.gtf.setDefaultValues();
        this.gtf.setMeshXML(this.ekh);
        this.gtf.c(this.getTargetPosition());
        this.gtf.a(new lgl(this.gyW));
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
        double d2 = this.MessageDelegator.arc().rgz - this.fC.rgz;
        float f2 = (float)(d2 / (double)this.getDuration());
        if (this.gti) {
            f2 *= f2;
        }
        f2 = lew.A(f2, 0.0f, 1.0f);
        lcq lcq2 = lcq.a(this.gtg, this.gth, f2);
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
        float f2 = (float)(d2 / (double)this.getDuration());
        if (this.gtl) {
            f2 *= f2;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        float f3 = this.gtj * (1.0f - f2) + this.gtk * f2;
        this.gtf.setScale(f3);
    }

    private void checkMeshRotation() {
        if (this.hasInfiniteDuration()) {
            return;
        }
        if (this.gyW.equals(this.gyX)) {
            return;
        }
        double d2 = this.MessageDelegator.arc().rgz - this.fC.rgz;
        float f2 = (float)(d2 / (double)this.getDuration());
        if (this.gyY) {
            f2 *= f2;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        ljq ljq2 = ljq.e(this.gyW, this.gyX, f2);
        if (this.gyZ == null) {
            this.gtf.a(new lgl(ljq2));
        } else {
            this.gyZ.setDeltaRot(new lgl(ljq2));
        }
    }

    public lcq getMeshEndColor() {
        return this.gth;
    }

    public void setMeshEndColor(lcq lcq2) {
        this.gth = lcq2;
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

    public lcq getMeshStartColor() {
        return this.gtg;
    }

    public void setMeshStartColor(lcq lcq2) {
        this.gtg = lcq2;
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

    public boolean isNonLinearColorFade() {
        return this.gti;
    }

    public void setNonLinearColorFade(boolean bl) {
        this.gti = bl;
    }

    public boolean isNonLinearRotation() {
        return this.gyY;
    }

    public void setNonLinearRotation(boolean bl) {
        this.gyY = bl;
    }

    public boolean isNonLinearScale() {
        return this.gtl;
    }

    public void setNonLinearScale(boolean bl) {
        this.gtl = bl;
    }

    public dey getAtom(int n2) {
        return this.gtf;
    }

    public int getAtomCount() {
        return 1;
    }
}


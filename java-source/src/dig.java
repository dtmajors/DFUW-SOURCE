/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dig
extends dgj {
    private dfm gtf = null;
    private String ekh = null;
    private float grd = 0.8f;
    private float gtj = 1.0f;
    private float gtk = 1.0f;
    private boolean gtl = true;
    private float gza = 1.0f;
    private float gzb = 1.0f;
    private float gzc = 0.0f;
    private float gzd = 1.0f;
    private float gze = 1.0f;
    private float gzf = 1.0f;
    private float gzg = 1.0f;
    private boolean gzh = false;
    private float gzi = 1.0f;
    private float gzj = 1.0f;
    private boolean gzk = false;
    private ljq grN = null;
    private dkx gyZ = null;
    private float gzl = 1.0f;
    private float gzm = 1.0f;
    private float gzn = 1.0f;

    dig() {
        this.gqB = 72;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeMesh();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.checkMeshGrowth();
        this.checkMeshColor();
        this.checkMeshScale();
        if (this.isRelationEffect() && this.gyZ == null && this.gtf != null && this.gtf.blt()) {
            this.gyZ = this.setupPositionalRelation(this.getTargetObjectGUID(), this.gtf.getGUID(), this.getMainEffectObjectType());
        }
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.gza = 1.0f - this.gza;
        this.gzb = 1.0f - this.gzb;
        this.gzc = 1.0f - this.gzc;
        this.gzd = 1.0f - this.gzd;
        this.gze = 1.0f - this.gze;
        this.gzf = 1.0f - this.gzf;
        this.gzi = 1.0f - this.gzi;
        this.gzj = 1.0f - this.gzj;
        this.createMesh();
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dig dig2 = (dig)dgj2;
        dig2.ekh = this.ekh;
        dig2.grd = this.grd;
        dig2.gtj = this.gtj;
        dig2.gtk = this.gtk;
        dig2.gtl = this.gtl;
        dig2.gza = this.gza;
        dig2.gzb = this.gzb;
        dig2.gzc = this.gzc;
        dig2.gzd = this.gzd;
        dig2.gze = this.gze;
        dig2.gzf = this.gzf;
        dig2.gzg = this.gzg;
        dig2.gzh = this.gzh;
        dig2.gzi = this.gzi;
        dig2.gzj = this.gzj;
        dig2.gzk = this.gzk;
        dig2.grN = this.grN;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.ekh = "";
        this.gtj = 1.0f;
        this.gtk = 1.0f;
        this.grd = 0.8f;
        this.gtl = true;
        this.gza = 1.0f;
        this.gzb = 1.0f;
        this.gzc = 0.0f;
        this.gzd = 1.0f;
        this.gze = 1.0f;
        this.gzf = 1.0f;
        this.gzg = 1.0f;
        this.gzh = false;
        this.gzi = 1.0f;
        this.gzj = 0.0f;
        this.gzk = false;
        this.grN = new ljq();
    }

    protected void createMesh() {
        this.gtf = (dfm)dKP.Af(11);
        this.gtf.setGUID(this.getMainAtomGuid());
        this.gtf.setActive(true);
        this.gtf.setDefaultValues();
        this.gtf.setMeshXML(this.ekh);
        ljq ljq2 = new ljq(this.getTargetPosition());
        ljq2.es(this.grN);
        this.setDeltaPos(this.grN);
        this.gtf.c(ljq2);
        this.gtf.a(new lgl());
        this.gtf.n(new lcq(this.gza, this.gzc, this.gze, this.gzi));
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
        if ((double)this.grd < 1.0) {
            double d2 = this.MessageDelegator.arc().rgz - this.fC.rgz;
            float f2 = (float)(d2 / (double)this.getDuration());
            if (f2 < this.grd) {
                return;
            }
            float f3 = (f2 - this.grd) / (1.0f - this.grd);
            if (this.gzk) {
                f3 *= f3 * f3;
            }
            if (f3 > 1.0f) {
                f3 = 1.0f;
            } else if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            float f4 = ldq.o(this.gzi, this.gzj, f3);
            lcq lcq2 = new lcq(this.gzl, this.gzm, this.gzn, f4);
            this.gtf.n(lcq2);
        }
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
            f2 *= f2 * f2;
        }
        float f3 = this.gtj + (this.gtk - this.gtj) * f2;
        this.gtf.setScale(f3);
    }

    private void checkMeshGrowth() {
        if (this.hasInfiniteDuration()) {
            return;
        }
        double d2 = this.MessageDelegator.arc().rgz - this.fC.rgz;
        float f2 = (float)(d2 / (double)(this.getDuration() * this.gzg));
        if (this.gzh) {
            f2 *= f2 * f2;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        } else if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.gzl = ldq.o(this.gza, this.gzb, f2);
        this.gzm = ldq.o(this.gzc, this.gzd, f2);
        this.gzn = ldq.o(this.gze, this.gzf, f2);
        lcq lcq2 = new lcq(this.gzl, this.gzm, this.gzn, this.gzi);
        this.gtf.n(lcq2);
    }

    public String getMeshXML() {
        return this.ekh;
    }

    public void setMeshXML(String string) {
        this.ekh = string;
    }

    public float getFadeOutTimePercent() {
        return this.grd;
    }

    public void setFadeOutTimePercent(float f2) {
        this.grd = f2;
    }

    public float getMeshStartScale() {
        return this.gtj;
    }

    public void setMeshStartScale(float f2) {
        this.gtj = f2;
    }

    public float getMeshEndScale() {
        return this.gtk;
    }

    public void setMeshEndScale(float f2) {
        this.gtk = f2;
    }

    public boolean isNonLinearScale() {
        return this.gtl;
    }

    public void setNonLinearScale(boolean bl) {
        this.gtl = bl;
    }

    public float getXGrowStart() {
        return this.gza;
    }

    public void setXGrowStart(float f2) {
        this.gza = f2;
    }

    public float getXGrowEnd() {
        return this.gzb;
    }

    public void setXGrowEnd(float f2) {
        this.gzb = f2;
    }

    public float getYGrowStart() {
        return this.gzc;
    }

    public void setYGrowStart(float f2) {
        this.gzc = f2;
    }

    public float getYGrowEnd() {
        return this.gzd;
    }

    public void setYGrowEnd(float f2) {
        this.gzd = f2;
    }

    public float getZGrowStart() {
        return this.gze;
    }

    public void setZGrowStart(float f2) {
        this.gze = f2;
    }

    public float getZGrowEnd() {
        return this.gzf;
    }

    public void setZGrowEnd(float f2) {
        this.gzf = f2;
    }

    public float getGrowthDoneTimePercent() {
        return this.gzg;
    }

    public void setGrowthDoneTimePercent(float f2) {
        this.gzg = f2;
    }

    public boolean isNonLinearGrowth() {
        return this.gzh;
    }

    public void setNonLinearGrowth(boolean bl) {
        this.gzh = bl;
    }

    public float getStartTransparancy() {
        return this.gzi;
    }

    public void setStartTransparancy(float f2) {
        this.gzi = f2;
    }

    public float getEndTransparancy() {
        return this.gzj;
    }

    public void setEndTransparancy(float f2) {
        this.gzj = f2;
    }

    public boolean isNonLinearTransparancy() {
        return this.gzk;
    }

    public void setNonLinearTransparancy(boolean bl) {
        this.gzk = bl;
    }

    public ljq getTargetOffset() {
        return this.grN;
    }

    public void setTargetOffset(ljq ljq2) {
        this.grN = ljq2;
    }

    public dey getAtom(int n2) {
        return this.gtf;
    }

    public int getAtomCount() {
        return 1;
    }
}


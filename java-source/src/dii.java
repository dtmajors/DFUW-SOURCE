/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dii
extends dgj {
    private dfm gtf = null;
    private String ekh = null;
    private lcq gtg = null;
    private lcq gth = null;
    private float gtj = 1.0f;
    private float gtk = 1.0f;
    private boolean gzv = true;
    private ljq gzw = null;
    private ljq gzx = null;
    private boolean gzy = false;
    private ljq gzz = null;
    private ljq gzA = null;
    private boolean gzB = false;
    private float gse = 1.0f;
    private float gzC = 0.0f;
    private int gsd = 0;
    private dkx gyZ = null;
    private lgl gzD = null;
    private lgl gzE = null;

    dii() {
        this.gqB = 76;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeMesh();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        if (this.isRelationEffect() && this.gyZ == null && this.gtf != null && this.gtf.blt()) {
            this.setDeltaPos(new ljq(this.gzz));
            if (this.gzv && this.getSourceRotation() != null) {
                lgl lgl2 = new lgl(this.gzw);
                lgl2.Y(this.getSourceRotation());
                this.setDeltaRot(lgl2);
            } else {
                this.setDeltaRot(new lgl(this.gzw));
            }
            this.gyZ = this.setupPositionalRelation(this.getTargetObjectGUID(), this.gtf.getGUID(), this.getMainEffectObjectType());
        }
        this.updateMesh();
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
        dii dii2 = (dii)dgj2;
        dii2.ekh = this.ekh;
        dii2.gtg = this.gtg;
        dii2.gth = this.gth;
        dii2.gtj = this.gtj;
        dii2.gtk = this.gtk;
        dii2.gzv = this.gzv;
        dii2.gzw = this.gzw;
        dii2.gzx = this.gzx;
        dii2.gzy = this.gzy;
        dii2.gzz = this.gzz;
        dii2.gzA = this.gzA;
        dii2.gzB = this.gzB;
        dii2.gse = this.gse;
        dii2.gzC = this.gzC;
        dii2.gsd = this.gsd;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.ekh = "";
        this.gtg = lcq.BRIGHT_WHITE;
        this.gth = lcq.BRIGHT_WHITE;
        this.gtj = 1.0f;
        this.gtk = 1.0f;
        this.gzv = true;
        this.gzw = new ljq();
        this.gzx = new ljq();
        this.gzy = false;
        this.gzz = new ljq();
        this.gzA = new ljq();
        this.gzB = false;
        this.gse = 1.0f;
        this.gzC = 0.0f;
        this.gsd = 0;
    }

    protected void createMesh() {
        this.gtf = (dfm)dKP.Af(11);
        this.gtf.setGUID(this.getMainAtomGuid());
        this.gtf.setActive(true);
        this.gtf.setDefaultValues();
        this.gtf.setMeshXML(this.ekh);
        this.gtf.c(this.getTargetPosition());
        if (this.gzv && this.getSourceRotation() != null) {
            lgl lgl2 = new lgl(this.gzw);
            lgl2.Y(this.getSourceRotation());
            this.gtf.a(this.getSourceRotation());
        } else {
            this.gtf.a(new lgl(this.gzw));
        }
        this.gtf.n(this.gtg);
        if (this.gtj != 1.0f) {
            this.gtf.setScale(this.gtj);
        }
        this.MessageDelegator.a(this.gtf);
        this.gzD = new lgl(this.gzw);
        this.gzE = new lgl(this.gzx);
    }

    protected void removeMesh() {
        if (this.gtf != null) {
            dey.bls().b(this.gtf);
            this.gtf = null;
        }
    }

    private void updateMesh() {
        Object object;
        if (this.gtf == null) {
            return;
        }
        if (this.isRelationEffect() && this.gyZ == null) {
            return;
        }
        float f2 = ((float)(this.MessageDelegator.arc().rgz - this.fC.rgz) + this.gzC) * this.gse;
        float f3 = mfw.S(this.gsd, f2);
        f3 = lew.A(f3, 0.0f, 1.0f);
        if (!this.gtg.X(this.gth)) {
            object = lcq.a(this.gtg, this.gth, f3);
            this.gtf.n((lcq)object);
        }
        if (this.gtj != this.gtk) {
            float f4 = ldq.o(this.gtj, this.gtk, f3);
            this.gtf.setScale(f4);
        }
        if (this.gzy) {
            object = lgl.b(this.gzD, this.gzE, f3);
            if (this.isRelationEffect()) {
                this.gyZ.setDeltaRot((lgl)object);
            } else {
                this.gtf.a((lgl)object);
            }
        }
        if (this.gzB) {
            object = ljq.e(this.gzz, this.gzA, f3);
            if (this.isRelationEffect()) {
                this.gyZ.setDeltaPos((ljq)object);
            } else {
                this.gtf.c((ljq)object);
            }
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

    public boolean isUseSourceRotationIfAvailable() {
        return this.gzv;
    }

    public void setUseSourceRotationIfAvailable(boolean bl) {
        this.gzv = bl;
    }

    public ljq getStartRotation() {
        return this.gzw;
    }

    public void setStartRotation(ljq ljq2) {
        this.gzw = ljq2;
    }

    public ljq getEndRotation() {
        return this.gzx;
    }

    public void setEndRotation(ljq ljq2) {
        this.gzx = ljq2;
    }

    public boolean isLerpRotation() {
        return this.gzy;
    }

    public void setLerpRotation(boolean bl) {
        this.gzy = bl;
    }

    public ljq getStartOffset() {
        return this.gzz;
    }

    public void setStartOffset(ljq ljq2) {
        this.gzz = ljq2;
    }

    public ljq getEndOffset() {
        return this.gzA;
    }

    public void setEndOffset(ljq ljq2) {
        this.gzA = ljq2;
    }

    public boolean isLerpOffset() {
        return this.gzB;
    }

    public void setLerpOffset(boolean bl) {
        this.gzB = bl;
    }

    public float getLerpFrequency() {
        return this.gse;
    }

    public void setLerpFrequency(float f2) {
        this.gse = f2;
    }

    public float getLerpSeed() {
        return this.gzC;
    }

    public void setLerpSeed(float f2) {
        this.gzC = f2;
    }

    public int getLerpType() {
        return this.gsd;
    }

    public void setLerpType(int n2) {
        this.gsd = n2;
    }

    public dey getAtom(int n2) {
        return this.gtf;
    }

    public int getAtomCount() {
        return 1;
    }
}


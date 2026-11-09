/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class din
extends dgj {
    private dfm gtf = null;
    private ljq my = null;
    private String ekh = null;
    private String fFC = null;
    private String goN = null;
    private boolean gxs = false;
    private boolean gxt = false;
    private ljq gxu = new ljq();
    private float gxv = 0.3f;
    private float gxw = 0.0f;
    private boolean gzW = false;
    private lcq gtg = null;
    private lcq gth = null;
    private float gzX = 1.0f;
    private float gzY = 1.0f;
    private float grd = 0.8f;
    dkx gyZ = null;
    private int gzt = 0;

    public din() {
        this.gqB = 40;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeMesh();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        if (this.isRelationEffect() && this.gyZ == null && this.nx.lpr > this.gzt + 2) {
            this.gyZ = this.setupPositionalRelation(this.getTargetObjectGUID(), this.gtf.getGUID(), this.getMainEffectObjectType());
        }
        this.checkMeshRotation();
        this.checkMeshColor();
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.createMesh();
        this.gzt = this.nx.lpr;
        if (this.gxt) {
            this.gxu = new ljq((float)Math.random(), (float)Math.random(), (float)Math.random());
            this.gxu.normalize();
        }
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        din din2 = (din)dgj2;
        din2.my = this.my;
        din2.ekh = this.ekh;
        din2.fFC = this.fFC;
        din2.goN = this.goN;
        din2.gxs = this.gxs;
        din2.gxt = this.gxt;
        din2.gxu = this.gxu;
        din2.gxv = this.gxv;
        din2.gzW = this.gzW;
        din2.gtg = this.gtg;
        din2.gth = this.gth;
        din2.gzX = this.gzX;
        din2.gzY = this.gzY;
        din2.grd = this.grd;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.my = new ljq();
        this.ekh = "";
        this.fFC = "";
        this.goN = "";
        this.gxs = false;
        this.gxt = false;
        this.gxu = new ljq();
        this.gxv = 0.3f;
        this.gzW = false;
        this.gtg = lcq.BRIGHT_WHITE;
        this.gth = lcq.BRIGHT_WHITE;
        this.gzX = 1.0f;
        this.gzY = 1.0f;
        this.grd = 0.8f;
    }

    private void checkMeshColor() {
        if (this.hasInfiniteDuration()) {
            return;
        }
        if (this.gzW) {
            double d2 = (this.nx.rgz - this.getStartTime().rgz) / (double)this.getDuration();
            if (d2 > 1.0) {
                d2 = 1.0;
            }
            if (d2 < 0.0) {
                d2 = 0.0;
            }
            lcq lcq2 = lcq.a(this.gtg, this.gth, (float)d2);
            this.gtf.n(lcq2);
        } else if ((double)this.grd < 1.0) {
            double d3 = this.nx.rgz - this.fC.rgz;
            float f2 = (float)(d3 / (double)this.getDuration());
            if (f2 < this.grd) {
                return;
            }
            float f3 = (f2 - this.grd) / (1.0f - this.grd);
            f3 = lew.A(f3, 0.0f, 1.0f);
            lcq lcq3 = lcq.a(this.gtg, this.gth, f3);
            this.gtf.n(lcq3);
        }
    }

    private void checkMeshRotation() {
        if (!this.gxs) {
            return;
        }
        lgl lgl2 = new lgl(this.my);
        this.gxw = (float)((double)this.gxw + this.nx.qwh * (double)this.gxv);
        lgl lgl3 = new lgl(this.gxu, this.gxw);
        lgl2.Y(lgl3);
        this.gtf.a(lgl2);
        if (this.gyZ != null) {
            this.gyZ.setDeltaRot(lgl2);
        }
    }

    protected void createMesh() {
        this.gtf = (dfm)dKP.Af(11);
        this.gtf.setGUID(this.getMainAtomGuid());
        this.gtf.setActive(true);
        this.gtf.setDefaultValues();
        this.gtf.setMeshXML(this.ekh);
        this.gtf.c(this.getTargetPosition());
        this.gtf.a(new lgl(this.my));
        this.gtf.n(this.gtg);
        lcq lcq2 = new lcq(this.gzX, this.gzY, 1.0f, 1.0f);
        this.gtf.o(lcq2);
        if (this.goN != null && !this.goN.equals("")) {
            this.gtf.setGlobalShader(this.goN);
        }
        if (this.fFC != null && !this.fFC.equals("")) {
            this.gtf.u(0, this.fFC);
        }
        this.MessageDelegator.a(this.gtf);
    }

    protected void removeMesh() {
        if (this.gtf != null) {
            dey.bls().b(this.gtf);
            this.gtf = null;
        }
    }

    public float getFadeOutTimePercent() {
        return this.grd;
    }

    public void setFadeOutTimePercent(float f2) {
        this.grd = f2;
    }

    public String getGlobalShader() {
        return this.goN;
    }

    public void setGlobalShader(String string) {
        this.goN = string;
    }

    public boolean isLerpMeshDiffuse() {
        return this.gzW;
    }

    public void setLerpMeshDiffuse(boolean bl) {
        this.gzW = bl;
    }

    public lcq getMeshEndColor() {
        return this.gth;
    }

    public void setMeshEndColor(lcq lcq2) {
        this.gth = lcq2;
    }

    public lcq getMeshStartColor() {
        return this.gtg;
    }

    public void setMeshStartColor(lcq lcq2) {
        this.gtg = lcq2;
    }

    public String getMeshXML() {
        return this.ekh;
    }

    public void setMeshXML(String string) {
        this.ekh = string;
    }

    public boolean isRotateMesh() {
        return this.gxs;
    }

    public void setRotateMesh(boolean bl) {
        this.gxs = bl;
    }

    public ljq getRotation() {
        return this.my;
    }

    public void setRotation(ljq ljq2) {
        this.my = ljq2;
    }

    public ljq getRotationAxis() {
        return this.gxu;
    }

    public void setRotationAxis(ljq ljq2) {
        this.gxu = ljq2;
    }

    public float getRotationSpeedPrSec() {
        return this.gxv;
    }

    public void setRotationSpeedPrSec(float f2) {
        this.gxv = f2;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public boolean isUseRandomRotationAxis() {
        return this.gxt;
    }

    public void setUseRandomRotationAxis(boolean bl) {
        this.gxt = bl;
    }

    public float getScrollTextureU() {
        return this.gzX;
    }

    public void setScrollTextureU(float f2) {
        this.gzX = f2;
    }

    public float getScrollTextureV() {
        return this.gzY;
    }

    public void setScrollTextureV(float f2) {
        this.gzY = f2;
    }

    public dey getAtom(int n2) {
        return this.gtf;
    }

    public int getAtomCount() {
        return 1;
    }
}


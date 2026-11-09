/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dib
extends dgj {
    private dfm gtf = null;
    private ljq my = null;
    private String ekh = null;
    private lcq gxq = lcq.BRIGHT_WHITE;
    private lcq gxr = lcq.BRIGHT_WHITE;
    private String fFC = null;
    private String goN = null;
    private boolean gxs = false;
    private boolean gxt = false;
    private ljq gxu = new ljq();
    private float gxv = 0.3f;
    private float gxw = 0.0f;

    dib() {
        this.gqB = 30;
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.checkMeshRotation();
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
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeMesh();
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void initializeSpecialEffect() {
        assert (!this.isRelationEffect()) : "A MeshEffect MUST not be relationeffect";
        super.initializeSpecialEffect();
        this.createMesh();
        if (this.gxt) {
            this.gxu = new ljq((float)Math.random(), (float)Math.random(), (float)Math.random());
            this.gxu.normalize();
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
        this.gtf.n(this.gxq);
        this.gtf.o(this.gxr);
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

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dib dib2 = (dib)dgj2;
        dib2.ekh = this.ekh;
        dib2.my = this.my;
        dib2.gxq = this.gxq;
        dib2.gxr = this.gxr;
        dib2.fFC = this.fFC;
        dib2.goN = this.goN;
        dib2.gxs = this.gxs;
        dib2.gxt = this.gxt;
        dib2.gxu = this.gxu;
        dib2.gxv = this.gxv;
    }

    public void setDefaultValues() {
        this.my = new ljq();
        this.ekh = "DUMMY";
        this.gxq = lcq.BRIGHT_WHITE;
        this.gxr = lcq.BRIGHT_WHITE;
        this.fFC = "";
        this.goN = "";
        this.gxs = false;
        this.gxt = false;
        this.gxu = new ljq(0.0f, 1.0f, 0.0f);
        this.gxv = 0.3f;
    }

    public String getMeshXML() {
        return this.ekh;
    }

    public void setMeshXML(String string) {
        this.ekh = string;
    }

    public ljq getRotation() {
        return this.my;
    }

    public void setRotation(ljq ljq2) {
        this.my = ljq2;
    }

    public lcq getMeshColor() {
        return this.gxq;
    }

    public void setMeshColor(lcq lcq2) {
        this.gxq = lcq2;
    }

    public String getGlobalShader() {
        return this.goN;
    }

    public void setGlobalShader(String string) {
        this.goN = string;
    }

    public lcq getMeshAmbient() {
        return this.gxr;
    }

    public void setMeshAmbient(lcq lcq2) {
        this.gxr = lcq2;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public boolean isRotateMesh() {
        return this.gxs;
    }

    public void setRotateMesh(boolean bl) {
        this.gxs = bl;
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

    public boolean isUseRandomRotationAxis() {
        return this.gxt;
    }

    public void setUseRandomRotationAxis(boolean bl) {
        this.gxt = bl;
    }

    public dey getAtom(int n2) {
        return this.gtf;
    }

    public int getAtomCount() {
        return 1;
    }
}


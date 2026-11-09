/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dij
extends dgj {
    private dfm gtf = null;
    private ljq my = null;
    private String ekh = null;
    private lcq gxq = lcq.BRIGHT_WHITE;
    private lcq gxr = lcq.BRIGHT_WHITE;
    private String fFC = null;
    private String goN = null;

    public dij() {
        this.gqB = 43;
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
    }

    private void checkMeshRotation() {
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
    }

    protected void createMesh() {
        this.gtf = (dfm)dKP.Af(11);
        this.gtf.setGUID(this.getMainAtomGuid());
        this.gtf.setActive(true);
        this.gtf.setDefaultValues();
        this.gtf.setMeshXML(this.ekh);
        this.gtf.c(this.getTargetPosition());
        if (this.getSourceRotation() != null) {
            this.gtf.a(this.getSourceRotation());
        } else {
            this.gtf.a(new lgl());
        }
        this.gtf.n(this.gxq);
        this.gtf.o(this.gxr);
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
        dij dij2 = (dij)dgj2;
        dij2.ekh = this.ekh;
        dij2.my = this.my;
        dij2.gxq = this.gxq;
        dij2.gxr = this.gxr;
        dij2.fFC = this.fFC;
        dij2.goN = this.goN;
    }

    public void setDefaultValues() {
        this.my = new ljq();
        this.ekh = "DUMMY";
        this.gxq = lcq.BRIGHT_WHITE;
        this.gxr = lcq.BRIGHT_WHITE;
        this.fFC = "";
        this.goN = "";
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

    public dey getAtom(int n2) {
        return this.gtf;
    }

    public int getAtomCount() {
        return 1;
    }
}


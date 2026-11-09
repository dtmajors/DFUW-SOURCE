/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dic
extends dgj {
    private dfm gtf = null;
    private ljq gxx = null;
    private String ekh = null;
    private lcq gxq = lcq.BRIGHT_WHITE;
    private lcq gxr = lcq.BRIGHT_WHITE;
    private String fFC = null;
    private String goN = null;
    private float grd = 0.8f;
    private ldv doP = null;

    public dic() {
        this.gqB = 41;
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.checkFadeOut();
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeMesh();
        this.removeAttachPointRelation();
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void initializeSpecialEffect() {
        assert (!this.isRelationEffect()) : "A MeshAttachPointEffect MUST not be relationeffect";
        super.initializeSpecialEffect();
        amf amf2 = this.MessageDelegator.bzx().bzt().d(this.akX);
        if (amf2 == null) {
            return;
        }
        if (!(amf2 instanceof bvd)) {
            return;
        }
        bvd bvd2 = (bvd)amf2;
        eh eh2 = gmU.a(bvd2.av(), bvd2.aw(), this.getSourcePosition(), this.getTargetObjectGUID());
        if (eh2 == null) {
            return;
        }
        this.createMesh();
        this.createAttachPointRelation(eh2);
    }

    protected void createMesh() {
        this.gtf = (dfm)dKP.Af(11);
        this.gtf.setGUID(this.getMainAtomGuid());
        this.gtf.setActive(true);
        this.gtf.setDefaultValues();
        this.gtf.setMeshXML(this.ekh);
        this.gtf.c(this.getTargetPosition());
        this.gtf.a(new lgl(this.gxx));
        this.gtf.n(this.gxq);
        this.gtf.o(this.gxr);
        this.gtf.hS(true);
        if (this.goN != null && !this.goN.equals("")) {
            this.gtf.setGlobalShader(this.goN);
        }
        if (this.fFC != null && !this.fFC.equals("")) {
            this.gtf.u(0, this.fFC);
        }
        this.MessageDelegator.a(this.gtf);
    }

    private void createAttachPointRelation(eh eh2) {
        if (eh2.fa() != 0) {
            return;
        }
        assert (eh2.fa() == 0);
        this.doP = this.getNewEffectGuid();
        knd knd2 = (knd)this.MessageDelegator.h(775);
        knd2.wD(true);
        knd2.jM(true);
        knd2.aE(false);
        knd2.ts(this.getGUID());
        knd2.qj(this.getTargetObjectGUID());
        knd2.qk(this.gtf.getGUID());
        knd2.kX(this.doP);
        knd2.ak(eh2.getRotation());
        knd2.aj(eh2.fb());
        knd2.setFrameName(eh2.getFrameName());
        knd2.bM(new ljq(1.0f, 1.0f, 1.0f));
        knd2.Jd(1);
        this.MessageDelegator.a(knd2);
    }

    private void removeAttachPointRelation() {
        if (this.doP == null) {
            return;
        }
        knd knd2 = (knd)this.MessageDelegator.h(775);
        knd2.wD(false);
        knd2.jM(true);
        knd2.aE(false);
        knd2.ts(this.getGUID());
        knd2.kX(this.doP);
        knd2.Jd(2);
        this.MessageDelegator.a(knd2);
        this.MessageDelegator.oa(this.doP);
        this.doP = null;
    }

    protected void removeMesh() {
        if (this.gtf != null) {
            dey.bls().b(this.gtf);
            this.gtf = null;
        }
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dic dic2 = (dic)dgj2;
        dic2.ekh = this.ekh;
        dic2.gxx = this.gxx;
        dic2.gxq = this.gxq;
        dic2.gxr = this.gxr;
        dic2.fFC = this.fFC;
        dic2.goN = this.goN;
        dic2.grd = this.grd;
    }

    public void setDefaultValues() {
        this.gxx = new ljq();
        this.ekh = "DUMMY";
        this.gxq = lcq.BRIGHT_WHITE;
        this.gxr = lcq.BRIGHT_WHITE;
        this.fFC = "";
        this.goN = "";
        this.grd = 0.8f;
    }

    private void checkFadeOut() {
        if (this.gtf == null) {
            return;
        }
        if ((double)this.grd < 1.0) {
            double d2 = this.nx.rgz - this.fC.rgz;
            float f2 = (float)(d2 / (double)this.getDuration());
            if (f2 < this.grd) {
                return;
            }
            lcq lcq2 = lcq.BRIGHT_WHITE;
            float f3 = (f2 - this.grd) / (1.0f - this.grd);
            f3 = lew.A(f3, 0.0f, 1.0f);
            lcq lcq3 = lcq.BRIGHT_WHITE_TRANSPARENT;
            lcq lcq4 = lcq.a(lcq2, lcq3, f3);
            this.gtf.n(lcq4);
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

    public lcq getMeshAmbient() {
        return this.gxr;
    }

    public void setMeshAmbient(lcq lcq2) {
        this.gxr = lcq2;
    }

    public lcq getMeshColor() {
        return this.gxq;
    }

    public void setMeshColor(lcq lcq2) {
        this.gxq = lcq2;
    }

    public String getMeshXML() {
        return this.ekh;
    }

    public void setMeshXML(String string) {
        this.ekh = string;
    }

    public ljq getObjectStartRotation() {
        return this.gxx;
    }

    public void setObjectStartRotation(ljq ljq2) {
        this.gxx = ljq2;
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


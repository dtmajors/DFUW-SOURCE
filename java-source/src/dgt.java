/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.Map;

public class dgt
extends dgj {
    private dfm gtf = null;
    private String ekh = null;
    private lcq gtg = null;
    private lcq gth = null;
    private boolean gti = false;
    private float gtj = 1.0f;
    private float gtk = 1.0f;
    private boolean gtl = false;
    private ljq gtm = null;
    private ljq gtn = null;
    private String gto = "";
    private ljq gtb = null;
    private lgl gtc = null;
    private String gtd = null;
    private ldv gte = null;

    dgt() {
        this.gqB = 83;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeAttachPointRelation();
        this.removeMesh();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        if (this.gtf == null) {
            return;
        }
        this.checkMeshColor();
        this.checkMeshScale();
        if (this.isRelationEffect() && this.gte == null && this.gtf != null && this.gtf.blt()) {
            lgl lgl2 = new lgl(this.gtm);
            lgl2.Y(this.gtc);
            this.setDeltaRot(lgl2);
            ljq ljq2 = new ljq(this.gtn);
            ljq2.es(this.gtb);
            this.setDeltaPos(ljq2);
            this.createAttachPointRelation();
        }
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        if (!this.isRelationEffect()) {
            return;
        }
        this.checkAttachPoint();
        if (this.gtd == null || this.gtb == null || this.gtc == null) {
            return;
        }
        this.createMesh();
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dgt dgt2 = (dgt)dgj2;
        dgt2.ekh = this.ekh;
        dgt2.gtg = this.gtg;
        dgt2.gth = this.gth;
        dgt2.gtj = this.gtj;
        dgt2.gtk = this.gtk;
        dgt2.gtl = this.gtl;
        dgt2.gti = this.gti;
        dgt2.gtm = this.gtm;
        dgt2.gtn = this.gtn;
        dgt2.gto = this.gto;
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
        this.gtm = new ljq();
        this.gtn = new ljq();
        this.gto = "";
    }

    private void checkAttachPoint() {
        this.gtc = new lgl();
        if (!this.isRelationEffect()) {
            return;
        }
        if (this.getTargetObjectGUID() == null) {
            return;
        }
        amf amf2 = this.MessageDelegator.bzx().bzt().d(this.getTargetObjectGUID());
        if (amf2 == null) {
            return;
        }
        if (!(amf2 instanceof bvd)) {
            return;
        }
        bvd bvd2 = (bvd)amf2;
        Map<String, eh> map = ei.ao(bvd2.getFileName());
        eh eh2 = map.get(this.gto);
        if (eh2 == null) {
            return;
        }
        if (eh2.fa() != 0) {
            return;
        }
        if (eh2.getFrameName() == null) {
            return;
        }
        if (eh2.getFrameName().equals("")) {
            return;
        }
        if (eh2.getFrameName().equals("no frame")) {
            return;
        }
        this.gtb = new ljq(eh2.fb());
        this.gtc = new lgl(eh2.getRotation());
        this.gtd = eh2.getFrameName();
    }

    protected void createMesh() {
        this.gtf = (dfm)dKP.Af(11);
        this.gtf.setGUID(this.getMainAtomGuid());
        this.gtf.setActive(true);
        this.gtf.setDefaultValues();
        this.gtf.setMeshXML(this.ekh);
        this.gtf.hS(true);
        ljq ljq2 = new ljq(this.getTargetPosition());
        ljq2.es(this.gtn);
        ljq2.es(this.gtb);
        this.gtf.c(ljq2);
        lgl lgl2 = new lgl(this.gtm);
        lgl2.Y(this.gtc);
        this.gtf.a(lgl2);
        this.gtf.n(this.gtg);
        if (this.gtj != 1.0f) {
            this.gtf.setScale(this.gtj);
        }
        this.MessageDelegator.a(this.gtf);
    }

    private void createAttachPointRelation() {
        this.gte = this.getNewEffectGuid();
        knd knd2 = (knd)this.MessageDelegator.h(775);
        knd2.wD(false);
        knd2.jM(true);
        knd2.aE(false);
        knd2.lQ(false);
        knd2.ts(this.getGUID());
        knd2.qj(this.getTargetObjectGUID());
        knd2.qk(this.gtf.getGUID());
        knd2.kX(this.gte);
        knd2.ak(this.getDeltaRot().eqT());
        knd2.aj(this.getDeltaPos());
        knd2.setFrameName(this.gtd);
        knd2.bM(new ljq(1.0f, 1.0f, 1.0f));
        knd2.Jd(1);
        this.MessageDelegator.a(knd2);
    }

    private void removeAttachPointRelation() {
        if (this.gte == null) {
            return;
        }
        knd knd2 = (knd)this.MessageDelegator.h(775);
        knd2.wD(false);
        knd2.jM(true);
        knd2.aE(false);
        knd2.ts(this.getGUID());
        knd2.kX(this.gte);
        knd2.Jd(2);
        this.MessageDelegator.a(knd2);
        this.MessageDelegator.oa(this.gte);
        this.gte = null;
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

    public ljq getDeltaRotation() {
        return this.gtm;
    }

    public void setDeltaRotation(ljq ljq2) {
        this.gtm = ljq2;
    }

    public ljq getDeltaPosition() {
        return this.gtn;
    }

    public void setDeltaPosition(ljq ljq2) {
        this.gtn = ljq2;
    }

    public String getMeshAttachPointName() {
        return this.gto;
    }

    public void setMeshAttachPointName(String string) {
        this.gto = string;
    }

    public dey getAtom(int n2) {
        return this.gtf;
    }

    public int getAtomCount() {
        return 1;
    }
}


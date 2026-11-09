/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.ArrayList;
import java.util.Map;

public class dim
extends dgj {
    private dfm gtf = null;
    private String ekh = null;
    private lcq gtg = null;
    private lcq gth = null;
    private boolean gti = false;
    private float gtj = 1.0f;
    private float gtk = 1.0f;
    private boolean gtl = false;
    private boolean gzv = true;
    private ljq gtm = null;
    private ljq gtn = null;
    private boolean gzU = false;
    private String gto = "";
    private dkx gyZ = null;
    private ljq gtb = null;
    private lgl gtc = null;
    private String gxC = "";
    private String gxD = "";
    private String gxE = "";
    private String gxF = "";
    private float gzV = 1.0f;

    dim() {
        this.gqB = 54;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeMesh();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.checkMeshColor();
        this.checkMeshScale();
        if (this.isRelationEffect() && this.gyZ == null && this.gtf != null && this.gtf.blt()) {
            Object object;
            if (this.gzv && this.getSourceRotation() != null) {
                object = new lgl(this.gtm);
                ((lgl)object).Y(this.getSourceRotation());
                if (this.gzU) {
                    ((lgl)object).Y(this.gtc);
                }
                this.setDeltaRot((lgl)object);
            } else {
                object = new lgl(this.gtm);
                if (this.gzU) {
                    ((lgl)object).Y(this.gtc);
                }
                this.setDeltaRot((lgl)object);
            }
            object = new ljq(this.gtn);
            if (this.gzU) {
                ((ljq)object).es(this.gtb);
            }
            this.setDeltaPos((ljq)object);
            this.gyZ = this.setupPositionalRelation(this.getTargetObjectGUID(), this.gtf.getGUID(), this.getMainEffectObjectType());
        }
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.checkAttachPoint();
        this.createMesh();
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dim dim2 = (dim)dgj2;
        dim2.ekh = this.ekh;
        dim2.gtg = this.gtg;
        dim2.gth = this.gth;
        dim2.gtj = this.gtj;
        dim2.gtk = this.gtk;
        dim2.gtl = this.gtl;
        dim2.gti = this.gti;
        dim2.gzv = this.gzv;
        dim2.gtm = this.gtm;
        dim2.gtn = this.gtn;
        dim2.gzU = this.gzU;
        dim2.gto = this.gto;
        dim2.gxC = this.gxC;
        dim2.gxD = this.gxD;
        dim2.gxE = this.gxE;
        dim2.gxF = this.gxF;
        dim2.gzV = this.gzV;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.ekh = "";
        this.gtg = lcq.BRIGHT_WHITE;
        this.gth = lcq.BRIGHT_WHITE_TRANSPARENT;
        this.gtj = 1.0f;
        this.gtk = 1.0f;
        this.gtl = true;
        this.gti = false;
        this.gzv = true;
        this.gtm = new ljq();
        this.gtn = new ljq();
        this.gzU = false;
        this.gto = "";
        this.gzV = 1.0f;
        this.gxC = "";
        this.gxD = "";
        this.gxE = "";
        this.gxF = "";
    }

    private void checkAttachPoint() {
        if (!this.gzU) {
            return;
        }
        this.gtb = new ljq();
        this.gtc = new lgl();
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
        this.gtb = new ljq(eh2.fb());
        this.gtc = new lgl(eh2.getRotation());
    }

    private String getRandomXMLName() {
        ArrayList<String> arrayList = lcn.emv();
        arrayList.add(this.ekh);
        if (this.gxC.length() > 0) {
            arrayList.add(this.gxC);
        }
        if (this.gxD.length() > 0) {
            arrayList.add(this.gxD);
        }
        if (this.gxE.length() > 0) {
            arrayList.add(this.gxE);
        }
        if (this.gxF.length() > 0) {
            arrayList.add(this.gxF);
        }
        int n2 = (int)(Math.random() * (double)arrayList.size()) % arrayList.size();
        return (String)arrayList.get(n2);
    }

    protected void createMesh() {
        this.gtf = (dfm)dKP.Af(11);
        this.gtf.aO(true);
        this.gtf.setGUID(this.getMainAtomGuid());
        this.gtf.setActive(true);
        this.gtf.setDefaultValues();
        this.gtf.setMeshXML(this.getRandomXMLName());
        ljq ljq2 = new ljq(this.getTargetPosition());
        ljq2.es(this.gtn);
        if (this.gzU) {
            ljq2.es(this.gtb);
        }
        this.gtf.c(ljq2);
        if (this.gzv && this.getSourceRotation() != null) {
            lgl lgl2 = new lgl(this.gtm);
            lgl2.Y(this.getSourceRotation());
            if (this.gzU) {
                lgl2.Y(this.gtc);
            }
            this.gtf.a(lgl2);
        } else {
            lgl lgl3 = new lgl(this.gtm);
            if (this.gzU) {
                lgl3.Y(this.gtc);
            }
            if (!this.isRelationEffect()) {
                this.gtf.a(lgl3);
            } else {
                this.gtf.a(new lgl());
            }
        }
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
        this.gtf.setScale(f3 * this.gzV);
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

    public boolean isNonLinearColorFade() {
        return this.gti;
    }

    public void setNonLinearColorFade(boolean bl) {
        this.gti = bl;
    }

    public boolean isNonLinearScale() {
        return this.gtl;
    }

    public void setNonLinearScale(boolean bl) {
        this.gtl = bl;
    }

    public boolean isUseSourceRotationIfAvailable() {
        return this.gzv;
    }

    public void setUseSourceRotationIfAvailable(boolean bl) {
        this.gzv = bl;
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

    public boolean isUseMeshAttachPoint() {
        return this.gzU;
    }

    public void setUseMeshAttachPoint(boolean bl) {
        this.gzU = bl;
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

    public dfm getMeshAtom() {
        return this.gtf;
    }

    public void setMeshAtom(dfm dfm2) {
        this.gtf = dfm2;
    }

    public String getMeshXML1() {
        return this.gxC;
    }

    public void setMeshXML1(String string) {
        this.gxC = string;
    }

    public String getMeshXML2() {
        return this.gxD;
    }

    public void setMeshXML2(String string) {
        this.gxD = string;
    }

    public String getMeshXML3() {
        return this.gxE;
    }

    public void setMeshXML3(String string) {
        this.gxE = string;
    }

    public String getMeshXML4() {
        return this.gxF;
    }

    public void setMeshXML4(String string) {
        this.gxF = string;
    }

    public void setScaleMultiplier(float f2) {
        this.gzV = f2;
    }
}


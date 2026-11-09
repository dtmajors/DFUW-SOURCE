/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.ArrayList;

public class djv
extends dgj {
    private dfm gtf = null;
    private String ekh = null;
    private float grd = 0.8f;
    private lcq gtg = null;
    private lcq gth = null;
    private float gtj = 1.0f;
    private float gtk = 1.0f;
    private boolean gtl = true;
    private String gxC = "";
    private String gxD = "";
    private String gxE = "";
    private String gxF = "";
    dkx gyZ = null;

    djv() {
        this.gqB = 48;
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
        djv djv2 = (djv)dgj2;
        djv2.ekh = this.ekh;
        djv2.gtg = this.gtg;
        djv2.gth = this.gth;
        djv2.grd = this.grd;
        djv2.gtj = this.gtj;
        djv2.gtk = this.gtk;
        djv2.gtl = this.gtl;
        djv2.gxC = this.gxC;
        djv2.gxD = this.gxD;
        djv2.gxE = this.gxE;
        djv2.gxF = this.gxF;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.ekh = "";
        this.gtg = lcq.BRIGHT_WHITE;
        this.gth = lcq.BRIGHT_WHITE;
        this.gtj = 1.0f;
        this.gtk = 1.0f;
        this.grd = 0.8f;
        this.gtl = true;
        this.gxC = "";
        this.gxD = "";
        this.gxE = "";
        this.gxF = "";
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
        int n = (int)(Math.random() * (double)arrayList.size()) % arrayList.size();
        return (String)arrayList.get(n);
    }

    protected void createMesh() {
        this.gtf = (dfm)dKP.Af(11);
        this.gtf.setGUID(this.getMainAtomGuid());
        this.gtf.setActive(true);
        this.gtf.setDefaultValues();
        this.gtf.setMeshXML(this.getRandomXMLName());
        this.gtf.c(this.getTargetPosition());
        this.gtf.a(new lgl());
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
        if ((double)this.grd < 1.0) {
            double d2 = this.MessageDelegator.arc().rgz - this.fC.rgz;
            float f = (float)(d2 / (double)this.getDuration());
            if (f < this.grd) {
                return;
            }
            float f2 = (f - this.grd) / (1.0f - this.grd);
            f2 = lew.A(f2, 0.0f, 1.0f);
            lcq lcq2 = lcq.a(this.gtg, this.gth, f2);
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
        float f = (float)(d2 / (double)this.getDuration());
        if (this.gtl) {
            f *= f * f;
        }
        float f2 = this.gtj + (this.gtk - this.gtj) * f;
        this.gtf.setScale(f2);
    }

    public float getFadeOutTimePercent() {
        return this.grd;
    }

    public void setFadeOutTimePercent(float f) {
        this.grd = f;
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

    public float getMeshEndScale() {
        return this.gtk;
    }

    public void setMeshEndScale(float f) {
        this.gtk = f;
    }

    public float getMeshStartScale() {
        return this.gtj;
    }

    public void setMeshStartScale(float f) {
        this.gtj = f;
    }

    public boolean isNonLinearScale() {
        return this.gtl;
    }

    public void setNonLinearScale(boolean bl) {
        this.gtl = bl;
    }

    public dey getAtom(int n) {
        return this.gtf;
    }

    public int getAtomCount() {
        return 1;
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
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.List;

public class dgp
extends dgj {
    private List gsi = lcn.emI();
    private float bpE = 0.0f;
    private float aSc = 0.0f;
    private int eMf = 360;
    private int eMg = 360;
    private ljq eMh = new ljq(0.0f, 1.0f, 0.0f);
    private long dKH = 0L;
    private String gsj = null;
    private String gsk = null;
    private String gsl = null;
    private String gsm = null;
    private String gsn = null;
    private double gso = 0.0;
    private double gsp = 0.0;
    private double gsq = 0.0;
    private double gsr = 0.0;
    private ldv gss = null;

    dgp() {
        this.gqB = 33;
        this.gqA = Float.valueOf(-1.0f);
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        if (this.gss != null) {
            kid kid2 = (kid)this.MessageDelegator.h(1288);
            kid2.setActive(true);
            kid2.tA(this.getTargetObjectGUID());
            kid2.XI(2);
            kid2.tB(this.gss);
            this.MessageDelegator.a(kid2);
        }
        for (dfc dfc2 : this.gsi) {
            this.removeAudio(dfc2);
        }
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
    }

    protected int getMainEffectObjectType() {
        return 3;
    }

    protected void initializeSpecialEffect() {
        Object object2;
        lko[] lkoArray;
        if (!this.isRelationEffect()) {
            return;
        }
        super.initializeSpecialEffect();
        List<Object> list = lcn.emI();
        if (this.gsk != null && this.gsk != "") {
            lkoArray = this.createAudio(this.gsk);
            this.gsi.add(lkoArray);
            object2 = new lko();
            ((lko)object2).tB(lkoArray.getGUID());
            ((lko)object2).em(this.gso);
            ((lko)object2).setSetName(this.gsj);
            list.add(object2);
        }
        if (this.gsl != null && this.gsl != "") {
            lkoArray = this.createAudio(this.gsl);
            this.gsi.add(lkoArray);
            object2 = new lko();
            ((lko)object2).tB(lkoArray.getGUID());
            ((lko)object2).em(this.gsp);
            ((lko)object2).setSetName(this.gsj);
            list.add(object2);
        }
        if (this.gsm != null && this.gsm != "") {
            lkoArray = this.createAudio(this.gsm);
            this.gsi.add(lkoArray);
            object2 = new lko();
            ((lko)object2).tB(lkoArray.getGUID());
            ((lko)object2).em(this.gsq);
            ((lko)object2).setSetName(this.gsj);
            list.add(object2);
        }
        if (this.gsn != null && this.gsn != "") {
            lkoArray = this.createAudio(this.gsn);
            this.gsi.add(lkoArray);
            object2 = new lko();
            ((lko)object2).tB(lkoArray.getGUID());
            ((lko)object2).em(this.gsr);
            ((lko)object2).setSetName(this.gsj);
            list.add(object2);
        }
        if (this.isRelationEffect()) {
            for (Object object2 : this.gsi) {
                this.setupPositionalRelation(this.getTargetObjectGUID(), ((amf)object2).getGUID(), this.getMainEffectObjectType());
            }
        }
        lkoArray = list.toArray(new lko[list.size()]);
        object2 = (kid)this.MessageDelegator.h(1288);
        ((kid)object2).setActive(true);
        ((kid)object2).tA(this.getTargetObjectGUID());
        ((kid)object2).a(lkoArray);
        ((kid)object2).XI(1);
        this.gss = this.getNewEffectGuid();
        ((kii)object2).tB(this.gss);
        this.MessageDelegator.a((khd)object2);
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dgp dgp2 = (dgp)dgj2;
        dgp2.bpE = this.bpE;
        dgp2.aSc = this.aSc;
        dgp2.eMf = this.eMf;
        dgp2.eMg = this.eMg;
        dgp2.eMh = this.eMh;
        dgp2.dKH = this.dKH;
        dgp2.gsk = this.gsk;
        dgp2.gsl = this.gsl;
        dgp2.gsm = this.gsm;
        dgp2.gsn = this.gsn;
        dgp2.gso = this.gso;
        dgp2.gsp = this.gsp;
        dgp2.gsq = this.gsq;
        dgp2.gsr = this.gsr;
        dgp2.gsj = this.gsj;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.bpE = 20.0f;
        this.aSc = 5.0f;
        this.eMf = 360;
        this.eMg = 360;
        this.eMh = new ljq(0.0f, 1.0f, 0.0f);
        this.dKH = 0L;
        this.gsk = "";
        this.gsl = "";
        this.gsm = "";
        this.gsn = "";
        this.gso = 0.0;
        this.gsp = 0.0;
        this.gsq = 0.0;
        this.gsr = 0.0;
        this.gsj = "";
    }

    protected dfc createAudio(String string) {
        dfc dfc2 = (dfc)dKP.Af(4);
        dfc2.setGUID(this.getNewEffectGuid());
        dfc2.setActive(true);
        dfc2.setConeOrientation(this.eMh);
        dfc2.setConeOutsideVolume(this.dKH);
        dfc2.setInsideConeAngle(this.eMf);
        dfc2.setLooping(false);
        dfc2.hO(false);
        dfc2.setMaxDistance(this.bpE);
        dfc2.setMinDistance(this.aSc);
        dfc2.setMode(0);
        dfc2.setOutsideConeAngle(this.eMg);
        dfc2.setPlayingOnce(false);
        dfc2.bi(new ljq());
        dfc2.setXMLFileName(string);
        if (this.getTargetPosition() != null) {
            dfc2.bK(this.getTargetPosition());
        } else {
            dfc2.bK(new ljq());
        }
        dfc2.c(this);
        this.MessageDelegator.a(dfc2);
        return dfc2;
    }

    protected void removeAudio(dfc dfc2) {
        if (dfc2 == null) {
            return;
        }
        dey.bls().b(dfc2);
    }

    public ljq getConeOrientation() {
        return this.eMh;
    }

    public void setConeOrientation(ljq ljq2) {
        this.eMh = ljq2;
    }

    public long getConeOutsideVolume() {
        return this.dKH;
    }

    public void setConeOutsideVolume(long l2) {
        this.dKH = l2;
    }

    public int getInsideConeAngle() {
        return this.eMf;
    }

    public void setInsideConeAngle(int n2) {
        this.eMf = n2;
    }

    public float getMaxDistance() {
        return this.bpE;
    }

    public void setMaxDistance(float f2) {
        this.bpE = f2;
    }

    public float getMinDistance() {
        return this.aSc;
    }

    public void setMinDistance(float f2) {
        this.aSc = f2;
    }

    public int getOutsideConeAngle() {
        return this.eMg;
    }

    public void setOutsideConeAngle(int n2) {
        this.eMg = n2;
    }

    public double getPosition1() {
        return this.gso;
    }

    public void setPosition1(double d2) {
        this.gso = d2;
    }

    public double getPosition2() {
        return this.gsp;
    }

    public void setPosition2(double d2) {
        this.gsp = d2;
    }

    public double getPosition3() {
        return this.gsq;
    }

    public void setPosition3(double d2) {
        this.gsq = d2;
    }

    public double getPosition4() {
        return this.gsr;
    }

    public void setPosition4(double d2) {
        this.gsr = d2;
    }

    public String getSetName() {
        return this.gsj;
    }

    public void setSetName(String string) {
        this.gsj = string;
    }

    public String getXMLFileName1() {
        return this.gsk;
    }

    public void setXMLFileName1(String string) {
        this.gsk = string;
    }

    public String getXMLFileName2() {
        return this.gsl;
    }

    public void setXMLFileName2(String string) {
        this.gsl = string;
    }

    public String getXMLFileName3() {
        return this.gsm;
    }

    public void setXMLFileName3(String string) {
        this.gsm = string;
    }

    public String getXMLFileName4() {
        return this.gsn;
    }

    public void setXMLFileName4(String string) {
        this.gsn = string;
    }
}


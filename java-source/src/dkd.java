/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  cbx
 *  dgj
 *  lkv
 */
public class dkd
extends dgj {
    protected String ctI = "";
    protected String gCR = "";
    protected ljq gtC = new ljq(0.0f, 0.0f, 0.0f);
    protected ljq gCS = new ljq(0.0f, 0.0f, 0.0f);
    protected String gBL = "normal_idle";
    protected bvc gCT = null;

    public dkd() {
        this.gqB = 104;
    }

    public String getMeshName() {
        return this.ctI;
    }

    public void setMeshName(String string) {
        this.ctI = string;
    }

    public String getAttachpoint() {
        return this.gCR;
    }

    public void setAttachpoint(String string) {
        this.gCR = string;
    }

    public ljq getOffsetPos() {
        return this.gtC;
    }

    public void setOffsetPos(ljq ljq2) {
        this.gtC = ljq2;
    }

    public ljq getOffsetRot() {
        return this.gCS;
    }

    public void setOffsetRot(ljq ljq2) {
        this.gCS = ljq2;
    }

    public String getAnimationState() {
        return this.gBL;
    }

    public void setAnimationState(String string) {
        this.gBL = string;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dkd dkd2 = (dkd)dgj2;
        dkd2.ctI = this.ctI;
        dkd2.gCR = this.gCR;
        dkd2.gtC = this.gtC.esF();
        dkd2.gCS = this.gCS.esF();
        dkd2.gBL = this.gBL;
    }

    protected void initializeSpecialEffect() {
        eh eh2;
        String string;
        Object object;
        Object object2;
        Object object3;
        super.initializeSpecialEffect();
        jyg jyg2 = new jyg(false);
        if (this.gCT != null) {
            return;
        }
        this.gCT = (bvf)jyg2.d(this.ctI, bve.a.dQu);
        if (this.gCT == null) {
            return;
        }
        this.gCT.setGUID(this.getNewEffectGuid());
        ljq ljq2 = this.gtC.esF();
        ljq ljq3 = this.gCS.esF();
        if (this.gCR.length() > 0 && (object3 = this.MessageDelegator.bzx().bzt().d(this.akX)) != null && object3 instanceof cbx && (object2 = (cbx)object3).aIh() != null && (object = ei.ao(string = object2.aIh().getFileName())) != null && (eh2 = object.get(this.gCR)) != null) {
            ljq2 = eh2.fb().esF();
            ljq3 = eh2.getRotation().esF();
        }
        object3 = null;
        object3 = this.getSourceRotation() != null ? this.getSourceRotation().eqV() : new lgl();
        ljq2 = ((lgl)object3).eq(ljq2);
        object2 = this.getTargetPosition().esF();
        ((ljq)object2).es(ljq2);
        this.gCT.c((ljq)object2);
        ((lgl)object3).Y(new lgl(ljq3));
        this.gCT.a((lgl)object3);
        this.MessageDelegator.a(this.gCT);
        int n = lkv.AG((String)this.gBL);
        if (n != -1) {
            object = (dzv)this.MessageDelegator.h(7425, this.getGUID(), this.gCT.getGUID());
            ((dzv)object).dTs = n;
            this.MessageDelegator.F((dxq)object);
        }
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        if (this.gCT != null) {
            this.MessageDelegator.hd(this.gCT.getGUID());
            this.gCT = null;
        }
    }
}


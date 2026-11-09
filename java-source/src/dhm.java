/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cew
 *  dgj
 *  lcr
 */
public class dhm
extends dgj {
    private String gvL = null;
    private String gvM = null;
    private String gvN = null;

    dhm() {
        this.gqB = 39;
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
    }

    protected int getMainEffectObjectType() {
        return 6;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.removeHead();
        this.startSpecialEffects();
    }

    private void removeHead() {
        kla kla2 = (kla)this.MessageDelegator.h(1028);
        kla2.wD(false);
        kla2.jM(false);
        kla2.HW(4);
        kla2.ts(this.getGUID());
        kla2.hC(this.getTargetObjectGUID());
        kla2.YK(0);
        kla2.setVisible(false);
        this.MessageDelegator.a(kla2);
        bvd bvd2 = (bvd)this.MessageDelegator.bzx().bzt().d(this.getTargetObjectGUID());
        assert (bvd2 != null);
        cbx cbx2 = bvd2.aze();
        cew cew2 = (cew)cbx2;
        if (cew2.aMf() != null) {
            cew2.aMf().aTy();
        }
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dhm dhm2 = (dhm)dgj2;
        dhm2.gvL = this.gvL;
        dhm2.gvM = this.gvM;
        dhm2.gvN = this.gvN;
    }

    public void setDefaultValues() {
        this.gvL = "";
        this.gvM = "";
        this.gvN = "";
    }

    private void startSpecialEffects() {
        glh glh2;
        assert (this.getTargetObjectGUID() != null);
        int n2 = del.dr(this.gvL);
        if (n2 >= 0) {
            glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEa);
            glh2.setSpecialEffectType(n2);
            glh2.o(0.0);
            glh2.setTargetPosition(this.getTargetPosition());
            glh2.setTargetObjectGUID(this.getTargetObjectGUID());
            glh2.mj(true);
            this.MessageDelegator.F(glh2);
        }
        n2 = del.dr(this.gvM);
        if (n2 >= 0) {
            glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEa);
            glh2.setSpecialEffectType(n2);
            glh2.o(0.0);
            glh2.setTargetPosition(this.getTargetPosition());
            glh2.setTargetObjectGUID(this.getTargetObjectGUID());
            glh2.mj(true);
            this.MessageDelegator.F(glh2);
        }
        n2 = del.dr(this.gvN);
        if (n2 >= 0) {
            glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEa);
            glh2.setSpecialEffectType(n2);
            glh2.o(0.0);
            glh2.setTargetPosition(this.getTargetPosition());
            glh2.setTargetObjectGUID(this.getTargetObjectGUID());
            glh2.mj(true);
            this.MessageDelegator.F(glh2);
        }
    }

    public String getBloodFountaintEffectName() {
        return this.gvN;
    }

    public void setBloodFountaintEffectName(String string) {
        this.gvN = string;
    }

    public String getSoundEffectName() {
        return this.gvM;
    }

    public void setSoundEffectName(String string) {
        this.gvM = string;
    }

    public String getSplatEffectName() {
        return this.gvL;
    }

    public void setSplatEffectName(String string) {
        this.gvL = string;
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cew
 *  dgj
 *  lcr
 */
import java.util.ArrayList;

public class dhc
extends dgj {
    private dla gul = null;
    private dfm gtf = null;
    private String ekh = null;
    private String gum = null;
    private String gun = null;

    public dhc() {
        this.gqB = 36;
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.checkForHits();
    }

    private void checkForHits() {
        if (this.gul == null) {
            return;
        }
        if (!this.gul.boB()) {
            return;
        }
        this.gul.ih(false);
        gmR.w(this.gul.boJ(), 1.0f);
        if (this.gul.isDone()) {
            this.removeMesh();
            this.startBloodSplat();
        }
    }

    private void startBloodSplat() {
        int n2 = del.dr("se_blood_fountain3");
        if (n2 < 0) {
            return;
        }
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEa);
        glh2.setSpecialEffectType(n2);
        glh2.o(0.0);
        ljq ljq2 = new ljq(this.gul.boJ());
        glh2.setTargetPosition(ljq2);
        glh2.mj(true);
        this.MessageDelegator.F(glh2);
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeBouncer();
        this.removeMesh();
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.createMesh();
        this.createBouncer();
        this.removeHead();
    }

    private void createFountainSFX() {
        int n2 = del.dr("se_blood_fountain_head");
        if (n2 < 0) {
            return;
        }
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEa);
        glh2.setSpecialEffectType(n2);
        glh2.o(0.0);
        glh2.setTargetPosition(this.getTargetPosition());
        glh2.setTargetObjectGUID(this.getTargetObjectGUID());
        glh2.mj(true);
        this.MessageDelegator.F(glh2);
    }

    protected void createBouncer() {
        this.gul = new dla();
        this.gul.setGUID(this.getNewEffectGuid());
        this.gul.setMeshAtom(this.gtf);
        ljq ljq2 = new ljq(this.getTargetPosition());
        ljq2.es(new ljq(0.0f, 2.0f, 0.0f));
        this.gul.bN(ljq2);
        ljq ljq3 = new ljq((float)Math.random() - 0.5f, 1.0f, (float)Math.random() - 0.5f);
        ljq3.normalize();
        if (!ljq3.isNormalized()) {
            ljq3 = new ljq(0.0f, 1.0f, 0.0f);
        }
        this.gul.setStartDirection(ljq3);
        this.gul.gS((float)this.nx.rgz);
        ArrayList<ldv> arrayList = lcn.emv();
        arrayList.add(this.getTargetObjectGUID());
        arrayList.add(this.gtf.getGUID());
        this.gul.aE(arrayList);
        this.MessageDelegator.a(this.gul);
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

    private void removeBouncer() {
        if (this.gul != null) {
            this.MessageDelegator.hd(this.gul.getGUID());
        }
    }

    protected void createMesh() {
        this.gtf = (dfm)dKP.Af(11);
        this.gtf.setGUID(this.getNewEffectGuid());
        this.gtf.setActive(true);
        this.gtf.setDefaultValues();
        this.gtf.setMeshXML(this.ekh);
        ljq ljq2 = new ljq(this.getTargetPosition());
        ljq2.es(new ljq(0.0f, 2.0f, 0.0f));
        this.gtf.c(ljq2);
        this.gtf.a(new lgl());
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
        dhc dhc2 = (dhc)dgj2;
        dhc2.ekh = this.ekh;
    }

    public void setDefaultValues() {
        this.ekh = "DUMMY";
    }

    public String getMeshXML() {
        return this.ekh;
    }

    public void setMeshXML(String string) {
        this.ekh = string;
    }
}


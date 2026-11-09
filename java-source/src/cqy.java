/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class cqy {
    private boolean avz = false;
    private dxr MessageDelegator = null;
    private cqw eWb = null;
    private cqz eWy = new cqz();
    private crb eWz = new crb();
    private crd eWA = new crd();
    private crh eWB = new crh();
    private crk eWC = new crk();
    private crm eWD = new crm();
    private crf eWE = new crf();
    private cru eWF = new cru();
    private crv eWG = new crv();
    private crx eWH = new crx();

    private void aZA() {
        this.z(this.eWy);
        this.z(this.eWz);
        this.z(this.eWA);
        this.z(this.eWB);
        this.z(this.eWC);
        this.z(this.eWD);
        this.z(this.eWE);
        this.z(this.eWF);
        this.z(this.eWG);
        this.z(this.eWH);
    }

    private void aZB() {
        this.A(this.eWy);
        this.A(this.eWz);
        this.A(this.eWA);
        this.A(this.eWB);
        this.A(this.eWC);
        this.A(this.eWD);
        this.A(this.eWE);
        this.A(this.eWF);
        this.A(this.eWG);
        this.A(this.eWH);
    }

    private void z(Object object) {
        fjt fjt2 = new fjt();
        fjt2.Name = object.getClass().getSimpleName();
        fjt2.ila = true;
        fjt2.iOi = object.getClass();
        fjt2.on(lcr.acL);
        fjt2.f(this.eWb.getGUID());
        this.MessageDelegator.F(fjt2);
    }

    private void A(Object object) {
        fjt fjt2 = new fjt();
        fjt2.Name = object.getClass().getSimpleName();
        fjt2.ila = false;
        fjt2.iOi = Class.class;
        fjt2.on(lcr.acL);
        fjt2.f(this.eWb.getGUID());
        this.MessageDelegator.F(fjt2);
    }

    public cqy(cqw cqw2, dxr dxr2) {
        this.eWb = cqw2;
        this.MessageDelegator = dxr2;
    }

    public boolean isEnabled() {
        return this.avz;
    }

    public void setEnabled(boolean bl) {
        if (this.avz == bl) {
            return;
        }
        if (this.avz) {
            this.aoJ();
            this.aZB();
        } else {
            this.aZA();
            this.aZC();
        }
        this.avz = bl;
    }

    public void receiveRenderResponse(kgz kgz2) {
        if (!this.avz) {
            return;
        }
        switch (kgz2.X()) {
            case 3: {
                this.a((kgx)kgz2);
                break;
            }
            case 4: {
                this.a((kgy)kgz2);
                break;
            }
            default: {
                lfn.b(5, "SFRenderSensorManager", "receiveRenderResponse() Unknown type!");
                assert (false);
                break;
            }
        }
    }

    private void a(kgx kgx2) {
        this.eWy.b(kgx2);
        this.eWz.b(kgx2);
        this.eWA.b(kgx2);
        this.eWB.b(kgx2);
        this.eWC.b(kgx2);
        this.eWD.b(kgx2);
        this.eWE.b(kgx2);
        this.a(this.eWy);
        this.a(this.eWz);
        this.a(this.eWA);
        this.a(this.eWB);
        this.a(this.eWC);
        this.a(this.eWD);
        this.a(this.eWE);
    }

    private void a(crj crj2) {
        Object object;
        block2: {
            object = null;
            try {
                object = crj2.clone();
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                cloneNotSupportedException.printStackTrace();
                if ($assertionsDisabled) break block2;
                throw new AssertionError();
            }
        }
        fju fju2 = new fju();
        fju2.Name = crj2.getClass().getSimpleName();
        fju2.lu = object;
        fju2.on(lcr.acL);
        this.MessageDelegator.F(fju2);
    }

    private void a(kgy kgy2) {
        this.eWF.b(kgy2);
        this.eWG.b(kgy2);
        this.eWH.b(kgy2);
        this.a(this.eWF);
        this.a(this.eWG);
        this.a(this.eWH);
    }

    private void aoJ() {
        kgg kgg2 = this.aZU();
        kgg2.WN(2);
        this.MessageDelegator.b(kgg2);
    }

    private void aZC() {
        kgg kgg2 = this.aZU();
        kgg2.WN(1);
        this.MessageDelegator.b(kgg2);
    }

    private kgg aZU() {
        kgg kgg2 = (kgg)this.MessageDelegator.BV(10);
        kgg2.sy(this.eWb.getGUID());
        kgg2.tr(this.eWb.getGUID());
        kgg2.ts(this.eWb.getGUID());
        return kgg2;
    }
}


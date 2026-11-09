/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class cqv {
    private dxr MessageDelegator = null;
    private cqw eWb = null;
    private cro eWc = new cro();
    private crp eWd = new crp();
    private crq eWe = new crq();
    private crr eWf = new crr();
    private crt eWg = new crt();
    private boolean avz = false;

    public cqv(cqw cqw2, dxr dxr2) {
        this.eWb = cqw2;
        this.MessageDelegator = dxr2;
    }

    private void aZA() {
        this.z(this.eWc);
        this.z(this.eWd);
        this.z(this.eWe);
        this.z(this.eWf);
        this.z(this.eWg);
    }

    private void aZB() {
        this.A(this.eWc);
        this.A(this.eWd);
        this.A(this.eWe);
        this.A(this.eWf);
        this.A(this.eWg);
    }

    public void a(kwf kwf2) {
        if (!this.avz) {
            return;
        }
        assert (kwf2.eYA != null);
        this.eWc.b(kwf2);
        this.eWd.b(kwf2);
        this.eWe.b(kwf2);
        this.eWf.b(kwf2);
        this.eWg.b(kwf2);
        this.a(this.eWc);
        this.a(this.eWd);
        this.a(this.eWe);
        this.a(this.eWf);
        this.a(this.eWg);
    }

    private void a(crs crs2) {
        Cloneable cloneable;
        Object object;
        block5: {
            object = null;
            try {
                object = crs2.clone();
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                cloneNotSupportedException.printStackTrace();
                if ($assertionsDisabled) break block5;
                throw new AssertionError();
            }
        }
        if (crs2 instanceof cro) {
            cloneable = (cro)crs2;
            assert (((cro)cloneable).eYA != null);
            assert (((cro)cloneable).eYB != null);
        }
        cloneable = new fju();
        ((fju)cloneable).Name = crs2.getClass().getSimpleName();
        ((fju)cloneable).lu = object;
        ((dxq)cloneable).on(lcr.acL);
        this.MessageDelegator.F((dxq)cloneable);
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

    private void aoJ() {
        kpa kpa2 = this.aZD();
        kpa2.ZX(2);
        this.MessageDelegator.a(kpa2);
    }

    private void aZC() {
        kpa kpa2 = this.aZD();
        kpa2.ZX(1);
        this.MessageDelegator.a(kpa2);
    }

    kpa aZD() {
        kpa kpa2 = (kpa)this.MessageDelegator.h(537);
        kpa2.sy(this.eWb.getGUID());
        kpa2.ts(this.eWb.getGUID());
        kpa2.lQ(false);
        kpa2.wD(false);
        kpa2.jM(false);
        return kpa2;
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  mcs
 */
public class dal
extends czb {
    @Override
    protected void hh(boolean bl) {
        this.b(cwx.a.fGw);
        this.b(cxd.p.fSf);
        this.beA();
    }

    protected void beA() {
        assert (!this.fGZ);
        byv byv2 = this.emI.bgQ().aJD().aEP();
        if (!byv2.Uu()) {
            lfn.b(5, "SFFireDepthChargesSkill", "doAction() SkillOwner is not attached.");
            this.a(cwx.a.fGx, false);
            this.ber();
            return;
        }
        ceh ceh2 = (ceh)this.emI.bgQ().aJM();
        if (!ceh2.aKT()) {
            lfn.b(5, "SFFireDepthChargesSkill", "doAction() SkillOwner is not attached to a boat.");
            this.a(cwx.a.fGx, false);
            this.ber();
            return;
        }
        ldv ldv2 = ceh2.aKS();
        if (ldv2 == null) {
            lfn.b(5, "SFFireDepthChargesSkill", "doAction() ExternalObjectGUID is null.");
            this.a(cwx.a.fGx, false);
            this.ber();
            return;
        }
        this.ms(ldv2);
    }

    private void ms(ldv ldv2) {
        if (ldv2 == null) {
            this.a(cwx.a.fGx, false);
            this.ber();
            assert (false);
            return;
        }
        eck eck2 = (eck)this.MessageDelegator.h(3080, this.GUID, ldv2);
        eck2.Ri = this.jk().bgR().mA().getGUID();
        this.MessageDelegator.F(eck2);
    }

    private void a(ecj ecj2) {
        if (ecj2.eo) {
            this.beB();
            this.a(cwx.a.fGx, false);
            this.bhr();
            return;
        }
        switch (ecj2.ex) {
            case 2: {
                this.a(mcs.uyY.bD(new Object[0]));
                break;
            }
            case 3: {
                this.a(mcs.uza.bD(new Object[0]));
                break;
            }
            case 0: {
                this.a(mcs.uzb.bD(new Object[0]));
                break;
            }
            case 1: {
                this.a(mcs.uyZ.bD(new Object[0]));
            }
        }
        this.a(cwx.a.fGx, false);
        this.ber();
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 3081: {
                this.a((ecj)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }
}


/*
 * Decompiled with CFR.
 */
public class lk
extends btk {
    private cnd atx = null;
    private li ZI = null;
    private ldv aty = null;
    private ldv atv = null;

    public lk(li li2) {
        this.ZI = li2;
    }

    public void a(ldv ldv2, cnd cnd2) {
        assert (this.ZI.oO());
        assert (ldv2 != null);
        if (this.aty != null) {
            cnd2.gw(false);
            return;
        }
        this.aty = ldv2;
        this.atx = cnd2;
        fhi fhi2 = (fhi)this.MessageDelegator.h(23839, this.getGUID(), this.aty);
        this.MessageDelegator.F(fhi2);
    }

    private void a(fhj fhj2) {
        assert (this.atx != null);
        assert (this.aty != null);
        if (!this.ZI.oO()) {
            this.ZI.aQ().c(mcc.uoB.bD(new Object[0]));
            this.atx.gw(false);
            this.aty = null;
            this.atx = null;
            return;
        }
        if (fhj2.aGQ != null && !fhj2.atg) {
            this.ZI.aQ().c(mcc.uoA.bD(new Object[0]));
            this.atx.gw(false);
            this.aty = null;
            this.atx = null;
            return;
        }
        fho fho2 = (fho)this.MessageDelegator.h(23841, this.getGUID(), this.aty);
        fho2.iMt = this.ZI.aQ().getGUID();
        fho2.aGQ = this.ZI.oS();
        this.MessageDelegator.F(fho2);
    }

    private void a(fhp fhp2) {
        assert (this.atx != null);
        assert (this.aty != null);
        switch (fhp2.ew) {
            case 1: {
                this.ZI.aQ().c(mcc.uoA.bD(new Object[0]));
                break;
            }
            case 2: {
                this.ZI.aQ().c(mcc.urG.bD(new Object[0]));
                break;
            }
            case 3: {
                this.ZI.aQ().c(mcc.urH.bD(new Object[0]));
                break;
            }
            case 4: {
                this.ZI.aQ().c(mcc.urI.bD(new Object[0]));
                break;
            }
            case 5: {
                this.ZI.aQ().c(mcc.urJ.bD(new Object[0]));
                break;
            }
            default: {
                assert (false) : "Unknown result :" + fhp2.ew;
                break;
            }
        }
        this.atx.gw(fhp2.ew == 5);
        this.atx = null;
        this.aty = null;
    }

    public void oZ() {
        if (this.atx != null) {
            this.atx.aUg();
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 23840: {
                this.a((fhj)dxq2);
                break;
            }
            case 23842: {
                this.a((fhp)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }
}


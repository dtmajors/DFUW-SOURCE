/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 *  azn
 *  lcr
 */
public class bdk
extends btk {
    private ayd dao = null;
    private azn dap = null;
    private dqf daq;

    public bdk(ayd ayd2, azn azn2) {
        this.dao = ayd2;
        this.dap = azn2;
        this.daq = new dqf(this);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 13918: {
                this.a((enz)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(enz enz2) {
        this.daq.a(enz2);
        amo[] amoArray = this.daq.btb();
        this.dap.a(2048, amoArray);
    }

    public void c(bbr bbr2) {
        if (bbr2.qf()) {
            amo[] amoArray = new amo[]{new amo(), new amo(), new amo()};
            ldv ldv2 = this.z(bbr2);
            if (ldv2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "updateClient() : clan member has null client GUID");
                return;
            }
            eqw eqw2 = (eqw)this.MessageDelegator.h(32047, this.dao.getGUID(), ldv2);
            eqw2.c(amoArray);
            this.MessageDelegator.F(eqw2);
        }
    }

    private ldv z(bbr bbr2) {
        return bbr2.jr() <= 0 ? null : lcr.p((ldv)lcr.qEv, (int)bbr2.jr(), (int)bbr2.abB().enw());
    }

    private void A(bbr bbr2) {
    }

    public void g(bbr bbr2) {
        if (bbr2.qf()) {
            this.dap.a(bbr2, this.daq.btb());
        }
    }

    public void a(bbr bbr2) {
        if (bbr2.qf()) {
            this.dap.a(bbr2, this.daq.btb());
        }
    }

    private void B(bbr bbr2) {
    }
}


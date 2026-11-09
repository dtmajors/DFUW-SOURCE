/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class cvw
extends cvv {
    public cvw(int n) {
        super(n, false);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4868: {
                this.a((gap)dxq2);
                break;
            }
            case 4878: {
                this.b((gbb)dxq2);
                break;
            }
            case 4879: {
                this.a((gbc)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gap gap2) {
        assert (this.fEK == cwg.a.fEM);
        if (gap2.fBi <= 0) {
            return;
        }
        if (gap2.fBj == null) {
            return;
        }
        if (gap2.bpJ == null) {
            return;
        }
        this.fEK = cwg.a.fEO;
        this.fBi = gap2.fBi;
        this.fBj = gap2.fBj;
        this.bpJ = gap2.bpJ;
        this.bcK();
    }

    private void b(gbb gbb2) {
        assert (this.fEK != cwg.a.fEM);
        ldv ldv2 = this.bdv();
        if (!gbb2.aO().tV(ldv2)) {
            return;
        }
        this.fEK = cwg.a.fEQ;
        this.fBi = 0;
        this.fBj = null;
        this.bpJ = null;
        gbb2.f(this.GUID);
        gbb2.on(lcr.acL);
        this.MessageDelegator.F(gbb2);
        this.bdw();
    }

    private void a(gbc gbc2) {
        if (!gbc2.aO().equals(lcr.acL)) {
            return;
        }
        if (this.fEK == cwg.a.fEQ) {
            return;
        }
        this.fEK = cwg.a.fEP;
        gbc2.f(this.GUID);
        gbc2.on(this.bdv());
        this.MessageDelegator.F(gbc2);
    }

    private void bcK() {
        assert (this.fEK == cwg.a.fEO);
        assert (this.fBi > 0);
        gap gap2 = (gap)this.MessageDelegator.h(4868, this.GUID, lcr.acL);
        gap2.fBi = this.fBi;
        this.MessageDelegator.F(gap2);
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bri
 */
public class cvx
extends cvv {
    private boolean fBk = false;

    public cvx(int n) {
        super(n, true);
    }

    public boolean bF(ljq ljq2) {
        assert (this.bpJ != null);
        assert (ljq2 != null);
        if (this.fBk && !this.bdt().aFh().aJz().yI(this.fBi)) {
            return true;
        }
        float f2 = Math.abs(this.bpJ.ez(ljq2));
        return f2 > 11.0f;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4868: {
                this.a((gap)dxq2);
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

    @Override
    public void Ci() {
        assert (this.fEK == cwg.a.fEO);
        this.bcL();
    }

    private void bcL() {
        this.fEK = cwg.a.fEQ;
        bqv bqv2 = this.bdt().aFh().aJC();
        if (bqv2 != null && bqv2.asf() != null) {
            ((bri)bqv2.asf()).avO();
        }
        if (!this.fBk) {
            this.bcI();
        }
        this.fBi = 0;
        this.fBj = null;
        this.bpJ = null;
        this.fBk = false;
        this.bdw();
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
        gap2.f(this.GUID);
        gap2.on(this.bdk());
        gap2.aYH = this.aYH;
        this.MessageDelegator.F(gap2);
    }

    private void a(gbc gbc2) {
        ldv ldv2 = this.bdu();
        if (!gbc2.aO().tV(ldv2)) {
            return;
        }
        if (this.fEK == cwg.a.fEQ) {
            return;
        }
        if (this.bdt().aFh().aJz().yI(this.fBi)) {
            this.bcI();
            this.fBk = true;
        } else {
            this.bcL();
        }
    }

    private void bcI() {
        assert (this.fEK != cwg.a.fEM);
        gbb gbb2 = (gbb)this.MessageDelegator.h(4878, this.GUID, this.bdu());
        this.MessageDelegator.F(gbb2);
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  brg
 */
public class cwp
extends cwn {
    public cwp(int n2) {
        super(n2, true);
    }

    public boolean bF(ljq ljq2) {
        assert (this.fFv != null);
        assert (ljq2 != null);
        float f2 = Math.abs(this.fFv.ez(ljq2));
        return f2 > 11.0f;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4872: {
                this.a((gav)dxq2);
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
        this.bdU();
    }

    private void bdU() {
        this.fEK = cwg.a.fEQ;
        if (this.fFw) {
            assert (this.dxF != null);
            bqv bqv2 = this.bdt().aFh().aJC();
            if (bqv2 != null && bqv2.asf() != null) {
                brg brg2 = (brg)bqv2.asf();
                brg2.jf(this.dxF);
            }
        }
        this.lS(this.bdu());
        this.lS(this.fFu);
        this.fFu = null;
        this.fFv = null;
        this.fFw = false;
        this.dxF = null;
        this.bdw();
    }

    private void a(gav gav2) {
        assert (this.fEK == cwg.a.fEM);
        if (gav2.fFu == null) {
            return;
        }
        if (gav2.fFv == null) {
            return;
        }
        this.fEK = cwg.a.fEO;
        this.fFu = gav2.fFu;
        this.fFv = gav2.fFv;
        this.fFw = gav2.fFw;
        if (this.fFw) {
            this.dxF = this.MessageDelegator.bzv();
            brg brg2 = (brg)this.bdt().aFh().aJC().asf();
            brg2.je(this.dxF);
        }
        gav2.f(this.GUID);
        gav2.on(this.bdk());
        gav2.aYH = this.aYH;
        gav2.dxF = this.dxF;
        this.MessageDelegator.F(gav2);
        this.bl(this.bdk().ib(), this.gO().enw());
    }

    private void a(gbc gbc2) {
        ldv ldv2 = this.bdu();
        if (!gbc2.aO().tV(ldv2) && gbc2.aO().ib() > 1023) {
            return;
        }
        if (this.fEK == cwg.a.fEQ) {
            return;
        }
        this.bdU();
    }

    private void bl(int n2, int n3) {
        assert (this.fFu != null);
        assert (n2 > 0);
        fjv fjv2 = (fjv)this.MessageDelegator.h(11777, this.GUID, this.fFu);
        fjv2.RB = n2;
        this.MessageDelegator.F(fjv2);
    }

    private void lS(ldv ldv2) {
        assert (this.fEK != cwg.a.fEM);
        assert (ldv2 != null);
        gbb gbb2 = (gbb)this.MessageDelegator.h(4878, this.GUID, ldv2);
        this.MessageDelegator.F(gbb2);
    }
}


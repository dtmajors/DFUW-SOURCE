/*
 * Decompiled with CFR.
 */
public class cwj
extends cwh {
    private boolean fzR = false;
    private boolean fzS = false;

    public cwj(int n) {
        super(n, true);
    }

    public boolean bF(ljq ljq2) {
        assert (this.fES != null);
        assert (ljq2 != null);
        float f2 = Math.abs(this.fES.ez(ljq2));
        return f2 > 11.0f;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4870: {
                this.a((gat)dxq2);
                break;
            }
            case 4879: {
                this.a((gbc)dxq2);
                break;
            }
            case 9989: {
                this.a((gnu)dxq2);
                break;
            }
            case 9990: {
                this.a((gns)dxq2);
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
        this.bdx();
    }

    private void bdx() {
        this.fEK = cwg.a.fEQ;
        if (this.fzR) {
            this.lS(this.eOt);
        }
        if (this.fzS) {
            this.lS(this.bdu());
        }
        this.eOt = null;
        this.fES = null;
        this.bdw();
    }

    private void a(gat gat2) {
        assert (this.fEK == cwg.a.fEM);
        if (gat2.eOt == null) {
            return;
        }
        if (gat2.fES == null) {
            return;
        }
        this.fEK = cwg.a.fEO;
        this.eOt = gat2.eOt;
        this.fES = gat2.fES;
        this.z(this.bdk().ib(), this.gO());
    }

    private void a(gbc gbc2) {
        ldv ldv2 = this.bdu();
        if (!gbc2.aO().tV(ldv2)) {
            return;
        }
        if (this.fEK == cwg.a.fEQ) {
            return;
        }
        this.bdx();
    }

    private void a(gns gns2) {
        if (this.eOt == null) {
            return;
        }
        if (!this.eOt.equals(gns2.aO())) {
            return;
        }
        this.bdx();
    }

    private void a(gnu gnu2) {
        assert (this.eOt != null);
        assert (this.fES != null);
        if (!gnu2.jns) {
            this.bdx();
            return;
        }
        this.fzS = true;
        gat gat2 = (gat)this.MessageDelegator.h(4870, this.GUID, this.bdk());
        gat2.aYH = this.aYH;
        gat2.eOt = this.eOt;
        gat2.fES = this.fES;
        this.MessageDelegator.F(gat2);
    }

    private void lS(ldv ldv2) {
        assert (this.fEK != cwg.a.fEM);
        assert (ldv2 != null);
        gbb gbb2 = (gbb)this.MessageDelegator.h(4878, this.GUID, ldv2);
        this.MessageDelegator.F(gbb2);
    }

    private void z(int n, ldv ldv2) {
        assert (this.eOt != null);
        assert (n > 0);
        assert (ldv2 != null);
        gnt gnt2 = (gnt)this.MessageDelegator.h(9988, this.GUID, this.eOt);
        gnt2.RB = n;
        gnt2.Tr = ldv2;
        this.MessageDelegator.F(gnt2);
        this.fzR = true;
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class cvo
extends cvn
implements bto {
    private cng fzQ = null;

    public cvo(int n) {
        super(n, false);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.fzQ != null && this.fzQ.arY()) {
            this.fzQ.lf(this.GUID);
            this.Active = false;
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4865: {
                this.a((gam)dxq2);
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

    @Override
    protected void lR(ldv ldv2) {
        assert (this.dAv.equals(ldv2));
        this.fzQ = (cng)((Object)this.d(ldv2));
        this.Active = true;
    }

    private void a(gam gam2) {
        assert (this.fEK == cwg.a.fEM);
        this.fzO = cwf.a.getBankType(gam2.jcI);
        if (this.fzO == null) {
            lfn.b(5, "SFBankSessionHandlerClient", "handleSessionBeginBankMessage() BankTypeOrdinal is invalid.");
            return;
        }
        if (gam2.dAv == null) {
            lfn.b(5, "SFBankSessionHandlerClient", "handleSessionBeginBankMessage() BankGUID is null.");
            return;
        }
        if (gam2.fzP == null) {
            lfn.b(5, "SFBankSessionHandlerClient", "handleSessionBeginBankMessage() BankPosition is null.");
            return;
        }
        this.fEK = cwg.a.fEO;
        this.dAv = lcr.ak((ldv)gam2.dAv, (int)this.GUID.ib());
        this.fzP = gam2.fzP;
        this.iL(this.dAv);
    }

    private void b(gbb gbb2) {
        assert (this.fEK != cwg.a.fEM);
        ldv ldv2 = this.bdv();
        if (!gbb2.aO().tV(ldv2)) {
            lfn.b(5, "SFBankSessionHandlerClient", "handleSessionEndMessage() Message received from unknown object.");
            lfn.b(5, "SFBankSessionHandlerClient", "handleSessionEndMessage() FromGUID=" + gbb2.aO() + " ServerSessionHandlerGUID=" + ldv2);
            return;
        }
        this.fEK = cwg.a.fEQ;
        if (this.fzQ != null) {
            gbb2.f(this.GUID);
            gbb2.on(this.dAv);
            this.MessageDelegator.F(gbb2);
        }
        this.fzO = null;
        this.dAv = null;
        this.fzP = null;
        this.bdw();
    }

    private void a(gbc gbc2) {
        if (this.fEK == cwg.a.fEQ) {
            lfn.b(5, "SFBankSessionHandlerClient", "handleSessionEndRequest() Bank session is already stopped.");
            return;
        }
        if (!gbc2.aO().equals(this.dAv)) {
            lfn.b(5, "SFBankSessionHandlerClient", "handleSessionEndRequest() Message received from unknown object.");
            lfn.b(5, "SFBankSessionHandlerClient", "handleSessionEndRequest() FromGUID=" + gbc2.aO() + " BankGUID=" + this.dAv);
            return;
        }
        this.fEK = cwg.a.fEP;
        gbc2.f(this.GUID);
        gbc2.on(this.bdv());
        this.MessageDelegator.F(gbc2);
        gbb gbb2 = (gbb)this.MessageDelegator.h(4878, this.GUID, this.dAv);
        this.MessageDelegator.F(gbb2);
        this.fzQ = null;
    }
}


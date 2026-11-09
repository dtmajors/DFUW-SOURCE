/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.LinkedList;

public class rk
extends qd {
    private sg aPM;
    private LinkedList<Integer> aPN;
    private String aMH;

    public rk(md md2) {
        super(md2, me.axy);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aPM = this.f(new sg(this));
    }

    @Override
    public void cleanUp() {
        this.e(this.aPM);
        this.aPM = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aPM.start();
    }

    @Override
    protected void sP() {
        this.aPN = null;
        this.aMH = null;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            this.ca(qe2.getErrorMessage());
            return;
        }
        this.aPN = this.aPM.tP();
        this.tE();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7198: {
                this.a((fzf)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fzf fzf2) {
        if (fzf2.aMH != null) {
            lfn.b(5, "SFPersistenceWorkerGetExpirableCharacters", "handlePersistenceManagerOperationResponseMessage: Error expiring " + fzf2.bSR() + ": " + fzf2.aMH);
            this.aMH = fzf2.aMH;
        }
        this.tE();
    }

    private void tE() {
        if (this.aPN == null || this.aPN.isEmpty()) {
            this.ca(this.aMH);
            return;
        }
        int n = this.aPN.poll();
        ldv ldv2 = lcr.abW((int)n);
        fze fze2 = (fze)this.MessageDelegator.h(7197, this.getGUID(), lcr.ak((ldv)lcr.qAW, (int)ldv2.ib()));
        fze2.hC(ldv2);
        fze2.a(px.aJR);
        this.MessageDelegator.E(fze2);
    }
}


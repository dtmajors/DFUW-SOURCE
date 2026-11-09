/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class cwi
extends cwh
implements bto {
    private cng fET = null;

    public cwi(int n) {
        super(n, false);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.fET != null) {
            if (this.fET.aUh()) {
                this.fET.aUi();
            }
            if (this.fET.arY()) {
                this.fET.lf(this.GUID);
                this.Active = false;
            }
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4870: {
                this.a((gat)dxq2);
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
        assert (this.eOt.equals(ldv2));
        this.fET = (cng)((Object)this.d(ldv2));
        this.Active = true;
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
        this.eOt = lcr.ak((ldv)gat2.eOt, (int)this.GUID.ib());
        this.fES = gat2.fES;
        this.iL(this.eOt);
    }

    private void b(gbb gbb2) {
        assert (this.fEK != cwg.a.fEM);
        ldv ldv2 = this.bdv();
        if (!gbb2.aO().tV(ldv2)) {
            return;
        }
        this.fEK = cwg.a.fEQ;
        if (this.fET != null) {
            gbb2.f(this.GUID);
            gbb2.on(this.eOt);
            this.MessageDelegator.F(gbb2);
        }
        this.eOt = null;
        this.fES = null;
        this.fET = null;
        this.bdw();
    }

    private void a(gbc gbc2) {
        if (this.fEK == cwg.a.fEQ) {
            return;
        }
        if (!gbc2.aO().equals(this.eOt)) {
            return;
        }
        this.fEK = cwg.a.fEP;
        gbc2.f(this.GUID);
        gbc2.on(this.bdv());
        this.MessageDelegator.F(gbc2);
        gbb gbb2 = (gbb)this.MessageDelegator.h(4878, this.GUID, this.eOt);
        this.MessageDelegator.F(gbb2);
        this.fET = null;
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class cwo
extends cwn
implements bto {
    private cpv fFx = null;

    public cwo(int n) {
        super(n, false);
    }

    public final cpv bdT() {
        return this.fFx;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.fFx == null || this.fFx.aYl() == null) {
            return;
        }
        if (!((boj)this.fFx.aYl()).arY()) {
            return;
        }
        boj boj2 = (boj)this.fFx.aYl();
        if (this.fFw) {
            if (!this.bdt().aFh().aJC().asf().aun().cF(this.dxF)) {
                return;
            }
            lfn.b(5, "test", "DynamicContainerGUID2=" + this.dxF);
            boj2.ic(this.dxF);
        }
        if (((boj)this.fFx.aYl()).asq()) {
            boj2.ib(this.GUID);
        } else {
            gbc gbc2 = (gbc)this.MessageDelegator.h(4879, this.getGUID(), this.getGUID());
            this.receiveMessage(gbc2);
        }
        this.Active = false;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4872: {
                this.a((gav)dxq2);
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
        assert (this.fFu.equals(ldv2));
        this.fFx = (cpv)((Object)this.d(ldv2));
        this.Active = true;
    }

    private void a(gav gav2) {
        assert (this.fEK == cwg.a.fEM);
        if (gav2.fFu == null) {
            return;
        }
        if (gav2.fFv == null) {
            return;
        }
        if (gav2.fFw && gav2.dxF == null) {
            return;
        }
        this.fEK = cwg.a.fEO;
        this.fFu = lcr.ak((ldv)gav2.fFu, (int)this.GUID.ib());
        this.fFv = gav2.fFv;
        this.fFw = gav2.fFw;
        if (gav2.dxF != null) {
            this.dxF = lcr.ak((ldv)gav2.dxF, (int)this.GUID.ib());
        }
        this.iL(this.fFu);
    }

    private void b(gbb gbb2) {
        assert (this.fEK != cwg.a.fEM);
        ldv ldv2 = this.bdv();
        if (!gbb2.aO().tV(ldv2)) {
            return;
        }
        this.fEK = cwg.a.fEQ;
        if (this.fFx != null) {
            gbb2.f(this.GUID);
            gbb2.on(this.fFu);
            this.MessageDelegator.F(gbb2);
        }
        this.fFu = null;
        this.fFv = null;
        this.fFw = false;
        this.dxF = null;
        this.fFx = null;
        this.bdw();
    }

    private void a(gbc gbc2) {
        if (this.fEK == cwg.a.fEQ) {
            return;
        }
        this.fEK = cwg.a.fEP;
        gbc2.f(this.GUID);
        gbc2.on(this.bdv());
        this.MessageDelegator.F(gbc2);
        gbb gbb2 = (gbb)this.MessageDelegator.h(4878, this.GUID, this.fFu);
        this.MessageDelegator.F(gbb2);
        this.fFx = null;
    }
}


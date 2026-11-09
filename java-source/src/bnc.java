/*
 * Decompiled with CFR.
 */
import java.util.HashMap;

public class bnc
extends btk {
    private boolean Initialized;
    private bnd dvQ;

    @Override
    public void initialize() {
        assert (!this.Initialized);
        this.Initialized = true;
        this.dvQ = new bnd(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.dvQ);
    }

    public bnd arP() {
        assert (this.Initialized);
        return this.dvQ;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        assert (this.Initialized);
        if (dxq2 instanceof fvp) {
            this.c((fvp)dxq2);
            return;
        }
        if (dxq2 instanceof flr) {
            this.a((flr)dxq2);
            return;
        }
        if (dxq2 instanceof gjg) {
            this.a((gjg)dxq2);
            return;
        }
        if (dxq2 instanceof eex) {
            this.a((eex)dxq2);
            return;
        }
        if (dxq2 instanceof gzo) {
            this.a((gzo)dxq2);
            return;
        }
        if (dxq2 instanceof eyu) {
            this.b((eyu)dxq2);
            return;
        }
        super.receiveMessage(dxq2);
    }

    private void c(fvp fvp2) {
        assert (lda.by(fvp2));
    }

    private void a(flr flr2) {
        fls fls2 = (fls)this.MessageDelegator.h(7945, this.GUID, flr2.aO());
        fls2.aXQ = this.GUID;
        fls2.iPy = 100.0f;
        fls2.iPz = 90.0f;
        fls2.iPx = new HashMap<ldv, bsf>();
        this.MessageDelegator.F(fls2);
    }

    private void a(gjg gjg2) {
        gjh gjh2 = (gjh)this.MessageDelegator.h(4614, this.GUID, gjg2.aO());
        gjh2.jiJ = new cxc[0];
        this.MessageDelegator.F(gjh2);
    }

    private void a(eex eex2) {
        eey eey2 = (eey)this.MessageDelegator.h(12802, this.GUID, eex2.aO());
        eey2.iod = null;
        this.MessageDelegator.F(eey2);
    }

    private void a(gzo gzo2) {
        assert (lda.by(gzo2));
    }

    private void b(eyu eyu2) {
        eyv eyv2 = (eyv)this.MessageDelegator.h(23561, this.GUID, eyu2.aO());
        eyv2.iFM = new alu[0];
        this.MessageDelegator.F(eyv2);
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class cvt
extends cvs {
    public cvt(int n) {
        super(n, false);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4867: {
                this.a((gao)dxq2);
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
            case 4882: {
                this.a((gbf)dxq2);
                break;
            }
            case 34561: {
                this.a((eyc)dxq2);
                break;
            }
            case 34564: {
                this.a((eyk)dxq2);
                break;
            }
            case 34566: {
                this.a((eyi)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gao gao2) {
        assert (this.fEK == cwg.a.fEM);
        if (gao2.fBc == null) {
            lfn.b(5, "SFCraftingSessionHandlerClient", "handleSessionBeginCraftingMessage() CraftingSkillTypes array is null.");
            return;
        }
        if (gao2.fyj <= 0) {
            lfn.b(5, "SFCraftingSessionHandlerClient", "handleSessionBeginCraftingMessage() WorkStationResourceType is invalid.");
            return;
        }
        if (gao2.fBb) {
            if (gao2.fBd == null) {
                lfn.b(5, "SFCraftingSessionHandlerClient", "handleSessionBeginCraftingMessage() WorkStationMeshObjectGUID is null.");
                return;
            }
            if (gao2.bpJ == null) {
                lfn.b(5, "SFCraftingSessionHandlerClient", "handleSessionBeginCraftingMessage() WorkStationPosition is null.");
                return;
            }
        }
        this.fEK = cwg.a.fEO;
        this.fBb = gao2.fBb;
        this.fBc = gao2.fBc;
        this.fyj = gao2.fyj;
        if (this.fBb) {
            this.fBd = gao2.fBd;
            this.bpJ = gao2.bpJ;
        }
        this.bcG();
    }

    private void b(gbb gbb2) {
        assert (this.fEK != cwg.a.fEM);
        ldv ldv2 = this.bdv();
        if (!gbb2.aO().tV(ldv2)) {
            lfn.b(5, "SFCraftingSessionHandlerClient", "handleSessionEndMessage() Message received from unknown object.");
            lfn.b(5, "SFCraftingSessionHandlerClient", "handleSessionEndMessage() FromGUID=" + gbb2.aO() + " ServerSessionHandlerGUID=" + ldv2);
            return;
        }
        this.fEK = cwg.a.fEQ;
        this.fBb = false;
        this.fBc = null;
        this.fyj = 0;
        this.fBd = null;
        this.bpJ = null;
        gbb2.f(this.GUID);
        gbb2.on(lcr.acL);
        this.MessageDelegator.F(gbb2);
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
    }

    private void a(gbf gbf2) {
        if (this.fEK == cwg.a.fEQ) {
            return;
        }
        gbf2.f(this.GUID);
        gbf2.on(this.bdv());
        this.MessageDelegator.F(gbf2);
    }

    private void bcG() {
        assert (this.fEK == cwg.a.fEO);
        assert (this.fBc != null);
        assert (this.fyj > 0);
        gao gao2 = (gao)this.MessageDelegator.h(4867, this.GUID, lcr.acL);
        gao2.fBc = this.fBc;
        gao2.fyj = this.fyj;
        this.MessageDelegator.F(gao2);
    }

    private void a(eyc eyc2) {
        eyc2.f(this.GUID);
        eyc2.on(this.bdv());
        this.MessageDelegator.E(eyc2);
    }

    protected void a(eyk eyk2) {
        eyk2.f(this.GUID);
        eyk2.on(this.bdv());
        this.MessageDelegator.E(eyk2);
    }

    protected void a(eyi eyi2) {
        eyi2.f(this.GUID);
        eyi2.on(lcr.acL);
        this.MessageDelegator.F(eyi2);
    }
}


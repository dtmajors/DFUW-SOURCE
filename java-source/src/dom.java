/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 *  cug
 */
public class dom
extends don {
    private dnt gLN = null;

    @Override
    public dxq is(boolean bl) {
        assert (this.gLP != null);
        assert (this.gLP.gKM != null);
        fmf fmf2 = (fmf)this.MessageDelegator.h(7970, this.GUID, this.gLP.gKM);
        fmf2.aqs = this.gLP.aqs;
        fmf2.ilu = 2;
        fmf2.iPn = bl;
        fmf2.gLy = this.gLN.gLd;
        fmf2.iPE = this.gLN.gLn.GUID;
        fmf2.gLz = this.gLN.gLg;
        fmf2.iPQ = this.gLN.gLo;
        if (!bl) {
            fmf2.s(this.bok != null ? this.bok : mce.usK.bD(new Object[0]));
        }
        return fmf2;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7951: {
                this.b((fly)dxq2);
                break;
            }
            case 7972: {
                this.a((fmq)dxq2);
                break;
            }
            case 7989: {
                this.a((fmh)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void setScheduledForRemoval() {
        super.setScheduledForRemoval();
        if (this.gLQ) {
            if (this.gLN.gLn.dAy != null) {
                this.a(this.gLN.gLc, this.gLN.gLn);
            }
            if (this.gLN.gLq != null && this.gLN.gLq.dAy != null) {
                this.a(this.gLN.gLf, this.gLN.gLq);
            }
        }
    }

    @Override
    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        lfn.b(5, "SFSplitInfoAssembler", "handleSystemMessageSendingErrorMessage() " + gre2);
        switch (gre2.jqc) {
            case 7949: 
            case 7971: 
            case 7988: {
                this.bok = mce.usL.bD(new Object[0]);
                this.gLO.b(this);
                break;
            }
            default: {
                super.handleSystemMessageSendingErrorMessage(gre2);
            }
        }
    }

    @Override
    protected void brI() {
        this.gLN = (dnt)this.gLP.gKN;
        this.nw(this.gLN.gLf);
    }

    private void a(fmq fmq2) {
        if (fmq2.iQn == null) {
            lfn.b(5, "SFSplitInfoAssembler", "handleInventoryOwnerInfoResponse() InventoryOwnerGUID is null.");
            return;
        }
        if (fmq2.iJM <= 0) {
            lfn.b(5, "SFSplitInfoAssembler", "handleInventoryOwnerInfoResponse() InventoryOwnerResourceType is invalid.");
            return;
        }
        this.gLN.gKT = fmq2.iJM;
        this.Z(this.gLN.gLc, this.gLN.gLn.GUID);
    }

    private void b(fly fly2) {
        Object object;
        if (fly2.iPs == null || fly2.iPs.length == 0) {
            lfn.b(5, "SFSplitInfoAssembler", "handleItemLockResponse() ItemGUIDs array is null or empty.");
            return;
        }
        if (!fly2.iPs[0].equals(this.gLN.gLn.GUID)) {
            lfn.b(5, "SFSplitInfoAssembler", "handleItemLockResponse() ItemGUID mismatch. Info.ItemGUID=" + this.gLN.gLn.GUID + " Array.ItemGUID=" + fly2.iPs[0]);
            return;
        }
        assert (fly2.iPs.length == 1);
        if (fly2.dJh == null) {
            this.bok = mce.uss.bD(new Object[0]);
            this.gLO.b(this);
            return;
        }
        assert (fly2.dJh.length == 1);
        assert (fly2.dJh[0] != null);
        this.gLN.gLn.dAy = fly2.dJh[0];
        bqk bqk2 = this.gLO.bry().asf();
        if (bqk2 == null) {
            lfn.b(5, "SFSplitInfoAssembler", "handleItemLockResponse() TransactionRequestor inventory is null.");
            this.gLO.b(this);
            return;
        }
        bqs bqs2 = (bqs)bqk2.iF(this.gLN.gLn.GUID);
        if (bqs2 == null) {
            lfn.b(5, "SFSplitInfoAssembler", "handleItemLockResponse() Item " + this.gLN.gLn.GUID + " was not found.");
            this.gLO.b(this);
            return;
        }
        float f2 = cug.mr((int)bqs2.az());
        if (f2 < 0.0f) {
            lfn.b(5, "SFSplitInfoAssembler", "handleItemLockResponse() UnitWeight was not found for resource '" + bqs2.pa() + "'");
            this.gLO.b(this);
            return;
        }
        float f3 = f2 * (float)this.gLN.gLn.gLC;
        this.gLN.gLn.gLA = f2;
        if (this.gLN.brA() == 11 && this.gLN.gLp) {
            object = bqk2.aup().K(this.gLN.gLg, bqs2.az());
            if (object == null) {
                this.gLN.gLp = false;
            } else {
                lef lef2 = bqk2.auo().iX(((brm)object).getGUID());
                if (lef2 == null) {
                    lfn.b(5, "SFSplitInfoAssembler", "handleItemLockResponse() Could not lock matching item.");
                    this.gLN.gLp = false;
                } else {
                    this.gLN.gLq = new dny();
                    this.gLN.gLq.GUID = ((brm)object).getGUID();
                    this.gLN.gLq.dAy = lef2;
                }
            }
        }
        object = this.gLN.gLn;
        this.a(this.gLN.gLf, this.gLN.gLg, ((doc)object).gLD, ((doc)object).gLE, ((doc)object).aRX, -1);
    }

    private void a(fmh fmh2) {
        if (fmh2.iPT) {
            this.gLO.a(this);
        } else {
            lfn.b(5, "SFSplitInfoAssembler", "handleItemTransferCheckResponse() TransferCheck was not completed.");
            this.bok = mce.usN.bD(new Object[0]);
            this.gLO.b(this);
        }
    }
}


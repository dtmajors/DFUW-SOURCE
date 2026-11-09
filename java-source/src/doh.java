/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 */
public class doh
extends don {
    private dnq gLI = null;

    @Override
    public dxq is(boolean bl) {
        assert (this.gLP != null);
        assert (this.gLP.gKM != null);
        fmf fmf2 = (fmf)this.MessageDelegator.h(7970, this.GUID, this.gLP.gKM);
        fmf2.aqs = this.gLP.aqs;
        fmf2.ilu = 1;
        fmf2.iPn = bl;
        fmf2.gLy = this.gLI.gLd;
        fmf2.iPE = this.gLI.gLe.GUID;
        fmf2.gLz = this.gLI.gLg;
        fmf2.iPQ = this.gLI.gLh.GUID;
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
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void setScheduledForRemoval() {
        super.setScheduledForRemoval();
        if (this.gLQ) {
            if (this.gLI.gLe.dAy != null) {
                this.a(this.gLI.gLc, this.gLI.gLe);
            }
            if (this.gLI.gLh.dAy != null) {
                this.a(this.gLI.gLf, this.gLI.gLh);
            }
        }
    }

    @Override
    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        lfn.b(5, "SFMergeInfoAssembler", "handleSystemMessageSendingErrorMessage() " + gre2);
        switch (gre2.jqc) {
            case 7949: 
            case 7971: {
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
        this.gLI = (dnq)this.gLP.gKN;
        this.nw(this.gLI.gLf);
    }

    private void a(fmq fmq2) {
        if (fmq2.iQn == null) {
            lfn.b(5, "SFMergeInfoAssembler", "handleInventoryOwnerInfoResponse() InventoryOwnerGUID is null.");
            return;
        }
        if (fmq2.iJM <= 0) {
            lfn.b(5, "SFMergeInfoAssembler", "handleInventoryOwnerInfoResponse() InventoryOwnerResourceType is invalid.");
            return;
        }
        this.gLI.gKT = fmq2.iJM;
        this.Z(this.gLI.gLc, this.gLI.gLe.GUID);
    }

    private void b(fly fly2) {
        if (fly2.iPs == null || fly2.iPs.length == 0) {
            lfn.b(5, "SFMergeInfoAssembler", "handleItemLockResponse() ItemGUIDs array is null or empty.");
            return;
        }
        assert (fly2.iPs.length == 1);
        if (fly2.aO().equals(this.gLI.gLc) && this.gLI.gLe.dAy == null) {
            if (!fly2.iPs[0].equals(this.gLI.gLe.GUID)) {
                lfn.b(5, "SFMergeInfoAssembler", "handleItemLockResponse() ItemGUID mismatch. Info.ObjectAItemGUID=" + this.gLI.gLe.GUID + " Array.ItemGUID=" + fly2.iPs[0]);
                return;
            }
            if (fly2.dJh == null) {
                this.gLO.b(this);
                return;
            }
            assert (fly2.dJh.length == 1);
            assert (fly2.dJh[0] != null);
            this.gLI.gLe.dAy = fly2.dJh[0];
            bqk bqk2 = this.gLO.bry().asf();
            if (bqk2 == null) {
                lfn.b(5, "SFMergeInfoAssembler", "handleItemLockResponse() TransactionRequestor inventory is null.");
                this.gLO.b(this);
                return;
            }
            bqs bqs2 = (bqs)bqk2.iF(this.gLI.gLe.GUID);
            if (bqs2 == null) {
                lfn.b(5, "SFMergeInfoAssembler", "handleItemLockResponse() Item " + this.gLI.gLe.GUID + " was not found.");
                this.bok = mce.usp.bD(new Object[0]);
                this.gLO.b(this);
                return;
            }
            this.Z(this.gLI.gLf, this.gLI.gLh.GUID);
        } else if (fly2.aO().equals(this.gLI.gLf) && this.gLI.gLh.dAy == null) {
            if (!fly2.iPs[0].equals(this.gLI.gLh.GUID)) {
                lfn.b(5, "SFMergeInfoAssembler", "handleItemLockResponse() ItemGUID mismatch. Info.ObjectBItemGUID=" + this.gLI.gLh.GUID + " Array.ItemGUID=" + fly2.iPs[0]);
                return;
            }
            if (fly2.dJh == null) {
                this.bok = mce.uso.bD(new Object[0]);
                this.gLO.b(this);
                return;
            }
            assert (fly2.dJh.length == 1);
            assert (fly2.dJh[0] != null);
            this.gLI.gLh.dAy = fly2.dJh[0];
            this.gLO.a(this);
        } else {
            lfn.b(5, "SFMergeInfoAssembler", "handleItemLockResponse() Received message from unknown inventory: " + fly2.aO());
            lfn.b(5, "SFMergeInfoAssembler", "handleItemLockResponse() ObjectAInventoryGUID=" + this.gLI.gLc + " ObjectBInventoryGUID=" + this.gLI.gLf);
            this.gLO.b(this);
        }
    }
}


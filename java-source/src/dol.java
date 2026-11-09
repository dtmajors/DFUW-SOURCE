/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 *  cug
 */
public class dol
extends don {
    private dnv gLM = null;

    @Override
    public dxq is(boolean bl) {
        assert (this.gLP != null);
        assert (this.gLP.gKM != null);
        fmf fmf2 = (fmf)this.MessageDelegator.h(7970, this.GUID, this.gLP.gKM);
        fmf2.aqs = this.gLP.aqs;
        fmf2.ilu = 8;
        fmf2.iPn = bl;
        fmf2.gLy = this.gLM.gLd;
        fmf2.iPE = this.gLM.gLs.GUID;
        fmf2.gLz = this.gLM.gLg;
        fmf2.iPQ = this.gLM.gLh.GUID;
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
            if (this.gLM.gLs.dAy != null) {
                this.a(this.gLM.gLc, this.gLM.gLs);
            }
            if (this.gLM.gLh.dAy != null) {
                this.a(this.gLM.gLf, this.gLM.gLh);
            }
        }
    }

    @Override
    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        lfn.b(5, "SFSplitAndMergeInfoAssembler", "handleSystemMessageSendingErrorMessage() " + gre2);
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
        this.gLM = (dnv)this.gLP.gKN;
        this.nw(this.gLM.gLf);
    }

    private void a(fmq fmq2) {
        if (fmq2.iQn == null) {
            lfn.b(5, "SFSplitAndMergeInfoAssembler", "handleInventoryOwnerInfoResponse() InventoryOwnerGUID is null.");
            return;
        }
        if (fmq2.iJM <= 0) {
            lfn.b(5, "SFSplitAndMergeInfoAssembler", "handleInventoryOwnerInfoResponse() InventoryOwnerResourceType is invalid.");
            return;
        }
        this.gLM.gKT = fmq2.iJM;
        this.Z(this.gLM.gLc, this.gLM.gLs.GUID);
    }

    private void b(fly fly2) {
        if (fly2.iPs == null || fly2.iPs.length == 0) {
            lfn.b(5, "SFSplitAndMergeInfoAssembler", "handleItemLockResponse() ItemGUIDs array is null or empty.");
            return;
        }
        assert (fly2.iPs.length == 1);
        if (fly2.aO().equals(this.gLM.gLc) && this.gLM.gLs.dAy == null) {
            if (!fly2.iPs[0].equals(this.gLM.gLs.GUID)) {
                lfn.b(5, "SFSplitAndMergeInfoAssembler", "handleItemLockResponse() ItemGUID mismatch. Info.ObjectAItemGUID=" + this.gLM.gLs.GUID + " Array.ItemGUID=" + fly2.iPs[0]);
                return;
            }
            if (fly2.dJh == null) {
                this.bok = mce.uss.bD(new Object[0]);
                this.gLO.b(this);
                return;
            }
            assert (fly2.dJh.length == 1);
            assert (fly2.dJh[0] != null);
            this.gLM.gLs.dAy = fly2.dJh[0];
            bqk bqk2 = this.gLO.bry().asf();
            if (bqk2 == null) {
                lfn.b(5, "SFSplitAndMergeInfoAssembler", "handleItemLockResponse() TransactionRequestor inventory is null.");
                this.gLO.b(this);
                return;
            }
            bqs bqs2 = (bqs)bqk2.iF(this.gLM.gLs.GUID);
            if (bqs2 == null) {
                lfn.b(5, "SFSplitAndMergeInfoAssembler", "handleItemLockResponse() Item " + this.gLM.gLs.GUID + " was not found.");
                this.gLO.b(this);
                return;
            }
            float f2 = cug.mr((int)bqs2.az());
            if (f2 < 0.0f) {
                lfn.b(5, "SFSplitAndMergeInfoAssembler", "handleItemLockResponse() UnitWeight was not found for resource '" + bqs2.pa() + "'");
                this.gLO.b(this);
                return;
            }
            float f3 = f2 * (float)this.gLM.gLs.gLC;
            this.gLM.gLs.gLA = f2;
            this.Z(this.gLM.gLf, this.gLM.gLh.GUID);
        } else if (fly2.aO().equals(this.gLM.gLf) && this.gLM.gLh.dAy == null) {
            if (!fly2.iPs[0].equals(this.gLM.gLh.GUID)) {
                lfn.b(5, "SFSplitAndMergeInfoAssembler", "handleItemLockResponse() ItemGUID mismatch. Info.ObjectBItemGUID=" + this.gLM.gLh.GUID + " Array.ItemGUID=" + fly2.iPs[0]);
                return;
            }
            if (fly2.dJh == null) {
                this.bok = mce.uso.bD(new Object[0]);
                this.gLO.b(this);
                return;
            }
            assert (fly2.dJh.length == 1);
            assert (fly2.dJh[0] != null);
            this.gLM.gLh.dAy = fly2.dJh[0];
            this.gLO.a(this);
        } else {
            lfn.b(5, "SFSplitAndMergeInfoAssembler", "handleItemLockResponse() Received message from unknown inventory: " + fly2.aO());
            lfn.b(5, "SFSplitAndMergeInfoAssembler", "handleItemLockResponse() ObjectAInventoryGUID=" + this.gLM.gLc + " ObjectBInventoryGUID=" + this.gLM.gLf);
            this.gLO.b(this);
        }
    }
}


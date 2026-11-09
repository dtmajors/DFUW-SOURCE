/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 *  lcr
 *  lcw
 */
public class doo
extends don {
    private dnw gLR = null;

    @Override
    public dxq is(boolean bl) {
        assert (this.gLP != null);
        assert (this.gLP.gKM != null);
        fma fma2 = (fma)this.MessageDelegator.h(7961, this.GUID, this.gLP.gKM);
        fma2.aqs = this.gLP.aqs;
        fma2.iPn = bl;
        fma2.gLy = this.gLR.gLd;
        fma2.iPE = this.gLR.gLt.GUID;
        fma2.gLz = this.gLR.gLg;
        if (!bl) {
            fma2.s(this.bok != null ? this.bok : mce.usK.bD(new Object[0]));
        }
        return fma2;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 32516: {
                this.b((ggu)dxq2);
                break;
            }
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
        if (this.gLQ && this.gLR.gLt.dAy != null) {
            this.a(this.gLR.gLc, this.gLR.gLt);
        }
    }

    @Override
    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        lfn.b(5, "SFTransferInfoAssembler", "handleSystemMessageSendingErrorMessage() " + gre2);
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
        this.gLR = (dnw)this.gLP.gKN;
        if (lcw.emW() && lcw.emX() && this.gLR.gLw) {
            ldv ldv2 = lcr.abW((int)this.gLR.gLf.enw());
            ggt ggt2 = (ggt)this.MessageDelegator.h(32515, this.getGUID(), ldv2);
            ggt2.ma(true);
            this.MessageDelegator.F(ggt2);
            return;
        }
        if (this.gLR.gLw) {
            lfn.b(5, "SFTransferInfoAssembler", "startInfoAssembling() Player does not have any auto loot item active : " + this.gLP.gKM);
            assert (false);
            this.gLO.b(this);
            return;
        }
        this.nw(this.gLR.gLf);
    }

    private void b(ggu ggu2) {
        if (!ggu2.isActive()) {
            lfn.b(5, "SFTransferInfoAssembler", "handleSelentineCheckActiveItemResponse() Player does not have any auto loot item active.");
            this.gLO.b(this);
            return;
        }
        this.nw(this.gLR.gLf);
    }

    private void a(fmq fmq2) {
        if (fmq2.iQn == null) {
            lfn.b(5, "SFTransferInfoAssembler", "handleInventoryOwnerInfoResponse() InventoryOwnerGUID is null.");
            return;
        }
        if (fmq2.iJM <= 0) {
            lfn.b(5, "SFTransferInfoAssembler", "handleInventoryOwnerInfoResponse() InventoryOwnerResourceType is invalid.");
            return;
        }
        this.gLR.gKT = fmq2.iJM;
        this.Z(this.gLR.gLc, this.gLR.gLt.GUID);
    }

    private void b(fly fly2) {
        if (fly2.iPs == null || fly2.iPs.length == 0) {
            lfn.b(5, "SFTransferInfoAssembler", "handleItemLockResponse() ItemGUIDs array is null or empty.");
            return;
        }
        if (!fly2.iPs[0].equals(this.gLR.gLt.GUID)) {
            lfn.b(5, "SFTransferInfoAssembler", "handleItemLockResponse() ItemGUID mismatch. Info.ItemGUID=" + this.gLR.gLt.GUID + " Array.ItemGUID=" + fly2.iPs[0]);
            return;
        }
        assert (fly2.iPs.length == 1);
        if (fly2.dJh == null) {
            this.bok = mce.ust.bD(new Object[0]);
            this.gLO.b(this);
            return;
        }
        assert (fly2.dJh.length == 1);
        assert (fly2.dJh[0] != null);
        this.gLR.gLt.dAy = fly2.dJh[0];
        bqk bqk2 = this.gLO.bry().asf();
        if (bqk2 == null) {
            lfn.b(5, "SFTransferInfoAssembler", "handleItemLockResponse() TransactionRequestor inventory is null.");
            this.gLO.b(this);
            return;
        }
        bqs bqs2 = (bqs)bqk2.iF(this.gLR.gLt.GUID);
        if (bqs2 == null) {
            lfn.b(5, "SFTransferInfoAssembler", "handleItemLockResponse() Item " + this.gLR.gLt.GUID + " was not found.");
            this.gLO.b(this);
            return;
        }
        dod dod2 = this.gLR.gLt;
        this.a(this.gLR.gLf, this.gLR.gLg, dod2.gLD, dod2.gLE, dod2.aRX, this.gLR.gLx);
    }

    private void a(fmh fmh2) {
        if (fmh2.iPT) {
            this.gLO.a(this);
        } else {
            lfn.b(5, "SFTransferInfoAssembler", "handleItemTransferCheckResponse() TransferCheck was not completed.");
            this.bok = mce.usN.bD(new Object[0]);
            this.gLO.b(this);
        }
    }
}


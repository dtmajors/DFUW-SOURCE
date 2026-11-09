/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 */
public class dop
extends don {
    private dnx gLS = null;

    @Override
    public dxq is(boolean bl) {
        assert (this.gLP != null);
        assert (this.gLP.gKM != null);
        fma fma2 = (fma)this.MessageDelegator.h(7961, this.GUID, this.gLP.gKM);
        fma2.aqs = this.gLP.aqs;
        fma2.iPn = bl;
        fma2.gLy = this.gLS.gLy;
        fma2.iPE = this.gLS.gKZ.GUID;
        fma2.gLz = this.gLS.gLz;
        if (!bl) {
            fma2.s(this.bok != null ? this.bok : mce.usK.bD(new Object[0]));
        }
        return fma2;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7951: {
                this.b((fly)dxq2);
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
            if (this.gLS.gKZ.dAy != null) {
                this.a(this.gLS.dAu, this.gLS.gKZ);
            }
            if (this.gLS.gLq != null && this.gLS.gLq.dAy != null) {
                this.a(this.gLS.dAu, this.gLS.gLq);
            }
        }
    }

    @Override
    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        lfn.b(5, "SFTransferInternallyInfoAssembler", "handleSystemMessageSendingErrorMessage() " + gre2);
        if (gre2.jqc == 7949) {
            this.bok = mce.usL.bD(new Object[0]);
            this.gLO.b(this);
        } else {
            super.handleSystemMessageSendingErrorMessage(gre2);
        }
    }

    @Override
    protected void brI() {
        this.gLS = (dnx)this.gLP.gKN;
        this.Z(this.gLS.dAu, this.gLS.gKZ.GUID);
    }

    private void b(fly fly2) {
        if (fly2.iPs == null || fly2.iPs.length == 0) {
            lfn.b(5, "SFTransferInternallyInfoAssembler", "handleItemLockResponse() ItemGUIDs array is null or empty.");
            return;
        }
        if (!fly2.iPs[0].equals(this.gLS.gKZ.GUID)) {
            lfn.b(5, "SFTransferInternallyInfoAssembler", "handleItemLockResponse() ItemGUID mismatch. Info.ItemGUID=" + this.gLS.gKZ.GUID + " Array.ItemGUID=" + fly2.iPs[0]);
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
        this.gLS.gKZ.dAy = fly2.dJh[0];
        if (this.gLS.gLv) {
            bqk bqk2 = this.gLO.bry().asf();
            if (bqk2 == null) {
                lfn.b(5, "SFTransferInternallyInfoAssembler", "handleItemLockResponse() TransactionRequestor inventory is null.");
                this.gLO.b(this);
                return;
            }
            bqs bqs2 = bqk2.aup().K(this.gLS.gLz, this.gLS.gKZ.aRX);
            if (bqs2 == null) {
                this.gLS.gLv = false;
            } else {
                lef lef2 = bqk2.auo().iX(bqs2.getGUID());
                if (lef2 == null) {
                    lfn.b(5, "SFTransferInternallyInfoAssembler", "handleItemLockResponse() Could not lock matching item.");
                    this.gLS.gLv = false;
                } else {
                    this.gLS.gLq = new dny();
                    this.gLS.gLq.GUID = bqs2.getGUID();
                    this.gLS.gLq.dAy = lef2;
                }
            }
        }
        this.gLO.a(this);
    }
}


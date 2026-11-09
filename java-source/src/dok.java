/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 *  cug
 */
public class dok
extends don {
    private dnu gLL = null;

    @Override
    public dxq is(boolean bl) {
        assert (this.gLP != null);
        assert (this.gLP.gKM != null);
        fmf fmf2 = (fmf)this.MessageDelegator.h(7970, this.GUID, this.gLP.gKM);
        fmf2.aqs = this.gLP.aqs;
        fmf2.ilu = 4;
        fmf2.iPn = bl;
        fmf2.gLy = this.gLL.aXQ;
        fmf2.iPE = this.gLL.gLr.GUID;
        fmf2.gLz = null;
        fmf2.iPQ = null;
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
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void setScheduledForRemoval() {
        super.setScheduledForRemoval();
        if (this.gLQ && this.gLL.gLr.dAy != null) {
            this.a(this.gLL.dAu, this.gLL.gLr);
        }
    }

    @Override
    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        lfn.b(5, "SFSplitAndDropInfoAssembler", "handleSystemMessageSendingErrorMessage() " + gre2);
        if (gre2.jqc == 7949) {
            this.bok = mce.usL.bD(new Object[0]);
            this.gLO.b(this);
        } else {
            super.handleSystemMessageSendingErrorMessage(gre2);
        }
    }

    @Override
    protected void brI() {
        this.gLL = (dnu)this.gLP.gKN;
        this.Z(this.gLL.dAu, this.gLL.gLr.GUID);
    }

    private void b(fly fly2) {
        if (fly2.iPs == null || fly2.iPs.length == 0) {
            lfn.b(5, "SFSplitAndDropInfoAssembler", "handleItemLockResponse() ItemGUIDs array is null or empty.");
            return;
        }
        if (!fly2.iPs[0].equals(this.gLL.gLr.GUID)) {
            lfn.b(5, "SFSplitAndDropInfoAssembler", "handleItemLockResponse() ItemGUID mismatch. Info.ItemGUID=" + this.gLL.gLr.GUID + " Array.ItemGUID=" + fly2.iPs[0]);
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
        this.gLL.gLr.dAy = fly2.dJh[0];
        bqk bqk2 = this.gLO.bry().asf();
        if (bqk2 == null) {
            lfn.b(5, "SFSplitAndDropInfoAssembler", "handleItemLockResponse() TransactionRequestor inventory is null.");
            this.gLO.b(this);
            return;
        }
        bqs bqs2 = (bqs)bqk2.iF(this.gLL.gLr.GUID);
        if (bqs2 == null) {
            lfn.b(5, "SFSplitAndDropInfoAssembler", "handleItemLockResponse() Item " + this.gLL.gLr.GUID + " was not found.");
            this.gLO.b(this);
            return;
        }
        float f2 = cug.mr((int)bqs2.az());
        if (f2 < 0.0f) {
            lfn.b(5, "SFSplitAndDropInfoAssembler", "handleItemLockResponse() UnitWeight was not found for resource '" + bqs2.pa() + "'");
            this.gLO.b(this);
            return;
        }
        float f3 = f2 * (float)this.gLL.gLr.gLC;
        this.gLL.gLr.gLA = f2;
        this.gLO.a(this);
    }
}


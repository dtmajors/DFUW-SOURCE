/*
 * Decompiled with CFR.
 */
public class doi
extends don {
    private dnr gLJ = null;

    @Override
    public dxq is(boolean bl) {
        assert (this.gLP != null);
        assert (this.gLP.gKM != null);
        fma fma2 = (fma)this.MessageDelegator.h(7961, this.GUID, this.gLP.gKM);
        fma2.aqs = this.gLP.aqs;
        fma2.iPn = bl;
        fma2.gLy = this.gLJ.aXQ;
        fma2.iPE = this.gLJ.gLi.GUID;
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
    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        lfn.b(5, "SFRemoveInfoAssembler", "handleSystemMessageSendingErrorMessage() " + gre2);
        if (gre2.jqc == 7949) {
            this.bok = mce.usL.bD(new Object[0]);
            this.gLO.b(this);
        } else {
            super.handleSystemMessageSendingErrorMessage(gre2);
        }
    }

    @Override
    protected void brI() {
        this.gLJ = (dnr)this.gLP.gKN;
        this.Z(this.gLJ.dAu, this.gLJ.gLi.GUID);
    }

    private void b(fly fly2) {
        if (fly2.iPs == null || fly2.iPs.length == 0) {
            lfn.b(5, "SFRemoveInfoAssembler", "handleItemLockResponse() ItemGUIDs array is null or empty.");
            return;
        }
        if (!fly2.iPs[0].equals(this.gLJ.gLi.GUID)) {
            lfn.b(5, "SFRemoveInfoAssembler", "handleItemLockResponse() ItemGUID mismatch. Info.ItemGUID=" + this.gLJ.gLi.GUID + " Array.ItemGUID=" + fly2.iPs[0]);
            return;
        }
        assert (fly2.iPs.length == 1);
        if (fly2.dJh == null) {
            this.bok = mce.usq.bD(new Object[0]);
            this.gLO.b(this);
            return;
        }
        assert (fly2.dJh.length == 1);
        assert (fly2.dJh[0] != null);
        this.gLJ.gLi.dAy = fly2.dJh[0];
        this.gLO.a(this);
    }
}


/*
 * Decompiled with CFR.
 */
public class dof
extends don {
    private dno gLG = null;

    @Override
    public dxq is(boolean bl) {
        assert (this.gLP != null);
        assert (this.gLP.gKM != null);
        flk flk2 = (flk)this.MessageDelegator.h(7986, this.GUID, this.gLP.gKM);
        flk2.iPn = bl;
        flk2.aCK = this.gLG.gKZ.GUID;
        if (!bl) {
            flk2.s(this.bok != null ? this.bok : mce.usK.bD(new Object[0]));
        }
        return flk2;
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
        lfn.b(5, "SFChangeSlotInfoAssembler", "handleSystemMessageSendingErrorMessage() " + gre2);
        if (gre2.jqc == 7949) {
            this.bok = mce.usL.bD(new Object[0]);
            this.gLO.b(this);
        } else {
            super.handleSystemMessageSendingErrorMessage(gre2);
        }
    }

    @Override
    protected void brI() {
        this.gLG = (dno)this.gLP.gKN;
        this.Z(this.gLG.dAu, this.gLG.gKZ.GUID);
    }

    private void b(fly fly2) {
        if (fly2.iPs == null || fly2.iPs.length == 0) {
            lfn.b(5, "SFChangeSlotInfoAssembler", "handleItemLockResponse() ItemGUIDs array is null or empty.");
            return;
        }
        if (!fly2.iPs[0].equals(this.gLG.gKZ.GUID)) {
            lfn.b(5, "SFChangeSlotInfoAssembler", "handleItemLockResponse() ItemGUID mismatch. Info.ItemGUID=" + this.gLG.gKZ.GUID + " Array.ItemGUID=" + fly2.iPs[0]);
            return;
        }
        assert (fly2.iPs.length == 1);
        if (fly2.dJh == null) {
            this.bok = mce.ush.bD(new Object[0]);
            this.gLO.b(this);
            return;
        }
        assert (fly2.dJh.length == 1);
        assert (fly2.dJh[0] != null);
        this.gLG.gKZ.dAy = fly2.dJh[0];
        this.gLO.a(this);
    }
}


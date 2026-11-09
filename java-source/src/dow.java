/*
 * Decompiled with CFR.
 */
public class dow
extends dpd {
    private dnr gLJ = null;
    private bro[] gMc = null;

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7946: {
                this.a((fmo)dxq2);
                break;
            }
            case 7941: {
                this.b((fmw)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected void brM() {
        assert (this.mb != 2);
        this.a(this.gLJ.dAu, this.gLJ.gLi);
    }

    @Override
    protected void brN() {
        assert (this.mb == 2);
        this.a(this.gLJ.dAu, this.gLJ.gLi);
        if (this.gMo) {
            if (this.gMc != null && this.gLJ.Tr != null) {
                boolean bl = false;
                for (int i = 0; i < this.gMc.length; ++i) {
                    if (this.gMc[i] != null) continue;
                    bl = true;
                    break;
                }
                if (!bl) {
                    this.a(this.gLJ.Tr, this.gMc);
                } else {
                    lfn.b(5, this.getClass().getSimpleName(), "cleanUpTransaction() : Items for Logging array contains a Null element!!!");
                    assert (false);
                }
            } else {
                lfn.b(5, this.getClass().getSimpleName(), "cleanUpTransaction() : Items for Logging is Null!!!");
                assert (false);
            }
        }
    }

    @Override
    protected void brO() {
        this.gLJ = (dnr)this.gMn;
        if (dng.gKK) {
            this.gMp = true;
        }
        this.a(this.gLJ.dAu, this.gLJ.gLi, true, false, this.gMo, this.gLJ.gLj, this.gLJ.brE(), bqm.b.dEm.ordinal());
    }

    private void a(fmo fmo2) {
        if (this.gMo) assert (this.gMc != null);
        switch (fmo2.ilu) {
            case 2: {
                if (fmo2.eo) {
                    this.mb = 2;
                    this.gMm.a(this, this.gMn);
                    break;
                }
                this.gMm.b(this, this.gMn);
                break;
            }
            default: {
                lfn.b(5, "SFRemovePerformer", "handleInventoryOperationReceiptMessage() Receipt for unhandled operation received: " + fmo2.ilu);
            }
        }
    }

    private void b(fmw fmw2) {
        if (fmw2.iQE == null) {
            lfn.b(5, "SFRemovePerformer", "handleRemoveItemResponse() RemovedItemWrapper is null.");
            return;
        }
        if (fmw2.iQE.dIY == null) {
            lfn.b(5, "SFRemovePerformer", "handleRemoveItemResponse() Item in RemovedItemWrapper is null.");
            return;
        }
        assert (fmw2.iQE.dIY.getGUID().equals(this.gLJ.gLi.GUID));
        assert (this.gMo);
        this.gMc = this.a(fmw2.iQE, false);
    }
}


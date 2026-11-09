/*
 * Decompiled with CFR.
 */
public class doy
extends dpd {
    private dnu gLL = null;
    private bro gMa = null;

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7946: {
                this.a((fmo)dxq2);
                break;
            }
            case 7968: {
                this.a((fno)dxq2);
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
        this.a(this.gLL.dAu, this.gLL.gLr);
    }

    @Override
    protected void brN() {
        assert (this.mb == 2);
        this.a(this.gLL.dAu, this.gLL.gLr);
        if (this.gMo) {
            if (this.gMa != null) {
                this.a(this.gLL.Tr, new bro[]{this.gMa});
            } else {
                lfn.b(5, this.getClass().getSimpleName(), "cleanUpTransaction() : Item for Logging is Null!!!");
                assert (false);
            }
        }
    }

    @Override
    protected void brO() {
        this.gLL = (dnu)this.gMn;
        if (dng.gKK) {
            this.gMp = true;
        }
        this.a(this.gLL.dAu, this.gLL.gLr, this.gMo, true);
    }

    private void a(fmo fmo2) {
        if (this.gMo) assert (this.gMa != null);
        switch (fmo2.ilu) {
            case 10: {
                if (fmo2.eo) {
                    this.mb = 2;
                    this.gMm.a(this, this.gMn);
                    break;
                }
                this.gMm.b(this, this.gMn);
                break;
            }
            default: {
                lfn.b(5, "SFSplitAndDropPerformer", "handleInventoryOperationReceiptMessage() Receipt for unhandled operation received: " + fmo2.ilu);
            }
        }
    }

    private void a(fno fno2) {
        if (fno2.gMj == null) {
            lfn.b(5, "SFSplitAndDropPerformer", "handleSplitItemResponse() Split is null.");
            return;
        }
        assert (this.gMo);
        this.gMa = fno2.gMj.dS(false);
    }
}


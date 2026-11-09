/*
 * Decompiled with CFR.
 */
public class doz
extends dpd {
    private dnv gLM = null;

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7946: {
                this.a((fmo)dxq2);
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
        this.a(this.gLM.gLc, this.gLM.gLs);
        this.a(this.gLM.gLf, this.gLM.gLh);
    }

    @Override
    protected void brN() {
        assert (this.mb == 2);
        this.a(this.gLM.gLc, this.gLM.gLs);
        this.a(this.gLM.gLf, this.gLM.gLh);
    }

    @Override
    protected void brO() {
        this.gLM = (dnv)this.gMn;
        if (dng.gKK) {
            this.gMp = true;
        }
        this.a(this.gLM.gLc, this.gLM.gLs, this.gLM.gLh);
    }

    private void a(fmo fmo2) {
        switch (fmo2.ilu) {
            case 11: {
                if (fmo2.eo) {
                    this.mb = 2;
                    this.gMm.a(this, this.gMn);
                    break;
                }
                this.gMm.b(this, this.gMn);
                break;
            }
            default: {
                lfn.b(5, "SFSplitAndMergeInternallyPerformer", "handleInventoryOperationReceiptMessage() Receipt for unhandled operation received: " + fmo2.ilu);
            }
        }
    }
}


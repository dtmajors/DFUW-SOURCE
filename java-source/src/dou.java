/*
 * Decompiled with CFR.
 */
public class dou
extends dpd {
    private dnq gLI = null;

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
        this.a(this.gLI.gLc, this.gLI.gLe);
        this.a(this.gLI.gLf, this.gLI.gLh);
    }

    @Override
    protected void brN() {
        assert (this.mb == 2);
        this.a(this.gLI.gLc, this.gLI.gLe);
        this.a(this.gLI.gLf, this.gLI.gLh);
    }

    @Override
    protected void brO() {
        this.gLI = (dnq)this.gMn;
        if (dng.gKK) {
            this.gMp = true;
        }
        this.a(this.gLI.gLc, this.gLI.gLe, this.gLI.gLh);
    }

    private void a(fmo fmo2) {
        switch (fmo2.ilu) {
            case 9: {
                if (fmo2.eo) {
                    this.mb = 2;
                    this.gMm.a(this, this.gMn);
                    break;
                }
                this.gMm.b(this, this.gMn);
                break;
            }
            default: {
                lfn.b(5, "SFMergeInternallyPerformer", "handleInventoryOperationReceiptMessage() Receipt for unhandled operation received: " + fmo2.ilu);
            }
        }
    }
}


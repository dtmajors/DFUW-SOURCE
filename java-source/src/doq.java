/*
 * Decompiled with CFR.
 */
public class doq
extends dpd {
    private dnm dtM = null;

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7946: {
                this.b((fmo)dxq2);
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
    }

    @Override
    protected void brN() {
        assert (this.mb == 2);
    }

    @Override
    protected void brO() {
        this.dtM = (dnm)this.gMn;
        if (dng.gKK) {
            this.gMp = true;
        }
        this.a(this.dtM.dAu, this.dtM.aXQ, this.dtM.gKU, this.dtM.brE());
    }

    private void b(fmo fmo2) {
        switch (fmo2.ilu) {
            case 1: {
                if (fmo2.eo) {
                    this.mb = 2;
                    this.gMm.a(this, this.gMn);
                    break;
                }
                this.gMm.b(this, this.gMn);
                break;
            }
            default: {
                lfn.b(5, "SFAddPerformer", "handleOperationReceiptMessage() Receipt for unhandled operation received: " + fmo2.ilu);
            }
        }
    }
}


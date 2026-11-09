/*
 * Decompiled with CFR.
 */
public class dpe
extends dpd {
    private dnx gLS = null;

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
        this.a(this.gLS.dAu, (dny)this.gLS.gKZ);
        if (this.gLS.gLq != null) {
            this.a(this.gLS.dAu, this.gLS.gLq);
        }
    }

    @Override
    protected void brN() {
        assert (this.mb == 2);
        this.a(this.gLS.dAu, (dny)this.gLS.gKZ);
        if (this.gLS.gLq != null) {
            this.a(this.gLS.dAu, this.gLS.gLq);
        }
    }

    @Override
    protected void brO() {
        this.gLS = (dnx)this.gMn;
        if (dng.gKK) {
            this.gMp = true;
        }
        if (this.gLS.gLv) {
            this.a(this.gLS.dAu, (dny)this.gLS.gKZ, this.gLS.gLq);
        } else {
            this.a(this.gLS.dAu, this.gLS.gLy, this.gLS.gLz, this.gLS.gKZ.GUID, this.gLS.gKZ.dJc);
        }
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
            case 12: {
                if (fmo2.eo) {
                    this.mb = 2;
                    this.gMm.a(this, this.gMn);
                    break;
                }
                this.gMm.b(this, this.gMn);
                break;
            }
            default: {
                lfn.b(5, "SFTransferInternallyPerformer", "handleInventoryOperationReceiptMessage() Receipt for unhandled operation received: " + fmo2.ilu);
            }
        }
    }
}


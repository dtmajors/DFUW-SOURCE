/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class dov
extends dpd {
    public static final int gLZ = 3;
    private dnq gLI = null;
    private bro gMa = null;
    private bqs gMb = null;

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
        if (this.gMb != null) {
            this.a(this.gLI.gLc, this.gLI.gLd, this.gMb, bqy.dFW);
        }
        this.a(this.gLI.gLc, this.gLI.gLe);
        this.a(this.gLI.gLf, this.gLI.gLh);
    }

    @Override
    protected void brN() {
        assert (this.mb == 2);
        this.a(this.gLI.gLc, this.gLI.gLe);
        this.a(this.gLI.gLf, this.gLI.gLh);
        if (this.gMo) {
            if (this.gMa != null) {
                ldv ldv2 = null;
                ldv2 = this.gLI.AY(this.gLI.gKS) ? lcr.tQ((ldv)this.gLI.gLf) : lcr.tQ((ldv)this.gLI.gLc);
                this.a(ldv2, new bro[]{this.gMa});
            } else {
                lfn.b(5, this.getClass().getSimpleName(), "cleanUpTransaction() : Item for Logging is Null!!!");
                assert (false);
            }
        }
    }

    @Override
    protected void brO() {
        this.gLI = (dnq)this.gMn;
        if (dng.gKK && dng.gKL) {
            this.gMp = true;
        }
        this.a(this.gLI.gLc, this.gLI.gLe, true, true, bqy.dHv);
    }

    private void a(fmo fmo2) {
        if (this.gMo) assert (this.gMa != null);
        switch (fmo2.ilu) {
            case 2: {
                if (fmo2.eo) break;
                this.gMm.b(this, this.gMn);
                break;
            }
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
                lfn.b(5, "SFMergePerformer", "handleInventoryOperationReceiptMessage() Receipt for unhandled operation received: " + fmo2.ilu);
            }
        }
    }

    private void b(fmw fmw2) {
        if (fmw2.iQE == null) {
            lfn.b(5, "SFMergePerformer", "handleRemoveItemResponse() RemovedItemWrapper is null.");
            return;
        }
        if (fmw2.iQE.dIY == null) {
            lfn.b(5, "SFMergePerformer", "handleRemoveItemResponse() Item in RemovedItemWrapper is null.");
            return;
        }
        assert (fmw2.iQE.dIY.getGUID().equals(this.gLI.gLe.GUID));
        this.mb = 3;
        this.gMb = (bqs)fmw2.iQE.dIY;
        if (dng.gKK && !dng.gKL) {
            this.gMp = true;
        }
        this.a(this.gLI.gLf, this.gMb, this.gLI.gLh);
        if (this.gMo) {
            boolean bl = this.gLI.AY(this.gLI.gKT);
            this.gMa = this.gMb.dS(bl);
        }
    }
}


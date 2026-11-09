/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class dpa
extends dpd {
    public static final int gMi = 3;
    private dnv gLM = null;
    private bqs gMj = null;
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
        if (this.gMj != null) {
            this.a(this.gLM.gLc, this.gMj, (dny)this.gLM.gLs);
        }
        this.a(this.gLM.gLc, this.gLM.gLs);
        this.a(this.gLM.gLf, this.gLM.gLh);
    }

    @Override
    protected void brN() {
        assert (this.mb == 2);
        this.a(this.gLM.gLc, this.gLM.gLs);
        this.a(this.gLM.gLf, this.gLM.gLh);
        if (this.gMo) {
            if (this.gMa != null) {
                ldv ldv2 = null;
                ldv2 = this.gLM.AY(this.gLM.gKS) ? lcr.tQ((ldv)this.gLM.gLf) : lcr.tQ((ldv)this.gLM.gLc);
                this.a(ldv2, new bro[]{this.gMa});
            } else {
                lfn.b(5, this.getClass().getSimpleName(), "cleanUpTransaction() : Item for Logging is Null!!!");
                assert (false);
            }
        }
    }

    @Override
    protected void brO() {
        this.gLM = (dnv)this.gMn;
        if (dng.gKK && dng.gKL) {
            this.gMp = true;
        }
        this.a(this.gLM.gLc, this.gLM.gLs, true);
    }

    private void a(fmo fmo2) {
        if (this.gMo) assert (this.gMa != null);
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
            case 10: {
                if (fmo2.eo) break;
                this.gMm.b(this, this.gMn);
                break;
            }
            default: {
                lfn.b(5, "SFSplitAndMergePerformer", "handleInventoryOperationReceiptMessage() Receipt for unhandled operation received: " + fmo2.ilu);
            }
        }
    }

    private void a(fno fno2) {
        if (fno2.gMj == null) {
            lfn.b(5, "SFSplitAndMergePerformer", "handleSplitItemResponse() Split is null.");
            return;
        }
        this.mb = 3;
        this.gMj = fno2.gMj;
        if (this.gMo) {
            boolean bl = this.gLM.AY(this.gLM.gKT);
            this.gMa = this.gMj.dS(bl);
        }
        if (dng.gKK && !dng.gKL) {
            this.gMp = true;
        }
        this.a(this.gLM.gLf, this.gMj, this.gLM.gLh);
    }
}


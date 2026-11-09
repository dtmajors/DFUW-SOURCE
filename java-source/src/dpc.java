/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class dpc
extends dpd {
    public static final int gMi = 3;
    public static final int gLU = 4;
    public static final int gMk = 5;
    private dnt gLN = null;
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
            case 7994: {
                this.c((fmy)dxq2);
                break;
            }
            case 6146: {
                this.b((gfn)dxq2);
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
            this.a(this.gLN.gLc, this.gMj, (dny)this.gLN.gLn);
        }
        this.a(this.gLN.gLc, this.gLN.gLn);
    }

    @Override
    protected void brN() {
        assert (this.mb == 2);
        this.a(this.gLN.gLc, this.gLN.gLn);
        if (this.gMo) {
            if (this.gMa != null) {
                ldv ldv2 = null;
                ldv2 = this.gLN.AY(this.gLN.gKS) ? lcr.tQ((ldv)this.gLN.gLf) : lcr.tQ((ldv)this.gLN.gLc);
                this.a(ldv2, new bro[]{this.gMa});
            } else {
                lfn.b(5, this.getClass().getSimpleName(), "cleanUpTransaction() : Item for Logging is Null!!!");
                assert (false);
            }
        }
    }

    @Override
    protected void brO() {
        this.gLN = (dnt)this.gMn;
        if (dng.gKK && dng.gKL) {
            this.gMp = true;
        }
        this.a(this.gLN.gLc, (dob)this.gLN.gLn, true, false);
    }

    private void a(fmo fmo2) {
        if (this.gMo) assert (this.gMa != null);
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
            case 10: {
                if (fmo2.eo) break;
                this.gMm.b(this, this.gMn);
                break;
            }
            default: {
                lfn.b(5, "SFSplitPerformer", "handleInventoryOperationReceiptMessage() Receipt for unhandled operation received: " + fmo2.ilu);
            }
        }
    }

    private void c(fmy fmy2) {
        if (fmy2.iQF) {
            this.mb = 2;
            this.gMm.a(this, this.gMn);
            return;
        }
        this.a(this.gMj.az(), this.gLN.gLo, this.gLN.gLo, this.gMj.vf());
    }

    private void b(gfn gfn2) {
        if (gfn2.dtF == null) {
            lfn.b(5, "SFSplitPerformer", "handleResourceCreateResponseMessage() Resource '" + this.gMj.pa() + "' could not be created.");
            return;
        }
        assert (gfn2.dtF.getGUID().equals(this.gLN.gLo));
        assert (this.gMj.az() == gfn2.dtF.az());
        this.MessageDelegator.a((amf)gfn2.dtF);
        this.mb = 4;
        brv brv2 = new brv();
        brv2.dIY = this.gMj;
        brv2.dJc = this.gLN.gLn.dJc;
        if (dng.gKK && !dng.gKL) {
            this.gMp = true;
        }
        this.a(this.gLN.gLf, this.gLN.gLg, new brv[]{brv2}, bqy.dFU);
    }

    private void a(fno fno2) {
        if (fno2.gMj == null) {
            lfn.b(5, "SFSplitPerformer", "handleSplitItemResponse() Split is null.");
            return;
        }
        this.mb = 3;
        this.gMj = fno2.gMj;
        this.gMj.setGUID(this.gLN.gLo);
        if (this.gMo) {
            boolean bl = this.gLN.AY(this.gLN.gKT);
            this.gMa = this.gMj.dS(bl);
        }
        if (this.gLN.gLp) {
            this.a(this.gLN.gLf, this.gMj.az(), this.gMj.vf(), this.gLN.gLg, bqy.dFU);
        } else {
            this.a(this.gMj.az(), this.gLN.gLo, this.gLN.gLo, this.gMj.vf());
        }
    }
}


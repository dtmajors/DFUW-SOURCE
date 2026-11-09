/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
public class dpf
extends dpd {
    public static final int gLZ = 3;
    private dnw gLR = null;
    private brv gMq = null;
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
            case 7994: {
                this.c((fmy)dxq2);
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
        if (this.gMq != null) {
            this.a(this.gLR.gLc, this.gLR.gLd, new brv[]{this.gMq}, bqy.dHn);
        }
        this.a(this.gLR.gLc, (dny)this.gLR.gLt);
    }

    @Override
    protected void brN() {
        assert (this.mb == 2);
        this.a(this.gLR.gLc, (dny)this.gLR.gLt);
        if (this.gMo) {
            if (this.gMc != null) {
                boolean bl = false;
                for (int i = 0; i < this.gMc.length; ++i) {
                    if (this.gMc[i] != null) continue;
                    bl = true;
                    break;
                }
                if (!bl) {
                    ldv ldv2 = null;
                    ldv2 = this.gLR.AY(this.gLR.gKS) ? lcr.tQ((ldv)this.gLR.gLf) : lcr.tQ((ldv)this.gLR.gLc);
                    this.a(ldv2, this.gMc);
                } else {
                    lfn.b(5, this.getClass().getSimpleName(), "cleanUpTransaction() : Items for Logging contains a Null element!!!");
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
        this.gLR = (dnw)this.gMn;
        if (dng.gKK && dng.gKL) {
            this.gMp = true;
        }
        boolean bl = this.gLR.gKT == cug.fnL;
        this.a(this.gLR.gLc, this.gLR.gLt, false, bl, true, false, bqy.dHl, this.gLR.gLu);
    }

    private void a(fmo fmo2) {
        switch (fmo2.ilu) {
            case 1: {
                if (fmo2.eo) {
                    this.mb = 2;
                    this.gMm.a(this, this.gMn, this.gMq);
                    break;
                }
                this.gMm.b(this, this.gMn);
                break;
            }
            case 2: {
                if (fmo2.eo) break;
                this.gMm.b(this, this.gMn);
                break;
            }
            default: {
                lfn.b(5, "SFTransferPerformer", "handleInventoryOperationReceiptMessage() Receipt for unhandled operation received: " + fmo2.ilu);
            }
        }
    }

    private void c(fmy fmy2) {
        if (fmy2.iQF) {
            this.mb = 2;
            this.gMm.a(this, this.gMn, this.gMq);
            return;
        }
        this.a(this.gLR.gLf, this.gLR.gLg, new brv[]{this.gMq}, bqy.dHm);
    }

    private void b(fmw fmw2) {
        if (fmw2.iQE == null) {
            lfn.b(5, "SFTransferPerformer", "handleRemoveItemResponse() RemovedItemWrapper is null.");
            return;
        }
        if (fmw2.iQE.dIY == null) {
            lfn.b(5, "SFTransferPerformer", "handleRemoveItemResponse() Item in RemovedItemWrapper is null.");
            return;
        }
        brm brm2 = fmw2.iQE.dIY;
        assert (brm2.getGUID().equals(this.gLR.gLt.GUID));
        this.mb = 3;
        this.gMq = fmw2.iQE;
        this.gMq.dJc = this.gLR.gLt.dJc;
        bqs bqs2 = (bqs)this.gMq.dIY;
        if (this.gMo) {
            boolean bl = this.gLR.AY(this.gLR.gKT);
            this.gMc = this.a(this.gMq, bl);
        }
        if (dng.gKK && !dng.gKL) {
            this.gMp = true;
        }
        if (this.gLR.gLv) {
            this.a(this.gLR.gLf, bqs2.az(), bqs2.vf(), this.gLR.gLg, bqy.dHm);
        } else {
            this.a(this.gLR.gLf, this.gLR.gLg, new brv[]{this.gMq}, bqy.dHm);
        }
    }
}


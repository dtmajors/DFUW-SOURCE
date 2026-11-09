/*
 * Decompiled with CFR.
 */
public class dpb
extends dpd {
    public static final int gLU = 3;
    private dnt gLN = null;

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7946: {
                this.a((fmo)dxq2);
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
        this.a(this.gLN.gLc, this.gLN.gLn);
        if (this.gLN.gLq != null) {
            this.a(this.gLN.gLf, this.gLN.gLq);
        }
        if (this.mb == 3) {
            this.aH(this.gLN.gLo);
        }
    }

    @Override
    protected void brN() {
        assert (this.mb == 2);
        this.a(this.gLN.gLc, this.gLN.gLn);
        if (this.gLN.gLq != null) {
            this.a(this.gLN.gLf, this.gLN.gLq);
        }
    }

    @Override
    protected void brO() {
        this.gLN = (dnt)this.gMn;
        if (this.gLN.gLp) {
            this.a(this.gLN.gLf, (dob)this.gLN.gLn, this.gLN.gLq);
        } else {
            this.a(this.gLN.gLn.aRX, this.gLN.gLo, this.gLN.gLo, this.gLN.gLn.gLC);
        }
    }

    private void a(fmo fmo2) {
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
                lfn.b(5, "SFSplitInternallyPerformer", "handleInventoryOperationReceiptMessage() Receipt for unhandled operation received: " + fmo2.ilu);
            }
        }
    }

    private void b(gfn gfn2) {
        if (gfn2.dtF == null) {
            lfn.b(5, "SFSplitInternallyPerformer", "handleResourceCreateResponseMessage() Resource '" + this.gLN.gLn.bkf() + "' could not be created.");
            return;
        }
        assert (gfn2.dtF.getGUID().equals(this.gLN.gLo));
        assert (this.gLN.gLn.aRX == gfn2.dtF.az());
        this.MessageDelegator.a((amf)gfn2.dtF);
        this.mb = 3;
        if (dng.gKK) {
            this.gMp = true;
        }
        this.a(this.gLN.gLf, this.gLN.gLn, this.gLN.gLg, gfn2.dtF.getGUID());
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 */
public class bqo
extends bqn {
    private bpw dFe = null;
    private bpw dFf = null;
    private ldv dFg = null;

    public bqo(bqv bqv2) {
        super(bqv2);
    }

    @Override
    public void cleanUp() {
        if (this.dFe != null) {
            this.MessageDelegator.oa(this.dFe.Rs);
        }
        if (this.dFf != null) {
            this.MessageDelegator.oa(this.dFf.Rs);
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        this.dFe = new bpw();
        this.dFe.dBm = cxd.k.fRE;
        this.dFe.Rs = this.MessageDelegator.bzv();
        this.dFf = new bpw();
        this.dFf.dBm = cxd.k.fRF;
        this.dFf.Rs = this.MessageDelegator.bzv();
    }

    @Override
    protected void auI() {
        double d2;
        if (this.dFe.dBn) {
            lfn.b(5, "SFInventoryConstraintManagerClient", "handleAttachTimerStarted() AttachTimer progressbar is already started.");
            assert (false);
            return;
        }
        this.dFe.aXq = d2 = this.MessageDelegator.arc().rgz;
        this.dFe.dBo = this.dEZ;
        this.dFe.dBp = this.dEZ;
        this.a(this.dFe);
        ((bql)this.dEY.asf()).n(1, this.dFb.iPE);
    }

    @Override
    protected void auJ() {
        super.auJ();
        if (this.dFe.dBn) {
            this.b(this.dFe);
        }
    }

    @Override
    protected void auK() {
        double d2;
        if (this.dFf.dBn) {
            lfn.b(5, "SFInventoryConstraintManagerClient", "handleDetachTimerStarted() DetachTimer progressbar is already started.");
            assert (false);
            return;
        }
        this.dFf.aXq = d2 = this.MessageDelegator.arc().rgz;
        this.dFf.dBo = this.dFa;
        this.dFf.dBp = this.dFa;
        this.a(this.dFf);
        ((bql)this.dEY.asf()).n(1, this.dFc.iPE);
    }

    @Override
    protected void auL() {
        super.auL();
        if (this.dFf.dBn) {
            this.b(this.dFf);
        }
    }

    @Override
    protected void auM() {
        super.auM();
        if (this.dFe.dBn) {
            this.b(this.dFe);
        }
        if (this.dFf.dBn) {
            this.b(this.dFf);
        }
    }

    private void a(bpw bpw2) {
        assert (bpw2 != null);
        assert (!bpw2.dBn);
        if (this.dFg == null) {
            this.dFg = ((cdb)this.dEY.auk()).aJO().ayh();
        }
        eeu eeu2 = (eeu)this.MessageDelegator.h(12808, this.dEY.getGUID(), this.dFg);
        eeu2.inN = cxd.k.getProgressTypeToMessage(bpw2.dBm);
        eeu2.aCK = bpw2.Rs;
        eeu2.ioa = false;
        eeu2.aXq = bpw2.aXq;
        eeu2.dBo = bpw2.dBo;
        eeu2.dBp = bpw2.dBp;
        this.MessageDelegator.E(eeu2);
        bpw2.dBn = true;
    }

    private void b(bpw bpw2) {
        assert (bpw2 != null);
        assert (bpw2.dBn);
        eeu eeu2 = (eeu)this.MessageDelegator.h(12808, this.dEY.getGUID(), this.dFg);
        eeu2.inN = cxd.k.getProgressTypeToMessage(bpw2.dBm);
        eeu2.aCK = bpw2.Rs;
        eeu2.dBp = 0.0;
        this.MessageDelegator.E(eeu2);
        bpw2.dBn = false;
    }
}


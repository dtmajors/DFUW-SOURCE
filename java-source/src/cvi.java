/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 */
public class cvi
extends cvj {
    private int bpX = 0;
    private int fzG = 0;
    private cdb fzH = null;

    public cvi(cvk.a a2) {
        super(a2);
    }

    public void fK(int n) {
        this.bpX = n;
    }

    @Override
    public void doTick(ldz ldz2) {
        assert (this.fzH != null);
        if (this.fzH.isScheduledForRemoval()) {
            this.Dq();
            this.Active = false;
        } else {
            this.bcv();
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        amf amf2 = this.MessageDelegator.d(this.fzI);
        if (amf2 == null) {
            this.Active = false;
            return;
        }
        if (!(amf2 instanceof cdb)) {
            this.Active = false;
            return;
        }
        this.fzH = (cdb)amf2;
        this.bcv();
    }

    private void bcv() {
        assert (this.bpX > 0);
        assert (this.fzH != null);
        int n = this.fzH.aJD().aEP().nP(this.bpX);
        if (this.fzG != n) {
            this.fzG = n;
            this.Dr();
        }
    }

    private void Dr() {
        assert (this.Xe != null);
        assert (this.fzI != null);
        assert (this.bpX > 0);
        assert (this.fzG > 0);
        ghp ghp2 = (ghp)this.MessageDelegator.h(519, this.GUID, this.Xe);
        ghp2.bpX = this.bpX;
        ghp2.bpZ = this.fzG;
        this.MessageDelegator.F(ghp2);
        this.Active = false;
    }
}


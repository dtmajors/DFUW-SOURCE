/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cph
 *  cug
 */
public class cvm
extends cvj
implements cbq {
    private cph fzN = null;
    private static les ResourceTree = lea.enW();

    public cvm(cvk.a a2) {
        super(a2);
    }

    @Override
    public void doTick(ldz ldz2) {
        assert (this.fzN != null);
        if (this.fzN.isScheduledForRemoval()) {
            this.Dq();
            this.Active = false;
        } else {
            this.bcu();
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        this.fzN = (cph)this.MessageDelegator.d(this.fzI);
        if (this.fzN == null) {
            this.Dr();
            return;
        }
        if (!cug.ux((int)this.fzN.az())) {
            this.Dr();
            return;
        }
        this.fzN.e((cbq)this);
        this.bcu();
    }

    @Override
    public void cleanUp() {
        if (this.fzN != null) {
            this.fzN.f((cbq)this);
        }
        super.cleanUp();
    }

    private void bcu() {
        assert (this.fzN != null);
        if (!this.fzN.aXW()) {
            this.Dr();
        }
    }

    private void Dr() {
        assert (this.Xe != null);
        assert (this.fzI != null);
        ght ght2 = (ght)this.MessageDelegator.h(517, this.GUID, this.Xe);
        this.MessageDelegator.F(ght2);
        this.Active = false;
    }

    @Override
    public boolean b(cbx cbx2, et et2) {
        return true;
    }

    @Override
    public void b(cbx cbx2) {
        if (this.fzN == null) {
            return;
        }
        if (this.fzN != cbx2) {
            return;
        }
        this.Dr();
    }

    @Override
    public void a(cbx cbx2, et et2) {
        if (et2.getType() != 352) {
            return;
        }
        if (this.fzN == null) {
            return;
        }
        if (this.fzN != cbx2) {
            return;
        }
        this.Dr();
    }
}


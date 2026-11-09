/*
 * Decompiled with CFR.
 */
public class rd
extends qd {
    private ldv aFc;
    private sd aPd;
    private sd aPe;
    private sq aPf;

    public rd(md md2) {
        super(md2, me.aya);
    }

    public void cj(ldv ldv2) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerSaveOneFortress", "setFortressGUID: Can't modify while working");
            assert (false);
            return;
        }
        this.aFc = ldv2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aPd = this.f(new sd((md)this, "SaveFortressBegin"));
        this.aPe = this.f(new sd((md)this, "SaveFortressEnd"));
        this.aPf = this.f(new sq((md)this, nx.class));
    }

    @Override
    public void cleanUp() {
        this.e(this.aPd);
        this.e(this.aPe);
        this.e(this.aPf);
        this.aPd = null;
        this.aPe = null;
        this.aPf = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aPd.g(this.aFc);
        this.aPd.start();
    }

    @Override
    protected void sP() {
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            this.ca(qe2.getErrorMessage());
            return;
        }
        if (qe2 == this.aPd) {
            bjx bjx2 = (bjx)this.MessageDelegator.bzx().bzt().d(this.aFc);
            nw nw2 = bjx2.aqQ();
            this.aPf.c(nw2.aFd);
            this.aPf.start();
        } else if (qe2 == this.aPf) {
            this.aPe.g(this.aFc);
            this.aPe.start();
        } else if (qe2 == this.aPe) {
            this.ca(null);
        } else {
            lfn.b(5, "SFPersistenceWorkerSaveOneFortress", "notifyChildCompleted: Unhandled worker " + qe2);
            assert (false);
            this.ca("Internal error");
        }
    }
}


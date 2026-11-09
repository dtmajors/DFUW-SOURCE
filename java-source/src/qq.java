/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class qq
extends qd {
    private ldv aFc;
    private sn aNy;
    private nw aNz;
    private String aMH;

    public qq(md md2) {
        super(md2, me.axQ);
    }

    public void cj(ldv ldv2) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerLoadOneFortress", "setFortressGUID: Can't modify while working");
            assert (false);
            return;
        }
        this.aFc = ldv2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aNy = this.f(new sn((md)this, nx.class));
    }

    @Override
    public void cleanUp() {
        this.e(this.aNy);
        this.aNy = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aNz = new nw();
        this.aNz.aFc = this.aFc;
        this.aNy.h(this.aFc);
        this.aNy.start();
    }

    @Override
    protected void sP() {
        this.aNz = null;
        this.aMH = null;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            if (this.aMH == null) {
                this.aMH = qe2.getErrorMessage();
            }
        } else if (qe2 == this.aNy) {
            this.aNz.aFd = (nx)this.aNy.ub();
            bjv bjv2 = (bjv)this.MessageDelegator.bzx().bzt().d(lcr.qBG);
            bjv2.a(this.aNz);
            this.ca(null);
        } else {
            lfn.b(5, "SFPersistenceWorkerLoadOneFortress", "notifyChildCompleted: Unhandled worker " + qe2);
            assert (false);
        }
    }
}


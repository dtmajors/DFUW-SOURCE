/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class qo
extends qd {
    private ldv aDk;
    private sn aNm;
    private so aNn;
    private String aMH;
    private ni aNo;

    public qo(md md2) {
        super(md2, me.axN);
    }

    public void ci(ldv ldv2) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerLoadOneCity", "setCityGUID: Can't modify while working");
            assert (false);
            return;
        }
        this.aDk = ldv2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aNm = this.f(new sn((md)this, nj.class));
        this.aNn = this.f(new so((md)this, nk.class));
    }

    @Override
    protected void sO() {
        this.aNo = new ni();
        this.aNo.aDk = this.aDk;
        this.aNm.h(this.aDk);
        this.aNm.start();
        this.aNn.h(this.aDk);
        this.aNn.start();
    }

    @Override
    protected void sP() {
        this.aMH = null;
        this.aNo = null;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            if (this.aMH == null) {
                this.aMH = qe2.getErrorMessage();
            }
        } else if (qe2 == this.aNm) {
            this.aNo.aDl = (nj)this.aNm.ub();
        } else if (qe2 == this.aNn) {
            this.aNo.aDm = lcn.emA();
            this.aNn.d(this.aNo.aDm);
        }
        if (this.aNo.aDl != null && this.aNo.aDm != null) {
            this.td();
        }
        if (this.su() == 0) {
            this.ca(this.aMH);
        }
    }

    private void td() {
        axv axv2 = (axv)this.MessageDelegator.bzx().bzt().d(lcr.qCn);
        jwj jwj2 = new jwj();
        axs axs2 = jwj2.uJ(this.aNo.aDl.aDq);
        if (axs2 == null) {
            this.aMH = "Could not load and parse " + this.aNo.aDl.aDq;
            return;
        }
        for (axq axq2 : axs2.YG()) {
            axq2.Yi();
        }
        axv2.a(axs2, this.aNo);
    }
}


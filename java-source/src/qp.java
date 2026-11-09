/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class qp
extends qd {
    private ldv ade;
    private sn aNp;
    private so aNq;
    private so aNr;
    private so aNs;
    private so aNt;
    private so aNu;
    private so aNv;
    private so aNw;
    private so aNx;
    private String aMH;

    public qp(md md2) {
        super(md2, me.axK);
    }

    public final void ch(ldv ldv2) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerLoadOneClan", "setClanGUID: Can't modify while working.");
            assert (false);
            return;
        }
        this.ade = ldv2;
    }

    public final ldv iG() {
        return this.ade;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aNp = this.f(new sn((md)this, nn.class));
        this.aNq = this.f(new so((md)this, no.class));
        this.aNr = this.f(new so((md)this, nr.class));
        this.aNs = this.f(new so((md)this, ns.class));
        this.aNt = this.f(new so((md)this, nb.class));
        this.aNu = this.f(new so((md)this, nt.class));
        this.aNv = this.f(new so((md)this, np.class));
        this.aNw = this.f(new so((md)this, nq.class));
        this.aNx = this.f(new so((md)this, ok.class));
    }

    @Override
    public void cleanUp() {
        this.e(this.aNp);
        this.e(this.aNq);
        this.e(this.aNr);
        this.e(this.aNs);
        this.e(this.aNt);
        this.e(this.aNu);
        this.e(this.aNv);
        this.e(this.aNw);
        this.e(this.aNx);
        this.aNp = null;
        this.aNq = null;
        this.aNr = null;
        this.aNs = null;
        this.aNt = null;
        this.aNu = null;
        this.aNv = null;
        this.aNw = null;
        this.aNx = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aNp.h(this.ade.fk());
        this.aNp.start();
        this.aNq.h(this.ade.fk());
        this.aNq.start();
        this.aNr.h(this.ade.fk());
        this.aNr.start();
        this.aNs.h(this.ade.fk());
        this.aNs.start();
        this.aNt.h(this.ade.fk());
        this.aNt.start();
        this.aNu.h(this.ade.fk());
        this.aNu.start();
        this.aNv.h(this.ade.fk());
        this.aNv.start();
        this.aNw.h(this.ade.fk());
        this.aNw.start();
        this.aNx.h(this.ade.fk());
        this.aNx.start();
    }

    @Override
    protected void sP() {
        this.aMH = null;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS() && this.aMH == null) {
            this.aMH = qe2.getErrorMessage();
        }
        if (this.su() > 0) {
            return;
        }
        if (this.aMH != null) {
            this.ca(this.aMH);
            return;
        }
        this.te();
        this.ca(null);
    }

    private void te() {
        nm nm2 = new nm();
        nm2.ade = this.ade;
        nm2.aDy = (nn)this.aNp.ub();
        nm2.aDz = lcn.emA();
        this.aNq.d(nm2.aDz);
        nm2.aDA = lcn.emA();
        this.aNr.d(nm2.aDA);
        nm2.aDB = lcn.emA();
        this.aNs.d(nm2.aDB);
        nm2.aCN = lcn.emA();
        this.aNt.d(nm2.aCN);
        nm2.aDC = lcn.emA();
        this.aNu.d(nm2.aDC);
        nm2.aDD = lcn.emA();
        this.aNv.d(nm2.aDD);
        nm2.aDE = lcn.emA();
        this.aNw.d(nm2.aDE);
        nm2.Zo = lcn.emA();
        this.aNx.d(nm2.Zo);
        ayr ayr2 = (ayr)this.MessageDelegator.bzx().bzt().d(lcr.qEd);
        ayr2.b(nm2);
    }
}


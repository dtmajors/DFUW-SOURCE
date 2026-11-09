/*
 * Decompiled with CFR.
 */
import java.util.LinkedList;
import java.util.List;

public class rg
extends qd
implements bto {
    private ldv aGH;
    private sd aPq;
    private sd aPr;
    private sq aPs;
    private LinkedList<re> aPt = lcn.emA();
    private LinkedList<ph> aPu = lcn.emA();
    private int aPv;
    private pf aPw;
    private String aMH;

    public rg(md md2) {
        super(md2, me.axX);
    }

    public void cl(ldv ldv2) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerSaveOneVillage", "setVillageGUID: Can't modify while working");
            assert (false);
            return;
        }
        this.aGH = ldv2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aPq = this.f(new sd((md)this, "SaveVillageBegin"));
        this.aPr = this.f(new sd((md)this, "SaveVillageEnd"));
        this.aPs = this.f(new sq((md)this, pg.class));
    }

    @Override
    public void cleanUp() {
        for (re re2 : this.aPt) {
            this.e(re2);
        }
        this.aPt.clear();
        this.e(this.aPq);
        this.e(this.aPr);
        this.e(this.aPs);
        this.aPq = null;
        this.aPr = null;
        this.aPs = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        dpx dpx2 = (dpx)this.MessageDelegator.bzx().bzt().d(this.aGH);
        this.aPw = dpx2.bsK();
        if (this.aPw == null) {
            lfn.b(5, "SFPersistenceWorkerSaveOneCity", "startWork: Persistence Data for Village " + this.aGH + " not found");
            this.ca("Persistence Data for Village " + this.aGH + " not found");
            return;
        }
        this.aPu.addAll(this.aPw.aGJ);
        this.aPv = 0;
        this.aPs.c(this.aPw.aGI);
        this.aPq.g(this.aGH);
        this.aPq.start();
        this.tC();
    }

    @Override
    protected void sP() {
        this.aMH = null;
        this.aPw = null;
        this.aPv = 0;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            if (this.aMH == null) {
                this.aMH = qe2.getErrorMessage();
            }
        } else if (qe2 == this.aPq) {
            this.aPs.start();
        } else if (qe2 == this.aPs) {
            if (this.su() == 0) {
                this.aPr.g(this.aGH);
                this.aPr.start();
            }
        } else if (qe2.aMr == me.axY) {
            --this.aPv;
            this.aPt.add((re)qe2);
            this.tC();
            if (this.su() == 0) {
                this.aPr.g(this.aGH);
                this.aPr.start();
            }
        }
        if (this.su() == 0) {
            this.ca(this.aMH);
        }
    }

    private void tC() {
        if (this.aPu.isEmpty()) {
            return;
        }
        if (this.aPv >= 5) {
            return;
        }
        if (this.aMH != null) {
            return;
        }
        re re2 = this.aPt.pollFirst();
        if (re2 == null) {
            re2 = this.f(new re(this));
        }
        ph ph2 = this.aPu.pollFirst();
        List<nb> list = this.aPw.aGK.get(ph2.aGQ);
        re2.a(ph2, list);
        ++this.aPv;
        re2.start();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.sR()) {
            this.tC();
        }
    }
}


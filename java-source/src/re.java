/*
 * Decompiled with CFR.
 */
import java.util.List;

public class re
extends qd {
    private ph aPg;
    private List<nb> aCN;
    private sd aPh;
    private qf aPi;
    private sq aPj;
    private sr aPk;
    private ss aOK;
    private String aMH;
    private boolean aOG;

    public re(md md2) {
        super(md2, me.axY);
    }

    public void a(ph ph2, List<nb> list) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerSaveOneHouse", "setStorables: Can't modify while working");
            assert (false);
            return;
        }
        this.aPg = ph2;
        this.aCN = list;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aPh = this.f(new sd((md)this, "ProcClearHouseTables"));
        this.aPi = this.f(new qf(this));
        this.aPj = this.f(new sq((md)this, ph.class));
        this.aPk = this.f(new sr(this, nb.class, true));
        this.aOK = this.f(new ss(this));
    }

    @Override
    public void cleanUp() {
        this.e(this.aPh);
        this.e(this.aPi);
        this.e(this.aPj);
        this.e(this.aPk);
        this.e(this.aOK);
        this.aOK = null;
        this.aPh = null;
        this.aPi = null;
        this.aPj = null;
        this.aPk = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aOG = false;
        if (this.aCN != null && !this.aCN.isEmpty()) {
            this.aOK.F(this.aCN);
            this.aOK.start();
        } else {
            this.aPh.g(this.aPg.aGQ);
            this.aPh.start();
        }
    }

    @Override
    protected void sP() {
        this.aMH = null;
        this.aOG = false;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            if (this.aMH == null) {
                this.aMH = qe2.getErrorMessage();
            }
        } else if (qe2 == this.aOK) {
            this.aPh.g(this.aPg.aGQ);
            this.aPh.start();
        } else if (qe2 == this.aPh) {
            if (!this.aOG) {
                this.aPj.c(this.aPg);
                this.aPj.start();
                if (this.aCN != null && !this.aCN.isEmpty()) {
                    this.aPk.e(this.aCN);
                    this.aPk.start();
                }
            }
        } else if (qe2 == this.aPj || qe2 == this.aPk) {
            if (this.su() == 0) {
                this.aPi.a(pu.aJB, this.aPg.aGQ);
                this.aPi.start();
            }
        } else if (qe2 == this.aPi) {
            this.aOG = true;
            this.aPh.g(this.aPg.aGQ);
            this.aPh.start();
        } else {
            lfn.b(5, "SFPersistenceWorkerSaveOneHouse", "notifyChildCompleted: Unhandled worker " + qe2);
            assert (false);
        }
        if (this.su() == 0) {
            this.ca(this.aMH);
        }
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  axx
 */
public class rb
extends qd {
    private ldv aDk;
    private sd aON;
    private qf aOO;
    private sq aOP;
    private sr aOQ;
    private String aMH;
    private boolean aOG;

    public rb(md md2) {
        super(md2, me.axW);
    }

    public void ci(ldv ldv2) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerSaveOneCity", "setCityGUID: Can't modify while working");
            assert (false);
            return;
        }
        this.aDk = ldv2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aON = this.f(new sd((md)this, "ProcClearCityTables"));
        this.aOO = this.f(new qf(this));
        this.aOP = this.f(new sq((md)this, nj.class));
        this.aOQ = this.f(new sr(this, nk.class, false));
    }

    @Override
    public void cleanUp() {
        this.e(this.aON);
        this.e(this.aOO);
        this.e(this.aOP);
        this.e(this.aOQ);
        this.aON = null;
        this.aOO = null;
        this.aOP = null;
        this.aOQ = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        axx axx2 = (axx)this.MessageDelegator.bzx().bzt().d(this.aDk);
        if (axx2 == null) {
            lfn.b(5, "SFPersistenceWorkerSaveOneCity", "startWork: City " + this.aDk + " not found");
            this.ca("City " + this.aDk + " not found");
            return;
        }
        ni ni2 = axx2.YR();
        this.aOP.c(ni2.aDl);
        this.aOQ.e(ni2.aDm);
        this.aOG = false;
        this.aON.g(this.aDk);
        this.aON.start();
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
        } else if (qe2 == this.aON) {
            if (!this.aOG) {
                this.aOP.start();
                this.aOQ.start();
            }
        } else if (qe2 == this.aOP || qe2 == this.aOQ) {
            if (this.su() == 0) {
                this.aOO.a(pu.aJA, this.aDk);
                this.aOO.start();
            }
        } else if (qe2 == this.aOO) {
            this.aOG = true;
            this.aON.g(this.aDk);
            this.aON.start();
        }
        if (this.su() == 0) {
            this.ca(this.aMH);
        }
    }
}


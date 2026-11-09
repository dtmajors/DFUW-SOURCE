/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class qw
extends qd {
    public int SN;
    private sn aOb;
    private so aOc;
    private so aOd;
    private so aOe;
    private so aOf;
    private so aOg;
    private sn aOh;
    private so aOi;
    private String aMH;
    private nc Zk;

    public qw(md md2) {
        super(md2, me.ayh);
    }

    public void cS(int n) {
        if (this.sR()) {
            assert (false);
            lfn.b(5, "SFPersistenceWorkerReadCharacterOnlineData", "setCharacterID: Can't change character ID while working");
            return;
        }
        this.SN = n;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aOb = this.f(new sn((md)this, nd.class));
        this.aOc = this.f(new so((md)this, nh.class));
        this.aOd = this.f(new so((md)this, nb.class));
        this.aOe = this.f(new so((md)this, oh.class));
        this.aOf = this.f(new so((md)this, ne.class));
        this.aOh = this.f(new sn((md)this, nf.class));
        this.aOg = this.f(new so((md)this, oo.class));
        this.aOi = this.f(new so((md)this, ng.class));
    }

    @Override
    public void cleanUp() {
        this.e(this.aOb);
        this.e(this.aOc);
        this.e(this.aOd);
        this.e(this.aOe);
        this.e(this.aOf);
        this.e(this.aOh);
        this.e(this.aOg);
        this.e(this.aOi);
        this.aOb = null;
        this.aOc = null;
        this.aOd = null;
        this.aOe = null;
        this.aOf = null;
        this.aOh = null;
        this.aOg = null;
        this.aOi = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.Zk = new nc();
        this.aOb.h(this.SN);
        this.aOb.start();
        this.aOc.h(this.SN);
        this.aOc.start();
        this.aOd.h(lcr.abW((int)this.SN));
        this.aOd.start();
        this.aOe.h(this.SN);
        this.aOe.start();
        this.aOf.h(this.SN);
        this.aOf.start();
        this.aOh.h(this.SN);
        this.aOh.an(true);
        this.aOh.start();
        this.aOg.h(this.SN);
        this.aOg.start();
        this.aOi.h(this.SN);
        this.aOi.start();
    }

    @Override
    protected void sP() {
        this.aMH = null;
        this.Zk = null;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2 == this.aOb) {
            if (this.aOb.sS()) {
                lfn.b(5, "SFPersistenceWorkerReadCharacterOnlineData", "notifyChildCompleted: Could not load character object for character " + this.SN + ": " + this.aOb.getErrorMessage());
                this.aMH = this.aOb.getErrorMessage();
            } else {
                this.Zk.aCL = (nd)this.aOb.ub();
            }
        } else if (qe2 == this.aOc) {
            if (qe2.sS()) {
                lfn.b(5, "SFPersistenceWorkerReadCharacterOnlineData", "notifyChildCompleted: Lost skills for character " + this.SN + ": " + qe2.getErrorMessage());
            }
            this.Zk.aCM = lcn.emA();
            this.aOc.d(this.Zk.aCM);
        } else if (qe2 == this.aOd) {
            if (qe2.sS()) {
                lfn.b(5, "SFPersistenceWorkerReadCharacterOnlineData", "notifyChildCompleted: Lost items for character " + this.SN + ": " + qe2.getErrorMessage());
            }
            this.Zk.aCN = lcn.emA();
            this.aOd.d(this.Zk.aCN);
        } else if (qe2 == this.aOe) {
            if (this.aOe.sS()) {
                lfn.b(5, "SFPersistenceWorkerReadCharacterOfflineData", "notifyChildCompleted: Lost feats for character " + this.SN + ": " + this.aOe.getErrorMessage());
            }
            this.Zk.aCO = lcn.emA();
            this.aOe.d(this.Zk.aCO);
        } else if (qe2 == this.aOf) {
            if (this.aOf.sS()) {
                lfn.b(5, "SFPersistenceWorkerReadCharacterOfflineData", "notifyChildCompleted: Lost Gui Config for character " + this.SN + ": " + this.aOf.getErrorMessage());
            }
            this.Zk.aCP = lcn.emA();
            this.aOf.d(this.Zk.aCP);
        } else if (qe2 == this.aOh) {
            if (this.aOh.sS()) {
                lfn.b(5, "SFPersistenceWorkerReadCharacterOnlineData", "notifyChildCompleted: Could not load character custom role settings for character " + this.SN + ": " + this.aOh.getErrorMessage());
                this.aMH = this.aOh.getErrorMessage();
            } else {
                this.Zk.aCR = (nf)this.aOh.ub();
            }
        } else if (qe2 == this.aOg) {
            if (this.aOg.sS()) {
                lfn.b(5, "SFPersistenceWorkerReadCharacterOfflineData", "notifyChildCompleted: Lost unlockables for character " + this.SN + ": " + this.aOg.getErrorMessage());
            }
            this.Zk.aCQ = lcn.emA();
            this.aOg.d(this.Zk.aCQ);
        } else if (qe2 == this.aOi) {
            if (this.aOi.sS()) {
                lfn.b(5, "SFPersistenceWorkerReadCharacterOfflineData", "notifyChildCompleted: Failed to load quests for character " + this.SN + ": " + this.aOi.getErrorMessage());
            }
            this.Zk.aCS = lcn.emA();
            this.aOi.d(this.Zk.aCS);
        } else assert (false);
        if (this.su() == 0) {
            if (this.aMH != null) {
                this.ca(this.aMH);
            } else {
                this.ca(null);
            }
        }
    }

    public final nc jR() {
        return this.Zk;
    }
}


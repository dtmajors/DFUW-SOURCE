/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class qv
extends qd {
    public int SN;
    private sn aNX;
    private so aNY;
    private so aNZ;
    private so aNx;
    private String aMH;
    private oc aOa;

    public qv(md md2) {
        super(md2, me.ayi);
    }

    public void cS(int n) {
        if (this.sR()) {
            assert (false);
            lfn.b(5, "SFPersistenceWorkerReadCharacterOfflineData", "setCharacterID: Can't change character ID while working");
            return;
        }
        this.SN = n;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aNX = this.f(new sn((md)this, ol.class));
        this.aNY = this.f(new so((md)this, od.class));
        this.aNZ = this.f(new so((md)this, og.class));
        this.aNx = this.f(new so((md)this, ok.class));
    }

    @Override
    public void cleanUp() {
        this.e(this.aNX);
        this.e(this.aNY);
        this.e(this.aNZ);
        this.e(this.aNx);
        this.aNX = null;
        this.aNX = null;
        this.aNY = null;
        this.aNZ = null;
        this.aNx = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aOa = new oc();
        this.aNX.h(this.SN);
        this.aNX.start();
        this.aNY.h(this.SN);
        this.aNY.start();
        this.aNZ.h(this.SN);
        this.aNZ.start();
        this.aNx.h(this.SN);
        this.aNx.h(lcr.abW((int)this.SN));
        this.aNx.start();
    }

    @Override
    protected void sP() {
        this.aMH = null;
        this.aOa = null;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2 == this.aNX) {
            if (this.aNX.sS()) {
                lfn.b(5, "SFPersistenceWorkerReadCharacterOfflineData", "notifyChildCompleted: Could not load PSO for character " + this.SN + ": " + this.aNX.getErrorMessage());
                this.aMH = this.aNX.getErrorMessage();
            } else {
                this.aOa.aFl = (ol)this.aNX.ub();
            }
        } else if (qe2 == this.aNZ) {
            if (this.aNZ.sS()) {
                lfn.b(5, "SFPersistenceWorkerReadCharacterOfflineData", "notifyChildCompleted: Lost chat ignores for character " + this.SN + ": " + this.aNZ.getErrorMessage());
            }
            this.aOa.aFn = lcn.emA();
            this.aNZ.d(this.aOa.aFn);
        } else if (qe2 == this.aNY) {
            if (this.aNY.sS()) {
                lfn.b(5, "SFPersistenceWorkerReadCharacterOfflineData", "notifyChildCompleted: Lost annotations for character " + this.SN + ": " + this.aNY.getErrorMessage());
            }
            this.aOa.aFm = lcn.emA();
            this.aNY.d(this.aOa.aFm);
        } else if (qe2 == this.aNx) {
            if (this.aNx.sS()) {
                lfn.b(5, "SFPersistenceWorkerReadCharacterOfflineData", "notifyChildCompleted: Lost offline items for character " + this.SN + ": " + this.aNx.getErrorMessage());
            }
            this.aOa.Zo = lcn.emv();
            this.aNx.d(this.aOa.Zo);
        } else assert (false);
        if (this.su() == 0) {
            if (this.aMH != null) {
                this.ca(this.aMH);
            } else {
                this.ca(null);
            }
        }
    }

    public final oc tk() {
        return this.aOa;
    }
}


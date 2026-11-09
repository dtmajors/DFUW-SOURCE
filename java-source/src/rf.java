/*
 * Decompiled with CFR.
 */
public class rf
extends qd {
    private ldv aGw;
    private ss aOK;
    private sd aPl;
    private qf aPm;
    private sq aPn;
    private sr aPo;
    private pa aPp;
    private String aMH;
    private boolean aOG;

    public rf(md md2) {
        super(md2, me.axZ);
    }

    public final void ck(ldv ldv2) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerSaveOneSpawnable", "setSpawnableGUID: Can't modify while working.");
            assert (false);
            return;
        }
        this.aGw = ldv2;
    }

    public final ldv tg() {
        return this.aGw;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aOK = this.f(new ss(this));
        this.aPl = this.f(new sd((md)this, "ProcClearSpawnableTables"));
        this.aPm = this.f(new qf(this));
        this.aPn = this.f(new sq((md)this, pd.class));
        this.aPo = this.f(new sr(this, nb.class, true));
    }

    @Override
    public void cleanUp() {
        this.e(this.aOK);
        this.e(this.aPl);
        this.e(this.aPm);
        this.e(this.aPn);
        this.e(this.aPo);
        this.aOK = null;
        this.aPl = null;
        this.aPm = null;
        this.aPn = null;
        this.aPo = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        amf amf2 = this.MessageDelegator.bzx().bzt().d(this.aGw);
        if (amf2 == null) {
            lfn.b(4, "SFPersistenceWorkerSaveOneSpawnable", "startWork: Object " + this.aGw + " not found");
            this.ca(null);
            return;
        }
        if (amf2 instanceof pb) {
            pb pb2 = (pb)((Object)amf2);
            this.aPp = pb2.sv();
        } else if (amf2 instanceof clw) {
            this.ca("Not yet implemented");
        } else {
            lfn.b(5, "SFPersistenceWorkerSaveOneSpawnable", "startWork: Object " + amf2 + " isn't a spawnable");
            this.ca("Object isn't a spawnable");
            assert (false);
            return;
        }
        if (this.aPp == null) {
            lfn.b(4, "SFPersistenceWorkerSaveOneSpawnable", "startWork: Object " + amf2 + " could not collect storable data");
            this.ca(null);
            return;
        }
        if (this.aPp.aCN == null) {
            this.aOG = false;
            this.aPl.g(this.aGw);
            this.aPl.start();
        } else {
            this.aOK.F(this.aPp.aCN);
            this.aOK.start();
        }
    }

    @Override
    protected void sP() {
        this.aOG = false;
        this.aPp = null;
        this.aMH = null;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            if (this.aMH == null) {
                this.aMH = qe2.getErrorMessage();
            }
        } else if (qe2 == this.aOK) {
            this.aOG = false;
            this.aPl.g(this.aGw);
            this.aPl.start();
        } else if (qe2 == this.aPl) {
            if (!this.aOG) {
                if (this.aPp.aCN != null && !this.aPp.aCN.isEmpty()) {
                    this.aPo.e(this.aPp.aCN);
                    this.aPo.start();
                }
                this.aPn.c(this.aPp.aGx);
                this.aPn.start();
            }
        } else if (qe2 == this.aPm) {
            this.aOG = true;
            this.aPl.g(this.aGw);
            this.aPl.start();
        } else if (this.su() == 0 && this.aMH == null) {
            this.aPm.a(pu.aJC, this.aGw);
            this.aPm.start();
        }
        if (this.su() == 0) {
            this.ca(this.aMH);
        }
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class ra
extends qd {
    private mz aHi;
    private ss aOK;
    private sc aOL;
    private sc aOM;
    private qf aNV;
    private rj aNR;
    private ri aNQ;
    private String aMH;

    public ra(md md2) {
        super(md2, me.axU);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aOK = this.f(new ss(this));
        this.aOL = this.f(new sc(this));
        this.aOM = this.f(new sc(this));
        this.aNV = this.f(new qf(this));
        this.aNR = this.f(new rj(this));
        this.aNQ = this.f(new ri(this));
    }

    @Override
    public void cleanUp() {
        this.e(this.aOK);
        this.e(this.aOL);
        this.e(this.aOM);
        this.e(this.aNV);
        this.e(this.aNR);
        this.e(this.aNQ);
        this.aOK = null;
        this.aOL = null;
        this.aOM = null;
        this.aNV = null;
        this.aNR = null;
        this.aNQ = null;
        super.cleanUp();
    }

    public void a(mz mz2) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerSaveOneCharacter", "setPersistenceDataPlayer: Can't modify while working");
            assert (false);
            return;
        }
        if (mz2 == null) {
            lfn.b(5, "SFPersistenceWorkerSaveOneCharacter", "setPersistenceDataPlayer: Can't set null data");
            assert (false);
            return;
        }
        this.aHi = mz2;
    }

    @Override
    protected void sO() {
        this.aOL.a("ProcClearCharacterTables", lcr.abW((int)this.aHi.SN));
        this.aOL.start();
        if (this.aHi.aCD != null && this.aHi.aCD.aCN != null && this.aHi.aCD.aCN.size() > 0) {
            this.aOK.F(this.aHi.aCD.aCN);
            this.aOK.start();
        }
    }

    @Override
    protected void sP() {
        this.aMH = null;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            if (this.aMH == null) {
                this.aMH = qe2.getErrorMessage();
            }
        } else if (qe2 == this.aOK || qe2 == this.aOL) {
            if (this.su() == 0) {
                if (this.aHi.aCD != null) {
                    this.aNR.d(this.aHi.aCD);
                    this.aNR.start();
                }
                this.aNQ.e(this.aHi.aCC);
                this.aNQ.start();
            }
        } else if (qe2 == this.aNR || qe2 == this.aNQ) {
            if (this.su() == 0) {
                if (this.aHi.aCD == null) {
                    this.aNV.a(pu.aJy, lcr.abW((int)this.aHi.SN));
                } else {
                    this.aNV.a(pu.aJx, lcr.abW((int)this.aHi.SN));
                }
                this.aNV.start();
            }
        } else if (qe2 == this.aNV) {
            this.aOM.a("ProcClearCharacterTables", lcr.abW((int)this.aHi.SN));
            this.aOM.start();
        } else if (qe2 != this.aOM) {
            lfn.b(5, "SFPersistenceWorkerSaveOneCharacter", "notifyChildCompleted: Unhandled child " + qe2);
        }
        if (this.su() == 0) {
            this.ca(this.aMH);
        }
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 *  lcr
 */
public class qu
extends qd
implements bto {
    private mz aHi;
    private sw aNB;
    private ri aNQ;
    private rj aNR;
    private sd aNS;
    private qr aNT;
    private sz aNU;
    private qf aNV;
    private String aNW;
    private ha hF;
    private int ff;
    private String hE;

    public qu(md md2) {
        super(md2, me.ayf);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aNB = this.f(new sw(this));
        this.aNS = this.f(new sd((md)this, "ProcClearCharacterTables"));
        this.aNV = this.f(new qf(this));
        this.aNQ = this.f(new ri(this));
        this.aNR = this.f(new rj(this));
        this.aNT = this.f(new qr(this));
        this.aNU = this.f(new sz(this));
    }

    @Override
    public void cleanUp() {
        this.e(this.aNB);
        this.e(this.aNS);
        this.e(this.aNV);
        this.e(this.aNQ);
        this.e(this.aNR);
        this.e(this.aNT);
        this.e(this.aNU);
        this.aNB = null;
        this.aNS = null;
        this.aNV = null;
        this.aNQ = null;
        this.aNR = null;
        this.aNT = null;
        this.aNU = null;
        super.cleanUp();
    }

    public void a(mz mz2) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerNewCharacter", "setPersistenceDataPlayer: Can't modify while working");
            assert (false);
            return;
        }
        this.aHi = mz2;
    }

    @Override
    protected void sO() {
        this.aNB.v(this.aHi.aCC.aFl.hB);
        this.aNB.start();
    }

    @Override
    protected void sP() {
        this.aNW = null;
        this.hF = null;
        this.ff = 0;
        this.hE = null;
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 294: {
                this.a((kdf)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    private void a(kdf kdf2) {
        if (kdf2.ew == 5) {
            if (this.ff == 0) {
                this.ca("Another character name is reserved");
                return;
            }
        } else if (kdf2.ew != 3) {
            this.ca("Could not reserve character name '" + this.aHi.aCC.aFl.YU + " " + this.aHi.aCC.aFl.YV + "' for account '" + this.hE + "': " + kdf2.ew);
            return;
        }
        this.aNU.start();
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            this.aNW = qe2.getErrorMessage();
        } else if (qe2 == this.aNB) {
            this.ff = this.aNB.ug();
            kde kde2 = (kde)this.MessageDelegator.i(293, this.getGUID(), lcr.abV((int)1));
            kde2.gOd = 2;
            kde2.hB = this.aNB.aN();
            kde2.FirstName = this.aHi.aCC.aFl.YU;
            kde2.LastName = this.aHi.aCC.aFl.YV;
            this.MessageDelegator.b(kde2);
        } else if (qe2 == this.aNU) {
            this.aHi.aCC.aFl.azF = this.aNU.uo();
            this.aHi.aCC.aFl.azE = this.aNU.ry();
            this.aNS.g(lcr.abW((int)this.aHi.SN));
            this.aNS.start();
        } else if (qe2 == this.aNS) {
            this.aNQ.e(this.aHi.aCC);
            this.aNQ.start();
            this.aNR.d(this.aHi.aCD);
            this.aNR.start();
        } else if (qe2 == this.aNQ || qe2 == this.aNR) {
            if (this.su() == 0) {
                this.aNV.a(pu.aJx, lcr.abW((int)this.aHi.SN));
                this.aNV.start();
            }
        } else if (qe2 == this.aNV) {
            this.aNT.cS(this.aHi.SN);
            this.aNT.YT = true;
            this.aNT.start();
        } else if (qe2 == this.aNT) {
            this.hF = this.aNT.aQ();
            gib gib2 = (gib)this.MessageDelegator.h(7685, this.GUID, this.hF.getGUID());
            gib2.jhT = false;
            gib2.ikM = true;
            this.MessageDelegator.F(gib2);
        }
        if (this.aNW != null && this.su() == 0) {
            this.ca(this.aNW);
        }
    }

    public final mz sB() {
        return this.aHi;
    }

    public final ha aQ() {
        return this.hF;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.sR() && this.aNW == null && this.hF != null && this.hF.kT()) {
            this.ca(null);
        }
    }
}


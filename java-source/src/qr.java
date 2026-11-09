/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dtc
 *  ha
 *  lcr
 */
public class qr
extends qd {
    public int SN = -1;
    public boolean YT;
    private qv aNA;
    private sw aNB;
    private String aMH;
    private String hE;
    private boolean aNC;
    private long aND;
    private long aNE;
    private ha hF;
    private oc aNF;

    public qr(md md2) {
        super(md2, me.axL);
    }

    public void cS(int n) {
        if (this.sR()) {
            assert (false);
            lfn.b(5, "SFPersistenceWorkerLoadOnePSO", "setCharacterID: Can't change character ID while working");
            return;
        }
        this.SN = n;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aNA = this.f(new qv(this));
        this.aNB = this.f(new sw(this));
    }

    @Override
    public void cleanUp() {
        this.e(this.aNA);
        this.e(this.aNB);
        this.aNA = null;
        this.aNB = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aNA.cS(this.SN);
        this.aNA.start();
    }

    @Override
    protected void sP() {
        this.aMH = null;
        this.hF = null;
        this.aNF = null;
        this.hE = null;
        this.aNC = false;
        this.aND = 0L;
        this.aNE = 0L;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2 == this.aNA) {
            if (qe2.sS()) {
                lfn.b(5, "SFPersistenceWorkerLoadOnePSO", "notifyChildCompleted: Could not load PSO for character " + this.SN + ": " + qe2.getErrorMessage());
                this.aMH = qe2.getErrorMessage();
            } else {
                this.aNF = this.aNA.tk();
                this.aNB.v(this.aNF.aFl.hB);
                this.aNB.start();
            }
        } else if (qe2 == this.aNB) {
            if (qe2.sS()) {
                lfn.b(5, "SFPersistenceWorkerLoadOnePSO", "notifyChildCompleted: Could not fetch account info for character " + this.SN + " account " + this.aNF.aFl.hB + ": " + qe2.getErrorMessage());
                this.aMH = this.aNB.getErrorMessage();
            } else {
                this.hE = this.aNB.getUserName();
                this.aNC = this.aNB.uh();
                this.aND = this.aNB.ui();
                this.aNE = this.aNB.uj();
            }
        } else assert (false);
        if (this.su() == 0) {
            if (this.aMH != null) {
                this.ca(this.aMH);
            } else {
                this.tf();
            }
        }
    }

    private void tf() {
        ldv ldv2 = lcr.fO((int)this.GUID.ib(), (int)this.SN);
        dtc dtc2 = this.MessageDelegator.bzx().bzt();
        dtc2.a(ldv2.bFk());
        this.hF = new ha();
        this.hF.YT = this.YT;
        this.hF.setGUID(ldv2);
        this.hF.aQ(this.hE);
        this.hF.bU(0);
        this.hF.b(this.aNF);
        dtc2.a((amf)this.hF);
        fvj fvj2 = (fvj)this.MessageDelegator.h(26881, this.getGUID(), lcr.qAN);
        fvj2.hE = this.hF.getUserName();
        fvj2.bc = this.hF.iU();
        fvj2.Ri = this.hF.getGUID();
        fvj2.hB = this.hF.aN();
        this.MessageDelegator.E(fvj2);
        fvj2 = (fvj)this.MessageDelegator.h(26881, this.getGUID(), lcr.hac);
        fvj2.hE = this.hF.getUserName();
        fvj2.bc = this.hF.iU();
        fvj2.Ri = this.hF.getGUID();
        fvj2.hB = this.hF.aN();
        this.MessageDelegator.E(fvj2);
        this.hF.a(this.aNC, this.aND, this.aNE);
        this.hF.a(this.aNF);
        this.ca(null);
    }

    public final ha aQ() {
        return this.hF;
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 *  ha
 *  lcr
 */
public class qh
extends qd {
    private int SN;
    private int hB;
    private boolean aMG;
    private ldv Ri;
    private String aMH;
    private fn Zb;
    private int aMI;
    private ha hF;
    private ra aMJ;
    private sd aMK;
    private sb aML;
    private se aMM;
    private se aMN;
    private se aMO;
    private se aMP;
    private se aMQ;
    private se aMR;
    private se aMS;
    private se aMT;
    private se aMU;
    private se aMV;
    private se aMW;

    public qh(md md2) {
        super(md2, me.ayg);
    }

    public void a(int n, int n2, boolean bl) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerDeleteCharacter", "setupWorker: Can't modify while working");
            assert (false);
            return;
        }
        this.SN = n2;
        this.hB = n;
        this.aMG = bl;
    }

    public final int qe() {
        return this.SN;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aMJ = this.f(new ra(this));
        this.aMK = this.f(new sd((md)this, "ProcDeleteCharacter"));
        this.aML = this.f(new sb(this));
        this.aMM = this.f(new se(this, ol.class, null));
        this.aMN = this.f(new se(this, od.class, null));
        this.aMO = this.f(new se(this, oh.class, null));
        this.aMP = this.f(new se(this, nd.class, null));
        this.aMQ = this.f(new se(this, nh.class, null));
        this.aMR = this.f(new se(this, nb.class, null));
        this.aMS = this.f(new se(this, oi.class, null));
        this.aMT = this.f(new se(this, nf.class, null));
        this.aMU = this.f(new se(this, ne.class, null));
        this.aMV = this.f(new se(this, oo.class, null));
        this.aMW = this.f(new se(this, ng.class, null));
    }

    @Override
    public void cleanUp() {
        this.e(this.aMJ);
        this.e(this.aMK);
        this.e(this.aML);
        this.e(this.aMM);
        this.e(this.aMN);
        this.e(this.aMO);
        this.e(this.aMP);
        this.e(this.aMQ);
        this.e(this.aMR);
        this.e(this.aMS);
        this.e(this.aMT);
        this.e(this.aMU);
        this.e(this.aMV);
        this.e(this.aMW);
        this.aMJ = null;
        this.aMK = null;
        this.aML = null;
        this.aMM = null;
        this.aMN = null;
        this.aMO = null;
        this.aMP = null;
        this.aMQ = null;
        this.aMR = null;
        this.aMS = null;
        this.aMT = null;
        this.aMU = null;
        this.aMV = null;
        this.aMW = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        eyd eyd2 = (eyd)this.MessageDelegator.h(34567, this.GUID, lcr.qEC);
        eyd2.cS(this.SN);
        this.MessageDelegator.E(eyd2);
        this.Ri = lcr.abW((int)this.SN);
        amf amf2 = this.MessageDelegator.bzx().bzt().d(this.Ri);
        if (amf2 == null) {
            this.ca("Could not find object with GUID " + this.Ri);
            return;
        }
        if (!(amf2 instanceof ha)) {
            this.ca("Object " + this.Ri + " is not a PSO");
            return;
        }
        this.hF = (ha)amf2;
        if (this.hF.jb() != fk.a.Ry) {
            this.ca("Character is not logged out");
            return;
        }
        if (this.hF.aN() != this.hB) {
            this.ca("Account ID doesn't match");
            return;
        }
        this.Zb = this.hF.jq();
        this.hF.a(this.aMG ? fn.RH : fn.RG);
        if (!this.aMG) {
            kde kde2 = (kde)this.MessageDelegator.i(293, this.getGUID(), lcr.abV((int)1));
            kde2.gOd = 3;
            kde2.hB = this.hF.aN();
            kde2.FirstName = this.hF.iP();
            kde2.LastName = this.hF.iR();
            this.MessageDelegator.b(kde2);
            lfn.b(3, "SFPersistenceWorkerDeleteCharacter", "startWork: Sent NameReservationRequest RELEASE for " + this.hF.getUserName() + " character " + this.hF.iP() + " " + this.hF.iR());
        } else {
            fzj fzj2 = (fzj)this.MessageDelegator.h(7182, this.getGUID(), lcr.ak((ldv)lcr.qAV, (int)101));
            this.MessageDelegator.E(fzj2);
        }
    }

    private void a(kdf kdf2) {
        switch (kdf2.ew) {
            case 4: 
            case 6: {
                lfn.b(3, "SFPersistenceWorkerDeleteCharacter", "handleMiddlewareNameReservationResponse: Received result " + kdf2.ew + " for " + this.hF.getUserName() + " character " + this.hF.iP() + " " + this.hF.iR());
                fzj fzj2 = (fzj)this.MessageDelegator.h(7182, this.getGUID(), lcr.ak((ldv)lcr.qAV, (int)101));
                this.MessageDelegator.E(fzj2);
                break;
            }
            default: {
                lfn.b(5, "SFPersistenceWorkerDeleteCharacter", "handleMiddlewareNameReservationResponse: Received result " + kdf2.ew + " for " + this.hF.getUserName() + " character " + this.hF.iP() + " " + this.hF.iR());
                this.ca("Unexpected name release result: " + kdf2.ew);
            }
        }
    }

    private void a(fzk fzk2) {
        this.aMI = fzk2.aMI;
        mz mz2 = new mz();
        mz2.SN = this.SN;
        mz2.aCC = this.hF.kJ();
        this.aMJ.a(mz2);
        this.aMJ.start();
    }

    private void sX() {
        if (this.aMJ.sS()) {
            this.hF.a(this.Zb);
            this.ca("PSO save failed: " + this.aMJ.getErrorMessage());
            return;
        }
        this.aMM.b(this.SN, this.aMI);
        this.aMM.start();
    }

    private void sY() {
        if (this.aMM.sS()) {
            this.hF.a(this.Zb);
            this.ca("PSO copy failed: " + this.aMM.getErrorMessage());
            return;
        }
        this.aMN.b(this.SN, this.aMI);
        this.aMN.start();
        this.aMO.b(this.SN, this.aMI);
        this.aMO.start();
        this.aMP.b(this.SN, this.aMI);
        this.aMP.start();
        this.aMQ.b(this.SN, this.aMI);
        this.aMQ.start();
        this.aMR.b(this.Ri.fk(), "" + this.aMI);
        this.aMR.start();
        this.aMS.b(this.SN, "" + this.aMI);
        this.aMS.start();
        this.aMT.b(this.SN, this.aMI);
        this.aMT.start();
        this.aMU.b(this.SN, this.aMI);
        this.aMU.start();
        this.aMV.b(this.SN, this.aMI);
        this.aMV.start();
        this.aMW.b(this.SN, this.aMI);
        this.aMW.start();
    }

    private void sZ() {
        if (this.aMH != null) {
            this.hF.a(this.Zb);
            this.ca(this.aMH);
            return;
        }
        goy goy2 = (goy)this.MessageDelegator.h(11100, this.getGUID(), this.Ri);
        this.MessageDelegator.F(goy2);
    }

    private void a(goz goz2) {
        if (goz2.iXS != 0) {
            this.hF.a(this.Zb);
            this.ca("Character cleanup failed: " + goz2.iXS);
            return;
        }
        dta dta2 = this.hF.getMessageDelegator().bzx();
        dta2.hd(this.Ri);
        this.aMK.g(this.Ri);
        this.aMK.start();
    }

    @Override
    protected void sP() {
        this.aMH = null;
        this.Ri = null;
        this.hF = null;
        this.Zb = null;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2 == this.aMJ) {
            this.sX();
        } else if (qe2 == this.aMM) {
            this.sY();
        } else if (qe2.aMr == me.axd) {
            if (qe2.sS() && this.aMH == null) {
                this.aMH = qe2.getErrorMessage();
            }
            if (this.su() == 0) {
                this.sZ();
            }
        } else if (qe2 == this.aMK) {
            if (qe2.sS()) {
                this.ca(qe2.getErrorMessage());
            } else {
                this.aML.w(this.Ri.enw(), this.aMI);
                this.aML.start();
            }
        } else if (qe2 == this.aML) {
            this.ca(qe2.getErrorMessage());
        } else {
            lfn.b(5, "SFPersistenceWorkerDeleteCharacter", "notifyChildCompleted: Unhandled worker " + qe2);
            assert (false);
            this.ca("Internal error");
        }
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

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11101: {
                this.a((goz)dxq2);
                break;
            }
            case 7183: {
                this.a((fzk)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }
}


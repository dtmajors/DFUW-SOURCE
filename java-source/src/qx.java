/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.LinkedList;

public class qx
extends qd {
    private int aMI;
    private String aOj;
    private String aOk;
    private int SN;
    private ldv Ri;
    private boolean aOl;
    private boolean aOm;
    private boolean aOn;
    private boolean aOo;
    private boolean aOp;
    private boolean aOq;
    private String aMH;
    private int aOr;
    private si aOs;
    private sw aNB;
    private sd aOt;
    private sp aOu;
    private sd aOv;
    private qf aNV;
    private qr aNT;
    private sd aOw;
    private sd aOx;
    private sp aOy;
    private sd aMK;
    private sp aOz;
    private sl aOA;

    public qx(md md2) {
        super(md2, me.ayl);
    }

    public void a(int n, int n2, String string, String string2) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerRestoreCharacter", "setupWorker: Can't modify while working");
            assert (false);
            return;
        }
        this.aMI = n;
        this.SN = n2;
        this.aOj = string;
        this.aOk = string2;
        this.Ri = lcr.abW((int)this.SN);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aOs = this.f(new si(this));
        this.aNB = this.f(new sw(this));
        this.aOt = this.f(new sd((md)this, "ProcClearCharacterTables"));
        this.aOu = this.f(new sp(this));
        this.aOv = this.f(new sd((md)this, "ProcRestoreCharacterData"));
        this.aNV = this.f(new qf(this));
        this.aNT = this.f(new qr(this));
        this.aOw = this.f(new sd((md)this, "ProcClearCharacterTables"));
        this.aOx = this.f(new sd((md)this, "ProcRemoveHistoricInventory"));
        this.aOy = this.f(new sp(this));
        this.aMK = this.f(new sd((md)this, "ProcDeleteCharacter"));
        this.aOz = this.f(new sp(this));
        if (ls.isEnabled()) {
            this.aOA = this.f(new sl(this));
        }
    }

    @Override
    public void cleanUp() {
        this.e(this.aOs);
        this.e(this.aNB);
        this.e(this.aOt);
        this.e(this.aOu);
        this.e(this.aOv);
        this.e(this.aNV);
        this.e(this.aNT);
        this.e(this.aOw);
        this.e(this.aOx);
        this.e(this.aOy);
        this.e(this.aMK);
        this.e(this.aOz);
        if (ls.isEnabled()) {
            this.e(this.aOA);
        }
        super.cleanUp();
    }

    public int tl() {
        return this.aMI;
    }

    public int qe() {
        return this.SN;
    }

    @Override
    protected void sO() {
        this.aOs.cW(this.aMI);
        this.aOs.start();
    }

    private void tm() {
        if (this.aOs.sS()) {
            return;
        }
        if (!this.aOs.tU().equals("DELETED") && !this.aOs.tU().equals("RESTOREFAILED")) {
            this.aMH = "Cannot restore, state is '" + this.aOs.tU() + "'";
            this.aOq = false;
            lfn.b(5, "SFPersistenceWorkerRestoreCharacter", "handleGetHistoricCharInfoCompleted: " + this.aMH);
            return;
        }
        if (this.aOj == null && this.aOk == null) {
            this.aOj = this.aOs.cz();
            this.aOk = this.aOs.cA();
        }
        if (this.aOj == null || this.aOk == null) {
            this.aMH = "Only one name specified, specify both or none";
            lfn.b(5, "SFPersistenceWorkerRestoreCharacter", "handleGetHistoricCharInfoCompleted: " + this.aMH);
            return;
        }
        this.aNB.v(this.aOs.aN());
        this.aNB.start();
    }

    private void tn() {
        if (this.aNB.sS()) {
            return;
        }
        cu.b b2 = cu.a(this.aOj, this.aOk, hc.aaW[this.aNB.ug()], null);
        if (b2 != cu.b.kX) {
            lfn.b(4, "SFPersistenceWorkerRestoreCharacter", "handleFetchAccountInfoCompleted: Character name '" + this.aOj + " " + this.aOk + "' name check returned " + (Object)((Object)b2));
            this.aMH = "Invalid character name";
            this.aOq = false;
            return;
        }
        this.aOt.g(this.Ri);
        this.aOt.start();
    }

    private void to() {
        if (this.aOt.sS()) {
            return;
        }
        kde kde2 = (kde)this.MessageDelegator.i(293, this.getGUID(), lcr.abV((int)1));
        kde2.gOd = 2;
        kde2.hB = this.aNB.aN();
        kde2.FirstName = this.aOj;
        kde2.LastName = this.aOk;
        this.MessageDelegator.b(kde2);
        ++this.aOr;
    }

    private void b(kdf kdf2) {
        --this.aOr;
        if (kdf2.gOd == 3) {
            return;
        }
        if (kdf2.gOd != 2) {
            lfn.b(5, "SFPersistenceWorkerRestoreCharacter", "handleNameReservationResponse: Response for unhandled operation " + kdf2.gOd + " while processing " + this.aMI + " name " + this.aOj + " " + this.aOk);
            assert (false);
            return;
        }
        if (kdf2.ew != 3) {
            this.aMH = "Character name could not be reserved: " + kdf2.ew;
            return;
        }
        this.aOl = true;
        this.aOu.a(this.aMI, null, "RESTORING", 0, null);
        this.aOu.start();
    }

    private void tp() {
        if (this.aOu.sS()) {
            return;
        }
        if (this.aOp) {
            return;
        }
        this.aOv.a(pw.aJH);
        LinkedList<Object> linkedList = new LinkedList<Object>();
        linkedList.add(this.aMI);
        linkedList.add(this.Ri);
        linkedList.add(this.aOj);
        linkedList.add(this.aOk);
        this.aOv.a(linkedList);
        this.aOv.start();
    }

    private void tq() {
        this.aOm = true;
        if (this.aOv.sS()) {
            return;
        }
        this.aNV.a(pu.aJx, this.Ri);
        this.aNV.start();
    }

    private void tr() {
        this.aOn = true;
        if (this.aNV.sS()) {
            return;
        }
        this.aOo = false;
        this.aNT.cS(this.SN);
        this.aNT.YT = true;
        this.aNT.start();
    }

    private void ts() {
        this.aOw.g(this.Ri);
        this.aOw.start();
    }

    private void tt() {
        this.aOx.a(pw.aJH);
        this.aOx.g(this.aMI);
        this.aOx.start();
    }

    private void tu() {
        this.aOy.a(this.aMI, "RESTORING", "RESTORED", this.SN, null);
        this.aOy.start();
    }

    private void tv() {
        dxq dxq2;
        if (ls.isEnabled()) {
            assert (this.aOA != null);
            if (this.aOA.tX()) {
                dxq2 = (fqt)this.MessageDelegator.h(34316, this.Ri, lcr.hac);
                ((fqt)dxq2).am(this.aOA.pT());
                ((fqt)dxq2).t(this.aOA.pX());
                ((fqt)dxq2).P(this.aOj);
                ((fqt)dxq2).Q(this.aOk);
                ((fqt)dxq2).cY(this.aOA.pU());
                ((fqt)dxq2).ab(this.aOA.isRegistered());
                ((fqt)dxq2).s(this.aOA.pW());
                ((fqt)dxq2).L(this.aOA.tY());
                this.MessageDelegator.F(dxq2);
            }
        }
        dxq2 = (gib)this.MessageDelegator.h(7685, this.GUID, this.Ri);
        ((gib)dxq2).jhT = false;
        ((gib)dxq2).ikM = true;
        this.MessageDelegator.F(dxq2);
    }

    private void tw() {
        if (!ls.isEnabled()) {
            this.tv();
            return;
        }
        this.aOA.cX(this.aMI);
        this.aOA.start();
    }

    private void tx() {
        this.aOp = true;
        if (this.aOo) {
            if (this.aOl) {
                kde kde2 = (kde)this.MessageDelegator.i(293, this.getGUID(), lcr.abV((int)1));
                kde2.gOd = 3;
                kde2.hB = this.aNB.aN();
                kde2.FirstName = this.aOj;
                kde2.LastName = this.aOk;
                this.MessageDelegator.b(kde2);
                ++this.aOr;
            }
            if (this.aOm) {
                this.aOw.g(this.Ri);
                this.aOw.start();
            }
            if (this.aOn) {
                this.aMK.g(this.Ri);
                this.aMK.start();
            }
        }
        if (this.aOq) {
            this.aOz.a(this.aMI, null, "RESTOREFAILED", 0, this.aMH);
            this.aOz.start();
        }
    }

    private void ty() {
    }

    private void tz() {
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 294: {
                this.b((kdf)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
        this.tA();
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS() && this.aMH == null) {
            this.aMH = qe2.getErrorMessage();
        }
        if (qe2 == this.aOs) {
            this.tm();
        } else if (qe2 == this.aNB) {
            this.tn();
        } else if (qe2 == this.aOt) {
            this.to();
        } else if (qe2 == this.aOu) {
            this.tp();
        } else if (qe2 == this.aOv) {
            this.tq();
        } else if (qe2 == this.aNV) {
            this.tr();
        } else if (qe2 == this.aNT) {
            this.ts();
        } else if (qe2 == this.aOw) {
            this.tt();
        } else if (qe2 == this.aOx) {
            this.tu();
        } else if (qe2 == this.aOy) {
            this.tw();
        } else if (qe2 == this.aOA) {
            this.tv();
        } else if (qe2 == this.aMK) {
            this.ty();
        } else if (qe2 == this.aOz) {
            this.tz();
        } else {
            lfn.b(5, "SFPersistenceWorkerRestoreCharacter", "notifyChildCompleted: Unhandled worker " + qe2);
            this.aMH = "Internal Error";
            assert (false);
        }
        this.tA();
    }

    private void tA() {
        if (this.su() > 0) {
            return;
        }
        if (this.aOr > 0) {
            return;
        }
        if (this.aMH != null && !this.aOp) {
            this.tx();
            this.tA();
            return;
        }
        this.ca(this.aMH);
    }

    @Override
    protected void sP() {
        this.aMH = null;
        this.aOo = true;
        this.aOp = false;
        this.aOr = 0;
        this.aOl = false;
        this.aOm = false;
        this.aOn = false;
        this.aOq = true;
    }
}


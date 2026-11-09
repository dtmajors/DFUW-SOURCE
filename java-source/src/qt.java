/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.LinkedList;

public class qt
extends qd
implements bto {
    private ldv aGH;
    private sn aNJ;
    private so aNK;
    private LinkedList<so> aNL = lcn.emA();
    private pf aNM;
    private String aMH;
    private LinkedList<ldv> aNN;
    private int aNO;
    private boolean aNP;

    public qt(md md2) {
        super(md2, me.axO);
    }

    public void cl(ldv ldv2) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerLoadOneVillage", "setVillageGUID: Can't modify while working");
            assert (false);
            return;
        }
        this.aGH = ldv2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aNJ = this.f(new sn((md)this, pg.class));
        this.aNK = this.f(new so((md)this, ph.class));
    }

    @Override
    public void cleanUp() {
        this.e(this.aNJ);
        this.e(this.aNK);
        this.aNJ = null;
        this.aNK = null;
        for (so so2 : this.aNL) {
            this.e(so2);
        }
        this.aNL.clear();
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aNM = new pf();
        this.aNM.aGH = this.aGH;
        this.aNJ.h(this.aGH);
        this.aNJ.start();
        this.aNK.h(this.aGH);
        this.aNK.start();
    }

    @Override
    protected void sP() {
        this.aNM = null;
        this.aMH = null;
        this.aNN = null;
        this.aNO = 0;
        this.aNP = false;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            if (this.aMH == null) {
                this.aMH = qe2.getErrorMessage();
            }
        } else if (qe2 == this.aNJ || qe2 == this.aNK) {
            if (this.su() == 0) {
                this.aNM.aGI = (pg)this.aNJ.ub();
                this.aNM.aGJ = lcn.emA();
                this.aNK.d(this.aNM.aGJ);
                this.aNM.aGK = lcn.emw();
                this.aNN = lcn.emA();
                for (ph ph2 : this.aNM.aGJ) {
                    this.aNN.add(ph2.aGQ);
                }
                this.ti();
            }
        } else if (qe2.aMr == me.awX) {
            --this.aNO;
            so so2 = (so)qe2;
            LinkedList linkedList = lcn.emA();
            so2.d(linkedList);
            this.aNM.aGK.put((ldv)so2.uc(), linkedList);
            this.aNL.add(so2);
            this.ti();
        } else {
            lfn.b(5, "SFPersistenceWorkerLoadOneVillage", "notifyChildCompleted: Unhandled worker " + qe2);
            assert (false);
        }
    }

    private void ti() {
        if (this.aNP) {
            return;
        }
        if (this.aNN == null) {
            return;
        }
        if (this.aNN.isEmpty() && this.aNO == 0) {
            this.aNP = true;
            this.tj();
            return;
        }
        if (this.aNN.isEmpty()) {
            return;
        }
        if (this.aNO >= 5) {
            return;
        }
        ldv ldv2 = this.aNN.pollFirst();
        so so2 = this.aNL.pollFirst();
        if (so2 == null) {
            so2 = this.f(new so((md)this, nb.class));
        }
        so2.h(ldv2);
        ++this.aNO;
        so2.start();
    }

    private void tj() {
        if (!this.aNP) {
            return;
        }
        gbi gbi2 = (gbi)this.MessageDelegator.h(24321, this.getGUID(), lcr.qBE);
        gbi2.eUC = this.aNM.aGI.Filename;
        gbi2.jcS = this.aNM.aGH;
        this.MessageDelegator.E(gbi2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 24322: {
                this.a((gbj)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gbj gbj2) {
        if (!gbj2.eo) {
            this.ca("Village creation failed for " + this.aNM.aGI.Filename);
            return;
        }
        dpx dpx2 = (dpx)this.MessageDelegator.bzx().bzt().d(gbj2.jcS);
        dpx2.a(this.aNM);
        this.ca(null);
    }

    @Override
    public void doTick(ldz ldz2) {
        this.ti();
    }
}


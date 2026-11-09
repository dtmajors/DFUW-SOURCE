/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class coh
extends coe {
    private btn eHi = null;
    private bwa eld = null;
    private static final double ePr = 2.0;

    public coh() {
        super(true);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.eld != null) {
            this.eld.doTick(ldz2);
        }
        super.doTick(ldz2);
    }

    public void c(btn btn2) {
        this.eHi = btn2;
    }

    public void d(btn btn2) {
        this.eHi = null;
    }

    public void aSx() {
        assert (this.aAG() != null);
        if (this.aAG() == null) {
            return;
        }
        if (this.eld == null) {
            this.eld = new bwa();
            this.eld.setServerObject(true);
            this.eld.eL(false);
            this.eld.d(this.aAG());
            this.eld.setMessageDelegator(this.MessageDelegator);
        }
        this.eld.bf(2.0);
        ljq ljq2 = this.aAG().av();
        ljq2.et(this.aUV());
        this.eld.bc(ljq2);
        this.eld.l(this.aAG().aw());
        ljq ljq3 = this.aAG().av();
        this.eld.bd(ljq3);
        this.eld.m(this.aAG().aw());
        this.eld.o(this.MessageDelegator.arc().rgz);
        this.eld.initialize();
        fuj fuj2 = (fuj)this.MessageDelegator.h(1038, this.getGUID(), this.getGUID());
        fuj2.gon = this.eld.aAI();
        fuj2.goo = this.eld.aAK();
        fuj2.iWX = this.eld.aAJ();
        fuj2.iWY = this.eld.aAL();
        fuj2.eKm = this.eld.aAH();
        fuj2.oV = this.eld.aAw();
        gqu gqu2 = (gqu)this.MessageDelegator.h(11055, this.getGUID(), lcr.qAJ);
        gqu2.jpQ = (float)(this.eld.aAw() + this.eld.aAH());
        gqu2.iXB = fuj2;
        this.MessageDelegator.F(gqu2);
    }

    public void cleanUp() {
        super.cleanUp();
        if (this.eld != null) {
            this.eld.cleanUp();
        }
        this.eld = null;
    }

    public void receiveMessage(dxq dxq2) {
        if (this.eHi != null && this.eHi.a(dxq2, (btk)((Object)this))) {
            return;
        }
        switch (dxq2.bEz()) {
            case 1038: {
                this.a((fuj)dxq2);
                break;
            }
            case 20483: {
                this.a((fsj)dxq2);
                break;
            }
        }
        super.receiveMessage(dxq2);
    }

    private void a(fsj fsj2) {
        if (fsj2.dTY == null) {
            lfn.b(5, "SFGenericPhysicalObjectServer", "handleMovementObjectMessage() PositionalData is null.");
            return;
        }
        if (this.isScheduledForRemoval()) {
            return;
        }
        if (this.aAG() == null) {
            lfn.b(5, "SFGenericPhysicalObjectServer", "handleMovementObjectMessage() MeshObject is null.");
            return;
        }
        this.g(fsj2.dTY);
        ljq ljq2 = fsj2.dTY.eqI();
        lgl lgl2 = fsj2.dTY.eqK();
        this.aAG().g(ljq2, lgl2);
    }

    private void a(fuj fuj2) {
        if (this.aAG() == null) {
            return;
        }
        if (this.eld == null) {
            this.eld = new bwa();
            this.eld.setServerObject(true);
            this.eld.eL(false);
            this.eld.d(this.aAG());
            this.eld.setMessageDelegator(this.MessageDelegator);
        }
        this.eld.bf(fuj2.eKm);
        this.eld.bc(fuj2.gon);
        this.eld.l(fuj2.iWX);
        this.eld.bd(fuj2.goo);
        this.eld.m(fuj2.iWY);
        this.eld.o(fuj2.oV);
        this.eld.initialize();
        fuj fuj3 = (fuj)this.MessageDelegator.h(1038, this.getGUID(), this.getGUID());
        fuj3.gon = fuj2.gon;
        fuj3.goo = fuj2.goo;
        fuj3.iWX = fuj2.iWX;
        fuj3.iWY = fuj2.iWY;
        fuj3.eKm = fuj2.eKm;
        fuj3.oV = fuj2.oV;
        gqu gqu2 = (gqu)this.MessageDelegator.h(11055, this.getGUID(), lcr.qAJ);
        gqu2.jpQ = (float)(fuj2.oV + fuj2.eKm);
        gqu2.iXB = fuj3;
        this.MessageDelegator.F(gqu2);
    }

    public void Hy() {
        this.aIw();
    }

    @Override
    protected void aIw() {
        super.aIw();
        this.oN(this.aUZ().aVe());
    }
}


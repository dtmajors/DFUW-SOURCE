/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class ckx
extends ckv
implements bto {
    private btn eHi = null;
    private bfu elg = new bfu(this);
    private cbq elf = null;
    private bwa eld = null;
    private bsx eHj = null;
    private double eHk = -2.0;

    public ckx() {
        super(true);
    }

    public void c(btn btn2) {
        this.eHi = btn2;
    }

    public void d(btn btn2) {
        this.eHi = null;
    }

    public final bfq aIv() {
        return this.elg;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.elg.doTick(ldz2);
        if (this.eld != null) {
            this.eld.doTick(ldz2);
        }
        if (this.eHk > 0.0) {
            this.eHk -= ldz2.qwh;
            if (this.eHk < 0.0) {
                this.eHk = 0.0;
            }
        }
    }

    public void b(cbq cbq2) {
        this.elf = cbq2;
    }

    public void c(cbq cbq2) {
        this.elf = null;
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

    public void f(et et2) {
        if (this.elf != null && !this.elf.b(this, et2)) {
            return;
        }
        if (et2.getType() == 352) {
            bfl bfl2 = (bfl)this.elg.aof();
            if (bfl2 != null) {
                this.elg.a(5, bfl2);
            }
            if (this.elf != null) {
                this.elf.b(this);
            }
        }
        super.f(et2);
    }

    public void d(et et2, float f) {
        super.d(et2, f);
        if (this.elf != null) {
            this.elf.a(this, et2);
        }
    }

    public void hC(String string) {
        ej ej2 = this.jm().ae(10432);
        if (ej2 == null) {
            return;
        }
        if (!(ej2 instanceof ff)) {
            return;
        }
        if (string == null) {
            string = "";
        }
        ff ff2 = (ff)ej2;
        ff2.av(string);
    }

    public final double aRq() {
        return this.eHk;
    }

    public final void bu(double d2) {
        this.eHk = d2;
    }

    public final boolean aRr() {
        return this.eHk > -2.0;
    }

    public bsx aRs() {
        return this.eHj;
    }

    public void c(bsx bsx2) {
        this.eHj = bsx2;
    }
}


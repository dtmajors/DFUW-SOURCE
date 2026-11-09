/*
 * Decompiled with CFR.
 */
public abstract class drt
extends dqn {
    protected static final int gUq = 1;
    protected static final int gUr = 2;
    protected static final int gUs = 3;
    protected static final int gUt = 4;
    protected static final int gUu = 5;
    protected static final int gUv = 6;
    protected static final int gUw = 15;
    protected static final int gUx = 16;
    protected static final int gUy = 17;
    protected static final int gUz = 18;
    protected lco gUA = new lco();
    protected lco gUB = new lco();
    protected lco gUC = new lco();
    protected ljq gUD = new ljq();
    protected ljq gUE = new ljq();
    protected ljr gUF = new ljr();
    protected ljr gUG = new ljr();
    protected boolean gUH = true;
    protected boolean gUI = true;
    protected boolean gUJ = false;

    public void i(lco lco2) {
        this.gUA = lco2;
        this.gPb |= 2;
    }

    public lco bwo() {
        return this.gUB;
    }

    public void j(lco lco2) {
        this.gUB = lco2;
        this.gPb |= 4;
    }

    public lco bwp() {
        return this.gUC;
    }

    public void k(lco lco2) {
        this.gUC = lco2;
        this.gPb |= 8;
    }

    public boolean bwq() {
        return this.gUH;
    }

    public void jg(boolean bl) {
        this.gUH = bl;
        this.gPb |= 0x10;
    }

    public boolean isOn() {
        return this.gUI;
    }

    public void hX(boolean bl) {
        this.gUI = bl;
        this.gPb |= 0x20;
    }

    public boolean bwr() {
        return this.gUJ;
    }

    public void jh(boolean bl) {
        this.gUJ = bl;
        this.gPb |= 0x40;
    }

    public lco bws() {
        return this.gUA;
    }

    public ljq bwt() {
        return this.gUD;
    }

    public void cr(ljq ljq2) {
        this.gUD = ljq2;
        this.gPb |= 0x8000;
    }

    public ljq bwu() {
        return this.gUE;
    }

    public void cs(ljq ljq2) {
        this.gUE = ljq2;
        this.gPb |= 0x10000;
    }

    public ljr bmJ() {
        return this.gUF;
    }

    public void c(ljr ljr2) {
        this.gUF = ljr2;
        this.gPb |= 0x20000;
    }

    public ljr bmK() {
        return this.gUG;
    }

    public void d(ljr ljr2) {
        this.gUG = ljr2;
        this.gPb |= 0x40000;
    }

    protected void bvC() {
    }

    protected void a(kki kki2) {
        if ((this.gPb & 2) != 0) {
            kki2.Yx(kki2.ebT() | 8);
            kki2.dk(new ljq(this.gUA.qwk, this.gUA.qwl, this.gUA.qwm));
        }
        if ((this.gPb & 4) != 0) {
            kki2.Yx(kki2.ebT() | 0x10);
            kki2.dl(new ljq(this.gUB.qwk, this.gUB.qwl, this.gUB.qwm));
        }
        if ((this.gPb & 8) != 0) {
            kki2.Yx(kki2.ebT() | 0x20);
            kki2.dm(new ljq(this.gUC.qwk, this.gUC.qwl, this.gUC.qwm));
        }
        if ((this.gPb & 0x10) != 0) {
            // empty if block
        }
        if ((this.gPb & 0x20) != 0) {
            kki2.Yx(kki2.ebT() | 0x2000);
            kki2.hX(this.gUI);
        }
        if ((this.gPb & 0x40) != 0) {
            // empty if block
        }
        if ((this.gPb & 0x8000) != 0) {
            kki2.Yx(kki2.ebT() | 0x40000);
            kki2.cr(this.gUD);
        }
        if ((this.gPb & 0x10000) != 0) {
            kki2.Yx(kki2.ebT() | 0x10000);
            kki2.cs(this.gUE);
        }
        if ((this.gPb & 0x20000) != 0) {
            kki2.Yx(kki2.ebT() | 0x8000);
            kki2.c(this.gUF);
        }
        if ((this.gPb & 0x40000) != 0) {
            kki2.Yx(kki2.ebT() | 0x20000);
            kki2.d(this.gUG);
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        kkl kkl2 = (kkl)this.MessageDelegator.h(1539);
        kkl2.jM(false);
        kkl2.wD(false);
        kkl2.ts(this.GUID);
        kkl2.pN(this.GUID);
        kkl2.Yy(kkl.pGf);
        lfn.b(0, "SFSpecialEffectSphericalLightAtom", "removeLight() Removing sphericallight " + this.GUID);
        this.MessageDelegator.a(kkl2);
    }
}


/*
 * Decompiled with CFR.
 */
public class dru
extends drt
implements ami,
bto {
    protected static final int dVk = 7;
    protected static final int gUK = 8;
    protected static final int RANGE = 9;
    protected static final int gUL = 10;
    protected static final int gUM = 11;
    protected ljq Position = new ljq();
    protected ljq gUN = new ljq();
    protected float gpZ = 50.0f;
    protected float gUO = 1.0f;
    protected ljr gUP = new ljr(0.0f, 0.0f, 0.0f, 0.0f);
    protected float gUQ = 40.0f;
    protected float gUR = 10.0f;
    protected float gUS = 1.0f;

    public ljr bmN() {
        return this.gUP;
    }

    public void e(ljr ljr2) {
        this.gUP = ljr2;
        this.gPb |= 0x800;
    }

    public dru() {
        this.ObjectType = 8;
    }

    @Override
    public ljq av() {
        return this.Position;
    }

    @Override
    public void c(ljq ljq2) {
        this.Position = ljq2;
        this.gPb |= 0x80;
    }

    public ljq bwv() {
        return this.gUN;
    }

    public void ct(ljq ljq2) {
        this.gUN = ljq2;
        this.gPb |= 0x100;
    }

    public float getRange() {
        return this.gpZ;
    }

    public void setRange(float f2) {
        this.gpZ = f2;
        this.gPb |= 0x200;
    }

    public float bww() {
        return this.gUO;
    }

    public void hH(float f2) {
        this.gUO = f2;
        this.gPb |= 0x400;
    }

    @Override
    public ljq FX() {
        return null;
    }

    @Override
    public void d(ljq ljq2) {
    }

    @Override
    public lgl aw() {
        return null;
    }

    @Override
    public void a(lgl lgl2) {
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            super.initialize();
            kke kke2 = (kke)this.MessageDelegator.h(1537);
            kke2.wD(true);
            if (this.dJs != null) {
                kke2.lQ(false);
            } else {
                kke2.lQ(true);
            }
            kke2.pN(this.dJs);
            kke2.ts(this.GUID);
            kke2.Yw(kke.pFW);
            kke2.dk(new ljq(this.gUA.qwk, this.gUA.qwl, this.gUA.qwm));
            kke2.dl(new ljq(this.gUB.qwk, this.gUB.qwl, this.gUB.qwm));
            kke2.dm(new ljq(this.gUC.qwk, this.gUC.qwl, this.gUC.qwm));
            kke2.hX(this.gUI);
            kke2.ct(this.gUN);
            kke2.setRange(this.gpZ);
            kke2.hH(this.gUO);
            kke2.c(this.Position);
            kke2.e(this.gUP);
            this.MessageDelegator.a(kke2);
            this.Initialized = true;
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bEz() == 1537) {
            this.b((fpg)dxq2);
        } else {
            super.receiveMessage(dxq2);
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 1536) {
            this.ju(ktv2.axa());
        } else {
            super.receiveResponse(ktv2);
        }
    }

    protected void b(fpg fpg2) {
        int n = fpg2.bQL();
        if ((n & 4) != 0) {
            if ((8 & n) != 0) {
                this.i(fpg2.bws());
            }
            if ((0x10 & n) != 0) {
                this.j(fpg2.bwo());
            }
            if ((0x20 & n) != 0) {
                this.k(fpg2.bwp());
            }
            if ((0x200 & n) != 0) {
                this.ct(fpg2.bwv());
            }
            if ((0x400 & n) != 0) {
                this.hH(fpg2.bww());
            }
            if ((0x80 & n) != 0) {
                this.c(fpg2.av());
            }
            if ((0x100 & n) != 0) {
                this.setRange(fpg2.getRange());
            }
            if ((0x4000 & n) != 0) {
                this.e(fpg2.bmN());
            }
            if ((0x8000 & n) != 0) {
                this.cr(new ljq(fpg2.bmL().bVf(), fpg2.bmL().bVg(), fpg2.bmL().bVh()));
            }
            if ((0x10000 & n) != 0) {
                this.cs(new ljq(fpg2.bmM().bVf(), fpg2.bmM().bVg(), fpg2.bmM().bVh()));
            }
            if ((0x20000 & n) != 0) {
                this.c(fpg2.bmJ());
            }
            if ((0x40000 & n) != 0) {
                this.d(fpg2.bmK());
            }
        }
        this.bwd();
    }

    @Override
    protected void bvC() {
        gtl gtl2 = (gtl)this.MessageDelegator.h(8966, this.GUID, this.GUID);
        gtl2.c(this.Position);
        gtl2.ct(this.gUN);
        gtl2.setRange(this.gpZ);
        gtl2.hH(this.gUO);
        this.MessageDelegator.I(gtl2);
    }

    @Override
    protected void a(kki kki2) {
        super.a(kki2);
        if ((this.gPb & 0x80) != 0) {
            kki2.Yx(kki2.ebT() | 0x80);
            kki2.c(this.Position);
        }
        if ((this.gPb & 0x100) != 0) {
            kki2.Yx(kki2.ebT() | 0x200);
            kki2.ct(this.gUN);
        }
        if ((this.gPb & 0x200) != 0) {
            kki2.Yx(kki2.ebT() | 0x100);
            kki2.setRange(this.gpZ);
        }
        if ((this.gPb & 0x400) != 0) {
            kki2.Yx(kki2.ebT() | 0x400);
            kki2.hH(this.gUO);
        }
        if ((this.gPb & 0x800) != 0) {
            kki2.Yx(kki2.ebT() | 0x4000);
            kki2.e(this.gUP);
        }
    }

    public void bwd() {
        kki kki2 = (kki)this.MessageDelegator.h(1538);
        kki2.Yx(4);
        kki2.pN(this.dJs);
        kki2.ts(this.GUID);
        kki2.wD(false);
        this.a(kki2);
        this.MessageDelegator.a(kki2);
        this.gPb = 0;
    }

    @Override
    public void doTick(ldz ldz2) {
    }
}


/*
 * Decompiled with CFR.
 */
public class drw
extends dru {
    private static final int gSw = 1;
    private static final int gVc = 2;
    private static final int gVd = 3;
    protected ljq mx = new ljq(0.0f, 1.0f, 0.0f);
    protected float gVe = 0.5f;
    protected float gVf = 0.7853982f;

    public drw() {
        this.ObjectType = 9;
    }

    public ljq bpa() {
        return this.mx;
    }

    public void cq(ljq ljq2) {
        this.mx = ljq2;
        this.gPb |= 2;
    }

    public float bwy() {
        return this.gVe;
    }

    public void hI(float f2) {
        this.gVe = f2;
        this.gPb |= 4;
    }

    public float bwz() {
        return this.gVf;
    }

    public void hJ(float f2) {
        this.gVf = f2;
        this.gPb |= 8;
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
            kke2.Yw(kke.pFV);
            kke2.dk(new ljq(this.gUA.qwk, this.gUA.qwl, this.gUA.qwm));
            kke2.dl(new ljq(this.gUB.qwk, this.gUB.qwl, this.gUB.qwm));
            kke2.dm(new ljq(this.gUC.qwk, this.gUC.qwl, this.gUC.qwm));
            kke2.ct(this.gUN);
            kke2.setRange(this.gpZ);
            kke2.hH(this.gUO);
            kke2.c(this.Position);
            kke2.cq(this.mx);
            kke2.hI(this.gVe);
            kke2.hJ(this.gVf);
            this.MessageDelegator.a(kke2);
            this.Initialized = true;
        }
    }

    @Override
    public void cleanUp() {
        kki kki2 = (kki)this.MessageDelegator.h(1538);
        kki2.Yx(8194);
        kki2.pN(this.dJs);
        kki2.ts(this.GUID);
        kki2.hX(false);
        this.MessageDelegator.a(kki2);
        lfn.b(4, "SFSpotLightObject", "cleanUp() Setting light OFF. NOT DELETED!");
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

    @Override
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
            if ((0x40 & n) != 0) {
                this.cq(fpg2.bpa());
            }
            if ((0x1000 & n) != 0) {
                this.hJ(fpg2.bwz());
            }
            if ((0x800 & n) != 0) {
                this.hI(fpg2.bwy());
            }
        }
        this.bwd();
    }

    @Override
    protected void bvC() {
        gtm gtm2 = (gtm)this.MessageDelegator.h(8967, this.GUID, this.GUID);
        gtm2.cq(this.mx);
        gtm2.hI(this.gVe);
        gtm2.hJ(this.gVf);
        this.MessageDelegator.I(gtm2);
    }

    @Override
    public void bwd() {
        kki kki2 = (kki)this.MessageDelegator.h(1538);
        kki2.Yx(2);
        kki2.pN(this.dJs);
        kki2.ts(this.GUID);
        kki2.wD(false);
        this.a(kki2);
        if ((this.gPb & 2) != 0) {
            kki2.Yx(kki2.ebT() | 0x40);
            kki2.cq(this.mx);
        }
        if ((this.gPb & 4) != 0) {
            kki2.Yx(kki2.ebT() | 0x800);
            kki2.hI(this.gVe);
        }
        if ((this.gPb & 8) != 0) {
            kki2.Yx(kki2.ebT() | 0x1000);
            kki2.hJ(this.gVf);
        }
        lfn.b(0, "SFSpotLightObject", "sendLightModifyRequest() Sending LightModifyRequest.");
        this.MessageDelegator.a(kki2);
        this.gPb = 0;
    }
}


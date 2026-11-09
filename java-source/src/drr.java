/*
 * Decompiled with CFR.
 */
public class drr
extends drt {
    protected static final int gSw = 7;
    protected ljq mx = new ljq();

    public drr() {
        this.ObjectType = 10;
    }

    public ljq bpa() {
        return this.mx;
    }

    public void cq(ljq ljq2) {
        this.mx = ljq2;
        this.gPb |= 0x80;
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            super.initialize();
            kke kke2 = (kke)this.MessageDelegator.h(1537);
            kke2.wD(false);
            kke2.dk(new ljq(this.gUA.qwk, this.gUA.qwl, this.gUA.qwm));
            kke2.dl(new ljq(this.gUB.qwk, this.gUB.qwl, this.gUB.qwm));
            kke2.dm(new ljq(this.gUC.qwk, this.gUC.qwl, this.gUC.qwm));
            kke2.cq(this.mx);
            kke2.pN(this.dJs);
            kke2.ts(this.GUID);
            kke2.Yw(kke.pFX);
            if (this.dJs != null) {
                kke2.lQ(false);
            } else {
                kke2.lQ(true);
            }
            this.MessageDelegator.a(kke2);
            this.Initialized = true;
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bEz() == 1537) {
            this.a((fpg)dxq2);
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
    public void cleanUp() {
        kki kki2 = (kki)this.MessageDelegator.h(1538);
        kki2.Yx(8193);
        kki2.pN(this.dJs);
        kki2.ts(this.GUID);
        kki2.hX(false);
        this.MessageDelegator.a(kki2);
        lfn.b(4, "SFDirectionalLightObject", "cleanUp() Setting light OFF. NOT DELETED!");
    }

    protected void bwd() {
        kki kki2 = (kki)this.MessageDelegator.h(1538);
        kki2.Yx(1);
        kki2.pN(this.dJs);
        kki2.ts(this.GUID);
        kki2.wD(false);
        this.a(kki2);
        if ((this.gPb & 0x80) != 0) {
            kki2.Yx(kki2.ebT() | 0x40);
            kki2.cq(this.mx);
        }
        lfn.b(0, "SFDirectionalLightObject", "sendLightModifyRequest() Sending LightModifyRequest.");
        this.MessageDelegator.a(kki2);
        this.gPb = 0;
    }

    @Override
    protected void bvC() {
        gsz gsz2 = (gsz)this.MessageDelegator.h(8961, this.GUID, this.GUID);
        gsz2.cq(this.mx);
        this.MessageDelegator.I(gsz2);
    }

    private void a(fpg fpg2) {
        int n = fpg2.bQL();
        if ((n & 1) != 0) {
            if ((8 & n) != 0) {
                this.i(fpg2.bws());
            }
            if ((0x10 & n) != 0) {
                this.j(fpg2.bwo());
            }
            if ((0x20 & n) != 0) {
                this.k(fpg2.bwp());
            }
            if ((0x40 & n) != 0) {
                this.cq(fpg2.bpa());
            }
        }
        this.bwd();
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class jpv
extends btk
implements bto {
    ldv nQb = null;
    dld eou = null;
    private final dez dKP = new dez();
    private final String nQc = "red_sprite.dds";
    private final int nQd = 16;
    private dfr nQe = null;
    private final ljq nQf = new ljq(0.0f, 10.0f, 0.0f);
    private final ljq nQg = new ljq(1.5707964f, 0.0f, 0.0f);
    private final lcq eoo = lcq.BRIGHT_WHITE;
    private final lcq eop = lcq.BRIGHT_WHITE_TRANSPARENT;
    private final float nQh = 1.0f;
    private double oV = 0.0;
    private double aAh = 0.0;
    private ldz nx = null;
    private boolean nQi = false;
    private boolean nQj = false;
    private lgl nQk = null;
    private lgl iWX = null;
    private lgl iWY = null;
    private double nQl = 0.0;
    private ljq dTz = null;
    private ljq dTA = null;
    private final boolean nQm = false;

    @Override
    public void doTick(ldz ldz2) {
        this.nx = ldz2;
        this.dPW();
        this.dPX();
    }

    private void dPW() {
        if (!this.nQi) {
            return;
        }
        if (this.aAh <= this.nx.rgz) {
            lfn.b(0, "SFEventSFXManager", "checkDeathCamera() STOPPING DEATHCAMERA!");
            this.nQi = false;
            this.nQj = true;
            this.iWX = this.iWY;
            this.dTz = this.dTA;
            this.oV = this.nx.rgz;
            this.nQl = this.aAh = this.nx.rgz + 1.0;
            this.nQe.setVisible(false);
            return;
        }
        double d2 = this.nx.rgz - this.oV;
        float f2 = (float)(d2 / (this.aAh - this.oV));
        ljq ljq2 = ljq.e(this.dTz, this.dTA, f2);
        float f3 = (float)(d2 / (this.nQl - this.oV));
        if (f3 >= 0.99f) {
            f3 = 0.99f;
        }
        lgl lgl2 = new lgl();
        lgl2.c(this.iWX, this.iWY, f3);
        this.v(ljq2, lgl2);
        this.nQe.setVisible(true);
        float f4 = f2 * f2;
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        ljp ljp2 = new ljp();
        int n = lcw.qFT;
        int n2 = lcw.qFU;
        ljp2.x = (float)n / 16.0f;
        ljp2.y = (float)n2 / 16.0f;
        this.nQe.j(ljp2);
        lcq lcq2 = new lcq(1.0f, 1.0f, 1.0f, f4);
        this.nQe.setColor(lcq2);
    }

    private void dPX() {
        if (!this.nQj) {
            return;
        }
        if (this.aAh <= this.nx.rgz) {
            lfn.b(0, "SFEventSFXManager", "checkDeathCamera() STOPPING LIFECAMERA!");
            this.nQj = false;
            this.at(this.nQb, this.eou.axa());
            this.c(false, this.nQb);
            this.c(true, this.eou.axa());
            return;
        }
        double d2 = this.nx.rgz - this.oV;
        float f2 = (float)(d2 / (this.aAh - this.oV));
        ljq ljq2 = null;
        ljq2 = f2 < 1.0f ? ljq.e(this.dTz, this.dTA, f2) : this.dTA;
        f2 = (float)(d2 / (this.nQl - this.oV));
        if (f2 >= 0.99f) {
            f2 = 0.99f;
        }
        lgl lgl2 = new lgl();
        lgl2.c(this.iWX, this.iWY, f2);
        this.v(ljq2, lgl2);
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            assert (this.eou != null);
            this.dPY();
            this.dQc();
        }
        super.initialize();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    private void dPY() {
        this.bpi();
    }

    public void dPZ() {
        this.tf(this.eou.axa());
    }

    private void dQa() {
        assert (this.eou != null);
        float f2 = cbr.oG(1);
        this.v(this.dTz, this.nQk);
        this.at(this.eou.axa(), this.nQb);
        this.c(false, this.eou.axa());
        this.c(true, this.nQb);
        this.oV = this.nx.rgz;
        this.aAh = this.oV + ((double)f2 - this.nx.qwh * 2.0);
        this.iWX = this.nQk;
        if (this.iWX == null) {
            this.iWX = new lgl();
        }
        ljq ljq2 = new ljq(this.nQg);
        ljq2.y = (float)(Math.PI * 2 * Math.random());
        this.iWY = new lgl(ljq2);
        this.nQl = this.oV + ((double)f2 * 1.0 - this.nx.qwh * 2.0);
        this.dTA = new ljq(this.dTz);
        this.dTA.es(this.nQf);
        this.nQi = true;
        this.nQj = false;
    }

    private void v(ljq ljq2, lgl lgl2) {
        assert (this.nQb != null);
        kis kis2 = (kis)this.MessageDelegator.h(2049);
        kis2.ts(this.GUID);
        kis2.oG(this.nQb);
        kis2.HT(12);
        kis2.a(lgl2);
        kis2.c(ljq2);
        kis2.cD(ljq2);
        this.MessageDelegator.a(kis2);
    }

    private void bpi() {
        this.nQb = this.MessageDelegator.bzv();
        kip kip2 = (kip)this.MessageDelegator.h(2051);
        kip2.XX(1);
        kip2.ts(this.getGUID());
        kip2.oG(this.nQb);
        kip2.gZ(this.eou.boR());
        kip2.ha(this.eou.boS());
        kip2.At(this.eou.boU());
        kip2.As(this.eou.boT());
        kip2.hb(this.eou.boV());
        kip2.hc(this.eou.boW());
        kip2.hd(this.eou.boX());
        kip2.he(this.eou.boY());
        kip2.setActive(false);
        this.MessageDelegator.a(kip2);
    }

    private void c(boolean bl, ldv ldv2) {
        assert (ldv2 != null);
        kir kir2 = (kir)this.MessageDelegator.h(2054);
        kir2.setActive(bl);
        kir2.oG(ldv2);
        kir2.ts(this.getGUID());
        kir2.XZ(256);
        this.MessageDelegator.a(kir2);
    }

    private void at(ldv ldv2, ldv ldv3) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        kir kir2 = (kir)this.MessageDelegator.h(2054);
        kir2.oG(ldv3);
        kir2.tC(ldv2);
        kir2.ts(this.getGUID());
        kir2.XZ(512);
        this.MessageDelegator.a(kir2);
    }

    public dld dQb() {
        return this.eou;
    }

    public void b(dld dld2) {
        this.eou = dld2;
    }

    private void tf(ldv ldv2) {
        kiq kiq2 = (kiq)this.MessageDelegator.h(2050);
        kiq2.XY(1);
        kiq2.oG(ldv2);
        kiq2.ts(this.getGUID());
        this.MessageDelegator.a(kiq2);
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 2306: {
                kto kto2 = (kto)ktv2;
                this.dTz = kto2.av();
                this.nQk = kto2.aw();
                this.dQa();
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    private void dQc() {
        this.nQe = (dfr)this.dKP.Af(15);
        this.nQe.setTextureName("red_sprite.dds");
        this.nQe.setVisible(false);
        this.nQe.setGUID(this.MessageDelegator.bzv());
        int n = lcw.qFT;
        int n2 = lcw.qFU;
        ljp ljp2 = new ljp();
        this.nQe.hT(false);
        this.nQe.hU(false);
        this.nQe.hV(true);
        this.nQe.k(new ljp(0.0f, 0.0f));
        ljp2.x = (float)n / 16.0f;
        ljp2.y = (float)n2 / 16.0f;
        this.nQe.j(ljp2);
        this.nQe.setColor(lcq.BRIGHT_WHITE_TRANSPARENT);
        this.MessageDelegator.a(this.nQe);
    }
}


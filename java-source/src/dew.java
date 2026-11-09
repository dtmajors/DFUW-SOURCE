/*
 * Decompiled with CFR.
 */
public class dew
extends dey {
    private koe gnr = null;
    private knq gns = null;
    private ldv se = null;
    private ldv gnt = null;
    private int gnu = 0;

    dew() {
        this.gnv = 27;
        assert (gnw != null);
        this.gnr = (koe)gnw.h(257);
        this.gns = (knq)gnw.h(261);
    }

    @Override
    public void setDefaultValues() {
        super.setDefaultValues();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.Initialized) {
            this.ayH();
        }
    }

    private void ayH() {
        if (this.gnu == 0) {
            return;
        }
        this.gnr.JA(this.gnu);
        this.MessageDelegator.a(this.gnr);
        this.gnu = 0;
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            this.en();
            this.ayN();
            this.Initialized = true;
        }
    }

    @Override
    public void cleanUp() {
        if (!this.CleanedUp) {
            super.cleanUp();
            if (this.Initialized) {
                this.blj();
                this.ayE();
            }
            this.CleanedUp = true;
        }
    }

    private void en() {
        this.se = this.MessageDelegator.bzv();
        this.gns.jM(false);
        this.gns.wD(false);
        this.gns.lQ(false);
        this.gns.Zw(1);
        this.gns.hC(this.se);
        this.gns.ts(this.getGUID());
        knq knq2 = (knq)this.MessageDelegator.h(261);
        knq2.a(this.gns);
        this.MessageDelegator.a(knq2);
    }

    private void ayN() {
        this.gnt = this.MessageDelegator.bzv();
        this.gnr.jM(false);
        this.gnr.wD(false);
        this.gnr.lQ(false);
        this.gnr.ma(this.se);
        this.gnr.hC(this.gnt);
        this.gnr.ts(this.getGUID());
        this.gnr.JA(1);
        koe koe2 = (koe)this.MessageDelegator.h(257);
        koe2.a(this.gnr);
        this.MessageDelegator.a(koe2);
    }

    private void blj() {
        if (this.se == null) {
            return;
        }
        this.mF(this.se);
        this.MessageDelegator.oa(this.se);
        this.se = null;
    }

    private void mF(ldv ldv2) {
        knr knr2 = (knr)this.MessageDelegator.h(260);
        knr2.hC(ldv2);
        knr2.ts(this.getGUID());
        knr2.wD(false);
        knr2.jM(false);
        knr2.Zy(1);
        this.MessageDelegator.a(knr2);
    }

    private void ayE() {
        if (this.gnt == null) {
            return;
        }
        this.mF(this.gnt);
        this.MessageDelegator.oa(this.gnt);
        this.gnt = null;
    }

    public String blk() {
        return this.gns.blk();
    }

    public void iK(String string) {
        this.gns.iK(string);
    }

    public int bll() {
        return this.gns.bll();
    }

    public void zY(int n2) {
        this.gns.zY(n2);
    }

    public int blm() {
        return this.gns.blm();
    }

    public void zZ(int n2) {
        this.gns.zZ(n2);
    }

    public int bln() {
        return this.gns.bln();
    }

    public void Aa(int n2) {
        this.gns.Aa(n2);
    }

    public boolean isItalic() {
        return this.gns.isItalic();
    }

    public void hL(boolean bl) {
        this.gns.hL(bl);
    }

    public void setColor(lcq lcq2) {
        this.gnr.setColor(lcq2);
        this.gnu |= 8;
    }

    public void setText(String string) {
        this.gnr.setText(string);
        this.gnu |= 2;
    }

    public void xf(int n2) {
        this.gnr.xf(n2);
        this.gnu |= 0x80;
    }

    public void h(ljp ljp2) {
        this.gnr.h(ljp2);
        this.gnu |= 0x100;
    }

    public void g(ljp ljp2) {
        this.gnr.g(ljp2);
        this.gnu |= 4;
    }

    public void Ab(int n2) {
        this.gnr.Ab(n2);
        this.gnu |= 0x200;
    }

    public void Ac(int n2) {
        this.gnr.Ac(n2);
        this.gnu |= 0x200;
    }

    public void Ad(int n2) {
        this.gnr.Ad(n2);
        this.gnu |= 0x200;
    }

    public void Ae(int n2) {
        this.gnr.Ae(n2);
        this.gnu |= 0x200;
    }

    public void hM(boolean bl) {
        this.gnr.hM(bl);
        this.gnu |= 0x200;
    }

    public void gk(float f2) {
        this.gnr.gk(f2);
    }
}


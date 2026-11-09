/*
 * Decompiled with CFR.
 */
public class lkh
extends btk {
    public static final int rqv = 0;
    public static final int rqw = 1;
    public static final int rqx = 1;
    public static final int rqy = 2;
    public static final int rqz = 3;
    private ldv hs = null;
    private ldv eel = null;
    private ldv eeo = null;
    private ldv eem = null;
    private ldv eep = null;
    private boolean ddm = false;
    private ldv rqA = null;
    private boolean rqB = false;
    private boolean rqC = false;
    private int eW = 0;

    public ldv dZh() {
        return this.hs;
    }

    public ldv dZv() {
        return this.eel;
    }

    public void tv(ldv ldv2) {
        this.eel = ldv2;
    }

    public ldv dZw() {
        return this.eem;
    }

    public void tw(ldv ldv2) {
        this.eem = ldv2;
    }

    public ldv dZx() {
        return this.eeo;
    }

    public void tx(ldv ldv2) {
        this.eeo = ldv2;
    }

    public ldv dZy() {
        return this.eep;
    }

    public void ty(ldv ldv2) {
        this.eep = ldv2;
    }

    public void doTick(ldz ldz2) {
        if (this.ddm) {
            if (this.rqB) {
                this.rqB = false;
                this.acY(this.eW);
            }
            if (this.rqC) {
                this.rqC = false;
                this.ety();
            }
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 5120: {
                kua kua2 = (kua)ktv2;
                assert (ktv2.dXg() != null);
                if (!ktv2.dXg().equals(this.rqA)) break;
                assert (ktv2.getResult() == 0);
                this.rqA = null;
                this.ddm = true;
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    public void etw() {
        assert (null != this.MessageDelegator);
        assert (!this.ddm);
        this.hs = this.MessageDelegator.bzv();
        kho kho2 = (kho)this.MessageDelegator.h(3083);
        this.rqA = kho2.getGUID();
        kho2.Xu(17);
        kho2.ts(this.getGUID());
        kho2.wD(false);
        kho2.jM(true);
        kho2.hC(this.hs);
        kho2.hC(this.hs);
        kho2.tv(this.eel);
        kho2.tx(this.eeo);
        kho2.wG(true);
        kho2.tw(this.eem);
        kho2.ty(this.eep);
        this.MessageDelegator.a(kho2);
        this.ddm = true;
    }

    public void etx() {
        if (!this.ddm) {
            return;
        }
        assert (null != this.MessageDelegator);
        assert (this.ddm);
        this.ddm = false;
        kho kho2 = (kho)this.MessageDelegator.h(3083);
        this.rqA = kho2.getGUID();
        kho2.Xu(2);
        kho2.ts(this.getGUID());
        kho2.wD(false);
        kho2.jM(false);
        kho2.hC(this.hs);
        kho2.hC(this.hs);
        this.MessageDelegator.a(kho2);
    }

    private void acY(int n) {
        assert (null != this.MessageDelegator);
        assert (n >= 0 && n <= 3);
        kho kho2 = (kho)this.MessageDelegator.h(3083);
        this.rqA = kho2.getGUID();
        kho2.Xu(512);
        kho2.ts(this.getGUID());
        kho2.hC(this.dZh());
        kho2.hC(this.dZh());
        kho2.wD(false);
        kho2.Xv(n);
        this.MessageDelegator.a(kho2);
    }

    private void ety() {
        assert (null != this.MessageDelegator);
        kho kho2 = (kho)this.MessageDelegator.h(3083);
        this.rqA = kho2.getGUID();
        kho2.Xu(1024);
        kho2.ts(this.getGUID());
        kho2.hC(this.dZh());
        kho2.hC(this.dZh());
        kho2.wD(false);
        this.MessageDelegator.a(kho2);
    }

    public void etz() {
        this.rqB = true;
        this.eW = 0;
    }

    public void etA() {
        this.rqB = true;
        this.eW = 1;
    }

    public void acZ(int n) {
        if (n == this.eW) {
            return;
        }
        this.rqB = true;
        if (!this.ddm) {
            lfn.b(0, "SFAnimationEyeController", "changeMode() BUT WE ARE NOT READY!");
        }
        this.eW = n;
    }

    public void etB() {
        this.rqC = true;
    }
}


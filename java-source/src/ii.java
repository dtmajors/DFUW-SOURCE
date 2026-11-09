/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  is
 *  lcr
 */
public class ii
extends ik {
    private ldv Ts;
    final fj afv;

    ii(is is2, ldv ldv2, ldv ldv3) {
        super(is2, ldv2, false, false);
        this.af(ldv3);
        this.afv = new fj(this);
        this.afv.setGUID(this.Xb.getMessageDelegator().bzv());
        this.Xb.getMessageDelegator().a(this.afv);
        this.a(lcr.qzk, gw.a.Ym);
        this.a(lcr.qAe, gw.a.Ym);
        this.a(lcr.qzl, gw.a.Ym);
    }

    @Override
    void cleanUp() {
        this.bw(lcr.qzk);
        this.bw(lcr.qAe);
        this.bw(lcr.qzl);
        this.afv.B(false);
        this.Xb.getMessageDelegator().hd(this.afv.getGUID());
        this.Xb.getMessageDelegator().oa(this.afv.getGUID());
        super.cleanUp();
    }

    public fj nf() {
        return this.afv;
    }

    public ldv hm() {
        return this.Ts;
    }

    public void ag(ldv ldv2) {
        this.Ts = ldv2;
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  is
 *  lcr
 */
public class ih
extends ik {
    final fj afv = new fj(this);

    ih(is is2, ldv ldv2) {
        super(is2, ldv2, true, false);
        this.afv.setGUID(this.Xb.getMessageDelegator().bzv());
        this.Xb.getMessageDelegator().a(this.afv);
        this.a(lcr.qAe, gw.a.Ym);
    }

    @Override
    void cleanUp() {
        this.bw(lcr.qAe);
        this.afv.B(false);
        this.Xb.getMessageDelegator().hd(this.afv.getGUID());
        this.Xb.getMessageDelegator().oa(this.afv.getGUID());
        super.cleanUp();
    }
}


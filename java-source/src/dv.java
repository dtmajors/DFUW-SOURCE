/*
 * Decompiled with CFR.
 */
public class dv
extends btk
implements bto {
    ldv nh = null;
    ljq ni = new ljq(1.0f, 0.0f, 0.0f);
    ljq nj = new ljq(0.0f, 0.0f, 5.0E-4f);

    @Override
    public void initialize() {
        if (this.ObserverObjects != null && this.ObserverObjects.isEmpty()) {
            lfn.b(5, this.getClass().getName(), "No Observer Objects to Controll!");
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.ObserverObjects != null && !this.ObserverObjects.isEmpty() && this.nh == null) {
            this.nh = (ldv)this.ObserverObjects.get(0);
        }
        if (this.nh != null) {
            this.p(this.nh);
        }
    }

    private void p(ldv ldv2) {
        fah fah2 = (fah)this.MessageDelegator.h(1797, this.GUID, ldv2);
        fah2.FZ(16);
        this.ni.es(this.nj);
        fah2.cn(this.ni);
        this.MessageDelegator.I(fah2);
    }
}


/*
 * Decompiled with CFR.
 */
public class dp
extends btk
implements bto {
    private double mN = 0.1;

    @Override
    public void initialize() {
        if (!this.Initialized) {
            this.Initialized = true;
            if (this.ObserverObjects != null && this.ObserverObjects.isEmpty()) {
                lfn.b(5, this.getClass().getName(), "No Observer Objects to Controll!");
            }
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.ObserverObjects != null && !this.ObserverObjects.isEmpty() && this.Active) {
            int n = this.ObserverObjects.size();
            for (int i = 0; i < n; ++i) {
                this.a(ldz2.qwh, ldz2.rgz, (ldv)this.ObserverObjects.get(i));
            }
        }
    }

    private void a(double d2, double d3, ldv ldv2) {
        double d4 = Math.PI * d2 * this.mN;
        ljq ljq2 = new ljq(0.0f, 0.0f, 0.0f);
        ljq ljq3 = new ljq(0.0f, 0.0f, (float)d4);
        ftv ftv2 = (ftv)this.MessageDelegator.h(1025, this.GUID, ldv2);
        ftv2.HT(64);
        ftv2.c(ljq2);
        ftv2.a(new lgl(ljq3));
        this.MessageDelegator.E(ftv2);
    }
}


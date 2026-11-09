/*
 * Decompiled with CFR.
 */
public class dm
extends btk
implements bto {
    private double mN = 0.2;

    @Override
    public void initialize() {
        if (!this.Initialized) {
            this.Initialized = true;
            if (this.ObserverObjects == null || this.ObserverObjects.isEmpty()) {
                // empty if block
            }
            if (this.ObserverObjects == null) {
                this.ObserverObjects = lcn.emv();
            }
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.ObserverObjects != null && !this.ObserverObjects.isEmpty() && this.Active) {
            for (int i = 0; i < this.ObserverObjects.size(); ++i) {
                this.a(ldz2.qwh, ldz2.rgz, (ldv)this.ObserverObjects.get(i));
            }
        }
    }

    private void a(double d2, double d3, ldv ldv2) {
        double d4 = Math.PI * d2 * this.mN;
        ljq ljq2 = new ljq(0.0f, 0.0f, 0.0f);
        ljq ljq3 = new ljq((float)d4, 0.0f, 0.0f);
        kky kky2 = (kky)this.MessageDelegator.h(1025);
        kky2.pHG = ljq2.x;
        kky2.pHH = ljq2.y;
        kky2.pHI = ljq2.rlV;
        lgl lgl2 = new lgl(ljq3);
        kky2.rb = lgl2.x;
        kky2.rc = lgl2.y;
        kky2.rd = lgl2.rlV;
        kky2.pHJ = lgl2.rlW;
        kky2.hC(ldv2);
        kky2.ts(this.GUID);
        kky2.wD(false);
        kky2.pHF = 64;
        this.MessageDelegator.a(kky2);
    }
}


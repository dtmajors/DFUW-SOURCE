/*
 * Decompiled with CFR.
 */
public class dx
extends btk
implements bto {
    private double nE = 20.0;
    private ljq mZ = new ljq(42082.0f, 6005.0f, 42434.0f);
    private double nF = 200.0;

    @Override
    public void initialize() {
        if (this.ObserverObjects != null && this.ObserverObjects.isEmpty()) {
            lfn.b(5, this.getClass().getName(), "No Observer Objects to Controll!");
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.ObserverObjects != null && !this.ObserverObjects.isEmpty()) {
            int n2 = this.ObserverObjects.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                this.c(ldz2.qwh, ldz2.rgz, (ldv)this.ObserverObjects.get(i2));
            }
        }
    }

    private void c(double d2, double d3, ldv ldv2) {
        ljq[] ljqArray = this.b(d3);
        kky kky2 = (kky)this.MessageDelegator.h(1025);
        kky2.pHG = ljqArray[0].x;
        kky2.pHH = ljqArray[0].y;
        kky2.pHI = ljqArray[0].rlV;
        lgl lgl2 = new lgl(ljqArray[1]);
        kky2.rb = lgl2.x;
        kky2.rc = lgl2.y;
        kky2.rd = lgl2.rlV;
        kky2.pHJ = lgl2.rlW;
        kky2.hC(ldv2);
        kky2.ts(this.GUID);
        kky2.wD(false);
        kky2.pHF = 8;
        this.MessageDelegator.a(kky2);
    }

    private ljq[] b(double d2) {
        double d3 = Math.PI * 2 * d2 / this.nE;
        double d4 = (double)this.mZ.x + this.nF * Math.cos(d3);
        double d5 = this.mZ.y;
        double d6 = (double)this.mZ.rlV + this.nF * Math.sin(d3);
        ljq[] ljqArray = new ljq[]{new ljq((float)d4, (float)d5, (float)d6), new ljq((float)d3, 0.0f, 0.0f)};
        return ljqArray;
    }
}


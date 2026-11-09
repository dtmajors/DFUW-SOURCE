/*
 * Decompiled with CFR.
 */
public class dby
extends dbw {
    private static final float gcD = 1.0f;
    private double gcE = 0.0;

    public dby() {
        super(cxd.j.fRv);
    }

    @Override
    public void nh() {
        float f2 = this.boj.aJz().bgQ().aJy();
        if (f2 > 0.5f) {
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            f2 *= f2;
            double d2 = this.boj.getMessageDelegator().arc().rgz;
            if (this.gcE <= 0.0) {
                this.gcE = d2 + 1.0;
                return;
            }
            while (d2 >= this.gcE) {
                this.gcE += 1.0;
            }
        } else if (this.gcE > 0.0) {
            this.gcE = 0.0;
        }
    }

    @Override
    public void bjk() {
        assert (this.boj.bfF());
    }

    @Override
    public void beQ() {
        assert (this.boj.bfF());
        this.gcE = 0.0;
    }
}


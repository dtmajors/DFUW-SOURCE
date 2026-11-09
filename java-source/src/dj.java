/*
 * Decompiled with CFR.
 */
public class dj
extends btk
implements bto {
    double mo = 0.3f;
    double mp = 0.0;
    boolean mq = true;
    lco mr = new lco(0.0f, 0.0f, 0.0f);
    lco ms = new lco(0.7f, 0.6f, 0.0f);
    double mt = 0.0;
    double mu = 0.3;
    double mv = 300.0;

    @Override
    public void doTick(ldz ldz2) {
        if (this.ObserverObjects != null && !this.ObserverObjects.isEmpty() && this.Active) {
            int n2 = this.ObserverObjects.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                this.a(ldz2, (ldv)this.ObserverObjects.get(i2));
            }
        }
    }

    private void a(ldz ldz2, ldv ldv2) {
        lco lco2 = this.a(ldz2.qwh);
        fpg fpg2 = (fpg)this.MessageDelegator.h(1537, this.GUID, ldv2);
        fpg2.Hl(268);
        fpg2.i(lco2);
        this.mt += ldz2.qwh;
        if (this.mt > this.mu) {
            this.mt = 0.0;
            this.mv = 200.0 + (double)((float)(50.0 * Math.random()));
        }
        fpg2.setRange((float)this.mv);
        this.MessageDelegator.F(fpg2);
    }

    lco a(double d2) {
        if (this.mp == 0.0) {
            this.mq = true;
        } else if (this.mp == 1.0) {
            this.mq = false;
        }
        this.mp = this.mq ? (this.mp += d2 * this.mo) : (this.mp -= d2 * this.mo);
        if (this.mp >= 1.0) {
            this.mp = 1.0;
        } else if (this.mp <= 0.0) {
            this.mp = 0.0;
        }
        return this.a(this.mr, this.ms, (float)this.mp);
    }

    lco a(lco lco2, lco lco3, float f2) {
        lco lco4 = new lco();
        lco4.qwk = lco2.qwk + f2 * (lco3.qwk - lco2.qwk);
        lco4.qwl = lco2.qwl + f2 * (lco3.qwl - lco2.qwl);
        lco4.qwm = lco2.qwm + f2 * (lco3.qwm - lco2.qwm);
        return lco4;
    }
}


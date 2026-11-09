/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lqf
 */
public class jw
extends jk {
    protected naa[] aml = new naa[]{null, null, null};
    protected boolean sS = false;

    @Override
    public void nU() {
        this.a(a.amn.toString().toLowerCase(), hc.aaP, lqf.rYx, mhs.INTEGER);
        this.a(a.amo.toString().toLowerCase(), hc.aaP, lqf.rYx);
        this.a(a.amp.toString().toLowerCase(), hc.aaP, lqf.rYx);
    }

    private a bj(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }

    @Override
    public void a(jj jj2) {
        a a2 = this.bj(jj2.akV);
        if (a2 == null) {
            jj2.b(lqg.scy.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case amn: {
                this.t(jj2);
                break;
            }
            case amo: {
                this.u(jj2);
                break;
            }
            case amp: {
                this.v(jj2);
                break;
            }
        }
    }

    public void t(jj jj2) {
        int n = ((mho)jj2.cA((int)0)).PC;
        if (this.aml[n] == null) {
            naa naa2 = new naa();
            naa2.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(naa2);
            this.aml[n] = naa2;
        }
        this.aml[n].afW(n);
        jj2.nT();
    }

    public void u(jj jj2) {
        this.sS = !this.sS;
        for (int i2 = 0; i2 < 3; ++i2) {
            if (this.aml[i2] == null) continue;
            this.aml[i2].Av(this.sS);
        }
        jj2.nT();
    }

    public void v(jj jj2) {
        for (int i2 = 0; i2 < 3; ++i2) {
            if (this.aml[i2] == null) continue;
            this.aml[i2].eTE();
        }
        jj2.nT();
    }
}


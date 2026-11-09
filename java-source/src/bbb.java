/*
 * Decompiled with CFR.
 */
public abstract class bbb {
    protected int aEC = bbe.cPT.ordinal();
    protected ldv aED = null;
    protected int aEE = hc.aaz.ordinal();
    protected int cPN = -1;

    public bbe ajs() {
        return bbe.getValueByOrdinal(this.aEC);
    }

    public ldv ajt() {
        return this.aED;
    }

    public hc aju() {
        return hc.getAccessLevelType(this.aEE);
    }

    public void b(ldv ldv2, hc hc2) {
        this.aED = ldv2;
        this.aEE = hc2 == null ? this.aEE : hc2.ordinal();
    }

    public int f(bbc bbc2) {
        bbd bbd2 = this.e(bbc2);
        if (bbd2 == null) {
            assert (false);
            return -1;
        }
        return bbd2.ajA();
    }

    public void a(bbc bbc2, int n) {
        bbd bbd2 = this.e(bbc2);
        if (bbd2 == null) {
            assert (false);
            return;
        }
        bbd2.jP(n);
    }

    public ldv g(bbc bbc2) {
        bbd bbd2 = this.e(bbc2);
        if (bbd2 == null) {
            assert (false);
            return null;
        }
        return bbd2.iG();
    }

    public String h(bbc bbc2) {
        bbd bbd2 = this.e(bbc2);
        if (bbd2 == null) {
            assert (false);
            return null;
        }
        return bbd2.iV();
    }

    public void a(bbc bbc2, String string) {
        bbd bbd2 = this.e(bbc2);
        if (bbd2 == null) {
            assert (false);
            return;
        }
        bbd2.cD(string);
    }

    public int i(bbc bbc2) {
        bbd bbd2 = this.e(bbc2);
        if (bbd2 == null) {
            assert (false);
            return -1;
        }
        return bbd2.ajB();
    }

    public void b(bbc bbc2, int n) {
        bbd bbd2 = this.e(bbc2);
        if (bbd2 == null) {
            assert (false);
            return;
        }
        bbd2.jQ(n);
    }

    public int ajv() {
        return this.cPN;
    }

    public void jO(int n) {
        this.cPN = n;
    }

    protected bbb(bbe bbe2) {
        this.aEC = bbe2 == null ? this.aEC : bbe2.ordinal();
    }

    @Deprecated
    protected bbb() {
        this.aEC = bbe.cPT.ordinal();
    }

    public void a(bbb bbb2) {
        this.aEC = bbb2 == null ? this.aEC : bbb2.aEC;
    }

    public void ajw() {
        this.aEC = bbe.cPW.ordinal();
    }

    public void ajx() {
        this.aEC = bbe.cPX.ordinal();
    }

    public void accept() {
        this.aEC = this.ajs().ajC().ordinal();
    }

    public void ajy() {
        this.aEC = bbe.cQa.ordinal();
    }

    public void activate() {
        this.aEC = bbe.cQb.ordinal();
    }

    public void cancel() {
        this.aEC = bbe.cQc.ordinal();
    }

    public void aiD() {
        this.aEC = bbe.cQd.ordinal();
    }

    public void complete() {
        this.aEC = bbe.cQe.ordinal();
    }

    public bbc gk(ldv ldv2) {
        if (ldv2 == null) {
            return bbc.cPO;
        }
        if (ldv2.equals(this.g(bbc.cPP))) {
            return bbc.cPP;
        }
        if (ldv2.equals(this.g(bbc.cPQ))) {
            return bbc.cPQ;
        }
        return bbc.cPO;
    }

    public boolean equals(Object object) {
        return object != null && object instanceof bbb ? this.b((bbb)object) : false;
    }

    public boolean b(bbb bbb2) {
        if (this.g(bbc.cPP) == null && bbb2.g(bbc.cPP) != null || this.g(bbc.cPP) != null && bbb2.g(bbc.cPP) == null) {
            return false;
        }
        if (this.g(bbc.cPP) != null && bbb2.g(bbc.cPP) != null && !this.g(bbc.cPP).equals(bbb2.g(bbc.cPP))) {
            return false;
        }
        if (this.g(bbc.cPQ) == null && bbb2.g(bbc.cPQ) != null || this.g(bbc.cPQ) != null && bbb2.g(bbc.cPQ) == null) {
            return false;
        }
        return this.g(bbc.cPQ) == null || bbb2.g(bbc.cPQ) == null || this.g(bbc.cPQ).equals(bbb2.g(bbc.cPQ));
    }

    public int hashCode() {
        return (this.g(bbc.cPP) == null ? 0 : this.g(bbc.cPP).hashCode()) ^ (this.g(bbc.cPQ) == null ? 0 : this.g(bbc.cPQ).hashCode());
    }

    protected abstract bbd e(bbc var1);

    public abstract bca c(bbc var1);

    public abstract bca d(bbc var1);
}


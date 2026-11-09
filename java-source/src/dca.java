/*
 * Decompiled with CFR.
 */
public class dca
extends dbw {
    private cxd.k dBm = null;
    private boolean bnQ = true;
    private int bnR = 0;
    private boolean dNX = false;

    public dca() {
        super(cxd.j.fRx);
    }

    public cxd.k bjm() {
        return this.dBm;
    }

    public void b(cxd.k k2) {
        this.dBm = k2;
    }

    public boolean Cb() {
        return this.bnQ;
    }

    public void aW(boolean bl) {
        this.bnQ = bl;
    }

    public int Cc() {
        return this.bnR;
    }

    public void fD(int n2) {
        this.bnR = n2;
    }

    public boolean bjn() {
        return this.dNX;
    }

    public void hD(boolean bl) {
        this.dNX = bl;
    }

    @Override
    public void bjk() {
        assert (!this.boj.bfF());
        assert (this.bnR > 0);
        double d2 = 0.0;
        d2 = this.bnQ ? (double)this.boj.xn(this.bnR) : (double)this.boj.fG(this.bnR);
        if (d2 <= 0.0) {
            lfn.b(5, "SFPerformingObjectProgressbar", "startPerforming() ProgressBarTimeRequired is invalid.");
            return;
        }
        double d3 = this.boj.getMessageDelegator().arc().rgz;
        d2 += d3;
        buk buk2 = this.boj.aJz().bgQ().aJO();
        if (buk2 != null) {
            buk2.a(this.dBm, this.boj.getGUID(), d3, d2, this.dNX);
        }
    }

    @Override
    public void beQ() {
        buk buk2 = this.boj.aJz().bgQ().aJO();
        if (buk2 != null) {
            buk2.c(this.dBm, this.boj.getGUID());
        }
    }

    @Override
    public void a(ldv ldv2, cxd.k k2, float f2) {
        buk buk2 = this.boj.aJz().bgQ().aJO();
        if (buk2 != null) {
            buk2.a(ldv2, k2, (double)f2);
        }
    }

    @Override
    protected void a(dbw dbw2) {
        super.a(dbw2);
        dca dca2 = (dca)dbw2;
        dca2.b(this.dBm);
        dca2.aW(this.bnQ);
        dca2.fD(this.bnR);
        dca2.hD(this.dNX);
    }
}


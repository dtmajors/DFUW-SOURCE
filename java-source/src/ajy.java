/*
 * Decompiled with CFR.
 */
public class ajy
extends aja
implements aki,
ako {
    private boolean bnQ = true;
    private int bnR = 0;
    private double bqc = 0.0;
    private double oV = 0.0;

    public ajy() {
        this.bog = ajb.b.boY;
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

    public void fD(int n) {
        this.bnR = n;
    }

    @Override
    protected boolean BU() {
        this.bok = null;
        return true;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        ajy ajy2 = (ajy)aja2;
        ajy2.aW(this.bnQ);
        ajy2.fD(this.bnR);
    }

    @Override
    public void Ch() {
        assert (this.bqc == 0.0);
        assert (this.oV == 0.0);
        this.bqc = 0.0;
        this.bqc = this.bnQ ? (double)this.boj.xn(this.bnR) : (double)this.boj.fG(this.bnR);
        if (this.bqc <= 0.0) {
            return;
        }
        this.oV = this.boj.getMessageDelegator().arc().rgz;
    }

    @Override
    public void Ci() {
        if (this.bqc == 0.0) {
            return;
        }
        assert (this.bqc > 0.0);
        assert (this.oV > 0.0);
        this.bqc = 0.0;
        this.oV = 0.0;
    }

    @Override
    public boolean CW() {
        assert (this.bqc > 0.0);
        assert (this.oV > 0.0);
        double d2 = this.boj.getMessageDelegator().arc().rgz;
        double d3 = d2 - this.oV;
        return d3 >= this.bqc;
    }
}


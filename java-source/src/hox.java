/*
 * Decompiled with CFR.
 */
public abstract class hox
extends hmt {
    private final lbn kTs;
    private boolean Initialized;
    private int kTt;
    private double kTu;
    private int kTv;
    private double kLl;
    private double kLm;
    private double kTw;
    private double kTx;
    private final double kTy;

    public hox(hnc hnc2, String string, lgg lgg2, lhf lhf2, double d2, double d3, double d4) {
        super(hnc2, string, lgg2, lhf2);
        assert (d2 <= d4);
        assert (d4 <= d3);
        this.kTs = null;
        this.kLl = d2;
        this.kLm = d3;
        this.kTw = d4;
        this.kTx = this.cT(this.kTw);
        this.kTy = 1.0;
    }

    public final double cqa() {
        return this.kLl;
    }

    public final double cqb() {
        return this.kLm;
    }

    public final boolean M(float f2, float f3) {
        assert (f2 <= f3);
        if ((double)f2 == this.kLl && (double)f3 == this.kLm) {
            return false;
        }
        this.kLl = f2;
        this.kLm = f3;
        this.kTx = this.cT(this.kTw);
        if (this.Initialized) {
            this.cur();
        }
        return true;
    }

    public final double cum() {
        return this.kTw;
    }

    public final boolean cR(double d2) {
        this.kTw = d2;
        if ((d2 = this.cT(d2)) == this.kTx) {
            return false;
        }
        this.kTx = d2;
        if (this.Initialized) {
            this.ciT();
        }
        return true;
    }

    public final boolean c(ldd ldd2) {
        assert (ldd2 == ldd.ret || ldd2 == ldd.rer);
        double d2 = this.kTw + this.kTy * (double)ldd2.reu;
        return this.cR(d2);
    }

    public final boolean cun() {
        return this.kTw <= this.kLl;
    }

    public final boolean cuo() {
        return this.kTw >= this.kLm;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cce() {
        super.cce();
        this.refresh();
    }

    protected void cup() {
        this.refresh();
    }

    protected void cuq() {
        this.cuu();
        this.refresh();
    }

    protected void ciT() {
        this.cuu();
        if (this.kTs != null) {
            this.kTs.W();
        }
    }

    protected void cur() {
        this.cut();
        this.ciT();
    }

    protected abstract void ccd();

    private void refresh() {
        this.ccd();
    }

    protected final int cus() {
        return this.kTt;
    }

    protected final boolean NG(int n) {
        assert (n >= 0);
        if (n == 0) {
            n = 1;
        }
        if (n == this.kTt) {
            return false;
        }
        this.kTt = n;
        this.cut();
        return true;
    }

    private void cut() {
        double d2 = this.kLm - this.kLl;
        double d3 = (double)this.kTt / d2;
        if (Double.isNaN(d3) || Double.isInfinite(d3)) {
            d3 = 0.0;
        }
        assert (d3 >= 0.0);
        if (ldf.r(d3, this.kTu)) {
            return;
        }
        this.kTu = d3;
        this.cuq();
    }

    protected final double NH(int n) {
        assert (n >= 0);
        assert (n < this.kTt);
        double d2 = (double)n / this.kTu + this.kLl;
        assert (d2 >= this.kLl);
        assert (d2 <= this.kLm);
        return d2;
    }

    protected final int cS(double d2) {
        assert (d2 >= this.kLl);
        assert (d2 <= this.kLm);
        int n = (int)Math.round((d2 - this.kLl) * this.kTu);
        assert (n >= 0);
        assert (n <= this.kTt);
        return n;
    }

    private void cuu() {
        int n = this.cS(this.kTx);
        if (n == this.kTv) {
            return;
        }
        this.kTv = n;
        this.cup();
    }

    protected final int cuv() {
        return this.kTv;
    }

    private double cT(double d2) {
        d2 = Math.max(d2, this.kLl);
        d2 = Math.min(d2, this.kLm);
        return d2;
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}


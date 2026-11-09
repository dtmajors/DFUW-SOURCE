/*
 * Decompiled with CFR.
 */
public class hqg
extends hoa {
    private final b kYe;
    private final ldb kYf;
    private final lbn kYg;
    private final hqz kYh;
    private final hqz kYi;
    private final c kYj;
    private final hqz kYk;
    private final hqz kYl;
    private boolean Initialized;
    private int kYm;
    private int kYn;
    private int kYo;

    public hqg(hnc hnc2, String string, lgg lgg2, lhf lhf2, b b2, ldb ldb2, lbn lbn2, lbn lbn3, lbn lbn4, lbn lbn5, lbn lbn6) {
        super(hnc2, string, lgg2, lhf2, b2.jHw);
        assert (lbn2 != null);
        assert (lbn3 != null);
        assert (lbn4 != null);
        assert (lbn5 != null);
        assert (lbn6 != null);
        this.kYe = b2;
        this.kYf = ldb2;
        this.kYg = lbn4;
        this.kYh = this.a(lbn2, b2.kYx, (String)null);
        this.kYi = this.a(lbn3, b2.kYz, (String)null);
        this.kYk = this.a(lbn5, b2.kYA, (String)null);
        this.kYl = this.a(lbn6, b2.kYy, (String)null);
        this.kYj = new c(this.kLu, (String)null, lgg.rlI, lhf.rnv, b2.kYB, this);
        this.j(this.kYj);
    }

    public final int cwd() {
        assert (this.Initialized);
        return this.kYm;
    }

    public void cR(int n, int n2) {
        if (this.kYn == n && this.kYo == n2) {
            return;
        }
        this.kYn = n;
        this.kYo = n2;
        if (this.kYj.cwg()) {
            return;
        }
        this.cjz();
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.nb(true);
        this.Initialized = true;
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.nb(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        super.cce();
        this.cjz();
    }

    protected final void NQ(int n) {
        a a2 = this.cwf();
        n -= a2.kYp;
        n = Math.max(n, 0);
        this.kYm = (n = Math.min(n, a2.kYt)) >= a2.kYt ? this.kYn : a2.NR(n);
        this.kYj.z(new lgg(this.kYf, n += a2.kYp, 0));
        this.kYg.W();
    }

    protected final void cwe() {
        assert (this.Initialized);
        this.cjz();
    }

    private hqz a(lbn lbn2, lhv lhv2, String string) {
        hqz hqz2 = new hqz(this.kLu, string, lgg.rlI, lhf.rnv, hpx.a.kXn, this.kYe.kYw, lhv2);
        hqz2.cvC().a(true, lbn2);
        this.j(hqz2);
        return hqz2;
    }

    private a cwf() {
        int n = 0;
        for (int i = 0; i < 3; ++i) {
            lgg lgg2 = new lgg(this.kYf, i, 0);
            n += this.kYj.cS((int)lgg2.cf, (int)lgg2.cg).kLY.e(this.kYf);
        }
        return new a(this, this.e(this.kYf), this.kYh.cwA().kLY.e(this.kYf), this.kYl.cwA().kLY.e(this.kYf), n);
    }

    private void cjz() {
        a a2 = this.cwf();
        int n = a2.NS(this.kYo);
        assert (n >= 0);
        assert (n <= a2.kYt);
        boolean bl = this.kYo <= 0;
        boolean bl2 = this.kYo >= this.kYn - a2.kTt;
        int n2 = 0;
        int n3 = a2.kYp;
        this.a(this.kYh, n2, n3, bl);
        n2 = n3;
        this.a(this.kYi, n2, n3 += n + a2.kYr / 2, bl);
        n2 = n3;
        n3 = a2.kTt - a2.kYq;
        this.a(this.kYk, n2, n3, bl2);
        n2 = n3;
        n3 = a2.kTt;
        this.a(this.kYl, n2, n3, bl2);
        n2 = a2.kYp + n;
        n3 = n2 + a2.kYr;
        this.a(this.kYj, n2, n3, bl && bl2);
        this.kYj.nR(!a2.kYs);
    }

    private void a(hpx hpx2, int n, int n2, boolean bl) {
        lgs lgs2 = new lgs(0, 0, this.getWidth(), this.getHeight());
        lgs2.n(this.kYf, n);
        int n3 = Math.max(0, n2 - n);
        lgs2.o(this.kYf, n3);
        hpx2.j(lgs2);
        hpx2.og(bl);
    }

    private void nb(boolean bl) {
        assert (lda.yk(bl));
    }

    static /* synthetic */ int a(hqg hqg2) {
        return hqg2.kYn;
    }

    static /* synthetic */ ldb b(hqg hqg2) {
        return hqg2.kYf;
    }
}


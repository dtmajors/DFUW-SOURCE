/*
 * Decompiled with CFR.
 */
import java.util.Set;

public class hqm
extends hoa {
    private final hnz kPK;
    private final hpf kla;
    private final hmm kZd;
    private final hpx kZe;
    private final hpx kZf;
    private final a kZg;
    private final double kTy;
    public final lbn kZh = new lbn(this){
        final /* synthetic */ hqm kZk;
        {
            this.kZk = hqm2;
        }

        public final void W() {
            this.kZk.ciT();
        }
    };
    public final lbn kZi = new lbn(this){
        final /* synthetic */ hqm kZk;
        {
            this.kZk = hqm2;
        }

        public final void W() {
            hqm.a(this.kZk, hqm.a(this.kZk) * 1.0);
        }
    };
    public final lbn kZj = new lbn(this){
        final /* synthetic */ hqm kZk;
        {
            this.kZk = hqm2;
        }

        public final void W() {
            hqm.a(this.kZk, hqm.a(this.kZk) * -1.0);
        }
    };
    private final lbp kPB = new lbp(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hqm kZk;
        {
            this.kZk = hqm2;
        }

        public final boolean caU() {
            if (!$assertionsDisabled && !hqm.b(this.kZk)) {
                throw new AssertionError();
            }
            hqm.a(this.kZk, hqm.a(this.kZk) * 1.0);
            return true;
        }

        static {
            $assertionsDisabled = !hqm.class.desiredAssertionStatus();
        }
    };
    private final lbp kPC = new lbp(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hqm kZk;
        {
            this.kZk = hqm2;
        }

        public final boolean caU() {
            if (!$assertionsDisabled && !hqm.b(this.kZk)) {
                throw new AssertionError();
            }
            hqm.a(this.kZk, hqm.a(this.kZk) * -1.0);
            return true;
        }

        static {
            $assertionsDisabled = !hqm.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;

    public hqm(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2, double d2, double d3, double d4, int n, double d5) {
        super(hnc2, string, lgg2, lhf2, a2.jHw);
        assert (d2 <= d4);
        assert (d4 <= d3);
        assert (d5 > 0.0);
        this.kZg = a2;
        this.kTy = d5;
        int n2 = this.kZg.kZm.kLY.rmN;
        this.kPK = new hnz(hnc2, null, lgg.rlI, new lhf(lhf2.rmN - n2, lhf2.H), this.kZg.kPT);
        this.j(this.kPK);
        double d6 = Math.max(Math.abs(d3), Math.abs(d2));
        int n3 = (int)Math.log10(d6) + 1;
        if (d2 < 0.0) {
            ++n3;
        }
        if (n > 0) {
            n3 += 1 + n;
        }
        this.kla = new hpf(hnc2, null, this.a((hms)this.kPK, this.kPK.csU().aI()), this.kPK.csU().cqv(), this.kZg.kZl, ++n3);
        this.j(this.kla);
        this.p(this.kla);
        this.kZd = new hmm(this.kla, d2, d3, d4, n);
        this.kla.a(this.kZd.cqf());
        this.kZe = new hqz(hnc2, null, new lgg(lhf2.rmN - n2, 0), new lhf(n2, lhf2.H / 2), hpx.a.kXn, this.kZg.kYw, this.kZg.kZm);
        this.j(this.kZe);
        this.kZf = new hqz(hnc2, null, new lgg(lhf2.rmN - n2, lhf2.H / 2), new lhf(n2, lhf2.H / 2), hpx.a.kXn, this.kZg.kYw, this.kZg.kZn);
        this.j(this.kZf);
    }

    public final hme cqg() {
        return this.kZd.cqg();
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
        this.refresh();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void ctB() {
        this.refresh();
        super.ctB();
    }

    @Override
    protected void ccf() {
        assert (this.Initialized);
        super.ccf();
        if (this.kla.isInitialized()) {
            this.kla.ok(this.isFocusOwner());
        }
        if (!this.isFocusOwner() && this.kla.kiG.chD()) {
            this.kZd.cqh();
        }
    }

    @Override
    protected boolean LM(int n) {
        assert (this.Initialized);
        if (super.LM(n)) {
            return true;
        }
        this.cZ((double)n * this.kTy);
        return true;
    }

    @Override
    protected boolean a(int n, boolean bl, Set<jpn> set) {
        assert (this.Initialized);
        if (super.a(n, bl, set)) {
            return true;
        }
        return this.kla.b(n, bl, set);
    }

    @Override
    protected boolean LN(int n) {
        assert (this.Initialized);
        if (super.LN(n)) {
            return true;
        }
        return this.kla.Ni(n);
    }

    protected void cws() {
        this.ciT();
    }

    protected void ciT() {
        this.refresh();
    }

    private void refresh() {
        double d2 = this.kZd.cqg().cpZ();
        double d3 = this.kZd.cqg().cqa();
        double d4 = this.kZd.cqg().cqb();
        boolean bl = this.kla.kiG.chD() || this.cty();
        this.kZe.og(bl || d2 >= d4);
        this.kZf.og(bl || d2 <= d3);
    }

    private void cZ(double d2) {
        double d3;
        double d4;
        double d5 = this.kZd.cqg().cpZ();
        double d6 = d5 + d2;
        if (d6 < (d4 = this.kZd.cqg().cqa())) {
            d6 = d4;
        }
        if (d6 > (d3 = this.kZd.cqg().cqb())) {
            d6 = d3;
        }
        if (!this.kZd.cqg().cP(d6)) {
            return;
        }
        this.kla.kiG.selectAll();
    }

    private void mU(boolean bl) {
        this.kZd.cqg().cpY().a(bl, this.kZh);
        this.a(bl, this.kPB, 38, jpn.nLm);
        this.a(bl, this.kPC, 40, jpn.nLm);
        this.kZe.cvC().a(bl, this.kZi);
        this.kZf.cvC().a(bl, this.kZj);
    }

    static /* synthetic */ double a(hqm hqm2) {
        return hqm2.kTy;
    }

    static /* synthetic */ void a(hqm hqm2, double d2) {
        hqm2.cZ(d2);
    }

    static /* synthetic */ boolean b(hqm hqm2) {
        return hqm2.Initialized;
    }
}


/*
 * Decompiled with CFR.
 */
import java.util.Set;

public class hpt
extends hmt
implements hmk {
    private final hne kli;
    private final hnw kWo;
    private final hqg[] kWp = new hqg[ldb.ListOfValue.size()];
    private final hpa kWq;
    private final a kWr;
    private final hmk.a[] kWs = new hmk.a[ldb.ListOfValue.size()];
    private final lbn kWt = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hpt kWy;
        {
            this.kWy = hpt2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hpt.a(this.kWy)) {
                throw new AssertionError();
            }
            hpt.a(this.kWy, ldb.reo);
        }

        static {
            $assertionsDisabled = !hpt.class.desiredAssertionStatus();
        }
    };
    private final lbn kWu = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hpt kWy;
        {
            this.kWy = hpt2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hpt.a(this.kWy)) {
                throw new AssertionError();
            }
            hpt.a(this.kWy, ldb.rep);
        }

        static {
            $assertionsDisabled = !hpt.class.desiredAssertionStatus();
        }
    };
    private final lbn kWv = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hpt kWy;
        {
            this.kWy = hpt2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hpt.a(this.kWy)) {
                throw new AssertionError();
            }
            hpt.b(this.kWy);
        }

        static {
            $assertionsDisabled = !hpt.class.desiredAssertionStatus();
        }
    };
    private final lbn kWw = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hpt kWy;
        {
            this.kWy = hpt2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hpt.a(this.kWy)) {
                throw new AssertionError();
            }
            hpt.b(this.kWy);
        }

        static {
            $assertionsDisabled = !hpt.class.desiredAssertionStatus();
        }
    };
    private final lbn kWx = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hpt kWy;
        {
            this.kWy = hpt2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hpt.a(this.kWy)) {
                throw new AssertionError();
            }
            hpt.b(this.kWy);
        }

        static {
            $assertionsDisabled = !hpt.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;

    public hpt(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2) {
        this(hnc2, string, lgg2, lhf2, a2, hmk.a.kKZ, hmk.a.kKZ);
    }

    public hpt(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2, hmk.a a3, hmk.a a4) {
        super(hnc2, string, lgg2, lhf2);
        assert (a2 != null);
        this.kWr = a2;
        this.kli = new hne(new lhf(2, 2), lgg.rlI);
        this.kWs[ldb.reo.ordinal()] = a3;
        this.kWs[ldb.rep.ordinal()] = a4;
        int n = this.kWr.kWD.get((int)ldb.rep.ordinal()).kYx.kLY.e(ldb.reo);
        int n2 = this.kWr.kWD.get((int)ldb.reo.ordinal()).kYx.kLY.e(ldb.rep);
        this.kli.a(ldb.reo, 1, n);
        this.kli.a(ldb.rep, 1, n2);
        this.cvq();
        this.kWo = hpt.a(hnc2, "Aperture Component", a2.kWB, a2.kWC, this.kli.cF(0, 0));
        this.kli.a(0, 0, this.kWo);
        this.j(this.kWo);
        this.p(this.kWo);
        hqg hqg2 = new hqg(hnc2, null, lgg.rlI, lhf.rnv, this.kWr.kWD.get(ldb.rep.ordinal()), ldb.rep, this.kWo.a(ldb.rep, hnj.kOw, ldd.rer), this.kWo.a(ldb.rep, hnj.kOx, ldd.rer), this.kWu, this.kWo.a(ldb.rep, hnj.kOx, ldd.ret), this.kWo.a(ldb.rep, hnj.kOw, ldd.ret));
        this.kli.a(0, 1, hqg2);
        this.j(hqg2);
        this.kWp[ldb.rep.ordinal()] = hqg2;
        hqg2 = new hqg(hnc2, null, lgg.rlI, lhf.rnv, this.kWr.kWD.get(ldb.reo.ordinal()), ldb.reo, this.kWo.a(ldb.reo, hnj.kOw, ldd.rer), this.kWo.a(ldb.reo, hnj.kOx, ldd.rer), this.kWt, this.kWo.a(ldb.reo, hnj.kOx, ldd.ret), this.kWo.a(ldb.reo, hnj.kOw, ldd.ret));
        this.kli.a(1, 0, hqg2);
        this.j(hqg2);
        this.kWp[ldb.reo.ordinal()] = hqg2;
        this.kWq = new hpa(hnc2, (String)null, lgg.rlI, lhf.rnv, this.kWr.kWE);
        this.kli.a(1, 1, this.kWq);
        this.j(this.kWq);
    }

    public final hmk.a m(ldb ldb2) {
        return this.kWs[ldb2.ordinal()];
    }

    public final void a(ldb ldb2, hmk.a a2) {
        if (this.kWs[ldb2.ordinal()] == a2) {
            return;
        }
        this.kWs[ldb2.ordinal()] = a2;
        if (this.Initialized) {
            this.cvr();
        }
    }

    public final void cti() {
        this.kWo.cti();
        this.d(this.kWo.cqv());
    }

    @Override
    public final int b(ldb ldb2) {
        return this.kWr.kWD.get((int)ldb2.eni().ordinal()).kYx.kLY.e(ldb2);
    }

    @Override
    public final hqg c(ldb ldb2) {
        return this.kWp[ldb2.ordinal()];
    }

    @Override
    public final hlx cqd() {
        return this.kWo;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.nb(true);
        this.cvr();
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
        this.cvq();
        this.cvr();
    }

    @Override
    protected boolean LM(int n) {
        assert (this.Initialized);
        if (super.LM(n)) {
            return true;
        }
        if (this.kWo.Nj(n)) {
            return true;
        }
        return true;
    }

    @Override
    protected boolean a(int n, boolean bl, Set<jpn> set) {
        assert (this.Initialized);
        if (super.a(n, bl, set)) {
            return true;
        }
        return this.kWo.b(n, bl, set);
    }

    @Override
    protected boolean LN(int n) {
        assert (this.Initialized);
        if (super.LN(n)) {
            return true;
        }
        return this.kWo.Ni(n);
    }

    private void n(ldb ldb2) {
        int n = this.kWp[ldb2.ordinal()].cwd();
        this.kWo.g(ldb2, n);
    }

    private void cvq() {
        int n = 10;
        if (!this.kli.a(this.cqv(), n)) {
            // empty if block
        }
    }

    private void cvr() {
        this.a(ldb.reo, false);
        this.a(ldb.rep, false);
        this.cvq();
        this.a(ldb.reo, true);
        this.a(ldb.rep, true);
        this.cvq();
    }

    private void a(ldb ldb2, boolean bl) {
        int n;
        assert (this.Initialized);
        int n2 = this.kWo.i(ldb2);
        boolean bl2 = false;
        switch (this.kWs[ldb2.ordinal()]) {
            case kKY: {
                break;
            }
            case kKZ: {
                n = (bl ? this.kWo : this).e(ldb2);
                if (n2 <= n) break;
                bl2 = true;
                break;
            }
            case kLa: {
                bl2 = true;
                break;
            }
            default: {
                assert (false) : this.kWs[ldb2.ordinal()];
                break;
            }
        }
        n = bl2 ? this.b(ldb2) : 0;
        this.kli.a(ldb2.eni(), 1, n);
        if (bl2) {
            this.kWp[ldb2.ordinal()].cR(n2, this.kWo.g(ldb2));
        }
    }

    private static hnw a(hnc hnc2, String string, b b2, hpw.a a2, lhf lhf2) {
        switch (b2) {
            default: {
                return hpt.a(hnc2, string, b.kWF, null, lhf2);
            }
            case kWF: {
                return new hnw(hnc2, string, lgg.rlI, lhf2, false);
            }
            case kWG: {
                return new hnx(hnc2, string, lgg.rlI, lhf2, a2);
            }
            case kWH: 
        }
        return new hny(hnc2, string, lgg.rlI, lhf2, a2);
    }

    private void nb(boolean bl) {
        this.kWo.cqn().a(bl, this.kWx);
        this.kWo.cte().cqn().a(bl, this.kWv);
        this.kWo.cte().cqm().a(bl, this.kWw);
    }

    static /* synthetic */ boolean a(hpt hpt2) {
        return hpt2.Initialized;
    }

    static /* synthetic */ void a(hpt hpt2, ldb ldb2) {
        hpt2.n(ldb2);
    }

    static /* synthetic */ void b(hpt hpt2) {
        hpt2.cvr();
    }
}


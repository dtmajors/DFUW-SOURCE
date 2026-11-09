/*
 * Decompiled with CFR.
 */
import java.util.Set;

public class hpu
extends hmt
implements hmk {
    private final hne kli;
    private final hnw kWo;
    private final hqz kWJ;
    private final hqz kWK;
    private final a kWL;
    private final lbn kWv = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hpu kWM;
        {
            this.kWM = hpu2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hpu.a(this.kWM)) {
                throw new AssertionError();
            }
            hpu.b(this.kWM);
        }

        static {
            $assertionsDisabled = !hpu.class.desiredAssertionStatus();
        }
    };
    private final lbn kWw = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hpu kWM;
        {
            this.kWM = hpu2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hpu.a(this.kWM)) {
                throw new AssertionError();
            }
            hpu.b(this.kWM);
        }

        static {
            $assertionsDisabled = !hpu.class.desiredAssertionStatus();
        }
    };
    private final lbn kWx = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hpu kWM;
        {
            this.kWM = hpu2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hpu.a(this.kWM)) {
                throw new AssertionError();
            }
            hpu.b(this.kWM);
        }

        static {
            $assertionsDisabled = !hpu.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;

    public hpu(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2) {
        super(hnc2, string, lgg2, lhf2);
        assert (a2 != null);
        this.kWL = a2;
        this.kli = new hne(new lhf(3, 1), lgg.rlI);
        this.kli.a(ldb.reo, 1, this.kWL.kWP.kLY.rmN);
        this.kli.a(ldb.reo, 2, this.kWL.kWQ.kLY.rmN);
        this.cvq();
        this.kWo = hpu.a(hnc2, a2.kWO, a2.jHx, this.kli.cF(0, 0));
        this.kli.a(0, 0, this.kWo);
        this.j(this.kWo);
        this.p(this.kWo);
        this.kWJ = new hqz(hnc2, null, lgg.rlI, lhf.rnv, hpx.a.kXn, this.kWL.kJH, this.kWL.kWP);
        this.kli.a(0, 1, this.kWJ);
        this.j(this.kWJ);
        this.kWK = new hqz(hnc2, null, lgg.rlI, lhf.rnv, hpx.a.kXn, this.kWL.kJH, this.kWL.kWQ);
        this.kli.a(0, 2, this.kWK);
        this.j(this.kWK);
    }

    @Override
    public final hlx cqd() {
        return this.kWo;
    }

    @Override
    public final int b(ldb ldb2) {
        switch (ldb2) {
            case reo: {
                boolean bl;
                int n = this.kWo.i(ldb.reo);
                boolean bl2 = bl = n > this.kWo.e(ldb.reo);
                if (!bl) {
                    return 0;
                }
                return this.kWL.kWP.kLY.rmN + this.kWL.kWQ.kLY.H;
            }
            case rep: {
                return 0;
            }
        }
        assert (false) : ldb2;
        return 0;
    }

    @Override
    public final hqg c(ldb ldb2) {
        return null;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.nb(true);
        this.cvs();
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

    private void cvs() {
        int n = this.kWo.i(ldb.reo);
        boolean bl = n > this.kWo.e(ldb.reo);
        this.kli.a(ldb.reo, 1, bl ? this.kWL.kWP.kLY.rmN : 0);
        this.kli.a(ldb.reo, 2, bl ? this.kWL.kWQ.kLY.rmN : 0);
        if (bl) {
            int n2 = this.kWo.g(ldb.reo);
            int n3 = this.cqd().cpJ().rmN;
            this.kWJ.og(n2 == 0);
            this.kWK.og(n2 >= n - n3);
        }
        this.cvq();
    }

    private void cvq() {
        int n = 3;
        if (!this.kli.a(this.cqv(), n)) {
            // empty if block
        }
    }

    private static hnw a(hnc hnc2, b b2, hpw.a a2, lhf lhf2) {
        String string = null;
        switch (b2) {
            default: {
                return hpu.a(hnc2, b.kWR, null, lhf2);
            }
            case kWR: {
                return new hnw(hnc2, string, lgg.rlI, lhf2, false);
            }
            case kWS: {
                return new hnx(hnc2, string, lgg.rlI, lhf2, a2);
            }
            case kWT: 
        }
        return new hny(hnc2, string, lgg.rlI, lhf2, a2);
    }

    private void nb(boolean bl) {
        this.kWo.cqn().a(bl, this.kWx);
        this.kWo.cte().cqn().a(bl, this.kWv);
        this.kWo.cte().cqm().a(bl, this.kWw);
        this.kWJ.cvC().a(bl, this.kWo.a(ldb.reo, hnj.kOw, ldd.rer));
        this.kWK.cvC().a(bl, this.kWo.a(ldb.reo, hnj.kOw, ldd.ret));
    }

    static /* synthetic */ boolean a(hpu hpu2) {
        return hpu2.Initialized;
    }

    static /* synthetic */ void b(hpu hpu2) {
        hpu2.cvs();
    }
}


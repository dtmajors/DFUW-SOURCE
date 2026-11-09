/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class hnw
extends hmt
implements hlx {
    private final boolean kPV;
    private final List<a> kPW = Collections.unmodifiableList(Arrays.asList(new a(this, ldb.rep, hnj.kOy, ldd.rer), new a(this, ldb.rep, hnj.kOw, ldd.rer), new a(this, ldb.rep, hnj.kOx, ldd.rer), new a(this, ldb.rep, hnj.kOx, ldd.ret), new a(this, ldb.rep, hnj.kOw, ldd.ret), new a(this, ldb.rep, hnj.kOy, ldd.ret), new a(this, ldb.reo, hnj.kOy, ldd.rer), new a(this, ldb.reo, hnj.kOw, ldd.rer), new a(this, ldb.reo, hnj.kOx, ldd.rer), new a(this, ldb.reo, hnj.kOx, ldd.ret), new a(this, ldb.reo, hnj.kOw, ldd.ret), new a(this, ldb.reo, hnj.kOy, ldd.ret)));
    private final hnd kLZ = new hnd();
    private final lbn kPX = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hnw kQb;
        {
            this.kQb = hnw2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hnw.a(this.kQb)) {
                throw new AssertionError();
            }
            this.kQb.ckz();
        }

        static {
            $assertionsDisabled = !hnw.class.desiredAssertionStatus();
        }
    };
    private final lbn kPY = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hnw kQb;
        {
            this.kQb = hnw2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hnw.a(this.kQb)) {
                throw new AssertionError();
            }
            this.kQb.ctj();
        }

        static {
            $assertionsDisabled = !hnw.class.desiredAssertionStatus();
        }
    };
    private final lbn kPZ = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hnw kQb;
        {
            this.kQb = hnw2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hnw.a(this.kQb)) {
                throw new AssertionError();
            }
            lgs lgs2 = hnw.b(this.kQb).cvy();
            this.kQb.k(lgs2);
        }

        static {
            $assertionsDisabled = !hnw.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;
    private hpw kQa;

    public hnw(hnc hnc2, String string, lgg lgg2, lhf lhf2, boolean bl) {
        super(hnc2, string, lgg2, lhf2);
        this.kPV = bl;
    }

    public final hpw cte() {
        return this.kQa;
    }

    @Override
    public final void a(hpw hpw2) {
        assert (!this.Initialized);
        assert (this.kQa == null);
        assert (hpw2 != null);
        this.kQa = hpw2;
        this.j(this.kQa);
        this.p(this.kQa);
    }

    public final int g(ldb ldb2) {
        assert (this.Initialized);
        if (this.kQa == null) {
            return 0;
        }
        int n = this.kQa.d(ldb2);
        return -n;
    }

    public final lgg ctf() {
        assert (this.Initialized);
        return new lgg(this.g(ldb.reo), this.g(ldb.rep));
    }

    public final int h(ldb ldb2) {
        assert (this.Initialized);
        if (this.kQa == null) {
            return 0;
        }
        int n = this.kQa.cqA().r(ldb2);
        return -n;
    }

    public final lgg ctg() {
        assert (this.Initialized);
        if (this.kQa == null) {
            return lgg.rlI;
        }
        return this.kQa.cqA();
    }

    public final void c(lgg lgg2, lgg lgg3) {
        int n = lgg2.cf - lgg3.cf;
        int n2 = lgg2.cg - lgg3.cg;
        this.cI(n, n2);
    }

    public final void C(lgg lgg2) {
        this.cI(lgg2.cf, lgg2.cg);
    }

    public final void cI(int n, int n2) {
        int n3 = this.j(ldb.reo, n);
        int n4 = this.j(ldb.rep, n2);
        this.kQa.cB(-n3, -n4);
    }

    public final void g(ldb ldb2, int n) {
        int n2 = this.j(ldb2, n);
        int n3 = this.kQa.cqA().r(ldb2.eni());
        lgg lgg2 = new lgg(ldb2, -n2, n3);
        this.kQa.z(lgg2);
    }

    public final void a(ldb ldb2, int n, boolean bl) {
        assert (this.Initialized);
        n = this.j(ldb2, n);
        if (bl) {
            this.kQa.a(ldb2, -n, (float)this.kLu.crO());
        } else {
            int n2 = this.cqA().r(ldb2.eni());
            lgg lgg2 = new lgg(ldb2, -n, n2);
            this.kQa.z(lgg2);
        }
    }

    public final int i(ldb ldb2) {
        if (this.kQa == null) {
            return 0;
        }
        int n = this.kQa.e(ldb2);
        assert (n >= 0);
        return n;
    }

    public final lhf cth() {
        assert (this.Initialized);
        return new lhf(this.i(ldb.reo), this.i(ldb.rep));
    }

    @Override
    public final void a(ldb ldb2, hnj hnj2, ldd ldd2, int n) {
        assert (this.Initialized);
        assert (ldd2 != ldd.res);
        int n2 = this.h(ldb2);
        for (int i = 0; i < n; ++i) {
            n2 = this.b(ldb2, hnj2, ldd2, n2);
        }
        this.g(ldb2, n2);
    }

    @Override
    public final lhf cpJ() {
        assert (this.Initialized);
        return this.cqv();
    }

    @Override
    public final lbl<lbn> cpI() {
        return this.cqn();
    }

    public final void k(lgs lgs2) {
        assert (this.Initialized);
        for (ldb ldb2 : ldb.values()) {
            int n = lgs2.r(ldb2);
            int n2 = lgs2.e(ldb2);
            int n3 = this.h(ldb2);
            n3 = this.b(ldb2, n3, n + n2);
            n3 = this.b(ldb2, n3, n);
            this.g(ldb2, n3);
        }
    }

    public final int b(ldb ldb2, hnj hnj2, ldd ldd2, int n) {
        assert (this.Initialized);
        assert (ldd2 != ldd.res);
        block0 : switch (hnj2) {
            case kOw: {
                n = this.kQa.b(ldb2, ldd2, n);
                break;
            }
            case kOx: {
                int n2;
                int n3 = n;
                int n4 = this.e(ldb2);
                while ((n2 = this.kQa.b(ldb2, ldd2, n)) != n) {
                    n = n2;
                    int n5 = Math.abs(n - n3);
                    if (n5 < n4) continue;
                    n = this.kQa.b(ldb2, ldd2.enj(), n);
                    if (n5 <= n4) break block0;
                    n = this.kQa.b(ldb2, ldd2.enj(), n);
                    break block0;
                }
                break;
            }
            case kOy: {
                n = ldd2 == ldd.rer ? 0 : this.j(ldb2);
                break;
            }
            default: {
                assert (false) : hnj2;
                break;
            }
        }
        return n;
    }

    public final int h(ldb ldb2, int n) {
        int n2 = this.kQa.d(ldb2);
        int n3 = n + n2;
        return n3;
    }

    public final lgg D(lgg lgg2) {
        return new lgg(this.h(ldb.reo, lgg2.cf), this.h(ldb.rep, lgg2.cg));
    }

    public final int i(ldb ldb2, int n) {
        int n2 = this.kQa.d(ldb2);
        int n3 = -n2 + n;
        return n3;
    }

    public final lgg E(lgg lgg2) {
        return new lgg(this.i(ldb.reo, lgg2.cf), this.i(ldb.rep, lgg2.cg));
    }

    public final void cti() {
        this.d(this.kQa.cqv());
    }

    public final lbn a(ldb ldb2, hnj hnj2, ldd ldd2) {
        return this.b(ldb2, hnj2, ldd2);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        assert (this.kQa != null);
        super.FF();
        this.Initialized = true;
        this.nb(true);
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
        this.ctk();
        this.kQa.g(this.cqv());
    }

    @Override
    protected boolean LM(int n) {
        assert (this.Initialized);
        if (super.LM(n)) {
            return true;
        }
        if (this.kQa.Nj(n)) {
            return true;
        }
        ldd ldd2 = n > 0 ? ldd.rer : ldd.ret;
        int n2 = Math.abs(n) * this.kLu.csb();
        this.a(ldb.rep, hnj.kOw, ldd2, n2);
        return true;
    }

    @Override
    protected boolean a(int n, boolean bl, Set<jpn> set) {
        assert (this.Initialized);
        if (super.a(n, bl, set)) {
            return true;
        }
        if (this.kQa.b(n, bl, set)) {
            return true;
        }
        return this.kLZ.a(n, set);
    }

    @Override
    protected boolean LN(int n) {
        assert (this.Initialized);
        if (super.LN(n)) {
            return true;
        }
        return this.kQa.Ni(n);
    }

    protected void ckz() {
        assert (this.Initialized);
        this.ctk();
    }

    protected void ctj() {
        assert (this.Initialized);
        this.ctk();
    }

    protected int j(ldb ldb2) {
        int n = this.i(ldb2) - this.e(ldb2);
        n = Math.max(0, n);
        return n;
    }

    protected void of(boolean bl) {
        ldd ldd2 = ldd.ret;
        if (this.kPV) {
            ldd2 = ldd2.enj();
        }
        ldd ldd3 = ldd2.enj();
        this.a(bl, ldb.rep, hnj.kOw, ldd3, 38, jpn.nLm);
        this.a(bl, ldb.rep, hnj.kOx, ldd3, 33, jpn.nLm);
        this.a(bl, ldb.rep, hnj.kOx, ldd3, 38, jpn.nLI);
        this.a(bl, ldb.rep, hnj.kOy, ldd3, 33, jpn.nLI);
        this.a(bl, ldb.rep, hnj.kOy, ldd3, 36, jpn.nLI);
        this.a(bl, ldb.rep, hnj.kOw, ldd2, 40, jpn.nLm);
        this.a(bl, ldb.rep, hnj.kOx, ldd2, 34, jpn.nLm);
        this.a(bl, ldb.rep, hnj.kOx, ldd2, 40, jpn.nLI);
        this.a(bl, ldb.rep, hnj.kOy, ldd2, 34, jpn.nLI);
        this.a(bl, ldb.rep, hnj.kOy, ldd2, 35, jpn.nLI);
        this.a(bl, ldb.reo, hnj.kOw, ldd3, 37, jpn.nLm);
        this.a(bl, ldb.reo, hnj.kOx, ldd3, 37, jpn.nLI);
        this.a(bl, ldb.reo, hnj.kOy, ldd3, 36, jpn.nLm);
        this.a(bl, ldb.reo, hnj.kOw, ldd2, 39, jpn.nLm);
        this.a(bl, ldb.reo, hnj.kOx, ldd2, 39, jpn.nLI);
        this.a(bl, ldb.reo, hnj.kOy, ldd2, 35, jpn.nLm);
    }

    private void a(boolean bl, ldb ldb2, hnj hnj2, ldd ldd2, int n, Set<jpn> set) {
        a a2 = this.b(ldb2, hnj2, ldd2);
        this.kLZ.a(bl, a2, n, set);
    }

    private int j(ldb ldb2, int n) {
        n = Math.max(0, n);
        n = Math.min(n, this.j(ldb2));
        if (this.kQa.isInitialized()) {
            n = this.kQa.b(ldb2, ldd.res, n);
        }
        assert (n >= 0 && n <= this.i(ldb2)) : n;
        return n;
    }

    private int b(ldb ldb2, int n, int n2) {
        int n3;
        assert (this.Initialized);
        if (n2 < n) {
            return n2;
        }
        int n4 = this.e(ldb2);
        if (n2 > n + n4 && (n3 = this.kQa.b(ldb2, ldd.res, n = n2 - n4)) < n) {
            n = this.kQa.b(ldb2, ldd.ret, n);
        }
        return n;
    }

    private void ctk() {
        if (this.kQa.Ow()) {
            this.kQa.cqs();
        }
        lgg lgg2 = this.ctf();
        this.C(lgg2);
    }

    private a b(ldb ldb2, hnj hnj2, ldd ldd2) {
        for (a a2 : this.kPW) {
            if (a2.kQd != ldb2 || a2.kOT != hnj2 || a2.kOU != ldd2) continue;
            return a2;
        }
        return null;
    }

    private void nb(boolean bl) {
        this.kQa.cqm().a(bl, this.kPX);
        this.kQa.cqn().a(bl, this.kPY);
        this.kQa.cvx().a(bl, this.kPZ);
        this.of(bl);
    }

    @Override
    public /* synthetic */ hms cpH() {
        return this.cte();
    }

    static /* synthetic */ boolean a(hnw hnw2) {
        return hnw2.Initialized;
    }

    static /* synthetic */ hpw b(hnw hnw2) {
        return hnw2.kQa;
    }
}


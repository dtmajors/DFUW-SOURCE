/*
 * Decompiled with CFR.
 */
import java.util.Set;

public class hqq
extends hqr {
    protected final hpf kla;
    private final a kZr;
    private boolean Initialized;

    public hqq(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2, int n) {
        super(hnc2, string, lgg2, lhf2, a2.jGK, hmk.a.kKY, a2.kZl.kiK instanceof hpe.d ? hmk.a.kKZ : hmk.a.kKY);
        this.kZr = a2;
        this.kla = new hpf(hnc2, null, lgg.rlI, this.csU().cqv(), this.kZr.kZl, n);
        this.cwt().cqd().a(this.kla);
    }

    public final hmj chj() {
        return this.kla.kiG;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
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
        super.ctB();
    }

    @Override
    protected boolean LM(int n) {
        assert (this.Initialized);
        if (super.LM(n)) {
            return true;
        }
        return this.kla.Nj(n);
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

    @Override
    protected void ccf() {
        assert (this.Initialized);
        super.ccf();
        if (this.isFocusOwner()) {
            this.kla.cqV();
        }
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}


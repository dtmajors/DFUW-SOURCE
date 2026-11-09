/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Set;

public class hqf
extends hqr {
    private final hok kYb;
    private final a kYc;
    private boolean Initialized;

    public hqf(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2, List<hmc.a> list) {
        super(hnc2, string, lgg2, lhf2, a2.jGK, hmk.a.kKY, hmk.a.kKZ);
        this.kYc = a2;
        this.kYb = new hok(hnc2, null, lgg.rlI, lhf2, this.kYc.kYd, list);
        this.cwt().cqd().a(this.kYb);
    }

    public final hmc cue() {
        return this.kYb.cue();
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
        return this.kYb.Nj(n);
    }

    @Override
    protected boolean a(int n, boolean bl, Set<jpn> set) {
        assert (this.Initialized);
        if (super.a(n, bl, set)) {
            return true;
        }
        return this.kYb.b(n, bl, set);
    }

    @Override
    protected boolean LN(int n) {
        assert (this.Initialized);
        if (super.LN(n)) {
            return true;
        }
        return this.kYb.Ni(n);
    }

    @Override
    protected void cce() {
        this.kYb.d(new lhf(this.getWidth(), this.kYb.getHeight()));
        super.cce();
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}


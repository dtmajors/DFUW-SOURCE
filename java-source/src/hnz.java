/*
 * Decompiled with CFR.
 */
import java.util.EnumMap;

public class hnz
extends hmt {
    private static final int kQi = 1;
    private static final int kQj = 2;
    private static final int kQk = 4;
    private static final int kQl = 8;
    private final EnumMap<f, e> kQm = new EnumMap(f.class);
    private final d kQn;
    private boolean Initialized;
    private c kQo = b.kQB;

    public hnz(hnc hnc2, String string, lgg lgg2, lhf lhf2, d d2) {
        super(hnc2, string, lgg2, lhf2);
        assert (d2 != null);
        this.kQn = d2;
        for (f f2 : f.values()) {
            e.a a2 = d2.b(f2);
            if (a2 == null) continue;
            lgs lgs2 = f2.a(this.kQn, this.getWidth(), this.getHeight());
            e e2 = new e(hnc2, (String)null, lgs2.aI(), lgs2.cqv(), a2);
            this.j(e2);
            this.kQm.put(f2, e2);
        }
    }

    public final lgs csU() {
        lgs lgs2 = this.cqE();
        lgs2.cf += this.kQn.ctn();
        lgs2.cg += this.kQn.cto();
        lgs2.rmN -= this.kQn.ctn() + this.kQn.ctp();
        lgs2.H -= this.kQn.cto() + this.kQn.ctq();
        return lgs2;
    }

    public final e a(f f2) {
        return this.kQm.get((Object)f2);
    }

    public final e F(lgg lgg2) {
        for (f f2 : f.values()) {
            e e2 = this.kQm.get((Object)f2);
            if (!this.b((hms)e2, lgg2)) continue;
            return e2;
        }
        return null;
    }

    public final void a(c c2) {
        assert (!this.Initialized);
        assert (this.kQo == b.kQB);
        assert (c2 != null);
        this.kQo = c2;
    }

    public final c ctm() {
        return this.kQo;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
        this.ccm();
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
        assert (this.Initialized);
        super.cce();
        this.ccm();
    }

    @Override
    protected boolean co(int n, int n2) {
        if (!super.co(n, n2)) {
            return false;
        }
        for (e e2 : this.kQm.values()) {
            int n3;
            int n4;
            if (!e2.contains(n4 = e2.a(this, ldb.reo, n), n3 = e2.a(this, ldb.rep, n2))) continue;
            return true;
        }
        return false;
    }

    private void ccm() {
        for (f f2 : f.values()) {
            e.a a2 = this.kQn.b(f2);
            if (a2 == null) continue;
            lgs lgs2 = f2.a(this.kQn, this.getWidth(), this.getHeight());
            this.kQm.get((Object)f2).j(lgs2);
        }
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }

    static /* synthetic */ c a(hnz hnz2) {
        return hnz2.kQo;
    }
}


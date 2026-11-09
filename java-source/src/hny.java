/*
 * Decompiled with CFR.
 */
public class hny
extends hnw {
    private final hpa kQe;
    private final hmt kQf;
    private final hpa kQg;
    private final hmt kQh;
    private boolean Initialized;

    public hny(hnc hnc2, String string, lgg lgg2, lhf lhf2, hpw.a a2) {
        super(hnc2, string, lgg2, lhf2, false);
        assert (a2 != null);
        this.kQf = new hmt(hnc2, null, lgg.rlI, lhf.rnv);
        this.j(this.kQf);
        this.kQe = new hpa(hnc2, (String)null, lgg.rlI, lhf.rnv, a2.kPU);
        this.kQf.j(this.kQe);
        this.kQe.H(a2.ktY);
        this.kQh = new hmt(hnc2, null, lgg.rlI, lhf.rnv);
        this.j(this.kQh);
        this.kQg = new hpa(hnc2, (String)null, lgg.rlI, lhf.rnv, a2.kPU);
        this.kQg.H(a2.ktY);
        this.kQh.j(this.kQg);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.nb(true);
        this.ctl();
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
        this.ctl();
    }

    @Override
    protected <C extends hms> C c(lgg lgg2, Class<C> clazz) {
        Object object = super.c(lgg2, clazz);
        if ((object == this.kQh || object == this.kQf) && clazz.isAssignableFrom(hpw.class)) {
            object = this.cte();
        }
        return object;
    }

    @Override
    protected int j(ldb ldb2) {
        int n = super.j(ldb2);
        return n + this.cte().l(ldb2, this.e(ldb2));
    }

    @Override
    protected void ckz() {
        super.ckz();
        this.ctl();
    }

    @Override
    protected void ctj() {
        super.ctj();
        this.ctl();
    }

    private void ctl() {
        hpw hpw2 = this.cte();
        lgs lgs2 = new lgs(hpw2 == null ? lgg.rlI : hpw2.cqw(), this.j(ldb.reo) + this.getWidth(), this.j(ldb.rep) + this.getHeight());
        lhf lhf2 = this.cth();
        lgs lgs3 = new lgs(lgs2);
        lgs3.cf += lhf2.rmN;
        lgs3.rmN = Math.max(0, lgs3.rmN - lhf2.rmN);
        lgs3.H = lhf2.H;
        this.kQf.j(lgs3);
        lgs3 = new lgs(lgs2);
        lgs3.cg += lhf2.H;
        lgs3.H = Math.max(0, lgs3.H - lhf2.H);
        this.kQh.j(lgs3);
        lgs2.cf = 0;
        lgs2.cg = 0;
        this.kQe.j(lgs2);
        this.kQg.j(lgs2);
    }

    private void nb(boolean bl) {
        assert (lda.yk(bl));
    }
}


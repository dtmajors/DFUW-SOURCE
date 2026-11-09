/*
 * Decompiled with CFR.
 */
public class hqs
extends hoa {
    private final hnz kPK;
    private final a kZv;
    private boolean Initialized;
    private hms kPP;

    public hqs(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2) {
        super(hnc2, string, lgg2, lhf2, a2.jHw);
        this.kZv = a2;
        this.kPK = new hnz(hnc2, null, lgg.rlI, lhf2, this.kZv.kPT);
        this.j(this.kPK);
    }

    public final hms csT() {
        return this.kPP;
    }

    public final void w(hms hms2) {
        this.kPP = hms2;
        this.j(this.kPP);
        this.p(this.kPP);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.nb(true);
        this.Initialized = true;
        this.cvq();
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

    protected lgs csU() {
        int n = this.kZv.kPT.ctn();
        int n2 = this.kZv.kPT.cto();
        int n3 = this.kZv.kPT.ctp();
        int n4 = this.kZv.kPT.ctq();
        return new lgs(n, n2, Math.max(0, this.getWidth() - (n + n3)), Math.max(0, this.getHeight() - (n2 + n4)));
    }

    private void cvq() {
        lgs lgs2 = this.cqE();
        this.kPK.j(lgs2);
        lgs2 = this.csU();
        lgs2 = this.kPK.a((hms)this, lgs2);
        this.kPP.j(lgs2);
    }

    private void nb(boolean bl) {
        assert (lda.yk(bl));
    }
}


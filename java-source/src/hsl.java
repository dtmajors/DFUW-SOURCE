/*
 * Decompiled with CFR.
 */
public class hsl
extends hsj {
    public static final hbe jzX = hbe.jAM;
    public final ldv lci;
    private boolean Initialized;
    private hsd lcj;

    public hsl(hsh hsh2, ldv ldv2) {
        super(hsh2);
        assert (ldv2 != null);
        this.lci = ldv2;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
        this.lcj = new hsd(this.lbq.jDE, null, this.lci);
        this.lcj.w(this.cxw());
        this.lcj.c(this.cqv());
        this.lcj.g(this.cqU());
        this.lcj.eq(!this.cxx());
        this.lcj.H(this.cuw());
        this.lcj.kc(this.cxy());
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.lcj.cleanup();
        this.lcj = null;
        this.mU(false);
        this.Initialized = false;
        super.FG();
    }

    @Override
    protected void cxs() {
        assert (this.Initialized);
        this.lcj.w(this.cxw());
        this.chd();
    }

    @Override
    protected void cxt() {
        assert (this.Initialized);
        this.lcj.c(this.cqv());
        this.chd();
    }

    @Override
    protected void chd() {
        assert (this.Initialized);
        lgs lgs2 = this.cqU();
        this.lcj.g(lgs2);
    }

    @Override
    protected void cxu() {
        assert (this.Initialized);
        this.lcj.eq(!this.cxx());
    }

    @Override
    protected void cvu() {
        assert (this.Initialized);
        this.lcj.H(this.cuw());
    }

    @Override
    protected void cqZ() {
        assert (this.Initialized);
        this.lcj.kc(this.cxy());
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}


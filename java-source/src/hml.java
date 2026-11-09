/*
 * Decompiled with CFR.
 */
public class hml
implements hoh.a {
    private final hoh jIn;
    private final boolean kLc;
    private final lmv kLd;
    private final lmv kLe;
    private final lmv kLf;
    private final lmv kLg;
    private final lbn kLh = new lbn(this){
        final /* synthetic */ hml kLk;
        {
            this.kLk = hml2;
        }

        public final void W() {
            if (hml.a(this.kLk)) {
                hml.c(this.kLk).i(hml.b(this.kLk));
            }
            hml.d(this.kLk).refresh();
        }
    };
    private final lbn kLi = new lbn(this){
        final /* synthetic */ hml kLk;
        {
            this.kLk = hml2;
        }

        public final void W() {
            hml.b(this.kLk).i(hml.c(this.kLk));
            hml.d(this.kLk).refresh();
        }
    };
    private final lbn kLj = new lbn(this){
        final /* synthetic */ hml kLk;
        {
            this.kLk = hml2;
        }

        public final void W() {
            hml.e(this.kLk);
        }
    };

    public hml(hoh hoh2, lmv lmv2, boolean bl) {
        assert (lmv2 != null);
        this.jIn = hoh2;
        this.kLd = lmv2;
        this.kLc = bl;
        this.kLg = lmv2.evb().euX();
        this.kLf = lmv2.evc();
        this.kLe = lmv2.evc();
        this.mU(true);
    }

    public lmv cqe() {
        return this.kLe;
    }

    @Override
    public boolean ccs() {
        return this.kLe.j(this.kLg);
    }

    @Override
    public boolean cct() {
        if (this.kLc) {
            return this.kLe.j(this.kLf);
        }
        return this.kLe.j(this.kLd);
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void ccp() {
        this.kLd.i(this.kLe);
    }

    @Override
    public void ccq() {
        this.kLe.i(this.kLg);
    }

    @Override
    public void ccr() {
        if (this.kLc) {
            this.kLe.i(this.kLf);
        }
        this.kLe.i(this.kLd);
    }

    private void cleanup() {
        this.mU(false);
    }

    private void mU(boolean bl) {
        this.kLe.cec().a(bl, this.kLh);
        this.kLd.cec().a(bl, this.kLi);
        this.jIn.cql().a(bl, this.kLj);
    }

    static /* synthetic */ boolean a(hml hml2) {
        return hml2.kLc;
    }

    static /* synthetic */ lmv b(hml hml2) {
        return hml2.kLe;
    }

    static /* synthetic */ lmv c(hml hml2) {
        return hml2.kLd;
    }

    static /* synthetic */ hoh d(hml hml2) {
        return hml2.jIn;
    }

    static /* synthetic */ void e(hml hml2) {
        hml2.cleanup();
    }
}


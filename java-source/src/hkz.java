/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public abstract class hkz
extends hdj {
    public final lnt kCy;
    private final lbn kCz = new lbn(this){
        final /* synthetic */ hkz kCF;
        {
            this.kCF = hkz2;
        }

        public final void W() {
            this.kCF.O(1, false);
        }
    };
    private final lbn kCA = new lbn(this){
        final /* synthetic */ hkz kCF;
        {
            this.kCF = hkz2;
        }

        public final void W() {
            this.kCF.O(-1, false);
        }
    };
    protected final jor kCB = new jor(this){
        final /* synthetic */ hkz kCF;
        {
            this.kCF = hkz2;
        }

        public final void a(jov jov2, boolean bl) {
            if (bl) {
                this.kCF.O(1, false);
            }
            hkz.b((hkz)this.kCF).kNC.a(bl, hkz.a(this.kCF));
        }
    };
    protected final jor kCC = new jor(this){
        final /* synthetic */ hkz kCF;
        {
            this.kCF = hkz2;
        }

        public final void a(jov jov2, boolean bl) {
            if (bl) {
                this.kCF.O(-1, false);
            }
            hkz.d((hkz)this.kCF).kNC.a(bl, hkz.c(this.kCF));
        }
    };
    private final lbn kCD = new lbn(this){
        final /* synthetic */ hkz kCF;
        {
            this.kCF = hkz2;
        }

        public final void W() {
            this.kCF.nP(hkz.e(this.kCF));
        }
    };
    private boolean kCE;

    public hkz(hdm hdm2, String string, String string2, int n, jov jov2, lnt lnt2) {
        super(hdm2, string, string2, n, jov2);
        this.kCy = lnt2;
        this.nb(true);
    }

    public final void O(int n, boolean bl) {
        this.kCE = bl;
        this.kCy.adJ(n);
        this.kCE = false;
    }

    @Override
    protected void cbg() {
        this.nb(false);
        super.cbg();
    }

    @Override
    protected boolean d(lfu lfu2) {
        boolean bl = false;
        bl |= lfu2.a("SelectorOfZoom", this.kCy);
        return bl |= super.d(lfu2);
    }

    @Override
    protected void nf(boolean bl) {
        super.nf(bl);
    }

    protected abstract void nP(boolean var1);

    protected final hes cpj() {
        return (hes)this.cdh();
    }

    private void nb(boolean bl) {
        assert (lda.yk(bl));
        this.kCy.cec().a(bl, this.kCD);
    }

    static /* synthetic */ lbn a(hkz hkz2) {
        return hkz2.kCz;
    }

    static /* synthetic */ hdm b(hkz hkz2) {
        return hkz2.jLM;
    }

    static /* synthetic */ lbn c(hkz hkz2) {
        return hkz2.kCA;
    }

    static /* synthetic */ hdm d(hkz hkz2) {
        return hkz2.jLM;
    }

    static /* synthetic */ boolean e(hkz hkz2) {
        return hkz2.kCE;
    }
}


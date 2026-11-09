/*
 * Decompiled with CFR.
 */
public abstract class hpz
extends hoa {
    protected final lbp kXx = new lbp(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hpz kXE;
        {
            this.kXE = hpz2;
        }

        public final boolean caU() {
            if (!$assertionsDisabled && !hpz.a(this.kXE)) {
                throw new AssertionError();
            }
            this.kXE.cvO();
            return true;
        }

        static {
            $assertionsDisabled = !hpz.class.desiredAssertionStatus();
        }
    };
    private final lbp kXy = new lbp(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hpz kXE;
        {
            this.kXE = hpz2;
        }

        public final boolean caU() {
            if (!$assertionsDisabled && !hpz.a(this.kXE)) {
                throw new AssertionError();
            }
            this.kXE.cvP();
            return true;
        }

        static {
            $assertionsDisabled = !hpz.class.desiredAssertionStatus();
        }
    };
    private final lbn kXz = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hpz kXE;
        {
            this.kXE = hpz2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hpz.a(this.kXE)) {
                throw new AssertionError();
            }
            this.kXE.op(false);
        }

        static {
            $assertionsDisabled = !hpz.class.desiredAssertionStatus();
        }
    };
    private final lbn kXA = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hpz kXE;
        {
            this.kXE = hpz2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hpz.a(this.kXE)) {
                throw new AssertionError();
            }
            hpz.b(this.kXE);
        }

        static {
            $assertionsDisabled = !hpz.class.desiredAssertionStatus();
        }
    };
    protected final lbp kXB = new lbp(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hpz kXE;
        {
            this.kXE = hpz2;
        }

        public final boolean caU() {
            if (!$assertionsDisabled && !hpz.a(this.kXE)) {
                throw new AssertionError();
            }
            if (!this.kXE.cvN()) {
                this.kXE.cvL();
            }
            return true;
        }

        static {
            $assertionsDisabled = !hpz.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;
    private hms kXC;
    private boolean kXD;

    public hpz(hnc hnc2, String string, lgg lgg2, lhf lhf2, hoa.a a2) {
        super(hnc2, string, lgg2, lhf2, a2);
    }

    public final void cvL() {
        assert (!this.cvN());
        this.kXC = this.cvS();
        this.kLu.a("Dropbox", this.kXC);
        this.op(true);
    }

    public final void cvM() {
        assert (this.cvN());
        this.cvQ();
        this.cvW();
    }

    public final void cancel() {
        assert (this.cvN());
        this.cvR();
        this.cvW();
    }

    public final boolean cvN() {
        return this.kXC != null;
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
        if (this.cvN()) {
            this.cvW();
        }
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cbM() {
        super.cbM();
        this.cvU();
    }

    @Override
    protected void cbv() {
        super.cbv();
        this.cvV();
    }

    @Override
    protected void cdC() {
        super.cdC();
    }

    protected void cvO() {
        this.cancel();
    }

    protected void cvP() {
        this.cvM();
    }

    protected abstract void cvQ();

    protected abstract void cvR();

    protected abstract hms cvS();

    protected void op(boolean bl) {
        this.oq(bl);
        if (bl) {
            this.kXC.cqV();
        } else {
            this.kXC = null;
        }
    }

    protected boolean cvT() {
        return true;
    }

    private void cvU() {
        if (this.cqH()) {
            if (!this.cvN()) {
                this.cvL();
                this.kXD = true;
            }
        } else if (this.kXC == null || !this.kXC.A(this.kXC.cqu())) {
            this.cancel();
        }
    }

    private void cvV() {
        if (this.cqH()) {
            if (this.kXD) {
                this.kXD = false;
            } else if (this.cvN()) {
                this.cvM();
            }
        } else if (this.kXC != null && this.kXC.A(this.kXC.cqu())) {
            if (this.cvT()) {
                this.cvM();
            }
        } else if (this.cvN() && this.cvT()) {
            this.cvM();
        }
    }

    private void cvW() {
        assert (this.kXC != null);
        this.kLu.t(this.kXC);
        assert (this.kXC == null);
        if (this.kLu.csc() && this.kXD) {
            this.crb();
        }
    }

    private void oq(boolean bl) {
        this.kXC.cql().a(bl, this.kXz);
        this.kXC.a(bl, this.kXx, 27, jpn.nLm);
        this.kXC.a(bl, this.kXy, 13, jpn.nLm);
        this.kLu.cqo().a(bl, this.kXA);
    }

    private void cvX() {
        if (this.kLu.csc()) {
            this.cvU();
        } else {
            this.cvV();
        }
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }

    static /* synthetic */ boolean a(hpz hpz2) {
        return hpz2.Initialized;
    }

    static /* synthetic */ void b(hpz hpz2) {
        hpz2.cvX();
    }
}


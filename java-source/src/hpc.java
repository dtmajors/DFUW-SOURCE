/*
 * Decompiled with CFR.
 */
public class hpc
extends hou {
    private final a kUe;
    private final hpu kUf;
    protected final hpd kUg;
    private final lbn kUh = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hpc kUk;
        {
            this.kUk = hpc2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hpc.a(this.kUk)) {
                throw new AssertionError();
            }
            this.kUk.cuO();
        }

        static {
            $assertionsDisabled = !hpc.class.desiredAssertionStatus();
        }
    };
    private final lbp kUi = new lbp(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hpc kUk;
        {
            this.kUk = hpc2;
        }

        public final boolean caU() {
            if (!$assertionsDisabled && !hpc.a(this.kUk)) {
                throw new AssertionError();
            }
            this.kUk.kUg.oi(true);
            return true;
        }

        static {
            $assertionsDisabled = !hpc.class.desiredAssertionStatus();
        }
    };
    private final lbp kUj = new lbp(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hpc kUk;
        {
            this.kUk = hpc2;
        }

        public final boolean caU() {
            if (!$assertionsDisabled && !hpc.a(this.kUk)) {
                throw new AssertionError();
            }
            this.kUk.kUg.oj(true);
            return true;
        }

        static {
            $assertionsDisabled = !hpc.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;

    public hpc(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2, hpd hpd2) {
        super(hnc2, string, lgg2, lhf2, new lhf(3, 3), new lgg(1, 1));
        assert (a2 != null);
        assert (!hpd2.isInitialized());
        this.kUe = a2;
        this.kUg = hpd2;
        this.a(ldb.reo, 0, this.kUe.kUm.rmN);
        this.a(ldb.reo, 2, this.kUe.kUm.rmN);
        this.a(ldb.rep, 0, this.kUg.getHeight());
        this.a(ldb.rep, 2, this.kUe.kUm.H);
        hpa hpa2 = new hpa(hnc2, (String)null, lgg.rlI, lhf.rnv, this.kUe.kUn);
        this.d(0, 0, hpa2);
        this.kUf = new hpu(hnc2, null, lgg.rlI, lhf.rnv, this.kUe.kUl);
        this.d(0, 1, this.kUf);
        this.kUg.z(lgg.rlI);
        this.kUf.cqd().a(this.kUg);
        hpa hpa3 = new hpa(hnc2, (String)null, lgg.rlI, lhf.rnv, this.kUe.kUp);
        this.d(0, 2, hpa3);
        hpa hpa4 = new hpa(hnc2, (String)null, lgg.rlI, lhf.rnv, this.kUe.kUq);
        this.d(1, 0, hpa4);
        this.d(1, 1, this.cuQ());
        hpa hpa5 = new hpa(hnc2, (String)null, lgg.rlI, lhf.rnv, this.kUe.kUr);
        this.d(1, 2, hpa5);
        hpa hpa6 = new hpa(hnc2, (String)null, lgg.rlI, lhf.rnv, this.kUe.kUs);
        this.d(2, 0, hpa6);
        hpa hpa7 = new hpa(hnc2, (String)null, lgg.rlI, lhf.rnv, this.kUe.kUt);
        this.d(2, 1, hpa7);
        hpa hpa8 = new hpa(hnc2, (String)null, lgg.rlI, lhf.rnv, this.kUe.kUu);
        this.d(2, 2, hpa8);
    }

    public void a(hmi hmi2) {
        assert (hmi2 != null);
        this.kUg.a(hmi2);
    }

    public hmi cuM() {
        return this.kUg.cuM();
    }

    public void a(hmi hmi2, int n) {
        this.kUg.a(hmi2, n);
    }

    public void b(hmi hmi2) {
        assert (hmi2 != null);
        this.kUg.b(hmi2);
    }

    public hms cuN() {
        assert (this.Initialized);
        return this.cP(1, 1);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
        this.cuP();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    protected void cuO() {
        this.cuP();
    }

    private void cuP() {
        hmi hmi2 = this.kUg.cuM();
        lgg lgg2 = this.cG(1, 1);
        lhf lhf2 = this.cF(1, 1);
        hms hms2 = hmi2 == null ? this.cuQ() : hmi2.a(lgg2, lhf2);
        this.b(1, 1, hms2);
        this.p(hms2);
        if (this.kUg.cuT()) {
            hms2.cqV();
        }
    }

    private hms cuQ() {
        hpa hpa2 = new hpa(this.kLu, (String)null, lgg.rlI, lhf.rnv, this.kUe.kUv);
        return hpa2;
    }

    private void mU(boolean bl) {
        this.kUg.cuR().a(bl, this.kUh);
        this.a(bl, this.kUi, 9, jpn.nLI);
        this.a(bl, this.kUj, 9, jpn.nLL);
    }

    static /* synthetic */ boolean a(hpc hpc2) {
        return hpc2.Initialized;
    }
}


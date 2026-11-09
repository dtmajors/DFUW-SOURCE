/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
public class hjd
extends how {
    private final hpe kuA;
    private final hhw kxx;
    private final hhw kxy;
    private final hhw kxz;
    private final hht kxA;
    private final lbn kxB = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hjd kxC;
        {
            this.kxC = hjd2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hjd.a(this.kxC)) {
                throw new AssertionError();
            }
            this.kxC.cmR();
        }

        static {
            $assertionsDisabled = !hjd.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;

    public hjd(hdm hdm2, String string, lgg lgg2, lhf lhf2) {
        super((hnc)hdm2, string, lgg2, lhf2, hdm2.jYm);
        this.kxx = new hhw(hdm2, null, this.c(hdm2.jXk.jRl, hdm2.jXk.jPK), hdm2.jXk.jPK, this.cbO().jXo, 0.0f, 10.0f, 5.0f, lcy.qYc);
        this.j(this.kxx);
        this.kxy = new hhw(hdm2, null, this.c(hdm2.jXk.jRm, hdm2.jXk.jPK), hdm2.jXk.jPK, this.cbO().jXp, 0.0f, 10.0f, 5.0f, lcy.qYd);
        this.j(this.kxy);
        this.kxz = new hhw(hdm2, null, this.c(hdm2.jXk.jRn, hdm2.jXk.jPK), hdm2.jXk.jPK, this.cbO().jXq, 0.0f, 10.0f, 5.0f, lcy.qYe);
        this.j(this.kxz);
        this.kxA = new hht(hdm2, null, this.c(hdm2.jXk.jRo, hdm2.jXk.jPK), hdm2.jXk.jPK, this.cbO().jXt, lcy.qYf);
        this.kxA.M(-10.0f, 10.0f);
        this.j(this.kxA);
        this.kuA = new hpe(this.kLu, null, hdm2.jXk.jRj, hdm2.jXk.jRk, this.cbO().kIy, "");
        this.j(this.kuA);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
        this.cmR();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected lcu cfR() {
        assert (this.Initialized);
        return this.kLu.kNw;
    }

    @Override
    protected void cbM() {
        assert (this.Initialized);
        this.cio().cfI();
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    protected final void cmR() {
        assert (this.Initialized);
        hjh hjh2 = this.cbP().kck;
        this.kuA.mV(hjh2.hl());
        this.kxx.M(0.0f, hjh2.cfC());
        this.kxx.cR(hjh2.afi());
        this.kxy.M(0.0f, hjh2.cne());
        this.kxy.cR(hjh2.cnd());
        this.kxz.M(0.0f, hjh2.cng());
        this.kxz.cR(hjh2.cnf());
        this.kxA.cR(lew.Q(hjh2.cnh(), -10, 10));
        this.kxA.nG(hjh2.cni());
    }

    private hen cio() {
        return (hen)this.cqt();
    }

    private lgg c(lgg lgg2, lhf lhf2) {
        return new lgg(lgg2.cf - lhf2.rmN / 2, lgg2.cg - lhf2.H / 2);
    }

    private void mU(boolean bl) {
        this.cbP().kck.cna().a(bl, this.kxB);
    }

    static /* synthetic */ boolean a(hjd hjd2) {
        return hjd2.Initialized;
    }
}


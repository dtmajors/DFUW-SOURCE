/*
 * Decompiled with CFR.
 */
public abstract class hnq {
    protected static final hbe jzX = hbe.jAM;
    private final lnh kPb;
    private final lel kPc;
    private final ldl kPd = new ldl();
    private boolean jLT;
    private a kPe;
    private double kPf = 1.0;
    private final lbn kPg = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hnq kPi;
        {
            this.kPi = hnq2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hnq.a(this.kPi)) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && !this.kPi.csI()) {
                throw new AssertionError();
            }
            hnq.a(this.kPi, hnq.b(this.kPi).cum());
            if (!($assertionsDisabled || hnq.c(this.kPi) >= 0.0 && hnq.c(this.kPi) <= 1.0)) {
                throw new AssertionError();
            }
            this.kPi.cQ(hnq.c(this.kPi));
        }

        static {
            $assertionsDisabled = !hnq.class.desiredAssertionStatus();
        }
    };
    private final lbn kPh = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hnq kPi;
        {
            this.kPi = hnq2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hnq.a(this.kPi)) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && !this.kPi.csI()) {
                throw new AssertionError();
            }
            hnq.a(this.kPi, hnq.d(this.kPi).csM());
        }

        static {
            $assertionsDisabled = !hnq.class.desiredAssertionStatus();
        }
    };

    public hnq(lbh lbh2, lnh lnh2) {
        this.kPb = lnh2;
        this.kPc = new lel(lbh2);
        this.jLT = true;
        this.kPe = a.kPj;
        this.mU(true);
    }

    public final void dispose() {
        assert (this.jLT);
        if (this.kPc.isStarted()) {
            this.kPc.stop();
        }
        this.mU(false);
        this.cbg();
        assert (!this.jLT);
    }

    public final boolean isConstructed() {
        return this.jLT;
    }

    public final lbl<lbn> csG() {
        return this.kPd;
    }

    public final a csH() {
        assert (this.jLT);
        return this.kPe;
    }

    public final boolean csI() {
        return this.kPe.csI();
    }

    public final boolean csJ() {
        return this.kPe.csM() == a.kPj;
    }

    public final boolean csK() {
        return this.kPe.csM() == a.kPk;
    }

    public final void t(boolean bl, boolean bl2) {
        float f2;
        assert (this.jLT);
        a a2 = bl ? a.kPl : a.kPm;
        this.a(a2);
        float f3 = f2 = bl ? 1.0f : 0.0f;
        if (bl2 && this.kPb != null) {
            double d2 = Math.abs((double)f2 - this.kPf);
            assert (d2 >= 0.0 && d2 <= 1.0);
            this.kPc.e(this.kPf, f2, this.kPb.getValue() * d2);
        } else {
            this.kPf = f2;
            this.cQ(this.kPf);
            this.a(this.kPe.csM());
        }
    }

    protected void cbg() {
        assert (this.jLT);
        this.jLT = false;
    }

    public String toString() {
        return super.toString();
    }

    protected void cQ(double d2) {
        assert (lda.dQ(d2));
    }

    protected void cqj() {
        assert (this.jLT);
        this.kPd.enp();
    }

    private void a(a a2) {
        if (this.kPe == a2) {
            return;
        }
        this.kPe = a2;
        this.cqj();
    }

    private void mU(boolean bl) {
        this.kPc.eqf().a(bl, this.kPg);
        this.kPc.cmk().a(bl, this.kPh);
    }

    static /* synthetic */ boolean a(hnq hnq2) {
        return hnq2.jLT;
    }

    static /* synthetic */ double a(hnq hnq2, double d2) {
        hnq2.kPf = d2;
        return hnq2.kPf;
    }

    static /* synthetic */ lel b(hnq hnq2) {
        return hnq2.kPc;
    }

    static /* synthetic */ double c(hnq hnq2) {
        return hnq2.kPf;
    }

    static /* synthetic */ a d(hnq hnq2) {
        return hnq2.kPe;
    }

    static /* synthetic */ void a(hnq hnq2, a a2) {
        hnq2.a(a2);
    }
}


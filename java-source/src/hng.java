/*
 * Decompiled with CFR.
 */
public class hng {
    public static final hbe jzX = hbe.jAM;
    private final lia kOi;
    private final lbn kOj = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hng kOp;
        {
            this.kOp = hng2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hng.a(this.kOp).isStarted()) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && hng.b(this.kOp) == null) {
                throw new AssertionError();
            }
            double d2 = hng.a(this.kOp).esb();
            if (!($assertionsDisabled || d2 >= 0.0 && d2 <= hng.c(this.kOp))) {
                throw new AssertionError();
            }
            double d3 = Math.cos(d2 / hng.d(this.kOp) * Math.PI);
            if (!($assertionsDisabled || d3 >= -1.0 && d3 <= 1.0)) {
                throw new AssertionError();
            }
            d3 = (1.0 + d3) / 2.0;
            d3 = (double)hng.e(this.kOp) + d3 * (double)(hng.f(this.kOp) - hng.e(this.kOp));
            if (!($assertionsDisabled || d3 >= (double)hng.e(this.kOp) && d3 <= (double)hng.f(this.kOp))) {
                throw new AssertionError();
            }
            lcq lcq2 = new lcq(1.0f, 1.0f, 1.0f, (float)d3, true);
            hng.b(this.kOp).J(lcq2);
        }

        static {
            $assertionsDisabled = !hng.class.desiredAssertionStatus();
        }
    };
    private final lbn kOk = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hng kOp;
        {
            this.kOp = hng2;
        }

        public final void W() {
            if (!$assertionsDisabled && hng.a(this.kOp).isStarted()) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && hng.b(this.kOp) == null) {
                throw new AssertionError();
            }
            hng.g(this.kOp);
        }

        static {
            $assertionsDisabled = !hng.class.desiredAssertionStatus();
        }
    };
    private hmr jEN;
    private int kOl;
    private double eKm;
    private double kOm;
    private float kOn;
    private float kOo;

    public hng(lbh lbh2) {
        this.kOi = new lia(lbh2);
    }

    public final void a(hms hms2, int n, double d2, float f2, float f3) {
        assert (this.jEN == null);
        assert (hms2 != null);
        assert ((double)n > 0.0);
        assert (d2 > 0.0);
        this.jEN = new hmr(null);
        this.e(hms2);
        this.kOl = n;
        this.kOm = d2;
        this.kOn = f2;
        this.kOo = f3;
        this.jEN.J(new lcq(1.0f, 1.0f, 1.0f, this.kOn));
        this.eKm = (double)this.kOl * this.kOm;
        assert (this.eKm > 0.0);
        this.kOi.ee(this.eKm);
        this.mU(true);
    }

    private void e(hms hms2) {
        if (hms2 instanceof hoy) {
            hoy hoy2 = (hoy)hms2;
            this.jEN.a(true, hoy2);
        }
        if (hms2 instanceof hmt) {
            for (hms hms3 : ((hmt)hms2).crn()) {
                this.e(hms3);
            }
        }
    }

    private void detach() {
        this.mU(false);
        this.jEN.cleanup();
        this.jEN = null;
    }

    private void mU(boolean bl) {
        this.kOi.eqf().a(bl, this.kOj);
        this.kOi.esd().a(bl, this.kOk);
    }

    static /* synthetic */ lia a(hng hng2) {
        return hng2.kOi;
    }

    static /* synthetic */ hmr b(hng hng2) {
        return hng2.jEN;
    }

    static /* synthetic */ double c(hng hng2) {
        return hng2.eKm;
    }

    static /* synthetic */ double d(hng hng2) {
        return hng2.kOm;
    }

    static /* synthetic */ float e(hng hng2) {
        return hng2.kOn;
    }

    static /* synthetic */ float f(hng hng2) {
        return hng2.kOo;
    }

    static /* synthetic */ void g(hng hng2) {
        hng2.detach();
    }
}


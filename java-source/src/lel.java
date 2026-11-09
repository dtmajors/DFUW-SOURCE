/*
 * Decompiled with CFR.
 */
public class lel {
    protected static lfr Out = lfr.rkC;
    private final lia riT;
    private final ldl riU = new ldl();
    private final ldl kvl = new ldl();
    private double riV;
    private double riW;
    private double riX;
    private final lbn kOj = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ lel riY;
        {
            this.riY = lel2;
        }

        public final void W() {
            double d2;
            if (!$assertionsDisabled && !lel.a(this.riY).isStarted()) {
                throw new AssertionError();
            }
            double d3 = lel.a(this.riY).esb();
            double d4 = lel.a(this.riY).Bw();
            if (!($assertionsDisabled || d3 >= 0.0 && d3 <= d4)) {
                throw new AssertionError();
            }
            double d5 = d2 = d4 == 0.0 ? 1.0 : d3 / d4;
            if (!($assertionsDisabled || d2 >= 0.0 && d2 <= 1.0)) {
                throw new AssertionError();
            }
            lel.a(this.riY, lel.b(this.riY) + (lel.c(this.riY) - lel.b(this.riY)) * d2);
            lel.d(this.riY).enp();
        }

        static {
            $assertionsDisabled = !lel.class.desiredAssertionStatus();
        }
    };
    private final lbn kOk = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ lel riY;
        {
            this.riY = lel2;
        }

        public final void W() {
            if (!$assertionsDisabled && lel.a(this.riY).isStarted()) {
                throw new AssertionError();
            }
            lel.e(this.riY).enp();
            lel.a(this.riY, false);
        }

        static {
            $assertionsDisabled = !lel.class.desiredAssertionStatus();
        }
    };

    public lel(lbh lbh2) {
        this.riT = new lia(lbh2);
    }

    public lbl<lbn> eqf() {
        return this.riU;
    }

    public lbl<lbn> cmk() {
        return this.kvl;
    }

    public final boolean isStarted() {
        return this.riT.isStarted();
    }

    public final void e(double d2, double d3, double d4) {
        assert (d4 >= 0.0);
        this.riV = d2;
        this.riW = d3;
        if (this.riT.isStarted()) {
            if (!ldf.r(this.riT.Bw(), d4)) {
                this.riT.stop();
                this.riT.ee(d4);
            }
        } else {
            this.mU(true);
            this.riT.ee(d4);
        }
        assert (this.riT.isStarted());
    }

    public final double eqg() {
        return this.riW;
    }

    public final void eqh() {
        assert (this.riT.isStarted());
        this.riX = this.riW;
        this.riU.enp();
        if (this.riT.isStarted()) {
            this.stop();
            assert (!this.riT.isStarted());
        }
        this.kvl.enp();
        assert (!this.riT.isStarted());
    }

    public final void stop() {
        assert (this.riT.isStarted());
        this.riT.stop();
        this.mU(false);
        assert (!this.riT.isStarted());
    }

    public final double cum() {
        assert (this.riT.isStarted());
        return this.riX;
    }

    private void mU(boolean bl) {
        this.riT.eqf().a(bl, this.kOj);
        this.riT.esd().a(bl, this.kOk);
    }

    static /* synthetic */ lia a(lel lel2) {
        return lel2.riT;
    }

    static /* synthetic */ double a(lel lel2, double d2) {
        lel2.riX = d2;
        return lel2.riX;
    }

    static /* synthetic */ double b(lel lel2) {
        return lel2.riV;
    }

    static /* synthetic */ double c(lel lel2) {
        return lel2.riW;
    }

    static /* synthetic */ ldl d(lel lel2) {
        return lel2.riU;
    }

    static /* synthetic */ ldl e(lel lel2) {
        return lel2.kvl;
    }

    static /* synthetic */ void a(lel lel2, boolean bl) {
        lel2.mU(bl);
    }
}


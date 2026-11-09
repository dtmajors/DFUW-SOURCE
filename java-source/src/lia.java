/*
 * Decompiled with CFR.
 */
public class lia {
    private final lhz kfV;
    private final ldl riU = new ldl();
    private final ldl roc = new ldl();
    private final lbn kOj = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ lia rod;
        {
            this.rod = lia2;
        }

        public final void W() {
            if (!$assertionsDisabled && !lia.a(this.rod).isStarted()) {
                throw new AssertionError();
            }
            this.rod.cxd();
            double d2 = lia.a(this.rod).esb();
            if (d2 > lia.b(this.rod)) {
                this.rod.stop();
                this.rod.ese();
            }
        }

        static {
            $assertionsDisabled = !lia.class.desiredAssertionStatus();
        }
    };
    private double eKm;

    public lia(lbh lbh2) {
        this.kfV = new lhz(lbh2);
    }

    public final boolean isStarted() {
        return this.kfV.isStarted();
    }

    public final void ee(double d2) {
        this.eKm = d2;
        if (!this.kfV.isStarted()) {
            this.yy(true);
            this.kfV.start();
        }
        assert (this.kfV.isStarted());
    }

    public final void stop() {
        if (this.kfV.isStarted()) {
            this.yy(false);
            this.kfV.stop();
            assert (!this.kfV.isStarted());
        }
    }

    public final lbl<lbn> eqf() {
        return this.riU;
    }

    public final lbl<lbn> esd() {
        return this.roc;
    }

    public final double Bw() {
        return this.eKm;
    }

    public final double esa() {
        return this.kfV.esa();
    }

    public final double esb() {
        double d2 = this.kfV.esb();
        if (d2 > this.eKm) {
            d2 = this.eKm;
        }
        return d2;
    }

    protected void cxd() {
        assert (this.isStarted());
        this.riU.enp();
    }

    protected void ese() {
        assert (!this.isStarted());
        this.roc.enp();
    }

    private void yy(boolean bl) {
        this.kfV.eqf().a(bl, this.kOj);
    }

    static /* synthetic */ lhz a(lia lia2) {
        return lia2.kfV;
    }

    static /* synthetic */ double b(lia lia2) {
        return lia2.eKm;
    }
}


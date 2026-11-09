/*
 * Decompiled with CFR.
 */
public class lhz {
    private static final lfr Out = lfr.rkC;
    private final lbh kAz;
    private final ldl riU = new ldl();
    private boolean aME;
    private double gCK;
    private final lbn roa = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ lhz rob;
        {
            this.rob = lhz2;
        }

        public final void W() {
            if (!lhz.a(this.rob)) {
                return;
            }
            if (!$assertionsDisabled && !(lhz.b(this.rob).emb() >= lhz.c(this.rob))) {
                throw new AssertionError();
            }
            this.rob.cxd();
        }

        static {
            $assertionsDisabled = !lhz.class.desiredAssertionStatus();
        }
    };

    public lhz(lbh lbh2) {
        assert (lbh2 != null);
        this.kAz = lbh2;
    }

    public final lbl<lbn> eqf() {
        return this.riU;
    }

    public final boolean isStarted() {
        return this.aME;
    }

    public final void setStarted(boolean bl) {
        assert (bl != this.aME);
        this.aME = bl;
        this.esc();
    }

    public final void start() {
        this.setStarted(true);
    }

    public final void stop() {
        this.setStarted(false);
    }

    public final void reset() {
        this.gCK = this.kAz.emb();
    }

    public final double esa() {
        return this.gCK;
    }

    public final double esb() {
        double d2 = this.kAz.emb() - this.gCK;
        assert (d2 >= 0.0);
        return d2;
    }

    protected void esc() {
        this.kAz.eme().a(this.aME, this.roa);
        if (this.aME) {
            this.reset();
        }
    }

    protected void cxd() {
        assert (this.aME);
        this.riU.enp();
    }

    static /* synthetic */ boolean a(lhz lhz2) {
        return lhz2.aME;
    }

    static /* synthetic */ lbh b(lhz lhz2) {
        return lhz2.kAz;
    }

    static /* synthetic */ double c(lhz lhz2) {
        return lhz2.gCK;
    }

    static {
        lda.by(Out);
    }
}


/*
 * Decompiled with CFR.
 */
public class hnp {
    public static final hbe jzX = hbe.jAM;
    private final lem kOq;
    private final hms kNS;
    private final lbn kOr = new lbn(this){
        final /* synthetic */ hnp kPa;
        {
            this.kPa = hnp2;
        }

        public final void W() {
            lgg lgg2 = hnp.a(this.kPa).aI();
            lhf lhf2 = new lhf(lgg2.cf, lgg2.cg);
            hnp.b(this.kPa).d(lhf2);
        }
    };
    private final lbn kOs = new lbn(this){
        final /* synthetic */ hnp kPa;
        {
            this.kPa = hnp2;
        }

        public final void W() {
            hnp.a(this.kPa, false);
            hnp.b(this.kPa).cri();
        }
    };
    private final lbn kOt = new lbn(this){
        final /* synthetic */ hnp kPa;
        {
            this.kPa = hnp2;
        }

        public final void W() {
            this.kPa.stop();
        }
    };

    public hnp(lbh lbh2, hms hms2) {
        this.kOq = new lem(lbh2);
        this.kNS = hms2;
    }

    public final void b(lhf lhf2, float f2) {
        lgg lgg2 = new lgg(this.kNS.getWidth(), this.kNS.getHeight());
        lgg lgg3 = new lgg(lhf2.rmN, lhf2.H);
        int n = lgg3.W(lgg2);
        float f3 = (float)n * (1.0f / f2);
        if (!this.kOq.isStarted()) {
            this.mU(true);
        }
        this.kOq.a(lgg2, lgg3, f3);
    }

    public final void stop() {
        this.kOq.stop();
        this.mU(false);
        this.kNS.crh();
    }

    public final lhf csF() {
        lgg lgg2 = this.kOq.csu();
        return new lhf(lgg2.cf, lgg2.cg);
    }

    public final boolean isStarted() {
        return this.kOq.isStarted();
    }

    public final void cqs() {
        assert (this.kOq.isStarted());
        this.kOq.cqs();
        assert (!this.kOq.isStarted());
    }

    private void mU(boolean bl) {
        this.kOq.eqf().a(bl, this.kOr);
        this.kOq.cmk().a(bl, this.kOs);
        this.kNS.cql().a(bl, this.kOt);
    }

    static /* synthetic */ lem a(hnp hnp2) {
        return hnp2.kOq;
    }

    static /* synthetic */ hms b(hnp hnp2) {
        return hnp2.kNS;
    }

    static /* synthetic */ void a(hnp hnp2, boolean bl) {
        hnp2.mU(bl);
    }
}


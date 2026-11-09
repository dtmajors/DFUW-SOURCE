/*
 * Decompiled with CFR.
 */
public class hnh {
    public static final hbe jzX = hbe.jAM;
    private final lem kOq;
    private final hms kNS;
    private final lbn kOr = new lbn(this){
        final /* synthetic */ hnh kOu;
        {
            this.kOu = hnh2;
        }

        public final void W() {
            lgg lgg2 = hnh.a(this.kOu).aI();
            hnh.b(this.kOu).z(lgg2);
        }
    };
    private final lbn kOs = new lbn(this){
        final /* synthetic */ hnh kOu;
        {
            this.kOu = hnh2;
        }

        public final void W() {
            hnh.a(this.kOu, false);
            hnh.b(this.kOu).crh();
        }
    };
    private final lbn kOt = new lbn(this){
        final /* synthetic */ hnh kOu;
        {
            this.kOu = hnh2;
        }

        public final void W() {
            this.kOu.stop();
        }
    };

    public hnh(lbh lbh2, hms hms2) {
        this.kOq = new lem(lbh2);
        this.kNS = hms2;
    }

    public final void b(lgg lgg2, float f2) {
        lgg lgg3 = this.kNS.cqw();
        int n = lgg2.W(lgg3);
        float f3 = (float)n * (1.0f / f2);
        if (!this.kOq.isStarted()) {
            this.mU(true);
        }
        this.kOq.a(lgg3, lgg2, f3);
    }

    public final void stop() {
        this.kOq.stop();
        this.mU(false);
        this.kNS.crh();
    }

    public final lgg csu() {
        return this.kOq.csu();
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

    static /* synthetic */ lem a(hnh hnh2) {
        return hnh2.kOq;
    }

    static /* synthetic */ hms b(hnh hnh2) {
        return hnh2.kNS;
    }

    static /* synthetic */ void a(hnh hnh2, boolean bl) {
        hnh2.mU(bl);
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
public class hhs
extends how {
    private final hpa kty;
    private final hhw ktz;
    private final lbn ktA = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hhs ktC;
        {
            this.ktC = hhs2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hhs.a(this.ktC)) {
                throw new AssertionError();
            }
            hhs.b(this.ktC);
        }

        static {
            $assertionsDisabled = !hhs.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;
    private final hek ktB;

    public hhs(hdm hdm2, String string, lgg lgg2, hek hek2) {
        super((hnc)hdm2, string, lgg2, hdm2.jYr.kPU.kLY, hdm2.jYr);
        this.ktB = hek2;
        this.kty = new hpa(this.kLu, (String)null, hdm2.jXk.jVR, hdm2.jXk.jVS, lhu.rnR);
        this.ktz = new hhw(hdm2, null, hdm2.jXk.jVV, hdm2.jXk.jPK, this.cbO().jXo, 0.0f, 10.0f, 5.0f, lcy.qYc);
        this.j(this.ktz);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.cqt().j(this.kty);
        this.Initialized = true;
        this.update();
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

    private void update() {
        this.kty.a(this.ktB.cfA());
        this.kty.a(this.ktB.cfA());
        this.ktz.M(0.0f, this.ktB.cfC());
        this.ktz.cR(this.ktB.Ua());
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    private hen cio() {
        return (hen)this.cqt();
    }

    private void mU(boolean bl) {
        this.ktB.cec().a(bl, this.ktA);
    }

    static /* synthetic */ boolean a(hhs hhs2) {
        return hhs2.Initialized;
    }

    static /* synthetic */ void b(hhs hhs2) {
        hhs2.update();
    }
}


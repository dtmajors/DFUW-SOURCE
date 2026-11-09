/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hhy
extends hhw {
    private final a kum;
    private final hpa kun;
    private final lhz kuo;
    private final lbn kfc = new lbn(this){
        final /* synthetic */ hhy kuq;
        {
            this.kuq = hhy2;
        }

        public final void W() {
            double d2 = hhy.a(this.kuq).esb();
            double d3 = d2 * (double)hhy.b((hhy)this.kuq).kuv;
            d3 = Math.sin(d3);
            d3 = Math.abs(d3);
            float f2 = (float)d3;
            hhy.a(this.kuq, f2);
        }
    };
    private boolean Initialized;
    private boolean kup;

    public hhy(hdm hdm2, String string, lgg lgg2, lhf lhf2, a a2, float f2, float f3, float f4, lip lip2) {
        super(hdm2, string, lgg2, lhf2, a2.kur, f2, f3, f4, lip2);
        this.kum = a2;
        this.kuo = new lhz(hdm2.kAz);
        this.kun = new hpa((hnc)hdm2, (String)null, this.kum.kus, null, this.kum.kuu);
        this.kun.H(lcq.BRIGHT_WHITE_TRANSPARENT);
        this.j(this.kun);
        this.kun.cqG();
    }

    public void nI(boolean bl) {
        if (bl == this.kup) {
            return;
        }
        this.kup = bl;
        this.cmb();
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.nH(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        if (this.kuo.isStarted()) {
            this.kuo.stop();
        }
        this.nH(false);
        super.FG();
        this.Initialized = false;
    }

    protected void cmb() {
        this.kuo.setStarted(this.kup);
        this.jU(this.kup ? 1.0f : 0.0f);
    }

    private void jU(float f2) {
        assert (f2 >= 0.0f && f2 <= 1.0f);
        this.kun.H(new lcq(1.0f, 1.0f, 1.0f, f2));
    }

    private void nH(boolean bl) {
        this.kuo.eqf().a(bl, this.kfc);
    }

    static /* synthetic */ lhz a(hhy hhy2) {
        return hhy2.kuo;
    }

    static /* synthetic */ a b(hhy hhy2) {
        return hhy2.kum;
    }

    static /* synthetic */ void a(hhy hhy2, float f2) {
        hhy2.jU(f2);
    }
}


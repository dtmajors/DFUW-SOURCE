/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hfr
extends how {
    private static final float kjX = 10.0f;
    private static final float kjY = 0.1f;
    private final hpa kjZ;
    private final hpa kka;
    private final lbn kkb = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hfr kkf;
        {
            this.kkf = hfr2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hfr.a(this.kkf)) {
                throw new AssertionError();
            }
        }

        static {
            $assertionsDisabled = !hfr.class.desiredAssertionStatus();
        }
    };
    private final lbn kkc = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hfr kkf;
        {
            this.kkf = hfr2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hfr.a(this.kkf)) {
                throw new AssertionError();
            }
            this.kkf.cin();
        }

        static {
            $assertionsDisabled = !hfr.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;
    private float kkd;
    private static final float kke = (float)Math.PI;

    public hfr(hdm hdm2, String string, lgg lgg2, lhf lhf2) {
        super((hnc)hdm2, string, lgg2, lhf2, hdm2.jYn);
        this.kka = new hpa((hnc)hdm2, (String)null, lgg.rlI, new lhf(hdm2.jXk.jRt.kLY.rmN * 3, hdm2.jXk.jRt.kLY.H), hdm2.jXk.jRt);
        this.j(this.kka);
        this.kjZ = new hpa(this.kLu, (String)null, lgg.rlI, null, hdm2.jXk.jRu);
        this.j(this.kjZ);
        this.cin();
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.nb(true);
        this.Initialized = true;
        this.cin();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.nb(false);
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

    private static final float K(float f2, float f3) {
        assert (f2 >= 0.0f && f2 <= (float)Math.PI * 2);
        assert (f3 >= 0.0f && f3 <= (float)Math.PI * 2);
        if ((double)f3 < 1.5707963705062866 && (double)f2 > 4.71238911151886) {
            f3 += (float)Math.PI * 2;
        } else if ((double)f2 < 1.5707963705062866 && (double)f3 > 4.71238911151886) {
            f3 -= (float)Math.PI * 2;
        }
        return f2 - f3;
    }

    private static final float jQ(float f2) {
        if ((f2 %= (float)Math.PI * 2) < 0.0f) {
            f2 += (float)Math.PI * 2;
        }
        assert (f2 >= 0.0f && f2 <= (float)Math.PI * 2);
        return f2;
    }

    protected final void cin() {
        float f2 = this.cbP().kck.getRotation().getY();
        assert (f2 >= (float)(-Math.PI) && f2 < (float)Math.PI);
        assert ((f2 += (float)Math.PI) >= 0.0f && f2 <= (float)Math.PI * 2);
        float f3 = hfr.K(this.kkd, f2) / 10.0f;
        if (f3 > 0.1f) {
            f3 = 0.1f;
        } else if (f3 < -0.1f) {
            f3 = -0.1f;
        }
        this.kkd -= f3;
        this.kkd = hfr.jQ(this.kkd);
        float f4 = this.kkd / ((float)Math.PI * 2);
        assert (f4 >= 0.0f && f4 <= 1.0f);
        int n = (int)((float)this.cbO().jXk.jRt.kLY.rmN * f4);
        this.kka.cB(-(n += this.cbO().jXk.jRt.kLY.rmN - this.cbO().jXk.jRt.kLY.rmN / 8), 0);
    }

    private hen cio() {
        return (hen)this.cqt();
    }

    private void nb(boolean bl) {
        this.cbP().kck.cnb().a(bl, this.kkb);
        this.kLu.kAz.eme().a(bl, this.kkc);
    }

    static /* synthetic */ boolean a(hfr hfr2) {
        return hfr2.Initialized;
    }
}


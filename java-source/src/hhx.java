/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hhx
extends hmt {
    private final hhv kug;
    private final hmr jEN = new hmr(null);
    private final a kuh;
    private final lbn jEL = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hhx kui;
        {
            this.kui = hhx2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hhx.a(this.kui)) {
                throw new AssertionError();
            }
            hhx.b(this.kui);
        }

        static {
            $assertionsDisabled = !hhx.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;
    private boolean aME;
    private double aXq;
    private double dBo;
    private double dBp;

    public hhx(hdm hdm2, String string, lgg lgg2, lhf lhf2, a a2, double d2, double d3, double d4, lip lip2) {
        super((hnc)hdm2, string, lgg2, lhf2);
        this.kuh = a2;
        this.aXq = d2;
        this.dBo = d3;
        this.dBp = d4;
        this.kug = new hhv(hdm2, null, lgg.rlI, lhf2, a2.kuj, (float)this.aXq, (float)this.dBp, 0.0f, lip2);
        this.j(this.kug);
    }

    public final double Ay() {
        assert (this.Initialized);
        return this.aXq;
    }

    public final boolean a(double d2, double d3, double d4) {
        assert (this.Initialized);
        if (d2 == this.aXq && d4 == this.dBp) {
            return false;
        }
        this.aXq = d2;
        this.dBo = d3;
        this.dBp = d4;
        this.kug.M((float)this.aXq, (float)this.dBp);
        this.update();
        return true;
    }

    public final double cma() {
        assert (this.Initialized);
        return this.dBp;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.nH(true);
        this.update();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        if (this.aME) {
            this.kLu.kAz.eme().a(false, this.jEL);
        }
        this.nH(false);
        super.FG();
        this.Initialized = false;
    }

    private void update() {
        double d2 = this.kLu.kAz.emb();
        this.kug.cR(d2);
        boolean bl = this.dBp != 0.0;
        this.kug.nR(!bl);
        this.jEN.J(d2 < this.dBo ? this.kuh.kuk : this.kuh.kul);
        if (bl != this.aME) {
            this.kLu.kAz.eme().a(bl, this.jEL);
            this.aME = bl;
        }
    }

    private void nH(boolean bl) {
        this.kug.a(bl, this.jEN);
    }

    static /* synthetic */ boolean a(hhx hhx2) {
        return hhx2.Initialized;
    }

    static /* synthetic */ void b(hhx hhx2) {
        hhx2.update();
    }
}


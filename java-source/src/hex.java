/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hex
extends hpv
implements hbw,
hma {
    private final lhz kfV;
    private final lhu[] kfW;
    private static final double kfX = 4.0;
    private final lbn kfY = new lbn(this){
        final /* synthetic */ hex kgc;
        {
            this.kgc = hex2;
        }

        public final void W() {
            double d2 = hex.a(this.kgc).esb() * 4.0;
            boolean bl = false;
            if (d2 > 1.0) {
                hex.a(this.kgc).reset();
                d2 = 1.0;
                bl = true;
            }
            hex.b(this.kgc).H(new lcq(1.0f, 1.0f, 1.0f, (float)d2));
            if (bl) {
                hex.c(this.kgc);
            }
        }
    };
    private boolean Initialized;
    private int kfZ = 0;
    private hpa kga;
    private hpa kgb;

    public hex(hdm hdm2, String string, lgg lgg2, lhf lhf2) {
        super((hnc)hdm2, string, lgg2, lhf2);
        assert (this.cbO().jZG.cpS());
        this.kfV = new lhz(hdm2.kAz);
        this.kfW = new lhu[]{hdm2.jXk.jOT, hdm2.jXk.jOU, hdm2.jXk.jOV, hdm2.jXk.jOW};
        this.kga = this.cgg();
        this.kgb = this.cgg();
        this.kgb.H(lcq.BRIGHT_WHITE_TRANSPARENT);
        this.kfV.start();
    }

    public boolean a(hgy hgy2, boolean bl) {
        return this.cbO().jZo.a(hgy2, bl);
    }

    @Override
    public final void a(hdz hdz2, int n, int n2, lgg lgg2) {
        assert (lda.by(lgg2));
        this.cbO().jZo.b(hdz2, n, n2);
    }

    @Override
    public boolean b(hms hms2) {
        assert (this.Initialized);
        assert (hms2 != null);
        if (hms2 instanceof hgy) {
            return true;
        }
        return hms2 instanceof hcc;
    }

    @Override
    public void cge() {
    }

    @Override
    public void cgf() {
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.kfV.stop();
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    private hpa cgg() {
        int n = this.kfZ++ % this.kfW.length;
        hpa hpa2 = new hpa(this.kLu, (String)null, lgg.rlI, this.cqv(), this.kfW[n]);
        this.j(hpa2);
        return hpa2;
    }

    private void cgh() {
        if (this.kga != null) {
            this.kga.remove();
        }
        this.kga = this.kgb;
        this.kgb = this.cgg();
        this.kgb.H(lcq.BRIGHT_WHITE_TRANSPARENT);
    }

    private void mU(boolean bl) {
        this.kfV.eqf().a(bl, this.kfY);
    }

    static /* synthetic */ lhz a(hex hex2) {
        return hex2.kfV;
    }

    static /* synthetic */ hpa b(hex hex2) {
        return hex2.kgb;
    }

    static /* synthetic */ void c(hex hex2) {
        hex2.cgh();
    }
}


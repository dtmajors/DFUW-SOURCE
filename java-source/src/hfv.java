/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hfv
extends hmt {
    private final lbp khJ = new lbp(this){
        final /* synthetic */ hfv klc;
        {
            this.klc = hfv2;
        }

        public final boolean caU() {
            hfv.a(this.klc);
            return true;
        }
    };
    private final lbp kkZ = new lbp(this){
        final /* synthetic */ hfv klc;
        {
            this.klc = hfv2;
        }

        public final boolean caU() {
            hfv.b(this.klc);
            return true;
        }
    };
    private final lbn kaB;
    private final hpf kla;
    private boolean Initialized;
    private final lip klb;

    public hfv(hdm hdm2, String string, lgg lgg2, lhf lhf2, lip lip2, lbn lbn2) {
        super((hnc)hdm2, string, lgg.rlI, hdm2.crU().cqv());
        this.klb = lip2;
        this.kaB = lbn2;
        lgg2 = this.a((hms)hdm2.crU(), lgg2);
        this.kla = new hpf((hnc)hdm2, null, lgg2, lhf2, hdm2.kJS, 100);
        this.kla.kiG.mN(lip2.esy());
        this.j(this.kla);
        this.p(this.kla);
    }

    public final String chz() {
        return this.kla.kiG.chz();
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cbM() {
        assert (this.Initialized);
        if (!this.kla.cqH()) {
            this.ciu();
            return;
        }
        super.cbM();
    }

    private void cit() {
        this.kla.kiG.mN(this.klb.esy());
        this.kaB.W();
    }

    private void ciu() {
        this.kaB.W();
    }

    private void mU(boolean bl) {
        this.a(bl, this.khJ, 27, jpn.nLm);
        this.a(bl, this.kkZ, 13, jpn.nLm);
    }

    static /* synthetic */ void a(hfv hfv2) {
        hfv2.cit();
    }

    static /* synthetic */ void b(hfv hfv2) {
        hfv2.ciu();
    }
}


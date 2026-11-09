/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.List;

public class hgx
extends hgr {
    private final lia kpn;
    private final lia kpo;
    public final alu kpp;
    private boolean Initialized;
    private double kpq;
    private double kpr;
    private lib kps;
    private final lbn kpt = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hgx kpw;
        {
            this.kpw = hgx2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hgx.a(this.kpw)) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && !hgx.b(this.kpw).isStarted()) {
                throw new AssertionError();
            }
            double d2 = hgx.c(this.kpw);
            double d3 = hgx.b(this.kpw).esb();
            if (!($assertionsDisabled || d3 >= 0.0 && d3 <= d2)) {
                throw new AssertionError((Object)(d3 + ", " + d2));
            }
            double d4 = d3 / d2;
            if (!($assertionsDisabled || d4 >= 0.0 && d4 <= 1.0)) {
                throw new AssertionError(d4);
            }
            this.kpw.H(new lcq(1.0f, 1.0f, 1.0f, (float)d4));
        }

        static {
            $assertionsDisabled = !hgx.class.desiredAssertionStatus();
        }
    };
    private final lbn kpu = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hgx kpw;
        {
            this.kpw = hgx2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hgx.a(this.kpw)) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && !hgx.d(this.kpw).isStarted()) {
                throw new AssertionError();
            }
            double d2 = hgx.e(this.kpw);
            double d3 = hgx.d(this.kpw).esb();
            if (!($assertionsDisabled || d3 >= 0.0 && d3 <= d2)) {
                throw new AssertionError((Object)(d3 + ", " + d2));
            }
            double d4 = 1.0 - d3 / d2;
            if (!($assertionsDisabled || d4 >= 0.0 && d4 <= 1.0)) {
                throw new AssertionError(d4);
            }
            this.kpw.H(new lcq(1.0f, 1.0f, 1.0f, (float)d4));
        }

        static {
            $assertionsDisabled = !hgx.class.desiredAssertionStatus();
        }
    };
    private final lbn kpv = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hgx kpw;
        {
            this.kpw = hgx2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hgx.a(this.kpw)) {
                throw new AssertionError();
            }
            if (hgx.b(this.kpw).isStarted()) {
                hgx.b(this.kpw).stop();
            }
            if (hgx.d(this.kpw).isStarted()) {
                hgx.d(this.kpw).stop();
            }
            double d2 = this.kpw.kLu.kAz.emb();
            hgx.a(this.kpw, this.kpw.kpp.Ep() - d2);
            if (hgx.e(this.kpw) > 0.0) {
                hgx.d(this.kpw).ee(hgx.e(this.kpw));
            }
        }

        static {
            $assertionsDisabled = !hgx.class.desiredAssertionStatus();
        }
    };

    protected hgx(hdm hdm2, String string, lgg lgg2, alu alu2) {
        this(hdm2, string, lgg2, alu2, alu2.Eq());
    }

    private hgx(hdm hdm2, String string, lgg lgg2, alu alu2, lhu lhu2) {
        super(hdm2, string, lgg2, null, lhu2, new lgs(lgg.rlI, lhu2.kLY), false);
        assert (alu2.Em() <= this.kLu.kAz.emb());
        assert (alu2.Ep() >= this.kLu.kAz.emb());
        this.kpp = alu2;
        this.kpn = new lia(this.kLu.kAz);
        this.kpo = new lia(this.kLu.kAz);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        double d2 = this.kLu.kAz.emb();
        double d3 = this.kpp.Em();
        this.cbO().jXk.getClass();
        this.kpq = d3 + 1.0 - d2;
        if (this.kpq >= 0.0) {
            this.kpn.ee(this.kpq);
        }
        this.kps = new lib(this.kLu.kNg, false);
        double d4 = this.kpp.Ep();
        this.cbO().jXk.getClass();
        double d5 = d4 - 3.0 - d2;
        this.kps.ee(d5);
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        if (this.kps.isStarted()) {
            this.kps.stop();
        }
        this.kps = null;
        if (this.kpn.isStarted()) {
            this.kpn.stop();
        }
        if (this.kpo.isStarted()) {
            this.kpo.stop();
        }
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void aV(List<hnt> list) {
        list.add(new hnt(this.cbO().kKo, this.kpp.Er().esy()));
        super.aV(list);
    }

    private void mU(boolean bl) {
        this.kpn.eqf().a(bl, this.kpt);
        this.kpo.eqf().a(bl, this.kpu);
        this.kps.esg().a(bl, this.kpv);
    }

    static /* synthetic */ boolean a(hgx hgx2) {
        return hgx2.Initialized;
    }

    static /* synthetic */ lia b(hgx hgx2) {
        return hgx2.kpn;
    }

    static /* synthetic */ double c(hgx hgx2) {
        return hgx2.kpq;
    }

    static /* synthetic */ lia d(hgx hgx2) {
        return hgx2.kpo;
    }

    static /* synthetic */ double e(hgx hgx2) {
        return hgx2.kpr;
    }

    static /* synthetic */ double a(hgx hgx2, double d2) {
        hgx2.kpr = d2;
        return hgx2.kpr;
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcw
 */
public class hhh
extends hhf {
    private final lhz kqU;
    private final hpa kqV;
    private final lbn kfc = new lbn(this){
        final /* synthetic */ hhh kqW;
        {
            this.kqW = hhh2;
        }

        public final void W() {
            hhh.a(this.kqW);
        }
    };
    private boolean Initialized;

    public hhh(hdm hdm2, String string, float f2, lbf<lhu> lbf2) {
        super(hdm2, string, new ljp(lcw.fyl.x, lcw.fyl.rlV), new ljp(lcw.fym.x, lcw.fym.rlV), f2, lbf2, true, hdm2.jZL.ccL());
        this.kqU = new lhz(hdm2.kAz);
        this.kqV = new hpa(this.kLu, (String)null, lgg.rlI, null, hdm2.jXk.jRq);
        this.j(this.kqV);
        this.kqU.start();
        this.cle();
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        this.kqU.stop();
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cfS() {
        super.cfS();
        if (this.clb()) {
            this.cle();
        }
    }

    @Override
    protected void cko() {
        super.cko();
        if (this.clb()) {
            this.cle();
        }
    }

    @Override
    protected void ckP() {
        super.ckP();
        this.cle();
    }

    @Override
    protected int a(ldb ldb2, ldd ldd2, int n) {
        assert (this.Initialized);
        if (ldd2 == ldd.res) {
            return n;
        }
        return super.a(ldb2, ldd2, n);
    }

    @Override
    protected int a(ldb ldb2) {
        return 16;
    }

    @Override
    protected void ckm() {
        this.cle();
    }

    private void cle() {
        ljq ljq2 = this.cbP().kck.av();
        ljp ljp2 = new ljp(ljq2.x, ljq2.rlV);
        lgg lgg2 = this.q(ljp2);
        this.kqV.cB(lgg2.cf - this.cbO().jXk.jRq.kLY.rmN / 2, lgg2.cg - this.cbO().jXk.jRq.kLY.H / 2);
    }

    private void clf() {
        if (this.cbP().kcc.ccH().getValue()) {
            return;
        }
        double d2 = this.kqU.esb();
        this.cbO().jXk.getClass();
        double d3 = d2 * 5.0;
        d3 = Math.sin(d3);
        d3 = Math.abs(d3);
        float f2 = (float)d3;
        f2 = Math.min(f2 * 1.5f, 1.0f);
        assert (f2 >= 0.0f && f2 <= 1.0f);
        this.kqV.H(new lcq(1.0f, 1.0f, 1.0f, f2));
    }

    private void mU(boolean bl) {
        this.kqU.eqf().a(bl, this.kfc);
    }

    static /* synthetic */ void a(hhh hhh2) {
        hhh2.clf();
    }
}


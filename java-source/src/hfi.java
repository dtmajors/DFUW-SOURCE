/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
public class hfi
extends hog {
    public final hhx khI;
    private final lbp khJ;
    private final hpx khK;
    private boolean Initialized;

    public hfi(hdm hdm2, String string, lip lip2, lbn lbn2) {
        this(hdm2, string, lgg.rlI, hdm2.jXk.jTP, hdm2.krh, lip2, lbn2);
    }

    private hfi(hdm hdm2, String string, lgg lgg2, lhf lhf2, hog.a a2, lip lip2, lbn lbn2) {
        super((hnc)hdm2, string, lgg2, lhf2, a2);
        this.ctY();
        this.khJ = new a(lbn2);
        int n = hdm2.jXk.jTQ.cf;
        int n2 = hdm2.jXk.jTQ.cg;
        this.khI = new hhx(hdm2, null, new lgg(n, n2), new lhf(lhf2.rmN - hdm2.jXk.jTQ.cf * 2, hdm2.jXk.jQG.H), this.cbO().jXx, 0.0, 0.0, 0.0, lip2);
        this.j(this.khI);
        n2 += this.khI.getHeight();
        hdm2.jXk.getClass();
        this.khK = new hqy(this.kLu, null, new lgg((this.getWidth() - hdm2.jXk.jTS.rmN) / 2, n2 += 10), hdm2.jXk.jTS, hpx.a.kXm, this.cbO().kJK, lcy.qUX.esy());
        this.khK.cvC().a(true, lbn2);
        this.j(this.khK);
        n2 += this.khK.getHeight();
        this.Nh(n2 += hdm2.jXk.jTQ.cg);
    }

    public final void i(double d2, double d3) {
        this.khI.a(d2, d2, d3);
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
        super.FG();
        this.Initialized = false;
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    private void mU(boolean bl) {
        this.a(bl, this.khJ, 27, jpn.nLm);
    }
}


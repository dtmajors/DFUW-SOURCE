/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.Set;

public class hco
extends hoa
implements hru.a {
    private static final boolean jHb = false;
    private static final lhf jGE = new lhf(4, 4);
    private static final lhf jBh = new lhf(90, 28);
    private static final int jHc = 400;
    private final a jHd;
    private final hqr jHe;
    public final hfh jHf;
    private final hqy jHg;
    private final hqy jHh;
    private final hqy jHi;
    private final hqy jHj;
    private final hru jHk;
    private final hpa jHl;
    private final String jHm;
    private final lbn jHn = new lbn(this){
        final /* synthetic */ hco jHv;
        {
            this.jHv = hco2;
        }

        public final void W() {
            this.jHv.md(hco.a(this.jHv));
        }
    };
    private final lbn jHo = new lbn(this){
        final /* synthetic */ hco jHv;
        {
            this.jHv = hco2;
        }

        public final void W() {
        }
    };
    private final lbn jHp = new lbn(this){
        final /* synthetic */ hco jHv;
        {
            this.jHv = hco2;
        }

        public final void W() {
        }
    };
    private final lbn jHq = new lbn(this){
        final /* synthetic */ hco jHv;
        {
            this.jHv = hco2;
        }

        public final void W() {
            hco.b(this.jHv).cdv();
        }
    };
    private final hly jHr = new hly(this){
        final /* synthetic */ hco jHv;
        {
            this.jHv = hco2;
        }

        public final void e(char c2) {
            hco.c(this.jHv).c(c2);
        }
    };
    private final lbp jAY = new lbp(this){
        final /* synthetic */ hco jHv;
        {
            this.jHv = hco2;
        }

        public final boolean caU() {
            hen hen2 = (hen)this.jHv.cqt();
            hen2.csQ();
            return true;
        }
    };
    private final lbp jHs = new lbp(this){
        final /* synthetic */ hco jHv;
        {
            this.jHv = hco2;
        }

        public final boolean caU() {
            this.jHv.jHf.cha();
            return true;
        }
    };
    private final lbp jHt = new lbp(this){
        final /* synthetic */ hco jHv;
        {
            this.jHv = hco2;
        }

        public final boolean caU() {
            this.jHv.jHf.chb();
            return true;
        }
    };
    private final lbp jHu = new lbp(this){
        final /* synthetic */ hco jHv;
        {
            this.jHv = hco2;
        }

        public final boolean caU() {
            this.jHv.jHf.chc();
            return true;
        }
    };
    private boolean Initialized;

    public hco(hdm hdm2, String string, lgg lgg2, lhf lhf2, a a2, hru hru2, ldv ldv2, String string2) {
        super((hnc)hdm2, string, lgg2, lhf2, a2.jHw);
        hru2.a(this);
        this.jHd = a2;
        this.jHk = hru2;
        this.jHm = string2;
        this.jHk.md(this.jHm);
        this.jHl = new hpa((hnc)hdm2, (String)null, lgg.rlI, lhf2, a2.jHx.kPU);
        this.jHl.H(a2.jHx.ktY);
        this.j(this.jHl);
        int n = hco.jGE.rmN;
        int n2 = hco.jGE.H;
        this.jHj = null;
        this.jHi = null;
        this.jHh = null;
        this.jHg = null;
        this.jHe = new hqr(this.kLu, (String)null, new lgg(n, n2), lhf.rnv, this.jHd.jGK);
        this.j(this.jHe);
        n2 += this.jHe.getHeight();
        n2 += hco.jGE.H;
        this.jHf = new hfh(hdm2, null, lgg.rlI, new lhf(398, 398), a2.jHy, hru2, ldv2);
        this.jHe.cwt().cqd().a(this.jHf);
    }

    public final void md(String string) {
        this.jHk.md(string);
        for (ldb ldb2 : ldb.values()) {
            this.jHe.cwt().cqd().a(ldb2, hnj.kOy, ldd.rer, 1);
        }
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
        this.ccg();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        super.cce();
        this.ccg();
    }

    @Override
    protected boolean LM(int n) {
        return this.jHe.Nj(n);
    }

    @Override
    protected boolean a(int n, boolean bl, Set<jpn> set) {
        if (super.a(n, bl, set)) {
            return true;
        }
        return this.jHf.b(n, bl, set);
    }

    @Override
    protected boolean LN(int n) {
        return this.jHf.Ni(n);
    }

    @Override
    protected void ccf() {
        assert (this.Initialized);
        super.ccf();
        boolean bl = this.isFocusOwner();
        this.kLu.a(bl, this.jHr);
        this.jHf.mZ(bl);
    }

    private boolean ccg() {
        this.jHl.cC(this.getWidth(), this.getHeight());
        int n = this.getHeight() - hco.jGE.H * 2;
        this.jHe.cC(this.getWidth() - hco.jGE.rmN * 2, n);
        int n2 = this.jHe.cwt().cqd().cpJ().rmN;
        int n3 = this.jHe.cwt().cqd().cpJ().H;
        if (n2 < 400) {
            n2 = 400;
        }
        return true;
    }

    private hdm cbO() {
        return (hdm)this.kLu;
    }

    private void mU(boolean bl) {
        this.a(bl, this.jAY, 27, jpn.nLm);
    }

    @Override
    public void LO(int n) {
        ldd ldd2 = n > 0 ? ldd.rer : ldd.ret;
        int n2 = Math.abs(n) * this.kLu.csb();
        this.jHe.cwt().cqd().a(ldb.rep, hnj.kOw, ldd2, n2);
    }

    static /* synthetic */ String a(hco hco2) {
        return hco2.jHm;
    }

    static /* synthetic */ hdm b(hco hco2) {
        return hco2.cbO();
    }

    static /* synthetic */ hru c(hco hco2) {
        return hco2.jHk;
    }
}


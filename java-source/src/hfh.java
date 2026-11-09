/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.Set;

public class hfh
extends hpw {
    private final hry khD;
    private final hru jHk;
    private final lbn khE = new lbn(this){
        final /* synthetic */ hfh khG;
        {
            this.khG = hfh2;
        }

        public final void W() {
            this.khG.d(hfh.a(this.khG).cbI());
        }
    };
    private boolean Initialized;
    private boolean khF;

    @Override
    protected int a(ldb ldb2, int n) {
        return 0;
    }

    public hfh(hdm hdm2, String string, lgg lgg2, lhf lhf2, a a2, hru hru2, ldv ldv2) {
        super((hnc)hdm2, string, lgg2, lhf2, a2.khH);
        this.jHk = hru2;
        this.khD = new hry((hsh)hdm2, (String)null, lgg.rlI, lhf2, ldv2);
        this.j(this.khD);
    }

    @Override
    protected int a(ldb ldb2) {
        return 16;
    }

    public final void nq(boolean bl) {
        if (bl == this.khF) {
            return;
        }
        this.khF = bl;
        if (!this.khF) {
            this.chf();
        }
    }

    public final void mZ(boolean bl) {
        this.jHk.mZ(bl);
    }

    public final void cha() {
        jpp jpp2 = new jpp(768, 0, 0, 0, 0);
        this.jHk.a(jpp2);
    }

    public final void chb() {
        jpp jpp2 = new jpp(769, 0, 0, 0, 0);
        this.jHk.a(jpp2);
    }

    public final void chc() {
        jpp jpp2 = new jpp(770, 0, 0, 0, 0);
        this.jHk.a(jpp2);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.cc(true);
        this.chf();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.cc(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void chd() {
        assert (this.Initialized);
        super.chd();
        if (!this.khF) {
            this.chf();
        }
    }

    @Override
    protected boolean LM(int n) {
        if (this.che()) {
            return true;
        }
        this.jHk.a(this.cqu(), n);
        return true;
    }

    @Override
    protected void cbu() {
        assert (this.Initialized);
        if (this.che()) {
            return;
        }
        this.jHk.g(this.cqu());
    }

    @Override
    protected void cbM() {
        assert (this.Initialized);
        if (this.che()) {
            return;
        }
        if (this.kLu.csd()) {
            this.jHk.e(this.cqu());
        } else {
            this.jHk.e(this.cqu());
        }
    }

    @Override
    protected void cbv() {
        assert (this.Initialized);
        if (this.che()) {
            return;
        }
        this.jHk.f(this.cqu());
    }

    @Override
    protected boolean a(int n, boolean bl, Set<jpn> set) {
        assert (this.Initialized);
        assert (lda.by(set));
        if (this.che()) {
            return true;
        }
        this.jHk.a(this.cqu(), n, bl);
        return true;
    }

    @Override
    protected boolean LN(int n) {
        assert (this.Initialized);
        if (this.che()) {
            return true;
        }
        this.jHk.b(this.cqu(), n);
        return true;
    }

    @Override
    protected void cce() {
        super.cce();
    }

    @Override
    protected lcu cfR() {
        assert (this.Initialized);
        int n = this.jHk.getCursorType();
        switch (n) {
            case 0: {
                return this.kLu.kNj;
            }
            case 1: {
                return this.kLu.kNl;
            }
            case 2: {
                return this.kLu.kNx;
            }
            case 3: {
                return this.kLu.kNy;
            }
        }
        return this.kLu.kNj;
    }

    private boolean che() {
        jpp jpp2 = this.cbO().cxn();
        if (jpp2 == null) {
            return false;
        }
        if (jpp2.nNJ >= 512 && jpp2.nNJ <= 522) {
            lgg lgg2 = new lgg(jpp2.nNL & 0xFFFF, jpp2.nNL >> 16);
            lgg2 = this.x(lgg2);
            jpp2 = new jpp(jpp2.nNJ, jpp2.nNK, lgg2.cf | lgg2.cg << 16, lgg2.cf, lgg2.cg);
        }
        this.jHk.a(jpp2);
        return true;
    }

    private void chf() {
        lgs lgs2 = this.i(this.cqU());
        lgs lgs3 = new lgs(lgg.rlI, this.jHk.cbI());
        lgs lgs4 = this.i(lgs3);
        lhf lhf2 = this.kLu.kND.cqv();
        if (lgs2.cf == 0 && lgs4.cf < 0) {
            lgs2.cf += lgs4.cf;
            lgs2.rmN -= lgs4.cf;
        }
        if (lgs2.cg == 0 && lgs4.cg < 0) {
            lgs2.cg += lgs4.cg;
            lgs2.H -= lgs4.cg;
        }
        if (lgs2.cf + lgs2.rmN == lhf2.rmN && lgs4.cf + lgs4.rmN > lhf2.rmN) {
            lgs2.rmN = this.cqt().cqv().rmN;
        }
        if (lgs2.cg + lgs2.H == lhf2.H && lgs4.cg + lgs4.H > lhf2.H) {
            lgs2.H = this.cqt().cqv().H;
        }
        lgs2 = this.h(lgs2);
        lgs2 = lgs2.w(lgs3);
        this.khD.j(lgs2);
        lgs lgs5 = this.cqt().cqU();
        lgs5.cf = lgs2.cf;
        lgs5.cg = lgs2.cg;
        this.jHk.c(lgs5);
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    private void cc(boolean bl) {
        this.jHk.cbF().a(bl, this.khE);
    }

    static /* synthetic */ hru a(hfh hfh2) {
        return hfh2.jHk;
    }
}


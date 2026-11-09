/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Set;

public abstract class hms {
    public static final hbe jzX = hbe.jAM;
    public final hnc kLu;
    private final ldl kLJ = new ldl();
    private final ldl kLK = new ldl();
    private final ldl kLL = new ldl();
    private final ldl kLM = new ldl();
    private final ldl kLN = new ldl();
    private final ldl kLO = new ldl();
    private final ldl kLP = new ldl();
    private final lgs kLQ = new lgs();
    private final lbn kLR = new lbn(this){
        final /* synthetic */ hms kMf;
        {
            this.kMf = hms2;
        }

        public final void W() {
            if (!hms.h(this.kMf)) {
                return;
            }
            hms.i(this.kMf);
        }
    };
    public String jLK;
    private boolean Initialized;
    private hmt kLS;
    private a kLT = a.kMi;
    private boolean kLU;
    private hnh kLV;
    private boolean kLW;
    private lgg kLX;
    private lhf kLY;
    private hnd kLZ;
    private boolean kMa;
    private boolean kMb;
    private boolean kMc;
    private boolean kMd;
    private boolean kMe = true;

    public hms(hnc hnc2, String string, lgg lgg2, lhf lhf2) {
        assert (hnc2 != null);
        assert (lgg2 != null);
        assert (lhf2 != null);
        this.kLu = hnc2;
        this.jLK = string;
        this.kLX = lgg2;
        this.kLY = lhf2;
    }

    public final void remove() {
        hmt hmt2;
        assert (this.Initialized);
        if (this.isInitialized()) {
            this.cleanup();
        }
        if ((hmt2 = this.cqt()) != null) {
            hmt2.a(this, true);
        }
    }

    public final void a(a a2) {
        if (a2 == this.kLT) {
            return;
        }
        this.kLT = a2;
        this.nT(false);
    }

    public final a cqk() {
        return this.kLT;
    }

    public final void bc(List<lfg> list) {
        this.bd(list);
    }

    public final boolean isInitialized() {
        return this.Initialized;
    }

    protected final void b(hmt hmt2) {
        assert (hmt2 != this);
        assert (hmt2 == null || !hmt2.isInitialized() || !hmt2.o(this));
        if (hmt2 == this.kLS) {
            return;
        }
        this.kLS = hmt2;
        if (this.Initialized) {
            this.cqY();
        }
    }

    protected final void initialize() {
        assert (!this.Initialized);
        assert (!this.kMb) : this.getClass().getName();
        this.FF();
        assert (this.kMb) : this.getClass().getName();
        this.kMb = false;
        if (!this.kLW && this.cqH()) {
            this.crj();
        }
    }

    protected final void cleanup() {
        assert (this.Initialized);
        if (this.kLV != null) {
            assert (this.kLV.isStarted());
            this.kLV.cqs();
            assert (this.kLV == null);
        }
        if (this.kLW) {
            this.crk();
        }
        assert (!this.kMc) : this.getClass().getName();
        this.FG();
        assert (this.kMc) : this.getClass().getName();
        this.kMc = false;
        if (this.kLZ != null) {
            this.kLZ.cleanup();
        }
        assert (this.kLJ.isEmpty());
        assert (this.kLK.isEmpty());
        assert (this.kLL.isEmpty());
        assert (this.kLM.isEmpty());
        assert (this.kLN.isEmpty());
        assert (this.kLO.isEmpty());
    }

    public final lbl<lbn> cql() {
        return this.kLJ;
    }

    public final lbl<lbn> cqm() {
        return this.kLK;
    }

    public final lbl<lbn> cqn() {
        return this.kLL;
    }

    public final lbl<lbn> cqo() {
        return this.kLM;
    }

    public final lbl<lbn> cqp() {
        return this.kLP;
    }

    public final lbl<lbn> cqq() {
        return this.kLN;
    }

    public final lbl<lbn> cqr() {
        return this.kLO;
    }

    public final boolean Ow() {
        assert (this.Initialized);
        return this.kLV != null;
    }

    public final void cqs() {
        assert (this.Initialized);
        assert (this.kLV != null);
        this.kLV.cqs();
    }

    public final int d(ldb ldb2, int n) {
        if (this.kLS != null) {
            n = this.kLS.d(ldb2, n);
        }
        return n -= this.kLX.r(ldb2);
    }

    public final lgg x(lgg lgg2) {
        return new lgg(this.d(ldb.reo, lgg2.cf), this.d(ldb.rep, lgg2.cg));
    }

    public final lgs h(lgs lgs2) {
        return new lgs(this.d(ldb.reo, lgs2.cf), this.d(ldb.rep, lgs2.cg), lgs2.rmN, lgs2.H);
    }

    public final int e(ldb ldb2, int n) {
        n += this.kLX.r(ldb2);
        if (this.kLS != null) {
            n = this.kLS.e(ldb2, n);
        }
        return n;
    }

    public final lgg y(lgg lgg2) {
        return new lgg(this.e(ldb.reo, lgg2.cf), this.e(ldb.rep, lgg2.cg));
    }

    public final lgs i(lgs lgs2) {
        return new lgs(this.e(ldb.reo, lgs2.cf), this.e(ldb.rep, lgs2.cg), lgs2.rmN, lgs2.H);
    }

    public final hmt cqt() {
        return this.kLS;
    }

    public final lgg cqu() {
        lgg lgg2 = this.kLu.cqu();
        lgg2 = this.x(lgg2);
        return lgg2;
    }

    public final lhf cqv() {
        return this.kLY;
    }

    public final lgg cqw() {
        return this.kLX;
    }

    public final int cqx() {
        return this.kLX.cf;
    }

    public final int cqy() {
        return this.kLX.cg;
    }

    public final int d(ldb ldb2) {
        return this.kLX.r(ldb2);
    }

    public final boolean z(lgg lgg2) {
        return this.cB(lgg2.cf, lgg2.cg);
    }

    public final boolean cB(int n, int n2) {
        return this.h(n, n2, this.kLY.rmN, this.kLY.H);
    }

    public final boolean Ne(int n) {
        return this.h(n, this.kLX.cg, this.kLY.rmN, this.kLY.H);
    }

    public final boolean Nf(int n) {
        return this.h(this.kLX.cf, n, this.kLY.rmN, this.kLY.H);
    }

    public final boolean d(lhf lhf2) {
        return this.cC(lhf2.rmN, lhf2.H);
    }

    public final boolean cC(int n, int n2) {
        return this.h(this.kLX.cf, this.kLX.cg, n, n2);
    }

    public final boolean Ng(int n) {
        return this.h(this.kLX.cf, this.kLX.cg, n, this.kLY.H);
    }

    public final boolean Nh(int n) {
        return this.h(this.kLX.cf, this.kLX.cg, this.kLY.rmN, n);
    }

    public final void cqz() {
        this.cfS();
    }

    public final boolean h(int n, int n2, int n3, int n4) {
        if (n3 < 0 || n4 < 0) {
            lfn.b(5, "SFComponent", "setRectangleInParent: W: " + n3 + " H: " + n4);
            n3 = Math.max(n3, 0);
            n4 = Math.max(n4, 0);
        }
        boolean bl = false;
        boolean bl2 = false;
        if (n != this.kLX.cf || n2 != this.kLX.cg) {
            this.kLX = new lgg(n, n2);
            bl = true;
        }
        if (n3 != this.kLY.rmN || n4 != this.kLY.H) {
            lhf lhf2 = new lhf(n3, n4);
            if (this.Initialized) {
                lhf2 = this.b(lhf2);
            }
            if (!lhf2.r(this.kLY)) {
                this.kLY = lhf2;
                bl2 = true;
            }
        }
        boolean bl3 = false;
        if (bl || bl2) {
            bl3 = this.crg();
        }
        if (this.Initialized) {
            if (bl3) {
                this.chd();
            }
            if (bl) {
                this.cfS();
            }
            if (bl2) {
                this.cce();
            }
        }
        return bl || bl2;
    }

    public final boolean j(lgs lgs2) {
        return this.h(lgs2.cf, lgs2.cg, lgs2.rmN, lgs2.H);
    }

    public final void b(int n, int n2, float f2) {
        this.a(new lgg(n, n2), f2);
    }

    public final void a(ldb ldb2, int n, float f2) {
        int n2 = this.cqA().r(ldb2.eni());
        lgg lgg2 = new lgg(ldb2, n, n2);
        this.a(lgg2, f2);
    }

    public final boolean a(lgg lgg2, float f2) {
        assert (this.Initialized);
        assert (lgg2 != null);
        if (ldq.ai(f2, 0.0f)) {
            this.z(lgg2);
        } else if (this.kLV == null) {
            if (lgg2.T(this.kLX)) {
                return false;
            }
            this.kLV = new hnh(this.kLu.kAz, this);
            this.kLV.b(lgg2, f2);
        } else {
            assert (this.kLV.isStarted());
            if (lgg2.T(this.kLX)) {
                this.kLV.stop();
                return false;
            }
            if (lgg2.T(this.kLV.csu())) {
                return false;
            }
            this.kLV.b(lgg2, f2);
        }
        return true;
    }

    public final lgg cqA() {
        if (this.kLV == null) {
            return this.cqw();
        }
        return this.kLV.csu();
    }

    public final boolean a(lhf lhf2, float f2) {
        assert (this.Initialized);
        lgg lgg2 = new lgg(this.kLX.cf + lhf2.rmN, this.kLX.cg + lhf2.H);
        return this.a(lgg2, f2);
    }

    public final boolean cqB() {
        assert (this.Initialized);
        return this.kLU;
    }

    public final boolean nR(boolean bl) {
        if (bl == this.kLU) {
            return false;
        }
        this.kLU = bl;
        if (this.Initialized) {
            this.crf();
        }
        return true;
    }

    public final boolean cqC() {
        return this.kMe;
    }

    public final int getWidth() {
        return this.kLY.rmN;
    }

    public final int getHeight() {
        return this.kLY.H;
    }

    public final lgs cqD() {
        return new lgs(this.kLX, this.kLY);
    }

    public final lgs cqE() {
        return new lgs(0, 0, this.kLY.rmN, this.kLY.H);
    }

    public final int e(ldb ldb2) {
        return this.kLY.e(ldb2);
    }

    public final void cqF() {
        assert (this.kLS != null);
        this.kLS.k(this);
    }

    public final void cqG() {
        assert (this.kLS != null);
        this.kLS.l(this);
    }

    public final boolean A(lgg lgg2) {
        return this.contains(lgg2.cf, lgg2.cg);
    }

    public final boolean contains(int n, int n2) {
        assert (this.Initialized);
        if (!this.kMe) {
            return false;
        }
        return this.co(n, n2);
    }

    public final boolean cqH() {
        return this.A(this.cqu());
    }

    public final boolean b(int n, boolean bl, Set<jpn> set) {
        assert (this.Initialized);
        return this.a(n, bl, set);
    }

    public final boolean Ni(int n) {
        assert (this.Initialized);
        return this.LN(n);
    }

    public final void cqI() {
        assert (this.Initialized);
        if (!this.kLW && this.cqH()) {
            this.crj();
        }
        this.cbu();
    }

    public final lcu cqJ() {
        assert (this.Initialized);
        return this.cfR();
    }

    public final void cqK() {
        assert (this.Initialized);
        this.cbM();
    }

    public final void cqL() {
        assert (this.Initialized);
        this.cbv();
    }

    public final boolean Nj(int n) {
        assert (this.Initialized);
        return this.LM(n);
    }

    public final void cqM() {
        assert (this.Initialized);
        this.ccc();
    }

    public final void cqN() {
        assert (this.Initialized);
        this.cdC();
    }

    public final void c(hmt hmt2) {
        assert (this.Initialized);
        assert (hmt2 != this);
        assert (hmt2 != null);
        assert (this.kLS != null);
        if (hmt2 == this.kLS) {
            return;
        }
        lgg lgg2 = this.kLS.y(this.kLX);
        this.kLS.a(this, true);
        this.kLS = hmt2;
        this.kLS.q(this);
        lgg2 = this.kLS.x(lgg2);
        this.z(lgg2);
        this.cqY();
    }

    public final void a(boolean bl, lbp lbp2, int n, Set<jpn> set) {
        if (this.kLZ == null) {
            assert (bl);
            this.kLZ = new hnd();
        }
        this.kLZ.a(bl, lbp2, n, set);
    }

    public final lhf cqO() {
        assert (this.Initialized);
        return this.cqX();
    }

    protected boolean cqP() {
        return this.cqQ() || this.crd() || this.isFocusOwner();
    }

    public final boolean cqQ() {
        assert (this.Initialized);
        return this.kLW;
    }

    public final boolean f(hms hms2) {
        assert (lda.by(hms2));
        assert (this.Initialized);
        return this.g(hms2);
    }

    public final boolean cqR() {
        assert (this.Initialized);
        return this.kLS == null || this.kLS.crp() == this;
    }

    public final boolean isFocusOwner() {
        assert (this.Initialized);
        return this.kMa;
    }

    public final void cqS() {
        assert (this.Initialized);
        boolean bl = this.kLS == null || this.kLS.isFocusOwner() && this.kLS.crp() == this;
        this.nS(bl);
    }

    public final hob cqT() {
        assert (this.Initialized);
        hms hms2 = this;
        while (!(hms2 instanceof hob)) {
            hms2 = hms2.cqt();
        }
        return (hob)hms2;
    }

    public final lgs cqU() {
        return new lgs(this.kLQ);
    }

    public final int a(hms hms2, ldb ldb2, int n) {
        n = hms2.e(ldb2, n);
        n = this.d(ldb2, n);
        return n;
    }

    public final lgg a(hms hms2, lgg lgg2) {
        lgg2 = hms2.y(lgg2);
        lgg2 = this.x(lgg2);
        return lgg2;
    }

    public final lgs a(hms hms2, lgs lgs2) {
        lgs2 = hms2.i(lgs2);
        lgs2 = this.h(lgs2);
        return lgs2;
    }

    public final void cqV() {
        hmt hmt2;
        hms hms2 = this;
        while ((hmt2 = hms2.cqt()) != null) {
            hmt2.p(hms2);
            hms2 = hmt2;
        }
    }

    public final void a(boolean bl, hmr hmr2) {
        this.b(bl, hmr2);
    }

    protected void FF() {
        assert (!this.Initialized);
        assert (!this.kMb);
        this.kMb = true;
        this.Initialized = true;
        this.nU(true);
        this.cre();
        this.crg();
    }

    protected void FG() {
        assert (this.Initialized);
        assert (!this.kMc);
        if (this.kMa) {
            this.nS(false);
        }
        if (this.crd()) {
            this.crc();
        }
        this.nU(false);
        if (this.kLW) {
            this.kLu.crH().a(false, this.kLR);
        }
        this.Initialized = false;
        this.kLJ.enp();
        this.kMc = true;
    }

    protected boolean co(int n, int n2) {
        return this.kLQ.contains(n, n2);
    }

    protected boolean g(hms hms2) {
        assert (lda.by(hms2));
        assert (this.Initialized);
        return false;
    }

    protected void cqW() {
        assert (this.Initialized);
        assert (!this.kMd);
        this.kMd = true;
    }

    protected void chd() {
        assert (this.Initialized);
        this.crm();
    }

    protected void cfS() {
        this.kLK.enp();
    }

    protected lhf b(lhf lhf2) {
        return lhf2;
    }

    protected void cce() {
        this.kLL.enp();
    }

    protected void chL() {
        assert (this.Initialized);
    }

    protected void chK() {
        assert (this.Initialized);
        this.kLP.enp();
    }

    protected void cbu() {
        assert (this.Initialized);
        this.kLN.enp();
    }

    protected void cbM() {
        assert (this.Initialized);
        this.kLM.enp();
    }

    protected void cbv() {
        assert (this.Initialized);
        this.kLM.enp();
    }

    protected boolean LM(int n) {
        assert (this.Initialized);
        assert (lda.acc(n));
        return false;
    }

    protected void ccc() {
        assert (this.Initialized);
    }

    protected void cdC() {
        assert (this.Initialized);
        if (this.kLW) {
            this.crm();
        }
    }

    protected lcu cfR() {
        assert (this.Initialized);
        assert (this.kLu.crV() != this);
        return this.kLu.kNj;
    }

    protected boolean a(int n, boolean bl, Set<jpn> set) {
        assert (this.Initialized);
        assert (lda.yk(bl));
        return this.kLZ != null && this.kLZ.a(n, set);
    }

    protected boolean LN(int n) {
        assert (this.Initialized);
        assert (lda.acc(n));
        return false;
    }

    protected lhf cqX() {
        return new lhf(this.kLY);
    }

    protected void bd(List<lfg> list) {
    }

    protected void ccf() {
        assert (this.Initialized);
        this.kLO.enp();
    }

    protected void cqY() {
        assert (this.Initialized);
    }

    protected abstract void b(boolean var1, hmr var2);

    protected void cqZ() {
        assert (this.Initialized);
    }

    protected void cfT() {
    }

    public String toString() {
        return super.toString();
    }

    protected final void cra() {
        this.cqZ();
    }

    private void nS(boolean bl) {
        if (bl == this.kMa) {
            return;
        }
        this.kMa = bl;
        this.ccf();
    }

    protected final void crb() {
        assert (this.Initialized);
        this.kLu.s(this);
    }

    protected final void crc() {
        assert (this.Initialized);
        this.kLu.r(this);
    }

    protected final boolean crd() {
        assert (this.Initialized);
        return this.kLu.crV() == this;
    }

    private boolean cre() {
        boolean bl;
        boolean bl2 = bl = !this.kLU;
        if (bl && this.kLS != null) {
            bl &= this.kLS.cqC();
        }
        if (bl == this.kMe) {
            return false;
        }
        this.kMe = bl;
        return true;
    }

    protected final void crf() {
        assert (this.Initialized);
        if (this.cre()) {
            assert (!this.kMd);
            this.cqW();
            assert (this.kMd) : this.getClass().getName();
            this.kMd = false;
        }
    }

    private boolean crg() {
        lgs lgs2 = this.cqE();
        if (this.kLS != null && this.crl()) {
            lgs lgs3 = this.kLS.cqU();
            lgs3 = this.a((hms)this.kLS, lgs3);
            lgs2 = lgs2.w(lgs3);
        }
        if (this.kLQ.v(lgs2)) {
            return false;
        }
        this.kLQ.s(lgs2);
        return true;
    }

    protected final void nT(boolean bl) {
        boolean bl2 = this.crg();
        if (this.Initialized && (bl2 || bl)) {
            this.chd();
        }
    }

    protected final void crh() {
        assert (!this.kLV.isStarted());
        this.kLV = null;
    }

    protected final void cri() {
        this.cfT();
    }

    private void crj() {
        assert (this.Initialized);
        assert (!this.kLW);
        this.kLW = true;
        this.kLu.crH().a(true, this.kLR);
        this.chL();
    }

    private void crk() {
        assert (this.Initialized);
        assert (this.kLW);
        this.kLW = false;
        this.kLu.crH().a(false, this.kLR);
        this.chK();
    }

    protected final boolean crl() {
        if (this.kLT == a.kMi) {
            if (this.kLS == null) {
                return true;
            }
            return this.kLS.crl();
        }
        return this.kLT == a.kMg;
    }

    private void crm() {
        boolean bl = this.cqH();
        if (bl != this.kLW) {
            if (bl) {
                this.crj();
            } else {
                this.crk();
            }
        }
    }

    private void nU(boolean bl) {
        assert (lda.yk(bl));
    }

    static /* synthetic */ boolean h(hms hms2) {
        return hms2.Initialized;
    }

    static /* synthetic */ void i(hms hms2) {
        hms2.crm();
    }
}


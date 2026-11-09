/*
 * Decompiled with CFR.
 */
public abstract class hnk {
    public static final hbe jzX = hbe.jAM;
    private final hrt kMu;
    private final ldl kMt = new ldl();
    public final lbn kOA = new lbn(this){
        final /* synthetic */ hnk kOS;
        {
            this.kOS = hnk2;
        }

        public final void W() {
            this.kOS.a(false, hnk.a(this.kOS));
        }
    };
    public final lbn kOB = new lbn(this){
        final /* synthetic */ hnk kOS;
        {
            this.kOS = hnk2;
        }

        public final void W() {
            if (hnk.a((hnk)this.kOS).kLu.csc()) {
                hnk.b(this.kOS);
            } else {
                hnk.c(this.kOS);
            }
        }
    };
    public final lbn kOC = new lbn(this){
        final /* synthetic */ hnk kOS;
        {
            this.kOS = hnk2;
        }

        public final void W() {
            if (hnk.a((hnk)this.kOS).kLu.csc() && hnk.a(this.kOS).cvA()) {
                hnk.b(this.kOS);
            }
        }
    };
    public final lbn kOD = new lbn(this){
        final /* synthetic */ hnk kOS;
        {
            this.kOS = hnk2;
        }

        public final void W() {
            this.kOS.csx();
        }
    };
    private final a kOE = new a(this, hnj.kOw, ldd.rer, false);
    private final a kOF = new a(this, hnj.kOw, ldd.rer, true);
    private final a kOG = new a(this, hnj.kOw, ldd.ret, false);
    private final a kOH = new a(this, hnj.kOw, ldd.ret, true);
    private final a kOI = new a(this, hnj.kOx, ldd.rer, false);
    private final a kOJ = new a(this, hnj.kOx, ldd.rer, true);
    private final a kOK = new a(this, hnj.kOx, ldd.ret, false);
    private final a kOL = new a(this, hnj.kOx, ldd.ret, true);
    private final a kOM = new a(this, hnj.kOy, ldd.rer, false);
    private final a kON = new a(this, hnj.kOy, ldd.rer, true);
    private final a kOO = new a(this, hnj.kOy, ldd.ret, false);
    private final a kOP = new a(this, hnj.kOy, ldd.ret, true);
    private final lbp kOQ = new lbp(this){
        final /* synthetic */ hnk kOS;
        {
            this.kOS = hnk2;
        }

        public final boolean caU() {
            this.kOS.oa(false);
            return true;
        }
    };
    private boolean jLT;
    private hop<?, ?, ?, ?> kOR;

    public hnk(hrt hrt2) {
        this.kMu = hrt2;
        this.jLT = true;
        this.nb(true);
        if (this.csB() != 0) {
            this.csx();
        }
    }

    public final void dispose() {
        assert (this.jLT);
        this.cbg();
        assert (!this.jLT);
    }

    public final void a(boolean bl, hop<?, ?, ?, ?> hop2) {
        if (bl) {
            assert (this.kOR == null);
            this.kOR = hop2;
        } else assert (hop2 == this.kOR);
        this.oe(bl);
        if (bl) {
            if (this.kOR.isInitialized()) {
                this.kOR.refresh();
            }
        } else {
            this.kOR = null;
        }
    }

    public final boolean oa(boolean bl) {
        return this.od(bl);
    }

    public void P(int n, boolean bl) {
        this.Q(n, bl);
    }

    public final lbl<lbn> crt() {
        return this.kMt;
    }

    public final boolean Nr(int n) {
        assert (n >= 0 && n < this.csB());
        return this.Nt(n);
    }

    public final boolean ob(boolean bl) {
        return this.oc(bl);
    }

    public final int csv() {
        return this.csz();
    }

    public final int Ns(int n) {
        return this.Nu(n);
    }

    public final int csw() {
        return this.csA();
    }

    protected void cbg() {
        assert (this.jLT);
        this.nb(false);
        this.jLT = false;
    }

    protected abstract void csx();

    protected abstract boolean Nt(int var1);

    protected abstract boolean Q(int var1, boolean var2);

    protected abstract boolean oc(boolean var1);

    protected abstract boolean od(boolean var1);

    protected void csy() {
        this.csD();
        this.kMt.enp();
        if (this.kOR != null) {
            this.kOR.refresh();
        }
    }

    protected abstract int csz();

    protected abstract int Nu(int var1);

    protected abstract int csA();

    protected final int csB() {
        return this.kMu.getSize();
    }

    private void csC() {
        lgg lgg2 = this.kOR.cqu();
        lgg lgg3 = this.kOR.m(lgg2 = lgg2.r(this.kOR.cqE()));
        if (lgg3 == null) {
            return;
        }
        this.P(lgg3.cg, this.kOR.kLu.crI());
    }

    private void csD() {
        int n;
        if (this.kOR != null && !this.kOR.kLu.csc() && (n = this.csw()) != -1) {
            this.kOR.NB(n);
        }
    }

    private void oe(boolean bl) {
        this.kOR.cql().a(bl, this.kOA);
        this.kOR.cqo().a(bl, this.kOB);
        this.kOR.cqq().a(bl, this.kOC);
        this.kOR.a(bl, this.kOE, 38, jpn.nLm);
        this.kOR.a(bl, this.kOF, 38, jpn.nLH);
        this.kOR.a(bl, this.kOG, 40, jpn.nLm);
        this.kOR.a(bl, this.kOH, 40, jpn.nLH);
        this.kOR.a(bl, this.kOI, 33, jpn.nLm);
        this.kOR.a(bl, this.kOJ, 33, jpn.nLH);
        this.kOR.a(bl, this.kOK, 34, jpn.nLm);
        this.kOR.a(bl, this.kOL, 34, jpn.nLH);
        this.kOR.a(bl, this.kOM, 33, jpn.nLI);
        this.kOR.a(bl, this.kON, 33, jpn.nLL);
        this.kOR.a(bl, this.kOO, 34, jpn.nLI);
        this.kOR.a(bl, this.kOP, 34, jpn.nLL);
        this.kOR.a(bl, this.kOQ, 65, jpn.nLI);
    }

    private void nb(boolean bl) {
        this.kMu.cwH().a(bl, this.kOD);
    }

    static /* synthetic */ hop a(hnk hnk2) {
        return hnk2.kOR;
    }

    static /* synthetic */ void b(hnk hnk2) {
        hnk2.csC();
    }

    static /* synthetic */ void c(hnk hnk2) {
        hnk2.csD();
    }
}


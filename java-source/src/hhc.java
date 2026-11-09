/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public abstract class hhc
extends hnw {
    public final hhf kpU;
    private final lbn kkb = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hhc kpW;
        {
            this.kpW = hhc2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hhc.a(this.kpW)) {
                throw new AssertionError();
            }
            this.kpW.ckm();
            this.kpW.ckn();
        }

        static {
            $assertionsDisabled = !hhc.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;
    private ljp kpV;
    private float daN;

    public hhc(hdm hdm2, String string, lgg lgg2, lhf lhf2, hhf hhf2) {
        super((hnc)hdm2, string, lgg2, lhf2, false);
        this.kpU = hhf2;
        this.a(this.kpU);
    }

    public final void a(ljp ljp2, lgg lgg2) {
        lgg lgg3 = this.kpU.q(ljp2);
        this.c(lgg3, lgg2);
    }

    public final boolean jR(float f2) {
        if (ldq.ai(f2, this.daN)) {
            return false;
        }
        this.daN = f2;
        this.cko();
        return true;
    }

    public final void b(lbf<lhu> lbf2) {
        this.kpU.c(lbf2);
    }

    public final void a(float f2, lbf<lhu> lbf2, lgg lgg2) {
        this.kpU.nA(false);
        ljp ljp2 = lgg2 == null ? null : this.s(lgg2);
        this.jR(f2);
        this.b(lbf2);
        if (lgg2 != null) {
            this.a(ljp2, lgg2);
        }
        this.kpU.nA(true);
    }

    public final ljp s(lgg lgg2) {
        lgg lgg3 = this.E(lgg2);
        ljp ljp2 = this.kpU.t(lgg3);
        return ljp2;
    }

    public final lgg o(ljp ljp2) {
        lgg lgg2 = this.kpU.q(ljp2);
        lgg lgg3 = this.D(lgg2);
        return lgg3;
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
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cbM() {
        assert (this.Initialized);
        super.cbM();
        if (this.a(this.cqu(), hms.class) == this.kpU && this.ckl()) {
            this.ckq();
        }
    }

    @Override
    protected void cbu() {
        assert (this.Initialized);
        super.cbu();
        if (this.ckp()) {
            this.ckr();
        }
    }

    @Override
    protected void cbv() {
        assert (this.Initialized);
        super.cbv();
        if (this.ckp()) {
            this.cks();
        }
    }

    @Override
    protected void cdC() {
        assert (this.Initialized);
        super.cdC();
        if (this.ckp()) {
            this.cks();
        }
    }

    @Override
    protected lcu cfR() {
        assert (this.Initialized);
        if (this.ckl()) {
            return this.kLu.kNw;
        }
        return super.cfR();
    }

    protected boolean ckl() {
        return false;
    }

    protected void ckm() {
        assert (this.Initialized);
        this.kpU.ckK();
    }

    protected void ckn() {
        assert (this.Initialized);
        this.kpU.ckL();
    }

    protected void cko() {
        this.kpU.jR(this.daN);
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    private boolean ckp() {
        return this.kpV != null;
    }

    private void ckq() {
        assert (!this.ckp());
        this.crb();
        this.kpV = this.s(this.cqu());
        assert (this.ckp());
    }

    private void ckr() {
        assert (this.ckp());
        this.a(this.kpV, this.cqu());
        assert (this.ckp());
    }

    private void cks() {
        assert (this.ckp());
        this.kpV = null;
        if (this.crd()) {
            this.crc();
        }
        assert (!this.ckp());
    }

    protected final void p(ljp ljp2) {
        lgg lgg2 = this.kpU.q(ljp2);
        int n = lgg2.cf - this.getWidth() / 2;
        int n2 = lgg2.cg - this.getHeight() / 2;
        this.kpU.cB(-n, -n2);
    }

    private void mU(boolean bl) {
        this.cbP().kck.cnb().a(bl, this.kkb);
    }

    static /* synthetic */ boolean a(hhc hhc2) {
        return hhc2.Initialized;
    }
}


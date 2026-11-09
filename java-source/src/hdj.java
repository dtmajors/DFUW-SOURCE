/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public abstract class hdj
implements lbr {
    public static final int jLA = 1;
    public static final int jLB = 2;
    public static final int jLC = 4;
    public static final int jLD = 8;
    public static final int jLE = 16;
    public static final int jLF = 32;
    public static final int jLG = 64;
    public static final int jLH = 128;
    public static final int jLI = 256;
    public static final int jLJ = 512;
    public static final hbe jzX = hbe.jAM;
    public final String jLK;
    public final String jLL;
    protected final hdm jLM;
    protected final int jLN;
    private final jov jLO;
    public final lbn jLP = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hdj jLW;
        {
            this.jLW = hdj2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hdj.a(this.jLW)) {
                throw new AssertionError();
            }
            this.jLW.nd(false);
        }

        static {
            $assertionsDisabled = !hdj.class.desiredAssertionStatus();
        }
    };
    private final jor jLQ = new jor(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hdj jLW;
        {
            this.jLW = hdj2;
        }

        public final void a(jov jov2, boolean bl) {
            if (!$assertionsDisabled && jov2 != hdj.b(this.jLW)) {
                throw new AssertionError();
            }
            if (bl) {
                this.jLW.nd(true);
            }
        }

        static {
            $assertionsDisabled = !hdj.class.desiredAssertionStatus();
        }
    };
    private final lbn jLR = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hdj jLW;
        {
            this.jLW = hdj2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hdj.a(this.jLW)) {
                throw new AssertionError();
            }
            this.jLW.dispose();
        }

        static {
            $assertionsDisabled = !hdj.class.desiredAssertionStatus();
        }
    };
    private final lbn jLS = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hdj jLW;
        {
            this.jLW = hdj2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hdj.a(this.jLW)) {
                throw new AssertionError();
            }
            this.jLW.cdn();
        }

        static {
            $assertionsDisabled = !hdj.class.desiredAssertionStatus();
        }
    };
    private boolean jLT;
    private hen jLU;
    private final lfz jLV = new lfz();

    public hdj(hdm hdm2, String string, String string2, int n, jov jov2) {
        assert (hdm2 != null);
        assert (string == null || string.length() > 0);
        assert (string2 != null);
        assert (lin.An(string2));
        assert ((n & 0x100) == 0 || (n & 0x10) != 0);
        assert ((n & 0x20) == 0 || (n & 0x100) != 0);
        this.jLM = hdm2;
        this.jLK = string;
        this.jLL = string2;
        this.jLN = n;
        this.jLO = jov2;
        this.jLT = true;
        this.cc(true);
    }

    public final void dispose() {
        assert (this.jLT);
        this.cbg();
        assert (!this.jLT);
    }

    public final hen cdh() {
        assert (this.jLU != null);
        return this.jLU;
    }

    public final boolean cdi() {
        return this.jLU != null;
    }

    public final void cdj() {
        if (this.cdi()) {
            hen hen2 = this.cdh();
            if (hen2.isFocusOwner()) {
                return;
            }
            hen2.cqV();
        } else {
            this.ne(true);
        }
    }

    public final void nd(boolean bl) {
        boolean bl2;
        boolean bl3 = bl2 = this.cdi() && (this.jLM.cdw() || this.hasAttribute(256) && this.cdh().cfE());
        if (bl2) {
            if (!this.jLM.cdw() && this.cdi()) {
                this.cdh().q(false, true);
            }
            this.ne(false);
        } else {
            this.ne(true);
            if (!this.jLM.cdw()) {
                if (this.cdi()) {
                    this.cdh().q(true, true);
                } else {
                    this.jLV.d(lfy.a.rkL).V("Sticky", true);
                }
            }
        }
    }

    public final void cdk() {
        assert (!this.cdi());
        this.ne(true);
    }

    public final void closeWindow() {
        assert (this.cdi());
        this.ne(false);
    }

    public final void ne(boolean bl) {
        if (bl == this.cdi()) {
            return;
        }
        this.nf(bl);
        if (bl && this.jLU != null) {
            this.a(lfy.a.rkK);
            if (!this.hasAttribute(512)) {
                this.jLU.cqV();
            }
            if (this.hasAttribute(64) && !this.jLM.cdx()) {
                this.jLM.o(true, true);
            }
        }
    }

    @Override
    public final boolean a(lfu lfu2) {
        return this.d(lfu2);
    }

    public String toString() {
        return null;
    }

    protected abstract hen cdl();

    protected boolean d(lfu lfu2) {
        if (lfu2.eqA()) {
            lfu2.a("Window", this.jLV);
        }
        if (lfu2.eqB() && this.cdi()) {
            this.a(lfy.a.rkL);
        }
        boolean bl = this.hasAttribute(1);
        if (this.hasAttribute(2)) {
            if (lfu2.eqB()) {
                bl = this.cdi();
            }
            bl = lfu2.V("IsOpen", bl);
        }
        if (lfu2.eqA() && bl && !this.cdi()) {
            this.cdm();
        }
        if (lfu2.eqA() && this.cdi()) {
            this.a(lfy.a.rkK);
        }
        if (lfu2.eqB()) {
            lfu2.a("Window", this.jLV);
        }
        return lfu2.eqA();
    }

    protected void nf(boolean bl) {
        assert (bl == !this.cdi());
        if (bl) {
            this.jLU = this.cdl();
            this.jLM.jZH.j(this.jLU);
            this.jLM.jZH.a((hms)this.jLU, 0.0f);
        } else {
            this.a(lfy.a.rkL);
            this.jLU.remove();
            this.jLU = null;
        }
    }

    protected void cbg() {
        assert (this.jLT);
        if (this.cdi()) {
            this.ne(false);
        }
        this.cc(false);
        this.jLT = false;
    }

    protected void cdm() {
        this.nf(true);
    }

    protected void cdn() {
        if (this.hasAttribute(128) && this.cdi() && !this.jLM.cdw()) {
            this.ne(false);
        }
    }

    private void a(lfy.a a2) {
        this.e(this.jLV.d(a2));
    }

    private void e(lfu lfu2) {
        hms hms2;
        boolean bl;
        if (this.hasAttribute(16) && this.hasAttribute(256)) {
            bl = this.hasAttribute(32);
            if (lfu2.eqB()) {
                bl = this.jLU.cfE();
            }
            bl = lfu2.V("Sticky", bl);
            this.jLU.q(bl, false);
        }
        bl = true;
        if (this.hasAttribute(16) && !(bl = this.jLU.cfG())) {
            this.jLU.r(true, false);
            assert (this.jLU.cfG());
        }
        if (this.hasAttribute(8)) {
            lhf lhf2 = this.jLU.cqv();
            lhf2 = lfu2.a("Size", lhf2, lhf.Persistor);
            this.jLU.d(lhf2);
        }
        float f2 = this.jLU.cfH();
        f2 = lfu2.e("Opacity", f2);
        this.jLU.jP(f2);
        if (this.hasAttribute(4)) {
            lgg lgg2 = this.jLU.cqw();
            lgg2 = this.jLM.d(lgg2, this.jLU.cqv());
            lgg2 = lfu2.a("Position", lgg2, lgg.Persistor);
            lgg2 = this.jLM.e(lgg2, this.jLU.cqv());
            this.jLU.z(lgg2);
        }
        if (this.hasAttribute(16)) {
            this.jLU.r(bl, false);
        }
        if (this.jLU instanceof lbr) {
            lbr lbr2 = (lbr)((Object)this.jLU);
            lfu2.a("Window", lbr2);
        }
        if ((hms2 = this.jLU.csT()) instanceof lbr) {
            lbr lbr3 = (lbr)((Object)hms2);
            if (lfu2.eqB()) {
                lfu2.a("Component", (Object)null, null);
            }
            lfu2.a("Component", lbr3);
        }
    }

    protected final boolean hasAttribute(int n) {
        assert (lin.acU(n) == 1);
        return (this.jLN & n) != 0;
    }

    private void cc(boolean bl) {
        this.jLM.ceb().a(bl, this.jLR);
        if (this.hasAttribute(128)) {
            this.jLM.cdu().a(bl, this.jLS);
        }
        if (this.jLO != null) {
            this.jLM.cbP().kzI.a(bl, this.jLO, this.jLQ);
        }
    }

    static /* synthetic */ boolean a(hdj hdj2) {
        return hdj2.jLT;
    }

    static /* synthetic */ jov b(hdj hdj2) {
        return hdj2.jLO;
    }
}


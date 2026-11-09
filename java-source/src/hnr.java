/*
 * Decompiled with CFR.
 */
public class hnr {
    protected static hbe jzX = hbe.jAM;
    private final hqq kPp;
    private final String[] ipz;
    private boolean Initialized;
    private String kPq = "";
    private int kPr = 0;
    private boolean kPs;
    private int kPt;
    private final lbn kOt = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hnr kPz;
        {
            this.kPz = hnr2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hnr.a(this.kPz)) {
                throw new AssertionError();
            }
            hnr.a(this.kPz, false);
            hnr.b(this.kPz, false);
        }

        static {
            $assertionsDisabled = !hnr.class.desiredAssertionStatus();
        }
    };
    private final lbn kPu = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hnr kPz;
        {
            this.kPz = hnr2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hnr.a(this.kPz)) {
                throw new AssertionError();
            }
            if (!hnr.b(this.kPz)) {
                hnr.a(this.kPz, hnr.c(this.kPz).chj().chz());
            }
        }

        static {
            $assertionsDisabled = !hnr.class.desiredAssertionStatus();
        }
    };
    private final lbn kPv = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hnr kPz;
        {
            this.kPz = hnr2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hnr.a(this.kPz)) {
                throw new AssertionError();
            }
            if (!hnr.b(this.kPz)) {
                hnr.a(this.kPz, hnr.c(this.kPz).chj().getCaretPosition());
            }
        }

        static {
            $assertionsDisabled = !hnr.class.desiredAssertionStatus();
        }
    };
    private final lbp kPw = new lbp(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hnr kPz;
        {
            this.kPz = hnr2;
        }

        public final boolean caU() {
            if (!$assertionsDisabled && !hnr.a(this.kPz)) {
                throw new AssertionError();
            }
            hnr.a(this.kPz, ldd.ret);
            return true;
        }

        static {
            $assertionsDisabled = !hnr.class.desiredAssertionStatus();
        }
    };
    private final lbp kPx = new lbp(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hnr kPz;
        {
            this.kPz = hnr2;
        }

        public final boolean caU() {
            if (!$assertionsDisabled && !hnr.a(this.kPz)) {
                throw new AssertionError();
            }
            hnr.a(this.kPz, ldd.rer);
            return true;
        }

        static {
            $assertionsDisabled = !hnr.class.desiredAssertionStatus();
        }
    };
    private final lbp khJ = new lbp(this){
        final /* synthetic */ hnr kPz;
        {
            this.kPz = hnr2;
        }

        public final boolean caU() {
            if (!hnr.c(this.kPz).chj().chz().equals(hnr.d(this.kPz))) {
                hnr.b(this.kPz, hnr.d(this.kPz));
                return true;
            }
            return false;
        }
    };
    private final lbp kPy = new lbp(this){
        final /* synthetic */ hnr kPz;
        {
            this.kPz = hnr2;
        }

        public final boolean caU() {
            hnr.e(this.kPz);
            return false;
        }
    };

    public hnr(hqq hqq2, String[] stringArray) {
        this.kPp = hqq2;
        this.ipz = stringArray;
        this.Initialized = true;
        this.mU(true);
    }

    private void a(ldd ldd2) {
        assert (ldd2 == ldd.ret || ldd2 == ldd.rer);
        int n = Math.min(this.kPr, this.kPq.length());
        String string = this.kPq.substring(0, n).toLowerCase();
        int n2 = this.kPt + ldd2.reu;
        while (true) {
            if (n2 > this.ipz.length) {
                n2 = 0;
            } else if (n2 < 0) {
                n2 = this.ipz.length;
            }
            if (n2 == this.kPt) {
                return;
            }
            if (n2 == this.ipz.length) {
                this.kPt = n2;
                this.mX(this.kPq);
                break;
            }
            if (this.ipz[n2].toLowerCase().startsWith(string)) {
                this.kPt = n2;
                this.mX(this.ipz[n2] + " ");
                break;
            }
            n2 += ldd2.reu;
        }
    }

    private void mX(String string) {
        this.kPs = true;
        this.kPp.chj().mN(string);
        this.kPp.chj().setCaretPosition(string.length());
        this.kPs = false;
    }

    private void csN() {
        this.kPq = "";
        this.kPr = 0;
        this.kPt = 0;
    }

    private void mU(boolean bl) {
        this.kPp.cql().a(bl, this.kOt);
        this.kPp.chj().chy().a(bl, this.kPu);
        this.kPp.chj().chx().a(bl, this.kPv);
        this.kPp.a(bl, this.kPw, 9, jpn.nLm);
        this.kPp.a(bl, this.kPx, 9, jpn.nLH);
        this.kPp.a(bl, this.khJ, 27, jpn.nLm);
        this.kPp.a(bl, this.kPy, 13, jpn.nLm);
    }

    static /* synthetic */ boolean a(hnr hnr2) {
        return hnr2.Initialized;
    }

    static /* synthetic */ void a(hnr hnr2, boolean bl) {
        hnr2.mU(bl);
    }

    static /* synthetic */ boolean b(hnr hnr2, boolean bl) {
        hnr2.Initialized = bl;
        return hnr2.Initialized;
    }

    static /* synthetic */ boolean b(hnr hnr2) {
        return hnr2.kPs;
    }

    static /* synthetic */ String a(hnr hnr2, String string) {
        hnr2.kPq = string;
        return hnr2.kPq;
    }

    static /* synthetic */ hqq c(hnr hnr2) {
        return hnr2.kPp;
    }

    static /* synthetic */ int a(hnr hnr2, int n) {
        hnr2.kPr = n;
        return hnr2.kPr;
    }

    static /* synthetic */ void a(hnr hnr2, ldd ldd2) {
        hnr2.a(ldd2);
    }

    static /* synthetic */ String d(hnr hnr2) {
        return hnr2.kPq;
    }

    static /* synthetic */ void b(hnr hnr2, String string) {
        hnr2.mX(string);
    }

    static /* synthetic */ void e(hnr hnr2) {
        hnr2.csN();
    }
}


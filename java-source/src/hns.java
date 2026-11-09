/*
 * Decompiled with CFR.
 */
import java.util.LinkedList;
import java.util.List;

public class hns
implements lbr {
    protected static hbe jzX = hbe.jAM;
    private final List<String> kPA = new LinkedList<String>();
    private final hqq kPp;
    private final lbn kOt = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hns kPE;
        {
            this.kPE = hns2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hns.a(this.kPE)) {
                throw new AssertionError();
            }
            hns.a(this.kPE, false);
            hns.b(this.kPE, false);
        }

        static {
            $assertionsDisabled = !hns.class.desiredAssertionStatus();
        }
    };
    private final lbn kPu = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hns kPE;
        {
            this.kPE = hns2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hns.a(this.kPE)) {
                throw new AssertionError();
            }
            if (!hns.b(this.kPE)) {
                hns.a(this.kPE, hns.c(this.kPE).chj().chz());
            }
        }

        static {
            $assertionsDisabled = !hns.class.desiredAssertionStatus();
        }
    };
    private final lbp kPB = new lbp(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hns kPE;
        {
            this.kPE = hns2;
        }

        public final boolean caU() {
            if (!$assertionsDisabled && !hns.a(this.kPE)) {
                throw new AssertionError();
            }
            hns.a(this.kPE, -1);
            return true;
        }

        static {
            $assertionsDisabled = !hns.class.desiredAssertionStatus();
        }
    };
    private final lbp kPC = new lbp(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hns kPE;
        {
            this.kPE = hns2;
        }

        public final boolean caU() {
            if (!$assertionsDisabled && !hns.a(this.kPE)) {
                throw new AssertionError();
            }
            hns.a(this.kPE, 1);
            return true;
        }

        static {
            $assertionsDisabled = !hns.class.desiredAssertionStatus();
        }
    };
    private final lbp khJ = new lbp(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hns kPE;
        {
            this.kPE = hns2;
        }

        public final boolean caU() {
            if (!$assertionsDisabled && !hns.a(this.kPE)) {
                throw new AssertionError();
            }
            if (!hns.c(this.kPE).chj().chz().equals(hns.d(this.kPE))) {
                hns.b(this.kPE, hns.e(this.kPE).size());
                hns.c(this.kPE, true);
                hns.c(this.kPE).chj().mN(hns.d(this.kPE));
                hns.c(this.kPE).chj().setCaretPosition(hns.d(this.kPE).length());
                hns.c(this.kPE, false);
                return true;
            }
            return false;
        }

        static {
            $assertionsDisabled = !hns.class.desiredAssertionStatus();
        }
    };
    private final lbp kPy = new lbp(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hns kPE;
        {
            this.kPE = hns2;
        }

        public final boolean caU() {
            if (!$assertionsDisabled && !hns.a(this.kPE)) {
                throw new AssertionError();
            }
            hns.f(this.kPE);
            return false;
        }

        static {
            $assertionsDisabled = !hns.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;
    private int kPD;
    private String kPq = "";
    private boolean kPs;

    public hns(hqq hqq2) {
        assert (hqq2 != null);
        this.kPp = hqq2;
        this.Initialized = true;
        this.mU(true);
    }

    public final void clear() {
        assert (this.Initialized);
        this.kPA.clear();
        this.kPD = 0;
    }

    @Override
    public boolean a(lfu lfu2) {
        if (lfu2.eqA()) {
            this.kPA.clear();
        }
        int n = this.kPA.size();
        n = lfu2.ad("Length", n);
        for (int i = 0; i < n; ++i) {
            String string = lfu2.eqA() ? "" : this.kPA.get(i);
            string = lfu2.aA("Item" + i, string);
            if (!lfu2.eqA()) continue;
            this.kPA.add(string);
        }
        if (lfu2.eqA()) {
            this.kPD = this.kPA.size();
        }
        return lfu2.eqA();
    }

    private void Nx(int n) {
        assert (n == -1 || n == 1);
        this.kPD += n;
        if (this.kPD < 0) {
            this.kPD = this.kPA.size();
        } else if (this.kPD > this.kPA.size()) {
            this.kPD = 0;
        }
        this.csP();
    }

    private String csO() {
        if (this.kPD == this.kPA.size()) {
            return this.kPq;
        }
        return this.kPA.get(this.kPD);
    }

    private void csP() {
        String string = this.csO();
        this.kPs = true;
        this.kPp.chj().mN(string);
        this.kPp.chj().setCaretPosition(string.length());
        this.kPs = false;
    }

    private boolean mY(String string) {
        if (this.kPA.size() == 0) {
            return false;
        }
        return string.equals(this.kPA.get(this.kPA.size() - 1));
    }

    private void csN() {
        String string = this.kPp.chj().chz();
        if ((string = string.trim()).length() == 0) {
            return;
        }
        if (!this.mY(string)) {
            this.kPA.add(string);
        }
        while (this.kPA.size() > 100) {
            this.kPA.remove(0);
        }
        this.kPD = this.kPA.size();
        this.kPq = "";
    }

    private void mU(boolean bl) {
        this.kPp.cql().a(bl, this.kOt);
        this.kPp.chj().chy().a(bl, this.kPu);
        this.kPp.a(bl, this.kPB, 38, jpn.nLm);
        this.kPp.a(bl, this.kPC, 40, jpn.nLm);
        this.kPp.a(bl, this.khJ, 27, jpn.nLm);
        this.kPp.a(bl, this.kPy, 13, jpn.nLm);
    }

    static /* synthetic */ boolean a(hns hns2) {
        return hns2.Initialized;
    }

    static /* synthetic */ void a(hns hns2, boolean bl) {
        hns2.mU(bl);
    }

    static /* synthetic */ boolean b(hns hns2, boolean bl) {
        hns2.Initialized = bl;
        return hns2.Initialized;
    }

    static /* synthetic */ boolean b(hns hns2) {
        return hns2.kPs;
    }

    static /* synthetic */ String a(hns hns2, String string) {
        hns2.kPq = string;
        return hns2.kPq;
    }

    static /* synthetic */ hqq c(hns hns2) {
        return hns2.kPp;
    }

    static /* synthetic */ void a(hns hns2, int n) {
        hns2.Nx(n);
    }

    static /* synthetic */ String d(hns hns2) {
        return hns2.kPq;
    }

    static /* synthetic */ int b(hns hns2, int n) {
        hns2.kPD = n;
        return hns2.kPD;
    }

    static /* synthetic */ List e(hns hns2) {
        return hns2.kPA;
    }

    static /* synthetic */ boolean c(hns hns2, boolean bl) {
        hns2.kPs = bl;
        return hns2.kPs;
    }

    static /* synthetic */ void f(hns hns2) {
        hns2.csN();
    }
}


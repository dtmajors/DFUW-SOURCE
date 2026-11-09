/*
 * Decompiled with CFR.
 */
public class hmz
implements hlz {
    private static final hbe jzX = hbe.jAM;
    private final hnc kLu;
    private final ldl kMB = new ldl();
    private final lbn kMC = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hmz kMO;
        {
            this.kMO = hmz2;
        }

        public final void W() {
            if (!$assertionsDisabled && hmz.a(this.kMO) == a.kMQ) {
                throw new AssertionError();
            }
            this.kMO.cpK();
        }

        static {
            $assertionsDisabled = !hmz.class.desiredAssertionStatus();
        }
    };
    private final lbn kkc = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hmz kMO;
        {
            this.kMO = hmz2;
        }

        public final void W() {
            if (hmz.a(this.kMO) == a.kMQ) {
                return;
            }
            if (hmz.b(this.kMO) != null && !hmz.b(this.kMO).isInitialized()) {
                hmz.c(this.kMO);
                if (!$assertionsDisabled && hmz.b(this.kMO) != null && !hmz.b(this.kMO).isInitialized()) {
                    throw new AssertionError();
                }
            }
        }

        static {
            $assertionsDisabled = !hmz.class.desiredAssertionStatus();
        }
    };
    private final lbn kLR = new lbn(this){
        final /* synthetic */ hmz kMO;
        {
            this.kMO = hmz2;
        }

        public final void W() {
            hmz.c(this.kMO);
        }
    };
    private final lbn jHY = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hmz kMO;
        {
            this.kMO = hmz2;
        }

        public final void W() {
            switch (hmz.a(this.kMO)) {
                case kMR: 
                case kMS: {
                    if (!$assertionsDisabled && hmz.d(this.kMO).csc()) {
                        throw new AssertionError();
                    }
                    hmz.e(this.kMO);
                    break;
                }
            }
        }

        static {
            $assertionsDisabled = !hmz.class.desiredAssertionStatus();
        }
    };
    private hms kMD;
    private hmb kME;
    private int kMF;
    private int kMG;
    private a kMH;
    private lgg kMI;
    private hmt kMJ;
    private lgg kMK;
    private hmt kML;
    private lgg kMM;
    private hob kMN;

    public hmz(hnc hnc2) {
        this.kLu = hnc2;
        this.kMH = a.kMQ;
        this.mU(true);
    }

    public final void dispose() {
        if (this.kMH != a.kMQ) {
            this.cpK();
        }
        this.mU(false);
    }

    public final void crw() {
        if (this.kMH != a.kMQ) {
            this.cpK();
        }
    }

    @Override
    public final void a(hms hms2, int n) {
        assert (this.kLu.csc());
        assert (hms2 != null);
        assert (hms2.cqt() != null);
        assert (this.kMH == a.kMQ);
        this.kMD = hms2;
        this.kML = this.kMD.cqt();
        this.kME = this.kMD instanceof hmb ? (hmb)((Object)this.kMD) : null;
        this.kMF = n;
        this.kMG = this.kMF * this.kMF;
        this.nW(true);
        this.kMH = a.kMR;
        this.kMB.enp();
        this.kMN = this.kMD.cqT();
        this.kMD.crb();
    }

    @Override
    public final void cpK() {
        assert (this.kMH != a.kMQ);
        this.e(null);
        this.end();
    }

    @Override
    public final hms cpL() {
        assert (this.kMH != a.kMQ);
        return this.kMD;
    }

    @Override
    public final boolean cpM() {
        assert (this.kMH == a.kMS);
        return this.kMJ != null;
    }

    @Override
    public final hmt cpN() {
        assert (this.kMH != a.kMQ);
        return this.kML;
    }

    @Override
    public final lgg cpO() {
        assert (this.kMH != a.kMQ);
        return this.kMM;
    }

    public final hms crx() {
        assert (this.kMH != a.kMQ);
        return this.kMJ;
    }

    @Override
    public final lgg cpP() {
        assert (this.kMH != a.kMQ);
        return this.kMK;
    }

    @Override
    public final boolean cpQ() {
        return this.kMH == a.kMQ;
    }

    @Override
    public final boolean cpR() {
        return this.kMH == a.kMR;
    }

    @Override
    public final boolean cpS() {
        return this.kMH == a.kMS;
    }

    @Override
    public final lbl<lbn> cpT() {
        return this.kMB;
    }

    private boolean d(hmt hmt2) {
        return hmt2 instanceof hma && ((hma)((Object)hmt2)).b(this.kMD);
    }

    private void e(hmt hmt2) {
        if (hmt2 == this.kMJ) {
            this.cry();
            return;
        }
        if (this.kMJ != null && this.kMJ instanceof hma) {
            ((hma)((Object)this.kMJ)).cgf();
        }
        this.kMJ = hmt2;
        if (this.kMJ != null && this.kMJ instanceof hma) {
            this.cry();
            ((hma)((Object)this.kMJ)).cge();
        }
    }

    private void cry() {
        if (this.kMJ != null) {
            lgg lgg2 = this.kMD.cqw();
            this.kMK = this.kMJ.x(lgg2);
        }
    }

    private void nW(boolean bl) {
        this.kMD.cql().a(bl, this.kMC);
        this.kML.cql().a(bl, this.kMC);
        this.kLu.kAz.eme().a(bl, this.kkc);
    }

    private void end() {
        assert (this.kMH != a.kMQ);
        this.nW(false);
        boolean bl = true;
        switch (this.kMH) {
            case kMR: {
                if (!this.kMD.isInitialized() || !this.kMD.crd()) break;
                this.kMD.crc();
                break;
            }
            case kMS: {
                if (this.kMN.isInitialized() && this.kMN.crd()) {
                    this.kMN.crc();
                }
                bl = this.crz();
                break;
            }
            default: {
                assert (false) : this.kMH;
                break;
            }
        }
        this.kMH = a.kMQ;
        this.kMB.enp();
        if (!bl && this.kMD.isInitialized()) {
            if (this.kML.isInitialized()) {
                this.kMD.c(this.kML);
                this.kMD.z(this.kMM);
                if (this.kME != null) {
                    this.kME.cbK();
                }
            } else {
                this.kMD.remove();
            }
            if (this.kME != null && ((hms)((Object)this.kME)).isInitialized()) {
                this.kME.cbL();
            }
        }
        this.kMD = null;
        this.e(null);
        this.kML = null;
    }

    private boolean crz() {
        if (this.kMJ == null || !this.kMJ.isInitialized()) {
            return false;
        }
        if (!((hma)((Object)this.kMJ)).b(this.kMD)) {
            return false;
        }
        if (this.kME != null) {
            return this.kME.a(this.kMJ, false);
        }
        return true;
    }

    private void crA() {
        assert (this.kLu.csc());
        assert (this.kMH == a.kMR);
        lgg lgg2 = this.kLu.cse();
        int n = lgg2.cf * lgg2.cf + lgg2.cg * lgg2.cg;
        if (n >= this.kMG) {
            this.kMI = this.kMD.cqu().S(lgg2);
            this.kMM = this.kMD.cqw();
            this.kMH = a.kMS;
            this.kMB.enp();
            this.kMD.c(this.kMN);
            this.kMN.crb();
            if (this.kME != null) {
                this.kME.cbJ();
            }
            this.crB();
        }
    }

    private void crB() {
        if (!this.kLu.csc() || this.kMH != a.kMS || this.kLu.crV() != this.kMN) {
            return;
        }
        lgg lgg2 = this.kLu.cqu().S(this.kMI);
        this.kMD.z(lgg2);
        hmt hmt2 = null;
        hmt hmt3 = this.kML;
        if (!(hmt3 instanceof hob)) {
            hmt3 = hmt3.cqT();
        }
        if (this.d(hmt3)) {
            hmt2 = hmt3;
        } else {
            for (hmt3 = (hmt)hmt3.a(hmt3.cqu(), hpv.class); hmt3 != null; hmt3 = hmt3.a(hmt3.cqu(), hmt.class)) {
                if (!this.d(hmt3)) continue;
                hmt2 = hmt3;
            }
        }
        if (hmt2 != null && this.kME != null && !this.kME.a(hmt2, true)) {
            hmt2 = null;
        }
        this.e(hmt2);
        if (this.kME != null) {
            this.kME.cbK();
        }
    }

    private void crC() {
        switch (this.kMH) {
            case kMR: {
                this.crA();
                break;
            }
            case kMS: {
                this.crB();
                break;
            }
        }
    }

    private void mU(boolean bl) {
        this.kLu.crH().a(bl, this.kLR);
        this.kLu.cqo().a(bl, this.jHY);
    }

    static /* synthetic */ a a(hmz hmz2) {
        return hmz2.kMH;
    }

    static /* synthetic */ hmt b(hmz hmz2) {
        return hmz2.kMJ;
    }

    static /* synthetic */ void c(hmz hmz2) {
        hmz2.crC();
    }

    static /* synthetic */ hnc d(hmz hmz2) {
        return hmz2.kLu;
    }

    static /* synthetic */ void e(hmz hmz2) {
        hmz2.end();
    }
}


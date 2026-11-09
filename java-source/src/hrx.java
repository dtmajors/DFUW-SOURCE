/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class hrx {
    protected static final hbe jzX = hbe.jAM;
    private final lbh kAz;
    private final lha<dxq, dxq> cdh;
    private final lha<miw, mii> jWI;
    private final lgs lap = new lgs();
    private final lgs laq = new lgs();
    private final lgs cC = new lgs(0, 0, 800, 600);
    private final ldl lar = new ldl();
    private final ldl las = new ldl();
    private final ldl cy = new ldl();
    private final ldl cA = new ldl();
    private final ldl lat = new ldl();
    private final lbn jEL = new lbn(this){
        final /* synthetic */ hrx laO;
        {
            this.laO = hrx2;
        }

        public final void W() {
        }
    };
    private final lbn lau = new lbn(this){
        final /* synthetic */ hrx laO;
        {
            this.laO = hrx2;
        }

        public final void W() {
            if (hrx.a(this.laO) == 0) {
                return;
            }
            mig mig2 = mig.n(hrx.b((hrx)this.laO).rng);
            mig2.aer(hrx.a(this.laO));
            if ((hrx.a(this.laO) & 1) != 0) {
                mig2.yX(hrx.c(this.laO));
            }
            if ((hrx.a(this.laO) & 4) != 0) {
                mig2.aes(hrx.d(this.laO));
            }
            if ((hrx.a(this.laO) & 2) != 0) {
                mig2.yY(hrx.e(this.laO));
            }
            hrx.b((hrx)this.laO).rnh.m(mig2);
            hrx.a(this.laO, 0);
        }
    };
    private final lbi<miu> lav = new lbi<miu>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hrx laO;
        {
            this.laO = hrx2;
        }

        public final void a(miu miu2) {
            Object object;
            if (!$assertionsDisabled && miu2.getErrorCode() != 0) {
                throw new AssertionError();
            }
            boolean bl = false;
            int n = miu2.ezm();
            if ((n & 0x20) != 0) {
                hrx.a(this.laO, miu2.ezj());
            }
            if ((n & 0x80) != 0) {
                hrx.b(this.laO, miu2.getCursorType());
            }
            if ((n & 0x40) != 0) {
                hrx.b(this.laO, miu2.ezl());
            }
            if ((n & 8) != 0) {
                hrx.c(this.laO, miu2.ezp());
            }
            if ((n & 1) != 0) {
                object = hrx.c(this.laO, miu2.getState());
                hrx.a(this.laO, object);
            }
            if ((n & 0x10) != 0) {
                // empty if block
            }
            if ((n & 4) != 0) {
                object = new lgs(miu2.ezn(), miu2.ezo(), miu2.chN(), miu2.chO());
                if (hrx.f(this.laO) != a.laQ) {
                    hrx.g(this.laO).t((lgs)object);
                    bl = true;
                }
            }
            if ((n & 2) != 0) {
                object = new lgs(miu2.ezq(), miu2.ezr(), miu2.eez(), miu2.eey());
                if (hrx.f(this.laO) != a.laQ) {
                    hrx.h(this.laO).t((lgs)object);
                    bl = true;
                }
            }
            if (bl) {
                hrx.i(this.laO);
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((miu)object);
        }

        static {
            $assertionsDisabled = !hrx.class.desiredAssertionStatus();
        }
    };
    private final lbi<miy> law = new lbi<miy>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hrx laO;
        {
            this.laO = hrx2;
        }

        public final void a(miy miy2) {
            if (miy2.getErrorCode() != 0) {
                if (!$assertionsDisabled) {
                    throw new AssertionError();
                }
                return;
            }
            switch (miy2.dRv()) {
                case 0: {
                    hrx.a(this.laO, miy2.dRw());
                    break;
                }
                case 2: {
                    if (!$assertionsDisabled) {
                        throw new AssertionError();
                    }
                    return;
                }
                case 1: {
                    if (!$assertionsDisabled) {
                        throw new AssertionError();
                    }
                    return;
                }
                default: {
                    if (!$assertionsDisabled) {
                        throw new AssertionError(miy2.dRv());
                    }
                    return;
                }
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((miy)object);
        }

        static {
            $assertionsDisabled = !hrx.class.desiredAssertionStatus();
        }
    };
    private final lbi<miw> lax = new lbi<miw>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hrx laO;
        {
            this.laO = hrx2;
        }

        public final void b(miw miw2) {
            if (miw2.getErrorCode() != 0) {
                if (!$assertionsDisabled) {
                    throw new AssertionError();
                }
                return;
            }
        }

        public /* synthetic */ void m(Object object) {
            this.b((miw)object);
        }

        static {
            $assertionsDisabled = !hrx.class.desiredAssertionStatus();
        }
    };
    private final lbi<min> lay = new lbi<min>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hrx laO;
        {
            this.laO = hrx2;
        }

        public final void a(min min2) {
            if (min2.getErrorCode() != 0) {
                if (!$assertionsDisabled) {
                    throw new AssertionError();
                }
                return;
            }
            if (!$assertionsDisabled && !min2.dRw().equals(hrx.j(this.laO))) {
                throw new AssertionError();
            }
            hrx.k(this.laO).enp();
        }

        public /* synthetic */ void m(Object object) {
            this.a((min)object);
        }

        static {
            $assertionsDisabled = !hrx.class.desiredAssertionStatus();
        }
    };
    private final lbi<mio> laz = new lbi<mio>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hrx laO;
        {
            this.laO = hrx2;
        }

        public final void a(mio mio2) {
            if (mio2.getErrorCode() != 0) {
                if (!$assertionsDisabled) {
                    throw new AssertionError();
                }
                return;
            }
            if (!$assertionsDisabled && !mio2.dRw().equals(hrx.j(this.laO))) {
                throw new AssertionError();
            }
            hrx.a(this.laO, mio2.ezj());
        }

        public /* synthetic */ void m(Object object) {
            this.a((mio)object);
        }

        static {
            $assertionsDisabled = !hrx.class.desiredAssertionStatus();
        }
    };
    private final lbi<miq> laA = new lbi<miq>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hrx laO;
        {
            this.laO = hrx2;
        }

        public final void a(miq miq2) {
            if (miq2.getErrorCode() != 0) {
                if (!$assertionsDisabled) {
                    throw new AssertionError();
                }
                return;
            }
            if (!$assertionsDisabled && !miq2.dRw().equals(hrx.j(this.laO))) {
                throw new AssertionError();
            }
            hrx.b(this.laO, miq2.getCursorType());
        }

        public /* synthetic */ void m(Object object) {
            this.a((miq)object);
        }

        static {
            $assertionsDisabled = !hrx.class.desiredAssertionStatus();
        }
    };
    private final lbi<mir> laB = new lbi<mir>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hrx laO;
        {
            this.laO = hrx2;
        }

        public final void a(mir mir2) {
            if (mir2.getErrorCode() != 0) {
                if (!$assertionsDisabled) {
                    throw new AssertionError();
                }
                return;
            }
            if (!$assertionsDisabled && !mir2.dRw().equals(hrx.j(this.laO))) {
                throw new AssertionError();
            }
            hrx.b(this.laO, mir2.ezl());
        }

        public /* synthetic */ void m(Object object) {
            this.a((mir)object);
        }

        static {
            $assertionsDisabled = !hrx.class.desiredAssertionStatus();
        }
    };
    private final lbi<mit> laC = new lbi<mit>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hrx laO;
        {
            this.laO = hrx2;
        }

        public final void a(mit mit2) {
            if (!$assertionsDisabled && mit2.getErrorCode() != 0) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && !mit2.dRw().equals(hrx.j(this.laO))) {
                throw new AssertionError();
            }
            hrx.c(this.laO, mit2.dmb());
        }

        public /* synthetic */ void m(Object object) {
            this.a((mit)object);
        }

        static {
            $assertionsDisabled = !hrx.class.desiredAssertionStatus();
        }
    };
    private final lbi<miv> laD = new lbi<miv>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hrx laO;
        {
            this.laO = hrx2;
        }

        public final void a(miv miv2) {
            lgs lgs2;
            if (!$assertionsDisabled && hrx.f(this.laO) == null) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && !miv2.dRw().equals(hrx.j(this.laO))) {
                throw new AssertionError();
            }
            if (miv2.getErrorCode() != 0) {
                if (!$assertionsDisabled) {
                    throw new AssertionError();
                }
                return;
            }
            boolean bl = false;
            if (hrx.f(this.laO) != a.laQ) {
                lgs2 = new lgs(miv2.ezn(), miv2.ezo(), miv2.chN(), miv2.chO());
                hrx.g(this.laO).t(lgs2);
                bl = true;
            }
            if (hrx.f(this.laO) != a.laQ) {
                lgs2 = new lgs(miv2.ezq(), miv2.ezr(), miv2.eez(), miv2.eey());
                hrx.h(this.laO).t(lgs2);
                bl = true;
            }
            if (bl) {
                hrx.i(this.laO);
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((miv)object);
        }

        static {
            $assertionsDisabled = !hrx.class.desiredAssertionStatus();
        }
    };
    private final lbi<miz> laE = new lbi<miz>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hrx laO;
        {
            this.laO = hrx2;
        }

        public final void a(miz miz2) {
            if (miz2.getErrorCode() != 0) {
                if (!$assertionsDisabled) {
                    throw new AssertionError();
                }
                return;
            }
            if (!$assertionsDisabled && !miz2.dRw().equals(hrx.j(this.laO))) {
                throw new AssertionError();
            }
            a a2 = hrx.c(this.laO, miz2.getState());
            hrx.a(this.laO, a2);
        }

        public /* synthetic */ void m(Object object) {
            this.a((miz)object);
        }

        static {
            $assertionsDisabled = !hrx.class.desiredAssertionStatus();
        }
    };
    private ldv laF;
    private boolean iNP;
    private a laG = a.laR;
    private boolean iNR;
    private boolean iNT;
    private boolean iNS;
    private boolean laH;
    private boolean laI;
    private boolean laJ;
    private lcu kNJ;
    private int laK;
    private boolean laL = false;
    private int laM;
    private boolean laN;

    public hrx(lbh lbh2, lha<dxq, dxq> lha2, lha<miw, mii> lha3) {
        this.kAz = lbh2;
        this.cdh = lha2;
        this.jWI = lha3;
        this.jWI.rex.a(true, miu.class, this.lav);
        this.jWI.rex.a(true, miy.class, this.law);
        this.jWI.rex.b(true, mip.class, this.lax);
        this.jWI.rex.b(true, mja.class, this.lax);
        this.jWI.rex.a(true, min.class, this.lay);
        this.jWI.rex.a(true, mio.class, this.laz);
        this.jWI.rex.a(true, miq.class, this.laA);
        this.jWI.rex.a(true, mir.class, this.laB);
        this.jWI.rex.a(true, mit.class, this.laC);
        this.jWI.rex.a(true, miv.class, this.laD);
        this.jWI.rex.a(true, miz.class, this.laE);
        mii mii2 = mil.p(this.jWI.rng);
        ((mil)mii2).sy(ldv.rfe);
        ((mil)mii2).VO(0);
        ((mil)mii2).VN(127);
        this.jWI.rnh.m(mii2);
        mii2 = mih.o(this.jWI.rng);
        ((mih)mii2).aet(255);
        this.jWI.rnh.m(mii2);
        this.cc(true);
        this.cwS();
    }

    public final void dispose() {
        this.cc(false);
        assert (this.lar.isEmpty());
        assert (this.las.isEmpty());
        assert (this.cy.isEmpty());
        assert (this.cA.isEmpty());
        assert (this.lat.isEmpty());
    }

    public final a cwK() {
        return this.laG;
    }

    public final boolean cwx() {
        return this.iNP;
    }

    public final lgs cqE() {
        return new lgs(this.cC);
    }

    public final void setTitle(String string) {
        mim mim2 = mim.q(this.jWI.rng);
        mim2.setTitle(string);
        this.jWI.rnh.m(mim2);
    }

    public final void c(lcu lcu2) {
        if (lcu2 == this.kNJ) {
            return;
        }
        this.kNJ = lcu2;
        this.cwX();
    }

    public final lbl<lbn> cwL() {
        return this.lat;
    }

    public final lbl<lbn> cwM() {
        return this.lar;
    }

    public final lbl<lbn> cwN() {
        return this.las;
    }

    public final lbl<lbn> cwO() {
        return this.cy;
    }

    public final lbl<lbn> cwP() {
        return this.cA;
    }

    public final void ot(boolean bl) {
        if (bl == this.iNR) {
            return;
        }
        this.iNR = bl;
        this.cdn();
    }

    public final void ou(boolean bl) {
        if (bl == this.iNT) {
            return;
        }
        this.iNT = bl;
        this.cwT();
    }

    public final boolean cwQ() {
        return this.iNT;
    }

    public final void ov(boolean bl) {
        if (bl == this.iNS) {
            return;
        }
        this.iNS = bl;
        this.cwU();
    }

    public final void ow(boolean bl) {
        if (bl == this.laH) {
            return;
        }
        this.laH = bl;
        this.cwW();
    }

    private void cwR() {
        lgs lgs2 = new lgs(this.lap.cf + this.laq.cf, this.lap.cg + this.laq.cg, this.laq.rmN, this.laq.H);
        if (lgs2.v(this.cC)) {
            return;
        }
        this.cC.t(lgs2);
        this.cy.enp();
    }

    private void ox(boolean bl) {
        if (this.laI) {
            this.laI = false;
        } else {
            this.laN = bl;
            if (!bl) {
                this.cxa();
            }
        }
    }

    private void Of(int n) {
        assert (lda.acc(n));
    }

    private void oy(boolean bl) {
        assert (lda.yk(bl));
    }

    private void oz(boolean bl) {
        if (bl == this.iNP) {
            return;
        }
        this.iNP = bl;
        lcw.qFx = bl;
        this.las.enp();
        this.cdh.rnh.m(fjm.b(this.cdh.rng, this.iNP));
    }

    private void cwS() {
        this.cwW();
        this.cdh.rnh.m(fjo.a(this.cdh.rng, this.iNR, this.iNS, this.iNT));
    }

    private void a(a a2) {
        if (a2 == this.laG) {
            return;
        }
        this.laG = a2;
        this.cwV();
    }

    private void cdn() {
        this.cwS();
        if (this.iNR) {
            mig mig2 = mig.n(this.jWI.rng);
            mig2.aer(8);
            mig2.DxP = this.cC.rmN / 2;
            mig2.DxQ = this.cC.H / 2;
            this.jWI.rnh.m(mig2);
        }
    }

    private void cwT() {
        this.cwS();
    }

    private void cwU() {
        this.cwS();
    }

    private final jol.b b(a a2) {
        if (a2 == null) {
            return jol.b.nKO;
        }
        switch (a2) {
            case laQ: {
                return jol.b.nKN;
            }
            case laR: {
                return jol.b.nKO;
            }
            case laS: {
                return jol.b.nKP;
            }
        }
        assert (false);
        return jol.b.nKO;
    }

    private final a Og(int n) {
        switch (n) {
            case 0: {
                return a.laQ;
            }
            case 1: {
                return a.laR;
            }
            case 2: {
                return a.laS;
            }
        }
        assert (false);
        return a.laR;
    }

    protected void cwV() {
        jol.b b2 = this.b(this.laG);
        this.cdh.rnh.m(fjn.a(this.cdh.rng, b2));
        this.cwW();
        this.lar.enp();
    }

    private void cwW() {
        boolean bl;
        boolean bl2 = bl = this.laH || !this.iNR || this.laG == a.laS;
        if (bl == this.laJ) {
            return;
        }
        this.laJ = bl;
        this.laI = true;
        this.oB(this.laJ);
    }

    private void cwX() {
        if (this.kNJ != null) {
            int n;
            switch (this.kNJ.qEU) {
                case qEV: {
                    n = 0;
                    break;
                }
                case qEW: {
                    n = 1;
                    break;
                }
                case qEX: {
                    n = 2;
                    break;
                }
                case qEY: {
                    n = 3;
                    break;
                }
                case qEZ: {
                    n = 4;
                    break;
                }
                case qFa: {
                    n = 5;
                    break;
                }
                case qFb: {
                    n = 6;
                    break;
                }
                case qFc: {
                    n = 7;
                    break;
                }
                case qFd: {
                    n = 8;
                    break;
                }
                case qFe: {
                    n = 9;
                    break;
                }
                case qFf: {
                    n = 10;
                    break;
                }
                case qFg: {
                    n = 11;
                    break;
                }
                case qFh: {
                    n = 12;
                    break;
                }
                case qFi: {
                    n = 13;
                    break;
                }
                default: {
                    assert (false);
                    n = 1;
                }
            }
            this.Oh(n);
        }
        this.cwY();
    }

    private void cwY() {
        boolean bl = !this.iNS && this.kNJ != null;
        this.oA(bl);
    }

    private void oA(boolean bl) {
        if (bl == this.laL) {
            return;
        }
        this.laL = bl;
        this.Oi(2);
    }

    private void Oh(int n) {
        if (n == this.laK) {
            return;
        }
        this.laK = n;
        this.Oi(4);
    }

    private void oB(boolean bl) {
        if (bl == this.laN) {
            return;
        }
        this.laN = bl;
        this.Oi(1);
    }

    private void Oi(int n) {
        if ((this.laM & n) != 0) {
            return;
        }
        this.laM |= n;
        this.cwZ();
    }

    private void cwZ() {
        this.kAz.b(this.lau);
    }

    private void cxa() {
        this.lat.enp();
    }

    private void cc(boolean bl) {
        this.kAz.eme().a(bl, this.jEL);
    }

    static /* synthetic */ int a(hrx hrx2) {
        return hrx2.laM;
    }

    static /* synthetic */ lha b(hrx hrx2) {
        return hrx2.jWI;
    }

    static /* synthetic */ boolean c(hrx hrx2) {
        return hrx2.laJ;
    }

    static /* synthetic */ int d(hrx hrx2) {
        return hrx2.laK;
    }

    static /* synthetic */ boolean e(hrx hrx2) {
        return hrx2.laL;
    }

    static /* synthetic */ int a(hrx hrx2, int n) {
        hrx2.laM = n;
        return hrx2.laM;
    }

    static /* synthetic */ void a(hrx hrx2, boolean bl) {
        hrx2.ox(bl);
    }

    static /* synthetic */ void b(hrx hrx2, int n) {
        hrx2.Of(n);
    }

    static /* synthetic */ void b(hrx hrx2, boolean bl) {
        hrx2.oy(bl);
    }

    static /* synthetic */ void c(hrx hrx2, boolean bl) {
        hrx2.oz(bl);
    }

    static /* synthetic */ a c(hrx hrx2, int n) {
        return hrx2.Og(n);
    }

    static /* synthetic */ void a(hrx hrx2, a a2) {
        hrx2.a(a2);
    }

    static /* synthetic */ a f(hrx hrx2) {
        return hrx2.laG;
    }

    static /* synthetic */ lgs g(hrx hrx2) {
        return hrx2.laq;
    }

    static /* synthetic */ lgs h(hrx hrx2) {
        return hrx2.lap;
    }

    static /* synthetic */ void i(hrx hrx2) {
        hrx2.cwR();
    }

    static /* synthetic */ ldv a(hrx hrx2, ldv ldv2) {
        hrx2.laF = ldv2;
        return hrx2.laF;
    }

    static /* synthetic */ ldv j(hrx hrx2) {
        return hrx2.laF;
    }

    static /* synthetic */ ldl k(hrx hrx2) {
        return hrx2.cA;
    }
}


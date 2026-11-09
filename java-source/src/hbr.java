/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
public class hbr
extends hnv
implements hbg {
    private final lhf jDK = new lhf(250, 65);
    private final lhf jDL = new lhf(0, 75);
    private final lhf jDM = new lhf(15, 20);
    private static final int jDS = 4;
    private lgq RC;
    private hqq jDT;
    private hqq jDU;
    private int ii;
    private int ij;
    private boolean Initialized;
    private final lbn jDV = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hbr jEb;
        {
            this.jEb = hbr2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hbr.a(this.jEb)) {
                throw new AssertionError();
            }
            String string = "";
            switch (cu.a(this.jEb.cbq(), this.jEb.cbr(), lcw.SC, null)) {
                case lk: {
                    string = lcx.qRl.esy();
                    break;
                }
                case li: 
                case lj: {
                    string = lcx.qRk.esy();
                    break;
                }
                case lc: 
                case ld: 
                case lg: 
                case le: 
                case lf: 
                case lh: {
                    string = lcx.qRh.esy();
                    break;
                }
                case kY: 
                case la: {
                    string = lcx.qRi.esy();
                    break;
                }
                case ll: {
                    string = lcx.qRn.esy();
                    break;
                }
                case kZ: 
                case lb: {
                    string = lcx.qRj.esy();
                    break;
                }
            }
            hbr.b(this.jEb).lX(string);
        }

        static {
            $assertionsDisabled = !hbr.class.desiredAssertionStatus();
        }
    };
    private final lbp jAY = new lbp(this){
        final /* synthetic */ hbr jEb;
        {
            this.jEb = hbr2;
        }

        public final boolean caU() {
            if (hbr.c(this.jEb).cqR()) {
                hbr.d(this.jEb).cqV();
            } else if (hbr.d(this.jEb).cqR()) {
                hbr.c(this.jEb).cqV();
            }
            return true;
        }
    };
    private final lbn jDW = new lbn(this){
        final /* synthetic */ hbr jEb;
        {
            this.jEb = hbr2;
        }

        public final void W() {
            String string = cg.n(hbr.e(this.jEb));
            hbr.d(this.jEb).chj().mN(hbr.f(this.jEb).aC(string, "Surname"));
        }
    };
    private final lbn jDX = new lbn(this){
        final /* synthetic */ hbr jEb;
        {
            this.jEb = hbr2;
        }

        public final void W() {
            String string = cg.n(hbr.e(this.jEb));
            String string2 = cg.u(hbr.g(this.jEb));
            hbr.c(this.jEb).chj().mN(hbr.f(this.jEb).aC(string, string2));
        }
    };
    private final lbn jDY = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hbr jEb;
        {
            this.jEb = hbr2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hbr.a(this.jEb)) {
                throw new AssertionError();
            }
            boolean bl = this.jEb.isFocusOwner();
            if (bl) {
                hbr.c(this.jEb).cqV();
            }
        }

        static {
            $assertionsDisabled = !hbr.class.desiredAssertionStatus();
        }
    };
    private final lbn jDZ = new lbn(this){
        final /* synthetic */ hbr jEb;
        {
            this.jEb = hbr2;
        }

        public final void W() {
            if (this.jEb.kLu.csc()) {
                hbr.d(this.jEb).cqV();
            }
        }
    };
    private final lbn jEa = new lbn(this){
        final /* synthetic */ hbr jEb;
        {
            this.jEb = hbr2;
        }

        public final void W() {
            if (this.jEb.kLu.csc()) {
                hbr.c(this.jEb).cqV();
            }
        }
    };

    public hbr(hbm hbm2, lgg lgg2) {
        super((hnc)((Object)hbm2), "", lgg2, new lhf(hbo.jDC.kLY.rmN, hbm2.kND.cqv().H - 40), hbr.cbs());
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        int n = this.jDK.rmN;
        int n2 = this.jDK.H;
        int n3 = this.jDL.H;
        int n4 = 150;
        int n5 = 24;
        Object object = new lhf(280, 50);
        Object object2 = new lgg(140, 12);
        Object object3 = new hpe(this.kLu, "", (lgg)object2, (lhf)object, ((hbm)((Object)this.kLu)).jBY, "Choose character name");
        this.j((hms)object3);
        object = ((hbm)((Object)this.kLu)).I(5, true);
        ((hbf)object).a(this);
        this.cbo().jCr.j((hms)object);
        object2 = null;
        object3 = new lhf(150, 50);
        lgg lgg2 = new lgg(n, n2);
        hms hms2 = new hpe(this.kLu, "", lgg2, (lhf)object3, ((hbm)((Object)this.kLu)).jBX, lcx.qQM.esy());
        this.j(hms2);
        object3 = this.caP().kKa.jGK.kJY.kPT;
        int n6 = ((hnz.d)object3).cto() + ((hnz.d)object3).ctq();
        object2 = new lgs(n, n2 + this.jDM.H, n4, 16 + n6);
        this.jDT = new hqq(this.kLu, "", ((lgs)object2).aI(), ((lgs)object2).cqv(), this.caP().kKa, cu.c.cv());
        this.j(this.jDT);
        n = n + 4 + 15;
        object2 = new lgs(n, (n2 += 26) + this.jDM.H, n4 - 30, n5);
        hms2 = new hqy(this.kLu, "", ((lgs)object2).aI(), ((lgs)object2).cqv(), hpx.a.kXm, this.caP().kJL, lcx.qQO.esy());
        ((hpx)hms2).cvC().a(true, this.jDX);
        this.j(hms2);
        n = this.jDK.rmN;
        object3 = new lhf(200, 50);
        lgg lgg3 = new lgg(n, n2 += n3);
        hms2 = new hpe(this.kLu, "", lgg3, (lhf)object3, ((hbm)((Object)this.kLu)).jBX, lcx.qQN.esy());
        this.j(hms2);
        object3 = this.caP().kKa.jGK.kJY.kPT;
        int n7 = ((hnz.d)object3).cto() + ((hnz.d)object3).ctq();
        object2 = new lgs(n, n2 + this.jDM.H, n4, 16 + n7);
        this.jDU = new hqq(this.kLu, "", ((lgs)object2).aI(), ((lgs)object2).cqv(), this.caP().kKa, cu.c.cw());
        this.j(this.jDU);
        n = n + 4 + 15;
        object2 = new lgs(n, (n2 += 26) + this.jDM.H, n4 - 30, n5);
        hms2 = new hqy(this.kLu, "", ((lgs)object2).aI(), ((lgs)object2).cqv(), hpx.a.kXm, this.caP().kJL, lcx.qQO.esy());
        ((hpx)hms2).cvC().a(true, this.jDW);
        this.j(hms2);
        n = this.jDK.rmN;
        n2 = n2 + n3 - 20;
        object2 = new lgs(n, n2 + this.jDM.H, n4, n5);
        object3 = new hqy(this.kLu, "", ((lgs)object2).aI(), ((lgs)object2).cqv(), hpx.a.kXm, this.caP().kJL, lcx.qQP.esy());
        ((hpx)object3).cvC().a(true, this.jDV);
        this.j((hms)object3);
        this.mU(true);
    }

    public String cbq() {
        return this.jDT.chj().chz();
    }

    public void lY(String string) {
        this.jDT.chj().mN(string);
    }

    public String cbr() {
        return this.jDU.chj().chz();
    }

    public void lZ(String string) {
        this.jDU.chj().mN(string);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    private hbm caP() {
        return (hbm)((Object)this.kLu);
    }

    private static hnv.a cbs() {
        return new hnv.a(hbo.jDC, lcq.COLORSHIFT_NEUTRAL);
    }

    private void mU(boolean bl) {
        this.cqr().a(bl, this.jDY);
        this.a(bl, this.jAY, 9, jpn.nLm);
        this.jDU.cqo().a(bl, this.jDZ);
        this.jDT.cqo().a(bl, this.jEa);
    }

    public void a(lgq lgq2) {
        this.RC = lgq2;
    }

    public void LH(int n) {
        this.ij = n;
    }

    public void LI(int n) {
        this.ii = n;
    }

    @Override
    public void LB(int n) {
        Object object;
        cv[] cvArray = null;
        if ((n & 0xFF) == 4) {
            cvArray = new cv[2];
            object = new cv();
            ((cv)object).a(ct.kq);
            ((cv)object).d(this.cbq());
            cvArray[0] = object;
            cv<String> cv2 = new cv<String>();
            cv2.a(ct.kr);
            cv2.d(this.cbr());
            cvArray[1] = cv2;
            String string = null;
            switch (cu.a(this.cbq(), this.cbr(), lcw.SC, null)) {
                case lk: {
                    string = lcx.qRl.esy();
                    break;
                }
                case li: 
                case lj: {
                    string = lcx.qRk.esy();
                    break;
                }
                case lc: 
                case ld: 
                case lg: 
                case le: 
                case lf: 
                case lh: {
                    string = lcx.qRh.esy();
                    break;
                }
                case kY: 
                case la: {
                    string = lcx.qRi.esy();
                    break;
                }
                case ll: {
                    string = lcx.qRn.esy();
                    break;
                }
                case kZ: 
                case lb: {
                    string = lcx.qRj.esy();
                    break;
                }
            }
            if (string != null) {
                this.caP().lX(string);
                return;
            }
        }
        object = (efx)this.caP().jWV.cdh.rng.ik(14341);
        ((efx)object).Ea(n);
        ((efx)object).b(cvArray);
        ((dxq)object).on(lcr.qEp);
        this.caP().jWV.cdh.rnh.m(object);
    }

    protected final hbm cbo() {
        return (hbm)((Object)this.kLu);
    }

    static /* synthetic */ boolean a(hbr hbr2) {
        return hbr2.Initialized;
    }

    static /* synthetic */ hbm b(hbr hbr2) {
        return hbr2.caP();
    }

    static /* synthetic */ hqq c(hbr hbr2) {
        return hbr2.jDT;
    }

    static /* synthetic */ hqq d(hbr hbr2) {
        return hbr2.jDU;
    }

    static /* synthetic */ int e(hbr hbr2) {
        return hbr2.ii;
    }

    static /* synthetic */ lgq f(hbr hbr2) {
        return hbr2.RC;
    }

    static /* synthetic */ int g(hbr hbr2) {
        return hbr2.ij;
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class myn {
    private static final float EUl = 0.0025f;
    protected static final joi nHy = joi.nHV;
    private boolean Initialized;
    private ldv GUID;
    private s dB;
    private int gFx;
    private int gFy;
    private int EUm;
    private kfk EUn;
    private final dxs cdj = new dxs();
    private final lbn EUo = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ myn EUq;
        {
            this.EUq = myn2;
        }

        public final void W() {
            if (!$assertionsDisabled && !myn.a(this.EUq)) {
                throw new AssertionError();
            }
            lgg lgg2 = myn.b(this.EUq).D();
            int n2 = lgg2.cf - myn.c(this.EUq);
            int n3 = lgg2.cg - myn.d(this.EUq);
            myn.a(this.EUq, lgg2.cf);
            myn.b(this.EUq, lgg2.cg);
            myn.a(this.EUq, n2, n3);
        }

        static {
            $assertionsDisabled = !myn.class.desiredAssertionStatus();
        }
    };
    private final lbn EUp = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ myn EUq;
        {
            this.EUq = myn2;
        }

        public final void W() {
            if (!$assertionsDisabled && !myn.a(this.EUq)) {
                throw new AssertionError();
            }
            s.e e2 = myn.b(this.EUq).E();
            if (e2.cY == 240) {
                myn.a(this.EUq, 1, e2.cZ);
            } else if (e2.cY == 242) {
                myn.a(this.EUq, 2, e2.cZ);
            } else if (e2.cY == 241) {
                myn.a(this.EUq, 4, e2.cZ);
            } else if (e2.cY == 308 && e2.cZ) {
                myn.c(this.EUq, 120);
                myn.e(this.EUq);
            } else if (e2.cY == 309 && e2.cZ) {
                myn.c(this.EUq, -120);
                myn.e(this.EUq);
            } else {
                int n2 = e2.cZ ? 1 : 4;
                int n3 = 0;
                if (e2.da) {
                    n3 |= 4;
                }
                if (e2.db) {
                    n3 |= 2;
                }
                if (e2.dc) {
                    n3 |= 1;
                }
                myp myp2 = new myp(n2, e2.cY, n3, 0);
                myn.a(this.EUq, myp2);
            }
        }

        static {
            $assertionsDisabled = !myn.class.desiredAssertionStatus();
        }
    };

    public final void a(s s2, kfk kfk2) {
        assert (!this.Initialized);
        this.dB = s2;
        this.EUn = kfk2;
        this.GUID = lcr.qzh;
        this.Initialized = true;
        this.Aq(true);
    }

    public final void cleanup() {
        assert (this.Initialized);
        this.Aq(false);
        this.Initialized = false;
    }

    public final void eTb() {
        lgs lgs2 = this.dB.F();
        lgg lgg2 = lgs2.cfx();
        this.dB.a(lgg2);
        this.gFx = lgg2.cf;
        this.gFy = lgg2.cg;
    }

    public final lgg cqu() {
        return this.dB.D();
    }

    private void as(int n2, boolean bl) {
        fjs fjs2 = (fjs)this.cdj.CW(2838);
        fjs2.f(this.GUID);
        fjs2.on(lcr.qAE);
        fjs2.jc(0.0f);
        fjs2.jd(0.0f);
        fjs2.je(0.0f);
        fjs2.GR(bl ? 0 : n2);
        fjs2.GP(bl ? n2 : 0);
        fjs2.GQ(bl ? 0 : n2);
        this.EUn.p(fjs2);
    }

    private void b(myp myp2) {
        fjr fjr2 = (fjr)this.cdj.CW(2839);
        fjr2.f(this.GUID);
        fjr2.on(lcr.qAE);
        fjr2.a(new myp[]{myp2});
        this.EUn.p(fjr2);
    }

    private void gx(int n2, int n3) {
        if (n2 == 0 && n3 == 0) {
            return;
        }
        fjs fjs2 = (fjs)this.cdj.CW(2838);
        fjs2.f(this.GUID);
        fjs2.on(lcr.qAE);
        fjs2.jc((float)n2 * 0.0025f);
        fjs2.jd((float)n3 * 0.0025f);
        fjs2.je(0.0f);
        fjs2.GR(0);
        fjs2.GP(0);
        fjs2.GQ(0);
        this.EUn.p(fjs2);
    }

    private void eTc() {
        if (this.EUm == 0) {
            return;
        }
        fjs fjs2 = (fjs)this.cdj.CW(2838);
        fjs2.f(this.GUID);
        fjs2.on(lcr.qAE);
        fjs2.jc(0.0f);
        fjs2.jd(0.0f);
        fjs2.je(this.EUm);
        fjs2.GR(0);
        fjs2.GP(0);
        fjs2.GQ(0);
        this.EUn.p(fjs2);
    }

    private void Aq(boolean bl) {
        this.dB.G().a(bl, this.EUo);
        this.dB.H().a(bl, this.EUp);
    }

    static /* synthetic */ boolean a(myn myn2) {
        return myn2.Initialized;
    }

    static /* synthetic */ s b(myn myn2) {
        return myn2.dB;
    }

    static /* synthetic */ int c(myn myn2) {
        return myn2.gFx;
    }

    static /* synthetic */ int d(myn myn2) {
        return myn2.gFy;
    }

    static /* synthetic */ int a(myn myn2, int n2) {
        myn2.gFx = n2;
        return myn2.gFx;
    }

    static /* synthetic */ int b(myn myn2, int n2) {
        myn2.gFy = n2;
        return myn2.gFy;
    }

    static /* synthetic */ void a(myn myn2, int n2, int n3) {
        myn2.gx(n2, n3);
    }

    static /* synthetic */ void a(myn myn2, int n2, boolean bl) {
        myn2.as(n2, bl);
    }

    static /* synthetic */ int c(myn myn2, int n2) {
        myn2.EUm = n2;
        return myn2.EUm;
    }

    static /* synthetic */ void e(myn myn2) {
        myn2.eTc();
    }

    static /* synthetic */ void a(myn myn2, myp myp2) {
        myn2.b(myp2);
    }
}


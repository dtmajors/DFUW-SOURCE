/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class hjo
implements lbr {
    public static final lhf kzH = new lhf(10, 10);
    private static final hbe jzX = hbe.jAM;
    private final hjh kck;
    private final jom kzI;
    private final a[] kzJ;
    private final b[] kzK;
    private final hje[][] kzL;
    private final ldl kzM;
    public final lnu.a kzN;
    public final lnu kzO;
    public final lnu.a kzP;
    public final lnu kzQ;
    private final joq kzR;
    private final jor kzS;
    private final jor kzT;
    private final joq kzU;
    private final jor kzV;
    private final jor kzW;
    private final lbn kmr;
    private boolean Initialized;

    public hjo(hjh hjh2, jom jom2) {
        int n;
        this.kzJ = new a[hjo.kzH.rmN];
        this.kzK = new b[hjo.kzH.H];
        this.kzL = new hje[hjo.kzH.H][hjo.kzH.rmN];
        this.kzM = new ldl();
        this.kzN = new lnu.a(0, hjo.kzH.rmN - 1);
        this.kzO = this.kzN.ewm();
        this.kzP = new lnu.a(0, hjo.kzH.H - 1);
        this.kzQ = this.kzP.ewm();
        this.kzR = new joq(this){
            static final /* synthetic */ boolean $assertionsDisabled;
            final /* synthetic */ hjo kzX;
            {
                this.kzX = hjo2;
            }

            public final void a(jou jou2, float f2) {
                if (!$assertionsDisabled && jou2 != joj.nIj) {
                    throw new AssertionError();
                }
                int n = f2 < 0.0f ? -1 : 1;
                hjo.a(this.kzX, n);
            }

            static {
                $assertionsDisabled = !hjo.class.desiredAssertionStatus();
            }
        };
        this.kzS = new jor(this){
            static final /* synthetic */ boolean $assertionsDisabled;
            final /* synthetic */ hjo kzX;
            {
                this.kzX = hjo2;
            }

            public final void a(jov jov2, boolean bl) {
                if (!$assertionsDisabled && jov2 != joj.nIl) {
                    throw new AssertionError();
                }
                if (bl) {
                    hjo.a(this.kzX, -1);
                }
            }

            static {
                $assertionsDisabled = !hjo.class.desiredAssertionStatus();
            }
        };
        this.kzT = new jor(this){
            static final /* synthetic */ boolean $assertionsDisabled;
            final /* synthetic */ hjo kzX;
            {
                this.kzX = hjo2;
            }

            public final void a(jov jov2, boolean bl) {
                if (!$assertionsDisabled && jov2 != joj.nIm) {
                    throw new AssertionError();
                }
                if (bl) {
                    hjo.a(this.kzX, 1);
                }
            }

            static {
                $assertionsDisabled = !hjo.class.desiredAssertionStatus();
            }
        };
        this.kzU = new joq(this){
            static final /* synthetic */ boolean $assertionsDisabled;
            final /* synthetic */ hjo kzX;
            {
                this.kzX = hjo2;
            }

            public final void a(jou jou2, float f2) {
                if (!$assertionsDisabled && jou2 != joj.nIk) {
                    throw new AssertionError();
                }
                int n = f2 < 0.0f ? -1 : 1;
                hjo.b(this.kzX, n);
            }

            static {
                $assertionsDisabled = !hjo.class.desiredAssertionStatus();
            }
        };
        this.kzV = new jor(this){
            static final /* synthetic */ boolean $assertionsDisabled;
            final /* synthetic */ hjo kzX;
            {
                this.kzX = hjo2;
            }

            public final void a(jov jov2, boolean bl) {
                if (!$assertionsDisabled && jov2 != joj.nIn) {
                    throw new AssertionError();
                }
                if (bl) {
                    hjo.b(this.kzX, -1);
                }
            }

            static {
                $assertionsDisabled = !hjo.class.desiredAssertionStatus();
            }
        };
        this.kzW = new jor(this){
            static final /* synthetic */ boolean $assertionsDisabled;
            final /* synthetic */ hjo kzX;
            {
                this.kzX = hjo2;
            }

            public final void a(jov jov2, boolean bl) {
                if (!$assertionsDisabled && jov2 != joj.nIo) {
                    throw new AssertionError();
                }
                if (bl) {
                    hjo.b(this.kzX, 1);
                }
            }

            static {
                $assertionsDisabled = !hjo.class.desiredAssertionStatus();
            }
        };
        this.kmr = new lbn(this){
            final /* synthetic */ hjo kzX;
            {
                this.kzX = hjo2;
            }

            public final void W() {
                hjo.a(this.kzX);
            }
        };
        this.kck = hjh2;
        this.kzI = jom2;
        for (n = 0; n < hjo.kzH.H; ++n) {
            for (int i = 0; i < hjo.kzH.rmN; ++i) {
                this.kzL[n][i] = new hje(this, n, i);
            }
        }
        for (n = 0; n < hjo.kzH.rmN; ++n) {
            this.kzJ[n] = new a(this, n);
        }
        for (n = 0; n < hjo.kzH.H; ++n) {
            this.kzK[n] = new b(this, n);
        }
        this.mU(true);
        this.Initialized = true;
    }

    public void dispose() {
        int n;
        assert (this.Initialized);
        assert (this.kzM.isEmpty());
        this.mU(false);
        for (n = 0; n < hjo.kzH.rmN; ++n) {
            this.kzJ[n] = null;
        }
        for (n = 0; n < hjo.kzH.H; ++n) {
            this.kzK[n] = null;
        }
        for (n = 0; n < hjo.kzH.H; ++n) {
            for (int i = 0; i < hjo.kzH.rmN; ++i) {
                this.kzL[n][i].dispose();
                this.kzL[n][i] = null;
            }
        }
        this.Initialized = false;
    }

    public final lip MU(int n) {
        assert (this.Initialized);
        int n2 = n + 1;
        if (n2 == 10) {
            n2 = 0;
        }
        return new ljg(Integer.toString(n2));
    }

    public final String MV(int n) {
        assert (this.Initialized);
        int n2 = n + 1;
        if (n2 == 10) {
            n2 = 0;
        }
        return Integer.toString(n2);
    }

    public final lbl<lbn> cnR() {
        return this.kzM;
    }

    public final boolean cw(int n, int n2) {
        assert (this.Initialized);
        assert (n >= 0 && n < hjo.kzH.H);
        assert (n2 >= 0 && n2 < hjo.kzH.rmN);
        if (this.kzL[n][n2].cmS()) {
            this.cnU();
        }
        return true;
    }

    public final hdv cx(int n, int n2) {
        assert (this.Initialized);
        return this.kzL[n][n2].cmU();
    }

    public final hdu cy(int n, int n2) {
        assert (this.Initialized);
        return this.kzL[n][n2].cmT();
    }

    public final void a(int n, int n2, hdu hdu2) {
        assert (this.Initialized);
        if (this.kzL[n][n2].m(hdu2)) {
            this.cnU();
        }
    }

    public final void cnS() {
        assert (this.Initialized);
        int n = this.kzQ.getValue();
        int n2 = this.kzO.getValue();
        this.cz(n2, n);
    }

    public final void cz(int n, int n2) {
        assert (this.Initialized);
        hdu hdu2 = this.kzL[n2][n].cmT();
        if (hdu2 != null && hdu2.isConstructed() && hdu2.isEnabled()) {
            this.kck.n(hdu2);
        }
    }

    public final void cA(int n, int n2) {
        this.kzQ.adI(n);
        this.kzO.adI(n2);
    }

    public final void g(int n, int n2, int n3, int n4) {
        if (this.kzL[n][n2].a(this.kzL[n3][n4])) {
            this.cnU();
        }
    }

    @Override
    public boolean a(lfu lfu2) {
        boolean bl = false;
        bl |= lfu2.a("ColumnSelector", this.kzO);
        bl |= this.m(lfu2.zC("Items"));
        if (lfu2.eqA()) {
            bl |= this.cnT();
        }
        if (bl) {
            this.cnU();
        }
        return bl;
    }

    private boolean m(lfu lfu2) {
        boolean bl = false;
        for (int i = 0; i < hjo.kzH.rmN; ++i) {
            bl |= this.a(i, lfu2.zC("Col" + (i + 1)));
        }
        return bl;
    }

    private boolean a(int n, lfu lfu2) {
        boolean bl = false;
        for (int i = 0; i < hjo.kzH.H; ++i) {
            bl |= lfu2.a("Row" + (i + 1), this.kzL[i][n]);
        }
        return bl;
    }

    private boolean cnT() {
        boolean bl = false;
        for (int i = 0; i < hjo.kzH.rmN; ++i) {
            for (int j = 0; j < hjo.kzH.H; ++j) {
                hdu hdu2;
                hje hje2 = this.kzL[j][i];
                if (hje2.cmU() == null || (hdu2 = hje2.cmT()) != null && this.kck.kyz.d(hdu2) || (hdu2 = this.a(hje2.cmU(), hje2.getAttributes())) == hje2.cmT()) continue;
                hje2.m(hdu2);
                bl = true;
            }
        }
        return bl;
    }

    private void MW(int n) {
        hdu hdu2;
        assert (n == 1 || n == -1);
        int n2 = this.kzQ.getValue() + n;
        if (n2 < 0) {
            n2 = hjo.kzH.H - 1;
        } else if (n2 >= hjo.kzH.H) {
            n2 = 0;
        }
        int n3 = n2;
        while ((hdu2 = this.cy(n2, this.kzO.getValue())) == null || !hdu2.isConstructed() || !hdu2.isEnabled()) {
            if ((n2 += n) < 0) {
                n2 = hjo.kzH.H - 1;
            } else if (n2 >= hjo.kzH.H) {
                n2 = 0;
            }
            if (n2 != n3) continue;
            return;
        }
        this.kzQ.adI(n2);
        this.cnS();
    }

    private void MX(int n) {
        assert (n == 1 || n == -1);
        int n2 = this.kzO.getValue() + n;
        if (n2 < 0) {
            n2 = hjo.kzH.rmN - 1;
        } else if (n2 >= hjo.kzH.rmN) {
            n2 = 0;
        }
        this.kzO.adI(n2);
    }

    private void cnu() {
        if (this.cnT()) {
            this.cnU();
        }
    }

    private void cnU() {
        this.kzM.enp();
    }

    private hdu a(hdv hdv2, List<ej> list) {
        if (hdv2 instanceof hdx) {
            Collection<hdu> collection = hed.a(this.kck.kyz.cfh(), hdv2);
            Iterator<hdu> iterator = collection.iterator();
            if (iterator.hasNext()) {
                return iterator.next();
            }
        } else {
            assert (hdv2 instanceof hdw);
            Collection<hdu> collection = hed.a(this.kck.kyz.cfh(), hdv2);
            Iterator<hdu> iterator = collection.iterator();
            if (iterator.hasNext()) {
                return iterator.next();
            }
        }
        return null;
    }

    private void mU(boolean bl) {
        int n;
        this.kck.kyz.cfa().a(bl, this.kmr);
        this.kzI.a(bl, joj.nIk, this.kzU);
        this.kzI.a(bl, joj.nIj, this.kzR);
        this.kzI.a(bl, joj.nIl, this.kzS);
        this.kzI.a(bl, joj.nIm, this.kzT);
        this.kzI.a(bl, joj.nIn, this.kzV);
        this.kzI.a(bl, joj.nIo, this.kzW);
        for (n = 0; n < hjo.kzH.rmN; ++n) {
            this.kzI.a(bl, joj.nIp[n], this.kzJ[n]);
        }
        for (n = 0; n < hjo.kzH.H; ++n) {
            this.kzI.a(bl, joj.nIq[n], this.kzK[n]);
        }
        for (n = 0; n < hjo.kzH.rmN; ++n) {
            for (int i = 0; i < hjo.kzH.H; ++i) {
                this.kzI.a(bl, joj.nIr[n][i], this.kzL[i][n]);
            }
        }
    }

    static /* synthetic */ void a(hjo hjo2, int n) {
        hjo2.MX(n);
    }

    static /* synthetic */ void b(hjo hjo2, int n) {
        hjo2.MW(n);
    }

    static /* synthetic */ void a(hjo hjo2) {
        hjo2.cnu();
    }
}


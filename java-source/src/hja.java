/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hja
extends hpn<hdw> {
    private final lbn kmR = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hja kxg;
        {
            this.kxg = hja2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hja.b(this.kxg)) {
                throw new AssertionError();
            }
            hdw hdw2 = (hdw)this.kxg.getSelectedItem();
            if (hdw2 == null) {
                return;
            }
            if (this.kxg.kVB.H(hdw2)) {
                this.kxg.E(hdw2);
            }
        }

        static {
            $assertionsDisabled = !hja.class.desiredAssertionStatus();
        }
    };
    private final d kxe;
    public final hrk<hdw, hdw> kwH;
    private boolean Initialized;
    private a[] kxf = new a[0];
    private int[] kwK;
    private int kwL;

    protected hja(hdm hdm2, String string, lgg lgg2, lhf lhf2, d d2, lij<hdw> lij2) {
        this(hdm2, string, lgg2, lhf2, d2, new hrl<hdw>(lij2, 2));
    }

    private hja(hdm hdm2, String string, lgg lgg2, lhf lhf2, d d2, hrk<hdw, hdw> hrk2) {
        super((hnc)hdm2, string, lgg2, lhf2, d2.jGL, hrk2, new int[]{300, 150});
        this.kxe = d2;
        this.kwH = hrk2;
        this.ol(false);
    }

    public final hrk<hdw, hdw> cmP() {
        return (hrk)this.kVC;
    }

    public final void MS(int n) {
        int n2 = this.kVD.cru();
        int n3 = this.kVD.No(0);
        int n4 = n2 - n3;
        n3 = n - n4;
        n3 = Math.max(n3, this.kVA.kVK.kWj);
        this.kVD.cD(0, n3);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        for (int i = 0; i < this.kxf.length; ++i) {
            if (this.kxf[i] == null) continue;
            this.kxf[i].dispose();
            this.kxf[i] = null;
        }
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void f(int n, int n2, int n3, int n4) {
        assert (this.Initialized);
        assert (n2 >= 0 && n2 <= n4);
        assert (n >= 0 && n <= n3);
        int n5 = n3 - n + 1;
        int n6 = this.kxf.length;
        if (n5 != n6) {
            for (int i = n5; i < n6; ++i) {
                this.kxf[i].dispose();
                this.kxf[i] = null;
            }
            a[] aArray = new a[n5];
            System.arraycopy(this.kxf, 0, aArray, 0, Math.min(n6, n5));
            this.kxf = aArray;
        }
        int n7 = this.kVC.getFieldCount();
        this.kwK = new int[n7];
        this.kwL = 0;
        for (int i = 1; i < this.kwK.length; ++i) {
            int n8;
            this.kwK[i] = n8 = this.f(ldb.reo, i);
            this.kwL += n8;
        }
        super.f(n, n2, n3, n4);
    }

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        assert (this.Initialized);
        assert (lda.acc(n2 + n4));
        int n9 = n3 - n;
        hdw hdw2 = (hdw)this.NN(n + n9);
        assert (hdw2 != null);
        if (this.kxf[n9] == null || !this.g(hdw2).isAssignableFrom(this.kxf[n9].getClass())) {
            if (this.kxf[n9] != null) {
                this.kxf[n9].dispose();
            }
            a a2 = this.h(hdw2) ? new c(this, n9) : new b(this, n9);
            this.kxf[n9] = a2;
        }
        this.kwK[0] = n7 - this.kwL;
        this.kxf[n9].a(hdw2, n + n9, n5, n6, this.kwK, n7, n8);
    }

    private Class<? extends a> g(hdw hdw2) {
        return this.h(hdw2) ? c.class : b.class;
    }

    protected int a(int n, hdw hdw2) {
        assert (lda.acc(n));
        return this.h(hdw2) ? 56 : 37;
    }

    protected final boolean h(hdw hdw2) {
        return hdw2.cem() == null;
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    private void mU(boolean bl) {
        this.cvi().a(bl, this.kmR);
    }

    @Override
    protected /* synthetic */ int f(int n, Object object) {
        return this.a(n, (hdw)object);
    }

    static /* synthetic */ d a(hja hja2) {
        return hja2.kxe;
    }

    static /* synthetic */ boolean b(hja hja2) {
        return hja2.Initialized;
    }
}


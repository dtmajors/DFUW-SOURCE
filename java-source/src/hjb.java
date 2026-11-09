/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hjb
extends hpn<hdx> {
    private final lbn kmR = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hjb kxo;
        {
            this.kxo = hjb2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hjb.c(this.kxo)) {
                throw new AssertionError();
            }
            hdx hdx2 = (hdx)this.kxo.getSelectedItem();
            if (hdx2 == null) {
                return;
            }
            if (this.kxo.kVB.H(hdx2)) {
                this.kxo.E(hdx2);
            }
        }

        static {
            $assertionsDisabled = !hjb.class.desiredAssertionStatus();
        }
    };
    private final d kxi;
    public final hrk<hdx, hdx> kxj;
    private final boolean kxk;
    private boolean Initialized;
    private a[] kxl = new a[0];
    private int[] kxm;
    private int kxn;

    private hdm ciO() {
        return (hdm)this.kLu;
    }

    protected hjb(hdm hdm2, String string, lgg lgg2, lhf lhf2, d d2, boolean bl, lij<hdx> lij2) {
        this(hdm2, string, lgg2, lhf2, d2, bl, new hrl<hdx>(lij2, 2));
    }

    private hjb(hdm hdm2, String string, lgg lgg2, lhf lhf2, d d2, boolean bl, hrk<hdx, hdx> hrk2) {
        super((hnc)hdm2, string, lgg2, lhf2, d2.jGL, hrk2, new int[]{250, 150});
        this.kxi = d2;
        this.kxj = hrk2;
        this.kxk = bl;
        this.ol(false);
    }

    public final hrk<hdx, hdx> cmP() {
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
        for (int i = 0; i < this.kxl.length; ++i) {
            if (this.kxl[i] == null) continue;
            this.kxl[i].dispose();
            this.kxl[i] = null;
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
        int n6 = this.kxl.length;
        if (n5 != n6) {
            for (int i = n5; i < n6; ++i) {
                this.kxl[i].dispose();
                this.kxl[i] = null;
            }
            a[] aArray = new a[n5];
            System.arraycopy(this.kxl, 0, aArray, 0, Math.min(n6, n5));
            this.kxl = aArray;
        }
        int n7 = this.kVC.getFieldCount();
        this.kxm = new int[n7];
        this.kxn = 0;
        for (int i = 1; i < this.kxm.length; ++i) {
            int n8;
            this.kxm[i] = n8 = this.f(ldb.reo, i);
            this.kxn += n8;
        }
        super.f(n, n2, n3, n4);
    }

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        assert (this.Initialized);
        assert (lda.acc(n2 + n4));
        int n9 = n3 - n;
        hdx hdx2 = (hdx)this.NN(n3);
        assert (hdx2 != null);
        if (this.kxl[n9] == null || !this.d(hdx2).isAssignableFrom(this.kxl[n9].getClass())) {
            if (this.kxl[n9] != null) {
                this.kxl[n9].dispose();
            }
            a a2 = this.c(hdx2) ? new c(this, n9) : new b(this, n9);
            this.kxl[n9] = a2;
        }
        this.kxm[0] = n7 - this.kxn;
        this.kxl[n9].a(hdx2, n + n9, n5, n6, this.kxm, n7, n8);
    }

    protected int a(int n, hdx hdx2) {
        int n2;
        assert (lda.acc(n));
        if (this.c(hdx2)) {
            this.cbO().jXk.getClass();
            n2 = 64;
        } else {
            this.cbO().jXk.getClass();
            this.cbO().jXk.getClass();
            n2 = 10 + 40;
        }
        return n2;
    }

    protected final boolean c(hdx hdx2) {
        return !hdx2.cex();
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    private Class<? extends a> d(hdx hdx2) {
        return this.c(hdx2) ? c.class : b.class;
    }

    private void mU(boolean bl) {
        this.cvi().a(bl, this.kmR);
    }

    @Override
    protected /* synthetic */ int f(int n, Object object) {
        return this.a(n, (hdx)object);
    }

    static /* synthetic */ d a(hjb hjb2) {
        return hjb2.kxi;
    }

    static /* synthetic */ boolean b(hjb hjb2) {
        return hjb2.kxk;
    }

    static /* synthetic */ boolean c(hjb hjb2) {
        return hjb2.Initialized;
    }
}


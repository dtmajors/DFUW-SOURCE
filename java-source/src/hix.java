/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  hdm
 */
public class hix
extends hpn<bpj> {
    public static final String kwF = "gui/quest_tab/questtab_icon_";
    public static final String kwG = "gui/quest_tab/questtab_heading_";
    private final lbn kmR = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hix kwM;
        {
            this.kwM = hix2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hix.b(this.kwM)) {
                throw new AssertionError();
            }
            bpj bpj2 = (bpj)this.kwM.getSelectedItem();
            if (bpj2 == null) {
                return;
            }
            if (this.kwM.kVB.H(bpj2)) {
                this.kwM.E(bpj2);
                return;
            }
        }

        static {
            $assertionsDisabled = !hix.class.desiredAssertionStatus();
        }
    };
    public final hrk<bpj, bpj> kwH;
    private boolean Initialized;
    private final d kwI;
    private a[] kwJ = new a[0];
    private int[] kwK;
    private int kwL;

    private lhu a(bpj bpj2, String string) {
        if (!lea.enW().isDescendant(bpj2.atx(), cug.flB)) {
            return lhu.rnR;
        }
        String string2 = bpj2.atw().Name;
        if (string2 == null) {
            return lhu.rnR;
        }
        string2 = string + jry.tu(string2) + ".dds";
        return new lhu(64, 64, string2);
    }

    protected hix(hdm hdm2, String string, lgg lgg2, lhf lhf2, d d2, lij<bpj> lij2) {
        this(hdm2, string, lgg2, lhf2, d2, new hrl<bpj>(lij2, 2));
    }

    protected hix(hdm hdm2, String string, lgg lgg2, lhf lhf2, d d2, hrk<bpj, bpj> hrk2) {
        super((hnc)hdm2, string, lgg2, lhf2, d2.jGL, hrk2, new int[]{300, 150});
        this.kwI = d2;
        this.kwH = hrk2;
        this.ol(false);
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
        for (int i = 0; i < this.kwJ.length; ++i) {
            if (this.kwJ[i] == null) continue;
            this.kwJ[i].dispose();
            this.kwJ[i] = null;
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
        int n6 = this.kwJ.length;
        if (n5 != n6) {
            for (int i = n5; i < n6; ++i) {
                this.kwJ[i].dispose();
                this.kwJ[i] = null;
            }
            a[] aArray = new a[n5];
            System.arraycopy(this.kwJ, 0, aArray, 0, Math.min(n6, n5));
            this.kwJ = aArray;
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
        bpj bpj2 = (bpj)this.NN(n + n9);
        assert (bpj2 != null);
        if (this.kwJ[n9] == null || !this.c(bpj2).isAssignableFrom(this.kwJ[n9].getClass())) {
            if (this.kwJ[n9] != null) {
                this.kwJ[n9].dispose();
            }
            a a2 = this.d(bpj2) ? new c(this, n9) : new b(this, n9);
            this.kwJ[n9] = a2;
        }
        this.kwK[0] = n7 - this.kwL;
        this.kwJ[n9].a(bpj2, n + n9, n5, n6, this.kwK, n7, n8);
    }

    private Class<? extends a> c(bpj bpj2) {
        return this.d(bpj2) ? c.class : b.class;
    }

    protected int a(int n, bpj bpj2) {
        assert (lda.acc(n));
        return this.d(bpj2) ? 80 : 37;
    }

    protected final boolean d(bpj bpj2) {
        return this.kwH.lai.ad(bpj2);
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
        return this.a(n, (bpj)object);
    }

    static /* synthetic */ d a(hix hix2) {
        return hix2.kwI;
    }

    static /* synthetic */ lhu a(hix hix2, bpj bpj2, String string) {
        return hix2.a(bpj2, string);
    }

    static /* synthetic */ boolean b(hix hix2) {
        return hix2.Initialized;
    }
}


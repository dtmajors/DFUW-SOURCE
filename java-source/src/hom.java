/*
 * Decompiled with CFR.
 */
public class hom
extends hol {
    public static final int NORTH = 0;
    public static final int WEST = 1;
    public static final int CENTER = 2;
    public static final int EAST = 3;
    public static final int SOUTH = 4;
    public static final int kSD = 5;
    private final a[] kSE = new a[5];
    private boolean Initialized;

    public final hms Ny(int n) {
        assert (this.Initialized);
        if (this.kSE[n] == null) {
            return null;
        }
        return this.kSE[n].kSF;
    }

    public final void c(boolean bl, hms hms2, int n) {
        assert (this.Initialized);
        assert (this.n(hms2));
        if (bl) {
            assert (this.y(hms2) == -1);
            assert (this.kSE[n] == null);
            this.kSE[n] = new a(this, hms2);
        } else {
            assert (this.y(hms2) == n);
            this.kSE[n].destroy();
            assert (this.kSE[n] == null);
        }
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cuf() {
        int n;
        int n2;
        lhf lhf2;
        int n3 = this.getWidth();
        int n4 = this.getHeight();
        lgg lgg2 = new lgg(0, 0);
        if (this.kSE[0] != null) {
            lhf2 = this.kSE[0].kSF.cqO();
            n2 = lhf2.rmN;
            n = lhf2.H;
            if (n > n4) {
                n = n4;
            }
            lgg2 = new lgg(lgg2.cf, n);
            n4 -= n;
            n2 = n3;
            this.kSE[0].kSF.cC(n2, n);
            this.kSE[0].kSF.z(lgg.rlI);
        }
        if (this.kSE[4] != null) {
            lhf2 = this.kSE[4].kSF.cqO();
            n2 = lhf2.rmN;
            n = lhf2.H;
            if (n > n4) {
                n = n4;
            }
            n2 = n3;
            this.kSE[4].kSF.d(new lhf(n2, n));
            this.kSE[4].kSF.cB(0, lgg2.cg + (n4 -= n));
        }
        if (this.kSE[3] != null) {
            lhf2 = this.kSE[3].kSF.cqO();
            n2 = lhf2.rmN;
            n = lhf2.H;
            if (n2 > n3) {
                n2 = n3;
            }
            lgg2 = new lgg(n2, lgg2.cg);
            n3 -= n2;
            n = n4;
            this.kSE[3].kSF.cC(n2, n);
            this.kSE[3].kSF.cB(0, lgg2.cg);
        }
        if (this.kSE[1] != null) {
            lhf2 = this.kSE[1].kSF.cqO();
            n2 = lhf2.rmN;
            n = lhf2.H;
            if (n2 > n3) {
                n2 = n3;
            }
            n3 -= n2;
            n = n4;
            this.kSE[1].kSF.cC(n2, n);
            this.kSE[1].kSF.cB(lgg2.cg + n4, lgg2.cg);
        }
        if (this.kSE[2] != null) {
            this.kSE[2].kSF.cC(n3, n4);
            this.kSE[2].kSF.cB(lgg2.cf, lgg2.cg);
        }
    }

    protected hom(hnc hnc2, String string, lgg lgg2, lhf lhf2) {
        super(hnc2, string, lgg2, lhf2);
    }

    protected final void x(hms hms2) {
        int n = this.y(hms2);
        assert (n != -1);
        this.kSE[n] = null;
    }

    private int y(hms hms2) {
        for (int i = 0; i < this.kSE.length; ++i) {
            if (this.kSE[i] == null || this.kSE[i].kSF != hms2) continue;
            return i;
        }
        return -1;
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}


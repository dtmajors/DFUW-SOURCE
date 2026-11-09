/*
 * Decompiled with CFR.
 */
import java.util.List;

public class hpp
extends hpq<hni> {
    private static final int kVM = 0;
    private static final int kVU = 1;
    private static final int kVV = 2;
    private static final int jHK = 3;
    private final b kVW;
    private final lmw kVX;
    private final a kVY;
    private final lbn jJc = new lbn(this){
        final /* synthetic */ hpp kVZ;
        {
            this.kVZ = hpp2;
        }

        public final void W() {
            hpp.a(this.kVZ);
        }
    };
    private boolean Initialized;

    public hpp(hnc hnc2, String string, lgg lgg2, lhf lhf2, b b2, boolean bl, lmw lmw2) {
        this(hnc2, string, lgg2, lhf2, b2, bl, lmw2, new a());
    }

    private hpp(hnc hnc2, String string, lgg lgg2, lhf lhf2, b b2, boolean bl, lmw lmw2, a a2) {
        super(hnc2, string, lgg2, lhf2, hpp.b(b2), bl, hpp.a(b2), a2);
        this.kVW = b2;
        this.kVX = lmw2;
        this.kVY = a2;
        this.cvn();
    }

    public final int ctv() {
        return this.kVD.cru() - this.kVD.Nk(2) + this.kVW.jGY;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.cc(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.cc(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        int n = this.kVD.cru() - this.kVD.Nk(2);
        int n2 = this.getWidth() - n;
        int n3 = Math.max(n2, this.kVW.jGY);
        this.kVD.cD(2, n3);
        super.cce();
    }

    private void cvn() {
        hpp.a(this.kVY.lai, null, this.kVX);
        this.kVY.notifyChanged();
    }

    private static void a(lij<hni> lij2, hni hni2, lob lob2) {
        List<lmv> list = lob2.ewx();
        for (int i = 0; i < list.size(); ++i) {
            hni hni3 = new hni(lob2.adN(i), lob2.adO(i), list.get(i));
            lij2.d(hni3, hni2, null);
            if (!(hni3.iNF instanceof lob)) continue;
            hpp.a(lij2, hni3, (lob)hni3.iNF);
        }
    }

    private static hpq.a[] a(b b2) {
        hpq.a[] aArray = new hpq.a[]{new hpq.a(b2.jGW, b2.kVS), new hpq.a(b2.jGX, b2.kVT), new hpq.a(b2.jGZ, b2.kVT)};
        assert (aArray.length == 3);
        return aArray;
    }

    private static hpq.c b(b b2) {
        return new hpq.c(b2.jGL, b2.kVP, b2.kVQ, b2.kVR);
    }

    private void cc(boolean bl) {
        this.kVX.cec().a(bl, this.jJc);
    }

    static /* synthetic */ void a(hpp hpp2) {
        hpp2.cvn();
    }
}


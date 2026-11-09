/*
 * Decompiled with CFR.
 */
public class hpo
extends hpq<hms> {
    private static final int kVM = 0;
    private static final int kVN = 1;
    private static final int jHK = 2;
    private final lij<hms> kVO;
    private final hrk<hms, String> kxb;
    private boolean Initialized;

    public hpo(hnc hnc2, String string, lgg lgg2, lhf lhf2, b b2, lij<hms> lij2) {
        this(hnc2, string, lgg2, lhf2, b2, lij2, new a(lij2));
    }

    private hpo(hnc hnc2, String string, lgg lgg2, lhf lhf2, b b2, lij<hms> lij2, a a2) {
        super(hnc2, string, lgg2, lhf2, hpo.b(b2), true, hpo.a(b2), a2);
        this.kVO = lij2;
        this.kxb = a2;
    }

    public void b(hms hms2, hms hms3) {
        this.kVO.clear();
        hpo.a(this.kVO, hms2, hms3);
        this.kxb.notifyChanged();
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        super.FG();
        this.Initialized = false;
    }

    private static hpq.a[] a(b b2) {
        hpq.a[] aArray = new hpq.a[]{new hpq.a(400, b2.kVS), new hpq.a(150, b2.kVT)};
        assert (aArray.length == 2);
        return aArray;
    }

    private static void a(lij<hms> lij2, hms hms2, hms hms3) {
        lij2.d(hms3, hms2, null);
        if (hms3 instanceof hmt) {
            hmt hmt2 = (hmt)hms3;
            for (hms hms4 : hmt2.crn()) {
                hpo.a(lij2, hmt2, hms4);
            }
        }
    }

    private static hpq.c b(b b2) {
        return new hpq.c(b2.jGL, b2.kVP, b2.kVQ, b2.kVR);
    }
}


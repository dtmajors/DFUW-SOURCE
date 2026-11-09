/*
 * Decompiled with CFR.
 */
public class hor<ROWTYPE>
extends hoq<ROWTYPE> {
    public hor(hnc hnc2, String string, lgg lgg2, lhf lhf2, hoq.b b2, hoq.c[] cArray, int[] nArray, hrd<ROWTYPE, String> hrd2, a a2) {
        this(hnc2, string, lgg2, lhf2, b2, cArray, nArray, hrd2, hor.a(a2, hrd2.p(ldb.rep)));
    }

    private hor(hnc hnc2, String string, lgg lgg2, lhf lhf2, hoq.b b2, hoq.c[] cArray, int[] nArray, hrd<ROWTYPE, String> hrd2, hnk hnk2) {
        super(hnc2, string, lgg2, lhf2, b2, cArray, nArray, hrd2, hnk2);
    }

    @Override
    protected void FF() {
        super.FF();
        this.nb(true);
    }

    @Override
    protected void FG() {
        this.nb(false);
        super.FG();
    }

    private static hnk a(a a2, hrt hrt2) {
        switch (a2) {
            case kTh: {
                return new hnm(hrt2);
            }
            case kTi: {
                return new hno(hrt2);
            }
            case kTj: {
                return new hnn(hrt2);
            }
            case kTk: {
                return new hnl(hrt2);
            }
        }
        assert (false);
        return null;
    }

    private void nb(boolean bl) {
        assert (lda.yk(bl));
    }
}


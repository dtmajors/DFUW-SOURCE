/*
 * Decompiled with CFR.
 */
public class hon
extends hol {
    public static final int kSI = 0;
    public static final int kSJ = 1;
    public static final int kSK = 2;
    public static final int kSL = 3;
    private boolean Initialized;
    private int kSM;

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
        int n3 = this.crn().size();
        lhf lhf2 = this.cqv();
        lgs[] lgsArray = new lgs[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            hms hms2 = this.crn().get(n2);
            lgg lgg2 = hms2.cqw();
            lhf lhf3 = hms2.cqO();
            lgsArray[n2] = new lgs(lgg2, lhf3);
        }
        n2 = 0;
        for (int i = 0; i < n3; i += n) {
            int n4;
            int n5 = 0;
            n = 0;
            int n6 = 0;
            for (n4 = i; n4 < n3; ++n4) {
                if (lgsArray[n4].H > n5) {
                    n5 = lgsArray[n4].H;
                }
                if (n6 + lgsArray[n4].rmN > lhf2.rmN && n > 0) break;
                lgsArray[n4].cf = n6;
                lgsArray[n4].cg = n2;
                n6 += lgsArray[n4].rmN;
                ++n;
            }
            switch (this.kSM) {
                case 0: {
                    break;
                }
                case 2: {
                    int n7;
                    n4 = lhf2.rmN - n6;
                    assert (n4 >= 0);
                    for (n7 = i; n7 < i + n; ++n7) {
                        lgsArray[n7].cf += n4;
                    }
                    break;
                }
                case 1: {
                    int n7;
                    n4 = lhf2.rmN - n6;
                    assert (n4 >= 0);
                    n4 /= 2;
                    for (n7 = i; n7 < i + n; ++n7) {
                        lgsArray[n7].cf += n4;
                    }
                    break;
                }
                case 3: {
                    n4 = lhf2.rmN - n6;
                    assert (n4 >= 0);
                    int n7 = n4 / (n - 1);
                    int n8 = 0;
                    for (int j = i; j < i + n; ++j) {
                        lgsArray[j].cf += n8;
                        n8 += n7;
                    }
                    break;
                }
                default: {
                    assert (false) : this.kSM;
                    break;
                }
            }
            if ((n2 += n5) >= lhf2.H) break;
            n5 = 0;
        }
        for (int i = 0; i < n3; ++i) {
            hms hms3 = this.crn().get(i);
            hms3.j(lgsArray[i]);
        }
    }

    protected hon(hnc hnc2, String string, lgg lgg2, lhf lhf2) {
        super(hnc2, string, lgg2, lhf2);
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}


/*
 * Decompiled with CFR.
 */
import java.util.List;

public class hhj
extends hog {
    private final lbn krf;
    private boolean Initialized;
    private final lbp khJ = new lbp(this){
        final /* synthetic */ hhj krg;
        {
            this.krg = hhj2;
        }

        public final boolean caU() {
            hhj.a(this.krg).W();
            return true;
        }
    };

    public hhj(hnc hnc2, String string, lgg lgg2, b b2, int n, List<a> list, lbn lbn2) {
        super(hnc2, string, lgg2, lhf.rnv, b2.krh);
        int n2;
        lhf lhf2;
        int n3;
        this.krf = lbn2;
        int n4 = list.size();
        String[] stringArray = new String[n4];
        for (n3 = 0; n3 < stringArray.length; ++n3) {
            stringArray[n3] = list.get((int)n3).jHa.exA();
        }
        n3 = 0;
        int n5 = 0;
        for (int i = 0; i < stringArray.length; ++i) {
            lhf2 = this.kLu.a(b2.jHz.kiK.jFE, stringArray[i]);
            if (lhf2.H > n5) {
                n5 = lhf2.H;
            }
            if (lhf2.rmN <= n3) continue;
            n3 = lhf2.rmN;
        }
        lhf lhf3 = new lhf((int)((float)n3 * b2.krk), n5);
        lhf2 = b2.jHz.h(lhf3);
        int n6 = Math.max(n, lhf2.rmN + b2.kri.rmN * 2);
        int n7 = n2 = (n6 - lhf2.rmN) / 2;
        int n8 = b2.kri.H;
        for (int i = 0; i < n4; ++i) {
            if (i > 0) {
                n8 += b2.krj;
            }
            hqy hqy2 = new hqy(this.kLu, null, new lgg(n7, n8), lhf2, hpx.a.kXm, b2.jHz, stringArray[i]);
            this.j(hqy2);
            if (list.get((int)i).keI != null) {
                hqy2.cvC().a(true, list.get((int)i).keI);
            } else {
                hqy2.og(true);
            }
            n8 += lhf2.H;
        }
        this.cC(n6, n8 += b2.kri.H);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    private void mU(boolean bl) {
        this.a(bl, this.khJ, 27, jpn.nLm);
    }

    static /* synthetic */ lbn a(hhj hhj2) {
        return hhj2.krf;
    }
}


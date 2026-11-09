/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class hif
extends hie {
    private static final int kuY = 3;
    private static final int kuZ = 50;
    private static final Comparator<a> kva = new Comparator<a>(){

        public int a(a a2, a a3) {
            float f2 = a3.kve - a2.kve;
            if (f2 < 0.0f) {
                return -1;
            }
            if (f2 > 0.0f) {
                return 1;
            }
            return 0;
        }

        public /* synthetic */ int compare(Object object, Object object2) {
            return this.a((a)object, (a)object2);
        }
    };
    private final Map<jpf, a> kvb = new HashMap<jpf, a>();
    private boolean Initialized;
    private int kvc;

    public hif(hnc hnc2, String string, lgg lgg2, lhf lhf2, hie.a a2, lip lip2, Object object) {
        super(hnc2, string, lgg2, lhf2, a2, lip2, object);
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
        this.Initialized = false;
        super.FG();
    }

    @Override
    protected jox<jpg> a(jpl jpl2) {
        a a2 = this.kvb.get(jpl2.nLt);
        if (a2 == null) {
            a2 = new a(jpl2.nLt);
            this.kvb.put(jpl2.nLt, a2);
        }
        int n = jpl2.nLt.dOH();
        float f2 = Math.abs(jpl2.nLq);
        if (n != 0) {
            f2 /= (float)n;
        }
        a2.kve += f2;
        a[] aArray = new a[this.kvb.size()];
        this.kvb.values().toArray(aArray);
        if (aArray.length > 1) {
            Arrays.sort(aArray, kva);
            for (int i = 1; i < aArray.length; ++i) {
                assert (aArray[0].kve >= aArray[1].kve);
            }
            if (aArray[0].kve < aArray[1].kve * 3.0f) {
                return null;
            }
        }
        ++this.kvc;
        if (this.kvc < 50) {
            return null;
        }
        a2 = aArray[0];
        return new jox<jpg>(this.cbP().jWW, a2.kvd, jpb.nLm);
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}


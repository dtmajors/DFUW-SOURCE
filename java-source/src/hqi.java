/*
 * Decompiled with CFR.
 */
import java.util.List;

public class hqi
extends hqh {
    private final a kYV;
    private boolean Initialized;

    public hqi(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2, lcq lcq2, lbn lbn2) {
        super(hnc2, string, lgg2, lhf2, a2.kKx, 0.0, a2.kYW.size() - 1, false, hqi.a(a2.kYW, lcq2), 0.01f, lbn2);
        this.kYV = a2;
    }

    public final lcq cwr() {
        return this.cY(this.cum());
    }

    public final void L(lcq lcq2) {
        this.cR(hqi.a(this.kYV.kYW, lcq2));
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

    private lcq cY(double d2) {
        int n = (int)d2;
        return this.kYV.kYW.get(n);
    }

    private static float a(List<lcq> list, lcq lcq2) {
        int n = -1;
        float f2 = Float.MAX_VALUE;
        for (int i = 0; i < list.size(); ++i) {
            float f3 = list.get(i).Y(lcq2);
            if (!(f3 < f2)) continue;
            f2 = f3;
            n = i;
        }
        return n;
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}


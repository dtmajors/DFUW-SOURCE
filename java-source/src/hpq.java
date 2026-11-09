/*
 * Decompiled with CFR.
 */
public abstract class hpq<NODE>
extends hpm<NODE, String, hps<NODE, String, hpe>, hpe> {
    private final c kWa;
    private final a[] kWb;
    private boolean Initialized;

    public hpq(hnc hnc2, String string, lgg lgg2, lhf lhf2, c c2, boolean bl, a[] aArray, hrs<NODE, String> hrs2) {
        super(hnc2, string, lgg2, lhf2, c2.jGL, bl, hrs2, c2.kVR, hpq.a(aArray));
        this.kWa = c2;
        this.kWb = new a[aArray.length];
        System.arraycopy(aArray, 0, this.kWb, 0, aArray.length);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        super.FG();
        this.Initialized = false;
    }

    protected hps<NODE, String, hpe> NP(int n) {
        return new hps(this.kLu, null, lgg.rlI, lhf.rnv, this.kVA.kVK, this);
    }

    protected hpe cO(int n, int n2) {
        return new hpe(this.kLu, null, lgg.rlI, lhf.rnv, this.kWb[n2].kiK, "");
    }

    protected b<NODE> cmM() {
        return new b(this);
    }

    private static int[] a(a[] aArray) {
        int[] nArray = new int[aArray.length];
        for (int i = 0; i < nArray.length; ++i) {
            nArray[i] = aArray[i].fb;
        }
        return nArray;
    }

    @Override
    protected /* synthetic */ hms NC(int n) {
        return this.NP(n);
    }

    @Override
    protected /* synthetic */ hoj.a cmN() {
        return this.cmM();
    }

    @Override
    protected /* synthetic */ hms cJ(int n, int n2) {
        return this.cO(n, n2);
    }

    static /* synthetic */ c a(hpq hpq2) {
        return hpq2.kWa;
    }
}


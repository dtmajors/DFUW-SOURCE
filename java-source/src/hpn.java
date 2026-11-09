/*
 * Decompiled with CFR.
 */
public abstract class hpn<NODE>
extends hpm<NODE, NODE, hps<NODE, NODE, hms>, hms> {
    private boolean Initialized;

    public hpn(hnc hnc2, String string, lgg lgg2, lhf lhf2, hpm.b b2, hrs<NODE, NODE> hrs2, int[] nArray) {
        super(hnc2, string, lgg2, lhf2, b2, true, hrs2, 0, nArray);
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

    protected hps<NODE, NODE, hms> NP(int n) {
        return new hps(this.kLu, null, lgg.rlI, lhf.rnv, this.kVA.kVK, this);
    }

    protected hpa cQ(int n, int n2) {
        assert (lda.acc(n + n2));
        return null;
    }

    protected a<NODE> cvm() {
        return new a(this);
    }

    protected abstract void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

    @Override
    protected /* synthetic */ hms NC(int n) {
        return this.NP(n);
    }

    @Override
    protected /* synthetic */ hoj.a cmN() {
        return this.cvm();
    }

    @Override
    protected /* synthetic */ hms cJ(int n, int n2) {
        return this.cQ(n, n2);
    }
}


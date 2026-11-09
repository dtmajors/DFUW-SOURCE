/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hir
extends hpd
implements hma {
    private boolean Initialized;

    public hir(hnc hnc2, String string, lgg lgg2, lhf lhf2, hpd.a a2, boolean bl, boolean bl2) {
        super(hnc2, string, lgg2, lhf2, a2, bl, bl2);
    }

    public boolean a(hce hce2, boolean bl) {
        hmt hmt2 = this.cbO().jZG.cpN();
        if (hmt2 != this) {
            return false;
        }
        if (!bl) {
            int n = this.I(this.cqu());
            if (n == -1 || n >= this.kUx.size()) {
                n = this.kUx.size();
            }
            int n2 = this.d(hce2.kZG);
            this.kUx.remove(hce2);
            if (n >= n2) {
                --n;
            }
            hce2.c(this);
            this.kUx.add(n, hce2);
            this.T(-1, false);
            this.T(n, true);
        }
        return true;
    }

    @Override
    public boolean b(hms hms2) {
        return hms2 instanceof hce;
    }

    @Override
    public void cge() {
    }

    @Override
    public void cgf() {
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
    protected hqx a(hmi hmi2, String string) {
        return new hce(this.cbO(), string, hmi2, this.kUw.kUF, this.kUz, this.kUA);
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}


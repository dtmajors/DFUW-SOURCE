/*
 * Decompiled with CFR.
 */
public class hoh
extends hoe {
    private boolean Initialized;
    private a kSa;

    public hoh(hnc hnc2, String string, lgg lgg2, lhf lhf2, hoe.a a2, boolean bl, boolean bl2, boolean bl3, boolean bl4, lbn lbn2, String string2) {
        super(hnc2, string, lgg2, lhf2, a2, bl, bl2, bl3, bl4, lbn2, string2);
    }

    public final void a(a a2) {
        assert (a2 != null);
        assert (!this.Initialized);
        assert (this.kSa == null);
        this.kSa = a2;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        assert (this.kSa != null);
        this.Initialized = true;
        super.FF();
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected boolean ctR() {
        return this.kSa.ccs();
    }

    @Override
    protected boolean ccA() {
        if (this.kSa == null) {
            return false;
        }
        return this.kSa.isValid();
    }

    @Override
    protected boolean ccz() {
        return this.kSa.cct();
    }

    @Override
    protected void ccx() {
        this.kSa.ccp();
    }

    @Override
    protected void ctS() {
        this.kSa.ccq();
    }

    @Override
    protected void ccy() {
        this.kSa.ccr();
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}


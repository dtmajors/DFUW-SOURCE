/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hio
extends hpc {
    private boolean Initialized;

    public hio(hdm hdm2, String string, lgg lgg2, lhf lhf2, a a2, boolean bl, boolean bl2) {
        this(hdm2, string, lgg2, lhf2, a2, hio.a(hdm2, a2.kvA, bl, bl2));
    }

    public hio(hdm hdm2, String string, lgg lgg2, lhf lhf2, a a2, hpd hpd2) {
        super((hnc)hdm2, string, lgg2, lhf2, a2, hpd2);
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

    private static hpd a(hdm hdm2, hpd.a a2, boolean bl, boolean bl2) {
        hir hir2 = new hir((hnc)hdm2, null, lgg.rlI, new lhf(0, a2.kUD), a2, bl, bl2);
        return hir2;
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}


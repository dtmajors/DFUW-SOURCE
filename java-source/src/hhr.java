/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hhr
extends hmt {
    private final hej ktw;
    private final hpa ktx;
    private boolean Initialized;

    public hhr(hnc hnc2, String string, hej hej2) {
        super(hnc2, string, hej2.kec, hej2.ked.kLY);
        this.ktw = hej2;
        hpa hpa2 = new hpa(hnc2, (String)null, lgg.rlI, null, hej2.kee);
        this.j(hpa2);
        this.ktx = new hpa(hnc2, (String)null, lgg.rlI, null, hej2.ked);
        this.j(this.ktx);
    }

    public final void nF(boolean bl) {
        this.ktx.nR(bl);
    }

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
    protected void ccc() {
        assert (this.Initialized);
        super.ccc();
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}


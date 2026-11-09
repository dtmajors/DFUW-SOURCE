/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcw
 *  lcy
 */
public class hgb
extends hio {
    private boolean Initialized;

    public hgb(hdm hdm2, String string, lgg lgg2, lhf lhf2, joz joz2, lbn lbn2) {
        super(hdm2, string, lgg2, lhf2, hdm2.kKI, false, false);
        this.a(new a(hdm2, joz2, joj.nHX, lcy.qVt, lbn2));
        this.a(new a(hdm2, joz2, joj.nHY, lcy.qVu, lbn2));
        this.a(new a(hdm2, joz2, joj.nHW, lcy.qVs, lbn2));
        this.a(new a(hdm2, joz2, joj.nHZ, lcy.qVv, lbn2));
        this.a(new a(hdm2, joz2, joj.nIc, lcy.qVy, lbn2));
        if (lcw.SC.ordinal() >= hc.aaA.ordinal()) {
            this.a(new a(hdm2, joz2, joj.nIa, lcy.qVw, lbn2));
        }
        if (this.kUg.getTabCount() > 0) {
            this.kUg.T(0, false);
        }
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

    private void mU(boolean bl) {
        lda.yk(bl);
    }
}


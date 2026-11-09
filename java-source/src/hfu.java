/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  hlv
 */
public class hfu
extends hlt {
    private final hhz kkY;
    private boolean Initialized;

    public hfu(hdm hdm2, String string) {
        super((hlv)hdm2, string, false);
        this.kkY = new hhz(hdm2, null, lgg.rlI);
        this.j(this.kkY);
        this.chf();
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
    protected boolean d(hms hms2) {
        assert (this.Initialized);
        assert (hms2 != null);
        if (super.d(hms2)) {
            return true;
        }
        if (this.a(this.cqu(), hpv.class) != null) {
            return false;
        }
        if (hms2 instanceof hcc) {
            return true;
        }
        if (hms2 instanceof hcd) {
            return true;
        }
        return hms2 instanceof hgu;
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        super.cce();
        this.chf();
    }

    @Override
    protected void cis() {
        assert (this.Initialized);
        if (this.cbO().cdw()) {
            super.cis();
        } else {
            this.p(null);
        }
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    private void chf() {
        this.kkY.cB(this.cqD().l((lhf)this.kkY.cqv()).cf, 0);
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}


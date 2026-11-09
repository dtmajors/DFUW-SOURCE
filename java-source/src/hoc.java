/*
 * Decompiled with CFR.
 */
import java.util.List;

public class hoc
extends hob
implements hma {
    private boolean Initialized;

    public hoc(hnc hnc2, String string, lhf lhf2, boolean bl) {
        super(hnc2, string, lhf2, bl);
    }

    public final hpv ctM() {
        assert (this.Initialized);
        List<hms> list = this.crn();
        for (int i = list.size() - 1; i > 0; --i) {
            hms hms2 = list.get(i);
            if (!(hms2 instanceof hpv) || !hms2.isInitialized()) continue;
            return (hpv)hms2;
        }
        return null;
    }

    public final void b(hpv hpv2) {
        assert (this.Initialized);
        assert (hpv2 != null);
        hpv2.c(this);
        this.a((hms)hpv2, (float)this.kLu.crO());
    }

    @Override
    public final boolean b(hms hms2) {
        return this.d(hms2);
    }

    @Override
    public final void cge() {
        this.ctN();
    }

    @Override
    public final void cgf() {
        this.ctO();
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
        this.Initialized = false;
        super.FG();
    }

    @Override
    protected void cbM() {
        hpv hpv2;
        assert (this.Initialized);
        if (this.crp() instanceof hpv && (hpv2 = this.a(this.cqu(), hpv.class)) == null) {
            this.p(null);
        }
        super.cbM();
    }

    @Override
    protected void cis() {
        assert (this.Initialized);
        super.cis();
        hpv hpv2 = this.ctM();
        if (hpv2 != null) {
            this.p(hpv2);
        }
    }

    protected boolean d(hms hms2) {
        assert (this.Initialized);
        assert (hms2 != null);
        return hms2 instanceof hpv;
    }

    protected void ctN() {
    }

    protected void ctO() {
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}


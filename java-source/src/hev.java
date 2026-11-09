/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hev
extends hen {
    private boolean Initialized;

    public hev(hdm hdm2, String string, lgg lgg2, lhf lhf2, hen.f f2, lip lip2) {
        super(hdm2, string, lgg2, lhf2, f2, new hen.d(lip2), new hen.e(true), new hen.c(true));
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

    @Override
    protected lcu cfR() {
        assert (this.Initialized);
        lgg lgg2 = this.cqu();
        hms hms2 = this.a(lgg2, hms.class);
        if (hms2 != null) {
            if (this.a(hms2)) {
                return hms2.cqJ();
            }
            return this.kLu.kNw;
        }
        return super.cfR();
    }

    @Override
    protected void cbM() {
        assert (this.Initialized);
        lgg lgg2 = this.cqu();
        hms hms2 = this.a(lgg2, hms.class);
        if (hms2 != null) {
            if (this.a(hms2)) {
                super.cbM();
                return;
            }
            this.cfI();
        }
    }

    protected hdm cbO() {
        return (hdm)this.kLu;
    }

    protected hec cbP() {
        return this.cbO().cbP();
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hew
extends hen {
    private final hpe kfS;
    private final hpx jCx;
    private boolean Initialized;
    private final lbp jAY = new lbp(this){
        final /* synthetic */ hew kfU;
        {
            this.kfU = hew2;
        }

        public final boolean caU() {
            hew.a(this.kfU).cdH();
            return true;
        }
    };
    private final lbn kfT = new lbn(this){
        final /* synthetic */ hew kfU;
        {
            this.kfU = hew2;
        }

        public final void W() {
        }
    };

    public hew(hdm hdm2, String string, lgg lgg2, lhf lhf2) {
        super(hdm2, string, lgg2, lhf2, hdm2.jXJ, new hnu.b[0]);
        this.kfS = new hpe(this.kLu, "TextField", lgg.rlI, new lhf(100, 16), this.cbO().kIY, "Test");
        this.j(this.kfS);
        this.jCx = new hqw(this.kLu, "Button", lgg.rlI, new lhf(100, 32), hpx.a.kXm, this.cbO().kJJ);
        this.j(this.jCx);
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

    @Override
    protected lcu cfR() {
        assert (this.Initialized);
        if (this.cgd()) {
            return this.kLu.kNw;
        }
        return super.cfR();
    }

    @Override
    protected void cbM() {
        assert (this.Initialized);
        if (this.cgd()) {
            this.cbO().jZG.a(this, this.kLu.crN());
        }
        super.cbM();
    }

    private hdm cbO() {
        return (hdm)this.kLu;
    }

    private boolean cgd() {
        assert (this.Initialized);
        return this.b(this.cqu(), hpx.class) == null;
    }

    private void mU(boolean bl) {
        this.a(bl, this.jAY, 27, jpn.nLm);
        this.jCx.cvC().a(bl, this.kfT);
    }

    static /* synthetic */ hdm a(hew hew2) {
        return hew2.cbO();
    }
}


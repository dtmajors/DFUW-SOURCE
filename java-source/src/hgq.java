/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.List;

public class hgq
extends hgs {
    public final hdu kmX;
    public final boolean koT;
    private final lbn kaO = new lbn(this){
        final /* synthetic */ hgq koU;
        {
            this.koU = hgq2;
        }

        public final void W() {
            if (hgq.b(this.koU)) {
                this.koU.cjI();
            }
        }
    };
    private final lbn jEQ = new lbn(this){
        final /* synthetic */ hgq koU;
        {
            this.koU = hgq2;
        }

        public final void W() {
            if (hgq.b(this.koU)) {
                this.koU.cjJ();
            }
        }
    };
    private boolean Initialized;

    protected hgq(hdm hdm2, String string, lgg lgg2, lhf lhf2, hdu hdu2, hdv hdv2, boolean bl, boolean bl2, boolean bl3) {
        super(hdm2, string, lgg2, lhf2, hdv2, bl, bl2);
        assert (hdu2 == null || hdu2.kaW.c(hdv2));
        this.kmX = hdu2;
        this.koT = bl3;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
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
    protected void cbM() {
        assert (this.Initialized);
        super.cbM();
        if (this.kLu.csd() && this.kmX != null) {
            if (this.kaW.awQ()) {
                this.cbP().kck.n(this.kmX);
            } else {
                this.kLu.a(this.cbO().kIn.kEA);
            }
        }
    }

    @Override
    protected void aV(List<hnt> list) {
        this.cbO().a(this.kmX, this.kaW, list);
    }

    @Override
    public String toString() {
        return null;
    }

    protected void cjI() {
        assert (this.Initialized);
        hmz hmz2 = this.cbO().jZG;
        if (hmz2.cpS() && hmz2.cpL() == this) {
            hmz2.cpK();
        }
        if (this.koT) {
            this.remove();
        }
    }

    protected void cjJ() {
        assert (this.Initialized);
        this.cjQ();
        this.layout();
    }

    private void mU(boolean bl) {
        if (this.kmX != null) {
            this.kmX.ceb().a(bl, this.kaO);
            this.kmX.cec().a(bl, this.jEQ);
        }
    }

    static /* synthetic */ boolean b(hgq hgq2) {
        return hgq2.Initialized;
    }
}


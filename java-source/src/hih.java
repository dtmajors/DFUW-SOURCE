/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hih
extends hpw {
    private boolean Initialized;

    public hih(hdm hdm2, String string, int n, bpj bpj2) {
        super((hnc)hdm2, string, lgg.rlI, lhf.rnv, hpw.kWV);
        int n2 = 0;
        int n3 = 8;
        int n4 = n2;
        Object object = hdm2.kJb;
        String string2 = bpj2.atv().esy();
        int n5 = hdm2.a(((hpe.c)object).jFE, string2, true, n, true);
        hpe hpe2 = new hpe((hnc)hdm2, null, new lgg(n3, n4), new lhf(n, n5), (hpe.c)object, string2);
        this.j(hpe2);
        n4 += n5;
        object = new lhf(64, 64);
        int n6 = 10;
        n5 = 10;
        int n7 = n3;
        int n8 = n4 += n2;
        boolean bl = false;
        les les2 = lea.enW();
        this.d(new lhf(n3 + n + n3, n4 += n2));
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
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

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hjc
extends hpq<hdx> {
    private final lcq kxa;
    private final lij<hdx> kki;
    private final hrk<hdx, String> kxb;
    private boolean Initialized;

    protected hjc(hdm hdm2, String string, lgg lgg2, lhf lhf2, lij<hdx> lij2, lcq lcq2) {
        this(hdm2, string, lgg2, lhf2, lij2, lcq2, new a(lij2));
    }

    protected hjc(hdm hdm2, String string, lgg lgg2, lhf lhf2, lij<hdx> lij2, lcq lcq2, hrk<hdx, String> hrk2) {
        super((hnc)hdm2, string, lgg2, lhf2, hdm2.kKF, true, new hpq.a[]{new hpq.a(250, hdm2.kIy)}, hrk2);
        this.kxa = lcq2;
        this.kki = lij2;
        this.kxb = hrk2;
    }

    public final void cmK() {
        this.kxb.notifyChanged();
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        super.FG();
        this.Initialized = false;
    }

    protected b cmQ() {
        return new b(this);
    }

    @Override
    protected /* synthetic */ hpq.b cmM() {
        return this.cmQ();
    }

    @Override
    protected /* synthetic */ hoj.a cmN() {
        return this.cmQ();
    }
}


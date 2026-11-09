/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hiy
extends hpq<hdw> {
    private final lcq kxa;
    private final hea kkC;
    private final lij<hdw> kki;
    private final hrk<hdw, String> kxb;
    private boolean Initialized;

    protected hiy(hdm hdm2, String string, lgg lgg2, lhf lhf2, lij<hdw> lij2, hea hea2, lcq lcq2) {
        this(hdm2, string, lgg2, lhf2, lij2, hea2, lcq2, new a(lij2));
    }

    protected hiy(hdm hdm2, String string, lgg lgg2, lhf lhf2, lij<hdw> lij2, hea hea2, lcq lcq2, hrk<hdw, String> hrk2) {
        super((hnc)hdm2, string, lgg2, lhf2, hdm2.kKF, true, new hpq.a[]{new hpq.a(250, hdm2.kIy)}, hrk2);
        this.kkC = hea2;
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

    protected b cmL() {
        return new b(this);
    }

    @Override
    protected /* synthetic */ hpq.b cmM() {
        return this.cmL();
    }

    @Override
    protected /* synthetic */ hoj.a cmN() {
        return this.cmL();
    }

    static /* synthetic */ lij a(hiy hiy2) {
        return hiy2.kki;
    }

    static /* synthetic */ hea b(hiy hiy2) {
        return hiy2.kkC;
    }

    static /* synthetic */ lcq c(hiy hiy2) {
        return hiy2.kxa;
    }
}


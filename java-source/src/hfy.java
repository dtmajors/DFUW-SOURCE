/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hfy
extends hmt {
    private final lbn kly = new lbn(this){
        final /* synthetic */ hfy klz;
        {
            this.klz = hfy2;
        }

        public final void W() {
            hfy.a(this.klz);
        }
    };
    private boolean Initialized;

    public hfy(hdm hdm2, String string) {
        this(hdm2, string, hdm2.jXk.jOC);
    }

    private hfy(hdm hdm2, String string, lhf lhf2) {
        super((hnc)hdm2, string, hfy.a(hdm2, lhf2), lhf2);
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
    protected boolean co(int n, int n2) {
        return false;
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    private void chf() {
        lhf lhf2 = this.cqv();
        lgg lgg2 = hfy.a(this.cbO(), lhf2);
        this.z(lgg2);
    }

    private static lgg a(hdm hdm2, lhf lhf2) {
        lgs lgs2 = hdm2.cbP().jWK.cqE();
        lgs2.cf = 0;
        lgs2.cg = 0;
        return lgs2.l(lhf2);
    }

    private void mU(boolean bl) {
        this.cbP().jWK.cwO().a(bl, this.kly);
    }

    static /* synthetic */ void a(hfy hfy2) {
        hfy2.chf();
    }
}


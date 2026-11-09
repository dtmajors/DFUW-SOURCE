/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class her
extends hen {
    private final hmt kfo;
    private final hhb kfK;
    private boolean Initialized;
    private final lbn kfL = new lbn(this){
        final /* synthetic */ her kfN;
        {
            this.kfN = her2;
        }

        public final void W() {
            if (her.a(this.kfN) == null) {
                lfn.b(5, this.getClass().getSimpleName(), "observeEvent() : MainMenuComponent is null!");
                return;
            }
            if (!this.kfN.kLu.csd()) {
                return;
            }
            her.a(this.kfN).cki();
            this.kfN.d(her.b(this.kfN));
            if (her.a(this.kfN).isExpanded()) {
                int n = this.kfN.cqw().cf;
                int n2 = this.kfN.cqw().cg;
                int n3 = this.kfN.cbO().jZH.getWidth() - (n + her.a(this.kfN).getWidth());
                if (n3 < 0) {
                    this.kfN.a(new lgg(n + n3, n2), (float)this.kfN.cbO().crO());
                }
            }
        }
    };
    private boolean kfM = false;

    public her(hdm hdm2, String string, lgg lgg2) {
        this(hdm2, string, lgg2, hdm2.jXX);
    }

    private her(hdm hdm2, String string, lgg lgg2, hen.f f2) {
        super(hdm2, string, lgg2, lhf.rnv, f2, new hen.e(true), new hlw.a(true), new hen.c(true));
        this.kfo = new hmt((hnc)hdm2, null, lgg.rlI, lhf.rnv);
        this.w(this.kfo);
        this.kfK = new hhb(hdm2, (String)null, lgg.rlI, this.kfL);
        this.kfo.j(this.kfK);
        this.d(this.cfY());
    }

    private final lhf cfY() {
        if (this.kfK == null) {
            return lhf.rnv;
        }
        return this.kfK.cqv();
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.nb(true);
        this.refresh();
        this.cfD();
        this.nj(false);
        this.cn(6, 12);
        this.cm(7, 50);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.nb(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cbu() {
        super.cbu();
    }

    @Override
    protected void cbM() {
        lgs lgs2;
        assert (this.Initialized);
        if (!this.kLu.csd() && (lgs2 = new lgs(2, 2, 50, 50)).A(this.cqu())) {
            this.cfI();
        }
        super.cbM();
    }

    @Override
    protected void cbv() {
        this.kfM = false;
        super.cbv();
    }

    @Override
    protected void ccc() {
        assert (this.Initialized);
        super.ccc();
    }

    @Override
    protected void cce() {
        super.cce();
        this.refresh();
    }

    private void refresh() {
        this.d(this.cfY());
    }

    protected hdm cbO() {
        return (hdm)this.kLu;
    }

    protected hec cbP() {
        return this.cbO().cbP();
    }

    private void nb(boolean bl) {
    }

    static /* synthetic */ hhb a(her her2) {
        return her2.kfK;
    }

    static /* synthetic */ lhf b(her her2) {
        return her2.cfY();
    }
}


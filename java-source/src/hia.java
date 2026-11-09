/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
public class hia
extends how {
    private static final a[] kuz = new a[]{new a(new lgg(11, 72), hjh.kxY), new a(new lgg(11, 86), hjh.kxZ), new a(new lgg(11, 100), hjh.kya), new a(new lgg(11, 114), hjh.kyb), new a(new lgg(11, 236), hjh.kyc), new a(new lgg(11, 250), hjh.kyd), new a(new lgg(166, 72), hjh.kyg), new a(new lgg(166, 86), hjh.kye), new a(new lgg(166, 100), hjh.kyf), new a(new lgg(166, 114), hjh.kym), new a(new lgg(166, 138), hjh.kyh), new a(new lgg(166, 152), hjh.kyj), new a(new lgg(166, 166), hjh.kyk), new a(new lgg(166, 180), hjh.kyn), new a(new lgg(166, 204), hjh.kyl), new a(new lgg(166, 218), hjh.kyo), new a(new lgg(166, 232), hjh.kyi), new a(new lgg(166, 256), hjh.kyp), new a(new lgg(166, 270), hjh.kyq)};
    private final hpe kuA;
    private final hpe kuB;
    private final hpe kuC;
    private final hpe kuD;
    private final lbn kuE = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hia kuF;
        {
            this.kuF = hia2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hia.a(this.kuF)) {
                throw new AssertionError();
            }
            this.kuF.cmc();
        }

        static {
            $assertionsDisabled = !hia.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;

    public hia(hdm hdm2, String string, lgg lgg2, lhf lhf2) {
        super((hnc)hdm2, string, lgg2, lhf2, hdm2.jYo);
        this.kuA = new hpe(this.kLu, null, hdm2.jXk.jRw, hdm2.jXk.jRx, this.cbO().kIQ, "");
        this.j(this.kuA);
        this.kuB = new hpe(this.kLu, null, hdm2.jXk.jRD, hdm2.jXk.jRG, this.cbO().kIQ, lcy.rco.esy());
        this.j(this.kuB);
        this.kuC = new hpe(this.kLu, null, hdm2.jXk.jRE, hdm2.jXk.jRG, this.cbO().kIQ, lcy.rcp.esy());
        this.j(this.kuC);
        this.kuD = new hpe(this.kLu, null, hdm2.jXk.jRF, hdm2.jXk.jRG, this.cbO().kIQ, lcy.rcq.esy());
        this.j(this.kuD);
        for (a a2 : kuz) {
            String string2 = null;
            lgg lgg3 = a2.kec;
            lhf lhf3 = hdm2.jXk.jRy;
            hdm2.jXk.getClass();
            hdm2.jXk.getClass();
            hib hib2 = new hib(hdm2, string2, lgg3, lhf3, 80, 4, a2.kuG.Name, a2.kuG.kbJ, a2.kuG.bZO);
            this.j(hib2);
        }
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
        this.cmc();
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
        return this.kLu.kNw;
    }

    @Override
    protected void cbM() {
        assert (this.Initialized);
        this.cio().cfI();
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    protected final void cmc() {
        assert (this.Initialized);
        this.kuA.mV(this.cbP().kck.hl());
    }

    private hen cio() {
        return (hen)this.cqt();
    }

    private void mU(boolean bl) {
        this.cbP().kck.kyN.AM(hjh.kxO.Name).cec().a(bl, this.kuE);
    }

    static /* synthetic */ boolean a(hia hia2) {
        return hia2.Initialized;
    }
}


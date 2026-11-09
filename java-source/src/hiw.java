/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
public class hiw
extends hmt {
    private final hpe kwy;
    private final hqt kwz;
    private final hqt kwA;
    private final hfq kwB;
    private final lbn kwC = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hiw kwE;
        {
            this.kwE = hiw2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hiw.a(this.kwE)) {
                throw new AssertionError();
            }
            boolean bl = hiw.b(this.kwE).cvE();
            bl = !bl;
            this.kwE.cbP().kcd.nN(bl);
        }

        static {
            $assertionsDisabled = !hiw.class.desiredAssertionStatus();
        }
    };
    private final lbn kwD = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hiw kwE;
        {
            this.kwE = hiw2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hiw.a(this.kwE)) {
                throw new AssertionError();
            }
            hiw.c(this.kwE);
        }

        static {
            $assertionsDisabled = !hiw.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;

    public static final lhf l(hdm hdm2) {
        int n = hdm2.jXk.jMU.rmN;
        hdm2.jXk.getClass();
        int n2 = n + 16 + hdm2.jXk.jMU.rmN;
        hdm2.jXk.getClass();
        int n3 = 16 + hdm2.jXk.jMU.H;
        hdm2.jXk.getClass();
        return new lhf(n2, n3 + 32);
    }

    public hiw(hdm hdm2, String string, lgg lgg2, lhf lhf2) {
        super((hnc)hdm2, string, lgg2, lhf2);
        int n = hdm2.jXk.jMU.rmN;
        hdm2.jXk.getClass();
        lhf lhf3 = new lhf(n, 16);
        int n2 = hdm2.jXk.jMU.rmN;
        hdm2.jXk.getClass();
        lhf lhf4 = new lhf(n2, 32);
        Object object = new hpa((hnc)hdm2, (String)null, new lgg(0, 0), lhf3, hdm2.jXk.jMY);
        this.j((hms)object);
        object = new hpe((hnc)hdm2, null, new lgg(0, 0), lhf3, hdm2.kIA, "You Offer");
        this.j((hms)object);
        object = new hgm(hdm2, null, new lgg(0, lhf3.H), hdm2.jXk.jMU, hdm2.kID, hdm2.cbP().kcd.coJ(), null);
        this.j((hms)object);
        String string2 = null;
        int n3 = lhf3.rmN;
        hdm2.jXk.getClass();
        object = new hpa((hnc)hdm2, string2, new lgg(n3 + 16, 0), lhf3, hdm2.jXk.jMY);
        this.j((hms)object);
        String string3 = null;
        int n4 = lhf3.rmN;
        hdm2.jXk.getClass();
        this.kwy = new hpe((hnc)hdm2, string3, new lgg(n4 + 16, 0), lhf3, hdm2.kIA, "");
        this.j(this.kwy);
        String string4 = null;
        int n5 = lhf3.rmN;
        hdm2.jXk.getClass();
        object = new hgm(hdm2, string4, new lgg(n5 + 16, lhf3.H), hdm2.jXk.jMU, hdm2.kID, hdm2.cbP().kcd.coL(), null);
        this.j((hms)object);
        object = new hpw.a(hdm2.jXk.jMZ, lcq.COLORSHIFT_NEUTRAL);
        hms hms2 = new hpw((hnc)hdm2, null, new lgg(0, lhf3.H + hdm2.jXk.jMU.H), lhf4, (hpw.a)object);
        this.j(hms2);
        String string5 = null;
        hdm2.jXk.getClass();
        lgg lgg3 = new lgg(4, 0);
        int n6 = lhf4.rmN;
        hdm2.jXk.getClass();
        this.kwz = new hqt((hnc)hdm2, string5, lgg3, new lhf(n6 - 4, lhf4.H), hdm2.kJI, "Accept");
        hms2.j(this.kwz);
        String string6 = null;
        int n7 = lhf4.rmN;
        hdm2.jXk.getClass();
        hms2 = new hpw((hnc)hdm2, string6, new lgg(n7 + 16, lhf3.H + hdm2.jXk.jMU.H), lhf4, (hpw.a)object);
        this.j(hms2);
        String string7 = null;
        hdm2.jXk.getClass();
        lgg lgg4 = new lgg(4, 0);
        int n8 = lhf4.rmN;
        hdm2.jXk.getClass();
        this.kwA = new hqt((hnc)hdm2, string7, lgg4, new lhf(n8 - 4, lhf4.H), hdm2.kJI, "Accepted");
        hms2.j(this.kwA);
        this.kwA.og(true);
        hms2 = new hpa((hnc)hdm2, (String)null, new lgg(lhf3.rmN, 0), hdm2.jXk.jNa.kLY, hdm2.jXk.jNa);
        this.j(hms2);
        String string8 = null;
        int n9 = lhf4.rmN;
        hdm2.jXk.getClass();
        this.kwB = new hfq(hdm2, string8, new lgg(n9 + 16 + lhf4.rmN - hdm2.jXk.jMW.rmN, lhf3.H + hdm2.jXk.jMU.H + (lhf4.H - hdm2.jXk.jMW.H) / 2), hdm2.jXk.jMW, false, lcy.qYC, this.cmJ());
        this.j(this.kwB);
    }

    private lip cmJ() {
        hjz hjz2 = this.cbP().kcd;
        return lcy.qYD.a(new ljn(hjz2.coO()), new ljn(hjz2.cfj()));
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
        this.refresh();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        this.Initialized = false;
        super.FG();
    }

    @Override
    protected lcu cfR() {
        assert (this.Initialized);
        if (this.cbP().kcd.coN()) {
            return this.cbO().kNy;
        }
        return super.cfR();
    }

    private void refresh() {
        hjz hjz2 = this.cbP().kcd;
        this.kwz.on(hjz2.coK());
        this.kwB.mZ(hjz2.coO() > hjz2.cfj());
        this.kwB.g(this.cmJ());
        lip lip2 = hjz2.coP();
        this.kwy.mV(lcy.rbM.a(lip2).esy());
        boolean bl = hjz2.coM();
        this.kwA.nR(!bl);
        this.kwA.on(bl);
        this.kwA.setText(lcy.rbN.a(lip2).esy());
        if (this.cbO().cdw()) {
            this.kLu.csh();
        }
    }

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    protected final hec cbP() {
        return this.cbO().cbP();
    }

    private void mU(boolean bl) {
        this.cbP().kcd.coH().a(bl, this.kwD);
        this.kwz.cvC().a(bl, this.kwC);
    }

    static /* synthetic */ boolean a(hiw hiw2) {
        return hiw2.Initialized;
    }

    static /* synthetic */ hqt b(hiw hiw2) {
        return hiw2.kwz;
    }

    static /* synthetic */ void c(hiw hiw2) {
        hiw2.refresh();
    }
}


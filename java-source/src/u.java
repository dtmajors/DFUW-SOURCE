/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bz
 *  lcr
 *  lcw
 */
public class u
extends t {
    private boolean dh = true;
    private int di = 0;
    private int dj = 0;
    private String dk;
    private jsa dl = null;
    private final ag dm = new ag(this){
        final /* synthetic */ u dn;
        {
            this.dn = u2;
        }

        public void V() {
            u.a(this.dn);
        }
    };

    public u() {
        lcw.qGJ = true;
        this.dk = "configuration_ai.xml";
        lfn.eqw().a(loi.exd());
    }

    @Override
    public boolean a(ldz ldz2) {
        this.d(ldz2);
        return this.isRunning();
    }

    public final ag S() {
        return this.dm;
    }

    @Override
    public void a(int n, int n2, int n3, String string, ldz ldz2) {
        hbc hbc2;
        lcr.qww = n;
        this.di = n;
        this.dj = n2;
        lcw.qHF = n3;
        this.dk = string;
        assert (this.di > 0);
        assert (this.dk != null);
        lpa.exC();
        lcw.qLa = "./dfdata/";
        lcw.qLb = "./dfdata/";
        lfn.b(0, "SFCentralControlUnitServer", "initialize() Initializing server AI. NodeID=" + this.di + ", ServerNodeID = " + this.dj + ". Initial gametime: " + ldz2);
        this.r(this.dk);
        this.T();
        this.c(ldz2);
        this.P();
        this.Q();
        this.N();
        hbd.jAL = hbc2 = new hbc("xml-files/client/gui/language_mapping.xml");
        hbc2.LA(1);
    }

    @Override
    public void O() {
        this.d(null);
    }

    @Override
    public void c(ldz ldz2) {
        this.df = new bz(this.S());
        this.df.setStartTime(ldz2);
        this.dl = new jsa();
    }

    @Override
    public void d(ldz ldz2) {
        this.de.a(kea.piA, ldz2);
        this.de.a(kea.piz, ldz2);
    }

    @Override
    public boolean b(ldz ldz2) {
        return super.b(ldz2);
    }

    protected final boolean isRunning() {
        return this.dh;
    }

    @Override
    protected void N() {
        if (this.dl != null) {
            this.dl.tw("xml-files/worlddata/" + lcw.qHG);
        } else {
            String string = "No IO Module!!";
            assert (false) : string;
            lfn.b(0, this.getClass().getName(), "prepareToRun() : " + string);
        }
    }

    private void T() {
        ldx.enG().bN(this.di);
        lcr.fQ((int)this.di, (int)this.dj);
        System.out.println("SFCentralControlUnitAI: setupNodes() SystemOSGUID=" + lcr.qzp);
    }

    private void U() {
        this.dh = false;
    }

    static /* synthetic */ void a(u u2) {
        u2.U();
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bz
 *  lcr
 *  lcw
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class v
extends w {
    protected jsa dl = null;
    protected jog do = null;
    protected hbb dp;
    protected int dq;
    protected String dr;
    protected String dk;
    protected String ds;
    private int di = -1;
    private int dj = -1;

    public v() {
        lcw.qFD = true;
        lcw.qHF = 1;
        lcw.qGJ = true;
        lcw.qHh = false;
        dd = true;
        this.dq = 27;
        this.dr = "config_client";
        this.dk = "configuration_client.xml";
        this.ds = "Darkfall Client";
    }

    @Override
    public void a(int n, int n2, int n3, String string, ldz ldz2) {
        hbc hbc2;
        super.initialize();
        lcr.qww = n;
        this.di = n;
        this.dj = n2;
        assert (this.di > 0);
        lpa.exC();
        this.r("xml-files/config/" + string);
        this.T();
        lcw.bn = lcw.hC.enw() == 0;
        this.c(ldz2);
        this.P();
        this.Q();
        this.N();
        hbd.jAL = hbc2 = new hbc("xml-files/client/gui/language_mapping.xml");
        hbc2.LA(1);
        if (lcw.qOQ && !lcw.qOR) {
            this.dp.initialize();
        }
        System.gc();
    }

    protected void T() {
        ldx.enG().bN(this.di);
        lcr.fQ((int)this.di, (int)this.dj);
        System.out.println("SFCentralControlUnitClient.initialize() SystemOSGUID=" + lcr.qzp);
    }

    @Override
    protected void N() {
        if (this.dl != null) {
            this.dl.tw("xml-files/worlddata/" + lcw.qHG);
        }
    }

    @Override
    public void c(ldz ldz2) {
        this.df = new bz(this.S());
        this.df.setStartTime(ldz2);
        this.dl = new jsa();
        if (lcw.qGT) {
            new bd();
        }
        if (lcw.qOQ && !lcw.qOR) {
            this.dp = new hbb();
            this.do = new jog();
        }
    }

    @Override
    public void d(ldz ldz2) {
        this.de.a(kea.piA, ldz2);
        if (lcw.qOQ && !lcw.qOR) {
            this.de.a(kea.piE, ldz2);
            this.de.a(kea.piB, ldz2);
        }
        this.de.a(kea.piz, ldz2);
        if (lcw.qGT) {
            this.de.a(kea.piD, ldz2);
        }
    }
}


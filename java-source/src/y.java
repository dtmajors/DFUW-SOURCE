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
public class y
extends w {
    protected jsa dl = null;
    protected jog do = null;
    protected hbb dp;
    protected int dq;
    protected String dr;
    protected String dk;
    private int di = -1;

    public y() {
        lcw.qHF = 2;
        lcw.qGJ = true;
        lcw.qHh = true;
        dd = true;
        this.dq = 25;
        this.dr = "config_standalone";
        this.dk = "configuration_standalone.xml";
    }

    @Override
    public void a(int n, int n2, int n3, String string, ldz ldz2) {
        hbc hbc2;
        super.initialize();
        this.di = n;
        assert (this.di > 0);
        lpa.exC();
        this.r("xml-files/config/" + string);
        this.T();
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
        int n = 7000;
        int n2 = 1024;
        int n3 = 3;
        lcr.qww = 1024;
        ldx.enG().bN(n3);
        if (lcw.qGW) {
            lcr.fQ((int)n2, (int)n3);
        } else if (lcw.qGV) {
            lcr.fQ((int)n, (int)n3);
        }
        if (lcw.qGY) {
            lcw.yj((boolean)true);
        }
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
            bd bd2 = new bd();
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


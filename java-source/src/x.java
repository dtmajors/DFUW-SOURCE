/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bz
 *  lcr
 *  lcw
 */
public class x
extends t
implements ag {
    protected jsa dl = null;

    public x() {
        dd = false;
        lfn.eqw().a(loi.exd());
    }

    @Override
    public void a(int n, int n2, int n3, String string, ldz ldz2) {
        ldz ldz3 = ldz2;
        int n4 = n;
        lcr.qww = n;
        lcw.qHF = n3;
        lpa.exC();
        if (lcw.enc() || lcw.emY()) {
            lcw.qFD = true;
        }
        lcw.qLa = "./dfdata/";
        lcw.qLb = "./dfdata/";
        ldx.enG().bN(n4);
        lcr.abX((int)n4);
        lcw.qGJ = true;
        this.r(string);
        this.c(ldz3);
        this.P();
        this.Q();
        this.N();
        this.d(ldz3);
        Object object = new hbc("xml-files/client/gui/language_mapping.xml");
        hbd.jAL = object;
        ((hbc)object).LA(1);
        object = loi.exd();
    }

    @Override
    public boolean a(ldz ldz2) {
        this.d(ldz2);
        return true;
    }

    @Override
    protected void N() {
        this.dl.dRZ();
    }

    @Override
    public void d(ldz ldz2) {
        this.de.a(kea.piA, ldz2);
        this.de.a(kea.piz, ldz2);
    }

    @Override
    public void c(ldz ldz2) {
        this.df = new bz((ag)this);
        this.df.setStartTime(ldz2);
        this.dl = new jsa();
    }

    @Override
    public void V() {
        assert (false);
    }
}


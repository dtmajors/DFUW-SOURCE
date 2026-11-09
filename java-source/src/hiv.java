/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.List;

public class hiv
extends hmt {
    private final lbn jEL = new lbn(this){
        final /* synthetic */ hiv kwq;
        {
            this.kwq = hiv2;
        }

        public void W() {
            hiv.a(this.kwq);
        }
    };
    private final hdm dXw;
    private c kwc = c.kwv;
    private final List<a> kwd = lcn.emv();
    private final List<a> kwe = lcn.emv();
    private final b kwf;
    private boolean kwg;
    private float kwh = 0.5f;
    private float kwi = 0.6f;
    private int fb = 300;
    private int kwj = 5;
    private int kwk = 1000;
    private int kwl = 5000;
    private int kwm = 250;
    private int kwn = 250;
    private int kwo = 2;
    private int kwp = 10;

    public hiv(hdm hdm2, String string, b b2) {
        super((hnc)hdm2, string, lgg.rlI, lhf.rnv);
        this.kwf = b2;
        this.dXw = hdm2;
        this.dXw.cbP().kAz.eme().a(true, this.jEL);
        this.cmw();
    }

    @Override
    protected void FG() {
        this.dXw.cbP().kAz.eme().a(false, this.jEL);
        super.FG();
    }

    private void cmw() {
        this.kwg = true;
    }

    private void chf() {
        block7: {
            int n;
            block6: {
                int n2 = this.dXw.jZH.cqE().rmN;
                int n3 = this.dXw.jZH.cqE().H;
                if (n2 < 10 || n3 < 10) {
                    return;
                }
                this.kwg = false;
                n = 0;
                for (a a2 : this.kwe) {
                    a2.kiV.ci(this.fb, this.fb / 2);
                    n += a2.kiV.ccb();
                }
                int n4 = n3 - n;
                assert (n4 > 0);
                int n5 = (int)(this.kwi * (float)n4);
                int n6 = n2 - this.fb;
                if (n6 <= 0) {
                    n6 = 1;
                }
                int n7 = (int)(this.kwh * (float)n6);
                this.h(n7, n5, this.fb, n);
                if (this.kwc != c.kww) break block6;
                int n8 = 0;
                for (a a3 : this.kwe) {
                    a3.khV.h(0, n8, this.fb, a3.kiV.ccb());
                    a3.cg = n8;
                    n8 += a3.kiV.ccb();
                }
                break block7;
            }
            if (this.kwc != c.kwv) break block7;
            int n9 = 0;
            for (a a4 : this.kwe) {
                a4.khV.h(0, n - n9 - a4.kiV.ccb(), this.fb, a4.kiV.ccb());
                a4.cg = n9;
                n9 += a4.kiV.ccb();
            }
        }
    }

    public void mT(String string) {
        a a2 = new a(this, null);
        a2.kiV = new hcl(this.dXw.jZD.jGq, "", this.kwf.kiK.jFE, this.kwf.kiK.dMT, false, 0L);
        a2.kiV.i(string, this.fb, this.fb / 2);
        this.kwd.add(a2);
        this.cmw();
    }

    private void a(a a2) {
        assert (a2.khV == null);
        a2.khV = new hfl(this.dXw, "OnScreen Text", lgg.rlI, lhf.rnv, a2.kiV, true);
        a2.kws = System.currentTimeMillis();
        a2.kwu = 1;
        a2.kwt = 0;
        this.j(a2.khV);
        a2.khV.G(new lcq(0.0f, 0.0f, 0.0f, (float)a2.kwt / 255.0f));
    }

    private void b(a a2) {
        assert (a2.khV != null);
        assert (a2.kws == 0L);
        a2.kws = System.currentTimeMillis();
        a2.kwu = -1;
        a2.kwt = 255;
        a2.khV.G(new lcq(1.0f, 1.0f, 1.0f, (float)a2.kwt / 256.0f));
    }

    private void c(a a2) {
        if (a2.khV == null) {
            return;
        }
        long l2 = System.currentTimeMillis();
        long l3 = l2 - a2.kws;
        float f2 = (float)l3 / (float)(a2.kwu > 0 ? this.kwm : this.kwn);
        int n = (int)(f2 * 255.0f);
        if (n >= 255) {
            n = 255;
            if (a2.kwu < 0) {
                a2.khV.remove();
                a2.khV = null;
            } else {
                a2.kwr = l2;
                a2.kwu = 0;
                a2.kws = 0L;
                a2.kwt = n;
                a2.khV.G(new lcq(1.0f, 1.0f, 1.0f, (float)a2.kwt / 256.0f));
            }
        } else {
            if (a2.kwu < 0) {
                n = 255 - n;
            }
            if (n != a2.kwt) {
                a2.kwt = n;
                a2.khV.G(new lcq(1.0f, 1.0f, 1.0f, (float)a2.kwt / 256.0f));
            }
        }
    }

    private void d(a a2) {
        if (a2.khV != null) {
            a2.khV.remove();
            a2.khV = null;
        }
    }

    private int cmx() {
        int n = this.kwd.size();
        if (n <= this.kwo) {
            return this.kwl;
        }
        if (n >= this.kwp) {
            return this.kwk;
        }
        int n2 = this.kwl - this.kwk;
        int n3 = this.kwp - this.kwo;
        int n4 = n - this.kwo;
        return this.kwl - n4 * n2 / n3;
    }

    private void cbH() {
        long l2 = System.currentTimeMillis();
        if (this.kwg) {
            this.chf();
        }
        boolean bl = false;
        boolean bl2 = false;
        for (a a2 : this.kwe) {
            if (a2.kwu > 0) {
                bl = true;
            } else if (a2.kwu < 0) {
                bl2 = true;
            }
            if (a2.kws != 0L) {
                this.c(a2);
                continue;
            }
            if (l2 - a2.kwr <= (long)this.cmx() || bl2) continue;
            this.b(a2);
        }
        while (!this.kwe.isEmpty() && this.kwe.get((int)0).khV == null) {
            this.kwe.remove(0);
            this.cmw();
        }
        int n = 0;
        if (!this.kwe.isEmpty()) {
            n = this.kwe.get((int)(this.kwe.size() - 1)).cg + this.kwe.get((int)(this.kwe.size() - 1)).kiV.ccb();
        }
        while (!bl && !this.kwd.isEmpty() && this.kwe.size() < this.kwj) {
            a a2;
            a2 = this.kwd.get(0);
            a2.kiV.ci(this.fb, this.fb / 2);
            this.a(a2);
            bl = true;
            this.kwd.remove(0);
            this.kwe.add(a2);
            this.cmw();
        }
    }

    public c cmy() {
        return this.kwc;
    }

    public void a(c c2) {
        if (c2 != this.kwc) {
            this.kwc = c2;
            this.cmw();
        }
    }

    public float cmz() {
        return this.kwh;
    }

    public void jW(float f2) {
        if (!lew.B(f2, this.kwh, 0.005f)) {
            this.kwh = f2;
            this.cmw();
        }
    }

    public float cmA() {
        return this.kwi;
    }

    public void jX(float f2) {
        if (!lew.B(f2, this.kwi, 0.005f)) {
            this.kwi = f2;
            this.cmw();
        }
    }

    public int cmB() {
        return this.fb;
    }

    public void MK(int n) {
        if (n != this.fb) {
            this.fb = n;
            this.cmw();
        }
    }

    public int cmC() {
        return this.kwj;
    }

    public void ML(int n) {
        if (this.kwj != n) {
            this.kwj = n;
            this.cmw();
        }
    }

    public int cmD() {
        return this.kwk;
    }

    public void MM(int n) {
        this.kwk = n;
    }

    public int cmE() {
        return this.kwl;
    }

    public void MN(int n) {
        this.kwl = n;
    }

    public int cmF() {
        return this.kwm;
    }

    public void MO(int n) {
        this.kwm = n;
    }

    public int cmG() {
        return this.kwn;
    }

    public void MP(int n) {
        this.kwn = n;
    }

    public int cmH() {
        return this.kwo;
    }

    public void MQ(int n) {
        this.kwo = n;
    }

    public int cmI() {
        return this.kwp;
    }

    public void MR(int n) {
        this.kwp = n;
    }

    static /* synthetic */ void a(hiv hiv2) {
        hiv2.cbH();
    }
}


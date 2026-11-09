/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
public class bx {
    public static final int fg = 0;
    public static final int fh = 1;
    public static final int fi = 2;
    public static final int fj = 3;
    public static final int fk = 4;
    public static final int fl = 5;
    public static final int fm = 6;
    public static final int fn = 7;
    public static final int fo = 8;
    public static final int fp = 9;
    public static final int fq = 4;
    public static final int fr = 5;
    private t dH;

    public static int ab() {
        return lcw.qGu;
    }

    public boolean a(bw bw2) {
        assert (lcw.qGb);
        return this.b(bw2.di, bw2.dj, bw2.eW, bw2.eX, bw2.eY, bw2.eZ, bw2.fa, bw2.fb, bw2.fc, bw2.fd, bw2.fe, bw2.ff);
    }

    public boolean a(int n, int n2, int n3, String string, ldz ldz2, long l2, boolean bl, int n4, int n5, int n6, int n7, int n8) {
        return this.b(n, n2, n3, string, ldz2, l2, bl, n4, n5, n6, n7, n8);
    }

    private boolean b(int n, int n2, int n3, String string, ldz ldz2, long l2, boolean bl, int n4, int n5, int n6, int n7, int n8) {
        ldv ldv2;
        lcw.hC = ldv2 = new ldv(l2);
        lcw.qGS = bl;
        if (bl) {
            lcw.qFU = n5;
            lcw.qFT = n4;
        } else {
            lcw.qFU = n5;
            lcw.qFT = n4;
        }
        lcw.qGe = n6;
        lcw.qGf = n7;
        lcw.SC = hc.values()[n8];
        lcw.qOR |= new jrw(lcw.qLb + "/" + "xml-files/gamelogicinfo/" + "use_new_gui.txt").exists();
        try {
            if (this.dH == null) {
                switch (n3) {
                    case 1: {
                        this.dH = new v();
                        break;
                    }
                    case 11: {
                        this.dH = new u();
                        break;
                    }
                    case 2: {
                        this.dH = new y();
                        break;
                    }
                    case 3: {
                        this.dH = new z();
                        break;
                    }
                    case 9: 
                    case 10: 
                    case 12: 
                    case 15: {
                        this.dH = new x();
                        break;
                    }
                }
            }
            this.dH.a(n, n2, n3, string, ldz2);
            lcw.qGS = bl;
            if (bl) {
                lcw.qFU = n5;
                lcw.qFT = n4;
            } else {
                lcw.qFU = n5;
                lcw.qFT = n4;
            }
        }
        catch (Exception exception) {
            lfn.b(5, this.getClass().getSimpleName(), "doInitialize: " + exception.getMessage());
            throw new bs("Exception: " + exception + ", jeje:\n " + exception.getStackTrace(), exception);
        }
        return true;
    }

    public boolean f(int n) {
        kdw.a a2 = null;
        switch (n) {
            case 0: {
                return true;
            }
            case 1: {
                a2 = kdw.a.phV;
                break;
            }
            case 4: {
                return true;
            }
            case 5: {
                a2 = kdw.a.phX;
                break;
            }
            case 6: {
                a2 = kdw.a.phY;
                break;
            }
            case 7: {
                return true;
            }
            case 8: {
                a2 = kdw.a.phZ;
                break;
            }
            case 9: {
                a2 = kdw.a.pic;
            }
        }
        boolean bl = this.dH.a(a2);
        return bl;
    }

    public void g(int n) {
        lcw.qGu = n;
        kdw.a a2 = null;
        switch (n) {
            case 0: {
                return;
            }
            case 1: {
                a2 = kdw.a.phV;
                break;
            }
            case 4: {
                return;
            }
            case 5: {
                a2 = kdw.a.phX;
                break;
            }
            case 6: {
                a2 = kdw.a.phY;
                break;
            }
            case 7: {
                return;
            }
            case 8: {
                a2 = kdw.a.phZ;
                break;
            }
            case 9: {
                a2 = kdw.a.pic;
            }
        }
        this.dH.b(a2);
        if (n == 6) {
            exg exg2;
            if (lcr.qzB != null && lcr.qzB.ib() == ldx.enG().ib()) {
                exg2 = (exg)this.dH.R().d(8713);
                exg2.on(lcr.qEl);
                exg2.f(lcr.qEl);
                this.dH.R().b((dxq)exg2);
            }
            if (lcr.qzE != null && lcr.qzE.ib() == ldx.enG().ib()) {
                exg2 = (exg)this.dH.R().d(8713);
                exg2.on(lcr.qEo);
                exg2.f(lcr.qEo);
                this.dH.R().b((dxq)exg2);
            }
        }
    }

    public void f(ldz ldz2) {
        int n = 20;
        if (this.dH != null) {
            while (!this.dH.b(ldz2) && --n != 0) {
                ldz2 = new ldz(1.0, ldz2.rgz + 1.0, ldz2.lpr + 1);
                this.dH.a(ldz2);
            }
        }
    }

    public void g(ldz ldz2) {
        boolean bl = this.dH.a(ldz2);
        if (!bl) {
            loi.exd().shutdown();
        }
    }
}


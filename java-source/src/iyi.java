/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class iyi
extends isb {
    private boolean mBI = true;
    private boolean mBJ = true;
    private iwx mBK;
    private iwx mBL;
    private iwx mBM;
    private hvr lgb;

    public iyi(String string, String string2) {
        this.a(new ixv());
        this.a(new iyd(string2));
        if (string != null && string.length() > 0) {
            this.a(iya.rD(string));
        }
        this.a(new ixw(this){
            final /* synthetic */ iyi mBN;
            {
                this.mBN = iyi2;
            }

            public void cLq() {
                this.mBN.cGR();
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lvw.tbR.bD(new Object[0]).exA());
            }
        });
        this.a(new iyb(this){
            final /* synthetic */ iyi mBN;
            {
                this.mBN = iyi2;
            }

            public void cLq() {
                this.mBN.cbU();
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lvw.tbQ.bD(new Object[0]).exA());
            }
        });
        this.a(new ixz());
        this.mBK = new iwx(1, 16);
        this.mBK.setVisible(this.dsK() != null);
        this.cZV().c(this.mBK, 1);
        this.mBL = new iwx(1, 16);
        this.cZV().c(this.mBL, 3);
        this.mBM = new iwx(0, 1);
        this.dpi().c(this.mBM, 1);
        this.setActive(false);
        this.cPw();
    }

    public iyi() {
        this(null, null);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.dbr();
    }

    public ixv dsI() {
        return (ixv)super.dpj();
    }

    public void a(ixv ixv2) {
        super.d(ixv2);
    }

    public iyd dsJ() {
        return (iyd)super.dan();
    }

    public void a(iyd iyd2) {
        super.a(iyd2);
    }

    public iya dsK() {
        return (iya)super.dpk();
    }

    @Override
    public String dpl() {
        return this.dsK() != null ? this.dsK().drt().djt() : null;
    }

    @Override
    public void rg(String string) {
        if (string != null && string.length() > 0) {
            if (this.dsK() != null) {
                this.dsK().drt().qP(string);
            } else {
                this.a(iya.rD(string));
            }
        } else {
            this.a((iya)null);
        }
    }

    public void a(iya iya2) {
        super.ag(iya2);
        if (this.mBK != null) {
            this.mBK.setVisible(iya2 != null);
        }
    }

    public ixw dsL() {
        return (ixw)super.cYv();
    }

    public void a(ixw ixw2) {
        super.d(ixw2);
    }

    public iyb dsM() {
        return (iyb)super.cYt();
    }

    public void a(iyb iyb2) {
        super.e(iyb2);
    }

    public ixz dsN() {
        return (ixz)super.dpm();
    }

    public void a(ixz ixz2) {
        super.a(ixz2);
    }

    public boolean dsO() {
        return this.mBI;
    }

    public boolean dsP() {
        return this.mBJ;
    }

    public void v(boolean bl, boolean bl2) {
        if (bl == this.mBI && bl2 == this.mBJ) {
            return;
        }
        this.mBI = bl;
        this.mBJ = bl2;
        if (this.djZ()) {
            return;
        }
        this.cPw();
    }

    @Override
    public void kh(float f2) {
        ipf ipf2;
        int n;
        super.kh(f2);
        if (this.dsK() != null) {
            this.dsK().kh(f2);
        }
        for (n = 0; n < this.cZV().bfn(); ++n) {
            ipf2 = this.cZV().RO(n);
            if (!(ipf2 instanceof iwx)) continue;
            ipf2.hz(f2);
        }
        for (n = 0; n < this.dpi().bfn(); ++n) {
            ipf2 = this.dpi().RO(n);
            if (!(ipf2 instanceof iwx)) continue;
            ipf2.hz(f2);
        }
    }

    @Override
    public boolean isAnimated() {
        return this.lgb != null;
    }

    @Override
    public void dpo() {
        if (this.djZ() || this.lgb != null) {
            return;
        }
        this.lgb = new a(this);
        iyi.czy().a(this.lgb);
    }

    @Override
    public void dbr() {
        if (this.lgb == null) {
            return;
        }
        if (iyi.czy() != null) {
            iyi.czy().b(this.lgb);
        }
        this.lgb = null;
    }

    @Override
    public void b(jnz jnz2, jnz jnz3) {
        boolean bl;
        boolean bl2 = bl = jnz3 == jnz.nFE;
        if (this.djZ()) {
            if (this.dsK() != null) {
                this.dsK().setVisible(true);
            }
            if (this.dsJ() != null) {
                this.dsJ().setVisible(true);
            }
            if (this.dsN() != null) {
                this.dsN().setVisible(true);
            }
            if (this.mBK != null) {
                this.mBK.setVisible(true);
            }
            if (this.mBL != null) {
                this.mBL.setVisible(!bl);
            }
            if (this.dpi() != null) {
                this.dpi().setVisible(!bl);
            }
        } else {
            if (this.dsK() != null) {
                this.dsK().setVisible(this.mBI);
            }
            if (this.dsJ() != null) {
                this.dsJ().setVisible(this.mBJ);
            }
            if (this.dsN() != null) {
                this.dsN().setVisible(false);
            }
            if (this.mBK != null) {
                this.mBK.setVisible(false);
            }
            if (this.mBL != null) {
                this.mBL.setVisible(false);
            }
            if (this.dpi() != null) {
                this.dpi().setVisible(false);
            }
        }
        this.pack();
    }

    @Override
    public void cPw() {
        super.cPw();
        this.b(null, hso.cxK().cxN());
    }

    @Override
    public void dpp() {
        this.dsJ().sn(this.dpn());
    }

    public void cGR() {
    }

    public void cbU() {
    }

    @Override
    public /* synthetic */ ipl dpm() {
        return this.dsN();
    }

    @Override
    public /* synthetic */ ios cYt() {
        return this.dsM();
    }

    @Override
    public /* synthetic */ ios cYv() {
        return this.dsL();
    }

    @Override
    public /* synthetic */ ipf dpk() {
        return this.dsK();
    }

    @Override
    public /* synthetic */ ist dan() {
        return this.dsJ();
    }

    @Override
    public /* synthetic */ ipq dpj() {
        return this.dsI();
    }
}


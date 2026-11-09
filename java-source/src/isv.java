/*
 * Decompiled with CFR.
 */
public class isv
extends ipx
implements isj {
    private ipf lMX;
    private ipx mbe;
    private isy mxT;
    private ipf mwH;
    private ipf mxU;

    public isv() {
        this.a(irl.dnr());
        this.mxT = new isy(this){
            final /* synthetic */ isv mxV;
            {
                this.mxV = isv2;
            }

            public void od(String string) {
                super.od(string);
                isv.a(this.mxV);
                this.mxV.od(string);
            }

            public void pI(String string) {
                super.pI(string);
                isv.a(this.mxV);
                this.mxV.pI(string);
            }

            public void v(String string, boolean bl) {
                super.v(string, bl);
                this.mxV.v(string, bl);
            }

            public void dmh() {
                super.dmh();
                isv.a(this.mxV);
                this.mxV.dqd();
            }

            public void cEj() {
                super.cEj();
                isv.a(this.mxV);
                this.mxV.dqe();
            }

            public void rk(String string) {
                super.rk(string);
                isv.a(this.mxV);
                this.mxV.rk(string);
            }

            public void c(int n, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
                super.c(n, bl, bl2, bl3, bl4);
                this.mxV.c(n, bl, bl2, bl3, bl4);
            }

            public void C(String string, int n) {
                super.C(string, n);
                this.mxV.C(string, n);
            }
        };
        this.mxT.Rk(0);
        this.mbe = ipx.l(ipx.a(3, 1, new ipf[0]));
        this.W(this.mbe);
        this.mbe.W(ipx.c(new ipf[]{this.mxT}));
    }

    public String getText() {
        return this.mxT.getText();
    }

    public void setText(String string) {
        this.mxT.setText(string);
        this.dqf();
    }

    public String dpL() {
        return this.mxT.dpL();
    }

    public void ro(String string) {
        this.mxT.ro(string);
    }

    public boolean dpM() {
        return this.mxT.dpM();
    }

    public void st(boolean bl) {
        this.mxT.st(bl);
    }

    public ipf dip() {
        return this.lMX;
    }

    public void h(ipf ipf2) {
        if (ipf2 == this.lMX) {
            return;
        }
        if (this.lMX != null) {
            this.X(this.lMX);
        }
        this.lMX = ipf2;
        if (this.lMX != null) {
            this.c(this.lMX, 0);
        }
    }

    public isy dqb() {
        return this.mxT;
    }

    public ipf dpk() {
        return this.mwH;
    }

    public void ag(ipf ipf2) {
        if (ipf2 == this.mwH) {
            return;
        }
        if (this.mwH != null) {
            this.mwH.removeFromParent();
        }
        this.mwH = ipf2;
        if (this.mwH != null) {
            this.mbe.W(this.mwH);
        }
    }

    public ipf dqc() {
        return this.mxU;
    }

    public void al(ipf ipf2) {
        if (ipf2 == this.mxU) {
            return;
        }
        if (this.mxU != null) {
            this.mxU.removeFromParent();
        }
        this.mxU = ipf2;
        if (this.mxU != null) {
            this.c(this.mxU, 1);
            this.dqf();
        }
    }

    @Override
    public void a(isu isu2) {
        this.mxT.a(isu2);
    }

    @Override
    public void a(ite ite2) {
        this.mxT.a(ite2);
    }

    @Override
    public void SQ(int n) {
        this.mxT.SQ(n);
    }

    @Override
    public boolean dmb() {
        return this.mxT.dmb();
    }

    @Override
    public void L() {
        this.mxT.L();
    }

    @Override
    public void kh(float f2) {
        if (this.lMX != null) {
            this.lMX.hz(Math.max(f2, 0.2f));
        }
    }

    @Override
    public void dpv() {
        this.mxT.dpv();
    }

    @Override
    public void a(isx isx2) {
        this.mxT.a(isx2);
    }

    @Override
    public void sp(boolean bl) {
        this.mxT.sp(bl);
    }

    @Override
    public void a(itb itb2) {
        this.mxT.a(itb2);
    }

    @Override
    public void sq(boolean bl) {
        this.mxT.sq(bl);
    }

    @Override
    public void sr(boolean bl) {
        this.mxT.sr(bl);
    }

    @Override
    public void SR(int n) {
        this.mxT.SR(n);
    }

    @Override
    public void od(String string) {
    }

    @Override
    public void pI(String string) {
    }

    @Override
    public void v(String string, boolean bl) {
    }

    @Override
    public void c(int n, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
    }

    @Override
    public void C(String string, int n) {
    }

    @Override
    public void rk(String string) {
    }

    public void dqd() {
    }

    public void dqe() {
    }

    private void dqf() {
        if (this.mxU == null) {
            return;
        }
        if (this.mxT.dmb()) {
            this.mxU.setVisible(false);
        } else {
            String string = this.mxT.getText();
            this.mxU.setVisible(string == null || string.isEmpty());
        }
    }

    static /* synthetic */ void a(isv isv2) {
        isv2.dqf();
    }
}


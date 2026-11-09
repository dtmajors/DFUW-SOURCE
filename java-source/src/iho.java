/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class iho
extends ihs {
    private ipx lvG;
    private ipf lWw;

    public iho(String string, String string2) {
        super(string, string2);
    }

    public void f(ipf ipf2) {
        if (this.lWw == ipf2) {
            return;
        }
        if (this.lWw != null) {
            this.lWw.removeFromParent();
        }
        this.lWw = ipf2;
        if (this.lvG != null) {
            this.lvG.W(this.lWw);
        }
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.cXM().a(ihw.lXA);
        this.cXM().cYp().s(this.cGW());
        if (this.lWw != null) {
            this.lvG.W(this.lWw);
        }
        this.QV(2);
        ios ios2 = this.cGS();
        this.cXM().a(ios2, 0);
    }

    @Override
    protected ihv cXJ() {
        return new ihr();
    }

    @Override
    protected ihu cXK() {
        return new ihq();
    }

    @Override
    protected ios cGk() {
        return new iwi(this){
            final /* synthetic */ iho lWx;
            {
                this.lWx = iho2;
            }

            public void cLq() {
                this.lWx.cGR();
            }

            public hyn dd(int n, int n2) {
                return this.lWx.dc(n, n2);
            }
        };
    }

    @Override
    protected iox cGl() {
        return new iwk(this){
            final /* synthetic */ iho lWx;
            {
                this.lWx = iho2;
            }

            public void pn(boolean bl) {
                this.lWx.qn(bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lzb.tNj.bD(new Object[0]).exA());
            }
        };
    }

    @Override
    protected ios cGs() {
        return new iwm(this){
            final /* synthetic */ iho lWx;
            {
                this.lWx = iho2;
            }

            public void cLq() {
                ioc ioc2 = this.eo(0, 0);
                this.lWx.m(new joa(ioc2.cf, ioc2.cg, this.getWidth(), this.getHeight()));
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lzb.tNi.bD(new Object[0]).exA());
            }
        };
    }

    protected ios cGS() {
        return new iwn(this){
            final /* synthetic */ iho lWx;
            {
                this.lWx = iho2;
            }

            public void cLq() {
                ioc ioc2 = this.eo(0, 0);
                this.lWx.l(new joa(ioc2.cf, ioc2.cg, this.getWidth(), this.getHeight()));
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lzb.tNh.bD(new Object[0]).exA());
            }
        };
    }

    protected void l(joa joa2) {
    }

    @Override
    protected ipq cGj() {
        return null;
    }

    protected hyn dc(int n, int n2) {
        return iae.oJ(lzb.tNk.bD(new Object[0]).exA());
    }

    private ipf cGW() {
        if (this.lvG == null) {
            this.lvG = ipx.d(new ipf[0]);
        }
        return this.lvG;
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class itf
extends ipx {
    private ipx mbe;
    private iso myJ;
    private ipx myK;
    private ipf mwE;
    private iru muK;
    private boolean myL;
    private ipm myM;
    private ipm myN;
    private int mxt;
    private int mxv;

    public itf() {
        this.a(new irl(this){
            final /* synthetic */ itf myO;
            {
                this.myO = itf2;
            }

            public void e(ipf ipf2) {
                super.e(ipf2);
            }

            public void i(ipf ipf2) {
                super.i(ipf2);
            }
        });
        this.mbe = ipx.l(new ipf[0]);
        this.W(this.mbe);
    }

    public iso dqE() {
        return this.myJ;
    }

    public void a(iso iso2) {
        if (iso2 == this.myJ) {
            return;
        }
        if (this.myK != null) {
            this.myK.removeFromParent();
            this.myK = null;
        }
        this.myJ = iso2;
        if (this.myJ != null) {
            this.myK = ipx.c(new ipf[0]);
            this.mbe.c(this.myK, 0);
            ipx ipx2 = ipx.h(new ipf[0]);
            this.myK.W(ipx2);
            iph iph2 = this.dqG();
            if (iph2 != null) {
                ipx2.W(iph2);
                iph2.W(this.myJ);
            } else {
                ipx2.W(this.myJ);
            }
            ipx ipx3 = ipx.j(new ipf[0]);
            ipx3.rG(false);
            ipx3.rF(false);
            ipx2.W(ipx3);
            this.myM = new ipw(ire.mul, true);
            ipx3.W(this.myM);
            ipx3.W(ipx.c(new ipf[0]));
            this.myN = new ipw(ire.mul, false);
            ipx3.W(this.myN);
        }
        this.dqH();
    }

    public ipf doV() {
        return this.mwE;
    }

    public void ad(ipf ipf2) {
        if (ipf2 == this.mwE) {
            return;
        }
        if (this.mwE != null) {
            this.X(this.mwE);
        }
        this.mwE = ipf2;
        if (this.mwE != null) {
            this.c(this.mwE, 1);
        }
    }

    public iru dnw() {
        return this.muK;
    }

    public void a(iru iru2) {
        if (iru2 == this.muK) {
            return;
        }
        if (this.muK != null) {
            this.muK.removeFromParent();
        }
        this.muK = iru2;
        if (this.muK != null) {
            this.mbe.c(this.muK, itp.t(this.myJ));
        }
        this.dqH();
    }

    public void dqF() {
        if (this.myJ != null) {
            this.myJ.setText("");
        }
    }

    public void d(String string, int n, int n2, boolean bl) {
        if (this.myJ != null) {
            this.myJ.d(string, n, n2, bl);
        }
    }

    @Override
    public void kh(float f2) {
        super.kh(f2);
        this.kM(f2);
    }

    @Override
    public void b(jnz jnz2, jnz jnz3) {
        super.b(jnz2, jnz3);
        if (this.muK != null) {
            this.h(jnz3);
        }
    }

    public void z(int n, int n2, int n3, int n4) {
        this.B(n, n2, n3, n4);
    }

    public void A(int n, int n2, int n3, int n4) {
        this.B(n, n2, n3, n4);
    }

    public void SV(int n) {
        if (this.myJ == null || this.muK == null) {
            return;
        }
        this.myJ.SS(n);
    }

    public void a(iru iru2, boolean bl) {
    }

    public iph dqG() {
        return null;
    }

    @Override
    public hyn dd(int n, int n2) {
        return this.myJ != null ? this.myJ.dd(n, n2) : super.dd(n, n2);
    }

    protected ipx cZV() {
        return this.mbe;
    }

    private void B(int n, int n2, int n3, int n4) {
        if (this.myJ == null || this.muK == null) {
            return;
        }
        this.mxt = n;
        this.mxv = n3;
        this.muK.a(1, n, n3, 1, n2 - n + 1, false);
        this.myL = n3 > 1;
        this.h(hso.cxK().cxN());
        if (this.myL) {
            this.kM(this.cMR());
        } else {
            this.myM.setVisible(false);
            this.myN.setVisible(false);
        }
    }

    private void h(jnz jnz2) {
        boolean bl;
        boolean bl2 = bl = this.myL && jnz2 != jnz.nFE;
        if (bl != this.muK.djL()) {
            this.muK.setVisible(bl);
            this.a(this.muK, bl);
        }
    }

    private void dqH() {
        if (this.myJ == null || this.muK == null) {
            return;
        }
        this.B(this.myJ.dpE(), this.myJ.dpG(), this.myJ.dpF(), this.myJ.dpH());
    }

    private void kM(float f2) {
        if (this.mxt > 1) {
            this.myM.setVisible(true);
            this.myM.hz((float)this.mxt / (float)(this.mxv / 3) * f2);
        } else {
            this.myM.setVisible(false);
        }
        if (this.mxt < this.mxv) {
            this.myN.setVisible(true);
            this.myN.hz((float)(this.mxv - this.mxt - 1) / (float)(this.mxv / 3) * f2);
        } else {
            this.myN.setVisible(false);
        }
    }
}


/*
 * Decompiled with CFR.
 */
public class imy
extends izd {
    private int mla;
    private int mlb;
    private int mlc;
    private ist mld;
    private izz mle;
    private ixq mlf;

    public imy(ioa ioa2, joa joa2, int n, int n2, int n3) {
        super("ItemDivideWindow", "J2FWindow.swf", ioa2, new joa(joa2.X + 18.0f, joa2.Y + 18.0f, joa2.W - 36.0f, joa2.H - 36.0f), 3, 2, ire.mul);
        this.a(iod.moE);
        this.mla = n;
        this.mlc = Math.min(n3, 999);
        this.mlb = n2;
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.dmO().a(iqo.dmT());
        this.dmO().W(ipx.a(1, 8, new ipf[0]));
        this.dmO().W(this.dfc());
        this.dmO().W(ipx.a(1, 8, new ipf[0]));
        this.dmO().W(this.dfd());
        this.dmO().W(ipx.a(1, 8, new ipf[0]));
    }

    protected void Qd(int n) {
    }

    private ipf dfc() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dfe()));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(40, 18, this.dff())));
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        return ipx2;
    }

    private ipf dfd() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(122, 8, this.dfg())));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.cZn()));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        return ipx2;
    }

    private ipf dfe() {
        this.mld = new ist(isf.mwN, 12, 0xFFFFFF, lxb.tmy.bD(new Object[0]));
        return this.mld;
    }

    private ipf dff() {
        this.mle = new izz(this){
            final /* synthetic */ imy mlg;
            {
                this.mlg = imy2;
            }

            public void od(String string) {
                int n = Integer.parseInt(string);
                imy.a(this.mlg).setValue(n);
            }
        };
        this.mle.dqb().a(isf.mwN, 12);
        this.mle.dqb().Rk(0);
        this.mle.dqb().h(this.mla, this.mlc, false);
        this.mle.dqb().st(true);
        this.mle.dqb().setText("" + this.mlb);
        this.mle.dqb().L();
        return this.mle;
    }

    private ipf dfg() {
        this.mlf = new ixq(this){
            final /* synthetic */ imy mlg;
            {
                this.mlg = imy2;
            }

            public void Rb(int n) {
                imy.b(this.mlg).dqb().setText("" + n);
            }
        };
        this.mlf.a(this.mla, this.mlb, this.mlc - 1, 1, 1, false);
        return this.mlf;
    }

    private ipf cZn() {
        return new iur(this){
            final /* synthetic */ imy mlg;
            {
                this.mlg = imy2;
            }

            public void cLq() {
                this.mlg.close();
                this.mlg.Qd(Integer.parseInt(imy.b(this.mlg).dqb().getText()));
            }
        };
    }

    static /* synthetic */ ixq a(imy imy2) {
        return imy2.mlf;
    }

    static /* synthetic */ izz b(imy imy2) {
        return imy2.mle;
    }
}


/*
 * Decompiled with CFR.
 */
public class izs
extends izd {
    private int mla;
    private int mlb;
    private int mlc;
    private ist mld;
    private izz mle;
    private ist mDL;
    private ixq mlf;

    public izs(ioa ioa2, joa joa2, int n, int n2) {
        super("SplitQuantityWindow", "J2FWindow.swf", ioa2, new joa(joa2.X + 18.0f, joa2.Y + 18.0f, joa2.W - 36.0f, joa2.H - 36.0f), 3, 2, ire.mul);
        this.a(iod.moE);
        this.mla = n;
        this.mlc = n2;
        this.mlb = this.mla + (this.mlc - this.mla) / 2;
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

    protected ist dua() {
        return this.mld;
    }

    protected ist dub() {
        return this.mDL;
    }

    protected void Tk(int n) {
        int n2 = this.mlc - n;
        this.mDL.setText("" + n2);
    }

    private ipf dfc() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dfe()));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(40, 18, this.dff())));
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.d(this.duc()));
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
        this.mld = new ist(isf.mwN, 12, 0xFFFFFF, "Left");
        return this.mld;
    }

    private ipf dff() {
        this.mle = new izz(this){
            final /* synthetic */ izs mDM;
            {
                this.mDM = izs2;
            }

            public void od(String string) {
                int n = Integer.parseInt(string);
                izs.a(this.mDM).setValue(n);
                this.mDM.Tk(n);
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

    private ipf duc() {
        this.mDL = new ist(isf.mwN, 12, 0xFFFFFF);
        this.Tk(this.mlc - this.mlb);
        return this.mDL;
    }

    private ipf dfg() {
        this.mlf = new ixq(this){
            final /* synthetic */ izs mDM;
            {
                this.mDM = izs2;
            }

            public void Rb(int n) {
                izs.b(this.mDM).dqb().setText("" + n);
                this.mDM.Tk(n);
            }
        };
        this.mlf.a(this.mla, this.mlb, this.mlc - 1, 1, 1, false);
        return this.mlf;
    }

    private ipf cZn() {
        return new iur(this){
            final /* synthetic */ izs mDM;
            {
                this.mDM = izs2;
            }

            public void cLq() {
                this.mDM.close();
                this.mDM.Qd(Integer.parseInt(izs.b(this.mDM).dqb().getText()));
            }
        };
    }

    static /* synthetic */ ixq a(izs izs2) {
        return izs2.mlf;
    }

    static /* synthetic */ izz b(izs izs2) {
        return izs2.mle;
    }
}


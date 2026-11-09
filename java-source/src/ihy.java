/*
 * Decompiled with CFR.
 */
public class ihy
extends ihm {
    private ipx lXH;
    private ipx lXI;
    private ipx lXJ;
    private ihs lXK;
    private float lXL;
    private float lXM;
    private int lXN;
    private int lXO;

    public ihy(String string, String string2, ihs ihs2, joa joa2, float f, float f2) {
        super(string, string2, ihs2, joa2, 2, 3);
        this.lXK = ihs2;
        this.lXL = ihs2.cXP();
        this.lXM = ihs2.cXQ();
        this.lXN = (int)(f * 100.0f);
        this.lXO = (int)(f2 * 100.0f);
    }

    public ihy(ihs ihs2, joa joa2, float f, float f2) {
        this(ihs2.aDa + "WindowFrameOptions", ihs2.loi, ihs2, joa2, f, f2);
    }

    public float cXP() {
        return (float)this.lXN / 100.0f;
    }

    public float cXQ() {
        return (float)this.lXO / 100.0f;
    }

    @Override
    public void cCu() {
        ixq ixq2;
        ipx ipx2;
        super.cCu();
        this.p(40, 0, 28, 70);
        this.cXC().f(this.cYL());
        this.cXC().QU(0);
        this.cXC().QT(12);
        this.lXH = ipx.j(new ipf[0]);
        this.cXE().W(this.lXH);
        this.lXI = ipx.j(new ipf[0]);
        this.lXH.W(this.lXI);
        this.lXI.W(ipx.a(1, 8, new ipf[0]));
        if ((this.dhC().cEX() & jnz.nGe) != 0) {
            ipx2 = ipx.l(new ipf[0]);
            this.lXI.W(ipx.a(350, 24, ipx2));
            ipx2.W(ipx.a(12, 1, new ipf[0]));
            ipx2.W(ipx.d(new izy(lvw.tby)));
            ipx2.W(ipx.c(new ipf[0]));
            ixq2 = new ixq(this){
                final /* synthetic */ ihy lXP;
                {
                    this.lXP = ihy2;
                }

                public void Rb(int n) {
                    ihy.a(this.lXP, n);
                    ihy.b(this.lXP).kH((float)n / 100.0f);
                }
            };
            ixq2.a(0, this.lXN, 100, 10, 1, false);
            ipx2.W(ipx.d(ipx.a(128, 8, ixq2)));
            ipx2.W(ipx.a(12, 1, new ipf[0]));
        }
        if ((this.dhC().cEX() & jnz.nGi) != 0) {
            ipx2 = ipx.l(new ipf[0]);
            this.lXI.W(ipx.a(350, 24, ipx2));
            ipx2.W(ipx.a(12, 1, new ipf[0]));
            ipx2.W(ipx.d(new izy(lvw.tbz)));
            ipx2.W(ipx.c(new ipf[0]));
            ixq2 = new ixq(this){
                final /* synthetic */ ihy lXP;
                {
                    this.lXP = ihy2;
                }

                public void Rb(int n) {
                    ihy.b(this.lXP, n);
                    ihy.b(this.lXP).kH((float)n / 100.0f);
                }
            };
            ixq2.a(0, this.lXO, 100, 10, 1, false);
            ipx2.W(ipx.d(ipx.a(128, 8, ixq2)));
            ipx2.W(ipx.a(12, 1, new ipf[0]));
        }
        this.lXH.W(ipx.a(1, 8, new ipf[0]));
        this.lXJ = ipx.l(new ipf[0]);
        this.lXH.W(this.lXJ);
        this.lXJ.W(ipx.a(12, 1, new ipf[0]));
        this.lXJ.W(ipx.c(new iwx()));
        this.lXJ.W(ipx.a(12, 1, new ipf[0]));
        this.lXH.W(ipx.a(1, 4, new ipf[0]));
        this.lXJ.setVisible(false);
        ipx2 = ipx.l(new ipf[0]);
        this.cXE().W(ipx2);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.d(new iur(this){
            final /* synthetic */ ihy lXP;
            {
                this.lXP = ihy2;
            }

            public void cLq() {
                this.lXP.close();
                this.lXP.cNl();
            }
        }));
        ipx2.W(ipx.a(3, 1, new ipf[0]));
        ipx2.W(ipx.d(new ivc(this){
            final /* synthetic */ ihy lXP;
            {
                this.lXP = ihy2;
            }

            public void cLq() {
                this.lXP.close();
            }
        }));
        ipx2.W(ipx.a(5, 1, new ipf[0]));
        this.cXE().W(ipx.a(1, 73, new ipf[0]));
    }

    @Override
    protected ipf cMs() {
        iqa iqa2 = new iqa("/dfdata/texture/gui/j2f/chat/popups/window_popup_bg_opacity.png", 40, 25, 200, 100);
        iqa2.a(iqb.mtp);
        return iqa2;
    }

    @Override
    protected void cGR() {
        super.cGR();
        this.lXK.kH(this.lXK.cXO() == ihx.lXF ? this.lXL : this.lXM);
    }

    protected void cNl() {
    }

    protected iph cYJ() {
        return this.lXH;
    }

    protected ipf cYK() {
        return this.lXJ;
    }

    protected void a(lox lox2, ixq ixq2) {
        ipx ipx2 = ipx.l(new ipf[0]);
        this.lXI.W(ipx.a(350, 24, ipx2));
        ipx2.W(ipx.a(12, 1, new ipf[0]));
        ipx2.W(ipx.d(new izy(lox2)));
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.d(ipx.a(128, 8, ixq2)));
        ipx2.W(ipx.a(12, 1, new ipf[0]));
    }

    protected lox cYL() {
        return lvw.tbx;
    }

    static /* synthetic */ int a(ihy ihy2, int n) {
        ihy2.lXN = n;
        return ihy2.lXN;
    }

    static /* synthetic */ ihs b(ihy ihy2) {
        return ihy2.lXK;
    }

    static /* synthetic */ int b(ihy ihy2, int n) {
        ihy2.lXO = n;
        return ihy2.lXO;
    }
}


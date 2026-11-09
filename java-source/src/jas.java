/*
 * Decompiled with CFR.
 */
public class jas
extends ihs {
    private static final String TC = "SFMentoringRatingWindow";
    private static final String mIP = "TitleIcon";
    private static final String mIQ = "Background";
    private static final String mKX = "TextFieldBackground";
    private static final String mKF = "CloseButtonDisabled";
    private static final String mKG = "CloseButtonHover";
    private static final String mKH = "CloseButtonNormal";
    private static final String mKI = "CloseButtonPushing";
    private static final String mKY = "AcceptButtonDisabled";
    private static final String mKZ = "AcceptButtonHover";
    private static final String mLa = "AcceptButtonNormal";
    private static final String mLb = "AcceptButtonPushing";
    private static final isf mLc = isf.mwO;
    private static final int mLd = 18;
    private static final int mLe = 12357465;
    private static final isu mLf = isu.mxP;
    private static final isf mLg = isf.mwN;
    private static final int mLh = 12;
    private static final int mLi = 0xABABAB;
    private static final isu mLj = isu.mxP;
    private static final isf mLk = isf.mwO;
    private static final int mLl = 14;
    private static final int mLm = 12357465;
    private static final isu mLn = isu.mxR;
    private static final isf mJy = isf.mwO;
    private static final int mJz = 14;
    private static final int mJA = 0xABABAB;
    private static final isu mJB = isu.mxP;
    private static final isf mLo = isf.mwN;
    private static final int mLp = 12;
    private static final int mLq = 0x8B8B8B;
    private static final int mLr = 0x424242;
    private static final isu mLs = isu.mxP;
    private ipb mKa;
    private ipb lLM;
    private iqa mLt;
    private ist mLu;
    private iso mLv;
    private ist mLw;
    private ist mKl;
    private irq mKm;
    private isq mLx;
    private iok mLy;
    private iok mKS;
    private boolean mLz = true;
    private final String mLA;
    private final hyq lpI;
    protected String mLB;

    public jas(String string, hyq hyq2) {
        super("MentoringRatingWindow", "MentoringRatingWindow.swf");
        this.a(hya.lmp, true);
        this.OQ(-1);
        this.U(384.0f, 450.0f);
        this.qW(true);
        this.qX(true);
        this.mLA = string;
        this.lpI = hyq2;
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.cXE().a(irl.dnr());
        this.mKa = new ipb(mIP);
        this.a(this.mKa, 3, 0, 24, lxk.trO.bD(new Object[0]));
        this.lLM = new ipb(mIQ);
        this.cXE().W(this.lLM);
        ipx ipx2 = new ipx(iqo.dmT());
        this.cXE().W(ipx2);
        ipx ipx3 = ipx.l(new ipf[0]);
        ipx2.W(ipx3);
        ipx3.W(ipx.a(50, 1, new ipf[0]));
        ipx ipx4 = ipx.j(new ipf[0]);
        ipx3.W(ipx4);
        ipx4.W(ipx.a(1, 10, new ipf[0]));
        this.mLu = new ist();
        this.mLu.a(mLc, 18);
        this.mLu.Rk(12357465);
        this.mLu.a(mLf);
        this.mLu.o(lxk.trY.bD(new Object[0]));
        ipx4.W(this.mLu);
        ipx4.W(ipx.a(1, 4, new ipf[0]));
        this.mLv = new iso();
        this.mLv.a(mLg, 12);
        this.mLv.Rk(0xABABAB);
        this.mLv.a(mLj);
        this.mLv.o(lxk.tsa.bD(new Object[0]));
        this.mLv.setSize(280, 50);
        ipx4.W(this.mLv);
        ipx4.W(ipx.a(1, 20, new ipf[0]));
        this.mLw = new ist();
        this.mLw.a(mLk, 14);
        this.mLw.Rk(12357465);
        this.mLw.a(mLn);
        this.mLw.setText(this.mLA);
        ipx4.W(this.mLw);
        ipx4.W(ipx.a(1, 7, new ipf[0]));
        ipx4.W(new ipk(0x313131, 296, 1));
        ipx4.W(ipx.a(1, 8, new ipf[0]));
        ipx ipx5 = ipx.l(new ipf[0]);
        this.mKl = new ist();
        this.mKl.a(mJy, 14);
        this.mKl.Rk(0xABABAB);
        this.mKl.a(mJB);
        this.mKl.setText(lxk.trZ.bD(new Object[0]).exA());
        ipx5.W(ipx.c(new ipf[]{this.mKl}));
        ipx5.W(new ipk(0x313131, 1, 21));
        this.mKm = new irq(iqo.dmS(), 5, true);
        ipx5.W(ipx.c(new ipf[]{ipx.d(this.mKm)}));
        ipx4.W(ipx5);
        ipx4.W(ipx.a(1, 10, new ipf[0]));
        ipx4.W(new ipk(0x313131, 296, 1));
        ipx4.W(ipx.a(1, 12, new ipf[0]));
        this.mLt = new iqa(mKX, 5, 5, 5, 5);
        ipx ipx6 = new ipx(irl.dnr());
        ipx6.W(this.mLt);
        this.mLx = new isq(this){
            final /* synthetic */ jas mLC;
            {
                this.mLC = jas2;
            }

            public void dmh() {
                super.dmh();
                jas.a(this.mLC).Rk(0x424242);
                if (jas.b(this.mLC)) {
                    jas.a(this.mLC, false);
                    jas.a(this.mLC).setText("");
                }
            }

            public void cEj() {
                super.cEj();
                jas.a(this.mLC).Rk(0x8B8B8B);
            }

            public void pI(String string) {
                super.pI(string);
                this.mLC.mLB = string;
                jas.c(this.mLC);
            }
        };
        this.mLx.SQ(140);
        this.mLx.sv(false);
        this.mLx.setText(lxk.tsb.bD(new Object[0]).exA());
        this.mLx.a(mLo, 12);
        this.mLx.Rk(0x8B8B8B);
        this.mLx.a(mLs);
        this.mLx.setSize(280, 75);
        ipx6.W(ipx.c(5, 5, 5, 5, this.mLx));
        ipx4.W(ipx6);
        ipx ipx7 = ipx.l(new ipf[0]);
        ipx7.W(ipx.c(new ipf[0]));
        this.mLy = new iok(this, mKY, mLa, mKZ, mLb){
            final /* synthetic */ jas mLC;
            {
                this.mLC = jas2;
                super(string, string2, string3, string4);
            }

            public void cLq() {
                jas.d(this.mLC);
            }
        };
        ipx7.W(this.mLy);
        ipx7.W(ipx.a(8, 1, new ipf[0]));
        this.mKS = new iok(this, mKF, mKH, mKG, mKI){
            final /* synthetic */ jas mLC;
            {
                this.mLC = jas2;
                super(string, string2, string3, string4);
            }

            public void cLq() {
                jas.d(this.mLC);
            }
        };
        ipx7.W(this.mKS);
        ipx7.W(ipx.a(40, 1, new ipf[0]));
        ipx2.W(ipx.a(1, 11, new ipf[0]));
        ipx2.W(ipx7);
    }

    private void dvQ() {
        if (this.mLz) {
            this.closeWindow();
            return;
        }
        this.mLx.dpv();
    }

    public int bRq() {
        return this.mKm.bRq();
    }

    public String dvR() {
        return this.mLB;
    }

    private void closeWindow() {
        if (this.lpI != null) {
            this.lpI.s(this);
        }
        this.close();
    }

    public void cEk() {
        super.cEk();
        if (this.cXM() != null) {
            this.cXM().A(lxk.trO.bD(new Object[0]));
        }
        if (this.mLu != null) {
            this.mLu.o(lxk.trY.bD(new Object[0]));
        }
        if (this.mLv != null) {
            this.mLv.o(lxk.tsa.bD(new Object[0]));
        }
        if (this.mKl != null) {
            this.mKl.setText(lxk.trZ.bD(new Object[0]).exA());
        }
        if (this.mLx != null) {
            this.mLx.setText(lxk.tsb.bD(new Object[0]).exA());
        }
    }

    @Override
    protected ipq cGj() {
        return null;
    }

    @Override
    protected ios cGs() {
        return null;
    }

    @Override
    protected iox cGl() {
        return null;
    }

    @Override
    protected ios cGk() {
        return null;
    }

    static /* synthetic */ isq a(jas jas2) {
        return jas2.mLx;
    }

    static /* synthetic */ boolean b(jas jas2) {
        return jas2.mLz;
    }

    static /* synthetic */ boolean a(jas jas2, boolean bl) {
        jas2.mLz = bl;
        return jas2.mLz;
    }

    static /* synthetic */ void c(jas jas2) {
        jas2.closeWindow();
    }

    static /* synthetic */ void d(jas jas2) {
        jas2.dvQ();
    }
}


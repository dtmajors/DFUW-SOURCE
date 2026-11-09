/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jar
extends ihs {
    private static final String mIP = "TitleIcon";
    private static final String mIQ = "Background";
    private static final String mKF = "CloseButtonDisabled";
    private static final String mKG = "CloseButtonHover";
    private static final String mKH = "CloseButtonNormal";
    private static final String mKI = "CloseButtonPushing";
    private static final String mKJ = "WhisperButtonDisabled";
    private static final String mKK = "WhisperButtonHover";
    private static final String mKL = "WhisperButtonNormal";
    private static final String mKM = "WhisperButtonPushing";
    private static final String mIS = "ButtonSearchDisabled";
    private static final String mIT = "ButtonSearchHover";
    private static final String mIU = "ButtonSearchNormal";
    private static final String mIV = "ButtonSearchPushing";
    private static final isf mIW = isf.mwO;
    private static final int mIX = 18;
    private static final int mIY = 12357465;
    private static final isu mIZ = isu.mxP;
    private static final isf mJa = isf.mwN;
    private static final int mJb = 12;
    private static final int mJc = 0xABABAB;
    private static final isu mJd = isu.mxP;
    private static final isf mJe = isf.mwO;
    private static final int mJf = 14;
    private static final int mJg = 0xABABAB;
    private static final isu mJh = isu.mxP;
    private static final isf mJi = isf.mwO;
    private static final int mJj = 18;
    private static final int mJk = 12357465;
    private static final isu mJl = isu.mxP;
    private static final isf mJm = isf.mwO;
    private static final int mJn = 14;
    private static final int mJo = 0x5D5D5D;
    private static final isu mJp = isu.mxP;
    private static final isf mJq = isf.mwO;
    private static final int mJr = 14;
    private static final int mJs = 0x5A5A5A;
    private static final int mKN = 0xABABAB;
    private static final isu mJt = isu.mxP;
    private static final isf mKO = isf.mwN;
    private static final int mKP = 11;
    private static final int mKQ = 0x5C5C5C;
    private static final isu mKR = isu.mxR;
    private ipb mKa;
    private ipb lLM;
    private iok mKS;
    private iok mKf;
    private iok mKT;
    private ist mKc;
    private iso mKd;
    private ist mKe;
    private ist mKg;
    private ist mKU;
    private ist mKV;
    private boolean adc = false;
    private String iUF = null;
    private final hyq mKz;

    public jar(hyq hyq2) {
        super("MentoringInitialWindow", "MentoringInitialWindow.swf");
        this.OQ(jnz.nGe | jnz.nGi);
        this.U(384.0f, 432.0f);
        this.qW(true);
        this.qX(true);
        this.ql(true);
        this.mKz = hyq2;
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.QT(0);
        this.Rz(35);
        this.RA(85);
        this.mKa = new ipb(mIP);
        this.a(this.mKa, 3, 0, 24, lxk.trO.bD(new Object[0]));
        this.lLM = new ipb(mIQ);
        this.cXE().a(irl.dnr());
        this.cXE().W(ipx.a(this.cXH(), 0, this.dhN(), this.dhO(), this.lLM));
        ipx ipx2 = ipx.j(new ipf[0]);
        this.cXE().W(ipx2);
        ipx2.W(ipx.a(1, 7, new ipf[0]));
        ipx2.W(this.dvP());
        ipx2.W(this.dvO());
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx2.W(this.dvC());
        ipx2.W(ipx.a(1, 6, new ipf[0]));
        ipx2.W(ipx.l(ipx.a(50, 1, new ipf[0]), new ipk(0x313131, 290, 1)));
        ipx2.W(ipx.a(1, 2, new ipf[0]));
        ipx2.W(this.dvM());
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(this.dvN());
        ipx2.W(ipx.a(1, 6, new ipf[0]));
        ipx2.W(ipx.l(ipx.a(50, 1, new ipf[0]), new ipk(0x313131, 290, 1)));
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(this.dvL());
        ipx2.W(this.dvK());
    }

    private ipf dvK() {
        this.mKS = new iok(this, mKF, mKH, mKG, mKI){
            final /* synthetic */ jar mKW;
            {
                this.mKW = jar2;
                super(string, string2, string3, string4);
            }

            public void cLq() {
                this.mKW.close();
            }
        };
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(322, 1, new ipf[0]));
        ipx2.W(this.mKS);
        return ipx2;
    }

    private ipf dvL() {
        this.mKV = new ist();
        this.mKV.a(mKO, 11);
        this.mKV.Rk(0x5C5C5C);
        this.mKV.a(mKR);
        this.mKV.o(lxk.trV.bD(new Object[0]));
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(50, 1, new ipf[0]));
        ipx2.W(this.mKV);
        return ipx2;
    }

    private ipf dvM() {
        this.mKg = new ist();
        this.mKg.a(mJi, 18);
        this.mKg.Rk(12357465);
        this.mKg.a(mJl);
        this.mKg.o(lxk.trT.bD(new Object[0]));
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(50, 1, new ipf[0]));
        ipx2.W(this.mKg);
        return ipx2;
    }

    private ipx dvN() {
        this.mKU = new ist();
        this.mKU.a(mJm, 14);
        this.mKU.Rk(0x5D5D5D);
        this.mKU.a(mJp);
        this.mKU.o(lxk.trU.bD(new Object[0]));
        this.mKT = new iok(this, mKJ, mKL, mKK, mKM){
            final /* synthetic */ jar mKW;
            {
                this.mKW = jar2;
                super(string, string2, string3, string4);
            }

            public void cLq() {
                hyn.cyJ().oh(jar.a(this.mKW));
            }

            public hyn dd(int n, int n2) {
                return jar.a(this.mKW) != null ? iae.oJ(jar.b(this.mKW) ? lxk.tse.bD(new Object[0]).exA() : lxk.tsl.bD(new Object[0]).exA()) : null;
            }
        };
        this.mKT.rF(false);
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(75, 1, new ipf[0]));
        ipx2.W(this.mKU);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(new ipk(0x313131, 1, 21));
        ipx2.W(ipx.a(12, 1, new ipf[0]));
        ipx2.W(ipx.d(this.mKT));
        ipx2.W(ipx.a(50, 1, new ipf[0]));
        return ipx2;
    }

    private ipx dvC() {
        this.mKe = new ist();
        this.mKe.a(mJe, 14);
        this.mKe.Rk(0xABABAB);
        this.mKe.a(mJh);
        this.mKe.o(lxk.trR.bD(new Object[0]));
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(65, 1, new ipf[0]));
        ipx2.W(this.mKe);
        this.mKf = new iok(this, mIS, mIU, mIT, mIV){
            static final /* synthetic */ boolean $assertionsDisabled;
            final /* synthetic */ jar mKW;
            {
                this.mKW = jar2;
                super(string, string2, string3, string4);
            }

            public void cLq() {
                if (ioa.cxP().cyZ().abF() >= ls.pz()) {
                    if (!$assertionsDisabled) {
                        throw new AssertionError((Object)"Player can not be an apprentice");
                    }
                    return;
                }
                gkt gkt2 = (gkt)jar.d(this.mKW).h(31491, jar.c(this.mKW), hso.cxK().bAn().Tr);
                gkt2.ed = 9;
                gkt2.YN = hso.cxK().bAn().Tr;
                gkt2.YL = "";
                jar.e(this.mKW).F(gkt2);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxk.tsd.bD(new Object[0]).exA());
            }

            static {
                $assertionsDisabled = !jar.class.desiredAssertionStatus();
            }
        };
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(new ipk(0x313131, 1, 21));
        ipx2.W(ipx.a(12, 1, new ipf[0]));
        ipx2.W(ipx.d(this.mKf));
        ipx2.W(ipx.a(50, 1, new ipf[0]));
        return ipx2;
    }

    private ipx dvO() {
        this.mKd = new iso();
        this.mKd.a(mJa, 12);
        this.mKd.Rk(0xABABAB);
        this.mKd.a(mJd);
        this.mKd.o(lxk.trQ.bD(new Object[0]));
        this.mKd.setWidth(290);
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(50, 1, new ipf[0]));
        ipx2.W(this.mKd);
        return ipx2;
    }

    private ipx dvP() {
        this.mKc = new ist();
        this.mKc.a(mIW, 18);
        this.mKc.Rk(12357465);
        this.mKc.a(mIZ);
        this.mKc.o(lxk.trP.bD(new Object[0]));
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(50, 1, new ipf[0]));
        ipx2.W(this.mKc);
        return ipx2;
    }

    public void C(String string, boolean bl) {
        this.iUF = string;
        this.adc = bl;
        this.mKU.setText(string != null ? string : lxk.trU.bD(new Object[0]).exA());
        int n = string != null && bl ? 0xABABAB : (string != null && !bl ? 0x5A5A5A : 0x5D5D5D);
        this.mKU.Rk(n);
        this.mKe.o(string != null ? lxk.trS.bD(new Object[0]) : lxk.trR.bD(new Object[0]));
        this.mKT.rF(string != null && bl);
        this.mKf.rF(string == null);
    }

    public void cEk() {
        super.cEk();
        if (this.cXM() != null) {
            this.cXM().A(lxk.trO.bD(new Object[0]));
        }
        if (this.mKc != null) {
            this.mKc.o(lxk.trP.bD(new Object[0]));
        }
        if (this.mKd != null) {
            this.mKd.o(lxk.trQ.bD(new Object[0]));
        }
        if (this.mKg != null) {
            this.mKg.o(lxk.trT.bD(new Object[0]));
        }
        if (this.mKe != null) {
            this.mKe.o(this.iUF != null ? lxk.trS.bD(new Object[0]) : lxk.trR.bD(new Object[0]));
        }
        if (this.mKU != null) {
            this.mKU.setText(this.iUF == null ? lxk.trU.bD(new Object[0]).exA() : this.iUF);
        }
        if (this.mKV != null) {
            if (this.iUF == null) {
                this.mKV.o(lxk.trV.bD(new Object[0]));
            } else {
                this.mKV.setText("");
            }
        }
    }

    @Override
    public void close() {
        this.mKz.s(this);
        this.cGR();
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

    static /* synthetic */ String a(jar jar2) {
        return jar2.iUF;
    }

    static /* synthetic */ boolean b(jar jar2) {
        return jar2.adc;
    }

    static /* synthetic */ ldv c(jar jar2) {
        return jar2.GUID;
    }

    static /* synthetic */ dxr d(jar jar2) {
        return jar2.MessageDelegator;
    }

    static /* synthetic */ dxr e(jar jar2) {
        return jar2.MessageDelegator;
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  hvy
 */
public class jbp
extends ioa {
    private static final int mOL = 0x333333;
    private static final int mOM = 12357465;
    private static final int mON = 10881803;
    private static final int lCH = 12357465;
    private static final int lCI = 0x424242;
    private final int mOO = 12;
    private final int mOP = 12;
    private ipx lLK;
    private ipk lLL;
    private ipb lLM;
    private jaa lLN;
    private ipb mOQ;
    private ist mOR;
    private izz mOS;
    private ist mOT;
    private izz mOU;
    private iso lLR;
    private ios lLS;
    private ios lLT;
    private String FirstName = null;
    private String LastName = null;
    private final hyq lpI;

    public jbp(hyq hyq2) {
        super("PlayerNameChange", "PlayerNameChange.swf");
        this.lpI = hyq2;
        this.a(hya.lmp, true);
        this.OQ(jnz.nGi);
        this.a(hyb.lmC);
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.lLL = new ipk(0x333333);
        this.lLL.hz(0.3f);
        this.lLK = new ipx(this){
            final /* synthetic */ jbp mOV;
            {
                this.mOV = jbp2;
            }

            public boolean du(int n, int n2) {
                if (n > jbp.a(this.mOV).getX() && n < jbp.a(this.mOV).getX() + jbp.a(this.mOV).getWidth() && n2 > jbp.a(this.mOV).getY() && n2 < jbp.a(this.mOV).getY() + jbp.a(this.mOV).getHeight()) {
                    return true;
                }
                jbp.b(this.mOV);
                return true;
            }
        };
        this.lLK.W(this.lLL);
        this.mOQ = new ipb("PiNameChange");
        this.lLM = new ipb("BackgroundBitmap");
        this.lLN = new jaa();
        this.lLN.Rk(12357465);
        this.lLN.a(isu.mxR);
        this.lLN.a(isf.mwO, 20);
        this.mOS = new izz(this){
            final /* synthetic */ jbp mOV;
            {
                this.mOV = jbp2;
            }

            public void od(String string) {
                jbp.a(this.mOV, jbp.a(this.mOV, string, true));
                jbp.d(this.mOV).setText(jbp.c(this.mOV));
            }
        };
        this.mOS.st(true);
        this.mOS.dqb().a(isf.mwN, 15);
        this.mOS.dqb().Rk(0x424242);
        this.mOU = new izz(this){
            final /* synthetic */ jbp mOV;
            {
                this.mOV = jbp2;
            }

            public void od(String string) {
                jbp.b(this.mOV, jbp.a(this.mOV, string, false));
                jbp.f(this.mOV).setText(jbp.e(this.mOV));
            }
        };
        this.mOU.st(true);
        this.mOU.dqb().a(isf.mwN, 15);
        this.mOU.dqb().Rk(0x424242);
        this.lLR = new iso();
        this.lLR.Rk(10881803);
        this.lLR.a(isf.mwN, 14);
        this.lLS = new ivc(this){
            final /* synthetic */ jbp mOV;
            {
                this.mOV = jbp2;
            }

            public void cLq() {
                jbp.b(this.mOV);
            }
        };
        this.lLT = new iur(this){
            final /* synthetic */ jbp mOV;
            {
                this.mOV = jbp2;
            }

            public void cLq() {
                cu.b b2 = cu.c.a(jbp.c(this.mOV), jbp.e(this.mOV), null);
                if (b2 != cu.b.kX) {
                    jbp.c(this.mOV, b2.toString());
                } else {
                    hzr hzr2 = new hzr();
                    hzr2.oq("SFYesNoDialogSelentine");
                    hzr2.pu(false);
                    hzr2.setVisible(true);
                    hzr2.setGUID(jbp.g(this.mOV).bzv());
                    hzr2.G(lxz.tCd.bD(10).exA(), lxz.tBM.bD(new Object[0]).exA());
                    hzr2.a(new hzq(this){
                        final /* synthetic */ 5 mOW;
                        {
                            this.mOW = var1_1;
                        }

                        public void O(float f2, float f3) {
                        }

                        public void oH(boolean bl) {
                            if (bl) {
                                ghg ghg2 = (ghg)jbp.h(this.mOW.mOV).h(32513, this.mOW.mOV.getGUID(), hso.cxK().bAn().gYX);
                                ghg2.cZn = cio.eCD.ordinal();
                                ghg2.SkillType = -1;
                                ghg2.jht = true;
                                ghg2.ResourceType = -1;
                                ghg2.YL = jbp.c(this.mOW.mOV).trim() + " " + jbp.e(this.mOW.mOV).trim();
                                jbp.i(this.mOW.mOV).E(ghg2);
                            }
                        }
                    });
                    jbp.j(this.mOV).a((amf)((Object)hzr2));
                }
            }
        };
        this.mOR = new ist();
        this.mOR.Rk(12357465);
        this.mOR.a(isu.mxQ);
        this.mOR.a(isf.mwO, 14);
        this.mOT = new ist();
        this.mOT.Rk(12357465);
        this.mOT.a(isu.mxQ);
        this.mOT.a(isf.mwO, 14);
        this.dhJ().W(this.lLK);
        this.dhJ().W(this.lLM);
        this.dhJ().W(this.mOQ);
        this.dhJ().W(this.lLN);
        this.dhJ().W(this.mOS);
        this.dhJ().W(this.mOU);
        this.dhJ().W(this.lLR);
        this.dhJ().W(this.lLS);
        this.dhJ().W(this.lLT);
        this.dhJ().W(this.mOT);
        this.dhJ().W(this.mOR);
        float f2 = hso.cxK().cxY().dOj();
        float f3 = hso.cxK().cxY().TG();
        this.T(f2, f3);
        this.cEk();
    }

    private void closeWindow() {
        this.lpI.s(this);
    }

    private String D(String string, boolean bl) {
        int n;
        if (string == null) {
            return "";
        }
        if ((string = string.trim()).length() <= 1) {
            return string;
        }
        int n2 = n = bl ? cu.c.cv() : cu.c.cw();
        if (string.length() > n) {
            string = string.substring(0, n);
        }
        return string;
    }

    @Override
    protected void cuf() {
        super.cCw();
        int n = (int)this.getWidth();
        int n2 = (int)this.getHeight();
        this.lLK.r(0, 0, n, n2);
        this.lLL.r(0, 0, n, n2);
        this.lLM.ek(n / 2 - this.lLM.getWidth() / 2, n2 / 2 - this.lLM.getHeight() / 2);
        this.lLN.r(this.lLM.getX() + 120, this.lLM.getY() - 2, 100, 24);
        this.mOQ.ek(this.lLM.getX() + 45, this.lLM.getY() + 57);
        this.mOR.r(this.lLM.getX() + 155, this.lLM.getY() + 60, 100, 24);
        this.mOS.r(this.lLM.getX() + 260, this.lLM.getY() + 60, 145, 22);
        this.mOT.r(this.lLM.getX() + 155, this.lLM.getY() + 95, 100, 24);
        this.mOU.r(this.lLM.getX() + 260, this.lLM.getY() + 95, 145, 22);
        this.lLR.r(this.lLM.getX() + 130, this.lLM.getY() + 120, 368, 24);
        this.lLT.ek(this.lLM.getX() + 350, this.lLM.getY() + 152);
        this.lLS.ek(this.lLM.getX() + 381, this.lLM.getY() + 152);
        this.R(0.0f, 0.0f);
    }

    public void cEk() {
        super.cEk();
        if (this.lLN != null) {
            this.lLN.setText(mcr.uxW.bD(cug.fua).exA());
        }
        if (this.mOR != null) {
            this.mOR.g(lvq.sZg);
        }
        if (this.mOT != null) {
            this.mOT.g(lvq.sZh);
        }
    }

    @Override
    public void cEc() {
        if (this.isVisible()) {
            if (this.mOS != null) {
                this.mOS.setText(jbp.cxP().cyJ().cIq().iP());
            }
            if (this.mOS != null) {
                this.mOS.setText(jbp.cxP().cyJ().cIq().iR());
            }
        }
    }

    private String TN(int n) {
        cin cin2 = cin.getValueByOrdinal(n);
        switch (cin2) {
            case eCh: {
                return mcr.sWD.bD(new Object[0]).exA();
            }
            case eCf: {
                return mcr.uyd.bD(new Object[0]).exA();
            }
            case eCe: {
                return mcr.uxZ.bD(new Object[0]).exA();
            }
            case eCg: {
                return mcr.uya.bD(new Object[0]).exA();
            }
            case eCj: {
                return mcr.uxY.bD(new Object[0]).exA();
            }
            case eCi: {
                hvy hvy2 = jbp.cxP().cyZ();
                if (hvy2 != null) {
                    double d2 = hvy2.cAC();
                    int n2 = hvy2.cAE();
                    return lxz.tBE.bD((double)n2 - d2, cug.fua).exA();
                }
                return mcr.uxX.bD(new Object[0]).exA();
            }
        }
        return mcr.sWD.bD(new Object[0]).exA();
    }

    private void rT(String string) {
        this.lLR.setText(string);
    }

    private void a(ghh ghh2) {
        int n = ghh2.cZn;
        cio cio2 = cio.getValueByOrdinal(n);
        switch (cio2) {
            case eCD: {
                if (ghh2.jhy) {
                    jbp.cxP().v(mcr.uyc.bD(new Object[0]));
                    this.closeWindow();
                    return;
                }
                this.rT(this.TN(ghh2.ew));
                break;
            }
            default: {
                assert (false) : "Unhandled Transaction Type : " + (Object)((Object)cio2);
                break;
            }
        }
    }

    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 32514: {
                this.a((ghh)dxq2);
            }
        }
    }

    @Override
    public void b(jnz jnz2, jnz jnz3) {
        this.closeWindow();
    }

    static /* synthetic */ ipb a(jbp jbp2) {
        return jbp2.lLM;
    }

    static /* synthetic */ void b(jbp jbp2) {
        jbp2.closeWindow();
    }

    static /* synthetic */ String a(jbp jbp2, String string) {
        jbp2.FirstName = string;
        return jbp2.FirstName;
    }

    static /* synthetic */ String a(jbp jbp2, String string, boolean bl) {
        return jbp2.D(string, bl);
    }

    static /* synthetic */ String c(jbp jbp2) {
        return jbp2.FirstName;
    }

    static /* synthetic */ izz d(jbp jbp2) {
        return jbp2.mOS;
    }

    static /* synthetic */ String b(jbp jbp2, String string) {
        jbp2.LastName = string;
        return jbp2.LastName;
    }

    static /* synthetic */ String e(jbp jbp2) {
        return jbp2.LastName;
    }

    static /* synthetic */ izz f(jbp jbp2) {
        return jbp2.mOU;
    }

    static /* synthetic */ void c(jbp jbp2, String string) {
        jbp2.rT(string);
    }

    static /* synthetic */ dxr g(jbp jbp2) {
        return jbp2.MessageDelegator;
    }

    static /* synthetic */ dxr h(jbp jbp2) {
        return jbp2.MessageDelegator;
    }

    static /* synthetic */ dxr i(jbp jbp2) {
        return jbp2.MessageDelegator;
    }

    static /* synthetic */ dxr j(jbp jbp2) {
        return jbp2.MessageDelegator;
    }
}


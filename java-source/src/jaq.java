/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  hyn
 */
import java.util.Collection;
import java.util.List;

public class jaq
extends ihs
implements hzq {
    private static final boolean mIM = true;
    private static final int EMPTY = 0;
    private static final int mIN = 1;
    private static final int mIO = 2;
    private static final String mIP = "TitleIcon";
    private static final String mIQ = "Background";
    private static final String mIR = "HorizontalLineBig";
    private static final String mIS = "SearchButtonDisabled";
    private static final String mIT = "SearchButtonHover";
    private static final String mIU = "SearchButtonNormal";
    private static final String mIV = "SearchButtonPushing";
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
    private static final int mJs = 0xABABAB;
    private static final isu mJt = isu.mxP;
    private static final isf mJu = isf.mwO;
    private static final int mJv = 16;
    private static final int mJw = 0xABABAB;
    private static final isu mJx = isu.mxP;
    private static final isf mJy = isf.mwO;
    private static final int mJz = 16;
    private static final int mJA = 0xABABAB;
    private static final isu mJB = isu.mxP;
    private static final isf mJC = isf.mwO;
    private static final int mJD = 15;
    private static final int mJE = 12357465;
    private static final isu mJF = isu.mxP;
    private static final isf mJG = isf.mwO;
    private static final int mJH = 18;
    private static final int mJI = 12357465;
    private static final isu mJJ = isu.mxP;
    private static final isf mJK = isf.mwN;
    private static final int mJL = 16;
    private static final int mJM = 12357465;
    private static final isu mJN = isu.mxP;
    private static final isf mJO = isf.mwN;
    private static final int mJP = 14;
    private static final int mJQ = 0xABABAB;
    private static final isu mJR = isu.mxP;
    private static final isf mJS = isf.mwN;
    private static final int mJT = 14;
    private static final int mJU = 0xABABAB;
    private static final isu mJV = isu.mxR;
    private static final isf mJW = isf.mwN;
    private static final int mJX = 14;
    private static final int mJY = 0xABABAB;
    private static final isu mJZ = isu.mxP;
    private ipb mKa;
    private ipb lLM;
    private ipx mKb;
    private ist mKc;
    private iso mKd;
    private ist mKe;
    private iok mKf;
    private ist mKg;
    private ist mKh;
    private ipx mKi;
    private ist mKj;
    private b mKk;
    private ist mKl;
    private irq mKm;
    private ist mKn;
    private ist mKo;
    private ipb mKp;
    private ipb mKq;
    private ipx mKr;
    private iso mKs;
    private ipx mKt = null;
    private iug mKu = null;
    private iug mKv = null;
    private ist mKw = null;
    private boolean mKx = true;
    private boolean dOL = false;
    private int mKy = -1;
    private final hyq mKz;
    private final jgs mKA;
    private jgs.a mKB = null;
    private int ed = -1;

    public jaq(hyq hyq2, jgs jgs2) {
        super("MentorWindow", "MentorWindow.swf");
        this.OQ(jnz.nGe | jnz.nGi);
        this.U(447.0f, 640.0f);
        this.qU(true);
        this.qV(true);
        this.setVisible(false);
        this.mKA = jgs2;
        this.mKz = hyq2;
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.cXE().a(irl.dnr());
        this.mKa = new ipb(mIP);
        this.a(this.mKa, 7, 6, 24, lxk.trO.bD(new Object[0]));
        this.cXM().cYx().a(new iqu(32, 1));
        this.lLM = new ipb(mIQ);
        this.cXE().W(this.lLM);
        this.mKi = this.dvv();
        this.mKb = this.dvz();
        this.mKr = this.dvD();
        this.mKt = ipx.l(new ipf[0]);
        this.mKt.W(ipx.a(47, 1, new ipf[0]));
        this.mKt.W(ipx.c(new ipf[0]));
        this.mKt.W(ipx.a(47, 1, new ipf[0]));
        this.cXE().W(this.mKt);
        this.dOL = true;
        if (this.isVisible()) {
            this.updateWindow();
        }
    }

    private ipx dvv() {
        ipx ipx2 = new ipx(iqo.dmT());
        ipx2.W(ipx.a(1, 22, new ipf[0]));
        ipx2.W(this.dvw());
        ipx2.W(ipx.a(1, 10, new ipf[0]));
        ipx2.W(new ipk(0x313131, 21, 1));
        ipx2.W(this.dvx());
        ipx2.W(new ipk(0x313131, 10, 1));
        ipx2.W(ipx.a(1, 35, new ipf[0]));
        ipx2.W(this.dvy());
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx2.W(this.dvE());
        ipx2.W(ipx.a(1, 5, new ipf[0]));
        ipx2.W(new ipk(0x313131, 150, 1));
        ipx2.W(this.dvG());
        return ipx2;
    }

    private ipx dvw() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(5, 1, new ipf[0]));
        this.mKj = new ist();
        this.mKj.a(mJu, 16);
        this.mKj.Rk(0xABABAB);
        this.mKj.a(mJx);
        this.mKj.setText(lxk.trW.bD(new Object[0]).exA().toUpperCase());
        ipx2.W(this.mKj);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(new ipk(0x313131, 1, 21));
        ipx2.W(ipx.a(7, 1, new ipf[0]));
        this.mKk = new b(this){
            final /* synthetic */ jaq mKC;
            {
                this.mKC = jaq2;
                super(jaq2);
            }

            public void cLq() {
                gkt gkt2 = (gkt)jaq.b(this.mKC).h(31491, jaq.a(this.mKC), hso.cxK().bAn().Tr);
                gkt2.ed = !jaq.c(this.mKC).isRegistered() ? 7 : 8;
                gkt2.YN = hso.cxK().bAn().Tr;
                gkt2.YL = "";
                jaq.d(this.mKC).F(gkt2);
            }
        };
        this.mKk.hX(this.mKA.isRegistered());
        ipx2.W(this.mKk);
        ipx2.W(ipx.a(10, 1, new ipf[0]));
        return ipx2;
    }

    private ipx dvx() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(5, 1, new ipf[0]));
        this.mKl = new ist();
        this.mKl.a(mJy, 16);
        this.mKl.Rk(0xABABAB);
        this.mKl.a(mJB);
        this.mKl.setText(lxk.trZ.bD(new Object[0]).exA().toUpperCase());
        ipx2.W(ipx.d(this.mKl));
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 21)));
        this.mKm = new irq(iqo.dmS(), 5, false);
        ipx2.W(ipx.c(0, 8, 0, 9, this.mKm));
        return ipx2;
    }

    private ipx dvy() {
        ipx ipx2 = ipx.l(new ipf[0]);
        this.mKn = new ist();
        this.mKn.a(mJC, 15);
        this.mKn.Rk(12357465);
        this.mKn.a(mJF);
        this.mKn.setText(lxk.tsc.bD(new Object[0]).exA().toUpperCase());
        ipx2.W(this.mKn);
        ipx2.W(ipx.c(new ipf[0]));
        this.mKo = new ist();
        this.mKo.a(mJG, 18);
        this.mKo.Rk(12357465);
        this.mKo.a(mJJ);
        this.mKo.setText(this.mKA.dEY() + "/" + ls.px());
        ipx2.W(this.mKo);
        ipx2.W(ipx.a(2, 1, new ipf[0]));
        return ipx2;
    }

    private ipx dvz() {
        ipx ipx2 = new ipx(iqo.dmT());
        ipx2.W(ipx.a(1, 10, new ipf[0]));
        ipx2.W(this.dvA());
        ipx2.W(ipx.a(1, 3, new ipf[0]));
        ipx2.W(this.dvB());
        ipx2.W(ipx.a(1, 45, new ipf[0]));
        ipx2.W(this.dvC());
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx2.W(new ipk(0x313131, 200, 1));
        ipx2.W(ipx.a(1, 40, new ipf[0]));
        ipx2.W(this.dvF());
        ipx2.W(ipx.a(1, 3, new ipf[0]));
        ipx2.W(this.dvH());
        return ipx2;
    }

    private ipf dvA() {
        this.mKc = new ist();
        this.mKc.a(mIW, 18);
        this.mKc.Rk(12357465);
        this.mKc.a(mIZ);
        this.mKc.g(lxk.trP);
        return this.mKc;
    }

    private ipf dvB() {
        this.mKd = new iso();
        this.mKd.a(mJa, 12);
        this.mKd.Rk(0xABABAB);
        this.mKd.a(mJd);
        this.mKd.g(lxk.trQ);
        this.mKd.setWidth(400);
        return this.mKd;
    }

    private ipx dvC() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(10, 1, new ipf[0]));
        this.mKe = new ist();
        this.mKe.a(mJe, 14);
        this.mKe.Rk(0xABABAB);
        this.mKe.a(mJh);
        this.mKe.o(lxk.trR.bD(new Object[0]));
        ipx2.W(this.mKe);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(new ipk(0x313131, 1, 21));
        ipx2.W(ipx.a(15, 1, new ipf[0]));
        this.mKf = new iok(this, mIS, mIU, mIT, mIV){
            static final /* synthetic */ boolean $assertionsDisabled;
            final /* synthetic */ jaq mKC;
            {
                this.mKC = jaq2;
                super(string, string2, string3, string4);
            }

            public void cLq() {
                if (ioa.cxP().cyZ().abF() >= ls.pz()) {
                    if (!$assertionsDisabled) {
                        throw new AssertionError((Object)"Player can not be an apprentice");
                    }
                    return;
                }
                gkt gkt2 = (gkt)jaq.f(this.mKC).h(31491, jaq.e(this.mKC), hso.cxK().bAn().Tr);
                gkt2.ed = 9;
                gkt2.YN = hso.cxK().bAn().Tr;
                gkt2.YL = "";
                jaq.g(this.mKC).F(gkt2);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxk.tsd.bD(new Object[0]).exA());
            }

            static {
                $assertionsDisabled = !jaq.class.desiredAssertionStatus();
            }
        };
        ipx2.W(ipx.c(0, 3, 0, 3, this.mKf));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        return ipx2;
    }

    private ipx dvD() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.a(1, 20, new ipf[0]));
        this.mKs = new iso();
        this.mKs.a(mJW, 14);
        this.mKs.Rk(0xABABAB);
        this.mKs.a(mJZ);
        this.mKs.setText(lxk.tsm.bD(ls.pz(), ls.py()).exA());
        this.mKs.setWidth(400);
        ipx2.W(this.mKs);
        ipx ipx3 = ipx.c(new ipf[]{ipx.d(new ipb("EmptyIcon"))});
        ipx2.W(ipx3);
        ipx2.W(ipx.a(1, 140, new ipf[0]));
        return ipx.c(new ipf[]{ipx2});
    }

    public void TF(int n) {
        ipx ipx2 = (ipx)this.mKt.RO(1);
        switch (n) {
            case 0: {
                if (this.mKy == 0) {
                    return;
                }
                if (!ipx2.getChildren().isEmpty()) {
                    ipx2.RP(0);
                }
                ipx2.W(this.mKr);
                break;
            }
            case 1: {
                if (this.mKy == 1) {
                    return;
                }
                if (!ipx2.getChildren().isEmpty()) {
                    ipx2.RP(0);
                }
                ipx2.W(this.mKi);
                break;
            }
            case 2: {
                if (this.mKy == 2) {
                    return;
                }
                if (!ipx2.getChildren().isEmpty()) {
                    ipx2.RP(0);
                }
                ipx2.W(this.mKb);
            }
        }
        this.mKy = n;
    }

    public void kO(float f2) {
        if (!this.dOL) {
            return;
        }
        this.updateWindow();
    }

    public void a(float f2, double d2) {
        iug iug2 = null;
        switch (this.mKy) {
            case 2: {
                iug2 = this.mKv;
                break;
            }
            case 1: {
                iug2 = this.mKu;
                break;
            }
            default: {
                return;
            }
        }
        List<iua> list = iug2.sU();
        for (iua iua2 : list) {
            jat jat2 = (jat)iua2;
            jat2.a(f2, d2);
        }
    }

    public void sS(boolean bl) {
        iug iug2 = null;
        switch (this.mKy) {
            case 2: {
                iug2 = this.mKv;
                break;
            }
            case 1: {
                iug2 = this.mKu;
                break;
            }
            default: {
                return;
            }
        }
        List<iua> list = iug2.sU();
        for (iua iua2 : list) {
            jat jat2 = (jat)iua2;
            jat2.sU(bl);
        }
    }

    private ipx dvE() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(5, 1, new ipf[0]));
        this.mKw = new ist();
        this.mKw.a(mJG, 18);
        this.mKw.Rk(12357465);
        this.mKw.a(mJJ);
        this.mKw.g(lxk.trX);
        ipx2.W(this.mKw);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(new ipk(0x313131, 1, 21));
        ipx2.W(ipx.a(12, 1, new ipf[0]));
        this.mKp = new ipb("ProwessIcon");
        ipx2.W(ipx.c(0, 4, 0, 4, this.mKp));
        ipx2.W(ipx.a(12, 1, new ipf[0]));
        ipx2.W(new ipk(0x313131, 1, 21));
        ipx2.W(ipx.a(30, 1, new ipf[0]));
        this.mKq = new ipb("GearIcon");
        ipx2.W(ipx.c(0, 4, 0, 4, this.mKq));
        ipx2.W(ipx.a(30, 1, new ipf[0]));
        return ipx2;
    }

    private ipx dvF() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(5, 1, new ipf[0]));
        this.mKw = new ist();
        this.mKw.a(mJG, 18);
        this.mKw.Rk(12357465);
        this.mKw.a(mJJ);
        this.mKw.g(lxk.trT);
        ipx2.W(this.mKw);
        return ipx2;
    }

    private void TG(int n) {
    }

    private ipx dvG() {
        this.mKu = new a(this, null);
        ((izh)this.mKu).a(iun.mAj);
        return ipx.c(new ipf[]{this.mKu});
    }

    private ipx dvH() {
        this.mKv = new a(this, null);
        ((izh)this.mKv).a(iun.mAj);
        return ipx.c(new ipf[]{this.mKv});
    }

    private void dvI() {
        if (!this.dOL) {
            return;
        }
        iug iug2 = null;
        switch (this.mKy) {
            case 2: {
                iug2 = this.mKv;
                break;
            }
            case 1: {
                iug2 = this.mKu;
                break;
            }
            default: {
                return;
            }
        }
        iug2.removeAllItems();
        if (this.mKA.dEY() == 0) {
            return;
        }
        Collection<jgs.a> collection = this.mKA.dEX();
        for (jgs.a a2 : collection) {
            jat jat2 = new jat(a2.qd(), a2.getName(), a2.pN(), this.mKy == 1, a2.qf(), !this.mKA.isCanceled(), new jap(this, a2){
                final /* synthetic */ jgs.a mKD;
                final /* synthetic */ jaq mKC;
                {
                    this.mKC = jaq2;
                    this.mKD = a2;
                }

                public void a(ldv ldv2, String string, jat.a a2) {
                    switch (a2) {
                        case mLV: {
                            jaq.a(this.mKC, jaq.c(this.mKC).rP(ldv2));
                            if (jaq.h(this.mKC) == null) {
                                return;
                            }
                            jaq.a(this.mKC, jaq.c(this.mKC).bRA() ? 10 : 11);
                            jaq.a(this.mKC, this.mKD.getName(), ioa.cxP().bpb(), ioa.cxP().bpc(), 0, 0);
                            break;
                        }
                        case mLU: {
                            gjt gjt2 = (gjt)jaq.i(this.mKC).h(4617, this.mKC.getGUID(), hso.cxK().bAn().gYY);
                            gjt2.SkillType = cxd.fHh;
                            gjt2.YL = string;
                            jaq.j(this.mKC).F(gjt2);
                            break;
                        }
                        case mLT: {
                            hyn.cyJ().oh(string);
                        }
                    }
                }
            });
            iug2.c(jat2);
        }
        if (!this.mKx) {
            this.mKf.rF(false);
        }
    }

    private void c(String string, int n, int n2, int n3, int n4) {
        hzs hzs2 = jaq.cyJ().cHy();
        hzs2.a(this);
        hzs2.a(this.mKA.tX() ? lxk.tsn.bD(string).exA() : lxk.tso.bD(string).exA(), n, n2, n3, n4);
        hzs2.setVisible(true);
        hzs2.cqF();
    }

    @Override
    public void oH(boolean bl) {
        if (this.mKB == null || this.ed == -1) {
            return;
        }
        if (jaq.cxP() != null) {
            jaq.cxP().czi();
        }
        if (jaq.cyJ() != null) {
            jaq.cyJ().cHy().setVisible(false);
        }
        if (!bl) {
            return;
        }
        gkt gkt2 = (gkt)this.MessageDelegator.h(31491, this.GUID, hso.cxK().bAn().Tr);
        gkt2.YN = this.mKB.qd();
        gkt2.YL = this.mKB.getName();
        gkt2.ed = this.ed;
        this.MessageDelegator.F(gkt2);
        this.ed = -1;
        this.mKB = null;
    }

    @Override
    public void O(float f2, float f3) {
    }

    public void dvJ() {
        if (!this.dOL) {
            return;
        }
        this.updateWindow();
    }

    @Override
    public void cEc() {
        if (!this.dOL) {
            return;
        }
        if (this.isVisible()) {
            this.updateWindow();
        }
    }

    @Override
    public boolean isOpen() {
        return this.isVisible();
    }

    public void updateWindow() {
        boolean bl;
        if (!this.dOL) {
            return;
        }
        boolean bl2 = this.mKA.bRA();
        boolean bl3 = this.mKA.tX();
        boolean bl4 = this.mKA.pT();
        boolean bl5 = this.mKA.isCanceled();
        int n = this.mKA.pU();
        float f2 = this.mKA.tY();
        boolean bl6 = this.mKA.isRegistered();
        boolean bl7 = this.mKA.dEZ();
        float f3 = jaq.cxP().cyZ().abF();
        boolean bl8 = f3 >= (float)ls.py();
        boolean bl9 = bl = f3 < (float)ls.pz();
        if (bl8) {
            this.TF(1);
            if (bl4) {
                this.mKk.rF(false);
                this.mKk.hX(false);
            } else if (bl7) {
                this.mKk.rF(false);
                this.mKk.hX(false);
            } else {
                this.mKk.rF(true);
                this.mKk.hX(bl6);
            }
            boolean bl10 = n >= ls.pB();
            this.mKm.jf(bl10 ? f2 / (float)n : 0.0f);
            this.mKm.sc(bl10);
            this.mKo.setText(this.mKA.dEY() + "/" + ls.px());
            this.dvI();
            return;
        }
        if (bl) {
            this.TF(2);
            this.mKf.rF(!bl2);
            this.dvI();
            return;
        }
        this.TF(0);
    }

    public void cEk() {
        super.cEk();
        if (this.cXM() != null) {
            this.cXM().A(lxk.trO.bD(new Object[0]));
        }
        if (this.mKj != null) {
            this.mKj.setText(lxk.trW.bD(new Object[0]).exA().toUpperCase());
        }
        if (this.mKl != null) {
            this.mKl.setText(lxk.trZ.bD(new Object[0]).exA().toUpperCase());
        }
        if (this.mKn != null) {
            this.mKn.setText(lxk.tsc.bD(new Object[0]).exA().toUpperCase());
        }
        if (this.mKc != null) {
            this.mKc.g(lxk.trP);
        }
        if (this.mKd != null) {
            this.mKd.g(lxk.trQ);
        }
        if (this.mKe != null) {
            this.mKe.o(lxk.trR.bD(new Object[0]));
        }
        if (this.mKw != null) {
            this.mKw.g(lxk.trX);
        }
        if (this.mKw != null) {
            this.mKw.g(lxk.trT);
        }
    }

    @Override
    protected void cGR() {
        this.mKz.s(this);
    }

    @Override
    protected ipq cGj() {
        return null;
    }

    @Override
    protected void ku(float f2) {
        super.ku(f2);
        if (this.lLM != null) {
            this.lLM.hz(f2);
        }
    }

    static /* synthetic */ ldv a(jaq jaq2) {
        return jaq2.GUID;
    }

    static /* synthetic */ dxr b(jaq jaq2) {
        return jaq2.MessageDelegator;
    }

    static /* synthetic */ jgs c(jaq jaq2) {
        return jaq2.mKA;
    }

    static /* synthetic */ dxr d(jaq jaq2) {
        return jaq2.MessageDelegator;
    }

    static /* synthetic */ ldv e(jaq jaq2) {
        return jaq2.GUID;
    }

    static /* synthetic */ dxr f(jaq jaq2) {
        return jaq2.MessageDelegator;
    }

    static /* synthetic */ dxr g(jaq jaq2) {
        return jaq2.MessageDelegator;
    }

    static /* synthetic */ jgs.a a(jaq jaq2, jgs.a a2) {
        jaq2.mKB = a2;
        return jaq2.mKB;
    }

    static /* synthetic */ jgs.a h(jaq jaq2) {
        return jaq2.mKB;
    }

    static /* synthetic */ int a(jaq jaq2, int n) {
        jaq2.ed = n;
        return jaq2.ed;
    }

    static /* synthetic */ void a(jaq jaq2, String string, int n, int n2, int n3, int n4) {
        jaq2.c(string, n, n2, n3, n4);
    }

    static /* synthetic */ dxr i(jaq jaq2) {
        return jaq2.MessageDelegator;
    }

    static /* synthetic */ dxr j(jaq jaq2) {
        return jaq2.MessageDelegator;
    }
}


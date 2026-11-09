/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.Set;

public class jcs
extends ihs {
    private static final int mRP = 400;
    private static final int mRQ = 700;
    private static final int mRR = 933;
    private static final int mRS = 600;
    private static final String mRT = "NarrationAutomatic";
    private static final String mRU = "ReadQuests";
    private boolean lBD = false;
    private jco mRV;
    private jby mRW = new jby();
    private Set<Integer> mRX = lcn.emx();
    private iqa lUU;
    private jcv mRY;
    private ipf mRZ;
    private jdg mSa;

    public jcs() {
        super("QuestsWindow", "QuestsWindow.swf");
        this.OQ(jnz.nGe | jnz.nGi);
        this.U(600.0f, 400.0f);
        this.qY(true);
        this.a(ire.mul);
        this.a(mRT, hsu.ldg, true);
        this.a(mRU, hsu.ldh, "");
        jcc.dwT().mQC.a((jlg<jcm, jcf>)new jls<jcs, jcm, jcf>(this, this){
            final /* synthetic */ jcs mSb;
            {
                this.mSb = jcs2;
                super(jcs3);
            }

            public void b(jcs jcs2, jcm jcm2, jcf jcf2) {
                jcs.a(jcs2, jcm2, jcf2);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.b((jcs)object, (jcm)object2, (jcf)object3);
            }
        });
        jcc.dwT().mQD.a((jlg<jcg, jcg>)new jls<jcs, jcg, jcg>(this, this){
            final /* synthetic */ jcs mSb;
            {
                this.mSb = jcs2;
                super(jcs3);
            }

            public void b(jcs jcs2, jcg jcg2, jcg jcg3) {
                jcs.a(jcs2, jcg2, jcg3);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.b((jcs)object, (jcg)object2, (jcg)object3);
            }
        });
        jcc.dwT().mQs.c((jlf<jch>)new jlr<jcs, jch>(this, this){
            final /* synthetic */ jcs mSb;
            {
                this.mSb = jcs2;
                super(jcs3);
            }

            public void b(jcs jcs2, jch jch2) {
                jcs.a(jcs2, jch2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.b((jcs)object, (jch)object2);
            }
        });
        this.dyd();
    }

    @Override
    public boolean isOpen() {
        return this.lBD;
    }

    public void setOpen(boolean bl) {
        if (bl == this.lBD) {
            return;
        }
        this.lBD = bl;
        this.setVisible(bl);
        if (bl) {
            this.cqF();
            this.cFc();
        }
    }

    public void cyi() {
        String[] stringArray;
        super.cyi();
        boolean bl = false;
        String string = this.nj(mRU);
        for (String string2 : stringArray = string.split(",")) {
            Integer n = Integer.valueOf(string2);
            jch jch2 = (jch)jcc.dwT().TO(n);
            if (jch2 != null && jch2.dxd() != jbz.mQl) {
                this.mRX.add(n);
                jch2.dxv();
                continue;
            }
            bl = true;
        }
        if (bl) {
            this.dye();
        }
    }

    public void d(jch jch2) {
        jcs.cyJ().cHw().a(hyc.lnb, true);
        this.mRY.d(jch2);
        jcc.dwT().c(jch2);
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.QT(36);
        this.Rz(36);
        this.RA(120);
        this.dG(0, 0);
        this.dyb();
        this.cKJ();
        this.cXE().a(irl.dnr());
        this.cXE().W(this.cGT());
        this.cXE().W(this.cGU());
        this.mRV.a(jcc.dwT().a(xa.bal));
    }

    @Override
    protected void cGQ() {
        super.cGQ();
        this.mRW.mQi = this.nk(mRT);
    }

    @Override
    protected void cGo() {
        super.cGo();
        this.dyd();
    }

    @Override
    protected void ku(float f) {
        super.ku(f);
        if (this.lUU != null) {
            this.lUU.hz(f);
        }
        if (this.mRY != null) {
            this.mRY.kh(f);
        }
    }

    @Override
    protected void cGR() {
        jcs.cyJ().cHw().a(hyc.lnb, false);
    }

    private void dyb() {
        this.mRV = new jco(jcc.dwT());
    }

    private void cKJ() {
        this.a(new ipb("/dfdata/texture/gui/j2f/quests/title_icon_quests.png"), 30, 0, 34, lxu.sXP.bD(new Object[0]));
        this.cXM().qp(true);
        this.cXM().a(new iwa(this){
            final /* synthetic */ jcs mSb;
            {
                this.mSb = jcs2;
            }

            public void cLq() {
                jcs.a(this.mSb, this);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxu.tmM.bD(new Object[0]).exA().toUpperCase());
            }
        }, 0);
        ivp ivp2 = new ivp(this){
            final /* synthetic */ jcs mSb;
            {
                this.mSb = jcs2;
            }

            public void pn(boolean bl) {
                jcs.a(this.mSb, bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxu.typ.bD(new Object[0]).exA().toUpperCase());
            }
        };
        ivp2.hX(true);
        this.cXM().a(ivp2, 0);
    }

    private ipf cGT() {
        this.lUU = new iqa("/dfdata/texture/gui/j2f/quests/backgrounds/quests_bg_main.png", 600, 0, 36, 120, iqb.mtp);
        return ipx.a(0, 0, 36, 100, this.lUU);
    }

    private ipf cGU() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(45, 1, new ipf[0]));
        ipx2.W(this.cWn());
        ipx2.W(this.dyc());
        ipx2.W(this.cWt());
        return ipx2;
    }

    private ipf cWn() {
        this.mRY = new jcv(this.mRV);
        return this.mRY;
    }

    private ipf dyc() {
        this.mRZ = ipx.j(ipx.c(new iuq()));
        return this.mRZ;
    }

    private ipf cWt() {
        this.mSa = new jdg();
        return this.mSa;
    }

    private void sY(boolean bl) {
        this.mRY.setVisible(bl);
        this.mRZ.setVisible(bl);
        if (bl) {
            this.lUU.b("/dfdata/texture/gui/j2f/quests/backgrounds/quests_bg_main.png", 600, 0, 36, 120);
            this.aa(933.0f, this.cFx());
            this.Rz(36);
        } else {
            this.lUU.b("/dfdata/texture/gui/j2f/quests/backgrounds/quests_bg_log.png", 48, 0, 36, 120);
            this.aa(600.0f, this.cFx());
            this.Rz(24);
        }
        this.cEq();
    }

    private void a(iwa iwa2) {
        ioc ioc2 = iwa2.eo(0, 0);
        jcr jcr2 = new jcr(this, this, new joa(ioc2.cf, ioc2.cg, iwa2.getWidth(), iwa2.getHeight()), this.mRW.dwR()){
            final /* synthetic */ jcs mSb;
            {
                this.mSb = jcs2;
                super(ioa2, joa2, jby2);
            }

            public void b(jby jby2) {
                jcs.a(this.mSb).a(jby2);
                this.q("NarrationAutomatic", jcs.a((jcs)this.mSb).mQi);
            }
        };
        jcr2.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a((amf)((Object)jcr2));
    }

    private void a(jcm jcm2, jcf jcf2) {
        if (this.mRW.mQi && jcf2 != null) {
            jcc.dwT().a(jcm2.qS(), jcf2);
        }
    }

    private void dyd() {
        joa joa2 = jcs.cFj().cxY();
        this.g(joa2.W / 2.0f - 466.0f, joa2.H / 2.0f - 350.0f, 933.0f, 700.0f);
        this.ql(true);
    }

    private void a(jcg jcg2, jcg jcg3) {
        if (jcg3 instanceof jch) {
            jch jch2 = (jch)jcg3;
            this.e(jch2);
        }
    }

    private void e(jch jch2) {
        this.mRX.add(jch2.wF().getID());
        this.dye();
    }

    private void dye() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer n : this.mRX) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(n);
        }
        String string = stringBuilder.toString();
        this.B(mRU, string);
    }

    private void f(jch jch2) {
        if (jch2.dxd() == jbz.mQl && this.mRX.remove(jch2.wF().getID())) {
            this.dye();
        }
    }

    static /* synthetic */ void a(jcs jcs2, jcm jcm2, jcf jcf2) {
        jcs2.a(jcm2, jcf2);
    }

    static /* synthetic */ void a(jcs jcs2, jcg jcg2, jcg jcg3) {
        jcs2.a(jcg2, jcg3);
    }

    static /* synthetic */ void a(jcs jcs2, jch jch2) {
        jcs2.f(jch2);
    }

    static /* synthetic */ void a(jcs jcs2, iwa iwa2) {
        jcs2.a(iwa2);
    }

    static /* synthetic */ void a(jcs jcs2, boolean bl) {
        jcs2.sY(bl);
    }

    static /* synthetic */ jby a(jcs jcs2) {
        return jcs2.mRW;
    }
}


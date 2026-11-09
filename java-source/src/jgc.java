/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jgc
extends jfl {
    private jga mYH;
    private ist mYI;
    private ist mYJ;
    private ist mYK;
    private ipb mYL;
    private ist mYM;
    private ipb mYN;
    private ist mYO;
    private ipb mYP;
    private ist mYQ;
    private ipb mYR;
    private ist mYS;
    private ist mYT;
    private ist mYU;
    private ist mYV;
    private ist mYW;
    private ist mYX;
    private ist mYY;
    private ist mYZ;
    private ipx[] mZa = new ipx[lea.epx().aQI()];
    private ipb[] mZb = new ipb[lea.epx().aQI()];
    private ipb[] mZc = new ipb[lea.epx().aQI()];
    private ipb[] mZd = new ipb[lea.epx().aQI()];
    private ipx mZe;
    private ist mZf;
    private jge mZg;

    public jgc() {
        ipx ipx2 = ipx.j(new ipf[0]);
        this.W(ipx2);
        ipx ipx3 = ipx.k(new ipf[0]);
        ipx2.W(ipx3);
        ipx3.W(ipx.l(new ipb("role_overview_gold_lines"), ipx.c(new ipf[0])));
        ipx3.W(this.dCt());
        ipx2.W(this.dCy());
        ipx2.W(ipx.l(new ipb("role_overview_gold_lines"), ipx.c(new ipf[0])));
        ipx2.W(ipx.a(1, 12, new ipf[0]));
        ipx2.W(this.dDw());
        jen.dzL().mUP.c((jlf<jeo>)new jlr<jgc, jeo>(this, this){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(jgc3);
            }

            public void b(jgc jgc2, jeo jeo2) {
                jgc.a(jgc2, jeo2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.b((jgc)object, (jeo)object2);
            }
        });
        jen.dzL().mUQ.a((jlg<jep, jeq>)new jls<jgc, jep, jeq>(this, this){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(jgc3);
            }

            public void b(jgc jgc2, jep jep2, jeq jeq2) {
                jgc.a(jgc2, jep2, jeq2);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.b((jgc)object, (jep)((Object)object2), (jeq)((Object)object3));
            }
        });
        jen.dzL().mUR.a((jlg<Integer, Float>)new jls<jgc, Integer, Float>(this, this){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(jgc3);
            }

            public void a(jgc jgc2, Integer n, Float f) {
                jgc.a(jgc2, (int)n, f);
            }
        });
        jen.dzL().mUU.a((jlh<jfd, jfc, jfc>)new jlt<jgc, jfd, jfc, jfc>(this, this){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(jgc3);
            }

            public void b(jgc jgc2, jfd jfd2, jfc jfc2, jfc jfc3) {
                jgc.a(jgc2, jfd2, jfc2, jfc3);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3, Object object4) {
                this.b((jgc)object, (jfd)object2, (jfc)object3, (jfc)object4);
            }
        });
        jen.dzL().mVj.a((jlg<jew, Integer>)new jls<jgc, jew, Integer>(this, this){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(jgc3);
            }

            public void a(jgc jgc2, jew jew2, Integer n) {
                jgc2.a(jew2, (int)n);
            }
        });
        jen.dzL().mVh.a((jlg<jew, Integer>)new jls<jgc, jew, Integer>(this, this){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(jgc3);
            }

            public void a(jgc jgc2, jew jew2, Integer n) {
                jgc.a(jgc2, jew2);
            }
        });
        this.dDA();
        for (jep jep2 : jep.values()) {
            this.r(jep2);
        }
        this.dDB();
        this.dDC();
        this.dDD();
        this.dDE();
        this.dDI();
        for (int i = 0; i < lea.epx().aQI(); ++i) {
            jfd jfd2 = jen.dzL().dzM().dzE().Ur(i);
            this.a(jfd2, jfd2.dAu(), null);
        }
        if (jen.dzL().dzN().dAk() != null) {
            this.a(jen.dzL().dzN().dAk(), jen.dzL().dzN().dAk().dzZ());
        }
        this.aTg();
    }

    @Override
    public boolean getResizable() {
        return false;
    }

    @Override
    public loz aNA() {
        return lxx.tzx.bD(new Object[0]);
    }

    @Override
    public jmq dBo() {
        return jmq.nzW;
    }

    @Override
    public String dBp() {
        return "role_window_overview_bg";
    }

    public void a(jge.a a2, double d2) {
        this.mZg.b(a2, d2);
    }

    public jge.a dAW() {
        return this.mZg != null ? this.mZg.dDR() : null;
    }

    public void aTg() {
        this.mYH.dBZ();
    }

    public void dBk() {
    }

    public void dBl() {
    }

    public void dBm() {
    }

    public void dBn() {
    }

    public void tm(boolean bl) {
    }

    @Override
    public void qQ(boolean bl) {
        super.qQ(bl);
        this.dDN();
    }

    @Override
    public void cEc() {
        super.cEc();
        this.dDN();
    }

    private ipf dCt() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(536, 50, this.dCu()));
        ipx2.W(ipx.a(6, 1, new ipf[0]));
        ipx2.W(ipx.j(ipx.a(1, 16, new ipf[0]), this.dCv()));
        ipx2.W(ipx.a(3, 50, new ipf[0]));
        return ipx2;
    }

    private ipf dCu() {
        this.mYH = new jga();
        return this.mYH;
    }

    private ipf dCv() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.d(this.dCw()));
        ipx2.W(ipx.a(6, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 20)));
        ipx2.W(ipx.a(6, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dCx()));
        ipx2.W(ipx.a(6, 1, new ipf[0]));
        return ipx2;
    }

    private ipf dCw() {
        return new ivx(this){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
            }

            public void cLq() {
                this.mZh.dBk();
            }
        };
    }

    private ipf dCx() {
        return new iwf(this){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
            }

            public void cLq() {
                this.djE();
                ioa.cxP().czx().czL();
                this.djE();
                ioa.cyJ().cIN().a(jen.dzL().dzN().dAk());
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxx.tAA.bD(new Object[0]).exA());
            }
        };
    }

    private ipf dCy() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(this.dCz());
        ipx2.W(ipx.d(new ipk(0x313131, 1, 350)));
        ipx2.W(this.dDj());
        return ipx2;
    }

    private ipf dCz() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(this.dCA());
        ipx2.W(ipx.a(1, 13, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 303, 1)));
        ipx2.W(this.dCG());
        ipx2.W(ipx.d(new ipk(0x313131, 303, 1)));
        ipx2.W(this.dCW());
        return ipx2;
    }

    private ipf dCA() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.a(1, 15, new ipf[0]));
        ipx2.W(ipx.l(ipx.a(15, 1, new ipf[0]), ipx.d(this.dCB()), ipx.c(new ipf[0])));
        ipx2.W(this.dCC());
        return ipx2;
    }

    private ipf dCB() {
        ist ist2 = ist.a(isf.mwO, 18, 12357465, lxx.tzB.bD(new Object[0]));
        ipb ipb2 = new ipb("icon_section_change_indicator");
        ipb2.setVisible(jen.dzL().dzM().dzC().dzG());
        ist2.Rk(jen.dzL().dzM().dzC().dzG() ? 15769621 : 12357465);
        jen.dzL().mUZ.b(new jlq<jgc>(this, this, ipb2, ist2){
            final /* synthetic */ ipb mZi;
            final /* synthetic */ ist mZj;
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                this.mZi = ipb2;
                this.mZj = ist2;
                super(jgc3);
            }

            public void g(jgc jgc2) {
                this.mZi.setVisible(jen.dzL().dzM().dzC().dzG());
                this.mZj.Rk(jen.dzL().dzM().dzC().dzG() ? 15769621 : 12357465);
            }

            public /* synthetic */ void R(Object object) {
                this.g((jgc)object);
            }
        });
        return ipx.l(ipx.d(ist2), ipx.a(4, 1, new ipf[0]), ipx.d(ipx.h(ipx.a(16, 16, new ipf[0]), ipb2)));
    }

    private ipf dCC() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(37, 1, new ipf[0]));
        ipx2.W(ipx.a(40, 20, ipx.d(this.dCD())));
        ipx2.W(ipx.a(1, 47, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(28, 28, new iwv(this, "vital_stat_health"){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(string);
            }

            public hyn dd(int n, int n2) {
                return jgc.a(this.mZh);
            }
        })));
        ipx2.W(ipx.a(13, 47, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 23)));
        ipx2.W(ipx.a(4, 47, new ipf[0]));
        ipx2.W(ipx.a(40, 20, ipx.d(this.dCE())));
        ipx2.W(ipx.a(1, 47, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(28, 28, new iwv(this, "vital_stat_mana"){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(string);
            }

            public hyn dd(int n, int n2) {
                return jgc.b(this.mZh);
            }
        })));
        ipx2.W(ipx.a(13, 47, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 23)));
        ipx2.W(ipx.a(5, 47, new ipf[0]));
        ipx2.W(ipx.a(40, 20, ipx.d(this.dCF())));
        ipx2.W(ipx.a(2, 47, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(28, 28, new iwv(this, "vital_stat_stamina"){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(string);
            }

            public hyn dd(int n, int n2) {
                return jgc.c(this.mZh);
            }
        })));
        ipx2.W(ipx.a(35, 1, new ipf[0]));
        return ipx2;
    }

    private ipf dCD() {
        this.mYI = new ist(this, isf.mwO, 16, 12357465){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(isf2, n, n2);
            }

            public hyn dd(int n, int n2) {
                return jgc.a(this.mZh);
            }
        };
        return this.mYI;
    }

    private ipf dCE() {
        this.mYJ = new ist(this, isf.mwO, 16, 12357465){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(isf2, n, n2);
            }

            public hyn dd(int n, int n2) {
                return jgc.b(this.mZh);
            }
        };
        return this.mYJ;
    }

    private ipf dCF() {
        this.mYK = new ist(this, isf.mwO, 16, 12357465){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(isf2, n, n2);
            }

            public hyn dd(int n, int n2) {
                return jgc.c(this.mZh);
            }
        };
        return this.mYK;
    }

    private ipf dCG() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.a(1, 14, new ipf[0]));
        ipx2.W(ipx.l(ipx.a(15, 1, new ipf[0]), ipx.d(this.dCH()), ipx.c(new ipf[0]), ipx.d(this.dCI()), ipx.a(7, 1, new ipf[0])));
        ipx2.W(ipx.a(1, 13, new ipf[0]));
        ipx2.W(this.dCJ());
        ipx2.W(ipx.a(1, 12, new ipf[0]));
        return ipx2;
    }

    private ipf dCH() {
        ist ist2 = ist.a(isf.mwO, 18, 12357465, lxx.tzC.bD(new Object[0]));
        ipb ipb2 = new ipb("icon_section_change_indicator");
        ipb2.rg(false);
        ipb2.setVisible(jen.dzL().dzM().dzC().dzG());
        ist2.Rk(jen.dzL().dzM().dzC().dzG() ? 15769621 : 12357465);
        jen.dzL().mUZ.b(new jlq<jgc>(this, this, ipb2, ist2){
            final /* synthetic */ ipb mZi;
            final /* synthetic */ ist mZj;
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                this.mZi = ipb2;
                this.mZj = ist2;
                super(jgc3);
            }

            public void g(jgc jgc2) {
                this.mZi.setVisible(jen.dzL().dzM().dzC().dzG());
                this.mZj.Rk(jen.dzL().dzM().dzC().dzG() ? 15769621 : 12357465);
            }

            public /* synthetic */ void R(Object object) {
                this.g((jgc)object);
            }
        });
        return ipx.l(ipx.d(ist2), ipx.a(4, 1, new ipf[0]), ipx.d(ipx.h(ipx.a(16, 16, new ipf[0]), ipb2)));
    }

    private ipf dCI() {
        return new ivi(this){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
            }

            public void cLq() {
                this.mZh.dBl();
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxx.tzP.bD(new Object[0]).exA());
            }
        };
    }

    private ipf dCJ() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(36, 1, new ipf[0]));
        ipx2.W(this.dCK());
        ipx2.W(ipx.a(26, 1, new ipf[0]));
        ipx2.W(this.dCN());
        ipx2.W(ipx.a(26, 1, new ipf[0]));
        ipx2.W(this.dCQ());
        ipx2.W(ipx.a(26, 1, new ipf[0]));
        ipx2.W(this.dCT());
        ipx2.W(ipx.a(35, 1, new ipf[0]));
        return ipx2;
    }

    private ipf dCK() {
        ipx ipx2 = new ipx(this, iqo.dmT()){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(iqz2);
            }

            public hyn dd(int n, int n2) {
                return jgc.a(this.mZh, jep.mVz);
            }
        };
        ipx2.W(ipx.d(ipx.a(42, 42, this.dCL())));
        ipx2.W(ipx.d(this.dCM()));
        return ipx2;
    }

    private ipf dCL() {
        this.mYL = new ipb("icon_booster_strength_inactive");
        return this.mYL;
    }

    private ipf dCM() {
        this.mYM = ist.c(isf.mwO, 16, 0x4A4A4A, "-");
        return this.mYM;
    }

    private ipf dCN() {
        ipx ipx2 = new ipx(this, iqo.dmT()){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(iqz2);
            }

            public hyn dd(int n, int n2) {
                return jgc.a(this.mZh, jep.mVA);
            }
        };
        ipx2.W(ipx.d(ipx.a(42, 42, this.dCO())));
        ipx2.W(ipx.d(this.dCP()));
        return ipx2;
    }

    private ipf dCO() {
        this.mYN = new ipb("icon_booster_dexterity_inactive");
        return this.mYN;
    }

    private ipf dCP() {
        this.mYO = ist.c(isf.mwO, 16, 0x4A4A4A, "II");
        return this.mYO;
    }

    private ipf dCQ() {
        ipx ipx2 = new ipx(this, iqo.dmT()){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(iqz2);
            }

            public hyn dd(int n, int n2) {
                return jgc.a(this.mZh, jep.mVB);
            }
        };
        ipx2.W(ipx.d(ipx.a(42, 42, this.dCR())));
        ipx2.W(ipx.d(this.dCS()));
        return ipx2;
    }

    private ipf dCR() {
        this.mYP = new ipb("icon_booster_intelligence_inactive");
        return this.mYP;
    }

    private ipf dCS() {
        this.mYQ = ist.c(isf.mwO, 16, 0x4A4A4A, "-");
        return this.mYQ;
    }

    private ipf dCT() {
        ipx ipx2 = new ipx(this, iqo.dmT()){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(iqz2);
            }

            public hyn dd(int n, int n2) {
                return jgc.a(this.mZh, jep.mVC);
            }
        };
        ipx2.W(ipx.d(ipx.a(42, 42, this.dCU())));
        ipx2.W(ipx.d(this.dCV()));
        return ipx2;
    }

    private ipf dCU() {
        this.mYR = new ipb("icon_booster_wisdom_inactive");
        return this.mYR;
    }

    private ipf dCV() {
        this.mYS = ist.c(isf.mwO, 16, 0x4A4A4A, "-");
        return this.mYS;
    }

    private ipf dCW() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.a(1, 14, new ipf[0]));
        ipx2.W(ipx.l(ipx.a(15, 1, new ipf[0]), ipx.d(this.dCX()), ipx.a(167, 1, new ipf[0])));
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx2.W(this.dCY());
        ipx2.W(ipx.a(1, 14, new ipf[0]));
        return ipx2;
    }

    private ipf dCX() {
        ist ist2 = ist.a(isf.mwO, 18, 12357465, lxx.tzD.bD(new Object[0]));
        ipb ipb2 = new ipb("icon_section_change_indicator");
        ipb2.rg(false);
        ipb2.setVisible(jen.dzL().dzM().dzD().dzG());
        ist2.Rk(jen.dzL().dzM().dzD().dzG() ? 15769621 : 12357465);
        jen.dzL().mVa.b(new jlq<jgc>(this, this, ipb2, ist2){
            final /* synthetic */ ipb mZi;
            final /* synthetic */ ist mZj;
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                this.mZi = ipb2;
                this.mZj = ist2;
                super(jgc3);
            }

            public void g(jgc jgc2) {
                this.mZi.setVisible(jen.dzL().dzM().dzD().dzG());
                this.mZj.Rk(jen.dzL().dzM().dzD().dzG() ? 15769621 : 12357465);
            }

            public /* synthetic */ void R(Object object) {
                this.g((jgc)object);
            }
        });
        return ipx.l(ipx.d(ist2), ipx.a(4, 1, new ipf[0]), ipx.d(ipx.h(ipx.a(16, 16, new ipf[0]), ipb2)));
    }

    private ipf dCY() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(this.dCZ());
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx2.W(this.dDa());
        return ipx2;
    }

    private ipf dCZ() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(20, 1, new ipf[0]));
        ipx2.W(ipx.a(120, 20, ipx.l(ipx.c(new ipf[0]), ipx.d(this.dDb()))));
        ipx2.W(ipx.a(40, 20, ipx.d(this.dDc())));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 23)));
        ipx2.W(ipx.a(40, 20, ipx.d(this.dDe())));
        ipx2.W(ipx.a(120, 20, ipx.l(ipx.d(this.dDd()), ipx.c(new ipf[0]))));
        return ipx2;
    }

    private ipf dDa() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(20, 1, new ipf[0]));
        ipx2.W(ipx.a(120, 20, ipx.l(ipx.c(new ipf[0]), ipx.d(this.dDf()))));
        ipx2.W(ipx.a(40, 20, ipx.d(this.dDg())));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 23)));
        ipx2.W(ipx.a(40, 20, ipx.d(this.dDi())));
        ipx2.W(ipx.a(120, 20, ipx.l(ipx.d(this.dDh()), ipx.c(new ipf[0]))));
        return ipx2;
    }

    private ipf dDb() {
        return new ist(this, isf.mwO, 16, 0xABABAB, lvm.sWX.bD(208)){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(isf2, n, n2, loz2);
            }

            public hyn dd(int n, int n2) {
                return jek.h(352, jep.mVz);
            }
        };
    }

    private ipf dDc() {
        this.mYT = new ist(this, isf.mwO, 16, 12357465){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(isf2, n, n2);
            }

            public hyn dd(int n, int n2) {
                return jek.d(jep.mVz);
            }
        };
        return this.mYT;
    }

    private ipf dDd() {
        return new ist(this, isf.mwO, 16, 0xABABAB, lvm.sWX.bD(160)){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(isf2, n, n2, loz2);
            }

            public hyn dd(int n, int n2) {
                return jek.h(400, jep.mVA);
            }
        };
    }

    private ipf dDe() {
        this.mYU = new ist(this, isf.mwO, 16, 12357465){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(isf2, n, n2);
            }

            public hyn dd(int n, int n2) {
                return jek.d(jep.mVA);
            }
        };
        return this.mYU;
    }

    private ipf dDf() {
        return new ist(this, isf.mwO, 16, 0xABABAB, lvm.sWX.bD(176)){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(isf2, n, n2, loz2);
            }

            public hyn dd(int n, int n2) {
                return jek.h(9056, jep.mVB);
            }
        };
    }

    private ipf dDg() {
        this.mYV = new ist(this, isf.mwO, 16, 12357465){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(isf2, n, n2);
            }

            public hyn dd(int n, int n2) {
                return jek.d(jep.mVB);
            }
        };
        return this.mYV;
    }

    private ipf dDh() {
        return new ist(this, isf.mwO, 16, 0xABABAB, lvm.sWX.bD(240)){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(isf2, n, n2, loz2);
            }

            public hyn dd(int n, int n2) {
                return jek.h(384, jep.mVC);
            }
        };
    }

    private ipf dDi() {
        this.mYW = new ist(this, isf.mwO, 16, 12357465){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(isf2, n, n2);
            }

            public hyn dd(int n, int n2) {
                return jek.d(jep.mVC);
            }
        };
        return this.mYW;
    }

    private ipf dDj() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(this.dDk());
        return ipx2;
    }

    private ipf dDk() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.a(1, 14, new ipf[0]));
        ipx2.W(ipx.l(ipx.a(14, 1, new ipf[0]), ipx.d(this.dDl()), ipx.a(170, 1, new ipf[0]), ipx.d(this.dDm()), ipx.a(7, 1, new ipf[0])));
        ipx2.W(ipx.a(1, 10, new ipf[0]));
        ipx2.W(this.dDn());
        ipx2.W(ipx.a(1, 20, new ipf[0]));
        ipx2.W(ipx.l(this.dDu(), ipx.j(new ipk(0x313131, 1, 250), ipx.c(new ipf[0])), this.dDv()));
        return ipx2;
    }

    private ipf dDl() {
        ist ist2 = ist.a(isf.mwO, 18, 12357465, lxx.tzE.bD(new Object[0]));
        ipb ipb2 = new ipb("icon_section_change_indicator");
        ipb2.rg(false);
        ipb2.setVisible(jen.dzL().dzM().dzE().dzG());
        ist2.Rk(jen.dzL().dzM().dzE().dzG() ? 15769621 : 12357465);
        jen.dzL().mVb.b(new jlq<jgc>(this, this, ipb2, ist2){
            final /* synthetic */ ipb mZi;
            final /* synthetic */ ist mZj;
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                this.mZi = ipb2;
                this.mZj = ist2;
                super(jgc3);
            }

            public void g(jgc jgc2) {
                this.mZi.setVisible(jen.dzL().dzM().dzE().dzG());
                this.mZj.Rk(jen.dzL().dzM().dzE().dzG() ? 15769621 : 12357465);
            }

            public /* synthetic */ void R(Object object) {
                this.g((jgc)object);
            }
        });
        return ipx.l(ipx.d(ist2), ipx.a(4, 1, new ipf[0]), ipx.d(ipx.h(ipx.a(16, 16, new ipf[0]), ipb2)));
    }

    private ipf dDm() {
        return new ivi(this){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
            }

            public void cLq() {
                this.mZh.dBn();
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxx.tzR.bD(new Object[0]).exA());
            }
        };
    }

    private ipf dDn() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(54, 1, new ipf[0]));
        ipx2.W(this.dDo());
        ipx2.W(ipx.a(13, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 23)));
        ipx2.W(ipx.a(16, 1, new ipf[0]));
        ipx2.W(this.dDp());
        ipx2.W(ipx.a(20, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 23)));
        ipx2.W(ipx.a(21, 1, new ipf[0]));
        ipx2.W(this.dDq());
        return ipx2;
    }

    private ipf dDo() {
        ipx ipx2 = new ipx(this, iqo.dmS()){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(iqz2);
            }

            public boolean dK(int n, int n2) {
                jgc.d(this.mZh);
                return super.dK(n, n2);
            }

            public boolean dL(int n, int n2) {
                jgc.e(this.mZh);
                return super.dL(n, n2);
            }

            public hyn dd(int n, int n2) {
                return jek.dzr();
            }
        };
        ipx2.W(ipx.a(20, 20, ipx.d(this.dDr())));
        ipx2.W(ipx.a(1, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(28, 28, new ipb("icon_skill_school"))));
        return ipx2;
    }

    private ipf dDp() {
        ipx ipx2 = new ipx(this, iqo.dmS()){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(iqz2);
            }

            public boolean dK(int n, int n2) {
                jgc.f(this.mZh);
                return super.dK(n, n2);
            }

            public boolean dL(int n, int n2) {
                jgc.e(this.mZh);
                return super.dL(n, n2);
            }

            public hyn dd(int n, int n2) {
                return jek.dzs();
            }
        };
        ipx2.W(ipx.a(20, 20, ipx.d(this.dDs())));
        ipx2.W(ipx.a(2, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(28, 28, new ipb("icon_skill_ultimate"))));
        return ipx2;
    }

    private ipf dDq() {
        ipx ipx2 = new ipx(this, iqo.dmS()){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                super(iqz2);
            }

            public hyn dd(int n, int n2) {
                return jek.dzt();
            }
        };
        ipx2.W(ipx.a(20, 20, ipx.d(this.dDt())));
        ipx2.W(ipx.a(7, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(28, 28, new ipb("icon_skill_total"))));
        return ipx2;
    }

    private ipf dDr() {
        this.mYX = new ist(isf.mwO, 16, 12357465);
        return this.mYX;
    }

    private ipf dDs() {
        this.mYY = new ist(isf.mwO, 16, 12357465);
        return this.mYY;
    }

    private ipf dDt() {
        this.mYZ = new ist(isf.mwO, 16, 12357465);
        return this.mYZ;
    }

    private ipf dDu() {
        ipx ipx2 = ipx.j(new ipf[0]);
        int n = 0;
        int n2 = jej.mUd / 2;
        int n3 = 0;
        while (n < jej.mUd) {
            ipx2.W(ipx.l(ipx.a(37, 1, new ipf[0]), this.Uy(n), ipx.a(15, 1, new ipf[0]), this.Uy(n + 1), ipx.a(18, 1, new ipf[0])));
            if (n3 < n2) {
                ipx2.W(ipx.a(1, 8, new ipf[0]));
            }
            n += 2;
            ++n3;
        }
        return ipx2;
    }

    private ipf dDv() {
        ipx ipx2 = ipx.j(new ipf[0]);
        int n = lea.epx().aQI() / 2;
        int n2 = jej.mUd / 2;
        int n3 = 0;
        while (n < jej.mUd * 2) {
            ipx2.W(ipx.l(ipx.a(18, 1, new ipf[0]), this.Uy(n), ipx.a(15, 1, new ipf[0]), this.Uy(n + 1), ipx.a(37, 1, new ipf[0])));
            if (n3 < n2) {
                ipx2.W(ipx.a(1, 8, new ipf[0]));
            }
            n += 2;
            ++n3;
        }
        return ipx2;
    }

    private ipf Uy(int n) {
        ipy ipy2 = new ipy(this, iqp.dmW(), n){
            final /* synthetic */ int mZk;
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
                this.mZk = n;
                super(iqz2);
            }

            public hyn dd(int n, int n2) {
                return jek.TU(this.mZk);
            }
        };
        this.mZa[n] = ipy2;
        this.mZb[n] = new ipb();
        ipy2.W(ipx.a(42, 42, this.mZb[n]));
        this.mZd[n] = new ipb("skill_slot_inner_shadow_02");
        ipy2.W(this.mZd[n]);
        this.mZc[n] = new ipb("skill_slot_outline_02");
        ipy2.W(ipx.a(44, 44, this.mZc[n]));
        return ipy2;
    }

    private ipf dDw() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(this.dDx());
        ipx2.W(this.dDz());
        return ipx2;
    }

    private ipf dDx() {
        this.mZe = ipx.l(new ipf[0]);
        this.mZe.rg(false);
        this.mZe.setVisible(false);
        this.mZe.W(ipx.a(200, 50, ipx.d(this.dDy())));
        this.mZe.W(ipx.d(new ipk(0x313131, 1, 22)));
        this.mZe.W(ipx.a(25, 1, new ipf[0]));
        return this.mZe;
    }

    private ipf dDy() {
        this.mZf = ist.a(isf.mwO, 18, 12357465);
        return this.mZf;
    }

    private ipf dDz() {
        this.mZg = new jge(this){
            final /* synthetic */ jgc mZh;
            {
                this.mZh = jgc2;
            }

            public void dDQ() {
                this.djE();
                ioa.cyJ().cIN().dzu();
            }

            public void dzw() {
                this.djE();
                ioa.cyJ().cIN().dzw();
            }

            public void dyq() {
                this.mZh.tm(this.dDR() != jge.a.mZx);
            }
        };
        return this.mZg;
    }

    private void d(jeo jeo2) {
        this.r(jeo2.dzO());
        this.dDA();
    }

    private void e(jep jep2, jeq jeq2) {
        switch (jep2) {
            case mVz: {
                this.dDB();
                break;
            }
            case mVA: {
                this.dDC();
                break;
            }
            case mVB: {
                this.dDD();
                break;
            }
            case mVC: {
                this.dDE();
            }
        }
        this.dDA();
    }

    private void a(int n, Float f) {
        switch (n) {
            case 208: {
                this.dDB();
                break;
            }
            case 160: {
                this.dDC();
                break;
            }
            case 176: {
                this.dDD();
                break;
            }
            case 240: {
                this.dDE();
            }
        }
        this.dDA();
    }

    private void a(jfd jfd2, jfc jfc2, jfc jfc3) {
        this.mZb[jfd2.dAr()].qP(jek.a(jfc2));
        this.mZc[jfd2.dAr()].qP(jfc2 != null ? "skill_slot_outline_01" : "skill_slot_outline_02");
        this.dDI();
    }

    protected void a(jew jew2, int n) {
        if (jew2 != null) {
            this.mZe.setVisible(true);
            this.mZf.setText(jew2.getName());
        } else {
            this.mZe.setVisible(false);
        }
        this.dDA();
    }

    private void i(jew jew2) {
        if (jew2 == jen.dzL().dzN().dAk()) {
            this.mZf.setText(jew2.getName());
        }
    }

    private void dDA() {
        jek.a(352, jep.mVz, this.mYI);
        jek.a(400, jep.mVA, this.mYK);
        jek.a(384, jep.mVC, this.mYJ);
    }

    private void r(jep jep2) {
        switch (jep2) {
            case mVz: {
                jeo jeo2 = jen.dzL().dzM().dzC().f(jep.mVz);
                if (jeo2 != null) {
                    this.mYL.qP("icon_booster_strength_active");
                    this.mYM.o(jeo2.dzP().aNA());
                    this.mYM.Rk(12357465);
                } else {
                    this.mYL.qP("icon_booster_strength_inactive");
                    this.mYM.setText("-");
                    this.mYM.Rk(0x4A4A4A);
                }
                this.dDB();
                break;
            }
            case mVA: {
                jeo jeo3 = jen.dzL().dzM().dzC().f(jep.mVA);
                if (jeo3 != null) {
                    this.mYN.qP("icon_booster_dexterity_active");
                    this.mYO.o(jeo3.dzP().aNA());
                    this.mYO.Rk(12357465);
                } else {
                    this.mYN.qP("icon_booster_dexterity_inactive");
                    this.mYO.setText("-");
                    this.mYO.Rk(0x4A4A4A);
                }
                this.dDC();
                break;
            }
            case mVB: {
                jeo jeo4 = jen.dzL().dzM().dzC().f(jep.mVB);
                if (jeo4 != null) {
                    this.mYP.qP("icon_booster_intelligence_active");
                    this.mYQ.o(jeo4.dzP().aNA());
                    this.mYQ.Rk(12357465);
                } else {
                    this.mYP.qP("icon_booster_intelligence_inactive");
                    this.mYQ.setText("-");
                    this.mYQ.Rk(0x4A4A4A);
                }
                this.dDD();
                break;
            }
            case mVC: {
                jeo jeo5 = jen.dzL().dzM().dzC().f(jep.mVC);
                if (jeo5 != null) {
                    this.mYR.qP("icon_booster_wisdom_active");
                    this.mYS.o(jeo5.dzP().aNA());
                    this.mYS.Rk(12357465);
                } else {
                    this.mYR.qP("icon_booster_wisdom_inactive");
                    this.mYS.setText("-");
                    this.mYS.Rk(0x4A4A4A);
                }
                this.dDE();
            }
        }
    }

    private void dDB() {
        jek.a(jep.mVz, this.mYT);
    }

    private void dDC() {
        jek.a(jep.mVA, this.mYU);
    }

    private void dDD() {
        jek.a(jep.mVB, this.mYV);
    }

    private void dDE() {
        jek.a(jep.mVC, this.mYW);
    }

    private void dDF() {
        int n = jen.dzL().dzM().dzE().dAO();
        this.mYX.setText("" + n);
        this.mYX.Rk(n <= lea.epx().aQK() ? (n < lea.epx().aQK() ? 0xABABAB : 12357465) : 0xAC3333);
    }

    private void dDG() {
        int n = jen.dzL().dzM().dzE().dAN();
        this.mYY.setText("" + n);
        this.mYY.Rk(n <= lea.epx().aQJ() ? (n < lea.epx().aQJ() ? 0xABABAB : 12357465) : 0xAC3333);
    }

    private void dDH() {
        int n = jen.dzL().dzM().dzE().dAM();
        this.mYZ.setText("" + n);
        this.mYZ.Rk(n < lea.epx().aQI() ? 0xABABAB : 12357465);
    }

    private void dDI() {
        this.dDF();
        this.dDG();
        this.dDH();
    }

    private boolean dDJ() {
        switch (this.mZg.dDR()) {
            case mZx: 
            case mZy: 
            case mZz: {
                return false;
            }
        }
        return true;
    }

    private hyn i(int n, jep jep2) {
        String string = isg.F(14, lvm.sWX.bD(n).exA());
        String string2 = isg.a(ish.mwR, isg.F(12, lxx.tzW.bD(new Object[0]).exA().toUpperCase()));
        String string3 = isg.a(ish.mwS, isg.F(12, Math.round(jek.a(n, jep2)) + ""));
        String string4 = isg.a(ish.mwR, isg.F(12, lvm.sWX.bD(jep2.BV()).exA().toUpperCase()));
        String string5 = isg.a(ish.mwS, isg.F(12, "+" + Math.round(jek.b(n, jep2))));
        String string6 = isg.a(ish.mwR, isg.F(12, lxx.tzV.bD(new Object[0]).exA().toUpperCase()));
        String string7 = isg.a(ish.mwS, isg.F(12, "+" + Math.round(jek.c(n, jep2))));
        return iae.b(iae.a(string, null, 3, 2, 0, 0, string2, string3, string4, string5, string6, string7));
    }

    private hyn dDK() {
        return this.i(352, jep.mVz);
    }

    private hyn dDL() {
        return this.i(400, jep.mVA);
    }

    private hyn dDM() {
        return this.i(384, jep.mVC);
    }

    private hyn s(jep jep2) {
        jeo jeo2 = jen.dzL().dzM().dzC().f(jep2);
        return jeo2 != null ? iae.oJ(lxx.tzX.bD(jeo2.dzP().aNA().exA(), jeo2.getDisplayName()).exA()) : null;
    }

    private hyn t(jep jep2) {
        return iae.oJ(jen.dzL().dzM().dzD().j(jep2).dzX().bD(new Object[0]).exA());
    }

    private hyn u(jep jep2) {
        return iae.oJ(jen.dzL().dzM().dzD().l(jep2).dzX().bD(new Object[0]).exA());
    }

    private void dDN() {
        for (ipx ipx2 : this.mZa) {
            ipx2.hz(1.0f);
        }
    }

    private void dDO() {
        for (int i = 0; i < this.mZa.length; ++i) {
            jfc jfc2 = jen.dzL().dzM().dzE().Ur(i).dAu();
            if (jfc2 != null && jfc2 instanceof jfg) continue;
            this.mZa[i].hz(0.3f);
        }
    }

    private void dDP() {
        for (int i = 0; i < this.mZa.length; ++i) {
            jfc jfc2 = jen.dzL().dzM().dzE().Ur(i).dAu();
            if (jfc2 != null && jfc2 instanceof jfb) continue;
            this.mZa[i].hz(0.3f);
        }
    }

    static /* synthetic */ void a(jgc jgc2, jeo jeo2) {
        jgc2.d(jeo2);
    }

    static /* synthetic */ void a(jgc jgc2, jep jep2, jeq jeq2) {
        jgc2.e(jep2, jeq2);
    }

    static /* synthetic */ void a(jgc jgc2, int n, Float f) {
        jgc2.a(n, f);
    }

    static /* synthetic */ void a(jgc jgc2, jfd jfd2, jfc jfc2, jfc jfc3) {
        jgc2.a(jfd2, jfc2, jfc3);
    }

    static /* synthetic */ void a(jgc jgc2, jew jew2) {
        jgc2.i(jew2);
    }

    static /* synthetic */ hyn a(jgc jgc2) {
        return jgc2.dDK();
    }

    static /* synthetic */ hyn b(jgc jgc2) {
        return jgc2.dDM();
    }

    static /* synthetic */ hyn c(jgc jgc2) {
        return jgc2.dDL();
    }

    static /* synthetic */ hyn a(jgc jgc2, jep jep2) {
        return jgc2.s(jep2);
    }

    static /* synthetic */ void d(jgc jgc2) {
        jgc2.dDP();
    }

    static /* synthetic */ void e(jgc jgc2) {
        jgc2.dDN();
    }

    static /* synthetic */ void f(jgc jgc2) {
        jgc2.dDO();
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jgi
extends jfl {
    private jgg[] mZS = new jgg[lea.epx().aQI()];
    private iyw mXG;
    private ist mZT;
    private ist mZU;
    private ist mZV;
    private jfj mZW;

    public jgi(int n, int n2) {
        this.a(iqo.dmT());
        this.W(ipx.a(1, 5, new ipf[0]));
        this.W(this.ft(n, n2));
        this.W(this.dEp());
        this.W(ipx.a(1, 6, new ipf[0]));
        this.W(ipx.l(ipx.a(6, 1, new ipf[0]), new ipk(0x313131, 624, 1)));
        this.W(ipx.a(1, 6, new ipf[0]));
        this.W(this.dEw());
        jen.dzL().mUU.a((jlh<jfd, jfc, jfc>)new jlt<jgi, jfd, jfc, jfc>(this, this){
            final /* synthetic */ jgi mZX;
            {
                this.mZX = jgi2;
                super(jgi3);
            }

            public void a(jgi jgi2, jfd jfd2, jfc jfc2, jfc jfc3) {
                if (jfd2.dAu() != null && !jfd2.dAs()) {
                    hso.cxK().cxP().j(cja.eDy.ordinal(), -1, jfd2.dAu().cCs().awE().getType(), -1);
                }
                jgi.a(this.mZX);
            }
        });
        this.dEE();
    }

    @Override
    public boolean getResizable() {
        return false;
    }

    @Override
    public loz aNA() {
        return lxx.tzz.bD(new Object[0]);
    }

    @Override
    public jmq dBo() {
        return jmq.nzU;
    }

    @Override
    public String dBp() {
        return "role_window_skill_bg";
    }

    public jgh UA(int n) {
        return this.mZS[n].dEf();
    }

    public void aTg() {
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

    private ipf ft(int n, int n2) {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(10, 1, new ipf[0]));
        ipx2.W(ipx.d(this.cVi()));
        ipx2.W(ipx.a(10, 1, new ipf[0]));
        ipx2.W(ipx.d(new ivz()));
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.d(this.fu(n, n2)));
        ipx2.W(ipx.a(6, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dBq()));
        ipx2.W(ipx.a(34, 1, new ipf[0]));
        return ipx2;
    }

    private ipf cVi() {
        return ist.a(isf.mwO, 14, 0xABABAB, lxx.tzA.bD(new Object[0]));
    }

    private ipf fu(int n, int n2) {
        iyw iyw2;
        this.mXG = iyw2 = new iyw(this, n, n2){
            final /* synthetic */ jgi mZX;
            {
                this.mZX = jgi2;
                super(n, n2);
            }

            public void dtJ() {
                this.mZX.dtJ();
            }

            public void cvR() {
                this.djE();
                ioa.cyJ().cIN().c(jen.dzL().dzN().dAk());
            }

            public ios dtI() {
                return new iwf(this){
                    final /* synthetic */ 4 mZY;
                    {
                        this.mZY = var1_1;
                    }

                    public void cLq() {
                        this.mZY.cvR();
                    }

                    public hyn dd(int n, int n2) {
                        return iae.oJ(lxx.tAC.bD(new Object[0]).exA());
                    }
                };
            }
        };
        return iyw2;
    }

    private ipf dBq() {
        jfj jfj2;
        jew jew2 = jen.dzL().dzN().dAk();
        this.mZW = jfj2 = new jfj(this, jew2 != null ? jew2.dzY() : jey.mWP){
            final /* synthetic */ jgi mZX;
            {
                this.mZX = jgi2;
                super(jey2);
            }

            public void cLq() {
                this.djE();
                ioa.cxP().czx().czL();
                jen.dzL().dzN().dAk().dAe();
            }
        };
        jen.dzL().mVj.a((jlg<jew, Integer>)new jls<jgi, jew, Integer>(this, this, jfj2){
            final /* synthetic */ jfj mXJ;
            final /* synthetic */ jgi mZX;
            {
                this.mZX = jgi2;
                this.mXJ = jfj2;
                super(jgi3);
            }

            public void a(jgi jgi2, jew jew2, Integer n) {
                this.mXJ.a(jew2.dzY(), jew2.dAf(), jew2.dzG());
            }
        });
        jen.dzL().mVi.a((jlg<jew, Integer>)new jls<jgi, jew, Integer>(this, this, jfj2){
            final /* synthetic */ jfj mXJ;
            final /* synthetic */ jgi mZX;
            {
                this.mZX = jgi2;
                this.mXJ = jfj2;
                super(jgi3);
            }

            public void a(jgi jgi2, jew jew2, Integer n) {
                this.mXJ.a(jew2.dzY(), jew2.dAf(), jew2.dzG());
            }
        });
        jen.dzL().mVk.a((jlg<jew, Integer>)new jls<jgi, jew, Integer>(this, this, jfj2){
            final /* synthetic */ jfj mXJ;
            final /* synthetic */ jgi mZX;
            {
                this.mZX = jgi2;
                this.mXJ = jfj2;
                super(jgi3);
            }

            public void a(jgi jgi2, jew jew2, Integer n) {
                this.mXJ.a(jew2.dzY(), jew2.dAf(), jew2.dzG());
            }
        });
        return jfj2;
    }

    private ipf dEp() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(15, 1, new ipf[0]));
        ipx2.W(this.dEq());
        ipx2.W(ipx.j(ipx.a(1, 10, new ipf[0]), ipx.d(new ipk(0x313131, 1, 512)), ipx.a(8, 1, new ipf[0])));
        ipx2.W(this.dEt());
        ipx2.W(ipx.a(16, 1, new ipf[0]));
        return ipx2;
    }

    private ipf dEq() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.d(this.dEr()));
        ipx2.W(ipx.a(1, 5, new ipf[0]));
        ipx2.W(this.dEs());
        return ipx2;
    }

    private ipf dEr() {
        ist ist2 = ist.a(isf.mwO, 18, 12357465, lxx.tzv.bD(new Object[0]));
        jen.dzL().mVb.b(new jlq<jgi>(this, this, ist2){
            final /* synthetic */ ist mZj;
            final /* synthetic */ jgi mZX;
            {
                this.mZX = jgi2;
                this.mZj = ist2;
                super(jgi3);
            }

            public void e(jgi jgi2) {
                boolean bl = jen.dzL().dzM().dzE().dAP();
                this.mZj.Rk(bl ? 15769621 : 12357465);
            }

            public /* synthetic */ void R(Object object) {
                this.e((jgi)object);
            }
        });
        return ist2;
    }

    private ipf dEs() {
        return this.fv(0, lea.epx().aQI() / 2);
    }

    private ipf dEt() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.d(this.dEu()));
        ipx2.W(ipx.a(1, 5, new ipf[0]));
        ipx2.W(this.dEv());
        return ipx2;
    }

    private ipf dEu() {
        ist ist2 = ist.a(isf.mwO, 18, 12357465, lxx.tzw.bD(new Object[0]));
        jen.dzL().mVb.b(new jlq<jgi>(this, this, ist2){
            final /* synthetic */ ist mZj;
            final /* synthetic */ jgi mZX;
            {
                this.mZX = jgi2;
                this.mZj = ist2;
                super(jgi3);
            }

            public void e(jgi jgi2) {
                boolean bl = jen.dzL().dzM().dzE().dAQ();
                this.mZj.Rk(bl ? 15769621 : 12357465);
            }

            public /* synthetic */ void R(Object object) {
                this.e((jgi)object);
            }
        });
        return ist2;
    }

    private ipf dEv() {
        return this.fv(lea.epx().aQI() / 2, lea.epx().aQI());
    }

    private ipf fv(int n, int n2) {
        ipx ipx2 = ipx.a(ire.muk, 2, new ipf[0]);
        int[] nArray = new int[]{1, -9, 13, 3};
        for (int i = n; i < n2; ++i) {
            jgg jgg2;
            int n3 = n / 8 * 2 + (i % 2 == 0 ? 0 : 1);
            this.mZS[i] = jgg2 = new jgg(i, i - n, nArray[n3]);
            ipx2.W(jgg2);
        }
        return ipx2;
    }

    private ipf dEw() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(this.dDo());
        ipx2.W(ipx.a(15, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 31)));
        ipx2.W(ipx.a(12, 1, new ipf[0]));
        ipx2.W(this.dDp());
        ipx2.W(ipx.a(16, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 31)));
        ipx2.W(ipx.a(12, 1, new ipf[0]));
        ipx2.W(this.dDq());
        return ipx2;
    }

    private ipf dDo() {
        ipx ipx2 = new ipx(this, iqo.dmS()){
            final /* synthetic */ jgi mZX;
            {
                this.mZX = jgi2;
                super(iqz2);
            }

            public boolean dK(int n, int n2) {
                jgi.b(this.mZX);
                return super.dK(n, n2);
            }

            public boolean dL(int n, int n2) {
                jgi.c(this.mZX);
                return super.dL(n, n2);
            }

            public hyn dd(int n, int n2) {
                return jek.dzr();
            }
        };
        ipx2.W(ipx.a(179, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dEx()));
        ipx2.W(ipx.d(this.dEy()));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipb("icon_skill_school")));
        return ipx2;
    }

    private ipf dDp() {
        ipx ipx2 = new ipx(this, iqo.dmS()){
            final /* synthetic */ jgi mZX;
            {
                this.mZX = jgi2;
                super(iqz2);
            }

            public boolean dK(int n, int n2) {
                jgi.d(this.mZX);
                return super.dK(n, n2);
            }

            public boolean dL(int n, int n2) {
                jgi.c(this.mZX);
                return super.dL(n, n2);
            }

            public hyn dd(int n, int n2) {
                return jek.dzs();
            }
        };
        ipx2.W(ipx.d(this.dEz()));
        ipx2.W(ipx.d(this.dEA()));
        ipx2.W(ipx.a(5, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipb("icon_skill_ultimate")));
        return ipx2;
    }

    private ipf dDq() {
        ipx ipx2 = new ipx(this, iqo.dmS()){
            final /* synthetic */ jgi mZX;
            {
                this.mZX = jgi2;
                super(iqz2);
            }

            public hyn dd(int n, int n2) {
                return jek.dzt();
            }
        };
        ipx2.W(ipx.d(this.dEB()));
        ipx2.W(ipx.d(this.dEC()));
        ipx2.W(ipx.a(3, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipb("icon_skill_total")));
        return ipx2;
    }

    private ipf dEx() {
        this.mZT = new ist(isf.mwO, 18, 0xABABAB);
        this.dDF();
        return this.mZT;
    }

    private ipf dEy() {
        return ist.c(isf.mwO, 18, 12357465, "/" + lea.epx().aQK());
    }

    private ipf dEz() {
        this.mZU = new ist(isf.mwO, 18, 0xABABAB);
        this.dDG();
        return this.mZU;
    }

    private ipf dEA() {
        return ist.c(isf.mwO, 18, 12357465, "/" + lea.epx().aQJ());
    }

    private ipf dEB() {
        this.mZV = new ist(isf.mwO, 18, 0xABABAB);
        this.dDH();
        return this.mZV;
    }

    private ipf dEC() {
        return ist.c(isf.mwO, 18, 12357465, "/" + lea.epx().aQI());
    }

    private void dDF() {
        int n = jen.dzL().dzM().dzE().dAO();
        this.mZT.setText("" + n);
        this.mZT.Rk(n <= lea.epx().aQK() ? (n < lea.epx().aQK() ? 0xABABAB : 12357465) : 0xAC3333);
    }

    private void dDG() {
        int n = jen.dzL().dzM().dzE().dAN();
        this.mZU.setText("" + n);
        this.mZU.Rk(n <= lea.epx().aQJ() ? (n < lea.epx().aQJ() ? 0xABABAB : 12357465) : 0xAC3333);
    }

    private void dDH() {
        int n = jen.dzL().dzM().dzE().dAM();
        this.mZV.setText("" + n);
        this.mZV.Rk(n < lea.epx().aQI() ? 0xABABAB : 12357465);
    }

    private void dED() {
        this.dDF();
        this.dDG();
        this.dDH();
    }

    private void dEE() {
        jew jew2 = jen.dzL().dzN().dAk();
        if (jew2 != null) {
            this.mZW.a(jew2.dzY(), jew2.dAf(), jew2.dzG());
        }
    }

    private void dDN() {
        for (jgg jgg2 : this.mZS) {
            jgg2.hz(1.0f);
        }
    }

    private void dDO() {
        for (int i = 0; i < this.mZS.length; ++i) {
            jfc jfc2 = jen.dzL().dzM().dzE().Ur(i).dAu();
            if (jfc2 != null && jfc2 instanceof jfg) continue;
            this.mZS[i].hz(0.3f);
        }
    }

    private void dDP() {
        for (int i = 0; i < this.mZS.length; ++i) {
            jfc jfc2 = jen.dzL().dzM().dzE().Ur(i).dAu();
            if (jfc2 != null && jfc2 instanceof jfb) continue;
            this.mZS[i].hz(0.3f);
        }
    }

    static /* synthetic */ void a(jgi jgi2) {
        jgi2.dED();
    }

    static /* synthetic */ void b(jgi jgi2) {
        jgi2.dDP();
    }

    static /* synthetic */ void c(jgi jgi2) {
        jgi2.dDN();
    }

    static /* synthetic */ void d(jgi jgi2) {
        jgi2.dDO();
    }
}


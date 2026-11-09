/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jfm
extends jfl {
    private jfo[] mXE = new jfo[jep.values().length];
    private jfp[][] mXF = new jfp[jep.values().length][];
    private iyw mXG;

    public jfm(int n, int n2) {
        for (jep jep2 : jep.values()) {
            this.mXF[jep2.ordinal()] = new jfp[jeq.values().length];
        }
        this.a(iqo.dmS());
        this.W(ipx.a(3, 1, new ipf[0]));
        this.W(this.fs(n, n2));
    }

    @Override
    public boolean getResizable() {
        return false;
    }

    @Override
    public loz aNA() {
        return lxx.tzy.bD(new Object[0]);
    }

    @Override
    public jmq dBo() {
        return jmq.nzX;
    }

    @Override
    public String dBp() {
        return "role_window_attribute_bg";
    }

    private ipf fs(int n, int n2) {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.a(1, 5, new ipf[0]));
        ipx2.W(this.ft(n, n2));
        ipx2.W(ipx.a(1, 1, new ipf[0]));
        ipx2.W(this.dBr());
        ipx2.W(ipx.a(1, 11, new ipf[0]));
        return ipx2;
    }

    private ipf ft(int n, int n2) {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(7, 1, new ipf[0]));
        ipx2.W(ipx.d(this.cVi()));
        ipx2.W(ipx.a(170, 1, new ipf[0]));
        ipx2.W(ipx.d(this.fu(n, n2)));
        ipx2.W(ipx.a(6, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dBq()));
        return ipx2;
    }

    private ipf cVi() {
        return ist.a(isf.mwO, 14, 0xABABAB, lxx.tzt.bD(4));
    }

    private ipf fu(int n, int n2) {
        iyw iyw2;
        this.mXG = iyw2 = new iyw(this, n, n2){
            final /* synthetic */ jfm mXH;
            {
                this.mXH = jfm2;
                super(n, n2);
            }

            public void dtJ() {
                this.mXH.dtJ();
            }

            public void cvR() {
                this.djE();
                ioa.cyJ().cIN().b(jen.dzL().dzN().dAk());
            }

            public ios dtI() {
                return new iwf(this){
                    final /* synthetic */ 1 mXI;
                    {
                        this.mXI = var1_1;
                    }

                    public void cLq() {
                        this.mXI.cvR();
                    }

                    public hyn dd(int n, int n2) {
                        return iae.oJ(lxx.tAB.bD(new Object[0]).exA());
                    }
                };
            }
        };
        return iyw2;
    }

    private ipf dBq() {
        jew jew2 = jen.dzL().dzN().dAk();
        jfj jfj2 = new jfj(this, jew2 != null ? jew2.dzY() : jey.mWP){
            final /* synthetic */ jfm mXH;
            {
                this.mXH = jfm2;
                super(jey2);
            }

            public void cLq() {
                this.djE();
                ioa.cxP().czx().czL();
                jen.dzL().dzN().dAk().dAd();
            }
        };
        jen.dzL().mVj.a((jlg<jew, Integer>)new jls<jfm, jew, Integer>(this, this, jfj2){
            final /* synthetic */ jfj mXJ;
            final /* synthetic */ jfm mXH;
            {
                this.mXH = jfm2;
                this.mXJ = jfj2;
                super(jfm3);
            }

            public void a(jfm jfm2, jew jew2, Integer n) {
                this.mXJ.a(jew2.dzY(), jew2.dAf(), jew2.dzG());
            }
        });
        jen.dzL().mVi.a((jlg<jew, Integer>)new jls<jfm, jew, Integer>(this, this, jfj2){
            final /* synthetic */ jfj mXJ;
            final /* synthetic */ jfm mXH;
            {
                this.mXH = jfm2;
                this.mXJ = jfj2;
                super(jfm3);
            }

            public void a(jfm jfm2, jew jew2, Integer n) {
                this.mXJ.a(jew2.dzY(), jew2.dAf(), jew2.dzG());
            }
        });
        jen.dzL().mVk.a((jlg<jew, Integer>)new jls<jfm, jew, Integer>(this, this, jfj2){
            final /* synthetic */ jfj mXJ;
            final /* synthetic */ jfm mXH;
            {
                this.mXH = jfm2;
                this.mXJ = jfj2;
                super(jfm3);
            }

            public void a(jfm jfm2, jew jew2, Integer n) {
                this.mXJ.a(jew2.dzY(), jew2.dAf(), jew2.dzG());
            }
        });
        return jfj2;
    }

    private ipf dBr() {
        ipx ipx2 = ipx.l(new ipf[0]);
        for (jep jep2 : jep.values()) {
            if (jep2.ordinal() > 0) {
                ipx2.W(this.dBs());
            }
            ipx2.W(this.q(jep2));
        }
        return ipx2;
    }

    private ipf dBs() {
        return ipx.j(ipx.a(1, 3, new ipf[0]), new ipk(0x313131, 1, 395));
    }

    private ipf q(jep jep2) {
        ipx ipx2 = ipx.j(new ipf[0]);
        this.mXE[jep2.ordinal()] = new jfo(jep2);
        ipx2.W(this.mXE[jep2.ordinal()]);
        for (jeq jeq2 : jeq.values()) {
            jfp jfp2;
            ipx2.W(this.dBt());
            this.mXF[jep2.ordinal()][jeq2.ordinal()] = jfp2 = new jfp(jep2, jeq2);
            ipx2.W(jfp2);
        }
        return ipx2;
    }

    private ipf dBt() {
        return ipx.d(new ipk(0x313131, 124, 1));
    }
}


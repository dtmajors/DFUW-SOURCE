/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jdh
extends ipx {
    private jch mSc;
    private iph mSW;
    private iox lXg;
    private iox mSX;

    public jdh(jch jch2) {
        this.mSc = jch2;
        this.a(iqo.dmS());
        this.W(ipx.a(1, 63, new ipf[0]));
        this.W(ipx.c(new ipf[]{new jdm(jch2)}));
        if (this.mSc.wF().vY()) {
            this.W(this.cGX());
            this.W(ipx.a(2, 1, new ipf[0]));
            this.W(ipx.d(this.dyA()));
        }
        if (!this.mSc.isCompleted()) {
            this.W(this.dyB());
            this.W(ipx.c(-2, 0, ipx.j(ipx.a(1, 1, new ipf[0]), this.cVf(), ipx.c(new ipf[0]))));
        }
        this.W(ipx.a(2, 1, new ipf[0]));
        jcc.dwT().mQE.a((jlg<jch, jjh>)new jls<jdh, jch, jjh>(this, this){
            final /* synthetic */ jdh mSY;
            {
                this.mSY = jdh2;
                super(jdh3);
            }

            public void a(jdh jdh2, jch jch2, jjh jjh2) {
                if (jch2 == jdh.a(this.mSY)) {
                    jdh.a(jdh2, jjh2);
                }
            }
        });
        jcc.dwT().mQF.a((jlg<jch, jjh>)new jls<jdh, jch, jjh>(this, this){
            final /* synthetic */ jdh mSY;
            {
                this.mSY = jdh2;
                super(jdh3);
            }

            public void a(jdh jdh2, jch jch2, jjh jjh2) {
                if (jch2 == jdh.a(this.mSY)) {
                    jdh.b(jdh2, jjh2);
                }
            }
        });
        this.mSc.mRb.c((jlf<jch>)new jlr<jdh, jch>(this, this){
            final /* synthetic */ jdh mSY;
            {
                this.mSY = jdh2;
                super(jdh3);
            }

            public void a(jdh jdh2, jch jch2) {
                jdh.b(jdh2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.a((jdh)object, (jch)object2);
            }
        });
        this.mSc.mRa.c((jlf<jch>)new jlr<jdh, jch>(this, this){
            final /* synthetic */ jdh mSY;
            {
                this.mSY = jdh2;
                super(jdh3);
            }

            public void a(jdh jdh2, jch jch2) {
                jdh.c(jdh2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.a((jdh)object, (jch)object2);
            }
        });
    }

    private ipf cGX() {
        return ipx.j(ipx.a(1, 6, new ipf[0]), new ipk(0x2F2F2F, 1, 52));
    }

    private ipf dyA() {
        return new jdj(this){
            final /* synthetic */ jdh mSY;
            {
                this.mSY = jdh2;
            }

            public void cLq() {
                jcc.dwT().TP(jdh.a(this.mSY).wF().getID());
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxu.tyB.bD(new Object[0]).exA().toUpperCase());
            }
        };
    }

    private ipf dyB() {
        this.mSW = ipx.l(new ipf[0]);
        this.mSW.setVisible(this.mSc.dxs() > 0);
        this.mSW.W(this.cGX());
        this.mSW.W(ipx.a(2, 1, new ipf[0]));
        this.mSW.W(ipx.d(this.dyC()));
        return this.mSW;
    }

    private ipf dyC() {
        this.lXg = new jdi(this){
            final /* synthetic */ jdh mSY;
            {
                this.mSY = jdh2;
            }

            public void pn(boolean bl) {
                jdh.a(this.mSY).sW(bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxu.tyz.bD(new Object[0]).exA().toUpperCase());
            }
        };
        this.lXg.hX(true);
        return this.lXg;
    }

    private ipf cVf() {
        jdn jdn2 = new jdn(this){
            final /* synthetic */ jdh mSY;
            {
                this.mSY = jdh2;
            }

            public void pn(boolean bl) {
                jdh.a(this.mSY).sX(bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxu.tyA.bD(new Object[0]).exA().toUpperCase());
            }
        };
        this.mSX = jdn2;
        this.mSX.hX(this.mSc.dxw());
        return jdn2;
    }

    private void j(jjh jjh2) {
        if (this.mSW == null) {
            return;
        }
        this.mSW.setVisible(true);
        jjh2.setVisible(this.lXg.dir());
    }

    private void k(jjh jjh2) {
        if (this.mSW == null) {
            return;
        }
        this.mSW.setVisible(this.mSc.dxt());
    }

    private void dyD() {
        if (this.mSX != null) {
            this.mSX.hX(this.mSc.dxw());
        }
    }

    private void dyE() {
        if (this.mSX != null) {
            this.mSX.setVisible(false);
        }
    }

    static /* synthetic */ jch a(jdh jdh2) {
        return jdh2.mSc;
    }

    static /* synthetic */ void a(jdh jdh2, jjh jjh2) {
        jdh2.j(jjh2);
    }

    static /* synthetic */ void b(jdh jdh2, jjh jjh2) {
        jdh2.k(jjh2);
    }

    static /* synthetic */ void b(jdh jdh2) {
        jdh2.dyD();
    }

    static /* synthetic */ void c(jdh jdh2) {
        jdh2.dyE();
    }
}


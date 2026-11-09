/*
 * Decompiled with CFR.
 */
public class jcu
extends ipx {
    private jco mRV;
    private ist lCt;

    public jcu(jco jco2) {
        this.mRV = jco2;
        this.a(irl.dnr());
        this.W(this.cGU());
        this.mRV.myP.c(new jlr<jcu, itj>(this, this){
            final /* synthetic */ jcu mSk;
            {
                this.mSk = jcu2;
                super(jcu3);
            }

            public void a(jcu jcu2, itj itj2) {
                jcu.a(jcu2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.a((jcu)object, (itj)object2);
            }
        });
    }

    public void D(loz loz2) {
        this.lCt.o(loz2);
    }

    private ipf cGU() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.d(this.duM()));
        ipx2.W(ipx.a(16, 1, new ipf[0]));
        return ipx2;
    }

    private ipf duM() {
        this.lCt = new ist(this, isf.mwO, 18, 12357465, null){
            final /* synthetic */ jcu mSk;
            {
                this.mSk = jcu2;
                super(isf2, n, n2, loz2);
            }

            public boolean du(int n, int n2) {
                jcc.dwT().c((jci)jcu.b(this.mSk).dqK());
                return true;
            }

            public void cND() {
                this.Rk(this.dkb() ? 14855276 : 12357465);
            }
        };
        return this.lCt;
    }

    private void dyf() {
        ith ith2 = this.mRV.dqK();
        if (ith2 instanceof jcd) {
            jcd jcd2 = (jcd)ith2;
            this.lCt.o(jcd2.aND());
            this.lCt.rF(false);
            this.pack();
        } else if (ith2 instanceof jci) {
            jci jci2 = (jci)ith2;
            jcd jcd3 = (jcd)jci2.dqI();
            this.lCt.o(jci2.aND());
            this.lCt.rF(true);
            this.pack();
        } else {
            jch jch2 = (jch)ith2;
            jci jci3 = (jci)jch2.dqI();
            jcd jcd4 = (jcd)jci3.dqI();
            this.lCt.o(jci3.aND());
            this.lCt.rF(false);
            this.pack();
        }
    }

    static /* synthetic */ void a(jcu jcu2) {
        jcu2.dyf();
    }

    static /* synthetic */ jco b(jcu jcu2) {
        return jcu2.mRV;
    }
}


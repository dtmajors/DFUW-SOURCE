/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jfo
extends ipx {
    private jep mVu;
    private ist lTZ;
    private iqj mXK;
    private ipx mXL;
    private ist mXM;
    private ipb mBR;
    private static iqz mXN = new iqz(){

        public void e(ipf ipf2) {
            ipf2.setSize(0, 0);
        }

        public void i(ipf ipf2) {
            int n = ipf2.getWidth() / 2 + 28;
            int n2 = 0;
            iph iph2 = (iph)ipf2;
            for (ipf ipf3 : iph2.getChildren()) {
                ipf3.ek(n, n2);
            }
        }
    };

    public jfo(jep jep2) {
        this.mVu = jep2;
        this.a(iqo.dmT());
        this.W(this.cVi());
        this.W(ipx.a(1, 17, new ipf[0]));
        this.W(this.cGW());
        this.W(ipx.a(1, 16, new ipf[0]));
        jen.dzL().mUP.c((jlf<jeo>)new jlr<jfo, jeo>(this, this){
            final /* synthetic */ jfo mXO;
            {
                this.mXO = jfo2;
                super(jfo3);
            }

            public void a(jfo jfo2, jeo jeo2) {
                this.mXO.aTg();
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.a((jfo)object, (jeo)object2);
            }
        });
        jen.dzL().mUQ.a((jlg<jep, jeq>)new jls<jfo, jep, jeq>(this, this){
            final /* synthetic */ jfo mXO;
            {
                this.mXO = jfo2;
                super(jfo3);
            }

            public void a(jfo jfo2, jep jep2, jeq jeq2) {
                this.mXO.aTg();
            }
        });
        this.aTg();
    }

    public void aTg() {
        jeq jeq2 = jen.dzL().dzM().dzC().g(this.mVu);
        if (jeq2 != null) {
            this.mXL.setVisible(true);
            this.mXM.o(jeq2.aNA());
        } else {
            this.mXL.setVisible(false);
        }
        this.mXK.setActive(jen.dzL().dzM().dzC().h(this.mVu));
    }

    private ipf cVi() {
        this.lTZ = ist.a(isf.mwO, 18, 12357465, this.mVu.aNA());
        return ipx.d(this.lTZ);
    }

    private ipf cGW() {
        irc irc2 = new irc();
        ipx ipx2 = new ipx(irc2);
        ipf ipf2 = this.cPn();
        ipx2.W(ipf2);
        irc2.a(ipf2, new ioc(0, 0));
        ipf ipf3 = this.dBu();
        ipx2.W(ipf3);
        irc2.a(ipf3, new ioc(-32, 0));
        ipf ipf4 = this.dBw();
        ipx2.W(ipf4);
        irc2.a(ipf4, new ioc(0, -32));
        return ipx2;
    }

    private ipf cPn() {
        this.mXK = new iqj("icon_booster_" + this.mVu.dzT() + "_inactive", "icon_booster_" + this.mVu.dzT() + "_active");
        this.mXK.setActive(false);
        return this.mXK;
    }

    private ipf dBu() {
        this.mXL = new ipy(this, irl.dnr()){
            final /* synthetic */ jfo mXO;
            {
                this.mXO = jfo2;
                super(iqz2);
            }

            public hyn dd(int n, int n2) {
                jeo jeo2 = jen.dzL().dzM().dzC().e(jfo.a(this.mXO));
                return jeo2 != null ? iae.oJ(lxx.tzX.bD(jeo2.dzP().aNA().exA(), jeo2.getDisplayName()).exA()) : null;
            }
        };
        this.mXL.setVisible(false);
        this.mXL.W(ipx.d(new ipb("bg_active_booster")));
        this.mXL.W(ipx.d(this.dBv()));
        return this.mXL;
    }

    private ipf dBv() {
        this.mXM = ist.a(isf.mwO, 16, 12357465);
        return this.mXM;
    }

    private ipf dBw() {
        ipx ipx2 = new ipx();
        ipx2.a(mXN);
        this.mBR = new ipb("icon_section_change_indicator");
        this.dBx();
        jen.dzL().mUZ.b(new jlq<jfo>(this, this){
            final /* synthetic */ jfo mXO;
            {
                this.mXO = jfo2;
                super(jfo3);
            }

            public void c(jfo jfo2) {
                jfo.b(this.mXO);
            }

            public /* synthetic */ void R(Object object) {
                this.c((jfo)object);
            }
        });
        ipx2.W(this.mBR);
        return ipx2;
    }

    private void dBx() {
        boolean bl = jen.dzL().dzM().dzC().i(this.mVu);
        this.mBR.setVisible(bl);
        this.lTZ.Rk(bl ? 15769621 : 12357465);
    }

    static /* synthetic */ jep a(jfo jfo2) {
        return jfo2.mVu;
    }

    static /* synthetic */ void b(jfo jfo2) {
        jfo2.dBx();
    }
}


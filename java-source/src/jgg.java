/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jgg
extends ipx {
    private int lBn;
    private int mZF;
    private iwv mZG;
    private jgf mZH;
    private jgk mZI;
    private iox mZJ;
    private iox mZK;
    private iox mZL;
    private jgh mZM;
    private ipb mBR;
    private int mZN;
    private static iqz mdv = new iqz(){

        public void e(ipf ipf2) {
            ipf2.setSize(149, 99);
        }

        public void i(ipf ipf2) {
            jgg.f((jgg)ipf2);
        }
    };

    public jgg(int n, int n2, int n3) {
        this.lBn = n;
        this.mZF = n2;
        this.mZN = n3;
        this.a(mdv);
        this.W(this.dEg());
        this.W(this.dEh());
        this.W(this.dEi());
        this.W(this.dEj());
        this.W(this.dEk());
        this.W(this.dEl());
        this.c(this.dEm(), 0);
        this.W(this.dBw());
        jen.dzL().mUX.c((jlf<jfd>)new jlr<jgg, jfd>(this, this){
            final /* synthetic */ jgg mZO;
            {
                this.mZO = jgg2;
                super(jgg3);
            }

            public void a(jgg jgg2, jfd jfd2) {
                if (jfd2.dAr() == jgg.a(this.mZO)) {
                    jgg.b(this.mZO).hX(jfd2.dAy());
                }
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.a((jgg)object, (jfd)object2);
            }
        });
        jen.dzL().mUV.c((jlf<jfd>)new jlr<jgg, jfd>(this, this){
            final /* synthetic */ jgg mZO;
            {
                this.mZO = jgg2;
                super(jgg3);
            }

            public void a(jgg jgg2, jfd jfd2) {
                if (jfd2.dAr() == jgg.a(this.mZO)) {
                    jgg.c(this.mZO).hX(jfd2.dAw());
                }
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.a((jgg)object, (jfd)object2);
            }
        });
        jen.dzL().mUW.c((jlf<jfd>)new jlr<jgg, jfd>(this, this){
            final /* synthetic */ jgg mZO;
            {
                this.mZO = jgg2;
                super(jgg3);
            }

            public void a(jgg jgg2, jfd jfd2) {
                if (jfd2.dAr() == jgg.a(this.mZO)) {
                    jgg.d(this.mZO).hX(jfd2.dAx());
                }
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.a((jgg)object, (jfd)object2);
            }
        });
        jen.dzL().mUU.a((jlh<jfd, jfc, jfc>)new jlt<jgg, jfd, jfc, jfc>(this, this){
            final /* synthetic */ jgg mZO;
            {
                this.mZO = jgg2;
                super(jgg3);
            }

            public void a(jgg jgg2, jfd jfd2, jfc jfc2, jfc jfc3) {
                if (jfd2.dAr() == jgg.a(this.mZO)) {
                    jgg.e(this.mZO).setVisible(jfc2 instanceof jfg);
                }
            }
        });
        jfd jfd2 = jen.dzL().dzM().dzE().Ur(this.lBn);
        this.mZL.hX(jfd2.dAy());
        this.mZJ.hX(jfd2.dAw());
        this.mZK.hX(jfd2.dAx());
        this.mZM.aTg();
    }

    public jgh dEf() {
        return this.mZM;
    }

    private ipf dEg() {
        this.mZG = new iwv(this, "skill_slot_ultimate_indicator"){
            final /* synthetic */ jgg mZO;
            {
                this.mZO = jgg2;
                super(string);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxx.tAx.bD(new Object[0]).exA());
            }
        };
        jfc jfc2 = jen.dzL().dzM().dzE().Ur(this.lBn).dAu();
        this.mZG.setVisible(jfc2 != null && jfc2 instanceof jfg);
        return this.mZG;
    }

    private ipf dEh() {
        this.mZH = new jgf(this.lBn);
        return this.mZH;
    }

    private ipf dEi() {
        this.mZI = new jgk(this.lBn, this.mZF);
        return this.mZI;
    }

    private ipf dEj() {
        this.mZK = new ion(this, "button_cooldown_off_disabled", "button_cooldown_off_normal", "button_cooldown_off_hover", "button_cooldown_off_pushing", "button_cooldown_on_disabled", "button_cooldown_on_normal", "button_cooldown_on_hover", "button_cooldown_on_pushing"){
            final /* synthetic */ jgg mZO;
            {
                this.mZO = jgg2;
                super(string, string2, string3, string4, string5, string6, string7, string8);
            }

            public void pn(boolean bl) {
                jen.dzL().dzM().dzE().Ur(jgg.a(this.mZO)).te(bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxx.tAt.bD(new Object[0]).exA());
            }
        };
        return this.mZK;
    }

    private ipf dEk() {
        this.mZJ = new ion(this, "button_return_default_off_disabled", "button_return_default_off_normal", "button_return_default_off_hover", "button_return_default_off_pushing", "button_return_default_on_disabled", "button_return_default_on_normal", "button_return_default_on_hover", "button_return_default_on_pushing"){
            final /* synthetic */ jgg mZO;
            {
                this.mZO = jgg2;
                super(string, string2, string3, string4, string5, string6, string7, string8);
            }

            public void pn(boolean bl) {
                jen.dzL().dzM().dzE().Ur(jgg.a(this.mZO)).td(bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxx.tAv.bD(new Object[0]).exA());
            }
        };
        return this.mZJ;
    }

    private ipf dEl() {
        this.mZL = new ion(this, "button_instant_cast_off_disabled", "button_instant_cast_off_normal", "button_instant_cast_off_hover", "button_instant_cast_off_pushing", "button_instant_cast_on_disabled", "button_instant_cast_on_normal", "button_instant_cast_on_hover", "button_instant_cast_on_pushing"){
            final /* synthetic */ jgg mZO;
            {
                this.mZO = jgg2;
                super(string, string2, string3, string4, string5, string6, string7, string8);
            }

            public void pn(boolean bl) {
                jen.dzL().dzM().dzE().Ur(jgg.a(this.mZO)).tf(bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxx.tAu.bD(new Object[0]).exA());
            }
        };
        return this.mZL;
    }

    private ipf dEm() {
        this.mZM = new jgh(this.lBn);
        return this.mZM;
    }

    private void dEn() {
        int n = this.getWidth() / 2;
        int n2 = this.getHeight() / 2;
        this.mZH.el(n += this.mZN, n2);
        this.mZI.s(n, n2 + 1, 0, 32);
        this.mZK.s(n, n2, -40, -25);
        this.mZJ.s(n, n2, -46, 0);
        this.mZL.s(n, n2, -40, 25);
        this.mZM.s(n + 2, n2, 32, 0);
        this.mBR.s(n, n2, 32, -28);
        this.mZG.s(n, n2, 0, 36);
    }

    private ipf dBw() {
        this.mBR = new ipb("icon_section_change_indicator");
        this.mBR.setVisible(jen.dzL().dzM().dzE().Ur(this.lBn).dzG());
        jen.dzL().mVb.b(new jlq<jgg>(this, this){
            final /* synthetic */ jgg mZO;
            {
                this.mZO = jgg2;
                super(jgg3);
            }

            public void h(jgg jgg2) {
                jgg.g(this.mZO).setVisible(jen.dzL().dzM().dzE().Ur(jgg.a(this.mZO)).dzG());
            }

            public /* synthetic */ void R(Object object) {
                this.h((jgg)object);
            }
        });
        return this.mBR;
    }

    static /* synthetic */ int a(jgg jgg2) {
        return jgg2.lBn;
    }

    static /* synthetic */ iox b(jgg jgg2) {
        return jgg2.mZL;
    }

    static /* synthetic */ iox c(jgg jgg2) {
        return jgg2.mZJ;
    }

    static /* synthetic */ iox d(jgg jgg2) {
        return jgg2.mZK;
    }

    static /* synthetic */ iwv e(jgg jgg2) {
        return jgg2.mZG;
    }

    static /* synthetic */ void f(jgg jgg2) {
        jgg2.dEn();
    }

    static /* synthetic */ ipb g(jgg jgg2) {
        return jgg2.mBR;
    }
}


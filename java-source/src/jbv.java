/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jbv {
    public jbv() {
        jcc.dwT().mQH.c((jlf<jcg>)new jlr<jbv, jcg>(this, this){
            final /* synthetic */ jbv mPP;
            {
                this.mPP = jbv2;
                super(jbv3);
            }

            public void c(jbv jbv2, jcg jcg2) {
                jbv.a(jbv2, jcg2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.c((jbv)object, (jcg)object2);
            }
        });
        jcc.dwT().mQI.c((jlf<jcg>)new jlr<jbv, jcg>(this, this){
            final /* synthetic */ jbv mPP;
            {
                this.mPP = jbv2;
                super(jbv3);
            }

            public void c(jbv jbv2, jcg jcg2) {
                jbv.b(jbv2, jcg2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.c((jbv)object, (jcg)object2);
            }
        });
    }

    private void a(jcg jcg2) {
        hza hza2 = hso.cxK().cxP().cyJ().cJj();
        xa xa2 = jcg2.dxb();
        String string = "";
        switch (xa2) {
            case bam: 
            case bai: {
                string = "/dfdata/texture/gui/j2f/quests/category_icons/category_icons_main_novitiate/category_icons_main_novitiate_off_normal.png";
                break;
            }
            case baj: {
                string = "/dfdata/texture/gui/j2f/quests/category_icons/category_icons_main_ventures/category_icons_main_ventures_off_normal.png";
                break;
            }
            case bak: {
                string = "/dfdata/texture/gui/j2f/quests/category_icons/category_icons_main_rumors/category_icons_rumors_ventures_off_normal.png";
                break;
            }
            case bal: {
                string = "/dfdata/texture/gui/j2f/quests/category_icons/category_icons_main_chronicles/category_icons_rumors_chronicles_off_normal.png";
            }
        }
        hza2.a((ipf)ipx.a(44, 32, this.a(jcg2, string)));
        hza2.c(ipx.a(44, 32, ipx.d(ipx.a(32, 32, new jcq()))));
        hza2.b((ipf)new ist(isf.mwO, 14, 12357465, jcg2.aND()));
        hza2.d(ipx.a(32, 32, new jcq()));
        hza2.f(new ipb("/dfdata/texture/gui/j2f/quests/media_player/title_header_narration.png"));
        hza2.a(new jle(this){
            final /* synthetic */ jbv mPP;
            {
                this.mPP = jbv2;
            }

            public boolean dwQ() {
                jcc.dwT().dwY();
                return true;
            }
        });
        hza2.a(new jlf<lhe<hyn>>(this){
            final /* synthetic */ jbv mPP;
            {
                this.mPP = jbv2;
            }

            public boolean a(lhe<hyn> lhe2) {
                lhe2.rnu = iae.oJ(lxu.tyO.bD(new Object[0]).exA().toUpperCase());
                return true;
            }

            public /* synthetic */ boolean T(Object object) {
                return this.a((lhe)object);
            }
        });
        hza2.b(new jlf<lhe<hyn>>(this){
            final /* synthetic */ jbv mPP;
            {
                this.mPP = jbv2;
            }

            public boolean a(lhe<hyn> lhe2) {
                lhe2.rnu = iae.oJ(lxu.tyP.bD(new Object[0]).exA().toUpperCase());
                return true;
            }

            public /* synthetic */ boolean T(Object object) {
                return this.a((lhe)object);
            }
        });
        hza2.setVisible(true);
    }

    private ipf a(jcg jcg2, String string) {
        ipx ipx2 = new ipx(this, iqp.dmW(), jcg2){
            final /* synthetic */ jcg mPQ;
            final /* synthetic */ jbv mPP;
            {
                this.mPP = jbv2;
                this.mPQ = jcg2;
                super(iqz2);
            }

            public hyn dd(int n, int n2) {
                lox lox2 = this.mPQ instanceof jch ? lxu.tyr : lxu.tyq;
                return iae.I(lox2.bD(new Object[0]).exA(), this.mPQ.aND().exA());
            }
        };
        ipx2.W(new ipb(string, 32, 32));
        return ipx2;
    }

    private void b(jcg jcg2) {
        hso.cxK().cxP().cyJ().cJk();
    }

    static /* synthetic */ void a(jbv jbv2, jcg jcg2) {
        jbv2.a(jcg2);
    }

    static /* synthetic */ void b(jbv jbv2, jcg jcg2) {
        jbv2.b(jcg2);
    }
}


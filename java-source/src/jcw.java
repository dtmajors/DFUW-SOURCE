/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jcw
extends ipx {
    private jco mRV;
    private iox mSs;
    private ipx lvG;
    private ist mSt;
    private ist mSu;

    public jcw(jco jco2) {
        this.mRV = jco2;
        this.a(iqo.dmS());
        this.W(ipx.a(8, 1, new ipf[0]));
        this.W(ipx.d(ipx.a(22, 22, this.dfy())));
        this.W(ipx.a(2, 1, new ipf[0]));
        this.W(ipx.d(new ipk(0x313131, 1, 22)));
        this.W(ipx.a(2, 1, new ipf[0]));
        this.W(this.cGW());
        this.W(ipx.c(new ipf[0]));
        ipx ipx2 = new ipx(this, iqo.dmS()){
            final /* synthetic */ jcw mSv;
            {
                this.mSv = jcw2;
                super(iqz2);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxu.tyy.bD(new Object[0]).exA().toUpperCase());
            }
        };
        this.W(ipx2);
        ipx2.W(ipx.d(this.dyi()));
        ipx2.W(ipx.d(this.dyj()));
        this.W(ipx.a(4, 1, new ipf[0]));
        this.W(ipx.d(new ipk(0x313131, 1, 22)));
        this.W(ipx.a(4, 1, new ipf[0]));
        this.W(ipx.d(new ipb("/dfdata/texture/gui/j2f/quests/quest_total_counter.png")));
        this.W(ipx.a(8, 1, new ipf[0]));
    }

    public void fp(int n, int n2) {
        if (this.mSt != null) {
            this.mSt.setText("" + n);
            this.mSt.Rk(n < n2 ? 0xABABAB : 12357465);
            this.mSu.setText("/" + n2);
        }
    }

    public void a(jca jca2) {
        this.fp(jca2.mQn, jca2.mQo);
    }

    public void c(jcb jcb2) {
        this.lvG.removeAllChildren();
        for (jcz enum_ : jcb2.mQp) {
            this.lvG.W(ipx.d(new iwv(enum_.path + "off_normal.png", 22, 22, enum_.mQg.bD(new Object[0]))));
        }
        for (jbx jbx2 : jcb2.mQq) {
            this.lvG.W(ipx.d(new iwv(jbx2.path + "off_normal.png", 22, 22, jbx2.mQg.bD(new Object[0]))));
        }
        if (jcb2.mQr) {
            this.lvG.W(ipx.d(new iwv("/dfdata/texture/gui/j2f/quests/button_quest_flag_narration/button_quest_flag_narration_off_normal.png", 22, 22, lxu.tyZ.bD(new Object[0]))));
        }
        this.mSs.hX(this.lvG.bfn() > 0);
        this.pack();
    }

    public void az(ipf ipf2) {
    }

    private ipf dfy() {
        this.mSs = new ion(this, "/dfdata/texture/gui/j2f/quests/button_quest_filter/button_quest_filter_off_disabled.png", "/dfdata/texture/gui/j2f/quests/button_quest_filter/button_quest_filter_off_normal.png", "/dfdata/texture/gui/j2f/quests/button_quest_filter/button_quest_filter_off_hover.png", "/dfdata/texture/gui/j2f/quests/button_quest_filter/button_quest_filter_off_pushing.png", "/dfdata/texture/gui/j2f/quests/button_quest_filter/button_quest_filter_on_disabled.png", "/dfdata/texture/gui/j2f/quests/button_quest_filter/button_quest_filter_on_normal.png", "/dfdata/texture/gui/j2f/quests/button_quest_filter/button_quest_filter_on_hover.png", "/dfdata/texture/gui/j2f/quests/button_quest_filter/button_quest_filter_on_pushing.png"){
            final /* synthetic */ jcw mSv;
            {
                this.mSv = jcw2;
                super(string, string2, string3, string4, string5, string6, string7, string8);
            }

            public void cLq() {
                this.mSv.az(this);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxu.tyx.bD(new Object[0]).exA().toUpperCase());
            }
        };
        return this.mSs;
    }

    private ipf cGW() {
        this.lvG = ipx.l(new ipf[0]);
        return this.lvG;
    }

    private ipf dyi() {
        this.mSt = new ist(isf.mwO, 14, 0xABABAB, "19");
        return this.mSt;
    }

    private ipf dyj() {
        this.mSu = new ist(isf.mwO, 14, 12357465, "/45");
        return this.mSu;
    }
}


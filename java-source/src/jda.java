/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jda
extends ihm {
    private jcb mSE;

    public jda(ioa ioa2, joa joa2, jcb jcb2) {
        super("QuestsFilterWindow", "QuestsWindow.swf", ioa2, joa2, 2, 3);
        this.mSE = jcb2.dwS();
    }

    @Override
    public void cCu() {
        super.cCu();
        this.p(40, 0, 40, 50);
        this.cXE().a(iqo.dmT());
        this.cXE().W(ipx.a(1, 8, new ipf[0]));
        this.cXE().W(new ist(isf.mwO, 18, 12357465, lxu.txN.bD(new Object[0])));
        this.cXE().W(this.a(jcz.mSA));
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(this.a(jcz.mSB));
        this.cXE().W(ipx.a(1, 8, new ipf[0]));
        this.cXE().W(ipx.d(new ipk(0x313131, 166, 1)));
        this.cXE().W(ipx.a(1, 8, new ipf[0]));
        this.cXE().W(new ist(isf.mwO, 18, 12357465, lxu.txO.bD(new Object[0])));
        this.cXE().W(this.b(jbx.mPZ));
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(this.b(jbx.mQa));
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(this.b(jbx.mQd));
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(this.b(jbx.mQb));
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(this.b(jbx.mQc));
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(this.b(jbx.mPY));
        if (jcc.dwT().vY()) {
            this.cXE().W(ipx.a(1, 4, new ipf[0]));
            this.cXE().W(this.dyo());
        }
        this.cXE().W(ipx.a(1, 8, new ipf[0]));
        this.cXE().W(this.dfb());
        this.cXE().W(ipx.a(1, 71, new ipf[0]));
    }

    @Override
    protected ipf cMs() {
        return new iqa("/dfdata/texture/gui/j2f/quests/backgrounds/quests_bg_filter.png", 40, 2, 80, 100, iqb.mto);
    }

    @Override
    protected ihn cVF() {
        return null;
    }

    protected void b(jcb jcb2) {
    }

    private ipf a(jcz jcz2) {
        iva iva2 = new iva(this, isf.mwO, 14, 0xABABAB, jcz2.mSC.bD(new Object[0]), 0x313131, 21, jcz2.path + "off_disabled.png", jcz2.path + "off_normal.png", jcz2.path + "off_hover.png", jcz2.path + "off_pushing.png", jcz2.path + "on_disabled.png", jcz2.path + "on_normal.png", jcz2.path + "on_hover.png", jcz2.path + "on_pushing.png", jcz2){
            final /* synthetic */ jcz mSF;
            final /* synthetic */ jda mSG;
            {
                this.mSG = jda2;
                this.mSF = jcz2;
                super(isf2, n, n2, loz2, n3, n4, string, string2, string3, string4, string5, string6, string7, string8);
            }

            public void pn(boolean bl) {
                if (bl) {
                    jda.a((jda)this.mSG).mQp.add(this.mSF);
                } else {
                    jda.a((jda)this.mSG).mQp.remove((Object)((Object)this.mSF));
                }
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(this.mSF.mQg.bD(new Object[0]).exA().toUpperCase());
            }
        };
        iva2.hX(this.mSE.mQp.contains((Object)jcz2));
        return iva2;
    }

    private ipf b(jbx jbx2) {
        iva iva2 = new iva(this, isf.mwO, 14, 0xABABAB, jbx2.mQe.bD(new Object[0]), 0x313131, 21, jbx2.path == null ? null : jbx2.path + "off_disabled.png", jbx2.path == null ? null : jbx2.path + "off_normal.png", jbx2.path == null ? null : jbx2.path + "off_hover.png", jbx2.path == null ? null : jbx2.path + "off_pushing.png", jbx2.path == null ? null : jbx2.path + "on_disabled.png", jbx2.path == null ? null : jbx2.path + "on_normal.png", jbx2.path == null ? null : jbx2.path + "on_hover.png", jbx2.path == null ? null : jbx2.path + "on_pushing.png", jbx2){
            final /* synthetic */ jbx mSH;
            final /* synthetic */ jda mSG;
            {
                this.mSG = jda2;
                this.mSH = jbx2;
                super(isf2, n, n2, loz2, n3, n4, string, string2, string3, string4, string5, string6, string7, string8);
            }

            public void pn(boolean bl) {
                if (bl) {
                    jda.a((jda)this.mSG).mQq.add(this.mSH);
                } else {
                    jda.a((jda)this.mSG).mQq.remove((Object)((Object)this.mSH));
                }
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(this.mSH.mQg.bD(new Object[0]).exA().toUpperCase());
            }
        };
        iva2.hX(this.mSE.mQq.contains((Object)jbx2));
        return iva2;
    }

    private ipf dyo() {
        iva iva2 = new iva(this, isf.mwO, 14, 0xABABAB, lxu.tyb.bD(new Object[0]), 0x313131, 21, "/dfdata/texture/gui/j2f/quests/button_quest_flag_narration/button_quest_flag_narration_off_disabled.png", "/dfdata/texture/gui/j2f/quests/button_quest_flag_narration/button_quest_flag_narration_off_normal.png", "/dfdata/texture/gui/j2f/quests/button_quest_flag_narration/button_quest_flag_narration_off_hover.png", "/dfdata/texture/gui/j2f/quests/button_quest_flag_narration/button_quest_flag_narration_off_pushing.png", "/dfdata/texture/gui/j2f/quests/button_quest_flag_narration/button_quest_flag_narration_on_disabled.png", "/dfdata/texture/gui/j2f/quests/button_quest_flag_narration/button_quest_flag_narration_on_normal.png", "/dfdata/texture/gui/j2f/quests/button_quest_flag_narration/button_quest_flag_narration_on_hover.png", "/dfdata/texture/gui/j2f/quests/button_quest_flag_narration/button_quest_flag_narration_on_pushing.png"){
            final /* synthetic */ jda mSG;
            {
                this.mSG = jda2;
                super(isf2, n, n2, loz2, n3, n4, string, string2, string3, string4, string5, string6, string7, string8);
            }

            public void pn(boolean bl) {
                jda.a((jda)this.mSG).mQr = bl;
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxu.tyZ.bD(new Object[0]).exA().toUpperCase());
            }
        };
        iva2.hX(this.mSE.mQr);
        return iva2;
    }

    private ipf a(jbx jbx2, boolean bl) {
        iva iva2 = new iva(this, isf.mwO, 14, 0xABABAB, jbx2.mQe.bD(new Object[0]), 0x313131, 21, bl, jbx2){
            final /* synthetic */ jbx mSH;
            final /* synthetic */ jda mSG;
            {
                this.mSG = jda2;
                this.mSH = jbx2;
                super(isf2, n, n2, loz2, n3, n4, bl);
            }

            public void pn(boolean bl) {
                if (bl) {
                    jda.a((jda)this.mSG).mQq.add(this.mSH);
                } else {
                    jda.a((jda)this.mSG).mQq.remove((Object)((Object)this.mSH));
                }
            }
        };
        iva2.hX(this.mSE.mQq.contains((Object)jbx2));
        return iva2;
    }

    private ipf dfb() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.d(this.cZn()));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dya()));
        ipx2.W(ipx.a(6, 1, new ipf[0]));
        return ipx2;
    }

    private ipf cZn() {
        iur iur2 = new iur(this){
            final /* synthetic */ jda mSG;
            {
                this.mSG = jda2;
            }

            public void cLq() {
                this.mSG.close();
                this.mSG.b(jda.a(this.mSG));
            }
        };
        return iur2;
    }

    private ipf dya() {
        ivc ivc2 = new ivc(this){
            final /* synthetic */ jda mSG;
            {
                this.mSG = jda2;
            }

            public void cLq() {
                this.mSG.close();
            }
        };
        return ivc2;
    }

    static /* synthetic */ jcb a(jda jda2) {
        return jda2.mSE;
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class iio
extends ipx {
    private ijf mbt;
    private ipb lCl;
    private ipb mbu;
    private ist mbv;
    private ipb mbw;
    private ipb mbx;
    private hvr lgb;
    private iok mby;

    public iio(boolean bl) {
        this.a(irl.dnr());
        this.lCl = new ipb();
        this.W(this.lCl);
        ipf[] ipfArray = new ipf[2];
        ipfArray[0] = ipx.c(new ipf[0]);
        ipf[] ipfArray2 = new ipf[2];
        ipfArray2[0] = ipx.c(new ipf[0]);
        ipf[] ipfArray3 = new ipf[1];
        ipf[] ipfArray4 = new ipf[1];
        this.mbv = new ist(isf.mwO, 12, 12357465);
        ipfArray4[0] = this.mbv;
        ipfArray3[0] = ipx.d(ipfArray4);
        ipfArray2[1] = ipx.a(20, 20, ipfArray3);
        ipfArray[1] = ipx.l(ipfArray2);
        this.W(ipx.j(ipfArray));
        this.mbw = new ipb();
        this.W(this.mbw);
        ipf[] ipfArray5 = new ipf[2];
        ipfArray5[0] = ipx.c(new ipf[0]);
        ipf[] ipfArray6 = new ipf[2];
        ipfArray6[0] = ipx.c(new ipf[0]);
        this.mbx = new ipb();
        ipfArray6[1] = this.mbx;
        ipfArray5[1] = ipx.l(ipfArray6);
        this.W(ipx.j(ipfArray5));
        this.mbx.setVisible(false);
        this.mby = new iok(this, "", "", "", "", bl){
            final /* synthetic */ boolean mbz;
            final /* synthetic */ iio mbA;
            {
                this.mbA = iio2;
                this.mbz = bl;
                super(string, string2, string3, string4);
            }

            public void cLq() {
                if (this.mbz) {
                    this.mbA.cbN();
                }
            }
        };
        this.W(this.mby);
        this.mby.rF(bl);
        this.a(ijf.mcM);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.cKH();
    }

    public void cKG() {
        this.cKH();
        this.mbx.setVisible(true);
        this.lgb = new hvl(this, 1.0f, 0.0f, 0.5){
            final /* synthetic */ iio mbA;
            {
                this.mbA = iio2;
                super(f, f2, d2);
            }

            public void hz(float f) {
                iio.a(this.mbA).hz(f);
            }
        };
        hso.cxK().cxP().czy().a(this.lgb);
    }

    public void cKH() {
        if (this.lgb == null) {
            return;
        }
        hso.cxK().cxP().czy().b(this.lgb);
        this.lgb = null;
        this.mbx.setVisible(false);
    }

    public void a(ijf ijf2) {
        this.mbt = ijf2;
        String string = "";
        String string2 = "";
        String string3 = "";
        String string4 = "";
        int n = 0;
        switch (ijf2) {
            case mcL: {
                string = "ap_small_background.png";
                n = 11;
                string3 = "ap_small_gold_lines.png";
                string4 = "ap_entry_counter_small_glow.png";
                break;
            }
            case mcM: {
                string = "ap_normal_background.png";
                n = 12;
                string3 = "ap_normal_gold_lines.png";
                string4 = "ap_entry_counter_normal_glow.png";
                break;
            }
            case mcN: {
                string = "ap_large_background.png";
                string2 = "ap_main_large_normal.png";
                n = 13;
                string3 = "ap_large_gold_lines.png";
                string4 = "ap_entry_counter_large_glow.png";
            }
        }
        this.lCl.qP("/dfdata/texture/gui/j2f/advisory/advisory_prompt/backgrounds/" + string);
        this.mbw.qP("/dfdata/texture/gui/j2f/advisory/advisory_prompt/backgrounds/" + string3);
        this.mbv.zY(n);
        this.mbx.qP("/dfdata/texture/gui/j2f/advisory/advisory_prompt/glows/" + string4);
        this.dad();
    }

    public void kI(float f) {
        this.lCl.hz(f);
    }

    public void JR(int n) {
        this.mbv.setText("" + n);
    }

    public void cbN() {
    }

    @Override
    public hyn dd(int n, int n2) {
        return iae.oJ(lvo.sXZ.bD(hso.cxK().cxP().cyJ().cJp().aNs().size()).exA());
    }

    private void dad() {
        String string = "";
        String string2 = "";
        String string3 = "";
        switch (this.mbt) {
            case mcL: {
                string = "ap_main_small/ap_main_small_normal.png";
                string2 = "ap_main_small/ap_main_small_hover.png";
                string3 = "ap_main_small/ap_main_small_pushing.png";
                break;
            }
            case mcM: {
                string = "ap_main_normal/ap_main_normal_normal.png";
                string2 = "ap_main_normal/ap_main_normal_hover.png";
                string3 = "ap_main_normal/ap_main_normal_pushing.png";
                break;
            }
            case mcN: {
                string = "ap_main_large/ap_main_large_normal.png";
                string2 = "ap_main_large/ap_main_large_hover.png";
                string3 = "ap_main_large/ap_main_large_pushing.png";
            }
        }
        ((ipb)this.mby.dis()).qP("/dfdata/texture/gui/j2f/advisory/advisory_prompt/buttons/" + string);
        ((ipb)this.mby.dit()).qP("/dfdata/texture/gui/j2f/advisory/advisory_prompt/buttons/" + string);
        ((ipb)this.mby.diu()).qP("/dfdata/texture/gui/j2f/advisory/advisory_prompt/buttons/" + string2);
        ((ipb)this.mby.div()).qP("/dfdata/texture/gui/j2f/advisory/advisory_prompt/buttons/" + string3);
    }

    static /* synthetic */ ipb a(iio iio2) {
        return iio2.mbx;
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class iij
extends ipx {
    public static boolean mat = true;
    private iox mau = null;

    public iij() {
        this.a(irl.dnr());
        this.W(new ipb("window_control_menu_bg"));
        this.W(this.cGU());
    }

    public void cNl() {
    }

    public void cGR() {
    }

    public void cZi() {
    }

    public void cZj() {
    }

    private ipf cGU() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.a(1, 2, new ipf[0]));
        ipx2.W(this.cZk());
        ipx2.W(ipx.a(1, 2, new ipf[0]));
        ipx2.W(this.cZl());
        ipx2.W(ipx.a(1, 1, new ipf[0]));
        ipx2.W(this.cZm());
        return ipx2;
    }

    private ipf cZk() {
        this.mau = new iox(this){
            final /* synthetic */ iij mav;
            {
                this.mav = iij2;
            }

            public void pn(boolean bl) {
                if (bl) {
                    this.mav.cZi();
                } else {
                    this.mav.cZj();
                }
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lyu.tJV.bD(new Object[0]).exA());
            }
        };
        ike.mfJ.b(new jlq<iij>(this, this){
            final /* synthetic */ iij mav;
            {
                this.mav = iij2;
                super(iij3);
            }

            public void b(iij iij2) {
                iij.a(this.mav).hX(true);
            }

            public /* synthetic */ void R(Object object) {
                this.b((iij)object);
            }
        });
        ike.mfI.b(new jlq<iij>(this, this){
            final /* synthetic */ iij mav;
            {
                this.mav = iij2;
                super(iij3);
            }

            public void b(iij iij2) {
                iij.a(this.mav).hX(false);
            }

            public /* synthetic */ void R(Object object) {
                this.b((iij)object);
            }
        });
        this.a(this.mau, 41, 26, "button_options_01_off_disabled", "button_options_01_on_disabled", "button_options_01_off_normal", "button_options_01_on_normal", "button_options_01_off_hover", "button_options_01_on_hover", "button_options_01_off_pushing", "button_options_01_on_pushing");
        return this.mau;
    }

    private ipf cZl() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(7, 1, new ipf[0]));
        ipx2.W(this.cZp());
        ipx2.W(ipx.a(7, 1, new ipf[0]));
        return ipx2;
    }

    private ipf cZm() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(2, 1, new ipf[0]));
        ipx2.W(this.cZn());
        ipx2.W(ipx.a(1, 1, new ipf[0]));
        ipx2.W(this.cZo());
        return ipx2;
    }

    private ipf cZn() {
        ios ios2 = new ios(this){
            final /* synthetic */ iij mav;
            {
                this.mav = iij2;
            }

            public void cLq() {
                this.mav.cNl();
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lyu.tJW.bD(new Object[0]).exA());
            }
        };
        this.a(ios2, 20, 17, "button_tick_small_disabled", "button_tick_small_normal", "button_tick_small_hover", "button_tick_small_pushing");
        return ios2;
    }

    private ipf cZo() {
        ios ios2 = new ios(this){
            final /* synthetic */ iij mav;
            {
                this.mav = iij2;
            }

            public void cLq() {
                this.mav.cGR();
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lyu.tJX.bD(new Object[0]).exA());
            }
        };
        this.a(ios2, 20, 17, "button_main_x_small_disabled", "button_main_x_small_normal", "button_main_x_small_hover", "button_main_x_small_pushing");
        return ios2;
    }

    private ipf cZp() {
        iox iox2 = new iox(this){
            final /* synthetic */ iij mav;
            {
                this.mav = iij2;
            }

            public void pn(boolean bl) {
                mat = !mat;
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lyu.tJY.bD(new Object[0]).exA());
            }
        };
        iox2.hX(mat);
        this.a(iox2, 31, 18, "button_snap_off_disabled", "button_snap_on_disabled", "button_snap_off_normal", "button_snap_on_normal", "button_snap_off_hover", "button_snap_on_hover", "button_snap_off_pushing", "button_snap_on_pushing");
        return iox2;
    }

    private void a(ios ios2, int n, int n2, String string, String string2, String string3, String string4) {
        ios2.W(ipx.a(n, n2, new ipf[0]));
        ios2.t(ipx.d(new ipb(string)));
        ios2.u(ipx.d(new ipb(string2)));
        ios2.v(ipx.d(new ipb(string3)));
        ios2.w(ipx.d(new ipb(string4)));
    }

    private void a(iox iox2, int n, int n2, String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        iox2.W(ipx.a(n, n2, new ipf[0]));
        iox2.F(ipx.d(new ipb(string)));
        iox2.J(ipx.d(new ipb(string2)));
        iox2.G(ipx.d(new ipb(string3)));
        iox2.K(ipx.d(new ipb(string4)));
        iox2.H(ipx.d(new ipb(string5)));
        iox2.L(ipx.d(new ipb(string6)));
        iox2.I(ipx.d(new ipb(string7)));
        iox2.M(ipx.d(new ipb(string8)));
    }

    static /* synthetic */ iox a(iij iij2) {
        return iij2.mau;
    }
}


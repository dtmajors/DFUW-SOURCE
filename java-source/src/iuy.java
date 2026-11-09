/*
 * Decompiled with CFR.
 */
public class iuy
extends iox {
    private static iqz mdv = new iqz(){

        public void e(ipf ipf2) {
            ipf2.setSize(21, 20);
        }

        public void i(ipf ipf2) {
            iuy iuy2 = (iuy)ipf2;
            for (int i = 0; i < iuy2.bfn(); ++i) {
                ipf ipf3 = iuy2.RO(i);
                ipf3.ek(0, -7);
            }
        }
    };

    public iuy(boolean bl) {
        this.a(mdv);
        this.F(new ipb("/dfdata/texture/gui/j2f/common/buttons/checkbox/button_checkbox_off_disabled.png"));
        this.G(new ipb("/dfdata/texture/gui/j2f/common/buttons/checkbox/button_checkbox_off_normal.png"));
        this.H(new ipb("/dfdata/texture/gui/j2f/common/buttons/checkbox/button_checkbox_off_hover.png"));
        this.I(new ipb("/dfdata/texture/gui/j2f/common/buttons/checkbox/button_checkbox_off_pushing.png"));
        this.J(new ipb("/dfdata/texture/gui/j2f/common/buttons/checkbox/button_checkbox_on_disabled.png"));
        this.K(new ipb("/dfdata/texture/gui/j2f/common/buttons/checkbox/button_checkbox_on_normal.png"));
        this.L(new ipb("/dfdata/texture/gui/j2f/common/buttons/checkbox/button_checkbox_on_hover.png"));
        this.M(new ipb("/dfdata/texture/gui/j2f/common/buttons/checkbox/button_checkbox_on_pushing.png"));
        this.setActive(true);
        this.hX(bl);
    }

    public iuy() {
        this(false);
    }
}


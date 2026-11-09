/*
 * Decompiled with CFR.
 */
public class ixl
extends irx {
    private ipm mBf;

    public ixl(int n, int n2, ire ire2) {
        this.mBf = new ipm(n, n2, ire2);
        this.W(this.mBf);
        ios ios2 = new ios();
        ios2.t(ipx.h(new iqa("/dfdata/texture/gui/j2f/chat/color_selection/color_selection_shadow_disabled.png", 5, 5, 5, 5), new ipt(0x898989)));
        ios2.u(ipx.h(new iqa("/dfdata/texture/gui/j2f/chat/color_selection/color_selection_shadow_normal.png", 5, 5, 5, 5), new ipt(0x898989)));
        ios2.v(ipx.h(new iqa("/dfdata/texture/gui/j2f/chat/color_selection/color_selection_shadow_hover.png", 5, 5, 5, 5), new ipt(0xC0C0C0)));
        ios2.w(ipx.h(new iqa("/dfdata/texture/gui/j2f/chat/color_selection/color_selection_shadow_pushing.png", 5, 5, 5, 5), new ipt(0xC0C0C0)));
        this.W(ios2);
    }

    public ire dlY() {
        return this.mBf.dlY();
    }

    public void b(ire ire2) {
        this.mBf.b(ire2);
    }
}


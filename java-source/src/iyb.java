/*
 * Decompiled with CFR.
 */
public class iyb
extends ios {
    public iyb() {
        this.t(new iop(new ipk(0x232323), new ipb("/dfdata/texture/gui/j2f/chat/button_tab_options/button_tab_options_disabled.png")));
        this.u(new iop(new ipk(0x232323), new ipb("/dfdata/texture/gui/j2f/chat/button_tab_options/button_tab_options_normal.png")));
        this.v(new iop(new ipk(0x232323), new ipb("/dfdata/texture/gui/j2f/chat/button_tab_options/button_tab_options_hover.png")));
        this.w(new iop(new ipk(0x232323), new ipb("/dfdata/texture/gui/j2f/chat/button_tab_options/button_tab_options_pushing.png")));
        this.setActive(true);
    }

    @Override
    public void kh(float f2) {
        for (int i = 0; i < this.bfn(); ++i) {
            iop iop2;
            ipf ipf2 = this.RO(i);
            if (!(ipf2 instanceof iop) || (iop2 = (iop)ipf2).dip() == null) continue;
            iop2.dip().hz(f2);
        }
    }
}


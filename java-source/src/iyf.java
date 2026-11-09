/*
 * Decompiled with CFR.
 */
public class iyf
extends iyc {
    public iyf() {
        this.t(new iop(new ipk(0x151515), new ipb("/dfdata/texture/gui/j2f/common/buttons/button_plus/button_plus_disabled.png")));
        this.u(new iop(new ipk(0x151515), new ipb("/dfdata/texture/gui/j2f/common/buttons/button_plus/button_plus_normal.png")));
        this.v(new iop(new ipk(0x202020), new ipb("/dfdata/texture/gui/j2f/common/buttons/button_plus/button_plus_hover.png")));
        this.w(new iop(new ipk(0x202020), new ipb("/dfdata/texture/gui/j2f/common/buttons/button_plus/button_plus_pushing.png")));
        this.setActive(true);
    }

    @Override
    public void kh(float f2) {
        ((iop)this.dis()).dip().hz(f2);
        ((iop)this.dit()).dip().hz(f2);
        ((iop)this.diu()).dip().hz(f2);
        ((iop)this.div()).dip().hz(f2);
    }
}


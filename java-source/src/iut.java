/*
 * Decompiled with CFR.
 */
public class iut
extends iox {
    public iut(int n) {
        if (n >= 0) {
            this.W(new ipk(n));
        }
        this.F(ipx.d(new ipb("button_arrow_off_disabled")));
        this.G(ipx.d(new ipb("button_arrow_off_normal")));
        this.H(ipx.d(new ipb("button_arrow_off_hover")));
        this.I(ipx.d(new ipb("button_arrow_off_pushing")));
        this.J(ipx.d(new ipb("button_arrow_on_disabled")));
        this.K(ipx.d(new ipb("button_arrow_on_normal")));
        this.L(ipx.d(new ipb("button_arrow_on_hover")));
        this.M(ipx.d(new ipb("button_arrow_on_pushing")));
    }

    public iut() {
        this(-1);
    }
}


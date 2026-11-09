/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class ikb
extends iot<ikc> {
    private ikc mfi = null;

    public ikb(iou<ikc> iou2, ikc ikc2, boolean bl) {
        super(iou2, ikc2);
        if (bl) {
            this.W(new ipk(0x181818, 53, 38));
        }
        this.F(ipx.d(new ipb(ikc2.dbY() + "_off_disabled", 38, 38)));
        this.G(ipx.d(new ipb(ikc2.dbY() + "_off_normal", 38, 38)));
        this.H(ipx.d(new ipb(ikc2.dbY() + "_off_hover", 38, 38)));
        this.I(ipx.d(new ipb(ikc2.dbY() + "_off_pushing", 38, 38)));
        this.J(ipx.d(new ipb(ikc2.dbY() + "_on_disabled", 38, 38)));
        this.K(ipx.d(new ipb(ikc2.dbY() + "_on_normal", 38, 38)));
        this.L(ipx.d(new ipb(ikc2.dbY() + "_on_hover", 38, 38)));
        this.M(ipx.d(new ipb(ikc2.dbY() + "_on_pushing", 38, 38)));
        this.mfi = ikc2;
    }

    @Override
    public hyn dd(int n, int n2) {
        String string = this.mfi == null ? "" : this.mfi.getToolTipText();
        return string == null || string.isEmpty() ? super.dd(n, n2) : iae.oJ(string);
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class ikg
extends iot<ijf> {
    private ijf mfV = null;

    public ikg(iou<ijf> iou2, ijf ijf2) {
        super(iou2, ijf2);
        String string = null;
        switch (ijf2) {
            case mcL: {
                string = "Small";
                break;
            }
            case mcM: {
                string = "Medium";
                break;
            }
            case mcN: {
                string = "Large";
            }
        }
        this.F(new ipb("ButtonFont" + string + "BitmapOffDisabled"));
        this.G(new ipb("ButtonFont" + string + "BitmapOffNormal"));
        this.H(new ipb("ButtonFont" + string + "BitmapOffHover"));
        this.I(new ipb("ButtonFont" + string + "BitmapOffPushing"));
        this.J(new ipb("ButtonFont" + string + "BitmapOnDisabled"));
        this.K(new ipb("ButtonFont" + string + "BitmapOnNormal"));
        this.L(new ipb("ButtonFont" + string + "BitmapOnHover"));
        this.M(new ipb("ButtonFont" + string + "BitmapOnPushing"));
        this.mfV = ijf2;
    }

    @Override
    public hyn dd(int n, int n2) {
        String string = this.mfV == null ? "" : this.mfV.getToolTipText();
        return string == null || string.isEmpty() ? super.dd(n, n2) : iae.oJ(string);
    }
}


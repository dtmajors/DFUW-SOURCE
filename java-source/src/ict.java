/*
 * Decompiled with CFR.
 */
public class ict
extends iot<ics> {
    public ict(iou<ics> iou2, ics ics2) {
        super(iou2, ics2);
        String string = null;
        switch (ics2) {
            case lHD: {
                string = "Small";
                break;
            }
            case lHE: {
                string = "Medium";
                break;
            }
            case lHF: {
                string = "Large";
            }
        }
        this.F(new ipb(this.g(string, "off", "disabled")));
        this.G(new ipb(this.g(string, "off", "normal")));
        this.H(new ipb(this.g(string, "off", "hover")));
        this.I(new ipb(this.g(string, "off", "pushing")));
        this.J(new ipb(this.g(string, "on", "disabled")));
        this.K(new ipb(this.g(string, "on", "normal")));
        this.L(new ipb(this.g(string, "on", "hover")));
        this.M(new ipb(this.g(string, "on", "pushing")));
    }

    private String g(String string, String string2, String string3) {
        return "/dfdata/texture/gui/j2f/chat/button_font_" + string + "/button_font_" + string + "_" + string2 + "_" + string3 + ".png";
    }
}


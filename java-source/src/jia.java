/*
 * Decompiled with CFR.
 */
public enum jia {
    ngn(lyy.tMe),
    ngo(lyy.tMg),
    ngp(lyy.tMf);

    public final lox nfT;

    private jia(lox lox2) {
        this.nfT = lox2;
    }

    public String cCU() {
        String string = "";
        switch (this) {
            case ngn: {
                string = "/dfdata/texture/gui/j2f/gearguise/button_attribute_unattained/button_attribute_unattained_off_normal.png";
                break;
            }
            case ngo: {
                string = "/dfdata/texture/gui/j2f/gearguise/button_attribute_inactive/button_attribute_inactive_off_normal.png";
                break;
            }
            case ngp: {
                string = "/dfdata/texture/gui/j2f/gearguise/button_attribute_active/button_attribute_active_off_normal.png";
            }
        }
        return string;
    }
}


/*
 * Decompiled with CFR.
 */
public class ivc
extends iok {
    public ivc() {
        super("/dfdata/texture/gui/j2f/common/buttons/x/buttons_main_x_disabled.png", "/dfdata/texture/gui/j2f/common/buttons/x/buttons_main_x_normal.png", "/dfdata/texture/gui/j2f/common/buttons/x/buttons_main_x_hover.png", "/dfdata/texture/gui/j2f/common/buttons/x/buttons_main_x_pushing.png");
    }

    @Override
    public boolean qD(String string) {
        if (super.qD(string)) {
            return true;
        }
        if (this.djE() instanceof inz && (string.equals("N") || string.equals("ESCAPE"))) {
            this.cLq();
            return true;
        }
        return false;
    }
}


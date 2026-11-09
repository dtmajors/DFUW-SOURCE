/*
 * Decompiled with CFR.
 */
public class iur
extends iok {
    public iur() {
        super("/dfdata/texture/gui/j2f/common/buttons/tick/button_tick_disabled.png", "/dfdata/texture/gui/j2f/common/buttons/tick/button_tick_normal.png", "/dfdata/texture/gui/j2f/common/buttons/tick/button_tick_hover.png", "/dfdata/texture/gui/j2f/common/buttons/tick/button_tick_pushing.png");
    }

    @Override
    public boolean qD(String string) {
        if (super.qD(string)) {
            return true;
        }
        if (string.equals("Y") || string.equals("RETURN") || string.equals("ENTER")) {
            this.cLq();
            return true;
        }
        return false;
    }
}


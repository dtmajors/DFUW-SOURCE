/*
 * Decompiled with CFR.
 */
public class izv
extends iok {
    public izv() {
        this((ire)null);
    }

    public izv(ire ire2) {
        super("/dfdata/texture/gui/j2f/common/resize_handles/" + izv.c(ire2) + "/" + izv.a(ire2, "disabled"), "/dfdata/texture/gui/j2f/common/resize_handles/" + izv.c(ire2) + "/" + izv.a(ire2, "normal"), "/dfdata/texture/gui/j2f/common/resize_handles/" + izv.c(ire2) + "/" + izv.a(ire2, "hover"), "/dfdata/texture/gui/j2f/common/resize_handles/" + izv.c(ire2) + "/" + izv.a(ire2, "pushing"));
    }

    private static String c(ire ire2) {
        if (ire2 == ire.mul) {
            return "resize_handle_height";
        }
        if (ire2 == ire.muk) {
            return "resize_handle_width";
        }
        return "resize_handle_height_width";
    }

    private static String a(ire ire2, String string) {
        String string2 = ire2 == ire.mul ? "resize_handle_height" : (ire2 == ire.muk ? "resize_handle_width" : "resize_handle_height_width");
        return string2 + "_" + string + ".png";
    }
}


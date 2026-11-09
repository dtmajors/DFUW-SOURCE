/*
 * Decompiled with CFR.
 */
import java.util.List;

public class chj
extends che {
    public String ezY = null;
    public boolean abr = false;

    public chj() {
        this.ezL = cgi.EXPLORATION;
    }

    public boolean l(String string, boolean bl) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        if (this.ezY != null) {
            if (this.ezY.equalsIgnoreCase(string)) {
                return this.abr == bl;
            }
            List<String> list = lea.ept().get(this.ezY);
            if (list == null) {
                return false;
            }
            if (!list.contains(string.toUpperCase())) {
                return false;
            }
        }
        return this.abr == bl;
    }
}


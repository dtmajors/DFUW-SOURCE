/*
 * Decompiled with CFR.
 */
import java.util.List;

public class chk
extends che {
    public List<String> ezZ;

    public chk() {
        this.ezL = cgi.FEAT;
    }

    public boolean hp(String string) {
        if (this.ezZ == null || this.ezZ.isEmpty()) {
            return true;
        }
        return this.ezZ.contains(string);
    }
}


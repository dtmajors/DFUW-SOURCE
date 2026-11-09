/*
 * Decompiled with CFR.
 */
import java.util.List;

public class ow {
    public String aGn;
    public int aGm;

    public ow() {
    }

    public ow(String string, int n) {
        this.aGn = string;
        this.aGm = n;
    }

    public String fk() {
        return pr.b(':', this.aGn, this.aGm);
    }

    public static ow bX(String string) {
        List<String> list = pr.a(':', string);
        if (list.size() != 2) {
            lfn.b(5, "SFStorablePairStringInt", "fromDBString: Couldn't parse '" + string + "'");
            return null;
        }
        ow ow2 = new ow();
        ow2.aGn = list.get(0);
        try {
            ow2.aGm = Integer.parseInt(list.get(1));
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFStorablePairStringInt", "fromDBString: Couldn't parse '" + string + "'");
            return null;
        }
        return ow2;
    }
}


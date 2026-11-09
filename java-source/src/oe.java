/*
 * Decompiled with CFR.
 */
import java.util.List;

public class oe {
    private int SN;
    private long aFq;

    public oe(int n2, long l) {
        this.SN = n2;
        this.aFq = l;
    }

    public final String fk() {
        return pr.b(':', String.valueOf(this.SN), String.valueOf(this.aFq));
    }

    public static oe bN(String string) {
        List<String> list = pr.a(':', string);
        if (list == null || list.size() != 2) {
            lfn.b(5, "SFStorableObjectApprentice", "fromDBString: Can't parse '" + string + "'");
            return null;
        }
        try {
            int n2 = Integer.parseInt(list.get(0));
            long l = Long.valueOf(list.get(1));
            return new oe(n2, l);
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFStorableObjectApprentice", "fromDBString: Can't parse '" + list.get(0) + " : " + list.get(1));
            return null;
        }
    }

    public final int qe() {
        return this.SN;
    }

    public final long getTime() {
        return this.aFq;
    }
}


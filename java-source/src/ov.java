/*
 * Decompiled with CFR.
 */
import java.util.List;

public class ov {
    public String aGn;
    public double aGq;

    public ov() {
    }

    public ov(String string, double d2) {
        this.aGn = string;
        this.aGq = d2;
    }

    public String fk() {
        return pr.b(':', this.aGn, this.aGq);
    }

    public static ov bW(String string) {
        List<String> list = pr.a(':', string);
        if (list.size() != 2) {
            lfn.b(5, "SFStorablePairStringDouble", "fromDBString: Couldn't parse '" + string + "'");
            return null;
        }
        ov ov2 = new ov();
        ov2.aGn = list.get(0);
        try {
            ov2.aGq = Double.parseDouble(list.get(1));
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFStorablePairStringDouble", "fromDBString: Couldn't parse '" + string + "'");
            return null;
        }
        return ov2;
    }
}


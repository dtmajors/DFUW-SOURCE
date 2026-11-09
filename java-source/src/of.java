/*
 * Decompiled with CFR.
 */
import java.util.List;

public class of {
    private int SN;
    private long awp;
    private long awv;

    public of(int n2, long l, long l2) {
        this.SN = n2;
        this.awp = l;
        this.awv = l2;
    }

    public final String fk() {
        return pr.b(':', String.valueOf(this.SN), String.valueOf(this.awp), String.valueOf(this.awv));
    }

    public static of bO(String string) {
        List<String> list = pr.a(':', string);
        if (list == null || list.size() != 3) {
            lfn.b(5, "SFStorableObjectApprentice", "fromDBString: Can't parse '" + string + "'");
            return null;
        }
        try {
            int n2 = Integer.parseInt(list.get(0));
            long l = Long.valueOf(list.get(1));
            long l2 = Long.valueOf(list.get(2));
            return new of(n2, l, l2);
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFStorableObjectApprentice", "fromDBString: Can't parse '" + list.get(0) + " : " + list.get(1) + " : " + list.get(2));
            return null;
        }
    }

    public final int qe() {
        return this.SN;
    }

    public final long pM() {
        return this.awp;
    }

    public final long qc() {
        return this.awv;
    }
}


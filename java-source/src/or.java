/*
 * Decompiled with CFR.
 */
public class or {
    public ldv GUID;
    public double aGl;

    public or() {
    }

    public or(ldv ldv2, double d2) {
        this.GUID = ldv2;
        this.aGl = d2;
    }

    public String fk() {
        return this.GUID.fk() + ":" + this.aGl;
    }

    public static or bS(String string) {
        int n2 = string.indexOf(58);
        if (n2 < 0) {
            return null;
        }
        or or2 = new or();
        or2.GUID = ldv.zp(string.substring(0, n2));
        if (or2.GUID == null) {
            lfn.b(5, "SFStorablePairGUIDDouble", "fromDBString: Couldn't parse '" + string + "'");
            return null;
        }
        try {
            or2.aGl = Double.parseDouble(string.substring(n2 + 1));
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        return or2;
    }
}


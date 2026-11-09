/*
 * Decompiled with CFR.
 */
public class os {
    public ldv GUID;
    public int aGm;

    public os() {
    }

    public os(ldv ldv2, int n) {
        this.GUID = ldv2;
        this.aGm = n;
    }

    public String fk() {
        return this.GUID.fk() + ":" + this.aGm;
    }

    public static os bT(String string) {
        int n = string.indexOf(58);
        if (n < 0) {
            return null;
        }
        os os2 = new os();
        os2.GUID = ldv.zp(string.substring(0, n));
        if (os2.GUID == null) {
            lfn.b(5, "SFStorablePairGUIDInt", "fromDBString: Couldn't parse '" + string + "'");
            return null;
        }
        try {
            os2.aGm = Integer.parseInt(string.substring(n + 1));
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        return os2;
    }
}


/*
 * Decompiled with CFR.
 */
public class op {
    public int aGg;
    public boolean aFw;

    public String fk() {
        return this.aGg + ":" + (this.aFw ? 1 : 0);
    }

    public static op bQ(String string) {
        int n2 = string.indexOf(58);
        if (n2 < 0) {
            lfn.b(5, "SFPlayerBoosterStorableData", "fromDBString: Can't parse '" + string + "'");
            return null;
        }
        op op2 = new op();
        try {
            op2.aGg = Integer.parseInt(string.substring(0, n2));
            op2.aFw = Integer.parseInt(string.substring(n2 + 1)) == 1;
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFPlayerBoosterStorableData", "fromDBString: Can't parse '" + string + "'");
            return null;
        }
        return op2;
    }
}


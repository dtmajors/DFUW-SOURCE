/*
 * Decompiled with CFR.
 */
public enum abb {
    bdn,
    bdo,
    bdp,
    bdq,
    bdr;


    public static abb ParseRewardType(String string) {
        if (string == null) {
            return bdn;
        }
        for (abb abb2 : abb.values()) {
            if (abb2.name().compareToIgnoreCase(string) != 0) continue;
            return abb2;
        }
        return bdn;
    }
}


/*
 * Decompiled with CFR.
 */
public enum abc {
    bdt,
    bdu,
    bdv,
    bdw;


    public static abc parse(String string) {
        String string2 = string.replace("_", "").toLowerCase();
        for (abc abc2 : abc.values()) {
            if (!abc2.toString().toLowerCase().equals(string2)) continue;
            return abc2;
        }
        return bdt;
    }
}


/*
 * Decompiled with CFR.
 */
public enum chy {
    eAl,
    eAm,
    eAn,
    eAo;


    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < chy.values().length;
    }

    public static chy getValueByOrdinal(int n) {
        return chy.isValidOrdinal(n) ? chy.values()[n] : null;
    }

    public static chy getValueByName(String string) {
        String string2 = string.replace(" ", "");
        for (chy chy2 : chy.values()) {
            if (string2.compareToIgnoreCase(chy2.name()) != 0) continue;
            return chy2;
        }
        return eAl;
    }
}


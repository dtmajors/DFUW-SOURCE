/*
 * Decompiled with CFR.
 */
public enum cic {
    eAO,
    eAP,
    eAQ,
    eAR,
    eAS,
    eAT;

    private static final cic[] eAU;

    public static final int getValueCount() {
        return eAU.length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < cic.getValueCount();
    }

    public static final cic getValueByOrdinal(int n) {
        if (cic.isValidOrdinal(n)) {
            return eAU[n];
        }
        return eAO;
    }

    public static final cic getValueByName(String string) {
        for (cic cic2 : eAU) {
            if (!cic2.name().equalsIgnoreCase(string)) continue;
            return cic2;
        }
        return null;
    }

    static {
        eAU = (cic[])cic.class.getEnumConstants();
    }
}


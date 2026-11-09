/*
 * Decompiled with CFR.
 */
public enum cib {
    eAw,
    eAx,
    eAy,
    eAz,
    eAA,
    eAB,
    eAC,
    eAD,
    eAE,
    eAF,
    eAG,
    eAH,
    eAI,
    eAJ,
    eAK,
    eAL;

    private static final cib[] eAM;

    public static final int getValueCount() {
        return eAM.length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < cib.getValueCount();
    }

    public static final cib getValueByOrdinal(int n) {
        if (cib.isValidOrdinal(n)) {
            return eAM[n];
        }
        return null;
    }

    public static final cib getValueByName(String string) {
        for (cib cib2 : eAM) {
            if (!cib2.name().equalsIgnoreCase(string)) continue;
            return cib2;
        }
        return null;
    }

    static {
        eAM = (cib[])cib.class.getEnumConstants();
    }
}


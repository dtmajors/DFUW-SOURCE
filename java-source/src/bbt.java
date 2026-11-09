/*
 * Decompiled with CFR.
 */
public enum bbt {
    cRL,
    cRM,
    cRN,
    cRO,
    cRP,
    cRQ,
    cRR,
    cRS,
    cRT;

    public static bbt[] cRU;

    public static final int getValueCount() {
        return cRU.length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < bbt.getValueCount();
    }

    public static final bbt getValueByOrdinal(int n) {
        return cRU[n];
    }

    public String getName() {
        switch (this) {
            case cRM: {
                return "Kick";
            }
            case cRN: {
                return "Ban";
            }
            case cRO: {
                return "Leave";
            }
            case cRP: {
                return "Join";
            }
            case cRQ: {
                return "Unban";
            }
            case cRR: {
                return "Application Rejected";
            }
        }
        return "Unknown Operation";
    }

    static {
        cRU = (bbt[])bbt.class.getEnumConstants();
    }
}


/*
 * Decompiled with CFR.
 */
public enum cgh {
    exn,
    exo,
    exp,
    exq,
    exr,
    exs,
    ext,
    exu,
    exv,
    exw,
    exx,
    exy,
    exz,
    exA,
    exB,
    exC,
    exD,
    exE,
    exF,
    exG,
    exH,
    exI,
    exJ,
    exK,
    exL,
    exM,
    exN,
    exO,
    exP,
    exQ,
    exR,
    exS,
    exT,
    exU,
    exV;

    private static final cgh[] exW;

    public static final int getValueCount() {
        return exW.length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < cgh.getValueCount();
    }

    public static cgh getTagByName(String string) {
        for (cgh cgh2 : exW) {
            if (!cgh2.name().equalsIgnoreCase(string)) continue;
            return cgh2;
        }
        return null;
    }

    static {
        exW = (cgh[])cgh.class.getEnumConstants();
    }
}


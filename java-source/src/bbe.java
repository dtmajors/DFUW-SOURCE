/*
 * Decompiled with CFR.
 */
public enum bbe {
    cPT,
    cPU,
    cPV,
    cPW,
    cPX,
    cPY,
    cPZ,
    cQa,
    cQb,
    cQc,
    cQd,
    cQe;


    public bbe ajC() {
        switch (this) {
            case cPU: {
                return cPZ;
            }
            case cPV: {
                return cPY;
            }
            case cPZ: {
                return cPY;
            }
            case cPY: {
                return cPZ;
            }
        }
        return this;
    }

    public static bbe getValueByOrdinal(int n) {
        return n < 0 || n >= bbe.values().length ? cPT : bbe.values()[n];
    }
}


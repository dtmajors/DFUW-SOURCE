/*
 * Decompiled with CFR.
 */
public enum bdh {
    cZS,
    cZT,
    cZU,
    cZV,
    cZW,
    cZX,
    cZY,
    cZZ,
    daa,
    dab,
    dac;


    public int alS() {
        switch (this) {
            default: {
                return 0;
            }
            case cZU: {
                return 1;
            }
            case cZV: 
            case cZW: {
                return 2;
            }
            case cZX: {
                return 3;
            }
            case cZY: 
            case cZZ: 
            case daa: 
            case dab: 
            case dac: 
        }
        return 5;
    }

    public static bdh getValueByOldDatabaseObjectType(int n) {
        for (bdh bdh2 : bdh.values()) {
            if (bdh2.alS() != n) continue;
            return bdh2;
        }
        return cZS;
    }

    public static bdh getValueByOrdinal(int n) {
        return n < 0 || n >= bdh.values().length ? cZS : bdh.values()[n];
    }
}


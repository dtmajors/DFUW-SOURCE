/*
 * Decompiled with CFR.
 */
public enum bdg {
    cZK,
    cZL,
    cZM,
    cZN,
    cZO,
    cZP;


    public bdg alR() {
        switch (this) {
            case cZK: {
                return cZL;
            }
            case cZL: {
                return cZK;
            }
            case cZM: {
                return cZN;
            }
            case cZN: {
                return cZM;
            }
            case cZO: {
                return cZP;
            }
            case cZP: {
                return cZO;
            }
        }
        return this;
    }

    public boolean a(bdg bdg2) {
        return bdg2 == this || bdg2 == this.alR();
    }

    public static bdg getDefaultSortOrder() {
        return cZL;
    }

    public static bdg getValueByOrdinal(int n) {
        return n < 0 || n >= bdg.values().length ? bdg.getDefaultSortOrder() : bdg.values()[n];
    }
}


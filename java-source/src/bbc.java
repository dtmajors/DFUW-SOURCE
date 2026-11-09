/*
 * Decompiled with CFR.
 */
public enum bbc {
    cPO,
    cPP,
    cPQ;


    public int getArrayIndex() {
        switch (this) {
            case cPP: {
                return 0;
            }
            case cPQ: {
                return 1;
            }
        }
        return -1;
    }

    public bbc ajz() {
        switch (this) {
            case cPP: {
                return cPQ;
            }
            case cPQ: {
                return cPP;
            }
        }
        return null;
    }

    public static bbc getValueByOrdinal(int n) {
        return n < 0 || n >= bbc.values().length ? cPO : bbc.values()[n];
    }
}


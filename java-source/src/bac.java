/*
 * Decompiled with CFR.
 */
public enum bac {
    cIS,
    cIT,
    cIU,
    cIV,
    cIW;


    public boolean afT() {
        switch (this) {
            case cIT: 
            case cIV: {
                return true;
            }
        }
        return false;
    }

    public boolean afU() {
        switch (this) {
            case cIU: 
            case cIW: {
                return true;
            }
        }
        return false;
    }

    public boolean afV() {
        switch (this) {
            case cIV: 
            case cIW: {
                return true;
            }
        }
        return false;
    }

    public bac afW() {
        switch (this) {
            case cIT: {
                return cIV;
            }
            case cIU: {
                return cIW;
            }
        }
        return this;
    }

    public static bac getValueByOrdinal(int n) {
        return n < 0 || n >= bac.values().length ? cIS : bac.values()[n];
    }
}


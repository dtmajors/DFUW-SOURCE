/*
 * Decompiled with CFR.
 */
public enum bab {
    cIN,
    cIO,
    cIP,
    cIQ;


    public boolean afQ() {
        return this.ordinal() > cIN.ordinal() && this.ordinal() < cIQ.ordinal();
    }

    public static bab getPhaseFromOrdinal(int n) {
        if (n < 0 || n > cIQ.ordinal()) {
            return cIN;
        }
        bab[] babArray = (bab[])bab.class.getEnumConstants();
        return babArray[n];
    }

    public static bab getPhaseByName(String string) {
        if (string == null || string.isEmpty()) {
            return null;
        }
        for (bab bab2 : bab.values()) {
            if (bab2.name().compareToIgnoreCase(string) != 0) continue;
            return bab2;
        }
        return null;
    }

    public double length() {
        switch (this) {
            case cIO: {
                return bad.afY();
            }
            case cIP: {
                return bad.afZ();
            }
        }
        return -1.0;
    }

    public boolean c(boolean bl, double d2) {
        switch (this) {
            case cIO: {
                if (d2 <= bad.agk()) {
                    return bad.ahg();
                }
                return bad.agY().cC(bl);
            }
            case cIP: {
                if (!bad.aga()) {
                    return false;
                }
                return bad.agY().cC(bl);
            }
            case cIQ: {
                return false;
            }
        }
        return bad.agY().cC(bl);
    }

    public boolean d(boolean bl, double d2) {
        switch (this) {
            case cIO: {
                return d2 >= bad.agk();
            }
            case cIP: {
                return bad.agb() | bad.agY().cB(bl);
            }
        }
        return false;
    }

    public boolean afR() {
        switch (this) {
            case cIO: {
                return bad.agc();
            }
            case cIP: {
                return bad.agd();
            }
        }
        return true;
    }

    public boolean afS() {
        switch (this) {
            case cIO: {
                return bad.age();
            }
            case cIP: {
                return bad.agf();
            }
        }
        return true;
    }
}


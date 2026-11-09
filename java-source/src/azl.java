/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public enum azl {
    cEK(maj.uaZ),
    cEL(maj.ubl),
    cEM(maj.ubm),
    cEN(maj.ubn),
    cEO(maj.uba),
    cEP(maj.ubb);

    private lox DisplayName = null;

    public boolean adn() {
        switch (this) {
            case cEP: {
                return true;
            }
        }
        return false;
    }

    public String cu() {
        return this.DisplayName == null ? null : this.DisplayName.getIdentifier();
    }

    private azl(lox lox2) {
        this.DisplayName = lox2;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.DisplayName.bD(new Object[0]).exA() : super.toString();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < azl.values().length;
    }

    public static azl getValueByOrdinal(int n) {
        return azl.isValidOrdinal(n) ? azl.values()[n] : null;
    }
}


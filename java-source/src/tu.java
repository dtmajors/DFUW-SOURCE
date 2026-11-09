/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public enum tu {
    aVn(mae.uaZ),
    aVo(mae.uba),
    aVp(mae.ubb);

    private lox DisplayName = null;

    public String cu() {
        return this.DisplayName == null ? null : this.DisplayName.getIdentifier();
    }

    private tu(lox lox2) {
        this.DisplayName = lox2;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.DisplayName.bD(new Object[0]).exA() : super.toString();
    }

    public boolean vA() {
        switch (this) {
            case aVp: {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < tu.values().length;
    }

    public static tu getValueByOrdinal(int n) {
        return tu.isValidOrdinal(n) ? tu.values()[n] : null;
    }
}


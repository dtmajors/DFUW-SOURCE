/*
 * Decompiled with CFR.
 */
public enum ijj {
    mcX("critical_indicator_01"),
    mcY("critical_indicator_02"),
    mcZ("critical_indicator_03"),
    mda("critical_indicator_04"),
    mdb("critical_indicator_05"),
    mdc("critical_indicator_06"),
    mdd("critical_indicator_07"),
    mde("critical_indicator_08"),
    mdf("critical_indicator_09");

    private String mdg = null;

    public String dbe() {
        return this.mdg;
    }

    public String Rg(int n) {
        switch (n) {
            default: {
                return null;
            }
            case 1: {
                return this.mdg + "_a";
            }
            case 2: {
                return this.mdg + "_b";
            }
            case 3: {
                return this.mdg + "_c";
            }
            case 4: 
        }
        return this.mdg + "_d";
    }

    private ijj(String string2) {
        this.mdg = string2;
    }
}


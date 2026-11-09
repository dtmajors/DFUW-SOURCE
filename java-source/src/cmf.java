/*
 * Decompiled with CFR.
 */
public enum cmf {
    eKM(15000.0, "marker_resource_monolith_tier1_protected.png", "marker_resource_monolith_tier1_vulnerable.png", "marker_resource_monolith_tier1_preparation.png"),
    eKN(45000.0, "marker_resource_monolith_tier2_protected.png", "marker_resource_monolith_tier2_vulnerable.png", "marker_resource_monolith_tier2_preparation.png"),
    eKO(1500000.0, "marker_resource_monolith_tier3_protected.png", "marker_resource_monolith_tier3_vulnerable.png", "marker_resource_monolith_tier3_preparation.png");

    private static final String eKP = "texture/gui/runtime/markers/prowessmonolith/";
    private static final cmf[] eKQ;
    private String eKR;
    private String eKS;
    private String eKT;
    private double eKU;

    private cmf(double d2, String string2, String string3, String string4) {
        this.eKU = d2;
        this.eKR = eKP + string2;
        this.eKS = eKP + string3;
        this.eKT = eKP + string4;
    }

    public double aTe() {
        return this.eKU;
    }

    public static int getTier(double d2) {
        for (cmf cmf2 : cmf.values()) {
            if (cmf2.aTe() != d2) continue;
            return cmf2.ordinal() + 1;
        }
        return 1;
    }

    public static String getIcon(int n, boolean bl, boolean bl2) {
        for (cmf cmf2 : cmf.values()) {
            if (cmf2.ordinal() != n - 1) continue;
            if (bl2) {
                return cmf2.eKT;
            }
            return bl ? cmf2.eKR : cmf2.eKS;
        }
        return null;
    }

    public static final int getValueCount() {
        return eKQ.length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < cmf.getValueCount();
    }

    public static final cmf getValueByOrdinal(int n) {
        if (cmf.isValidOrdinal(n)) {
            return eKQ[n];
        }
        return eKM;
    }

    static {
        eKQ = (cmf[])cmf.class.getEnumConstants();
    }
}


/*
 * Decompiled with CFR.
 */
public final class cio
extends Enum<cio> {
    public static final /* enum */ cio eCv = new cio();
    public static final /* enum */ cio eCw = new cio();
    public static final /* enum */ cio eCx = new cio();
    public static final /* enum */ cio eCy = new cio();
    public static final /* enum */ cio eCz = new cio();
    public static final /* enum */ cio eCA = new cio();
    public static final /* enum */ cio eCB = new cio();
    public static final /* enum */ cio eCC = new cio();
    public static final /* enum */ cio eCD = new cio();
    public static final /* enum */ cio eCE = new cio();
    public static final /* enum */ cio eCF = new cio();
    public static final /* enum */ cio eCG = new cio();
    public static final /* enum */ cio eCH = new cio();
    public static final /* enum */ cio eCI = new cio();
    public static final /* enum */ cio eCJ = new cio();
    public static final /* enum */ cio eCK = new cio();
    public static final /* enum */ cio eCL = new cio();
    public static final /* enum */ cio eCM = new cio();
    public static final /* enum */ cio eCN = new cio();
    public static final /* enum */ cio eCO = new cio();
    public static final /* enum */ cio eCP = new cio();
    private static final cio[] eCQ;
    private static final /* synthetic */ cio[] eCR;

    public static cio[] values() {
        return (cio[])eCR.clone();
    }

    public static cio valueOf(String string) {
        return Enum.valueOf(cio.class, string);
    }

    public static final int getValueCount() {
        return eCQ.length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < cio.getValueCount();
    }

    public static final cio getValueByOrdinal(int n) {
        if (cio.isValidOrdinal(n)) {
            return eCQ[n];
        }
        return null;
    }

    public static cio getValueByName(String string) {
        for (cio cio2 : eCQ) {
            if (!cio2.name().equalsIgnoreCase(string)) continue;
            return cio2;
        }
        assert (false);
        return null;
    }

    static {
        eCR = new cio[]{eCv, eCw, eCx, eCy, eCz, eCA, eCB, eCC, eCD, eCE, eCF, eCG, eCH, eCI, eCJ, eCK, eCL, eCM, eCN, eCO, eCP};
        eCQ = (cio[])cio.class.getEnumConstants();
    }
}


/*
 * Decompiled with CFR.
 */
public final class isf
extends Enum<isf> {
    public static final /* enum */ isf mwM = new isf("FranklinGothicMediumCondRegular");
    public static final /* enum */ isf mwN = new isf("FranklinGothicMediumRegular");
    public static final /* enum */ isf mwO = new isf("TrajanProRegular");
    private String dPa;
    private static final /* synthetic */ isf[] mwP;

    public static isf[] values() {
        return (isf[])mwP.clone();
    }

    public static isf valueOf(String string) {
        return Enum.valueOf(isf.class, string);
    }

    private isf(String string2) {
        this.dPa = string2;
    }

    public String getFontFamily() {
        String string = isf.getFontFamily(this.dPa);
        return string;
    }

    private static String getFontFamily(String string) {
        assert (lpd.rHs != null);
        knv knv2 = lpd.rHs.adX(lpd.rHs.exK());
        assert (knv2 != null);
        assert (knv2.pRg != null);
        assert (knv2.pRh != null);
        assert (knv2.pRh.length == knv2.pRg.length);
        for (int i = 0; i < knv2.pRg.length; ++i) {
            if (!knv2.pRg[i].equals(string)) continue;
            return knv2.pRh[i];
        }
        assert (false);
        return "";
    }

    static {
        mwP = new isf[]{mwM, mwN, mwO};
    }
}


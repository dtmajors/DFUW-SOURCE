/*
 * Decompiled with CFR.
 */
public final class dwg
extends Enum<dwg> {
    public static final /* enum */ dwg hiS = new dwg();
    public static final /* enum */ dwg hiT = new dwg();
    public static final /* enum */ dwg hiU = new dwg();
    private static final /* synthetic */ dwg[] hiV;

    public static dwg[] values() {
        return (dwg[])hiV.clone();
    }

    public static dwg valueOf(String string) {
        return Enum.valueOf(dwg.class, string);
    }

    public static dwg parse(String string) {
        if (string == null) {
            return hiS;
        }
        for (dwg dwg2 : dwg.values()) {
            if (!dwg2.name().toLowerCase().equals(string.toLowerCase())) continue;
            return dwg2;
        }
        assert (false) : string + " is Not a Valid SFLeaderBoardCalculationMethods Value!!!";
        return hiS;
    }

    static {
        hiV = new dwg[]{hiS, hiT, hiU};
    }
}


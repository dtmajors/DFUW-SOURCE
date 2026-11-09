/*
 * Decompiled with CFR.
 */
public final class bpk
extends Enum<bpk> {
    public static final /* enum */ bpk dzO = new bpk();
    public static final /* enum */ bpk dzP = new bpk();
    public static final /* enum */ bpk dzQ = new bpk();
    public static final /* enum */ bpk dzR = new bpk();
    public static final /* enum */ bpk dzS = new bpk();
    public static final /* enum */ bpk dzT = new bpk();
    public static final /* enum */ bpk dzU = new bpk();
    public static final /* enum */ bpk dzV = new bpk();
    public static bpk[] dzW;
    private static final /* synthetic */ bpk[] dzX;

    public static bpk[] values() {
        return (bpk[])dzX.clone();
    }

    public static bpk valueOf(String string) {
        return Enum.valueOf(bpk.class, string);
    }

    public static final int getValueCount() {
        return dzW.length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < bpk.getValueCount();
    }

    public static final bpk getValueByOrdinal(int n) {
        if (n < 0 || n >= bpk.getValueCount()) {
            return null;
        }
        return dzW[n];
    }

    public String getName() {
        switch (this) {
            case dzO: {
                return "None";
            }
            case dzP: {
                return "Target Reward";
            }
            case dzQ: {
                return "Target Talk";
            }
            case dzR: {
                return "Target Delivery";
            }
            case dzS: {
                return "Target Kill";
            }
            case dzT: {
                return "Target Use Skill";
            }
            case dzU: {
                return "Target Gather";
            }
            case dzV: {
                return "Target Search";
            }
        }
        return "Unkown";
    }

    public static int getOrdinalByName(String string) {
        for (int i = 0; i < dzW.length; ++i) {
            if (!dzW[i].getName().equals(string)) continue;
            return dzW[i].ordinal();
        }
        return -1;
    }

    public static bpk getTargetVendorMarkerTypeFromQuestType(dud dud2) {
        switch (dud2) {
            case hdO: {
                return dzR;
            }
            case hdR: {
                return dzQ;
            }
            case hdP: 
            case hdS: 
            case hdQ: 
            case hdN: {
                return dzP;
            }
        }
        assert (false) : "QuestType :" + (Object)((Object)dud2);
        return dzP;
    }

    static {
        dzX = new bpk[]{dzO, dzP, dzQ, dzR, dzS, dzT, dzU, dzV};
        dzW = (bpk[])bpk.class.getEnumConstants();
    }
}


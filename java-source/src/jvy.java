/*
 * Decompiled with CFR.
 */
public final class jvy
extends Enum<jvy> {
    public static final /* enum */ jvy oVG = new jvy();
    public static final /* enum */ jvy oVH = new jvy();
    public static final /* enum */ jvy oVI = new jvy();
    public static final /* enum */ jvy oVJ = new jvy();
    public static final /* enum */ jvy oVK = new jvy();
    public static final /* enum */ jvy oVL = new jvy();
    public static final /* enum */ jvy oVM = new jvy();
    public static final /* enum */ jvy oVN = new jvy();
    public static final /* enum */ jvy oVO = new jvy();
    public static final /* enum */ jvy oVP = new jvy();
    public static final /* enum */ jvy oVQ = new jvy();
    public static final /* enum */ jvy oVR = new jvy();
    public static final /* enum */ jvy oVS = new jvy();
    public static final /* enum */ jvy oVT = new jvy();
    public static final /* enum */ jvy oVU = new jvy();
    public static final /* enum */ jvy oVV = new jvy();
    public static final /* enum */ jvy oVW = new jvy();
    public static final /* enum */ jvy oVX = new jvy();
    public static final /* enum */ jvy oVY = new jvy();
    public static final /* enum */ jvy oVZ = new jvy();
    public static final /* enum */ jvy oWa = new jvy();
    public static final /* enum */ jvy oWb = new jvy();
    public static final /* enum */ jvy oWc = new jvy();
    public static final /* enum */ jvy oWd = new jvy();
    public static final /* enum */ jvy oWe = new jvy();
    public static final /* enum */ jvy oWf = new jvy();
    public static final /* enum */ jvy oWg = new jvy();
    public static final /* enum */ jvy oWh = new jvy();
    public static final /* enum */ jvy oWi = new jvy();
    public static final /* enum */ jvy oWj = new jvy();
    public static final /* enum */ jvy oWk = new jvy();
    public static final /* enum */ jvy oWl = new jvy();
    public static final /* enum */ jvy oWm = new jvy();
    public static jvy[] oWn;
    private static final /* synthetic */ jvy[] oWo;

    public static jvy[] values() {
        return (jvy[])oWo.clone();
    }

    public static jvy valueOf(String string) {
        return Enum.valueOf(jvy.class, string);
    }

    public static final jvy getValueByOrdinal(int n) {
        return oWn[n];
    }

    public static final int getValueCount() {
        return oWn.length;
    }

    public final String dTU() {
        switch (this) {
            case oVG: {
                return "Show all error types";
            }
            case oVH: {
                return "Wrong quest types as chain quests";
            }
            case oVI: {
                return "Filename missing";
            }
            case oVV: {
                return "Target resources invalid";
            }
            case oVX: {
                return "Invalid markers";
            }
            case oWa: {
                return "Marker on invalid tile";
            }
            case oVW: {
                return "Marker out of given area limits";
            }
            case oWd: {
                return "Target monsters not registered";
            }
            case oVQ: {
                return "Target Marker missing";
            }
            case oVP: {
                return "Targets missing";
            }
            case oVN: {
                return "Complex Quests With Not Existing SubQuests In DB";
            }
            case oVO: {
                return "SubQuest not a child in any complex quest";
            }
            case oVZ: {
                return "Delivery Quests With Invalid Quest Items";
            }
            case oVJ: {
                return "Quest name missing";
            }
            case oVM: {
                return "Complex Quests With No Subquests";
            }
            case oVY: {
                return "Invalid Resources";
            }
            case oVT: {
                return "Invalid Rewards";
            }
            case oVS: {
                return "Rewards missing";
            }
            case oWf: {
                return "Invalid Skill";
            }
            case oWe: {
                return "Skill missing";
            }
            case oVL: {
                return "Invalid source tile";
            }
            case oWb: {
                return "Invalid spawnpoint files";
            }
            case oVR: {
                return "Target vendor missing";
            }
            case oWg: {
                return "Target vendor missing from tile";
            }
            case oWi: {
                return "Target items unregistered";
            }
            case oVK: {
                return "Source tile missing";
            }
            case oWc: {
                return "Invalid Spawnpoints";
            }
            case oWh: {
                return "Marker shows on tile with no spawnpoints";
            }
            case oWj: {
                return "Quest only under local file system";
            }
            case oVU: {
                return "Chain quests with target vendor";
            }
            case oWk: {
                return "Invalid Target Tile";
            }
            case oWl: {
                return "Sub quest in use in another complex";
            }
            case oWm: {
                return "Quest item has not been set in world of Agon.";
            }
        }
        assert (false);
        return "Unknown";
    }

    static {
        oWo = new jvy[]{oVG, oVH, oVI, oVJ, oVK, oVL, oVM, oVN, oVO, oVP, oVQ, oVR, oVS, oVT, oVU, oVV, oVW, oVX, oVY, oVZ, oWa, oWb, oWc, oWd, oWe, oWf, oWg, oWh, oWi, oWj, oWk, oWl, oWm};
        oWn = (jvy[])jvy.class.getEnumConstants();
    }
}


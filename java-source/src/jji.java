/*
 * Decompiled with CFR.
 */
public class jji {
    public static final String nmg = "text";
    public static final String nmh = "PlayerFirstName";
    public static final String nmi = "PlayerLastName";
    public static final String nmj = "ClanMemberName";
    public static final String nmk = "ResourceName";
    public static final String nml = "CityEnglishName";
    public static final String nmm = "X";
    public static final String nmn = "Y";
    public static final String nmo = "Z";
    public static final String NAME = "Name";
    public static final String TYPE = "Type";
    public static final String nmp = "Completion";
    public static final String nmq = "Owner";
    public static final String TEXT = "Text";
    public static final String nmr = "Text";
    public static final String nms = "Cost";
    public static final String nmt = "MarkerType";
    public static final String nmu = "DistanceLabel";
    public static final String nmv = "NameLabel";
    public static final String nmw = "Distance";
    public static final String nmx = "Rank";
    public static final String nmy = "Tile ID Label";
    public static final String nmz = "Tile ID";
    public static final String nmA = "Tile Position X";
    public static final String nmB = "Tile Position Y";
    public static final String nmC = "Tile Name";
    public static final String nmD = "RemainingTime";
    public static final String nmE = "RemainingTimeId";
    public static final String nmF = "RequisitionStatus";
    public static final String nmG = "RequisitionTime";
    public static final String nmH = "RequisitionTimeId";
    public static final String nmI = "RequisitionRewardsPercentage";
    public static final String nmJ = "DangerLevelLabel";
    public static final String nmK = "DangerLevel";
    public static final String nmL = "VendorID";
    public static final String nmM = "TerritoryNameLabel";
    public static final String nmN = "TerritoryNameValue";
    public static final String nmO = "TerritoryOwnerClanLabel";
    public static final String nmP = "TerritoryOwnerClanValue";
    public static final String nmQ = "TerritoryBonusValue";
    public static final String nmR = "SearchProxyID";
    public static final String nmS = "SearchTag";

    public static boolean sC(String string) {
        return !string.equals(nmk);
    }

    public static void b(StringBuilder stringBuilder, String string, String string2) {
        if (stringBuilder.length() > 0) {
            stringBuilder.append(";");
        }
        stringBuilder.append(string);
        stringBuilder.append("=");
        stringBuilder.append(string2);
    }
}


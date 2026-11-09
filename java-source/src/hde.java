/*
 * Decompiled with CFR.
 */
public class hde
extends lmx {
    public static final String jKY = "MarkersQuest";
    public static final String jKZ = "MarkersBindstone";
    public static final String jLa = "MarkersGreaterstone";
    public static final String jLb = "MarkersChaosstone";
    public static final String jLc = "MarkersAnnotation";
    public static final String jLd = "MarkersConquest";
    public static final String jLe = "MarkersPartyPlayer";
    public static final String jLf = "MarkersPartyWaypoint";
    public static final String jLg = "MarkersVendor";
    public static final String jLh = "MarkersCity";
    public static final String jLi = "MarkersClanMembers";
    public static final String jLj = "MarkersHousing";
    public static final String jLk = "MarkersControlPoints";
    public static final String jLl = "MarkersTradeRoute";
    public static final String jLm = "MarkersFortress";
    public static final String jLn = "MarkersPlayers";
    public static final String jLo = "MarkersSiegestone";
    public static final String jLp = "MarkersPlayerDeployedObjects";
    public static final String jLq = "MarkersFunFlags";

    public hde() {
        super(a.jLr);
    }

    protected hde(a a2) {
        super(a2);
    }

    public lnl<b> mm(String string) {
        return (lnl)this.AM(string);
    }

    public String mn(String string) {
        if (string.equals(jKY)) {
            return "Quest Markers";
        }
        if (string.equals(jKZ)) {
            return "Bindstone Markers";
        }
        if (string.equals(jLa)) {
            return "Greaterstone Markers";
        }
        if (string.equals(jLb)) {
            return "Chaosstone Markers";
        }
        if (string.equals(jLc)) {
            return "Annotation Markers";
        }
        if (string.equals(jLd)) {
            return "Conquest Markers";
        }
        if (string.equals(jLe)) {
            return "Party Markers";
        }
        if (string.equals(jLf)) {
            return "Party Waypoint Markers";
        }
        if (string.equals(jLg)) {
            return "Vendor Markers";
        }
        if (string.equals(jLh)) {
            return "City Markers";
        }
        if (string.equals(jLi)) {
            return "Clan Member Markers";
        }
        if (string.equals(jLj)) {
            return "Housing Markers";
        }
        if (string.equals(jLk)) {
            return "Control Point Markers";
        }
        if (string.equals(jLl)) {
            return "Traderoute Markers";
        }
        if (string.equals(jLm)) {
            return "Fortress Markers";
        }
        if (string.equals(jLn)) {
            return "Player Death Markers";
        }
        if (string.equals(jLo)) {
            return "Siege Stone Markers";
        }
        if (string.equals(jLp)) {
            return "Player Deployed Objects";
        }
        if (string.equals(jLq)) {
            return "Player Deployed Fun Flags";
        }
        return string;
    }
}


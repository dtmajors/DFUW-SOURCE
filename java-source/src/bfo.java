/*
 * Decompiled with CFR.
 */
public class bfo {
    public static final int dhs = 1;
    public static final int dht = 2;
    public static final int dhu = 3;
    public static final int dhv = 4;
    public static final int dhw = 5;
    public static final int dhx = 6;
    public static final int dhy = 7;
    public static final int dhz = 8;
    public static final int dhA = 9;
    public static final int dhB = 10;
    public static final int dhC = 11;
    public static final int dhD = 12;
    public static final int dhE = 13;
    public static final int dhF = 14;
    public static final int dhG = 15;
    private static final String[] dhH = new String[]{"Undefined EventType", "Event Object Boosted", "Event Object Damaged", "Event Object Drained", "Event Object Healed", "Event Object Died", "Event Creature Entered GankMode", "Event Creature Ganked", "Event Creature Marked", "Event Creature Revived", "Event Attribute Modifier Added", "Event Attribute Modifier Removed", "Event Attribute Modifier Changed", "Event Attribute Modifier Value Made Permanent", "Event Skill Modifier Added", "Event Skill Modifier Removed"};

    public static int ft(String string) {
        if (string == null) {
            lfn.b(5, "SFEventConstants", "getEventType() EventName is null.");
            return -1;
        }
        for (int i = 1; i < dhH.length; ++i) {
            if (!dhH[i].equalsIgnoreCase(string)) continue;
            return i;
        }
        lfn.b(5, "SFEventConstants", "getEventType() EventName '" + string + "' is invalid.");
        return -1;
    }

    public static String eV(int n) {
        if (n <= 0 || n >= dhH.length) {
            lfn.b(5, "SFEventConstants", "getEventName() EventType is invalid.");
            return null;
        }
        return dhH[n];
    }

    public static boolean kG(int n) {
        switch (n) {
            case 10: 
            case 12: {
                return true;
            }
            case 11: 
            case 13: 
            case 14: 
            case 15: {
                return false;
            }
        }
        lfn.b(5, "SFEventConstants", "isNotifyEventListeners() Invalid eventtype provided: " + n);
        assert (false);
        return false;
    }

    private bfo() {
    }
}


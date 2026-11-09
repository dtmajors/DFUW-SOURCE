/*
 * Decompiled with CFR.
 */
@llc
public enum cjo {
    BASE,
    DIRECTION,
    SKILL,
    EQUIP_UNSHEATH,
    KILL,
    LOCATION,
    GUI,
    LAST,
    POSTURE_MODE;


    public static cjo getTriggerType(String string) {
        if (string == null) {
            return null;
        }
        if (string.equalsIgnoreCase("DIRECTION")) {
            return DIRECTION;
        }
        if (string.equalsIgnoreCase("SKILL")) {
            return SKILL;
        }
        if (string.equalsIgnoreCase("EQUIP_UNSHEATH")) {
            return EQUIP_UNSHEATH;
        }
        if (string.equalsIgnoreCase("KILL")) {
            return KILL;
        }
        if (string.equalsIgnoreCase("LOCATION")) {
            return LOCATION;
        }
        if (string.equalsIgnoreCase("LAST")) {
            return LAST;
        }
        if (string.equalsIgnoreCase("GUI")) {
            return GUI;
        }
        if (string.equalsIgnoreCase("POSTURE_MODE")) {
            return POSTURE_MODE;
        }
        return null;
    }
}


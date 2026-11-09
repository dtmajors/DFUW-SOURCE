/*
 * Decompiled with CFR.
 */
public enum abo {
    bdC,
    bdD,
    bdE,
    bdF,
    bdG,
    bdH,
    bdI,
    bdJ,
    bdK;


    public static abo parse(String string) {
        String string2 = string.replace("event_", "").replace("_", "").toLowerCase();
        for (abo abo2 : abo.values()) {
            if (!abo2.toString().toLowerCase().endsWith(string2)) continue;
            return abo2;
        }
        return bdC;
    }
}


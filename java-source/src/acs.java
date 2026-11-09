/*
 * Decompiled with CFR.
 */
public enum acs {
    bee,
    bef,
    beg,
    beh,
    bei,
    bej,
    bek,
    bel,
    bem,
    ben,
    beo,
    bep,
    beq,
    ber,
    bes,
    bet,
    beu,
    bev,
    bew,
    bex,
    bey;


    public static acs parse(String string) {
        String string2 = string.replace("_", "").toLowerCase();
        for (acs acs2 : acs.values()) {
            if (!acs2.toString().toLowerCase().equals(string2)) continue;
            return acs2;
        }
        return bee;
    }
}


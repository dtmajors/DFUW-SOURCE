/*
 * Decompiled with CFR.
 */
public enum xm {
    bbl,
    bbm,
    bbn,
    bbo,
    bbp,
    bbq,
    bbr,
    bbs,
    bbt,
    bbu,
    bbv,
    bbw;


    public static xm parse(String string) {
        String string2 = string.replace("_", "").toLowerCase();
        for (xm xm2 : xm.values()) {
            if (!xm2.toString().toLowerCase().equals(string2)) continue;
            return xm2;
        }
        return bbl;
    }
}


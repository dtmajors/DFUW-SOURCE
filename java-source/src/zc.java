/*
 * Decompiled with CFR.
 */
public enum zc {
    bca,
    bcb,
    bcc,
    bcd,
    bce,
    bcf,
    bcg,
    bch,
    bci,
    bcj,
    bck,
    bcl,
    bcm,
    bcn,
    bco,
    bcp,
    bcq,
    bcr,
    bcs,
    bct;


    public static zc parse(String string) {
        String string2 = string.replace("_", "").toLowerCase();
        for (zc zc2 : zc.values()) {
            if (!zc2.toString().toLowerCase().equals(string2)) continue;
            return zc2;
        }
        return bca;
    }
}


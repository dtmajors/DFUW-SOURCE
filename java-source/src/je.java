/*
 * Decompiled with CFR.
 */
public enum je {
    ajN,
    ajO,
    ajP,
    ajQ,
    ajR,
    ajS,
    ajT,
    ajU,
    ajV,
    ajW,
    ajX,
    ajY,
    ajZ,
    aka,
    akb,
    akc,
    akd;


    public static je getValueByOrdinal(int n) {
        return n < 0 || n >= je.values().length ? ajN : je.values()[n];
    }
}


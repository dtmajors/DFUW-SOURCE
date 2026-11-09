/*
 * Decompiled with CFR.
 */
public enum jb {
    aja,
    ajb,
    ajc;


    public static jb getValueByOrdinal(int n) {
        return n < 0 || n >= jb.values().length ? aja : jb.values()[n];
    }
}


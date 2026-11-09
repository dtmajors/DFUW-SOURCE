/*
 * Decompiled with CFR.
 */
public enum dpy {
    gND,
    gNE,
    gNF;


    public static dpy getValueByOrdinal(int n) {
        return n <= 0 || n >= dpy.values().length ? gND : dpy.values()[n];
    }
}


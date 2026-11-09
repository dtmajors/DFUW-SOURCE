/*
 * Decompiled with CFR.
 */
public enum mhe {
    DwM,
    DwN,
    DwO,
    DwP;


    public static mhe parse(String string) {
        if (string != null) {
            for (mhe mhe2 : mhe.values()) {
                if (!mhe2.name().toLowerCase().equals(string.toLowerCase())) continue;
                return mhe2;
            }
        }
        return DwM;
    }
}


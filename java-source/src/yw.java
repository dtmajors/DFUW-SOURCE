/*
 * Decompiled with CFR.
 */
public enum yw {
    bbO;


    public static yw parse(String string) {
        for (yw yw2 : yw.values()) {
            if (!yw2.name().equals(string)) continue;
            return yw2;
        }
        return null;
    }
}


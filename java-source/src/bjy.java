/*
 * Decompiled with CFR.
 */
public enum bjy {
    dqg,
    dqh;

    public static bjy[] dqi;

    public static final int getValueCount() {
        return dqi.length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < bjy.getValueCount();
    }

    public static final bjy getValueByOrdinal(int n) {
        return dqi[n];
    }

    static {
        dqi = (bjy[])bjy.class.getEnumConstants();
    }
}


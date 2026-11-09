/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum cgd {
    ewS,
    ewT,
    ewU;

    public static final List<cgd> ListOfValue;

    public static final int getValueCount() {
        return ListOfValue.size();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < cgd.getValueCount();
    }

    public static final cgd getValueByOrdinal(int n) {
        if (cgd.isValidOrdinal(n)) {
            return ListOfValue.get(n);
        }
        return null;
    }

    public static cgd getValueByName(String string) {
        if (string == null) {
            return null;
        }
        if (string.equalsIgnoreCase("BOOSTER")) {
            return ewS;
        }
        if (string.equalsIgnoreCase("SKILL")) {
            return ewT;
        }
        if (string.equalsIgnoreCase("RESOURCE")) {
            return ewU;
        }
        return null;
    }

    static {
        ListOfValue = Collections.unmodifiableList(Arrays.asList(cgd.class.getEnumConstants()));
    }
}


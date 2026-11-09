/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum cgv {
    ezg,
    ezh,
    ezi;

    public static final List<cgv> ListOfValue;

    public static final int getValueCount() {
        return ListOfValue.size();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < cgv.getValueCount();
    }

    public static final cgv getValueByOrdinal(int n) {
        if (cgv.isValidOrdinal(n)) {
            return ListOfValue.get(n);
        }
        return null;
    }

    public static cgv getFeatTimeTypeByName(String string) {
        for (cgv cgv2 : ListOfValue) {
            if (!cgv2.name().equalsIgnoreCase(string)) continue;
            return cgv2;
        }
        return null;
    }

    static {
        ListOfValue = Collections.unmodifiableList(Arrays.asList(cgv.class.getEnumConstants()));
    }
}


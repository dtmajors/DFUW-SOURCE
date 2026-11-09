/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum cgj {
    exY,
    exZ;

    public static final List<cgj> ListOfValue;

    public static final int getValueCount() {
        return ListOfValue.size();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < cgj.getValueCount();
    }

    public static final cgj getValueByOrdinal(int n) {
        if (cgj.isValidOrdinal(n)) {
            return ListOfValue.get(n);
        }
        return null;
    }

    public static cgj getFeatTypeByName(String string) {
        for (cgj cgj2 : ListOfValue) {
            if (!cgj2.name().equalsIgnoreCase(string)) continue;
            return cgj2;
        }
        return exY;
    }

    static {
        ListOfValue = Collections.unmodifiableList(Arrays.asList(cgj.class.getEnumConstants()));
    }
}


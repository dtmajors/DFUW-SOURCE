/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum bds {
    dbB;

    public static final List<bds> ListOfValue;

    public static final int getValueCount() {
        return ListOfValue.size();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < bds.getValueCount();
    }

    public static final bds getValueByOrdinal(int n) {
        if (bds.isValidOrdinal(n)) {
            return ListOfValue.get(n);
        }
        return null;
    }

    static {
        ListOfValue = Collections.unmodifiableList(Arrays.asList(bds.class.getEnumConstants()));
    }
}


/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@llc
public enum low {
    UNKNOW,
    ALFAR,
    DWARF,
    HUMAN,
    MAHIRIM,
    MIRDAIN,
    ORK;

    public static final List<low> ListOfValue;

    public static final int getValueCount() {
        return ListOfValue.size();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < low.getValueCount();
    }

    public static final low getValueByOrdinal(int n) {
        if (low.isValidOrdinal(n)) {
            return ListOfValue.get(n);
        }
        return null;
    }

    static {
        ListOfValue = Collections.unmodifiableList(Arrays.asList(low.class.getEnumConstants()));
    }
}


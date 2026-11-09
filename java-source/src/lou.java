/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@llc
public enum lou {
    UNKNOWN,
    MALE,
    FEMALE;

    public static final List<lou> ListOfValue;

    public static final int getValueCount() {
        return ListOfValue.size();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < lou.getValueCount();
    }

    public static final lou getValueByOrdinal(int n) {
        if (lou.isValidOrdinal(n)) {
            return ListOfValue.get(n);
        }
        return null;
    }

    static {
        ListOfValue = Collections.unmodifiableList(Arrays.asList(lou.class.getEnumConstants()));
    }
}


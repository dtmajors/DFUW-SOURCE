/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum cgy {
    ezp,
    ezq,
    ezr,
    ezs,
    ezt;

    public static final List<cgy> ListOfValue;

    public static final int getValueCount() {
        return ListOfValue.size();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < cgy.getValueCount();
    }

    public static final cgy getValueByOrdinal(int n) {
        if (cgy.isValidOrdinal(n)) {
            return ListOfValue.get(n);
        }
        return null;
    }

    public static final cgy getValueByName(String string) {
        for (cgy cgy2 : ListOfValue) {
            if (!cgy2.toString().equalsIgnoreCase(string)) continue;
            return cgy2;
        }
        return null;
    }

    static {
        ListOfValue = Collections.unmodifiableList(Arrays.asList(cgy.class.getEnumConstants()));
    }
}


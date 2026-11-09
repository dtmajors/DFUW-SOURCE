/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum cgz {
    ezv,
    ezw,
    ezx;

    public static final List<cgz> ListOfValue;

    public static final int getValueCount() {
        return ListOfValue.size();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < cgz.getValueCount();
    }

    public static final cgz getValueByOrdinal(int n) {
        if (cgz.isValidOrdinal(n)) {
            return ListOfValue.get(n);
        }
        return null;
    }

    public static final cgz getValueByName(String string) {
        for (cgz cgz2 : ListOfValue) {
            if (!cgz2.toString().equalsIgnoreCase(string)) continue;
            return cgz2;
        }
        return null;
    }

    static {
        ListOfValue = Collections.unmodifiableList(Arrays.asList(cgz.class.getEnumConstants()));
    }
}


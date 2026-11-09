/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum tw {
    aVT,
    aVU,
    aVV,
    aVW,
    aVX,
    aVY,
    aVZ,
    aWa,
    aWb,
    aWc;

    public static final List<tw> ListOfValue;

    public static final int getValueCount() {
        return ListOfValue.size();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < tw.getValueCount();
    }

    public static final tw getValueByOrdinal(int n) {
        if (tw.isValidOrdinal(n)) {
            return ListOfValue.get(n);
        }
        return null;
    }

    public static final tw getValueByName(String string) {
        for (tw tw2 : ListOfValue) {
            if (!tw2.toString().equalsIgnoreCase(string)) continue;
            return tw2;
        }
        return null;
    }

    static {
        ListOfValue = Collections.unmodifiableList(Arrays.asList(tw.class.getEnumConstants()));
    }
}


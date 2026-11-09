/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum chb {
    ezD,
    ezE,
    ezF,
    ezG;

    public static final List<chb> ListOfValue;

    public static final int getValueCount() {
        return ListOfValue.size();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < chb.getValueCount();
    }

    public static final chb getValueByOrdinal(int n) {
        if (chb.isValidOrdinal(n)) {
            return ListOfValue.get(n);
        }
        return null;
    }

    public static final chb getValueByName(String string) {
        for (chb chb2 : ListOfValue) {
            if (!chb2.toString().equalsIgnoreCase(string)) continue;
            return chb2;
        }
        return null;
    }

    static {
        ListOfValue = Collections.unmodifiableList(Arrays.asList(chb.class.getEnumConstants()));
    }
}


/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum cha {
    ezz,
    ezA,
    ezB;

    public static final List<cha> ListOfValue;

    public static final int getValueCount() {
        return ListOfValue.size();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < cha.getValueCount();
    }

    public static final cha getValueByOrdinal(int n) {
        if (cha.isValidOrdinal(n)) {
            return ListOfValue.get(n);
        }
        return null;
    }

    public static final cha getValueByName(String string) {
        for (cha cha2 : ListOfValue) {
            if (!cha2.toString().equalsIgnoreCase(string)) continue;
            return cha2;
        }
        return null;
    }

    static {
        ListOfValue = Collections.unmodifiableList(Arrays.asList(cha.class.getEnumConstants()));
    }
}


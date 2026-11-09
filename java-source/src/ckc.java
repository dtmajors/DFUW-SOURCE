/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@llc
public enum ckc {
    WARRIOR,
    SKIRMISHER,
    ELEMENTALIST,
    PRIMALIST,
    COMMONER;

    public static final List<ckc> ListOfValue;

    public static final int getValueCount() {
        return ListOfValue.size();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < ckc.getValueCount();
    }

    public static final ckc getValueByOrdinal(int n) {
        if (ckc.isValidOrdinal(n)) {
            return ListOfValue.get(n);
        }
        return null;
    }

    public static final ckc getValueByName(String string) {
        for (ckc ckc2 : ListOfValue) {
            if (!ckc2.name().equalsIgnoreCase(string)) continue;
            return ckc2;
        }
        return null;
    }

    static {
        ListOfValue = Collections.unmodifiableList(Arrays.asList(ckc.class.getEnumConstants()));
    }
}


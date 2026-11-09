/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum cja {
    eDp,
    eDq,
    eDr,
    eDs,
    eDt,
    eDu,
    eDv,
    eDw,
    eDx,
    eDy,
    eDz,
    eDA,
    eDB,
    eDC;

    public static final List<cja> ListOfValue;

    public static final int getValueCount() {
        return ListOfValue.size();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < cja.getValueCount();
    }

    public static final cja getValueByOrdinal(int n) {
        if (cja.isValidOrdinal(n)) {
            return ListOfValue.get(n);
        }
        return null;
    }

    public static final cja getValueByName(String string) {
        for (cja cja2 : ListOfValue) {
            if (!cja2.toString().equalsIgnoreCase(string)) continue;
            return cja2;
        }
        return null;
    }

    static {
        ListOfValue = Collections.unmodifiableList(Arrays.asList(cja.class.getEnumConstants()));
    }
}


/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum bdu {
    dbF,
    dbG,
    dbH,
    dbI,
    dbJ,
    dbK,
    dbL,
    dbM,
    dbN,
    dbO,
    dbP,
    dbQ,
    dbR;

    public static final List<bdu> ListOfValue;

    public static final int getValueCount() {
        return ListOfValue.size();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < bdu.getValueCount();
    }

    public static final bdu getValueByOrdinal(int n) {
        if (bdu.isValidOrdinal(n)) {
            return ListOfValue.get(n);
        }
        return null;
    }

    static {
        ListOfValue = Collections.unmodifiableList(Arrays.asList(bdu.class.getEnumConstants()));
    }
}


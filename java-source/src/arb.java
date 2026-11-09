/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum arb {
    bNX,
    bNY,
    bNZ,
    bOa;

    public static final List<arb> Values;

    public static int getOrdinal(arb arb2) {
        return Values.indexOf((Object)arb2);
    }

    public static arb getValue(String string) {
        for (arb arb2 : Values) {
            if (!arb2.name().equalsIgnoreCase(string)) continue;
            return arb2;
        }
        return null;
    }

    static {
        Values = Collections.unmodifiableList(Arrays.asList(arb.class.getEnumConstants()));
    }
}


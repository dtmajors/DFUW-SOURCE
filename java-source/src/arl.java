/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum arl {
    bPT,
    bPU,
    bPV,
    bPW,
    bPX,
    bPY,
    bPZ;

    public static final List<arl> Values;

    public static int getOrdinal(arl arl2) {
        return Values.indexOf((Object)arl2);
    }

    static {
        Values = Collections.unmodifiableList(Arrays.asList(arl.class.getEnumConstants()));
    }
}


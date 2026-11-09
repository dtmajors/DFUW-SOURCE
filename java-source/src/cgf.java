/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum cgf {
    ewX,
    ewY,
    ewZ;

    public static final List<cgf> ListOfValue;

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < cgf.getValueCount();
    }

    public static final int getValueCount() {
        return ListOfValue.size();
    }

    public static final cgf getValueByOrdinal(int n) {
        if (cgf.isValidOrdinal(n)) {
            return ListOfValue.get(n);
        }
        return null;
    }

    static {
        ListOfValue = Collections.unmodifiableList(Arrays.asList(cgf.class.getEnumConstants()));
    }
}


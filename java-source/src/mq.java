/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum mq {
    azr,
    azs,
    azt,
    azu;

    public static final List<mq> ListOfValue;

    public static final int getValueCount() {
        return ListOfValue.size();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < mq.getValueCount();
    }

    public static final mq getValueByOrdinal(int n) {
        if (mq.isValidOrdinal(n)) {
            return ListOfValue.get(n);
        }
        return null;
    }

    public static final mq getValueByName(String string) {
        if (string == null) {
            return null;
        }
        for (mq mq2 : ListOfValue) {
            if (!mq2.name().equalsIgnoreCase(string)) continue;
            return mq2;
        }
        return null;
    }

    static {
        ListOfValue = Collections.unmodifiableList(Arrays.asList(mq.class.getEnumConstants()));
    }
}


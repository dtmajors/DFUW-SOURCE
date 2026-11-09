/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum ldb {
    reo,
    rep;

    public static final List<ldb> ListOfValue;

    public final ldb eni() {
        return ListOfValue.get(1 - this.ordinal());
    }

    static {
        ListOfValue = Collections.unmodifiableList(Arrays.asList(ldb.class.getEnumConstants()));
    }
}


/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum jgt {
    nbd(0, "FRIENDS"),
    nbe(1, "BLOCKED"),
    nbf(2, "REQUESTS");

    public final int cck;
    public final String Name;
    public static final List<jgt> Values;

    private jgt(int n2, String string2) {
        this.cck = n2;
        this.Name = string2;
    }

    static {
        Values = Collections.unmodifiableList(Arrays.asList(jgt.class.getEnumConstants()));
    }
}


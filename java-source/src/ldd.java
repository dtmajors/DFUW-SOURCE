/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class ldd
extends Enum<ldd> {
    public static final /* enum */ ldd rer = new ldd(-1);
    public static final /* enum */ ldd res = new ldd(0);
    public static final /* enum */ ldd ret = new ldd(1);
    public static final List<ldd> ListOfValue;
    public final int reu;
    private static final /* synthetic */ ldd[] rev;

    public static ldd[] values() {
        return (ldd[])rev.clone();
    }

    public static ldd valueOf(String string) {
        return Enum.valueOf(ldd.class, string);
    }

    private ldd(int n2) {
        this.reu = n2;
    }

    public final ldd enj() {
        switch (this) {
            case rer: {
                return ret;
            }
            case ret: {
                return rer;
            }
            case res: {
                return res;
            }
        }
        assert (false);
        return res;
    }

    static {
        rev = new ldd[]{rer, res, ret};
        ListOfValue = Collections.unmodifiableList(Arrays.asList(ldd.class.getEnumConstants()));
    }
}


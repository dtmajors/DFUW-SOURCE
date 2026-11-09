/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@llc
public final class cjv
extends Enum<cjv> {
    public static final /* enum */ cjv HEAVY = new cjv();
    public static final /* enum */ cjv MEDIUM = new cjv();
    public static final /* enum */ cjv LIGHT_M = new cjv();
    public static final /* enum */ cjv LIGHT_C = new cjv();
    public static final /* enum */ cjv ALL = new cjv();
    public static final List<cjv> ListOfValue;
    private static final /* synthetic */ cjv[] $VALUES;

    public static cjv[] values() {
        return (cjv[])$VALUES.clone();
    }

    public static cjv valueOf(String string) {
        return Enum.valueOf(cjv.class, string);
    }

    public static final int getValueCount() {
        return ListOfValue.size();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < cjv.getValueCount();
    }

    public static final cjv getValueByOrdinal(int n) {
        if (cjv.isValidOrdinal(n)) {
            return ListOfValue.get(n);
        }
        return null;
    }

    public static final cjv getValueByName(String string) {
        for (cjv cjv2 : ListOfValue) {
            if (!cjv2.toString().equalsIgnoreCase(string)) continue;
            return cjv2;
        }
        return null;
    }

    public static final int getConnectionAttribute(int n) {
        cjv cjv2 = cjv.getArmorType(n);
        if (cjv2 == null) {
            return -1;
        }
        return cjv.getConnectionAttribute(cjv2);
    }

    public static final int getConnectionAttribute(cjv cjv2) {
        if (cjv2 == null) {
            return -1;
        }
        switch (cjv2) {
            case HEAVY: {
                return 13312;
            }
            case MEDIUM: {
                return 13328;
            }
            case LIGHT_C: {
                return 13344;
            }
            case LIGHT_M: {
                return 13360;
            }
        }
        return -1;
    }

    public static final cjv getArmorType(jet jet2) {
        if (jet2 == null) {
            assert (false);
            return null;
        }
        switch (jet2) {
            case mVT: {
                return HEAVY;
            }
            case mVU: {
                return MEDIUM;
            }
            case mVV: {
                return LIGHT_C;
            }
            case mVW: {
                return LIGHT_M;
            }
        }
        assert (false) : "Invalid type : " + (Object)((Object)jet2);
        return null;
    }

    public static cjv getArmorType(int n) {
        if (!lea.enW().isDescendant(n, cug.fjl) && !lea.enW().isDescendant(n, cug.fjr)) {
            return null;
        }
        ff ff2 = (ff)cug.bh((int)n, (int)11024);
        if (ff2 == null) {
            return null;
        }
        String string = ff2.getStringValue();
        if (string == null) {
            return null;
        }
        return cjv.getValueByName(string);
    }

    static {
        $VALUES = new cjv[]{HEAVY, MEDIUM, LIGHT_M, LIGHT_C, ALL};
        ListOfValue = Collections.unmodifiableList(Arrays.asList(cjv.class.getEnumConstants()));
    }
}


/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum cdy {
    eod(0, "LEFT_RADIAL_MENU_TRIGGER"),
    eoe(1, "RIGHT_RADIAL_MENU_TRIGGER"),
    eof(2, "MIDDLE_RADIAL_MENU_TRIGGER");

    public final int cck;
    public final String Name;
    private static final cdy[] eog;
    public static final List<cdy> ListOfValue;

    public static final int getValueCount() {
        return eog.length;
    }

    public static final cdy[] getValues() {
        return eog;
    }

    public static cdy getValueByOrdinal(int n) {
        if (n >= cdy.getValueCount() || n < 0) {
            return null;
        }
        return eog[n];
    }

    private cdy(int n2, String string2) {
        this.cck = n2;
        this.Name = string2;
    }

    static {
        eog = (cdy[])cdy.class.getEnumConstants();
        ListOfValue = Collections.unmodifiableList(Arrays.asList(cdy.class.getEnumConstants()));
    }
}


/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@llc
public enum cgi {
    BASE,
    EVENT,
    LIFE_MODE_CHANGES,
    SKILL,
    SKILL_LEVEL,
    SKIN,
    HARVEST,
    TRANSFER,
    BREAK_ITEM,
    CRAFTING,
    HOUSING,
    SPAWNING,
    BUY,
    SOCIAL,
    ATTRIBUTE,
    ATTRIBUTE_LEVEL,
    EXPLORATION,
    FEAT,
    SELL,
    GUI,
    PROWESS_GAIN,
    OPEN_CHEST;

    public static final List<cgi> ListOfValue;

    public static final int getValueCount() {
        return ListOfValue.size();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < cgi.getValueCount();
    }

    public static final cgi getValueByOrdinal(int n) {
        if (cgi.isValidOrdinal(n)) {
            return ListOfValue.get(n);
        }
        return null;
    }

    public static cgi getFeatTriggerType(String string) {
        for (cgi cgi2 : ListOfValue) {
            if (!cgi2.name().equalsIgnoreCase(string)) continue;
            return cgi2;
        }
        return null;
    }

    static {
        ListOfValue = Collections.unmodifiableList(Arrays.asList(cgi.class.getEnumConstants()));
    }
}


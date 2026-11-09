/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@llc
public enum axp {
    CATEGORY_NONE,
    CATEGORY_WALLS,
    CATEGORY_EXTRAS,
    CATEGORY_GUARD_TOWERS,
    CATEGORY_CANNONS,
    CATEGORY_RESOURCES,
    CATEGORY_HOUSING,
    CATEGORY_CRAFTING,
    CATEGORY_TRADE,
    CATEGORY_WONDERS,
    CATEGORY_TOWERS,
    CATEGORY_HARBOUR,
    CATEGORY_GUILDS,
    CATEGORY_KEEPS,
    CATEGORY_RELIGION,
    CATEGORY_PALISADES,
    CATEGORY_TRANSPORTATION;

    public static List<axp> Values;

    public axp eH(String string) {
        return null;
    }

    public static axp getCategoryByOrdinal(int n) {
        return Values.get(n);
    }

    public String Yf() {
        switch (this) {
            case CATEGORY_CANNONS: {
                return "Cannons";
            }
            case CATEGORY_CRAFTING: {
                return "Crafting";
            }
            case CATEGORY_EXTRAS: {
                return "Extras";
            }
            case CATEGORY_GUARD_TOWERS: {
                return "Guard Towers";
            }
            case CATEGORY_GUILDS: {
                return "Guilds";
            }
            case CATEGORY_HARBOUR: {
                return "Harbours";
            }
            case CATEGORY_HOUSING: {
                return "Houses";
            }
            case CATEGORY_KEEPS: {
                return "Keeps";
            }
            case CATEGORY_PALISADES: {
                return "Palisades";
            }
            case CATEGORY_RELIGION: {
                return "Religion";
            }
            case CATEGORY_RESOURCES: {
                return "Resources";
            }
            case CATEGORY_TOWERS: {
                return "Towers";
            }
            case CATEGORY_TRADE: {
                return "Trade";
            }
            case CATEGORY_WALLS: {
                return "Walls";
            }
            case CATEGORY_WONDERS: {
                return "Wonders";
            }
            case CATEGORY_TRANSPORTATION: {
                return "Transportation";
            }
        }
        return "None";
    }

    static {
        Values = Collections.unmodifiableList(Arrays.asList(axp.class.getEnumConstants()));
    }
}


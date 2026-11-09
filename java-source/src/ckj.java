/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum ckj {
    eGG("Strength"),
    eGH("Dexterity"),
    eGI("Intelligence"),
    eGJ("Wisdom");

    public static final List<ckj> ListOfValue;
    public final String Name;

    public static final int getValueCount() {
        return ListOfValue.size();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < ckj.getValueCount();
    }

    public static ckj getValueByName(String string) {
        if (string == null) {
            return null;
        }
        if (string.equalsIgnoreCase("Strength")) {
            return eGG;
        }
        if (string.equalsIgnoreCase("Dexterity")) {
            return eGH;
        }
        if (string.equalsIgnoreCase("Wisdom")) {
            return eGJ;
        }
        if (string.equalsIgnoreCase("Intelligence")) {
            return eGI;
        }
        return null;
    }

    public static final ckj getValueByOrdinal(int n) {
        if (ckj.isValidOrdinal(n)) {
            return ListOfValue.get(n);
        }
        return null;
    }

    private ckj(String string2) {
        this.Name = string2;
    }

    static {
        ListOfValue = Collections.unmodifiableList(Arrays.asList(ckj.class.getEnumConstants()));
    }
}


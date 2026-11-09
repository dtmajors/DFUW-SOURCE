/*
 * Decompiled with CFR.
 */
public class duk {
    public static final int hef = 1;
    public static final int heg = 2;
    public static final int heh = 3;
    public static final int VALUE_ENUMERATION = 4;
    public static final int hei = 5;
    public static final int hej = 6;
    public static final int hek = 7;
    public static final int hel = 8;
    public static final int hem = 9;
    public static final int hen = 10;
    public static final int heo = 11;
    private static final String[] hep = new String[]{"Undefined ValueType", "Value Bitmask Multiselection", "Value Boolean", "Value Double", "Value Enumeration", "Value Float", "Value Integer", "Value Long", "Value SFColorRGBA", "Value SFVector3", "Value String", "Value SFVector2"};
    public static final int heq = 1;
    public static final int her = 2;
    public static final int hes = 3;
    public static final int het = 4;
    private static final String[] heu = new String[]{"Undefined ConstraintType", "Constraint None", "Constraint Greater Or Equal to 0", "Constraint Greater Than 0", "Constraint Not Null"};

    public static int jA(String string) {
        if (string == null) {
            return -1;
        }
        for (int i = 0; i < hep.length; ++i) {
            if (!hep[i].equalsIgnoreCase(string)) continue;
            return i;
        }
        return -1;
    }

    public static String Cs(int n) {
        if (n <= 0 || n >= hep.length) {
            return null;
        }
        return hep[n];
    }

    public static int jB(String string) {
        if (string == null) {
            return -1;
        }
        for (int i = 0; i < heu.length; ++i) {
            if (!heu[i].equalsIgnoreCase(string)) continue;
            return i;
        }
        return -1;
    }

    public static String Ct(int n) {
        if (n <= 0 || n >= heu.length) {
            return null;
        }
        return heu[n];
    }

    public static String[] bBi() {
        String[] stringArray = new String[heu.length - 1];
        for (int i = 0; i < stringArray.length; ++i) {
            stringArray[i] = heu[i + 1];
        }
        return stringArray;
    }

    private duk() {
    }
}


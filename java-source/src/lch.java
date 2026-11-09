/*
 * Decompiled with CFR.
 */
public class lch {
    public static final Boolean TRUE = new Boolean(true);
    public static final Boolean FALSE = new Boolean(false);
    private boolean Pp;

    public static boolean yY(String string) {
        if (string.equalsIgnoreCase("true")) {
            return true;
        }
        if (string.equalsIgnoreCase("false")) {
            return false;
        }
        throw new NumberFormatException();
    }

    public static lch yZ(String string) {
        return new lch(lch.yY(string));
    }

    public lch() {
    }

    public lch(lch lch2) {
        this(lch2.Pp);
    }

    public lch(boolean bl) {
        this.Pp = bl;
    }

    public boolean booleanValue() {
        return this.Pp;
    }

    public String stringValue() {
        return String.valueOf(this.Pp);
    }

    public boolean equals(Object object) {
        if (object instanceof lch) {
            return ((lch)object).Pp == this.Pp;
        }
        return false;
    }

    public int hashCode() {
        return this.Pp ? 1231 : 1237;
    }

    public String toString() {
        return null;
    }

    public void za(String string) {
        this.Pp = lch.yY(string);
    }

    public static Boolean valueOf(boolean bl) {
        return bl ? TRUE : FALSE;
    }
}


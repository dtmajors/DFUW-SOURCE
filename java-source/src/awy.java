/*
 * Decompiled with CFR.
 */
public class awy
extends awu {
    @Override
    public boolean d(Object object, String string) {
        if (object == null) {
            return false;
        }
        int n = 0;
        try {
            n = Integer.parseInt(object.toString());
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        int n2 = 0;
        try {
            n2 = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        return n == n2;
    }
}


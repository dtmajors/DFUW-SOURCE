/*
 * Decompiled with CFR.
 */
public class axe
extends awu {
    @Override
    public boolean d(Object object, String string) {
        if (object == null) {
            return false;
        }
        return object.toString().equalsIgnoreCase(string);
    }
}


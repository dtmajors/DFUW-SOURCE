/*
 * Decompiled with CFR.
 */
public class awv
extends awu {
    @Override
    public boolean d(Object object, String string) {
        if (object == null) {
            return false;
        }
        return object.toString().toLowerCase().startsWith(string.toLowerCase());
    }
}


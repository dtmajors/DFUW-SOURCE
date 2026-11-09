/*
 * Decompiled with CFR.
 */
public class aww
extends awu {
    @Override
    public boolean d(Object object, String string) {
        if (object == null) {
            return false;
        }
        return object.toString().toLowerCase().contains(string.toLowerCase());
    }
}


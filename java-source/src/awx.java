/*
 * Decompiled with CFR.
 */
public class awx
extends awu {
    @Override
    public boolean d(Object object, String string) {
        if (object == null) {
            return false;
        }
        return object.toString().toLowerCase().endsWith(string.toLowerCase());
    }
}


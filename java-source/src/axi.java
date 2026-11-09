/*
 * Decompiled with CFR.
 */
public class axi
extends awu {
    @Override
    public boolean d(Object object, String string) {
        if (object == null) {
            return false;
        }
        return object.toString().compareToIgnoreCase(string) <= 0;
    }
}


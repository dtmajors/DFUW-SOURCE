/*
 * Decompiled with CFR.
 */
public class itq {
    public static <T> boolean i(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null) {
            return false;
        }
        if (t2 == null) {
            return false;
        }
        return t.equals(t2);
    }
}


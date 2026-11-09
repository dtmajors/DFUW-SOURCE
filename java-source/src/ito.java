/*
 * Decompiled with CFR.
 */
import java.util.List;

public class ito {
    public static <T> boolean f(List<T> list, int n, int n2) {
        if (n != n2) {
            int n3;
            T t = list.remove(n);
            int n4 = n3 = n2 > n ? n2 - 1 : n2;
            if (n3 < list.size()) {
                list.add(n3, t);
            } else {
                list.add(t);
            }
            return true;
        }
        return false;
    }
}


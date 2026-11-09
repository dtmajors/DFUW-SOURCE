/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.HashSet;

public class auj {
    private static final aue ccy = lea.eoH();

    public static <T> void b(T t, String string) {
        if (t == null) {
            return;
        }
        aue aue2 = auj.o(t);
        if (aue2 == null) {
            return;
        }
        auj.a(aue2, new auf(string));
    }

    public static <T, ST> boolean a(T t, ST ST, String string) {
        if (string == null || string.length() == 0) {
            return false;
        }
        aue aue2 = auj.a(t, ST, true);
        if (aue2 == null) {
            return false;
        }
        return auj.a(aue2, new auf(string));
    }

    public static <T> auf[] n(T t) {
        aue aue2 = auj.o(t);
        if (aue2 == null) {
            return null;
        }
        return aue2.Strings;
    }

    public static <T, ST> auf[] d(T t, ST ST) {
        aue aue2 = auj.a(t, ST, false);
        if (aue2 == null) {
            return null;
        }
        return aue2.Strings;
    }

    public static <T> void c(T t, String string) {
        aue aue2 = auj.o(t);
        if (aue2 == null) {
            return;
        }
        auj.a(aue2, t, new auf(string), null);
    }

    public static <T, ST> void b(T t, ST ST, String string) {
        aue aue2 = auj.a(t, ST, false);
        if (aue2 == null) {
            return;
        }
        auj.a(aue2, ST, new auf(string), auj.o(t));
    }

    private static boolean a(aue aue2, auf auf2) {
        HashSet<auf> hashSet;
        if (aue2.Strings == null) {
            aue2.Strings = new auf[0];
        }
        if (!(hashSet = new HashSet<auf>(Arrays.asList(aue2.Strings))).add(auf2)) {
            return false;
        }
        aue2.Strings = hashSet.toArray(new auf[hashSet.size()]);
        aue2.Effect = null;
        aue2.ParameterCount = anl.a.Values.size();
        return true;
    }

    private static <T> aue o(T t) {
        return ccy.k(t);
    }

    private static <N, T> aue a(N n, T t, boolean bl) {
        aue aue2 = auj.o(n);
        if (aue2 == null) {
            return null;
        }
        if (bl) {
            return aue2.k(t);
        }
        return aue2.j(t);
    }

    private static <T> void a(aue aue2, T t, auf auf2, aue aue3) {
        auf[] aufArray = aue2.Strings;
        if (aufArray == null) {
            return;
        }
        HashSet<auf> hashSet = new HashSet<auf>(Arrays.asList(aufArray));
        hashSet.removeAll(Arrays.asList(auf2));
        aue2.Strings = hashSet.toArray(new auf[hashSet.size()]);
        if (aue2.Strings == null || aue2.Strings.length == 0) {
            aue2.a(new aue());
        }
        if (aue3 == null) {
            return;
        }
        if (t == null) {
            return;
        }
        if (aue2.Strings == null || aue2.Strings.length == 0) {
            aue3.l(t);
        }
    }
}


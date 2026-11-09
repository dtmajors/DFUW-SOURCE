/*
 * Decompiled with CFR.
 */
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

public class jox<C extends jpf> {
    private static final lip nKS = new ljg("+");
    protected static final joi nHy = joi.nHV;
    public final jpj jWW;
    public final Set<jpb> kvi;
    public final C nKT;

    public static boolean a(jox<? extends jpf> jox2, jox<? extends jpf> jox3) {
        return lin.i(jox2, jox3);
    }

    public static jox<? extends jpf> a(String string, jpj jpj2) {
        Object object;
        EnumSet<jpb> enumSet;
        int n = string.lastIndexOf(43);
        if (n == -1) {
            enumSet = EnumSet.noneOf(jpb.class);
        } else {
            object = string.substring(0, n);
            string = string.substring(n + 1);
            enumSet = jox.b((String)object, jpj2);
        }
        object = jpj2.ta(string);
        if (object == null) {
            throw new IllegalArgumentException(string);
        }
        return new jox<Object>(jpj2, object, enumSet);
    }

    public jox(jpj jpj2, C c2, Set<jpb> set) {
        assert (jpj2 != null);
        assert (c2 != null);
        assert (set != null);
        this.jWW = jpj2;
        this.nKT = c2;
        this.kvi = Collections.unmodifiableSet(set);
    }

    public final lip awO() {
        return new ljg(this.dPf());
    }

    public final boolean a(jox<? extends jpf> jox2) {
        return this.nKT == jox2.nKT && ((Object)this.kvi).equals(jox2.kvi);
    }

    public final String dPf() {
        String string;
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.nKT.getName();
        if (this.jWW.ta(string2) != this.nKT) {
            stringBuilder.append(this.nKT.dPm().getName());
            stringBuilder.append(":");
        }
        if ((string = jox.a(this.kvi, this.jWW)).length() > 0 && !string.equals(string2)) {
            stringBuilder.append(string);
            stringBuilder.append("+");
        }
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public int hashCode() {
        int n = this.nKT.dPn() << 16;
        return n |= ((Object)this.kvi).hashCode();
    }

    public boolean equals(Object object) {
        if (object instanceof jox) {
            return this.a((jox)object);
        }
        if (object == null) {
            return false;
        }
        assert (false);
        return false;
    }

    public String toString() {
        return null;
    }

    private static String a(Set<jpb> set, jpj jpj2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (jpb jpb2 : set) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("+");
            }
            jpf jpf2 = jpj2.a(jpb2);
            stringBuilder.append(jpf2.getName());
        }
        return stringBuilder.toString();
    }

    private static boolean a(jpf jpf2) {
        for (jpb jpb2 : jpb.ListOfValue) {
            if (!jpb2.name().equals(jpf2.getName())) continue;
            return true;
        }
        return false;
    }

    private static EnumSet<jpb> b(String string, jpj jpj2) {
        EnumSet<jpb> enumSet = EnumSet.noneOf(jpb.class);
        int n = string.length();
        int n2 = 0;
        while (n2 < n) {
            String string2;
            jpf jpf2;
            int n3 = string.indexOf(43, n2);
            if (n3 == -1) {
                n3 = n;
            }
            if ((jpf2 = jpj2.ta(string2 = string.substring(n2, n3))) == null) {
                throw new IllegalArgumentException();
            }
            jpb jpb2 = jpj2.b(jpf2);
            if (jpb2 == null) {
                throw new IllegalArgumentException();
            }
            if (enumSet.contains((Object)jpb2)) {
                // empty if block
            }
            enumSet.add(jpb2);
            n2 = n3 + 1;
        }
        return enumSet;
    }
}


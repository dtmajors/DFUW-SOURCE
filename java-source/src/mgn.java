/*
 * Decompiled with CFR.
 */
import java.util.Map;
import java.util.Set;

public class mgn {
    public static final Map<Integer, mgm> DvR = lcn.emw();
    private static Set DvS = null;

    public static void a(mgm mgm2) {
        DvR.put(new Integer(mgm2.getId()), mgm2);
    }

    public static mgm aeh(int n) {
        return DvR.get(new Integer(n));
    }

    public static Set eyM() {
        return DvS;
    }

    public static void u(Set set) {
        DvS = set;
    }
}


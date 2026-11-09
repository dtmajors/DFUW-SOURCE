/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.Map;

public class asf {
    private static Map<Integer, Map<a, Integer>> bTN = lcn.emw();

    public static void hV(int n) {
        if (bTN.containsKey(n)) {
            return;
        }
        Map<a, Integer> map = lcn.R(a.enumSize(), 1.0f);
        for (a a2 : a.Values) {
            long l2 = Long.valueOf(a2.ordinal()) << 32;
            int n2 = n;
            l2 |= (long)n2;
            while (!lea.epk().containsKey(l2) && n2 != cug.fgG) {
                l2 &= 0xFFFFFFFF00000000L;
                n2 = cug.uW((int)n2);
                l2 |= (long)n2;
            }
            if (!lea.epk().containsKey(l2)) {
                n2 = -1;
            }
            map.put(a2, n2);
        }
        bTN.put(n, map);
    }

    public static int a(int n, a a2) {
        Integer n2 = n;
        if (!bTN.containsKey(n2)) {
            return -1;
        }
        return bTN.get(n2).get((Object)a2);
    }
}


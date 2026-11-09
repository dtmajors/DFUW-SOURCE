/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class dco {
    private Map<Integer, Map<Integer, Map<Integer, Integer>>> gdi = lcn.emw();

    public int r(int n2, int n3, int n4) {
        Map<Integer, Map<Integer, Integer>> map = this.gdi.get(n2);
        if (map == null) {
            return -1;
        }
        Map<Integer, Integer> map2 = map.get(n3);
        if (map2 == null) {
            return -1;
        }
        Integer n5 = map2.get(n4);
        return n5 != null ? n5 : -1;
    }

    public void d(int n2, int n3, int n4, int n5) {
        Map<Integer, Integer> map;
        Map<Integer, Map<Integer, Integer>> map2 = this.gdi.get(n2);
        if (map2 == null) {
            map2 = lcn.emw();
            this.gdi.put(n2, map2);
        }
        if ((map = map2.get(n3)) == null) {
            map = lcn.emw();
            map2.put(n3, map);
        }
        map.put(n4, n5);
    }
}


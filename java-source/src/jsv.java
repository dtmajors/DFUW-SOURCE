/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcw
 */
import java.util.List;
import java.util.Map;

public class jsv {
    private static final String oa = lcw.qLb + "xml/audio/monsters_new/";
    private static final String ob = "audio/monsters_new/";

    public static void e(Map<Long, List<Integer>> map, Map<Integer, String> map2) {
        jrw jrw2 = new jrw(oa);
        if (!jrw2.exists()) {
            return;
        }
        jrw[] jrwArray = jrw2.dRT();
        Object[][] objectArray = new Object[asf.a.enumSize()][2];
        int n = 0;
        for (asf.a jrwArray2 : asf.a.Values) {
            objectArray[n][0] = jrwArray2.name().toLowerCase();
            objectArray[n][1] = (long)jrwArray2.ordinal();
            ++n;
        }
        int n2 = 1;
        for (jrw jrw3 : jrwArray) {
            jrw[] jrwArray2;
            if (!jrw3.isDirectory()) continue;
            for (jrw jrw4 : jrwArray2 = jrw3.dRT()) {
                jrw[] jrwArray3;
                int n3;
                if (!jrw4.isDirectory() || (n3 = cug.ih((String)"r_".concat(jrw3.getName()))) <= 0) continue;
                long l = -1L;
                for (Object[] objectArray2 : objectArray) {
                    if (!((String)objectArray2[0]).contains(jrw4.getName().toLowerCase())) continue;
                    l = (Long)objectArray2[1] << 32;
                    l |= (long)n3;
                    break;
                }
                if (l < 0L) {
                    assert (false);
                    continue;
                }
                Long l2 = l;
                for (jrw jrw5 : jrwArray3 = jrw4.dRT()) {
                    String string;
                    if (!jrw5.isFile() || !(string = jrw5.getName().toLowerCase()).endsWith(".xml")) continue;
                    String string2 = ob + jrw3.getName() + '/' + jrw4.getName() + '/' + string;
                    map2.put(n2, string2);
                    List<Integer> list = map.get(l2);
                    if (list == null) {
                        list = lcn.emv();
                        map.put(l2, list);
                    }
                    list.add(n2);
                    ++n2;
                }
            }
        }
    }
}


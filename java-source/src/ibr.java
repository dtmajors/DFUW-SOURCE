/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ibr {
    private static final ibs[] lGi = ibr.cNo();
    private static final Map<String, ibs> lGj = ibr.cNp();

    public static ibs[] cNn() {
        return lGi;
    }

    public static ibs pD(String string) {
        return lGj.get(string);
    }

    private static ibs[] cNo() {
        ibs[] ibsArray;
        ArrayList<ibs> arrayList = lcn.emv();
        for (ibs ibs2 : ibsArray = ibz.cNn()) {
            ibr.a(ibs2, arrayList);
        }
        return arrayList.toArray(new ibs[arrayList.size()]);
    }

    private static void a(ibs ibs2, List<ibs> list) {
        list.add(ibs2);
        List<ibs> list2 = ibs2.getChildren();
        if (list2 != null) {
            for (ibs ibs3 : list2) {
                ibr.a(ibs3, list);
            }
        }
    }

    private static Map<String, ibs> cNp() {
        Map<String, ibs> map = lcn.emw();
        for (ibs ibs2 : lGi) {
            map.put(ibs2.getId(), ibs2);
        }
        return map;
    }
}


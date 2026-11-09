/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class ibz {
    private static final ibs[] lGi = ibz.cNo();
    private static final Map<String, ibs> lGj = ibz.cNp();

    public static ibs[] cNn() {
        return lGi;
    }

    public static ibs pD(String string) {
        return lGj.get(string);
    }

    private static ibs[] cNo() {
        ibx[] ibxArray = iby.cNC();
        ibu[] ibuArray = ibv.cNA();
        ibs[] ibsArray = new ibs[ibxArray.length + ibuArray.length];
        int n = 0;
        for (ibu ibs2 : ibuArray) {
            ibsArray[n] = ibs2;
            ++n;
        }
        ibs[] ibsArray2 = ibxArray;
        int n2 = ibsArray2.length;
        for (int j = 0; j < n2; ++j) {
            ibs ibs2;
            ibsArray[n] = ibs2 = ibsArray2[j];
            ++n;
        }
        return ibsArray;
    }

    private static Map<String, ibs> cNp() {
        Map<String, ibs> map = lcn.emw();
        for (ibs ibs2 : lGi) {
            map.put(ibs2.getId(), ibs2);
        }
        return map;
    }
}


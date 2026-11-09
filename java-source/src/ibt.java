/*
 * Decompiled with CFR.
 */
public class ibt {
    private static final ibs[] lGi = ibt.cNo();

    public static ibs[] cNn() {
        return lGi;
    }

    private static ibs[] cNo() {
        ibx[] ibxArray = iby.cNC();
        ibu[] ibuArray = ibv.cNA();
        ibs[] ibsArray = new ibs[ibxArray.length + ibuArray.length];
        int n = 0;
        for (ibx ibs2 : ibxArray) {
            ibsArray[n] = ibs2;
            ++n;
        }
        ibs[] ibsArray2 = ibuArray;
        int n2 = ibsArray2.length;
        for (int j = 0; j < n2; ++j) {
            ibs ibs2;
            ibsArray[n] = ibs2 = ibsArray2[j];
            ++n;
        }
        return ibsArray;
    }
}


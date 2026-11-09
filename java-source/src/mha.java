/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class mha {
    public static String Dwv;
    public static Map<String, mhb> Dww;
    public static List<String> Dwx;
    public static int ejG;
    private static jxa Dwz;
    private static jxd Dwy;

    private mha() {
    }

    public static void eyV() {
        Dww = lcn.emw();
        Dwx = lcn.emv();
        ejG = 0;
    }

    public static void ci(List<jrw> list) {
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            jrw jrw2 = list.get(i);
            if (!jrw2.exists() || !jrw2.isFile()) continue;
            String string = Dwz.q(jrw2);
            mhb mhb2 = Dww.get(string = string.toLowerCase());
            if (mhb2 == null) {
                mhb2 = new mhb(string, 0);
            }
            mhb2.aei(mhb2.eyW() + 1);
            Dww.put(string, mhb2);
            ++ejG;
        }
    }

    static {
        Dww = lcn.emw();
        Dwx = lcn.emv();
        ejG = 0;
        Dwz = new jxa();
        Dwy = new jxd();
    }
}


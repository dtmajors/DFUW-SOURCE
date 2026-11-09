/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class mgz {
    public static String Dwv;
    public static Map<String, mhb> Dww;
    public static List<String> Dwx;
    public static int ejG;
    private static jxd Dwy;

    private mgz() {
    }

    public static void eyV() {
        Dww = lcn.emw();
        Dwx = lcn.emv();
        ejG = 0;
    }

    public static void N(jrw jrw2) {
        Map<ldv, amf> map2 = Dwy.c(jrw2, false);
        Collection<amf> collection = map2.values();
        for (amf amf2 : collection) {
            String string = amf2.getObjectDescriptionFilename().toLowerCase();
            mhb mhb2 = Dww.get(string);
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
        Dwy = new jxd();
    }
}


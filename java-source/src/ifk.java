/*
 * Decompiled with CFR.
 */
import java.util.HashMap;

public class ifk {
    public static float lRm = Float.MAX_VALUE;
    private static HashMap<cgi, ifv> lRn = new HashMap();
    private static HashMap<Integer, Float> lRo = new HashMap();

    public static void cSn() {
        lRo.clear();
        lRm = Float.MAX_VALUE;
    }

    public static float a(ljq ljq2, boolean bl, cgr cgr2, ljq ljq3) {
        Float f = lRo.get(cgr2.adk);
        if (f != null) {
            return f.floatValue();
        }
        if (cgr2.eyU == null) {
            return 0.0f;
        }
        ifv ifv2 = lRn.get((Object)cgr2.eyU.aOG());
        if (ifv2 == null) {
            return -1.0f;
        }
        float f2 = ifv2.a(ljq2, bl, cgr2.eyU, ljq3);
        if (f2 >= 0.0f) {
            lRo.put(cgr2.adk, Float.valueOf(f2));
        }
        return f2;
    }

    static void cSo() {
        lRn.put(cgi.CRAFTING, new ifx());
        lRn.put(cgi.BUY, new ifw());
        lRn.put(cgi.SKIN, new igc());
        lRn.put(cgi.FEAT, new ifz());
        lRn.put(cgi.TRANSFER, new igd());
        lRn.put(cgi.LIFE_MODE_CHANGES, new iga());
    }
}


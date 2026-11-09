/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.Collection;
import org.w3c.dom.Document;

public class ayi {
    public static final boolean cxW = true;
    public static final boolean cxX = true;
    public static final boolean cxY = false;
    public static final boolean cxZ = false;
    public static final boolean cya = true;
    public static final int cyb = 100;
    public static final long cyc = 86400000L;
    public static final long cyd = 10000L;
    public static final int cye = 3;
    public static final String cyf = "^[a-zA-Z0-9 _]+$";
    public static final int cyg = 0;
    public static final int cyh = 100;
    public static final int cyi = 0;
    public static final int cyj = 200;
    public static final int cyk = 2000;
    public static final double cyl = 2700.0;
    public static final long cym = 259200000L;
    public static final long cyn = 3600000L;
    public static final boolean cyo = true;
    public static final long cyp = 1800000L;
    public static final long cyq = 259200000L;
    public static final float cyr = 0.5f;
    public static final float cys = 0.5f;
    public static final float cyt = 0.5f;
    public static final boolean cyu = true;
    public static final boolean cyv = true;
    public static final boolean cyw = true;
    public static final int cyx = 100;
    public static final int cyy = 20;
    public static final int cyz = 10;
    public static final hc cyA = hc.aaP;
    public static final hc cyB = hc.aaP;
    public static final hc cyC = hc.aaP;
    public static final hc cyD = hc.aaP;
    public static final hc cyE = hc.aaP;
    private static Collection<cu.a> kO = null;

    public static int aaK() {
        return lcw.emW() ? 14 : 30;
    }

    private static void aaL() {
        if (kO == null) {
            try {
                Document document = jsy.tJ("xml-files/client/cc_config/" + (lcw.emW() ? "blacklist_kr.xml" : "blacklist.xml"));
                kO = cu.a.b(document);
            }
            catch (bo bo2) {
                lfn.b(5, "SFClanConstants", "loadBlacklist() : Document Parse Exception: " + bo2);
            }
        }
    }

    public static c eQ(String string) {
        int n;
        if (string == null || string.isEmpty() || string.length() < 3) {
            return c.cyR;
        }
        if (string.length() > ayi.aaK()) {
            return c.cyS;
        }
        for (n = 0; n < string.length(); ++n) {
            if (Character.isLetterOrDigit(string.charAt(n)) || string.charAt(n) == ' ' || string.charAt(n) == '_') continue;
            return c.cyT;
        }
        if (!string.trim().equals(string)) {
            return c.cyU;
        }
        n = 0;
        for (int i = 0; i < string.length(); ++i) {
            int n2 = n = Character.isWhitespace(string.charAt(i)) ? n + 1 : 0;
            if (n <= 1) continue;
            return c.cyV;
        }
        ayi.aaL();
        if (kO != null) {
            for (cu.a a2 : kO) {
                if (!a2.d(string, null) && !a2.d(null, string)) continue;
                return c.cyW;
            }
        }
        return c.cyX;
    }

    public static b eR(String string) {
        if (string == null || string.length() < 0) {
            return b.cyM;
        }
        if (string.length() > 100) {
            return b.cyN;
        }
        ayi.aaL();
        if (kO != null) {
            for (cu.a a2 : kO) {
                if (!a2.d(string, null) && !a2.d(null, string)) continue;
                return b.cyO;
            }
        }
        return b.cyP;
    }

    public static a eS(String string) {
        if (string == null || string.length() < 0) {
            return a.cyF;
        }
        if (string.length() > 200) {
            return a.cyG;
        }
        ayi.aaL();
        if (kO != null) {
            for (cu.a a2 : kO) {
                if (!a2.d(string, null) && !a2.d(null, string)) continue;
                return a.cyH;
            }
        }
        return a.cyI;
    }
}


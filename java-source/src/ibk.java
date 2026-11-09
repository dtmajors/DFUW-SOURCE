/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.Map;

public class ibk {
    private static final double lFd = 10.0;
    static Map<aud.a, Double> lFe = lcn.emw();
    static double lFf = 0.0;
    static double lFg = 0.0;

    public static Double e(aud.a a2) {
        return lFe.get((Object)a2);
    }

    public static boolean a(aud.a a2, String string, int n, Double d2) {
        double d3;
        if (n < 200) {
            return true;
        }
        Double d4 = lFe.get((Object)a2);
        if (d4 != null && (d3 = d2 - d4) <= 20.0) {
            return false;
        }
        lFe.put(a2, d2);
        return true;
    }

    public static boolean a(aud.a a2, double d2) {
        if (!lcw.emW()) {
            return true;
        }
        if (a2 == aud.a.cap) {
            if (d2 - lFf < 10.0) {
                return false;
            }
            lFf = d2;
        } else if (a2 == aud.a.caK) {
            if (d2 - lFg < 10.0) {
                return false;
            }
            lFg = d2;
        }
        return true;
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 */
import java.util.Map;

public class azi {
    private static int cEq = 0;
    private static float cEr = 0.1f;
    private static Map<ayb, int[]> cEs = lcn.emw();
    private static int cEt = 10;
    private static Map<ayb, Integer> cEu = lcn.emw();
    private static float cEv = 1.0f;
    private static boolean cEw = false;
    private static float cEx = 1.0f;
    private static int cEy = 0;
    private static int cEz = 0;
    private static int cEA = 0;
    private static int cEB = 0;

    public static int ada() {
        return cEq;
    }

    public static float adb() {
        return cEr;
    }

    public static int aas() {
        return cEt;
    }

    public static int adc() {
        return cEy;
    }

    public static int add() {
        return cEz;
    }

    static Map<ayb, int[]> ade() {
        return cEs;
    }

    static Map<ayb, Integer> adf() {
        return cEu;
    }

    static float adg() {
        return cEv;
    }

    static boolean adh() {
        return cEw;
    }

    static float adi() {
        return cEx;
    }

    private azi() {
    }

    public static int a(ayb ayb2, int n) {
        if (ayb2 == null || n < 0) {
            return Integer.MAX_VALUE;
        }
        int[] nArray = cEs.get((Object)ayb2);
        if (nArray == null || nArray.length == 0) {
            return 0;
        }
        int n2 = n;
        if (n2 >= nArray.length) {
            n2 = nArray.length - 1;
        }
        return nArray[n2];
    }

    public static int a(ayb ayb2, azh azh2, boolean bl, int n, ayd ayd2) {
        if (ayb2 == null || azh2 == null) {
            return 0;
        }
        int n2 = 0;
        if (cEu.containsKey((Object)ayb2)) {
            n2 = cEu.get((Object)ayb2);
        }
        int n3 = cEw ? ayd2.d(ayb2) : ayd2.aay();
        int n4 = bl ? (int)(cEx * (float)n) : 0;
        int n5 = azh2.getLength();
        return (int)(((float)n3 * cEv + 1.0f) * (float)((n2 + n4) * (n5 /= 3600)));
    }

    public static int b(ayb ayb2, azh azh2, boolean bl, int n, ayd ayd2) {
        int n2;
        if (ayb2 == null || azh2 == null) {
            return 0;
        }
        int n3 = 0;
        if (cEu.containsKey((Object)ayb2)) {
            n3 = cEu.get((Object)ayb2);
        }
        if ((n2 = (cEw ? ayd2.d(ayb2) : ayd2.aay()) - 1) < 0) {
            n2 = 0;
        }
        int n4 = bl ? (int)(cEx * (float)n) : 0;
        int n5 = azh2.getLength();
        return (int)(((float)n2 * cEv + 1.0f) * (float)((n3 + n4) * (n5 /= 3600)));
    }

    public static void adj() {
        jtt jtt2 = new jtt();
        jtt2.dTi();
        cEq = jtt2.dTb();
        cEr = jtt2.adb();
        cEs = jtt2.ade();
        cEy = jtt2.dTc();
        cEz = jtt2.dTd();
        cEu = jtt2.adf();
        cEv = jtt2.adg();
        cEw = jtt2.adh();
        cEA = jtt2.dTe();
        cEB = jtt2.dTf();
        cEx = jtt2.dTh();
        Map<String, Integer> map = jtt2.dTg();
        if (map.containsKey("IssueMercenaryContract")) {
            cEt = map.get("IssueMercenaryContract");
        }
    }
}


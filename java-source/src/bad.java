/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 *  cug
 */
import java.util.Map;

public class bad {
    private static Map<b, Double> cIZ = lcn.emw();
    private static Map<b, Integer> cJa = lcn.emw();
    private static Map<b, Float> cJb = lcn.emw();
    private static Map<b, Boolean> cJc = lcn.emw();
    private static Map<b, String> cJd = lcn.emw();
    private static Map<b, int[]> cJe = lcn.emw();
    private static Map<b, Enum> cJf = lcn.emw();
    private static Map<b, Object> cJg = lcn.emw();

    public static boolean afX() {
        return cJc.get((Object)b.cJG);
    }

    public static double afY() {
        return cIZ.get((Object)b.cJr);
    }

    public static double afZ() {
        return cIZ.get((Object)b.cJs);
    }

    public static boolean aga() {
        return cJc.get((Object)b.cJQ);
    }

    public static boolean agb() {
        return cJc.get((Object)b.cKJ);
    }

    public static boolean agc() {
        return cJc.get((Object)b.cKE);
    }

    public static boolean agd() {
        return cJc.get((Object)b.cKF);
    }

    public static boolean age() {
        return cJc.get((Object)b.cKG);
    }

    public static boolean agf() {
        return cJc.get((Object)b.cKH);
    }

    public static float agg() {
        return cJb.get((Object)b.cKg).floatValue();
    }

    public static float agh() {
        return cJb.get((Object)b.cKh).floatValue();
    }

    public static float agi() {
        return cJb.get((Object)b.cKi).floatValue();
    }

    public static double agj() {
        return cIZ.get((Object)b.cJt);
    }

    public static double agk() {
        return cIZ.get((Object)b.cJu);
    }

    public static double agl() {
        return cIZ.get((Object)b.cJv);
    }

    public static double agm() {
        return cIZ.get((Object)b.cJw);
    }

    public static double agn() {
        return cIZ.get((Object)b.cJx);
    }

    public static double ago() {
        return cIZ.get((Object)b.cJy);
    }

    public static double agp() {
        return cIZ.get((Object)b.cJz);
    }

    public static double agq() {
        return cIZ.get((Object)b.cJA);
    }

    public static double agr() {
        return cIZ.get((Object)b.cJB);
    }

    public static double ags() {
        return cIZ.get((Object)b.cJC);
    }

    public static double agt() {
        return cIZ.get((Object)b.cJD);
    }

    public static double agu() {
        return cIZ.get((Object)b.cJE);
    }

    public static double agv() {
        return cIZ.get((Object)b.cJF);
    }

    public static int agw() {
        return cJa.get((Object)b.cJH);
    }

    public static int agx() {
        return cJa.get((Object)b.cJI);
    }

    public static int agy() {
        return cJa.get((Object)b.cJJ);
    }

    public static int agz() {
        return cJa.get((Object)b.cJK);
    }

    public static int i(ayb ayb2) {
        return ayb2 == ayb.cvk ? cJa.get((Object)b.cJL).intValue() : cJa.get((Object)b.cJM).intValue();
    }

    public static boolean agA() {
        return cJc.get((Object)b.cJN);
    }

    public static boolean agB() {
        return cJc.get((Object)b.cJO);
    }

    public static boolean agC() {
        return cJc.get((Object)b.cJP);
    }

    public static float agD() {
        return cJb.get((Object)b.cKa).floatValue();
    }

    public static float agE() {
        return cJb.get((Object)b.cKb).floatValue();
    }

    public static float agF() {
        return cJb.get((Object)b.cKc).floatValue();
    }

    public static float agG() {
        return cJb.get((Object)b.cKd).floatValue();
    }

    public static boolean agH() {
        return cJc.get((Object)b.cKe);
    }

    public static bax agI() {
        return (bax)cJf.get((Object)b.cKf);
    }

    public static float agJ() {
        return cJb.get((Object)b.cKj).floatValue();
    }

    public static boolean agK() {
        return cJc.get((Object)b.cKk);
    }

    public static int agL() {
        return cJa.get((Object)b.cKl);
    }

    public static int j(ayb ayb2) {
        return ayb2 == ayb.cvk ? cJa.get((Object)b.cKm).intValue() : cJa.get((Object)b.cKn).intValue();
    }

    public static float agM() {
        return cJb.get((Object)b.cKo).floatValue();
    }

    public static float agN() {
        return cJb.get((Object)b.cKp).floatValue();
    }

    public static float agO() {
        return cJb.get((Object)b.cKq).floatValue();
    }

    public static float agP() {
        return cJb.get((Object)b.cKw).floatValue();
    }

    public static float agQ() {
        return cJb.get((Object)b.cKx).floatValue();
    }

    public static boolean a(int n, ayb ayb2) {
        int[] nArray;
        if (!lea.enW().isDescendant(n, cug.fpU)) {
            return false;
        }
        int[] nArray2 = nArray = ayb2 == ayb.cvk ? cJe.get((Object)b.cKt) : cJe.get((Object)b.cKu);
        if (nArray == null) {
            String string = ayb2 == ayb.cvk ? cJd.get((Object)b.cKr) : cJd.get((Object)b.cKs);
            String[] stringArray = string.split(",");
            nArray = new int[stringArray.length];
            for (int i = 0; i < nArray.length; ++i) {
                nArray[i] = cug.ih((String)stringArray[i]);
            }
            if (ayb2 == ayb.cvk) {
                cJe.put(b.cKt, nArray);
            } else if (ayb2 == ayb.cvj) {
                cJe.put(b.cKu, nArray);
            }
        }
        for (int i = 0; i < nArray.length; ++i) {
            if (nArray[i] != n) continue;
            return true;
        }
        return false;
    }

    public static boolean agR() {
        return cJc.get((Object)b.cKv);
    }

    public static float agS() {
        return cJb.get((Object)b.cKy).floatValue();
    }

    public static int agT() {
        return cJa.get((Object)b.cKz);
    }

    public static boolean agU() {
        return cJc.get((Object)b.cKA);
    }

    public static boolean agV() {
        return cJc.get((Object)b.cKB);
    }

    public static boolean agW() {
        return cJc.get((Object)b.cKC);
    }

    public static boolean agX() {
        return cJc.get((Object)b.cKD);
    }

    public static azs agY() {
        return (azs)cJf.get((Object)b.cKK);
    }

    public static float agZ() {
        return cJb.get((Object)b.cKL).floatValue();
    }

    public static int aha() {
        return cJa.get((Object)b.cKM);
    }

    public static int ahb() {
        return cJa.get((Object)b.cKN);
    }

    public static int ahc() {
        return cJa.get((Object)b.cKO);
    }

    public static int ahd() {
        return cJa.get((Object)b.cKP);
    }

    public static boolean ahe() {
        return cJc.get((Object)b.cKJ);
    }

    public static boolean ahf() {
        return cJc.get((Object)b.cKI);
    }

    public static boolean ahg() {
        return cJc.get((Object)b.cJR);
    }

    public static int a(int n, boolean bl, ayb ayb2) {
        int n2;
        int n3 = n * cJa.get((Object)b.cJS);
        if (n3 < (n2 = bad.a(bl, ayb2))) {
            n3 = n2;
        }
        return cJc.get((Object)b.cKe) == false && bl ? 0 : n3;
    }

    private static int a(boolean bl, ayb ayb2) {
        switch (ayb2) {
            case cvj: {
                return bl ? cJa.get((Object)b.cJV).intValue() : cJa.get((Object)b.cJW).intValue();
            }
            case cvk: {
                return bl ? cJa.get((Object)b.cJT).intValue() : cJa.get((Object)b.cJU).intValue();
            }
        }
        return 0;
    }

    public static int Z(int n, int n2) {
        return (int)((float)n2 * cJb.get((Object)b.cJX).floatValue()) * n;
    }

    public static float ahh() {
        return cJb.get((Object)b.cJX).floatValue();
    }

    public static int aa(int n, int n2) {
        return (int)((float)n2 * cJb.get((Object)b.cJZ).floatValue()) * n;
    }

    public static float ahi() {
        return cJb.get((Object)b.cJZ).floatValue();
    }

    public static int ab(int n, int n2) {
        return (int)((float)n2 * cJb.get((Object)b.cJY).floatValue()) * n;
    }

    public static float ahj() {
        return cJb.get((Object)b.cJY).floatValue();
    }

    public static int jH(int n) {
        return (int)((float)n * cJb.get((Object)b.cKa).floatValue());
    }

    public static int ahk() {
        return cJa.get((Object)b.cJS);
    }

    public static int ahl() {
        return cJa.get((Object)b.cJW);
    }

    public static int ahm() {
        return cJa.get((Object)b.cJU);
    }

    public static boolean ahn() {
        return cJc.get((Object)b.cKR);
    }

    public static boolean aho() {
        return cJc.get((Object)b.cKQ);
    }

    public static int ahp() {
        return cJa.get((Object)b.cKS);
    }

    public static int ahq() {
        return cJa.get((Object)b.cKT);
    }

    public static int ahr() {
        return cJa.get((Object)b.cKU);
    }

    public static float ahs() {
        return cJb.get((Object)b.cKV).floatValue();
    }

    public static float aht() {
        return cJb.get((Object)b.cKW).floatValue();
    }

    public static float ahu() {
        return cJb.get((Object)b.cKX).floatValue();
    }

    public static float ahv() {
        return cJb.get((Object)b.cKY).floatValue();
    }

    public static float ahw() {
        return cJb.get((Object)b.cKZ).floatValue();
    }

    public static float ahx() {
        return cJb.get((Object)b.cLa).floatValue();
    }

    public static boolean ahy() {
        return cJc.get((Object)b.cLb);
    }

    public static boolean ahz() {
        return cJc.get((Object)b.cLc);
    }

    public static boolean ahA() {
        return cJc.get((Object)b.cLd);
    }

    public static String a(b b2) {
        if (b2 == null) {
            return "null";
        }
        switch (b2.ahC()) {
            case cJj: {
                return bad.aE(cIZ.get((Object)b2));
            }
            case cJk: {
                return Integer.toString(cJa.get((Object)b2));
            }
            case cJl: {
                return Float.toString(cJb.get((Object)b2).floatValue());
            }
            case cJm: {
                return Boolean.toString(cJc.get((Object)b2));
            }
            case cJn: {
                return cJd.get((Object)b2);
            }
            case cJp: {
                return cJf.get((Object)b2).toString();
            }
            case cJo: {
                int[] nArray = cJe.get((Object)b2);
                if (nArray == null) {
                    return "null";
                }
                int n = nArray == null ? 0 : nArray.length;
                String string = n == 0 ? "null" : Integer.toString(nArray[0]);
                for (int i = 1; i < n; ++i) {
                    string = string + ", " + Integer.toString(nArray[i]);
                }
                return "[" + string + "]";
            }
        }
        return "null";
    }

    public static void a(b b2, double d2) {
        if (bad.b(b2, d2) == c.cLs) {
            cIZ.put(b2, b2.ahD() == d.cLx && d2 == 0.0 ? Double.MAX_VALUE : d2);
        }
    }

    public static void a(b b2, int n) {
        if (bad.b(b2, n) == c.cLs) {
            cJa.put(b2, b2.ahD() == d.cLx && n == 0 ? Integer.MAX_VALUE : n);
        }
    }

    public static void a(b b2, float f) {
        if (bad.b(b2, f) == c.cLs) {
            cJb.put(b2, Float.valueOf(b2.ahD() == d.cLx && f == 0.0f ? Float.MAX_VALUE : f));
        }
    }

    public static void a(b b2, boolean bl) {
        if (bad.b(b2, bl) == c.cLs) {
            cJc.put(b2, bl);
        }
    }

    public static void a(b b2, String string) {
        if (bad.b(b2, string) == c.cLs) {
            cJd.put(b2, string);
        }
    }

    public static void a(b b2, Enum enum_) {
        if (bad.b(b2, enum_) == c.cLs) {
            cJf.put(b2, enum_);
        }
    }

    public static void a(b b2, int[] nArray) {
        if (bad.b(b2, nArray) == c.cLs) {
            cJe.put(b2, nArray);
        }
    }

    public static c b(b b2, double d2) {
        if (b2 == null) {
            return c.cLi;
        }
        if (b2.ahC() != a.cJj) {
            return c.cLj;
        }
        switch (b2.ahD()) {
            case cLu: {
                break;
            }
            case cLv: {
                if (!(d2 < 0.0)) break;
                return c.cLk;
            }
            case cLw: {
                if (!(d2 <= 0.0)) break;
                return c.cLl;
            }
            case cLA: {
                if (!cJg.containsKey((Object)b2)) {
                    return c.cLi;
                }
                Object object = cJg.get((Object)b2);
                if (object instanceof b) {
                    b b3 = (b)((Object)object);
                    if (b3.ahC() != b2.ahC()) {
                        return c.cLj;
                    }
                    double d3 = cIZ.get((Object)b3);
                    if (!(d2 > d3)) break;
                    return c.cLn;
                }
                if (object instanceof b[]) {
                    b[] bArray;
                    for (b b4 : bArray = (b[])object) {
                        if (b4.ahC() == b2.ahC()) continue;
                        return c.cLj;
                    }
                    for (b b4 : bArray) {
                        double d4 = cIZ.get((Object)b4);
                        if (!(d2 > d4)) continue;
                        return c.cLn;
                    }
                    break;
                }
                return c.cLi;
            }
            case cLB: {
                if (!cJg.containsKey((Object)b2)) {
                    return c.cLi;
                }
                Object object = cJg.get((Object)b2);
                if (object instanceof b) {
                    b b5 = (b)((Object)object);
                    if (b5.ahC() != b2.ahC()) {
                        return c.cLj;
                    }
                    double d5 = cIZ.get((Object)b5);
                    if (!(d2 < d5)) break;
                    return c.cLo;
                }
                if (object instanceof b[]) {
                    b[] bArray;
                    for (b b6 : bArray = (b[])object) {
                        if (b6.ahC() == b2.ahC()) continue;
                        return c.cLj;
                    }
                    for (b b6 : bArray) {
                        double d6 = cIZ.get((Object)b6);
                        if (!(d2 < d6)) continue;
                        return c.cLo;
                    }
                    break;
                }
                return c.cLi;
            }
            default: {
                return c.cLi;
            }
        }
        return c.cLs;
    }

    public static c b(b b2, int n) {
        if (b2 == null) {
            return c.cLi;
        }
        if (b2.ahC() != a.cJk) {
            return c.cLj;
        }
        switch (b2.ahD()) {
            case cLu: {
                break;
            }
            case cLv: 
            case cLx: {
                if (n >= 0) break;
                return c.cLk;
            }
            case cLw: {
                if (n > 0) break;
                return c.cLl;
            }
            case cLA: {
                if (!cJg.containsKey((Object)b2)) {
                    return c.cLi;
                }
                Object object = cJg.get((Object)b2);
                if (object instanceof b) {
                    b b3 = (b)((Object)object);
                    if (b3.ahC() != b2.ahC()) {
                        return c.cLj;
                    }
                    int n2 = cJa.get((Object)b3);
                    if (n <= n2) break;
                    return c.cLn;
                }
                if (object instanceof b[]) {
                    b[] bArray;
                    for (b b4 : bArray = (b[])object) {
                        if (b4.ahC() == b2.ahC()) continue;
                        return c.cLj;
                    }
                    for (b b4 : bArray) {
                        int n3 = cJa.get((Object)b4);
                        if (n <= n3) continue;
                        return c.cLn;
                    }
                    break;
                }
                return c.cLi;
            }
            case cLB: {
                if (!cJg.containsKey((Object)b2)) {
                    return c.cLi;
                }
                Object object = cJg.get((Object)b2);
                if (object instanceof b) {
                    b b5 = (b)((Object)object);
                    if (b5.ahC() != b2.ahC()) {
                        return c.cLj;
                    }
                    int n4 = cJa.get((Object)b5);
                    if (n >= n4) break;
                    return c.cLo;
                }
                if (object instanceof b[]) {
                    b[] bArray;
                    for (b b6 : bArray = (b[])object) {
                        if (b6.ahC() == b2.ahC()) continue;
                        return c.cLj;
                    }
                    for (b b6 : bArray) {
                        int n5 = cJa.get((Object)b6);
                        if (n >= n5) continue;
                        return c.cLo;
                    }
                    break;
                }
                return c.cLi;
            }
            default: {
                return c.cLi;
            }
        }
        return c.cLs;
    }

    public static c b(b b2, float f) {
        if (b2 == null) {
            return c.cLi;
        }
        if (b2.ahC() != a.cJl) {
            return c.cLj;
        }
        switch (b2.ahD()) {
            case cLu: {
                break;
            }
            case cLv: 
            case cLz: {
                if (!(f < 0.0f)) break;
                return c.cLk;
            }
            case cLw: {
                if (!(f <= 0.0f)) break;
                return c.cLl;
            }
            case cLy: {
                if (!(f < 0.0f) && !(f > 1.0f)) break;
                return c.cLm;
            }
            case cLD: {
                b[] bArray;
                if (!cJg.containsKey((Object)b2)) {
                    return c.cLi;
                }
                Object object = cJg.get((Object)b2);
                if (!(object instanceof b[])) {
                    return c.cLi;
                }
                for (b b3 : bArray = (b[])object) {
                    if (b3.ahC() == b2.ahC()) continue;
                    return c.cLj;
                }
                float f2 = f;
                for (b b4 : bArray) {
                    f2 += cJb.get((Object)b4).floatValue();
                }
                if (!(f2 < 0.0f) && !(f2 > 1.0f)) break;
                return c.cLq;
            }
            case cLA: {
                if (!cJg.containsKey((Object)b2)) {
                    return c.cLi;
                }
                Object object = cJg.get((Object)b2);
                if (object instanceof b) {
                    b b5 = (b)((Object)object);
                    if (b5.ahC() != b2.ahC()) {
                        return c.cLj;
                    }
                    float f3 = cJb.get((Object)b5).floatValue();
                    if (!(f > f3)) break;
                    return c.cLn;
                }
                if (object instanceof b[]) {
                    b[] bArray;
                    for (b b6 : bArray = (b[])object) {
                        if (b6.ahC() == b2.ahC()) continue;
                        return c.cLj;
                    }
                    for (b b6 : bArray) {
                        float f4 = cJb.get((Object)b6).floatValue();
                        if (!(f > f4)) continue;
                        return c.cLn;
                    }
                    break;
                }
                return c.cLi;
            }
            case cLB: {
                if (!cJg.containsKey((Object)b2)) {
                    return c.cLi;
                }
                Object object = cJg.get((Object)b2);
                if (object instanceof b) {
                    b b7 = (b)((Object)object);
                    if (b7.ahC() != b2.ahC()) {
                        return c.cLj;
                    }
                    float f5 = cJb.get((Object)b7).floatValue();
                    if (!(f < f5)) break;
                    return c.cLo;
                }
                if (object instanceof b[]) {
                    b[] bArray;
                    for (b b8 : bArray = (b[])object) {
                        if (b8.ahC() == b2.ahC()) continue;
                        return c.cLj;
                    }
                    for (b b8 : bArray) {
                        float f6 = cJb.get((Object)b8).floatValue();
                        if (!(f < f6)) continue;
                        return c.cLo;
                    }
                    break;
                }
                return c.cLi;
            }
            default: {
                return c.cLi;
            }
        }
        return c.cLs;
    }

    public static c b(b b2, boolean bl) {
        if (b2 == null) {
            return c.cLi;
        }
        if (b2.ahC() != a.cJm) {
            return c.cLj;
        }
        return c.cLs;
    }

    public static c b(b b2, String string) {
        if (b2 == null || string == null || string.isEmpty()) {
            return c.cLi;
        }
        if (b2.ahC() != a.cJn) {
            return c.cLj;
        }
        switch (b2.ahD()) {
            case cLu: {
                break;
            }
            case cLE: {
                String[] stringArray;
                for (String string2 : stringArray = string.split(",")) {
                    if (cug.ih((String)string2.trim()) >= 0) continue;
                    return c.cLr;
                }
                break;
            }
            default: {
                return c.cLi;
            }
        }
        return c.cLs;
    }

    public static c b(b b2, Enum enum_) {
        Enum[] enumArray;
        if (b2 == null || enum_ == null) {
            return c.cLi;
        }
        if (b2.ahC() != a.cJp) {
            return c.cLj;
        }
        Object object = cJg.get((Object)b2);
        if (object == null || !(object instanceof Enum[])) {
            return c.cLi;
        }
        for (Enum enum_2 : enumArray = (Enum[])object) {
            if (enum_ != enum_2) continue;
            return c.cLs;
        }
        return c.cLi;
    }

    public static c b(b b2, int[] nArray) {
        if (b2 == null || nArray == null) {
            return c.cLi;
        }
        if (b2.ahC() != a.cJo) {
            return c.cLj;
        }
        switch (b2.ahD()) {
            case cLu: {
                break;
            }
            case cLE: {
                for (int n : nArray) {
                    if (lea.enW().contains(n)) continue;
                    return c.cLr;
                }
                break;
            }
            default: {
                return c.cLi;
            }
        }
        return c.cLs;
    }

    public static void ahB() {
        try {
            jwl jwl2 = new jwl();
            jwl2.dTi();
        }
        catch (bg bg2) {
            lfn.b(5, "SFClanConquestConstants", "loadConfigOptions() : Parser failed to load configuration XML-file!");
            assert (false);
            throw new bs("Conquest System Failed to Load Configuration File, System is Not Stable!", bg2);
        }
    }

    public static String aE(double d2) {
        int n = (int)(d2 + 0.5);
        int n2 = 0;
        if (n >= 60) {
            n2 = n / 60;
            n %= 60;
        }
        int n3 = 0;
        if (n2 >= 60) {
            n3 = n2 / 60;
            n2 %= 60;
        }
        int n4 = 0;
        if (n3 >= 24) {
            n4 = n3 / 24;
            n3 %= 24;
        }
        String string = "";
        if (n4 > 0) {
            string = string + Integer.toString(n4) + " Day" + (n4 > 1 ? "s" : "");
        }
        if (n3 > 0) {
            if (!string.isEmpty()) {
                string = string + " ";
            }
            string = string + Integer.toString(n3) + " Hour" + (n3 > 1 ? "s" : "");
        }
        if (n2 > 0) {
            if (!string.isEmpty()) {
                string = string + " ";
            }
            string = string + Integer.toString(n2) + " Minute" + (n2 > 1 ? "s" : "");
        }
        if (n4 == 0 && n > 0) {
            if (!string.isEmpty()) {
                string = string + " ";
            }
            string = string + Integer.toString(n) + " Second" + (n > 1 ? "s" : "");
        }
        return string;
    }

    public static void a(int n, String string, ayd ayd2, String string2, String string3) {
        if (n == 1) {
            // empty if block
        }
        if (n == 5) {
            lfn.b(n, string, string2 + "() " + (ayd2 == null ? "" : "['" + ayd2.iV() + "' " + ayd2.getGUID() + "] ") + ": " + string3);
        }
    }

    static {
        cIZ.put(b.cJr, 79200.0);
        cIZ.put(b.cJs, 7200.0);
        cIZ.put(b.cJt, 3600.0);
        cIZ.put(b.cJu, 3600.0);
        cIZ.put(b.cJv, 86400.0);
        cIZ.put(b.cJw, 3600.0);
        cIZ.put(b.cJx, 600.0);
        cIZ.put(b.cJy, 60.0);
        cIZ.put(b.cJz, 1800.0);
        cIZ.put(b.cJA, 86400.0);
        cIZ.put(b.cJB, 21600.0);
        cIZ.put(b.cJC, 43200.0);
        cIZ.put(b.cJD, 43200.0);
        cIZ.put(b.cJE, 86400.0);
        cIZ.put(b.cJF, 172800.0);
        cJa.put(b.cJH, 1);
        cJa.put(b.cJI, 1);
        cJa.put(b.cJJ, 1);
        cJa.put(b.cJK, 1);
        cJa.put(b.cJL, 1);
        cJa.put(b.cJM, 1);
        cJa.put(b.cJS, 10);
        cJa.put(b.cJT, 0);
        cJa.put(b.cJU, 20000);
        cJa.put(b.cJV, 0);
        cJa.put(b.cJW, 20000);
        cJa.put(b.cKl, 1);
        cJa.put(b.cKm, 3);
        cJa.put(b.cKn, 3);
        cJa.put(b.cKz, 20);
        cJa.put(b.cKM, 1);
        cJa.put(b.cKN, 1);
        cJa.put(b.cKO, 100);
        cJa.put(b.cKP, 100);
        cJa.put(b.cKS, 5);
        cJa.put(b.cKT, 5);
        cJa.put(b.cKU, 5);
        cJb.put(b.cJX, Float.valueOf(0.0f));
        cJb.put(b.cJY, Float.valueOf(0.0f));
        cJb.put(b.cJZ, Float.valueOf(0.0f));
        cJb.put(b.cKa, Float.valueOf(0.0f));
        cJb.put(b.cKb, Float.valueOf(0.0f));
        cJb.put(b.cKc, Float.valueOf(1.0f));
        cJb.put(b.cKd, Float.valueOf(0.0f));
        cJb.put(b.cKj, Float.valueOf(0.0f));
        cJb.put(b.cKo, Float.valueOf(100.0f));
        cJb.put(b.cKp, Float.valueOf(750.0f));
        cJb.put(b.cKq, Float.valueOf(10.0f));
        cJb.put(b.cKy, Float.valueOf(0.5f));
        cJb.put(b.cKL, Float.valueOf(100.0f));
        cJb.put(b.cKg, Float.valueOf(0.4f));
        cJb.put(b.cKh, Float.valueOf(0.3f));
        cJb.put(b.cKi, Float.valueOf(0.3f));
        cJb.put(b.cKx, Float.valueOf(750.0f));
        cJb.put(b.cKw, Float.valueOf(100.0f));
        cJb.put(b.cKV, Float.valueOf(0.5f));
        cJb.put(b.cKW, Float.valueOf(1.0f));
        cJb.put(b.cKX, Float.valueOf(0.5f));
        cJb.put(b.cKY, Float.valueOf(1.0f));
        cJb.put(b.cKZ, Float.valueOf(1.0f));
        cJb.put(b.cLa, Float.valueOf(1.0f));
        cJc.put(b.cJG, true);
        cJc.put(b.cJN, true);
        cJc.put(b.cJO, false);
        cJc.put(b.cJP, false);
        cJc.put(b.cJQ, false);
        cJc.put(b.cKe, false);
        cJc.put(b.cKk, true);
        cJc.put(b.cKv, false);
        cJc.put(b.cKA, false);
        cJc.put(b.cKB, false);
        cJc.put(b.cKC, false);
        cJc.put(b.cKD, true);
        cJc.put(b.cKI, true);
        cJc.put(b.cKJ, false);
        cJc.put(b.cKE, false);
        cJc.put(b.cKF, false);
        cJc.put(b.cKG, false);
        cJc.put(b.cKH, false);
        cJc.put(b.cLe, true);
        cJc.put(b.cKQ, true);
        cJc.put(b.cKR, false);
        cJc.put(b.cLb, true);
        cJc.put(b.cLc, false);
        cJc.put(b.cLd, false);
        cJc.put(b.cJR, false);
        cJd.put(b.cKr, "r_Siege Bindstone Small Item");
        cJd.put(b.cKs, "r_Siege Bindstone Large Item");
        cJe.put(b.cKt, null);
        cJe.put(b.cKu, null);
        cJf.put(b.cKf, bax.cPj);
        cJf.put(b.cKK, azs.cHm);
        cJg.put(b.cKf, bax.values());
        cJg.put(b.cKK, azs.values());
        cJg.put(b.cKl, new b[]{b.cKm, b.cKn});
        cJg.put(b.cKm, (Object)b.cKl);
        cJg.put(b.cKn, (Object)b.cKl);
        cJg.put(b.cKo, (Object)b.cKp);
        cJg.put(b.cKp, (Object)b.cKo);
        cJg.put(b.cKw, (Object)b.cKx);
        cJg.put(b.cKx, (Object)b.cKw);
        cJg.put(b.cKh, new b[]{b.cKi, b.cKg});
        cJg.put(b.cKi, new b[]{b.cKg, b.cKh});
        cJg.put(b.cKg, new b[]{b.cKh, b.cKi});
    }
}


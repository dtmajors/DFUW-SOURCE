/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.Map;
import java.util.TreeMap;

public class dba {
    public static final ljq gbx = new ljq(0.0f, 0.0f, 1.0f);
    public static final ljq gby = new ljq(0.0f, 0.0f, -1.0f);
    public static final int gbz = 1;
    public static final int gbA = 2;
    public static final int gbB = 3;
    public static final int gbC = 4;
    public static final int gbD = 5;
    private static boolean gbE = false;
    public static float gbF = -1.0f;
    public static float gbG = -1.0f;
    public static float gbH = -1.0f;
    public static float gbI = -1.0f;
    public static float gbJ = -1.0f;
    public static float gbK = -1.0f;
    public static float gbL = -1.0f;
    public static float gbM = -1.0f;
    public static float gbN = -1.0f;
    public static float gbO = -1.0f;
    public static float gbP = -1.0f;
    public static float gbQ = -1.0f;
    private static final float gbR = 1.5f;
    private static final boolean gbS = true;

    private dba() {
    }

    private static void biF() {
        if (gbE) {
            return;
        }
        TreeMap<Float, Integer> treeMap = lcn.emG();
        treeMap.put(Float.valueOf(dba.zA(cug.fhT)), cug.fhT);
        treeMap.put(Float.valueOf(dba.zA(cug.fhS)), cug.fhS);
        treeMap.put(Float.valueOf(dba.zA(cug.fhZ)), cug.fhZ);
        treeMap.put(Float.valueOf(dba.zA(cug.fhY)), cug.fhY);
        treeMap.put(Float.valueOf(dba.zA(cug.fhY)), cug.fhY);
        treeMap.put(Float.valueOf(dba.zA(cug.fhR)), cug.fhR);
        treeMap.put(Float.valueOf(dba.zA(cug.fhQ)), cug.fhQ);
        treeMap.put(Float.valueOf(dba.zA(cug.fhV)), cug.fhV);
        treeMap.put(Float.valueOf(dba.zA(cug.fhU)), cug.fhU);
        treeMap.put(Float.valueOf(dba.zA(cug.fhX)), cug.fhX);
        treeMap.put(Float.valueOf(dba.zA(cug.fhW)), cug.fhW);
        treeMap.put(Float.valueOf(dba.zA(cug.fhP)), cug.fhP);
        treeMap.put(Float.valueOf(dba.zA(cug.fhO)), cug.fhO);
        float f2 = ((Float)treeMap.firstKey()).floatValue();
        for (Map.Entry entry : treeMap.entrySet()) {
            dba.c(f2, ((Float)entry.getKey()).floatValue(), (Integer)entry.getValue());
        }
        gbE = true;
    }

    private static void c(float f2, float f3, int n2) {
        float f4 = f3 - f2;
        assert (f4 >= 0.0f);
        f4 *= f4;
        f4 = lew.A(f4, 0.0f, Float.MAX_VALUE);
        if (n2 == cug.fhT) {
            gbF = f4;
        }
        if (n2 == cug.fhS) {
            gbG = f4;
        }
        if (n2 == cug.fhZ) {
            gbH = f4;
        }
        if (n2 == cug.fhY) {
            gbI = f4;
        }
        if (n2 == cug.fhR) {
            gbJ = f4;
        }
        if (n2 == cug.fhQ) {
            gbK = f4;
        }
        if (n2 == cug.fhV) {
            gbL = f4;
        }
        if (n2 == cug.fhU) {
            gbM = f4;
        }
        if (n2 == cug.fhX) {
            gbN = f4;
        }
        if (n2 == cug.fhW) {
            gbO = f4;
        }
        if (n2 == cug.fhP) {
            gbP = f4;
        }
        if (n2 == cug.fhO) {
            gbQ = f4;
        }
    }

    public static float A(int n2, float f2) {
        if (!gbE) {
            dba.biF();
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float f3 = f2 * f2;
        return (float)Math.sqrt(f3 + gbF) - f2;
    }

    private static float zA(int n2) {
        lgw lgw2 = (lgw)lea.enW().acv(n2);
        if (lgw2 == null) {
            assert (false);
            return 1.5f;
        }
        Map<String, eh> map = ei.ao("animations/" + lgw2.bBt());
        if (map == null) {
            assert (false);
            return 1.5f;
        }
        eh eh2 = map.get("AttachPoint Character Eye Center");
        if (eh2 == null) {
            assert (false);
            return 1.5f;
        }
        float f2 = eh2.fb().y;
        return f2;
    }
}


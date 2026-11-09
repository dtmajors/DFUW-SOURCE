/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 */
import java.util.Map;

public class cbr {
    private static Map<Integer, cbt> ejV = lcn.emw();
    private static les aqN = lea.enZ();

    private cbr() {
    }

    public static float oG(int n) {
        switch (n) {
            case 1: {
                return cbr.aHV();
            }
            case 3: {
                return cbr.aHW();
            }
            case 4: {
                return cbr.aHX();
            }
        }
        lfn.b(5, "SFGamelogicFunction", "computeFunction() Could not find function '" + cbs.oK(n) + "'");
        return 0.0f;
    }

    public static float a(int n, cdb cdb2) {
        return cbr.a(n, cdb2, 0);
    }

    public static float a(int n, cdb cdb2, int n2) {
        if (cdb2 == null) {
            lfn.b(5, "SFGamelogicFunction", "computeFunction() CreaturObject is null.");
            return 0.0f;
        }
        if (!cbr.c(cdb2)) {
            lfn.b(5, "SFGamelogicFunction", "computeFunction() CreaturObject is not properly initialized.");
            return 0.0f;
        }
        if (n2 < 0) {
            lfn.b(5, "SFGamelogicFunction", "computeFunction() SkillType is invalid.");
            return 0.0f;
        }
        switch (n) {
            case 2: {
                return cbr.a(cdb2, n2);
            }
            case 5: {
                return cbr.b(cdb2, n2);
            }
            case 6: {
                return cbr.c(cdb2, n2);
            }
            case 7: {
                return cbr.d(cdb2, n2);
            }
            case 8: {
                return cbr.e(cdb2, n2);
            }
        }
        lfn.b(5, "SFGamelogicFunction", "computeFunction() Could not find function '" + cbs.oK(n) + "'");
        return 0.0f;
    }

    private static float aHV() {
        float f2 = 10.0f;
        return f2;
    }

    private static float a(cdb cdb2, int n) {
        float f2 = cdb2.fi().al(352);
        float f3 = 0.2f - 0.008f * f2;
        return f3;
    }

    private static float aHW() {
        float f2 = 90.0f;
        return f2;
    }

    private static float aHX() {
        float f2 = 15.0f;
        return f2;
    }

    private static float b(cdb cdb2, int n) {
        float f2;
        float f3 = cdb2.fi().al(848);
        float f4 = cbr.oH(n);
        float f5 = cbr.b(0.0f, f3 + f4, cbr.oJ(5));
        float f6 = f2 = cbr.c(0.5f, f5, cbr.oJ(5));
        return f6;
    }

    private static float c(cdb cdb2, int n) {
        float f2 = 0.0f;
        return f2;
    }

    private static float d(cdb cdb2, int n) {
        float f2 = 0.0f;
        return f2;
    }

    private static float e(cdb cdb2, int n) {
        float f2 = 0.0f;
        return f2;
    }

    private static boolean c(cdb cdb2) {
        if (cdb2 == null) {
            lfn.b(5, "SFGamelogicFunction", "checkCreatureObject() CreatureObject is null.");
            return false;
        }
        if (cdb2.aJC() == null) {
            lfn.b(5, "SFGamelogicFunction", "checkCreatureObject() InventoryManager is null.");
            return false;
        }
        if (cdb2.aJC().asf() == null) {
            lfn.b(5, "SFGamelogicFunction", "checkCreatureObject() Inventory is null.");
            return false;
        }
        return true;
    }

    private static float b(float f2, float f3, boolean bl) {
        if (f2 >= f3) {
            return f2;
        }
        return f3;
    }

    private static float c(float f2, float f3, boolean bl) {
        if (f2 <= f3) {
            return f2;
        }
        return f3;
    }

    private static float oH(int n) {
        lhg lhg2 = (lhg)aqN.acv(n);
        if (lhg2 == null) {
            lfn.b(5, "SFGamelogicFunction", "getSkillTreeProperty() SkillType is invalid.");
            return 0.0f;
        }
        return lhg2.erX();
    }

    private static float a(cdb cdb2, cxh.b b2) {
        switch (b2) {
            default: 
        }
        lfn.b(5, "SFGamelogicFunction", "getSpecialCheckValue() Invalid specialchecktype provided: " + (Object)((Object)b2));
        return 0.0f;
    }

    public static void a(cbt cbt2) {
        if (cbt2 == null) {
            lfn.b(5, "SFGamelogicFunction", "addGamelogicFunctionRule() Rule is null.");
            return;
        }
        if (cbr.oI(cbt2.ekd)) {
            lfn.b(5, "SFGamelogicFunction", "addGamelogicFunctionRule() The rule has already been added.");
            lfn.b(5, "SFGamelogicFunction", "addGamelogicFunctionRule() " + cbt2);
            return;
        }
        ejV.put(cbt2.ekd, cbt2);
    }

    public static boolean oI(int n) {
        if (n <= 0) {
            lfn.b(5, "SFGamelogicFunction", "containsGamelogicFunctionRule() GamelogicFunctionType is invalid.");
            return false;
        }
        return ejV.containsKey(n);
    }

    private static boolean oJ(int n) {
        cbt cbt2 = ejV.get(n);
        if (cbt2 != null) {
            return cbt2.eke;
        }
        return false;
    }
}


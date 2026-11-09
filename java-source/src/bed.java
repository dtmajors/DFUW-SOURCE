/*
 * Decompiled with CFR.
 */
public class bed {
    public static final int dcz = 1;
    public static final int dcA = 2;
    public static final int dcB = 3;
    public static final int dcC = 4;
    public static final int dcD = 5;
    public static final int dcE = 6;
    public static final int dcF = 7;
    public static final int dcG = 8;
    public static final int dcH = 9;
    public static final int dcI = 10;
    public static final int dcJ = 11;
    public static final int dcK = 12;
    private static String[] dcL = new String[]{"Undefined Controller", "Controller Walk", "Controller Horse", "Controller Swim", "Controller Boat", "Controller Ladder", "Controller Animation Stream", "Controller Dragon", "Controller External Object", "Controller Remove External Object", "Controller Mount Swim", "Controller Tank", "Controller SiegeEngine"};
    public static final int dcM = 0;
    public static final int dcN = 1;
    public static final int dcO = 2;
    public static final int dcP = 3;
    public static final int dcQ = 4;
    public static final int dcR = 5;
    public static final int dcS = 6;
    public static final int dcT = 7;
    public static final int dcU = 8;

    public static int fr(String string) {
        if (string == null) {
            lfn.b(5, "SFControllerTypes", "getControllerType() ControllerName is null.");
            return -1;
        }
        for (int i = 0; i < dcL.length; ++i) {
            if (!dcL[i].equalsIgnoreCase(string)) continue;
            return i;
        }
        lfn.b(5, "SFControllerTypes", "getControllerType() ControllerName '" + string + "' is invalid.");
        return -1;
    }

    public static String kp(int n) {
        if (n < 0 || n >= dcL.length) {
            lfn.b(5, "SFControllerTypes", "getControllerName() ControllerType is invalid.");
            return null;
        }
        return dcL[n];
    }

    private bed() {
    }
}


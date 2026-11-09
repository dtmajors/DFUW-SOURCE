/*
 * Decompiled with CFR.
 */
public class alv {
    public static final int bsN = 0;
    public static final int bsO = 1;
    public static final int bsP = 2;
    public static final int bsQ = 3;
    public static final int bsR = 4;
    public static final int bsS = 5;
    public static final int bsT = 6;
    public static final int bsU = 7;
    public static final int bsV = 8;
    private static final String[] bsW = new String[]{"Undefined Layer", "Layer Stackable", "Layer Magical Positive", "Layer Magical Negative", "Layer Physical Positive", "Layer Physical Negative", "Layer Special Positive", "Layer Special Negative"};

    public static String gk(int n) {
        if (n <= 0 || n >= bsW.length) {
            lfn.b(5, "SFModifierLayerTypes", "getModifierLayerName() ModifierLayerType " + n + " is invalid.");
            return null;
        }
        return bsW[n];
    }

    public static int cN(String string) {
        if (string == null) {
            lfn.b(5, "SFModifierLayerTypes", "getModifierLayerType() ModifierLayerName is null.");
            return -1;
        }
        int n = bsW.length;
        for (int i = 0; i < n; ++i) {
            if (!bsW[i].equalsIgnoreCase(string)) continue;
            return i;
        }
        lfn.b(5, "SFModifierLayerTypes", "getModifierLayerType() ModifierLayerName '" + string + "' is invalid.");
        return -1;
    }

    public static boolean gl(int n) {
        switch (n) {
            case 3: 
            case 5: 
            case 7: {
                return true;
            }
            case 0: 
            case 1: 
            case 2: 
            case 4: 
            case 6: {
                return false;
            }
        }
        lfn.b(5, "SFModifierLayerTypes", "isNegativeModifierLayer() Unhandled modifierlayertype provided: " + n);
        assert (false);
        return false;
    }

    public static boolean gm(int n) {
        switch (n) {
            case 2: 
            case 4: 
            case 6: {
                return true;
            }
            case 0: 
            case 1: 
            case 3: 
            case 5: 
            case 7: {
                return false;
            }
        }
        lfn.b(5, "SFModifierLayerTypes", "isPositiveModifierLayer() Unhandled modifierlayertype provided: " + n);
        assert (false);
        return false;
    }

    public static boolean gn(int n) {
        switch (n) {
            case 1: {
                return true;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: {
                return false;
            }
        }
        lfn.b(5, "SFModifierLayerTypes", "isStackableModifierLayer() Unhandled modifierlayertype provided: " + n);
        assert (false);
        return true;
    }

    private alv() {
    }
}


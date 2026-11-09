/*
 * Decompiled with CFR.
 */
public enum cgl {
    eyz,
    eyA,
    eyB,
    eyC,
    eyD;


    public static cgl getRewardTypes(String string) {
        if (string == null) {
            return null;
        }
        if (string.equalsIgnoreCase(eyz.name())) {
            return eyz;
        }
        if (string.equalsIgnoreCase(eyA.name())) {
            return eyA;
        }
        if (string.equalsIgnoreCase(eyB.name())) {
            return eyB;
        }
        if (string.equalsIgnoreCase(eyC.name())) {
            return eyC;
        }
        if (string.equalsIgnoreCase(eyD.name())) {
            return eyD;
        }
        return null;
    }
}


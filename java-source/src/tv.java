/*
 * Decompiled with CFR.
 */
public final class tv
extends Enum<tv> {
    public static final /* enum */ tv aVs = new tv();
    public static final /* enum */ tv aVt = new tv();
    public static final /* enum */ tv aVu = new tv();
    public static final /* enum */ tv aVv = new tv();
    public static final /* enum */ tv aVw = new tv();
    @Deprecated
    public static final /* enum */ tv aVx = new tv();
    public static final /* enum */ tv aVy = new tv();
    public static final /* enum */ tv aVz = new tv();
    public static final /* enum */ tv aVA = new tv();
    public static final /* enum */ tv aVB = new tv();
    public static final /* enum */ tv aVC = new tv();
    public static final /* enum */ tv aVD = new tv();
    public static final /* enum */ tv aVE = new tv();
    public static final /* enum */ tv aVF = new tv();
    public static final /* enum */ tv aVG = new tv();
    public static final /* enum */ tv aVH = new tv();
    public static final /* enum */ tv aVI = new tv();
    public static final /* enum */ tv aVJ = new tv();
    public static final /* enum */ tv aVK = new tv();
    public static final /* enum */ tv aVL = new tv();
    public static final /* enum */ tv aVM = new tv();
    public static final /* enum */ tv aVN = new tv();
    public static final /* enum */ tv aVO = new tv();
    public static final /* enum */ tv aVP = new tv();
    public static final /* enum */ tv aVQ = new tv();
    public static final /* enum */ tv aVR = new tv();
    private static final /* synthetic */ tv[] aVS;

    public static tv[] values() {
        return (tv[])aVS.clone();
    }

    public static tv valueOf(String string) {
        return Enum.valueOf(tv.class, string);
    }

    public boolean U(float f2) {
        switch (this) {
            case aVv: 
            case aVx: 
            case aVz: 
            case aVB: 
            case aVy: 
            case aVA: 
            case aVG: 
            case aVw: 
            case aVI: 
            case aVJ: 
            case aVK: 
            case aVL: 
            case aVP: 
            case aVQ: 
            case aVR: {
                return f2 > 0.0f;
            }
            case aVD: 
            case aVC: 
            case aVE: 
            case aVF: 
            case aVM: 
            case aVN: 
            case aVO: {
                return f2 <= 0.0f;
            }
            case aVs: {
                return f2 == 0.0f;
            }
            case aVu: {
                return true;
            }
        }
        lfn.b(5, ((Object)((Object)this)).getClass().getSimpleName(), "validateAmount() : Unrecognised Player-Points Transaction Type!!!... Somebody Forgot to Add a New Type to This Method!!!... Type = " + (Object)((Object)this));
        assert (false);
        return false;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < tv.values().length;
    }

    public static tv getValueByOrdinal(int n) {
        return tv.isValidOrdinal(n) ? tv.values()[n] : null;
    }

    public static tv getValueByName(String string) {
        for (tv tv2 : tv.values()) {
            if (!tv2.name().equalsIgnoreCase(string)) continue;
            return tv2;
        }
        return null;
    }

    static {
        aVS = new tv[]{aVs, aVt, aVu, aVv, aVw, aVx, aVy, aVz, aVA, aVB, aVC, aVD, aVE, aVF, aVG, aVH, aVI, aVJ, aVK, aVL, aVM, aVN, aVO, aVP, aVQ, aVR};
    }
}


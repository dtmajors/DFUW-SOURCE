/*
 * Decompiled with CFR.
 */
public final class jep
extends Enum<jep> {
    public static final /* enum */ jep mVz = new jep(lxx.tzp);
    public static final /* enum */ jep mVA = new jep(lxx.tzq);
    public static final /* enum */ jep mVB = new jep(lxx.tzr);
    public static final /* enum */ jep mVC = new jep(lxx.tzs);
    private lox lTD;
    private static final /* synthetic */ jep[] mVD;

    public static jep[] values() {
        return (jep[])mVD.clone();
    }

    public static jep valueOf(String string) {
        return Enum.valueOf(jep.class, string);
    }

    private jep(lox lox2) {
        this.lTD = lox2;
    }

    public loz aNA() {
        return this.lTD.bD(new Object[0]);
    }

    public String dzT() {
        return this.name().toLowerCase();
    }

    public int BV() {
        return jep.getAttributeType(this);
    }

    public static int getAttributeType(jep jep2) {
        if (jep2 == null) {
            return -1;
        }
        switch (jep2) {
            case mVz: {
                return 208;
            }
            case mVA: {
                return 160;
            }
            case mVB: {
                return 176;
            }
            case mVC: {
                return 240;
            }
        }
        return -1;
    }

    public static int getBonusAttributeType(jep jep2) {
        if (jep2 == null) {
            return -1;
        }
        switch (jep2) {
            case mVz: {
                return 5232;
            }
            case mVA: {
                return 2576;
            }
            case mVB: {
                return 3360;
            }
            case mVC: {
                return 5744;
            }
        }
        return -1;
    }

    public static jep getBoosterAttributeType(int n) {
        switch (n) {
            case 208: {
                return mVz;
            }
            case 160: {
                return mVA;
            }
            case 176: {
                return mVB;
            }
            case 240: {
                return mVC;
            }
        }
        assert (false);
        return null;
    }

    static {
        mVD = new jep[]{mVz, mVA, mVB, mVC};
    }
}


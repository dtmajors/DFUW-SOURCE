/*
 * Decompiled with CFR.
 */
import java.util.Map;

public final class bcu
extends Enum<bcu> {
    public static final /* enum */ bcu cXD = new bcu();
    public static final /* enum */ bcu cXE = new bcu();
    public static final /* enum */ bcu cXF = new bcu();
    public static final /* enum */ bcu cXG = new bcu();
    public static final /* enum */ bcu cXH = new bcu();
    public static final /* enum */ bcu cXI = new bcu();
    public static final /* enum */ bcu cXJ = new bcu();
    public static final /* enum */ bcu cXK = new bcu();
    public static final /* enum */ bcu cXL = new bcu();
    public static final /* enum */ bcu cXM = new bcu();
    private static bcu[] cXN;
    private static Map<String, Integer> cXO;
    private static final /* synthetic */ bcu[] cXP;

    public static bcu[] values() {
        return (bcu[])cXP.clone();
    }

    public static bcu valueOf(String string) {
        return Enum.valueOf(bcu.class, string);
    }

    public static Map<String, Integer> getAllStates() {
        if (cXO.isEmpty()) {
            for (int i = 0; i < cXN.length; ++i) {
                if (cXN[i] == cXI || cXN[i] == cXJ || cXN[i] == cXK || cXN[i] == cXL || cXN[i] == cXM) continue;
                cXO.put(cXN[i].getDisplayName(), cXN[i].ordinal());
            }
        }
        return cXO;
    }

    public String getDisplayName() {
        switch (this) {
            case cXH: {
                return "Allied";
            }
            case cXD: {
                return "Enemy";
            }
            case cXG: {
                return "Friend";
            }
            case cXF: {
                return "Neutral";
            }
            case cXE: {
                return "Wary";
            }
        }
        return "Error";
    }

    public static Map<String, Integer> getCorrectStates(int n) {
        bcu bcu2 = bcu.getValueByOrdinal(n);
        Map<String, Integer> map = lcn.emw();
        switch (bcu2) {
            case cXD: {
                map.put(cXD.name().toLowerCase(), cXD.ordinal());
                break;
            }
            case cXE: {
                map.put(cXE.name().toLowerCase(), cXE.ordinal());
                map.put(cXD.name().toLowerCase(), cXD.ordinal());
                map.put(cXG.name().toLowerCase(), cXG.ordinal());
                map.put(cXH.name().toLowerCase(), cXH.ordinal());
                map.put(cXF.name().toLowerCase(), cXF.ordinal());
                break;
            }
            case cXG: {
                map.put(cXD.name().toLowerCase(), cXD.ordinal());
                map.put(cXE.name().toLowerCase(), cXE.ordinal());
                map.put(cXH.name().toLowerCase(), cXH.ordinal());
                map.put(cXG.name().toLowerCase(), cXG.ordinal());
                map.put(cXF.name().toLowerCase(), cXF.ordinal());
                break;
            }
            case cXH: {
                map.put(cXH.name().toLowerCase(), cXH.ordinal());
                map.put(cXD.name().toLowerCase(), cXD.ordinal());
                map.put(cXE.name().toLowerCase(), cXE.ordinal());
                map.put(cXG.name().toLowerCase(), cXG.ordinal());
                map.put(cXF.name().toLowerCase(), cXF.ordinal());
                break;
            }
            case cXF: {
                map.put(cXD.name().toLowerCase(), cXD.ordinal());
                map.put(cXE.name().toLowerCase(), cXE.ordinal());
                map.put(cXG.name().toLowerCase(), cXG.ordinal());
                map.put(cXH.name().toLowerCase(), cXH.ordinal());
                map.put(cXF.name().toLowerCase(), cXF.ordinal());
                break;
            }
        }
        return map;
    }

    public static final int getValueCount() {
        return cXN.length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < bcu.getValueCount();
    }

    public static bcu getValueByOrdinal(int n) {
        return cXN[n];
    }

    public int aer() {
        switch (this) {
            case cXD: {
                return -4;
            }
            case cXE: {
                return -2;
            }
            case cXF: {
                return 0;
            }
            case cXG: {
                return 1;
            }
            case cXH: {
                return 2;
            }
        }
        assert (false) : "Unknown";
        return 0;
    }

    public boolean als() {
        return this == cXD;
    }

    static {
        cXP = new bcu[]{cXD, cXE, cXF, cXG, cXH, cXI, cXJ, cXK, cXL, cXM};
        cXN = (bcu[])bcu.class.getEnumConstants();
        cXO = lcn.emw();
    }
}


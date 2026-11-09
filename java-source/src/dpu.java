/*
 * Decompiled with CFR.
 */
import java.util.Map;

public enum dpu {
    gNi,
    gNj,
    gNk;

    private static final Map<String, dpu> gNl;

    public static dpu getValueByName(String string) {
        if (string == null) {
            return null;
        }
        if (gNl.containsKey(string)) {
            return gNl.get(string);
        }
        for (dpu dpu2 : dpu.values()) {
            if (dpu2.name().compareToIgnoreCase(string) != 0) continue;
            gNl.put(string, dpu2);
            return dpu2;
        }
        return null;
    }

    static {
        gNl = lcn.emw();
    }
}


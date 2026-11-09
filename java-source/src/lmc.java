/*
 * Decompiled with CFR.
 */
import java.util.Map;

public enum lmc {
    rEl(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f),
    rEm(1.0f, 1.1f, 1.2f, 1.3f, 1.4f, 1.5f, 1.0f, 0.9f, 0.8f, 0.7f, 0.6f, 0.5f),
    rEn(1.0f, 1.2f, 1.4f, 1.6f, 1.8f, 2.0f, 1.0f, 0.8f, 0.6f, 0.4f, 0.2f, 0.1f),
    rEo(1.0f, 0.8f, 0.6f, 0.4f, 0.2f, 0.1f, 1.0f, 1.2f, 1.4f, 1.6f, 1.8f, 2.0f);

    private Map<lmf, Float> rEp = lcn.emw();
    private Map<lmf, Float> rEq = lcn.emw();

    private lmc(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        this.rEp.put(lmf.rEz, Float.valueOf(f));
        this.rEp.put(lmf.rEu, Float.valueOf(f2));
        this.rEp.put(lmf.rEv, Float.valueOf(f3));
        this.rEp.put(lmf.rEw, Float.valueOf(f4));
        this.rEp.put(lmf.rEx, Float.valueOf(f5));
        this.rEp.put(lmf.rEy, Float.valueOf(f6));
        this.rEq.put(lmf.rEz, Float.valueOf(f7));
        this.rEq.put(lmf.rEu, Float.valueOf(f8));
        this.rEq.put(lmf.rEv, Float.valueOf(f9));
        this.rEq.put(lmf.rEw, Float.valueOf(f10));
        this.rEq.put(lmf.rEx, Float.valueOf(f11));
        this.rEq.put(lmf.rEy, Float.valueOf(f12));
    }

    public float e(lmf lmf2) {
        return this.rEp.get((Object)lmf2).floatValue();
    }

    public float f(lmf lmf2) {
        return this.rEq.get((Object)lmf2).floatValue();
    }

    public static lmc getValueByName(String string) {
        for (lmc lmc2 : lmc.values()) {
            if (lmc2.name().compareTo(string) != 0) continue;
            return lmc2;
        }
        return null;
    }
}


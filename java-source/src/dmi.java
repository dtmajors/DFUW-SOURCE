/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class dmi {
    private Map<dmh, Float> gIe = lcn.emw();

    public boolean bpZ() {
        for (Float f : this.gIe.values()) {
            if (f.floatValue() == 0.0f) continue;
            return true;
        }
        return false;
    }

    public float c(dmh dmh2) {
        return dmh2 == null || !this.gIe.containsKey((Object)dmh2) ? 0.0f : this.gIe.get((Object)dmh2).floatValue();
    }

    public float d(dmh dmh2) {
        return dmh2 == null ? 1.0f : (dmh2.bpY() ? 1.0f + this.c(dmh2) : 1.0f - this.c(dmh2));
    }

    public float e(dmh dmh2) {
        return this.c(dmh2) * 100.0f;
    }

    public dmi() {
        this.bqa();
    }

    public void bqa() {
        for (dmh dmh2 : dmh.values()) {
            this.gIe.put(dmh2, Float.valueOf(0.0f));
        }
    }

    public void b(dmq dmq2, dmf dmf2) {
        if (dmq2 == null) {
            this.bqa();
            return;
        }
        for (dmh dmh2 : dmh.values()) {
            this.gIe.put(dmh2, Float.valueOf(dmi.b(dmq2, dmf2, dmh2)));
        }
    }

    public loz f(dmh dmh2) {
        if (dmh2 == null) {
            return null;
        }
        if (dmh2.bpY()) {
            return lyw.tLN.bD(new Object[]{Float.valueOf(this.e(dmh2)), dmh2});
        }
        return lyw.tLO.bD(new Object[]{Float.valueOf(this.e(dmh2)), dmh2});
    }

    public static float a(dmq dmq2, dmf dmf2, dmh dmh2) {
        return dmh2 == null ? 1.0f : (dmh2.bpY() ? 1.0f + dmi.b(dmq2, dmf2, dmh2) : 1.0f - dmi.b(dmq2, dmf2, dmh2));
    }

    public static float b(dmq dmq2, dmf dmf2, dmh dmh2) {
        if (dmq2 == null || dmh2 == null) {
            return 0.0f;
        }
        float f = 0.0f;
        for (dmj dmj2 : dmj.values()) {
            f += dmh2.a(dmj2) * (float)dmq2.d(dmj2);
        }
        f *= dmf2 == null ? 0.0f : dmf2.bpV();
        f = Math.min(f, dmh2.bpX());
        return f;
    }

    public static float c(dmq dmq2, dmf dmf2, dmh dmh2) {
        return dmi.b(dmq2, dmf2, dmh2) * 100.0f;
    }
}


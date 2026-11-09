/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.EnumSet;

public class dpt {
    private String elY = null;
    private String ResourceName = null;
    private int ResourceType = -1;
    private float Probability = 0.0f;
    private int asi = 0;
    private EnumSet<dpu> gNh = null;

    public String bsp() {
        return this.elY;
    }

    public boolean bsq() {
        return this.elY == null;
    }

    public String pa() {
        return this.ResourceName;
    }

    public int az() {
        if (this.ResourceType < 0) {
            this.ResourceType = cug.hV((String)this.ResourceName);
        }
        return this.ResourceType;
    }

    public float aqG() {
        return this.Probability;
    }

    public int vf() {
        return this.asi;
    }

    public EnumSet<dpu> bsr() {
        return this.gNh;
    }

    public dpt(String string, String string2, float f2, int n, EnumSet<dpu> enumSet) {
        this.elY = string;
        this.ResourceName = string2;
        this.Probability = f2 < 0.0f ? 0.0f : f2;
        this.asi = n < 0 ? 0 : n;
        this.gNh = enumSet == null ? EnumSet.of(dpu.gNk) : enumSet;
    }

    public boolean iV(String string) {
        if (this.elY == null) {
            return true;
        }
        return this.elY.compareToIgnoreCase(string) == 0;
    }

    public boolean vA() {
        return lgp.erA().cS(this.Probability);
    }

    public boolean a(dpu dpu2) {
        if (dpu2 == null) {
            return false;
        }
        return this.gNh.contains((Object)dpu2);
    }
}


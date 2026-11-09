/*
 * Decompiled with CFR.
 */
public class dbt {
    public boolean[] ecU = null;
    public boolean gcv = false;
    public ldv akX = null;
    public ldv dsL = null;
    public int dhr = 0;
    public ljq aZD = null;
    public int fZd = 0;
    public int fZf = 0;
    public int fZe = 0;
    public ldv gcw = null;
    public boolean gcx = false;
    public ljq dph = null;
    public lgl dpi = null;
    public double QM = 0.0;
    public double gcy = 0.0;
    public ldg[] dcp = null;
    public String YL = null;
    public boolean dOf = false;
    public boolean fZg = false;

    public boolean h(boolean[] blArray) {
        assert (this.ecU != null);
        assert (blArray != null);
        assert (this.ecU.length == blArray.length);
        int n2 = this.ecU.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.ecU[i2] == blArray[i2]) continue;
            return true;
        }
        return false;
    }

    public String bjh() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.ecU[0]) {
            stringBuilder.append(" Forward");
        }
        if (this.ecU[1]) {
            stringBuilder.append(" Backward");
        }
        if (this.ecU[2]) {
            stringBuilder.append(" Left");
        }
        if (this.ecU[3]) {
            stringBuilder.append(" Right");
        }
        return stringBuilder.toString();
    }

    public void reset() {
        this.ecU = null;
        this.gcv = false;
        this.akX = null;
        this.dsL = null;
        this.dhr = 0;
        this.aZD = null;
        this.fZd = 0;
        this.fZe = 0;
        this.fZf = 0;
        this.gcy = 0.0;
        this.gcx = false;
        this.dph = null;
        this.dpi = null;
        this.dOf = false;
        this.QM = 0.0;
        this.dcp = null;
        this.gcw = null;
    }
}


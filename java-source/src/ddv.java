/*
 * Decompiled with CFR.
 */
public class ddv {
    public int ResourceType = 0;
    public float gew = 0.0f;
    public int[] gex = null;

    public boolean zK(int n2) {
        int n3 = this.gex.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            if (this.gex[i2] != n2) continue;
            return true;
        }
        return false;
    }

    public String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFThrowableWeaponInfo: ResourceType='");
        stringBuilder.append(this.pa());
        stringBuilder.append("' AreaDuration=");
        stringBuilder.append(this.gew);
        stringBuilder.append(" [");
        int n2 = this.gex.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (i2 > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("'");
            stringBuilder.append(this.eJ(this.gex[i2]));
            stringBuilder.append("'");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private String eJ(int n2) {
        return lea.enZ().getName(n2);
    }
}


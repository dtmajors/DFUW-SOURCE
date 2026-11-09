/*
 * Decompiled with CFR.
 */
public class lgz {
    public int ResourceType = 0;
    public int[] bsH = null;

    public String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public String zU(int n) {
        return del.zU(n);
    }

    public String toString() {
        assert (this.ResourceType > 0);
        assert (this.bsH != null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(": Resource='");
        stringBuilder.append(this.pa());
        stringBuilder.append("' SpecialEffects=[");
        int n = this.bsH.length;
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("'");
            stringBuilder.append(this.zU(this.bsH[i]));
            stringBuilder.append("'");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}


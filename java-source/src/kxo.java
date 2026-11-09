/*
 * Decompiled with CFR.
 */
public class kxo
extends kxn {
    public int[] bqd = null;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFFilterRuleMulti: Resources=[");
        int n = this.bqd.length;
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("'");
            stringBuilder.append(lea.enW().getName(this.bqd[i]));
            stringBuilder.append("'");
        }
        stringBuilder.append("] ");
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }
}


/*
 * Decompiled with CFR.
 */
public class dcj {
    public final cxd.b fYc;
    public final int[] gcS;
    private static les aqN = lea.enZ();

    public dcj(cxd.b b2, int[] nArray) {
        this.fYc = b2;
        this.gcS = nArray;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFSkillBlockingGroup: BlockingGroup='");
        stringBuilder.append((Object)this.fYc);
        stringBuilder.append("' Skills=[");
        int n2 = this.gcS.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (i2 > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("'");
            stringBuilder.append(aqN.getName(this.gcS[i2]));
            stringBuilder.append("'");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}


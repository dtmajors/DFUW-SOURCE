/*
 * Decompiled with CFR.
 */
public class ddi {
    public int geg = 0;
    public String aEN = null;
    public int[] bqd = null;
    private static les ResourceTree = lea.enW();

    public boolean zJ(int n2) {
        assert (this.bqd != null);
        int n3 = this.bqd.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            if (!ResourceTree.isDescendant(n2, this.bqd[i2])) continue;
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFTargetGroup: GroupName='");
        stringBuilder.append(this.aEN);
        stringBuilder.append("' Resources=[");
        int n2 = this.bqd.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (i2 > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("'");
            stringBuilder.append(ResourceTree.getName(this.bqd[i2]));
            stringBuilder.append("'");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}


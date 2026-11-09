/*
 * Decompiled with CFR.
 */
public class cus {
    public final cut fyh;
    public final int[] fxM;
    public final int buy;

    public cus(cut cut2, int[] nArray, int n) {
        this.fyh = cut2;
        this.fxM = nArray;
        this.buy = n;
    }

    public boolean contains(int n) {
        for (int i = 0; i < this.fxM.length; ++i) {
            if (this.fxM[i] != n && !lea.enW().isDescendant(n, this.fxM[i])) continue;
            return true;
        }
        return false;
    }

    public String toString() {
        assert (this.fyh != null);
        assert (this.fxM != null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFWorkStationInfo: Key=[");
        stringBuilder.append(this.fyh);
        stringBuilder.append("] Roots=[");
        int n = this.fxM.length;
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("'");
            stringBuilder.append(lea.enW().getName(this.fxM[i]));
            stringBuilder.append("'");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public boolean wS(int n) {
        return this.buy == 0 || this.buy == n;
    }
}


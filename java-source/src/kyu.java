/*
 * Decompiled with CFR.
 */
class kyu {
    public final int qmX;
    public final int qmY;

    public kyu(int n, int n2) {
        this.qmX = n;
        this.qmY = n2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFPatternMatch: Start=");
        stringBuilder.append(this.qmX);
        stringBuilder.append(" End=");
        stringBuilder.append(this.qmY);
        return stringBuilder.toString();
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
class bse {
    public final int[] dJj;
    public final int[] dJk;
    public final boolean dJl;
    public final boolean dJm;
    public final boolean dJn;

    public bse(int[] nArray, int[] nArray2, boolean bl2, boolean bl3, boolean bl4) {
        this.dJj = nArray2;
        this.dJk = nArray;
        this.dJl = bl2;
        this.dJm = bl3;
        this.dJn = bl4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFWiretapParams: ServerAttributeTypes=[");
        int n = this.dJk.length;
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(ep.aM((int)this.dJk[i]));
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}


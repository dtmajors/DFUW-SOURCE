/*
 * Decompiled with CFR.
 */
public class jmw {
    public final int ID;
    public final String akV;
    public final ldv alj;
    public final a[] nCf;

    public jmw(int n, String string, ldv ldv2, a ... aArray) {
        this.ID = n;
        this.akV = string.toLowerCase();
        this.alj = ldv2;
        this.nCf = aArray == null ? new a[0] : aArray;
        boolean bl = false;
        for (int j = 0; j < this.nCf.length; ++j) {
            if (!bl && this.nCf[j].bZR) {
                bl = true;
                continue;
            }
            if (bl && !this.nCf[j].bZR) assert (false) : "Optional parameters cannot be followed by nonoptional";
        }
    }

    public jmw(int n, String string, ldv ldv2) {
        this.ID = n;
        this.akV = string.toLowerCase();
        this.alj = ldv2;
        this.nCf = new a[0];
    }
}


/*
 * Decompiled with CFR.
 */
public class aua {
    public final hc SC;
    public final int ID;
    public final String akV;
    public final lip bZO;
    public final ldv alj;
    public final a[] bZP;

    public aua(hc hc2, int n, String string, lip lip2, ldv ldv2, a ... aArray) {
        this.SC = hc2;
        this.ID = n;
        this.akV = string.toLowerCase();
        this.bZO = lip2;
        this.alj = ldv2;
        this.bZP = aArray == null ? new a[0] : aArray;
        boolean bl = false;
        for (int i = 0; i < this.bZP.length; ++i) {
            if (!bl && this.bZP[i].bZR) {
                bl = true;
                continue;
            }
            if (bl && !this.bZP[i].bZR) assert (false) : "Optional parameters cannot be followed by nonoptional";
        }
    }

    public aua(hc hc2, int n, String string, lip lip2, ldv ldv2) {
        this.SC = hc2;
        this.ID = n;
        this.akV = string.toLowerCase();
        this.bZO = lip2;
        this.alj = ldv2;
        this.bZP = new a[0];
    }
}


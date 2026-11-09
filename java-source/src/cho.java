/*
 * Decompiled with CFR.
 */
public class cho
extends chi {
    public int dtZ;
    public cgc eAe;

    public cho() {
        this.ezL = cgi.LIFE_MODE_CHANGES;
    }

    public boolean a(boolean bl, boolean bl2, int n, int n2, int n3, int n4, boolean bl3, boolean bl4, boolean bl5, boolean bl6, int n5, boolean bl7) {
        if (!super.a(bl, bl2, n, n2, n3, n4, bl3, bl4, bl5, bl6)) {
            return false;
        }
        if (!this.eAe.bZR && bl7 != this.eAe.Pp) {
            return false;
        }
        return this.dtZ == n5;
    }
}


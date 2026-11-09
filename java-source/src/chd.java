/*
 * Decompiled with CFR.
 */
public class chd
extends chi {
    public cgy ezJ;
    public int bnM;
    public boolean ezK;

    public chd() {
        this.ezL = cgi.ATTRIBUTE;
    }

    public boolean a(boolean bl, boolean bl2, int n, int n2, int n3, int n4, boolean bl3, boolean bl4, boolean bl5, boolean bl6, cgy cgy2, int n5, boolean bl7) {
        if (this.ezJ == null) {
            assert (false);
            return false;
        }
        if (!super.a(bl, bl2, n, n2, n3, n4, bl3, bl4, bl5, bl6)) {
            return false;
        }
        if (this.ezJ.ordinal() != cgy2.ordinal()) {
            return false;
        }
        if (n5 != this.bnM) {
            return false;
        }
        return this.ezJ != cgy.ezt || this.ezK == bl7;
    }
}


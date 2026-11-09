/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lkv
 */
public class cix
extends ciw {
    private final int eDl;
    private final boolean eDm;

    public cix(int n, int n2, boolean bl, int n3, int n4, String string, boolean bl2) {
        super(n, n2, bl, n3, n4, ain.bnq);
        int n5 = lkv.AG((String)string);
        assert (n5 != -1) : "Invalid animation state name : " + string;
        this.eDl = n5;
        this.eDm = bl2;
    }

    public int aPL() {
        return this.eDl;
    }

    public boolean aPM() {
        return this.eDm;
    }
}


/*
 * Decompiled with CFR.
 */
public abstract class gmx
extends gmz {
    public static final int jml = 0;
    public static final int jmm = 1;
    public static final int jmy = 2;
    public static final int jmz = 3;
    public static final int jmA = 4;
    private int iXS = -1;
    private int ed = -1;
    private String bc = null;

    public int getErrorCode() {
        return this.iXS;
    }

    public void JY(int n) {
        this.iXS = n;
    }

    public int bUV() {
        return this.ed;
    }

    public void Jv(int n) {
        this.ed = n;
    }

    public String hl() {
        return this.bc;
    }

    public void d(String string) {
        this.bc = string;
    }

    @Deprecated
    gmx() {
        super(3610);
        assert (false) : "Abstract Base Class!!! FFS!!!";
    }

    protected gmx(int n) {
        super(n);
    }
}

